import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game extends JFrame
{

    static Game obj = new Game();
    JLabel computer_choice, result, computer_score, player_score, label_computer;
    ImageIcon image_rock, image_paper, image_scissor, image_lizard, image_spock;

    int player_s = 0, comp_s = 0;
    public void setComputerChoice()
    {
        computer_choice = new JLabel();
        computer_choice.setHorizontalTextPosition(JLabel.CENTER);
        computer_choice.setVerticalTextPosition(JLabel.BOTTOM);
        computer_choice.setBounds(680,120,200,200);
        add(computer_choice);
    }

    public void setScoreResult()
    {
        JLabel score = new JLabel();
        score.setBounds(500, 0, 100, 100);

        computer_score = new JLabel();
        computer_score.setText("Computer: 0");
        computer_score.setFont(new Font("Times New Roman", Font.BOLD, 26));
        computer_score.setBounds(1300, 100, 230, 200);

        player_score = new JLabel();
        player_score.setText("Player: 0");
        player_score.setFont(new Font("Times New Roman", Font.BOLD, 26));
        player_score.setBounds(1300, 150, 230, 200);

        result = new JLabel();
        result.setFont(new Font("Serif", Font.BOLD, 60));
        result.setBounds(640,400,500,200);


        add(player_score);
        add(computer_score);
        add(score);
        add(result);
    }


    public void setrocklabel()
    {
        JLabel label_rock = new JLabel();
        label_rock.setText("Rock");
        label_rock.setIcon(image_rock);
        label_rock.setHorizontalTextPosition(JLabel.CENTER);
        label_rock.setVerticalTextPosition(JLabel.BOTTOM);
        label_rock.setBounds(280, 600, 200, 200);

        add(label_rock);

        label_rock.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)
            {
                calculate(label_rock.getText());
            }
        });
        setLayout(null);
    }

    public void setpaperlabel()
    {
        JLabel label_paper = new JLabel();
        label_paper.setText("Paper");
        label_paper.setIcon(image_paper);
        label_paper.setHorizontalTextPosition(JLabel.CENTER);
        label_paper.setVerticalTextPosition(JLabel.BOTTOM);
        label_paper.setBounds(480, 600, 200, 200);

        add(label_paper);

        label_paper.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)
            {
                //call calculate method
                calculate(label_paper.getText());
            }
        });

        setLayout(null);
    }

    public void setscissorlabel()
    {
        //create Label
        JLabel label_scissor = new JLabel();
        label_scissor.setText("Scissor");
        label_scissor.setIcon(image_scissor);
        label_scissor.setHorizontalTextPosition(JLabel.CENTER);
        label_scissor.setVerticalTextPosition(JLabel.BOTTOM);
        label_scissor.setBounds(680, 600, 200, 200);

        add(label_scissor);

        label_scissor.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e)
            {
                //call calculate method
                calculate(label_scissor.getText());
            }
        });

        setLayout(null);
    }

    public void setlizardlabel() {
        //create Label
        JLabel label_lizard = new JLabel();
        label_lizard.setText("Lizard");
        label_lizard.setIcon(image_lizard);
        label_lizard.setHorizontalTextPosition(JLabel.CENTER);
        label_lizard.setVerticalTextPosition(JLabel.BOTTOM);
        label_lizard.setBounds(880, 600, 200, 200);

        add(label_lizard);

        label_lizard.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //call calculate method
                calculate(label_lizard.getText());
            }
        });

        setLayout(null);
    }

    public void setspocklabel() {
        JLabel label_spock = new JLabel();
        label_spock.setText("Spock");
        label_spock.setIcon(image_spock);
        label_spock.setHorizontalTextPosition(JLabel.CENTER);
        label_spock.setVerticalTextPosition(JLabel.BOTTOM);
        label_spock.setBounds(1080, 600, 200, 200);

        add(label_spock);

        label_spock.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //call calculate method
                calculate(label_spock.getText());
            }
        });

        setLayout(null);
    }

    public void calculate(String player)
    {
        String list[] = {"Rock", "Paper", "Scissor", "Lizard", "Spock"};

        int random_choice = (int)((Math.random()*10)%5);
        String computer = list[random_choice];

        computer_choice.setText(computer);

        if (random_choice == 0)
        {
            computer_choice.setIcon(image_rock);
        }
        else if (random_choice == 1)
        {
            computer_choice.setIcon(image_paper);
        }
        else if(random_choice == 2)
        {
            computer_choice.setIcon(image_scissor);
        }
        else if(random_choice == 3)
        {
            computer_choice.setIcon(image_lizard);
        }
        else
        {
            computer_choice.setIcon(image_spock);
        }

        updateScore(player, computer);
    }

    public void updateScore(String player, String computer)
    {
        String res = "";

        if (player.equals(computer))
        {
            res = "Draw";
        }

        else if(player.equals("Rock"))
        {
            if(computer.equals("Scissor"))
            {
                res = "You Win!";
                player_s++;
            }
            else if(computer.equals("Lizard"))
            {
                res = "You Win!";
                player_s++;
            }

            else
            {
                res = "Computer wins!";
                comp_s++;
            }
        }

        else if(player.equals("Paper"))
        {
            if(computer.equals("Rock"))
            {
                res = "You Win!";
                player_s++;
            }
            else if(computer.equals("Spock"))
            {
                res = "You Win!";
                player_s++;
            }

            else
            {
                res = "Computer wins!";
                comp_s++;
            }
        }

        else if(player.equals("Scissor"))
        {
            if(computer.equals("Paper"))
            {
                res = "You Win!";
                player_s++;
            }
            else if(computer.equals("Lizard"))
            {
                res = "You Win!";
                player_s++;
            }


            else
            {
                res = "Computer wins!";
                comp_s++;
            }
        }
        else if(player.equals("Lizard"))
        {
            if(computer.equals("Paper"))
            {
                res = "You Win!";
                player_s++;
            }
            else if(computer.equals("Spock"))
            {
                res = "You Win!";
                player_s++;
            }

            else
            {
                res = "Computer wins!";
                comp_s++;
            }
        }
        else if(player.equals("Spock"))
        {
            if(computer.equals("Rock"))
            {
                res = "You Win!";
                player_s++;
            }
            else if(computer.equals("Scissor"))
            {
                res = "You Win!";
                player_s++;
            }


            else
            {
                res = "Computer wins!";
                comp_s++;
            }
        }


        else
        {
            if(computer.equals("Rock"))
            {
                res = "Computer Win!";
                comp_s++;
            }

            else
            {
                res = "You win!";
                player_s++;
            }
        }

        result.setText(res);
        player_score.setText("Player : "+player_s);
        computer_score.setText("Computer : "+comp_s);
    }


    public void titleLabel()
    {
        JLabel label_computer = new JLabel();
        label_computer.setText("Computer VS Player");
        label_computer.setFont(new Font("Arial", Font.BOLD, 50));
        label_computer.setBounds(520, 00, 900, 100);
        add(label_computer);
    }


    public void load_images()
    {
        image_rock = new ImageIcon(new ImageIcon("C:/Java Notebook/Rock-Paper-Scissor-Lizard-Spock-main/Rock.png")
                .getImage().getScaledInstance(175, 175, Image.SCALE_DEFAULT));

        setrocklabel();

        image_paper = new ImageIcon(new ImageIcon("C:/Java Notebook/Rock-Paper-Scissor-Lizard-Spock-main/Paper.png")
                .getImage().getScaledInstance(175, 175, Image.SCALE_DEFAULT));
        setpaperlabel();

        image_scissor = new ImageIcon(new ImageIcon("C:/Java Notebook/Rock-Paper-Scissor-Lizard-Spock-main/Scissor.png")
                .getImage().getScaledInstance(175, 175, Image.SCALE_DEFAULT));
        setscissorlabel();

        image_lizard = new ImageIcon(new ImageIcon("C:/Java Notebook/Rock-Paper-Scissor-Lizard-Spock-main/Lizard.png")
                .getImage().getScaledInstance(175, 175, Image.SCALE_DEFAULT));
        setlizardlabel();

        image_spock = new ImageIcon(new ImageIcon("C:/Java Notebook/Rock-Paper-Scissor-Lizard-Spock-main/Spock.png")
                .getImage().getScaledInstance(175, 175, Image.SCALE_DEFAULT));
        setspocklabel();
    }

    public void createField()
    {
        obj.setTitle("ROCK PAPER SCISSORS LIZARD SPOCK");
        obj.setBounds(0, 0, 1920, 1080);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.getContentPane().setBackground(Color.WHITE);
        obj.setResizable(false);
        obj.setVisible(true);
    }

    JButton resetButton;
    public void setResetButton() {
        resetButton = new JButton("Reset Scores");
        resetButton.setBounds(25, 250, 200, 50);
        resetButton.setFont(new Font("Arial", Font.PLAIN, 16));
        add(resetButton);

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetScores();
            }
        });
    }

    public void resetScores() {
        player_s = 0;
        comp_s = 0;
        player_score.setText("Player: 0");
        computer_score.setText("Computer: 0");
        result.setText("");
        computer_choice.setIcon(null);
    }

    public static void main(String args[])
    {
        obj.createField();
        obj.load_images();
        obj.titleLabel();
        obj.setComputerChoice();
        obj.setScoreResult();
        obj.setResetButton();
    }
}
