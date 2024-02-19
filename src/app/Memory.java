package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dimension;

public class Memory {

	private JFrame frmMemory;
	private Chrono chrono;
    private JLabel txtTimeCounter;
    private JLabel txtAttemptCounter;
    private JPanel memory;
    private MemoryButton firstSelectedButton;
    private MemoryButton secondSelectedButton;
    private int attempts = 12;
    private int pairsFound = 0;
    private int numberOfPairs = 8;
    private List<MemoryButton> buttons;
    private boolean isFirstClick = true;
    private ScoreManager scoreManager = new ScoreManager();
    
    /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memory window = new Memory();
					window.frmMemory.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Memory() {
		initialize();
	}
    
    /**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMemory = new JFrame();
		frmMemory.setResizable(false);
		frmMemory.setTitle("Memory");
		frmMemory.setBounds(100, 100, 665, 675);
		frmMemory.setMinimumSize(new Dimension(665, 675));
		frmMemory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel time = new JPanel();
		frmMemory.getContentPane().add(time, BorderLayout.NORTH);
		
		JLabel txtTime = new JLabel("Temps :");
		txtTime.setFont(new Font("Poppins", Font.PLAIN, 16));
		time.add(txtTime);
		
        txtTimeCounter = new JLabel("0");
        txtTimeCounter.setFont(new Font("Poppins", Font.PLAIN, 16));
        time.add(txtTimeCounter);
     
		JPanel attempt = new JPanel();
		frmMemory.getContentPane().add(attempt, BorderLayout.SOUTH);
		
		JLabel txtAttempt = new JLabel("Essais restants :");
		txtAttempt.setFont(new Font("Poppins", Font.PLAIN, 16));
		attempt.add(txtAttempt);
		
		txtAttemptCounter = new JLabel(String.valueOf(attempts));
		txtAttemptCounter.setFont(new Font("Poppins", Font.PLAIN, 16));
		attempt.add(txtAttemptCounter);
		
		memory = new JPanel();
		frmMemory.getContentPane().add(memory, BorderLayout.CENTER);
		memory.setLayout(new GridLayout(4, 4, 0, 0));
		
		MemoryButton btn1 = new MemoryButton("1.png");
		btn1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn1);
	        }
	    });
		
		MemoryButton btn2 = new MemoryButton("2.png");
		btn2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn2);
	        }
	    });
		
		MemoryButton btn3 = new MemoryButton("1.png");
		btn3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn3);
	        }
	    });
		
		MemoryButton btn4 = new MemoryButton("2.png");
		btn4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn4);
	        }
	    });
		
		MemoryButton btn5 = new MemoryButton("3.png");
		btn5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn5);
	        }
	    });
		
		MemoryButton btn6 = new MemoryButton("4.png");
		btn6.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn6);
	        }
	    });
		
		MemoryButton btn7 = new MemoryButton("3.png");
		btn7.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn7);
	        }
	    });
		
		MemoryButton btn8 = new MemoryButton("4.png");
		btn8.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn8);
	        }
	    });
		
		MemoryButton btn9 = new MemoryButton("5.png");
		btn9.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn9);
	        }
	    });
		
		MemoryButton btn10 = new MemoryButton("6.png");
		btn10.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn10);
	        }
	    });
		
		MemoryButton btn11 = new MemoryButton("5.png");
		btn11.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn11);
	        }
	    });
		
		MemoryButton btn12 = new MemoryButton("6.png");
		btn12.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn12);
	        }
	    });
		
		MemoryButton btn13 = new MemoryButton("7.png");
		btn13.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn13);
	        }
	    });
		
		MemoryButton btn14 = new MemoryButton("8.png");
		btn14.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn14);
	        }
	    });
		
		MemoryButton btn15 = new MemoryButton("7.png");
		btn15.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn15);
	        }
	    });
		
		MemoryButton btn16 = new MemoryButton("8.png");
		btn16.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            revealButton(btn16);
	        }
	    });
		frmMemory.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{time, txtTime, txtTimeCounter, memory, attempt, txtAttempt, txtAttemptCounter, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16}));
		
		// Liste de boutons
		buttons = Arrays.asList(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16);
		
		// Appel de la méthode pour mélanger et ajouter les boutons au JPanel
		randomButtonsPlacement(buttons);
		
		JMenuBar menuBar = new JMenuBar();
		frmMemory.setJMenuBar(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmNewGame = new JMenuItem("Nouvelle Partie");
		mntmNewGame.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            resetGame();
	        }
	    });
		mnOptions.add(mntmNewGame);
		
		JMenuItem mntmBestScore = new JMenuItem("Meilleurs Scores");
		mntmBestScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            // Obtention des trois meilleurs scores
	            List<Double> topScores = scoreManager.getTopScores();

	            // Création d'une chaîne de caractères pour les scores
	            StringBuilder scoresString = new StringBuilder();
	            for (int i = 0; i < topScores.size(); i++) {
	                scoresString.append((i + 1) + " - " + topScores.get(i) + "s\n");
	            }

	            // Affichage des trois meilleurs scores
	            JOptionPane.showMessageDialog(null, "Meilleurs scores :\n" + scoresString.toString());
	        }
		});
		mnOptions.add(mntmBestScore);
		
		JMenu mnClearScores = new JMenu("Réinitialiser les scores");
		menuBar.add(mnClearScores);
		
		JMenuItem mntmClearScores = new JMenuItem("Effacer");
		mntmClearScores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreManager.clearScores();
			}
		});
		mnClearScores.add(mntmClearScores);
	}
	
	public void revealButton(MemoryButton button) {
		// Vérification si le bouton cliqué est le premier de la partie
		// Permet de lancer le timer une fois que le joueur à commencer à jouer
		if(isFirstClick) {
			launchTimer();
            isFirstClick = false;
		}
		
		if (firstSelectedButton == null) {
		    firstSelectedButton = button;
		    button.setEnabled(false);
		} else {
		    secondSelectedButton = button;
		    button.setEnabled(false);
		
		    checkForMatch();
		}
	}
	
	public void randomButtonsPlacement(List<MemoryButton> buttons) {
		// Mélange de la liste
	    Collections.shuffle(buttons);
	    
	    // Ajout des boutons de la liste mélangée au JPanel
	    for (MemoryButton button : buttons) {
	        memory.add(button);
	    }
	}
	
	private void checkForMatch() {
        if (firstSelectedButton.getImage().equals(secondSelectedButton.getImage())) {
            // Si cela match on laisse les boutons désactivés et l'image reste visible
            firstSelectedButton = null;
            secondSelectedButton = null;
            
            // On incrémente le nombre de pairs trouvé
            pairsFound++;
        } else {
            // Si les images ne matchent pas alors on cache a nouveau les images
            firstSelectedButton.setEnabled(true);
            secondSelectedButton.setEnabled(true);
            firstSelectedButton = null;
            secondSelectedButton = null;
            
            // Si l'utilisateur s'est trompé on enleve un essai
            attempts--;

            if (attempts == 0) {
                // Si les essais atteignent 0 alors on réinitialise le jeu
                chrono.stop();
                resetGame();
            }
            // Mise à jour du texte de txtAttemptCounter
            txtAttemptCounter.setText(String.valueOf(attempts));
        }
        
        // On vérifie si l'utilisateur à trouvé toute les paires
        if (pairsFound == numberOfPairs) {
            showWinPopup();
        }
    }
	
	public void launchTimer() {
		if(chrono != null) {
			chrono.stop();
		}
		
		chrono = new Chrono();
	    chrono.start(txtTimeCounter);
	}
	
	public void resetGame() {
	    // Réinitialisation du nombre d'essais
	    attempts = 12;
	    txtAttemptCounter.setText(String.valueOf(attempts));
	    
	    // Réinitialisation du nombre de pairs trouvé
	    pairsFound = 0;
	    
	    // On stop le chrono pour qu'il arrete de tourner quand l'utilisateur commence une nouvelle partie
	    // On vérifie avant que le chrono existe
	    if(chrono != null) {
	    	chrono.stop();
	    }

	    // Réinitialisation des boutons
	    for (Component comp : memory.getComponents()) {
	        if (comp instanceof MemoryButton) {
	            MemoryButton btn = (MemoryButton) comp;
	            btn.setEnabled(true);
	        }
	    }

	    // Réinitialisation des cartes sélectionnées
	    firstSelectedButton = null;
	    secondSelectedButton = null;
	    
	    // Changement de l'ordre des cartes
	    randomButtonsPlacement(buttons);
	    
	    // On réinitialise la valeur de isFirstClick
	    isFirstClick = true;
	}
	
	private void showWinPopup() {
		// Stop du chrono
		chrono.stop();
		
		// Ajout du temps final au ScoreManager
		scoreManager.addScore((double)chrono.getElapsedTimeInSeconds());
		
		// Création des boutons
	    JButton newGameButton = new JButton("Nouvelle partie");

	    JButton highScoresButton = new JButton("Meilleurs scores");
	    highScoresButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // Obtention des trois meilleurs scores
	            List<Double> topScores = scoreManager.getTopScores();

	            // Création d'une chaîne de caractères pour les scores
	            StringBuilder scoresString = new StringBuilder();
	            for (int i = 0; i < topScores.size(); i++) {
	                scoresString.append((i + 1) + " - " + topScores.get(i) + "s\n");
	            }

	            // Affichage des trois meilleurs scores
	            JOptionPane.showMessageDialog(null, "Meilleurs scores :\n" + scoresString.toString());
	        }
	    });

	    // Création de la popup
	    Object[] options = {newGameButton, highScoresButton};
	    JOptionPane pane = new JOptionPane("Félicitations, vous avez gagné !", JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options);
	    final JDialog dialog = pane.createDialog("Victoire !");

	    newGameButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // Rénitialisation de la partie
	            resetGame();
	            dialog.setVisible(false);
	        }
	    });

	    dialog.setVisible(true);
	}

}
