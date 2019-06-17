package com.example.johnbogdan.volumeprogram;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button descriptionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeOrientation();

        setDetails();

        descriptionButton = findViewById(R.id.description);

        descriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DescriptionImages.class));
            }
        });
    }

    public void changeOrientation() {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            MainActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    public void setDetails() {
        findViewById(R.id.a).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Latura \"a\" a bazei de sus.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.b).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Latura \"b\" a bazei de sus.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.c).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Latura \"c\" a bazei de sus.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.d).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Latura \"d\" a bazei de sus.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.A).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Latura \"A\" a bazei de jos.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.B).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Latura \"B\" a bazei de jos.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.C).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Latura \"C\" a bazei de jos.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.D).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Latura \"D\" a bazei de jos.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.h).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Inaltimea \"h\" a piramidei (acoperisului).", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.H).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Inaltimea \"H\" a trunchiului (camerei).", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.diagJos).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Diagonala bazei de jos.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.diagSus).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Diagonala bazei de sus.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.button).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Apasa pentru a calcula volumul.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.result).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Valoarea volumului calculat.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        findViewById(R.id.description).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Descriere variabile. Tine apasat pe imagini pentru detalii.", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    private boolean checkTriangleInequality(double a, double b, double c) {

        if (a + b <= c) {
            return false;
        }

        if (b + c <= a) {
            return false;
        }

        if (a + c <= b) {
            return false;
        }

        return true;

    }

    private boolean isNegative(double val) {
        if (val < 0) {
            return true;
        }

        return false;
    }

    public void onButtonClick(View v) {

        double la = 0, lb = 0, lc = 0, ld = 0, lA = 0, lB = 0, lC = 0, lD = 0, ldiagJos = 0, ldiagSus = 0, lh = 0, lH = 0;

        EditText a = (EditText) findViewById(R.id.a);
        EditText b = (EditText) findViewById(R.id.b);
        EditText c = (EditText) findViewById(R.id.c);
        EditText d = (EditText) findViewById(R.id.d);

        EditText A = (EditText) findViewById(R.id.A);
        EditText B = (EditText) findViewById(R.id.B);
        EditText C = (EditText) findViewById(R.id.C);
        EditText D = (EditText) findViewById(R.id.D);

        EditText diagJos = (EditText) findViewById(R.id.diagJos);
        EditText diagSus = (EditText) findViewById(R.id.diagSus);

        EditText h = (EditText) findViewById(R.id.h);
        EditText H = (EditText) findViewById(R.id.H);

        TextView result = (TextView) findViewById(R.id.result);

        try {
            la = Double.parseDouble(a.getText().toString().trim());
            lb = Double.parseDouble(b.getText().toString().trim());
            lc = Double.parseDouble(c.getText().toString().trim());
            ld = Double.parseDouble(d.getText().toString().trim());

            lA = Double.parseDouble(A.getText().toString().trim());
            lB = Double.parseDouble(B.getText().toString().trim());
            lC = Double.parseDouble(C.getText().toString().trim());
            lD = Double.parseDouble(D.getText().toString().trim());

            ldiagJos = Double.parseDouble(diagJos.getText().toString().trim());
            ldiagSus = Double.parseDouble(diagSus.getText().toString().trim());

            lh = Double.parseDouble(h.getText().toString().trim());
            lH = Double.parseDouble(H.getText().toString().trim());
        } catch (Exception e) {
            result.setText("Result");
            Toast.makeText(getApplicationContext(), "Nu ati adaugat toate valorile.", Toast.LENGTH_SHORT).show();
            return;
        }

        if (isNegative(lA) || isNegative(lB) || isNegative(lC)
                || isNegative(lD) || isNegative(la) || isNegative(lb)
                || isNegative(lc) || isNegative(ld) || isNegative(lH)
                || isNegative(lh) || isNegative(ldiagJos) || isNegative(ldiagSus)) {
            result.setText("Result");
            Toast.makeText(getApplicationContext(), "Ati introdus valori negative!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!checkTriangleInequality(lA, lD, ldiagJos)) {
            result.setText("Result");
            Toast.makeText(getApplicationContext(), "Inegalitatea triunghiului incalcata! " +
                    "Verifica valorile pentru A, D si Diagonala de jos. "
                    + "Suma oricaror 2 laturi sa fie mai mare ca a 3-a.", Toast.LENGTH_LONG).show();
            return;
        }

        if (!checkTriangleInequality(lB, lC, ldiagJos)) {
            result.setText("Result");
            Toast.makeText(getApplicationContext(), "Inegalitatea triunghiului incalcata! " +
                    "Verifica valorile pentru B, C si Diagonala de jos. "
                    + "Suma oricaror 2 laturi sa fie mai mare ca a 3-a.", Toast.LENGTH_LONG).show();
            return;
        }

        if (!checkTriangleInequality(la, ld, ldiagSus)) {
            result.setText("Result");
            Toast.makeText(getApplicationContext(), "Inegalitatea triunghiului incalcata! " +
                    "Verifica valorile pentru a, d si Diagonala de sus. "
                    + "Suma oricaror 2 laturi sa fie mai mare ca a 3-a.", Toast.LENGTH_LONG).show();
            return;
        }

        if (!checkTriangleInequality(lb, lc, ldiagSus)) {
            result.setText("Result");
            Toast.makeText(getApplicationContext(), "Inegalitatea triunghiului incalcata! " +
                    "Verifica valorile pentru b, c si Diagonala de sus. "
                    + "Suma oricaror 2 laturi sa fie mai mare ca a 3-a.", Toast.LENGTH_LONG).show();
            return;
        }

        double alphaJos, gamaJos, alphaSus, gamaSus;

        alphaSus = (double) Math.acos((la * la + ld * ld - ldiagSus * ldiagSus) / (2 * la * ld));
        gamaSus = (double) Math.acos((lb * lb + lc * lc - ldiagSus * ldiagSus) / (2 * lb * lc));

        alphaJos = (double) Math.acos((lA * lA + lD * lD - ldiagJos * ldiagJos) / (2 * lA * lD));
        gamaJos = (double) Math.acos((lB * lB + lC * lC - ldiagJos * ldiagJos) / (2 * lB * lC));

        double semiperimeterJos, semiperimeterSus;

        semiperimeterSus = (double) (la + lb + lc + ld) / 2;
        semiperimeterJos = (double) (lA + lB + lC + lD) / 2;

        double ariaJos, ariaSus;

        ariaSus = (double) Math.sqrt(Math.abs((semiperimeterSus - la) * (semiperimeterSus - lb)
                * (semiperimeterSus - lc) * (semiperimeterSus - ld)
                - la * lb * lc * ld * Math.pow(Math.cos((double) (alphaSus + gamaSus) / 2), 2)));

        ariaJos = (double) Math.sqrt(Math.abs((semiperimeterJos - lA) * (semiperimeterJos - lB) * (semiperimeterJos - lC)
                * (semiperimeterJos - lD)
                - lA * lB * lC * lD * Math.pow(Math.cos((double) (alphaJos + gamaJos) / 2), 2)));

        double volumeTrunchi = 0, volumePyramid = 0, totalVolume = 0;

        // Calculez volumele corpurilor
        volumeTrunchi = (double) ((lH * (ariaJos + (double) Math.sqrt(Math.abs(ariaJos * ariaSus)) + ariaSus)) * 1
                / 3);
        volumePyramid = (double) (ariaSus * lh) * 1 / 3;

        // Volumul final
        totalVolume = volumeTrunchi + volumePyramid;

        result.setText(String.valueOf(totalVolume));

        if (lh == 0) {

            if (lH == 0) {
                Toast.makeText(getApplicationContext(),
                        "Ambele inaltimi sunt 0. Valoarea volumului intregului corp(V + V')(casa) este " + totalVolume, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "Valoarea volumului trunchiului(V) este " + totalVolume, Toast.LENGTH_SHORT).show();
            }
        } else {

            if (lH == 0) {
                Toast.makeText(getApplicationContext(),
                        "Valoarea volumului piramidei(V')(acoperisului) este " + totalVolume, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(),
                        "Valoarea volumului intregului corp(V + V')(casa) este " + totalVolume, Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onStart() {
        super.onStart();

        changeOrientation();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();

        changeOrientation();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
