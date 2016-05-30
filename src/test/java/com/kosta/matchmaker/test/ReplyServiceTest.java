package com.kosta.matchmaker.test;

import java.util.List;
import java.util.Scanner;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kosta.matchmaker.domain.Criteria;
import com.kosta.matchmaker.domain.ReplyVO;
import com.kosta.matchmaker.service.ReplyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/*.xml" })
public class ReplyServiceTest {

	@Inject
	private ReplyService service;

	private int bno = 1;
	private int page = 1;
	private int perPageNum = 5;
	private int rno;

	@Test
	public void testAdd() throws Exception {
		ReplyVO reply = new ReplyVO();
		reply.setBno(bno);
		reply.setReplytext("나랑_미친듯_놀자~!");
		reply.setReplyer("jyt");

		service.addReply(reply);
	}

	// 페이징 이전
	// @Test
	// public void testList() throws Exception {
	//
	// Scanner scanner = new Scanner(System.in);
	// System.out.println("본글 번호를 입력하세요.");
	// int bno = scanner.nextInt();
	// scanner.close();
	//
	// List<ReplyVO> list = service.listReply(bno);
	//
	// for (ReplyVO reply : list) {
	// System.out.println(reply.toString());
	// }
	// }

	// 페이징 v1
	@Test
	public void testList() throws Exception {

		Criteria cri = new Criteria();
		cri.setPage(page);
		cri.setPerPageNum(perPageNum);
		
		List<ReplyVO> list = service.listReply(bno, cri);
		// 댓글 수
		System.out.println(bno + "의 전체 댓글수 : " + service.count(bno));

		for (ReplyVO reply : list) {
			System.out.println(reply.toString());
		}
	}

	@Test
	public void modify() throws Exception {

		rnoNum();

		ReplyVO reply = new ReplyVO();
		reply.setRno(rno);
		reply.setReplytext("서비스도 수정됐다...ㅠㅠ");

		service.modifyReply(reply);
	}

	@Test
	public void delete() throws Exception {

		rnoNum();

		service.deleteReply(rno);
	}

	//rno 입력 중복코드
	public void rnoNum() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("수정 또는 삭제할 댓글 번호를 입력 : ");
		rno = scan.nextInt();
		scan.close();
	}

}
