package com.bt2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class ClassAdapter extends ArrayAdapter<ClassModel> {

  public ClassAdapter(Context context, List<ClassModel> classList) {
    super(context, 0, classList);
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View listItemView = convertView;
    if (listItemView == null) {
      listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_class, parent, false);
    }

    ClassModel currentClass = getItem(position);

    TextView classIdTextView = listItemView.findViewById(R.id.classId);
    classIdTextView.setText("ID: " + currentClass.getId());

    TextView classNameTextView = listItemView.findViewById(R.id.className);
    classNameTextView.setText(currentClass.getName());

    return listItemView;
  }
}
