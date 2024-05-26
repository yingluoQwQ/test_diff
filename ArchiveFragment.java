package me.sadraa.detoxiom;


import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArchiveFragment extends Fragment {
    TextView authorArchive;
    ArrayList<QuoteDbModel> quoteDbModelList;
    ArrayList<QuoteDbModel> quoteDbModelListRV;
    QuoteDb quoteDb;
    RecyclerView rv;
    RVAdapter rvAdapter;
    List<QuoteDbModel> mList;


    public void test(){
        mList = quoteDb.quoteDao().getAll();
        quoteDbModelList = new ArrayList<>();
        quoteDbModelListRV = new ArrayList<>(mList.size());
        for (QuoteDbModel q:mList) {
            quoteDbModelListRV.add(q);
        }
    }
}
