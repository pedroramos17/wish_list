package br.com.etecia.wish_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] localDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView title, subhead;
        private final ImageView headerImage;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            title = (TextView) view.findViewById(R.id.title);
            subhead = (TextView) view.findViewById(R.id.subhead);
            headerImage = (ImageView) view.findViewById(R.id.header_image);
        }

        public TextView getTitle() {
            return title;
        }
        public TextView getSubhead() {
            return subhead;
        }

        public ImageView getHeaderImage() {
            return headerImage;
        }
    }

    /**
     * Initialize the dataset of the Adapter
     *
     * @param dataSet String[] containing the data to populate views to be used
     * by RecyclerView
     */
    public RecyclerAdapter(String[] dataSet) {
        localDataSet = dataSet;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        holder.getTitle().setText(localDataSet[position]);
        holder.getSubhead().setText(localDataSet[position]);
        holder.getHeaderImage().setImageResource(Integer.parseInt(localDataSet[position]));
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
