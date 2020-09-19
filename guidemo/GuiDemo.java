package guidemo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiDemo extends JFrame {
	JLabel LRes = new JLabel("");
	JLabel LLas = new JLabel("");
	JLabel LWin = new JLabel("");
	JButton BA = new JButton("AC Milan");
	JButton BB = new JButton("Real Madrid");
	int ScoreA = 0;
	int ScoreB = 0;
	int LastS = -1;
	public GuiDemo() {
		super("Match");
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(LRes,BorderLayout.NORTH);
		add(BA,BorderLayout.WEST);
		add(LWin,BorderLayout.CENTER);
		add(BB,BorderLayout.EAST);
		add(LLas,BorderLayout.SOUTH);
		BA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ScoreA();
				UpdateLabels();
			}
		});
		BB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ScoreB();
				UpdateLabels();
			}
		});
		UpdateLabels();
	}
	private void ScoreA() {
		ScoreA++;
		LastS = 0;
	}
	private void ScoreB() {
		ScoreB++;
		LastS = 1;
	}
	private void UpdateLabels() {
		LRes.setText("Result: " + ScoreA + ":" + ScoreB);
		LLas.setText("Last score: " + (LastS == 0 ? "AC Milan" : "Real Madrid"));
		if(ScoreA == ScoreB) {
			LWin.setText("Winner: DRAW");
		} else {
			LWin.setText("Winner: " + (ScoreA > ScoreB ? "AC Milan" : "Real Madrid"));
		}
	}
}
