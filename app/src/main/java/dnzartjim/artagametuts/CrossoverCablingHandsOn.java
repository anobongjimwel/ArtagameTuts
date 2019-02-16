package dnzartjim.artagametuts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class CrossoverCablingHandsOn extends AppCompatActivity {

    int testState = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossover_cabling_hands_on);


        final Button crimpingToolA = findViewById(R.id.btnCrimpingToolA);
        final ImageView ivCrimpingToolA = findViewById(R.id.ivCrimpingToolA);
        final Button crimpingToolB = findViewById(R.id.btnCrimpingToolB);
        final ImageView ivCrimpingToolB = findViewById(R.id.ivCrimpingToolB);
        final Button btnTest = findViewById(R.id.btnTest);

        // Functions and Declarations for First RJ-45 (RJ-45 A)

        final Spinner sRJA1 = findViewById(R.id.sRJA1);
        final ImageView ivRJA1 = findViewById(R.id.ivRJA1);
        sRJA1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJA1, ivRJA1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJA2 = findViewById(R.id.sRJA2);
        final ImageView ivRJA2 = findViewById(R.id.ivRJA2);
        sRJA2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJA2, ivRJA2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJA3= findViewById(R.id.sRJA3);
        final ImageView ivRJA3 = findViewById(R.id.ivRJA3);
        sRJA3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJA3, ivRJA3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJA4 = findViewById(R.id.sRJA4);
        final ImageView ivRJA4 = findViewById(R.id.ivRJA4);
        sRJA4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJA4, ivRJA4);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJA5 = findViewById(R.id.sRJA5);
        final ImageView ivRJA5 = findViewById(R.id.ivRJA5);
        sRJA5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJA5, ivRJA5);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJA6 = findViewById(R.id.sRJA6);
        final ImageView ivRJA6 = findViewById(R.id.ivRJA6);
        sRJA6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJA6, ivRJA6);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJA7 = findViewById(R.id.sRJA7);
        final ImageView ivRJA7 = findViewById(R.id.ivRJA7);
        sRJA7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJA7, ivRJA7);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJA8 = findViewById(R.id.sRJA8);
        final ImageView ivRJA8 = findViewById(R.id.ivRJA8);
        sRJA8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJA8, ivRJA8);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ivRJA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJA1.isShown()) sRJA1.performClick();
            }
        });
        ivRJA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJA2.isShown()) sRJA2.performClick();
            }
        });
        ivRJA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJA3.isShown()) sRJA3.performClick();
            }
        });
        ivRJA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJA4.isShown()) sRJA4.performClick();
            }
        });
        ivRJA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJA5.isShown()) sRJA5.performClick();
            }
        });
        ivRJA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJA6.isShown()) sRJA6.performClick();
            }
        });
        ivRJA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJA7.isShown()) sRJA7.performClick();
            }
        });
        ivRJA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJA8.isShown()) sRJA8.performClick();
            }
        });

        crimpingToolA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sRJA1.setVisibility(View.GONE);
                sRJA2.setVisibility(View.GONE);
                sRJA3.setVisibility(View.GONE);
                sRJA4.setVisibility(View.GONE);
                sRJA5.setVisibility(View.GONE);
                sRJA6.setVisibility(View.GONE);
                sRJA7.setVisibility(View.GONE);
                sRJA8.setVisibility(View.GONE);
                ivCrimpingToolA.setVisibility(View.VISIBLE);
                crimpingToolA.setVisibility(View.GONE);
                enableTester(crimpingToolA, crimpingToolB, btnTest);
            }
        });



        // Functions and Declarations for Second RJ-45 (RJ-45 B)

        final Spinner sRJB1 = findViewById(R.id.sRJB1);
        final ImageView ivRJB1 = findViewById(R.id.ivRJB1);
        sRJB1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJB1, ivRJB1);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJB2 = findViewById(R.id.sRJB2);
        final ImageView ivRJB2 = findViewById(R.id.ivRJB2);
        sRJB2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJB2, ivRJB2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJB3= findViewById(R.id.sRJB3);
        final ImageView ivRJB3 = findViewById(R.id.ivRJB3);
        sRJB3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJB3, ivRJB3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJB4 = findViewById(R.id.sRJB4);
        final ImageView ivRJB4 = findViewById(R.id.ivRJB4);
        sRJB4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJB4, ivRJB4);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJB5 = findViewById(R.id.sRJB5);
        final ImageView ivRJB5 = findViewById(R.id.ivRJB5);
        sRJB5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJB5, ivRJB5);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJB6 = findViewById(R.id.sRJB6);
        final ImageView ivRJB6 = findViewById(R.id.ivRJB6);
        sRJB6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJB6, ivRJB6);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJB7 = findViewById(R.id.sRJB7);
        final ImageView ivRJB7 = findViewById(R.id.ivRJB7);
        sRJB7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJB7, ivRJB7);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Spinner sRJB8 = findViewById(R.id.sRJB8);
        final ImageView ivRJB8 = findViewById(R.id.ivRJB8);
        sRJB8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CablePainter.paintCable(sRJB8, ivRJB8);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        ivRJB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJB1.isShown()) sRJB1.performClick();
            }
        });
        ivRJB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJB2.isShown()) sRJB2.performClick();
            }
        });
        ivRJB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJB3.isShown()) sRJB3.performClick();
            }
        });
        ivRJB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJB4.isShown()) sRJB4.performClick();
            }
        });
        ivRJB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJB5.isShown()) sRJB5.performClick();
            }
        });
        ivRJB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJB6.isShown()) sRJB6.performClick();
            }
        });
        ivRJB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJB7.isShown()) sRJB7.performClick();
            }
        });
        ivRJB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if (sRJB8.isShown()) sRJB8.performClick();
            }
        });

        crimpingToolB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sRJB1.setVisibility(View.GONE);
                sRJB2.setVisibility(View.GONE);
                sRJB3.setVisibility(View.GONE);
                sRJB4.setVisibility(View.GONE);
                sRJB5.setVisibility(View.GONE);
                sRJB6.setVisibility(View.GONE);
                sRJB7.setVisibility(View.GONE);
                sRJB8.setVisibility(View.GONE);
                ivCrimpingToolB.setVisibility(View.VISIBLE);
                crimpingToolB.setVisibility(View.GONE);
                enableTester(crimpingToolA, crimpingToolB, btnTest);
            }
        });


        // Declaring Tester LEDS
        final ImageView ivTester = findViewById(R.id.ledTester);
        ImageView ivLEDA1 = findViewById(R.id.ivLEDA1);
        ImageView ivLEDA2 = findViewById(R.id.ivLEDA2);
        ImageView ivLEDA3 = findViewById(R.id.ivLEDA3);
        ImageView ivLEDA4 = findViewById(R.id.ivLEDA4);
        ImageView ivLEDA5 = findViewById(R.id.ivLEDA5);
        ImageView ivLEDA6 = findViewById(R.id.ivLEDA6);
        ImageView ivLEDA7 = findViewById(R.id.ivLEDA7);
        ImageView ivLEDA8 = findViewById(R.id.ivLEDA8);
        ImageView ivLEDB1 = findViewById(R.id.ivLEDB1);
        ImageView ivLEDB2 = findViewById(R.id.ivLEDB2);
        ImageView ivLEDB3 = findViewById(R.id.ivLEDB3);
        ImageView ivLEDB4 = findViewById(R.id.ivLEDB4);
        ImageView ivLEDB5 = findViewById(R.id.ivLEDB5);
        ImageView ivLEDB6 = findViewById(R.id.ivLEDB6);
        ImageView ivLEDB7 = findViewById(R.id.ivLEDB7);
        ImageView ivLEDB8 = findViewById(R.id.ivLEDB8);

        final CableTester cable[][] = new CableTester[2][8];
        cable[0][0] = new CableTester(sRJA1,ivLEDA1);
        cable[0][1] = new CableTester(sRJA2,ivLEDA2);
        cable[0][2] = new CableTester(sRJA3,ivLEDA3);
        cable[0][3] = new CableTester(sRJA4,ivLEDA4);
        cable[0][4] = new CableTester(sRJA5,ivLEDA5);
        cable[0][5] = new CableTester(sRJA6,ivLEDA6);
        cable[0][6] = new CableTester(sRJA7,ivLEDA7);
        cable[0][7] = new CableTester(sRJA8,ivLEDA8);

        cable[1][0] = new CableTester(sRJB1,ivLEDB1);
        cable[1][1] = new CableTester(sRJB2,ivLEDB2);
        cable[1][2] = new CableTester(sRJB3,ivLEDB3);
        cable[1][3] = new CableTester(sRJB4,ivLEDB4);
        cable[1][4] = new CableTester(sRJB5,ivLEDB5);
        cable[1][5] = new CableTester(sRJB6,ivLEDB6);
        cable[1][6] = new CableTester(sRJB7,ivLEDB7);
        cable[1][7] = new CableTester(sRJB8,ivLEDB8);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                ivTester.setImageResource(R.drawable.tled_a);
                final Timer testingPeriod = new Timer();

                testingPeriod.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        CrossoverCablingHandsOn.super.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                CableTester.deactivateLEDS(cable);
                                switch (testState) {
                                    case 1:
                                    case 10:
                                        CableTester.testPin(cable[0][0],cable[1]);
                                        findSplitCables(cable[0], cable[1], cable[0][0].getCableColor(), testingPeriod);
                                        break;

                                    case 2:
                                    case 11:
                                        CableTester.testPin(cable[0][1],cable[1]);
                                        findSplitCables(cable[0], cable[1], cable[0][1].getCableColor(), testingPeriod);
                                        break;

                                    case 3:
                                    case 12:
                                        CableTester.testPin(cable[0][2],cable[1]);
                                        findSplitCables(cable[0], cable[1], cable[0][2].getCableColor(), testingPeriod);
                                        break;

                                    case 4:
                                    case 13:
                                        CableTester.testPin(cable[0][3],cable[1]);
                                        findSplitCables(cable[0], cable[1], cable[0][3].getCableColor(), testingPeriod);
                                        break;

                                    case 5:
                                    case 14:
                                        CableTester.testPin(cable[0][4],cable[1]);
                                        findSplitCables(cable[0], cable[1], cable[0][4].getCableColor(), testingPeriod);
                                        break;

                                    case 6:
                                    case 15:
                                        CableTester.testPin(cable[0][5],cable[1]);
                                        findSplitCables(cable[0], cable[1], cable[0][5].getCableColor(), testingPeriod);
                                        break;

                                    case 7:
                                    case 16:
                                        CableTester.testPin(cable[0][6],cable[1]);
                                        findSplitCables(cable[0], cable[1], cable[0][6].getCableColor(), testingPeriod);
                                        break;

                                    case 8:
                                    case 17:
                                        CableTester.testPin(cable[0][7],cable[1]);
                                        findSplitCables(cable[0], cable[1], cable[0][7].getCableColor(), testingPeriod);
                                        break;

                                    case 9:
                                    case 18:
                                        //Turn Off All LEDS for a moment of time
                                        break;

                                    case 19:
                                        if (
                                            /* accurate Cabling */
                                                (
                                                        accurateCabling(cable[0][0], cable[1][2], "WG") &&
                                                                accurateCabling(cable[0][1], cable[1][5], "G") &&
                                                                accurateCabling(cable[0][2], cable[1][0], "WO") &&
                                                                accurateCabling(cable[0][3], cable[1][3], "Blu") &&
                                                                accurateCabling(cable[0][4], cable[1][4], "WBlu") &&
                                                                accurateCabling(cable[0][5], cable[1][1], "O") &&
                                                                accurateCabling(cable[0][6], cable[1][6], "WBrn") &&
                                                                accurateCabling(cable[0][7], cable[1][7], "Brn")
                                                )
                                                ||

                                                (
                                                        accurateCabling(cable[0][0], cable[1][2], "WO") &&
                                                                accurateCabling(cable[0][1], cable[1][5], "O") &&
                                                                accurateCabling(cable[0][2], cable[1][0], "WG") &&
                                                                accurateCabling(cable[0][3], cable[1][3], "Blu") &&
                                                                accurateCabling(cable[0][4], cable[1][4], "WBlu") &&
                                                                accurateCabling(cable[0][5], cable[1][1], "G") &&
                                                                accurateCabling(cable[0][6], cable[1][6], "WBrn") &&
                                                                accurateCabling(cable[0][7], cable[1][7], "Brn")
                                                )
                                            ) {
                                            Intent i = new Intent(CrossoverCablingHandsOn.this, AccurateCabling.class);
                                            startActivity(i);
                                            finish();
                                        } else if (
                                            /* precise Cabling */
                                                preciseCabling(cable[0][0], cable[1][2]) &&
                                                        preciseCabling(cable[0][1], cable[1][5]) &&
                                                        preciseCabling(cable[0][2], cable[1][0]) &&
                                                        preciseCabling(cable[0][3], cable[1][3]) &&
                                                        preciseCabling(cable[0][4], cable[1][4]) &&
                                                        preciseCabling(cable[0][5], cable[1][1]) &&
                                                        preciseCabling(cable[0][6], cable[1][6]) &&
                                                        preciseCabling(cable[0][7], cable[1][7])
                                            ) {
                                            Intent i = new Intent(CrossoverCablingHandsOn.this, PreciseCabling.class);
                                            startActivity(i);
                                            finish();
                                        } else {
                                            Intent i = new Intent(CrossoverCablingHandsOn.this, WrongCabling.class);
                                            startActivity(i);
                                            finish();
                                        }
                                        break;
                                }
                                testState+=1;
                            }
                        });
                    }
                }, 2000, 1000);
            }
        });

        System.gc();
    }

    private void enableTester(final Button firstButton, final Button secondButton, final Button testButton) {
        if (firstButton.getVisibility()==View.GONE && secondButton.getVisibility() == View.GONE ) {
            testButton.setEnabled(true);
        }
    }

    private void findSplitCables(CableTester[] RJ45A, CableTester[] RJ45B, String cableColor, Timer testingPeriod) {
        if (CableTester.checkDuplicateCables(RJ45A, RJ45B, cableColor)){
            Intent i = new Intent(CrossoverCablingHandsOn.this, SplittingCables.class);
            startActivity(i);
            testingPeriod.purge();
            testingPeriod.cancel();
            finish();
        }
    }

    private boolean accurateCabling(CableTester pinA, CableTester pinB, String cableColor) {
        if (pinA.getCableColor().equals(pinB.getCableColor()) &&
                pinA.getCableColor().equals(cableColor)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean preciseCabling(CableTester pinA, CableTester pinB) {
        if (pinA.getCableColor().equals(pinB.getCableColor())
                && !pinA.getCableColor().equals("NA")) {
            return true;
        } else {
            return false;
        }
    }
}
