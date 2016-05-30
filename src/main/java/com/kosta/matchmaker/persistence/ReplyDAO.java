package com.kosta.matchmaker.persistence;

import java.util.List;

import com.kosta.matchmaker.domain.Criteria;
import com.kosta.matchmaker.domain.ReplyVO;

public interface ReplyDAO {

	// 댓글
	public void create(ReplyVO reply) throws Exception;

	// 페이징 처리 이전
	// public List<ReplyVO> list(Integer bno) throws Exception;

	// 페이징 처리 v1
	public List<ReplyVO> list(Integer bno, Criteria cri) throws Exception;

	public void update(ReplyVO reply) throws Exception;

	public void delete(Integer rno) throws Exception;

	public int count(Integer bno) throws Exception;

}
