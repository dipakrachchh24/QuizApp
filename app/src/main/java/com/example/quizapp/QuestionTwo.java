package com.example.quizapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionTwo extends Fragment {

    int y2;
    TextView que2;
    RadioGroup ans2;
    RadioButton op1,op2,op3,op4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_question_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        que2=(TextView) view.findViewById(R.id.que2);
        ans2=(RadioGroup) view.findViewById(R.id.ans2);
        op1=(RadioButton) view.findViewById(R.id.q2o1);
        op2=(RadioButton) view.findViewById(R.id.q2o2);
        op3=(RadioButton) view.findViewById(R.id.q2o3);
        op4=(RadioButton) view.findViewById(R.id.q2o4);

        DataHolder.getInstance().setData(y2);


        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y2),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y2);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y2),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y2);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y2),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y2);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                send();
                //logic for send answer to activity
                //Toast.makeText(getActivity(),"Answer"+Integer.toString(y2),Toast.LENGTH_SHORT).show();
                DataHolder.getInstance().setData(y2);
            }
        });

    }

    private void send() {

        if(op2.getId()==ans2.getCheckedRadioButtonId()){
            y2=1;
        }
        else if(op1.getId()==ans2.getCheckedRadioButtonId() || op3.getId()==ans2.getCheckedRadioButtonId() || op4.getId()==ans2.getCheckedRadioButtonId()){
            y2=-1;
        }
        else{
            y2=0;
        }

    }
}