package com.kosta.matchmaker.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kosta.matchmaker.domain.Criteria;
import com.kosta.matchmaker.domain.ReplyVO;
import com.kosta.matchmaker.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Inject
	private ReplyDAO dao;

	@Override
	public void addReply(ReplyVO reply) throws Exception {

		dao.create(reply);

	}

	// 페이징 이전
	// @Override
	// public List<ReplyVO> listReply(Integer bno) throws Exception {
	// // TODO Auto-generated method stub
	// return dao.list(bno);
	// }

	// 페이징 v1
	@Override
	public List<ReplyVO> listReply(Integer bno, Criteria cri) throws Exception {

		return dao.list(bno, cri);
	}

	@Override
	public void modifyReply(ReplyVO reply) throws Exception {
		// TODO Auto-generated method stub

		dao.update(reply);

	}

	@Override
	public void deleteReply(Integer rno) throws Exception {
		// TODO Auto-generated method stub

		dao.delete(rno);

	}

	// counter
	@Override
	public int count(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.count(bno);
	}

}
