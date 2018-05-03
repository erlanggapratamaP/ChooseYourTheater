package software.addigma.chooseyourtheather.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import software.addigma.chooseyourtheather.R;

public class fragment1 extends Fragment {
    Button mFragment2;
    TextView mTheater1;
    public fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        mFragment2 = (Button) view.findViewById(R.id.btn_fragment2);
        mTheater1 = (TextView) view.findViewById(R.id.theater1);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);
        mFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().
                        setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).
                        replace(R.id.framecontainer,
                                new fragment2(),
                                fragment2.class.getSimpleName()).addToBackStack(null).commit();
            }
        });

        mTheater1.setText(R.string.fragment1);
    }

}
