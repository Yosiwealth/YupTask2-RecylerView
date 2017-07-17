
import android.*;
import android.app.*;
import android.graphics.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import com.mycompany.yupDev_RecyclerView.*;
import java.util.*;

public class MainActivity extends Activity
{
	
	private List<List> theList = new ArrayList<>();
    private RecyclerView recyclerView;
    private listAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

		mAdapter = new listAdapter(theList);
		RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
		recyclerView.setLayoutManager(mLayoutManager);
//		recyclerView.setItemAnimator(new DefaultItemAnimator());
		recyclerView.setAdapter(mAdapter);

			prepareListData();
		}

		private void prepareListData() {
			
		}
	}
