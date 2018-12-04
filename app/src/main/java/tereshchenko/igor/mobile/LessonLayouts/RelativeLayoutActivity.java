package tereshchenko.igor.mobile.LessonLayouts;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RelativeLayoutActivity
        extends AppCompatActivity
{
    public void onCreat(Bundle stage)
    {
        super.onCreate(stage);

        setContentView(gerRelativeLayout(this));

    }

    protected View gerRelativeLayout(Context context) {
        //protected View getRelativeLayout(View sender){
        //RelativeLayout layout = new RelativeLayout(sender.getContext());
        RelativeLayout layout = new RelativeLayout(context);

        layout.setMinimumHeight(300);
        layout.setMinimumWidth(300);

        TextView lblName = new TextView(context);
        lblName.setId(1);
        lblName.setText("Name: ");

        EditText txtName = new EditText(context);
        txtName.setId(2);

        Button btnSend = new Button(context);
        btnSend.setId(3);
        btnSend.setText("Send");

        RelativeLayout.LayoutParams lblLayoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);

        lblLayoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        lblName.setLayoutParams(lblLayoutParams);

        RelativeLayout.LayoutParams txtLayoutParams = new RelativeLayout.LayoutParams(400, ViewGroup.LayoutParams.WRAP_CONTENT);
        txtLayoutParams.addRule(RelativeLayout.ALIGN_BASELINE,lblName.getId());
        txtLayoutParams.addRule(RelativeLayout.RIGHT_OF,lblName.getId());
        txtLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_END);

        txtName.setLayoutParams(txtLayoutParams);

        RelativeLayout.LayoutParams btnLayoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        btnLayoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        btnLayoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        btnLayoutParams.setMargins(0,0,0,100);

        btnSend.setLayoutParams(btnLayoutParams);

        layout.addView(lblName);
        layout.addView(txtName);

        return layout;
    }
}