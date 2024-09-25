package com.bt2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.activity.ComponentActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ComponentActivity { // Sửa lại phần này

  private ListView listView;

  private List<ClassModel> classList;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // Khởi tạo danh sách lớp
    classList = new ArrayList<>();
    classList.add(new ClassModel(1, "Lớp 1"));
    classList.add(new ClassModel(2, "Lớp 2"));
    classList.add(new ClassModel(3, "Lớp 3"));
    classList.add(new ClassModel(4, "Lớp 4"));
    classList.add(new ClassModel(5, "Lớp 5"));

    // Tìm ListView và gán adapter
    listView = findViewById(R.id.listViewClasses);
    ClassAdapter adapter = new ClassAdapter(this, classList);
    listView.setAdapter(adapter);

    // Xử lý sự kiện khi nhấp vào một mục trong danh sách
    listView.setOnItemClickListener(
        new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ClassModel selectedClass = classList.get(position);

            // Tạo Intent để mở màn hình chi tiết
            Intent intent = new Intent(MainActivity.this, ClassDetailActivity.class);
            intent.putExtra("class_id", selectedClass.getId());
            intent.putExtra("class_name", selectedClass.getName());
            startActivity(intent);
          }
        });
  }
}
