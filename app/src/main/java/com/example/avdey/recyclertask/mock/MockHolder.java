package com.example.avdey.recyclertask.mock;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.avdey.recyclertask.R;

public class MockHolder extends RecyclerView.ViewHolder {

    private TextView value;

    public MockHolder(@NonNull View itemView) {
        super(itemView);

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
}
