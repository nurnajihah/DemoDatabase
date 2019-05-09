package sg.edu.rp.c346.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Custom extends ArrayAdapter<Task> {

    private ArrayList<Task> tasks;
    private Context context;
    private TextView tvID;
    private TextView tvTask;
    private TextView tvDate;

   public Custom(Context context, int resource, ArrayList<Task> objects) {
       super(context, resource, objects);
       tasks = objects;
       this.context = context;
   }

    public View getView(int pos, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvID = rowView.findViewById(R.id.tvID);
        tvTask = rowView.findViewById(R.id.tvTask);
        tvDate = rowView.findViewById(R.id.tvDate);

        Task object = tasks.get(pos);

        tvID.setText(Integer.toString(object.getId()));
        tvTask.setText(object.getDescription());
        tvDate.setText(object.getDate());

        return rowView;
    }
}

