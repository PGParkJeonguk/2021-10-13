package co.jeonguk.prj.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BoardVO {
	private int bId;
	private String bWriter;
	private Date bWritedate;
	private String bTitele;
	private String bContents;
	private int bHit;
}
