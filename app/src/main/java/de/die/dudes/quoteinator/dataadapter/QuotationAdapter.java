package de.die.dudes.quoteinator.dataadapter;

import android.database.Cursor;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.die.dudes.quoteinator.R;

/**
 * Created by Phil on 19.08.2016.
 */
public class QuotationAdapter extends RecyclerViewCursorAdapter<QuotationAdapter.ViewHolder> {

    private Cursor cursor;

    public QuotationAdapter(Cursor cursor) {
        super(cursor);
    }

    @Override
    public QuotationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_quotation, parent, false);
        return new ViewHolder(view);
    }

    @Override
    protected View onBindViewHolder(QuotationAdapter.ViewHolder holder, Cursor cursor) {
        String text = cursor.getString(1);
        String date = cursor.getString(2).substring(0,10);
        String module = cursor.getString(3);

        holder.setText(text);
        holder.setDate(date);
        holder.setModule(module);

        return holder.getView();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private CardView cv;
        private TextView text;
        private TextView date;
        private TextView module;

        public ViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.card_view_quotation);
            text = (TextView) cv.findViewById(R.id.cv_text);
            date = (TextView) cv.findViewById(R.id.cv_date);
            module = (TextView) cv.findViewById(R.id.cv_module);
        }


        public void setText(String text) {
            this.text.setText(text);
        }

        public void setDate(String date) {
            this.date.setText(date);
        }

        public void setModule(String module) {
            this.module.setText(module);
        }

        public View getView() {
            return cv;
        }
    }
}
