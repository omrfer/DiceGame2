import java.util.ArrayList;
import java.util.Random;

public class DiceHW {
	private int m_dicetotal, m_numberofdice;

	private ArrayList<Integer> m_dicethrownhistory = new ArrayList<Integer>();
	private ArrayList<Integer> m_numberguesshistory = new ArrayList<Integer>();
	private ArrayList<Integer> m_dicetotalhistory = new ArrayList<Integer>();
	private ArrayList<String> m_gameresulthistory = new ArrayList<String>();

	DiceHW(int numberofdice) {
		if (numberofdice > 0) {
			m_numberofdice = numberofdice;}
		else
			SetDefault();
	}
	DiceHW (){
		
	}

	private void SetDefault() {
		m_numberofdice = 1;
		// Always roll at least one dice.
	}

	public void Diceroll() {
		int total = 0;
		Random rnumber = new Random();
		for (int i = 0; i < m_numberofdice; i++) {
			int cpunum = (rnumber.nextInt(6) + 1);
			total = cpunum + total;
			// System.out.println(cpunum);
			// System.out.println(total); tested in main class
		}
		m_dicetotal = total;
		// I'm unsure if you wanted the average here.
	}

	public void SetNumberofDice(int numberofdice) {
		if (numberofdice > 0)
			m_numberofdice = numberofdice;
		else
			SetDefault();
	}

	public int ReturnDiceTotal() {
		return m_dicetotal;
	}

	public void AddtoDiceThrownHistory(int numberofdice) {
		m_dicethrownhistory.add(numberofdice);
	}

	public int ReturnDiceThrownHistory(int i) {
		return m_dicethrownhistory.get(i);
	}

	public void AddtoDiceTotalHistory(int dicetotal) {
		m_dicetotalhistory.add( m_dicetotal);
	}

	public int ReturnDiceTotalHistory(int i) {
		return m_dicetotalhistory.get(i);
	}

	public void AddtoGameResultHistory(String result) {
		m_gameresulthistory.add(result);
	}

	public String ReturnGameResultHistory(int i) {
		return m_gameresulthistory.get(i);
	}

	public void AddtoNumberGuess(int guess) {
		m_numberguesshistory.add(guess);
	}
	public int ReturnNumberGuessHistory(int i) {
		return m_numberguesshistory.get(i);
	}
}

//good, but too complicated...
