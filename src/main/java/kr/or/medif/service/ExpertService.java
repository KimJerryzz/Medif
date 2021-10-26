package kr.or.medif.service;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.QueryResults;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.or.medif.common.Constants;
import kr.or.medif.domain.entity.Expert;
import kr.or.medif.domain.entity.QExpert;
import kr.or.medif.domain.vo.SearchVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ExpertService {
    @Autowired
    private JPAQueryFactory queryFactory;

    public Page<Expert> list(Pageable pageable, SearchVO searchVO) {

        int page = (pageable.getPageNumber() == 0) ? 0 : (pageable.getPageNumber() - 1);
        pageable = PageRequest.of(page, (searchVO.getPageSize() == null ? Constants.DEFAULT_PAGESIZE : searchVO.getPageSize()));
        QExpert qExpert = QExpert.expert;

        OrderSpecifier<Long> orderSpecifier = qExpert.id.desc();
        BooleanBuilder builder = new BooleanBuilder();
//        builder.and(qExpert.nm.like("%" + searchVO.getSrchField() + "%"));

        JPAQuery<Expert> list = queryFactory
                .select(Projections.fields(Expert.class,
                        qExpert.id,
                        qExpert.email,
                        qExpert.homepage,
                        qExpert.nm,
                        qExpert.keywords,
                        qExpert.tel,
                        qExpert.position,
                        qExpert.academic,
                        qExpert.affiliation,
                        qExpert.career,
                        qExpert.certificate,
                        qExpert.devPartner,
                        qExpert.interestMediDevice,
                        qExpert.productionPartner,
                        qExpert.specializedPartner,
                        qExpert.agree
                ))
                .from(qExpert);
        list.where(builder)
                .limit(pageable.getPageSize())
                .offset(pageable.getOffset());
        list.orderBy(orderSpecifier);
        QueryResults<Expert> mngList = list.fetchResults();
        return new PageImpl<>(mngList.getResults(), pageable, mngList.getTotal());
    }
}
