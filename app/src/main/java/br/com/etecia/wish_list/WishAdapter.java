package br.com.etecia.wish_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WishAdapter extends RecyclerView.Adapter<WishAdapter.ViewHolder> {

    private final Context context;
    private final List<WishModal> wishModalList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView header, subhead;
        private final ImageView headerImage;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View

            header = (TextView) view.findViewById(R.id.header);
            subhead = (TextView) view.findViewById(R.id.subhead);
            headerImage = (ImageView) view.findViewById(R.id.header_image);
        }

        public TextView getHeader() {
            return header;
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
     * @param wishModalList List<WishModal> containing the data to populate views to be used
     * by RecyclerView
     */
    public WishAdapter(Context context, List<WishModal> wishModalList) {
        this.context = context;
        this.wishModalList = wishModalList;
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
        WishModal model = wishModalList.get(position);
        holder.getHeader().setText(model.getHeader());
        holder.getSubhead().setText(model.getSubHeader());
        holder.getHeaderImage().setImageResource(model.getImage());
    }

    @Override
    public int getItemCount() {
        return wishModalList.size();
    }
}
