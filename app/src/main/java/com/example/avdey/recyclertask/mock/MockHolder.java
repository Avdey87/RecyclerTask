package com.example.avdey.recyclertask.mock;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.avdey.recyclertask.R;
import com.example.avdey.recyclertask.RecyclerFragment;

public class MockHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView value;

    public MockHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        value = itemView.findViewById(R.id.number_text);
    }

    public void bind(Mock mock) {
        value.setText(mock.getValue());

    }

    public TextView getValue() {
        return value;
    }

    public void setValue(TextView value) {
        this.value = value;
    }

    @Override
    public void onClick(View v) {
        v.getVerticalScrollbarPosition();
        RecyclerFragment.delNumber(v);
        Toast.makeText(getValue().getContext(), "clicked number!", Toast.LENGTH_LONG).show();
    }
}
