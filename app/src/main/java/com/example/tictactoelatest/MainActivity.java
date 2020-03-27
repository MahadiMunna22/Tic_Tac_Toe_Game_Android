package com.example.tictactoelatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
    TextView playerTextView, Result;
    public int Board[][] = new int[100][100];

    public int step = 0;
    final String[] move = new String[1];
    final int[] playerSelect = new int[1];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerTextView = (TextView)findViewById(R.id.Player);
        Result = (TextView)findViewById(R.id.Result);
        b1 = (Button) findViewById(R.id.Btn00);
        b2 = (Button) findViewById(R.id.Btn01);
        b3 = (Button) findViewById(R.id.Btn02);
        b4 = (Button) findViewById(R.id.Btn10);
        b5 = (Button) findViewById(R.id.Btn11);
        b6 = (Button) findViewById(R.id.Btn12);
        b7 = (Button) findViewById(R.id.Btn20);
        b8 = (Button) findViewById(R.id.Btn21);
        b9 = (Button) findViewById(R.id.Btn22);
        reset = (Button) findViewById(R.id.Retry);


        playerSelect[0] = 1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "00";
                b1.setClickable(false);
                if (playerSelect[0] == 1){
                    b1.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b1.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "01";
                b2.setClickable(false);
                if (playerSelect[0] == 1){
                    b2.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b2.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "02";
                b3.setClickable(false);
                if (playerSelect[0] == 1){
                    b3.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b3.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "10";
                b4.setClickable(false);
                if (playerSelect[0] == 1){
                    b4.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b4.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "11";
                b5.setClickable(false);
                if (playerSelect[0] == 1){
                    b5.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b5.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "12";
                b6.setClickable(false);
                if (playerSelect[0] == 1){
                    b6.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b6.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "20";
                b7.setClickable(false);
                if (playerSelect[0] == 1){
                    b7.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b7.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "21";
                b8.setClickable(false);
                if (playerSelect[0] == 1){
                    b8.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b8.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                move[0] = "22";
                b9.setClickable(false);
                if (playerSelect[0] == 1){
                    b9.setText("O");
                    Player1Move(move[0]);
                    playerSelect[0] = 2;
                }
                else if (playerSelect[0] == 2){
                    b9.setText("X");
                    Player2Move(move[0]);
                    playerSelect[0] = 1;
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetFunc();
            }
        });

//        while (step<10) {
//            if (step != 100 && step != 200) {
//                System.out.print("Player 1 Move: ");
//                Player1Move();
//            }
//            if (step != 100 && step != 200) {
//                System.out.print("Player 2 Move: ");
//                Player2Move();
//            }
//
//            if (step == 100) {
//                System.out.println("Draw " + step);
//                break;
//            }
//            if (step == 200) {
//                System.out.println("Game Over");
//                break;
//            }
//        }
    }

    private void resetFunc() {
        Intent restartIntent = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        restartIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(restartIntent);
    }

    private void Player1Move(String move) {
        playerTextView.setText("Player2 Move");
        if(step==200){
            return;
        }
        final int x = Integer.parseInt(String.valueOf(move.charAt(0)));
        final int y = Integer.parseInt(String.valueOf(move.charAt(1)));

        if(Board[x][y] == 0 && x <3 && y < 3){
            Board[x][y] = 1;
            step++;
        }
        else
            System.out.println("Please Choose other positions");
        DisplayBoard();
        WinLose(1);
        if(step==9){
            playerTextView.setText("Draw");
            return;
        }
    }


    private void Player2Move(String move) {
        playerTextView.setText("Player1 Move");
        final int x = Integer.parseInt(String.valueOf(move.charAt(0)));
        final int y = Integer.parseInt(String.valueOf(move.charAt(1)));

        if(step==200){
            return;
        }

        if(Board[x][y] == 0 && x <3 && y < 3){
            Board[x][y] = 2;
            step++;
        }
        else
            System.out.println("Please Choose other positions");

        DisplayBoard();
        WinLose(2);
        if(step==9){
            playerTextView.setText("Draw");
            return;
        }
    }

    private void DisplayBoard() {
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3; j++){
                Log.d("Tag1",String.valueOf(Board[i][j]));
            }
        }
    }

    private void WinLose(int player){

        if(Board[0][0] == player && Board[0][1] == player && Board[0][2] == player){
            playerTextView.setText("player "+player+" Wins");
            step = 200;
            WinView();
        }
        else if(Board[0][0] == player && Board[1][0] == player && Board[2][0] == player){
            playerTextView.setText("player "+player+" Wins");
            step = 200;
            WinView();
        }
        else if(Board[0][0] == player && Board[1][1] == player && Board[2][2] == player){
            playerTextView.setText("player "+player+" Wins");
            step = 200;
            WinView();
        }
        else if(Board[1][0] == player && Board[1][1] == player && Board[1][2] == player){
            playerTextView.setText("player "+player+" Wins");
            step = 200;
            WinView();
        }
        else if(Board[0][1] == player && Board[1][1] == player && Board[2][1] == player){
            playerTextView.setText("player "+player+" Wins");
            step = 200;
            WinView();
        }
        else if(Board[0][2] == player && Board[1][2] == player && Board[2][2] == player){
            playerTextView.setText("player "+player+" Wins");
            step = 200;
            WinView();
        }
        else if(Board[2][0] == player && Board[2][1] == player && Board[2][2] == player){
            playerTextView.setText("player "+player+" Wins");
            step = 200;
            WinView();
        }
        else if(Board[2][0] == player && Board[1][1] == player && Board[0][2] == player){
            playerTextView.setText("player "+player+" Wins");
            step = 200;
            WinView();
        }
        System.out.println("** "+step);
        return;
    }

    private void WinView() {
        Result.setText("Game Over");
        Result.setVisibility(View.VISIBLE);
    }


}
