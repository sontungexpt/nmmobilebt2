package com.bt2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.ComponentActivity;

public class ClassDetailActivity extends ComponentActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_class_detail);

    // Lấy dữ liệu từ Intent
    int classId = getIntent().getIntExtra("class_id", 0);
    String className = getIntent().getStringExtra("class_name");

    // Hiển thị thông tin chi tiết
    TextView classDetailTextView = findViewById(R.id.classDetailTextView);
    classDetailTextView.setText("ID: " + classId + "\nTên lớp: " + className);
  }
}
