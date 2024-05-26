package me.sadraa.detoxiom;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArchiveFragment extends Fragment {
    TextView authorArchive;
    ArrayList<QuoteDbModel> quoteDbModelList;
    QuoteDb quoteDb;
    RecyclerView rv;
    RVAdapter rvAdapter;


    public void test(){
        final List<QuoteDbModel> mList = quoteDb.quoteDao().getAll();
        ArrayList<QuoteDbModel> quoteDbModelListRV = convertListQuoteToArray(mList);
    }

    public ArrayList<QuoteDbModel> convertListQuoteToArray(List<QuoteDbModel> mList){
        if (mList != null) {
            quoteDbModelList = new ArrayList<>(mList.size());
            for (QuoteDbModel q:mList) {
                quoteDbModelList.add(q);
            }
            return quoteDbModelList;
        }else{
            return null;
        }

    }

}
