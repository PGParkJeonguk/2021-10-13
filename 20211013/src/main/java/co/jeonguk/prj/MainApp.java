package co.jeonguk.prj;

import co.jeonguk.prj.comm.GB;
import co.jeonguk.prj.comm.Login;
import co.jeonguk.prj.menu.Menu;

public class MainApp {
	public static void main(String[] args) {
		Login login = new Login();
		Menu menu = new Menu();
		login.run();
		menu.run();
		GB.scn.close();
	}
}
