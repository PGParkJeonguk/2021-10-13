package co.jeonguk.prj.comm;

import java.util.Scanner;

public interface Command {
	public void execute();
	public Scanner scn = new Scanner(System.in);
}
