package com.example.rpiclient.ui.home;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.preference.PreferenceManager;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.rpiclient.MainActivity;
import com.example.rpiclient.R;
import com.example.rpiclient.RetrofitInterface;
import com.example.rpiclient.SettingsManager;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {

    private Retrofit retrofit;
    private RetrofitInterface retrofitInterface;
    private String BASE_URL = "http://192.168.8.155:3000";

    //String BASE_URL = settings.getString("PREF_SERVER_IP","");


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);

    }



    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        retrofitInterface = retrofit.create(RetrofitInterface.class);
        super.onViewCreated(view, savedInstanceState);


        //SCREEN OFF
        view.findViewById(R.id.scOff_button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreenOff(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Snackbar.make(view, "OFF", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                        } else if (response.code() == 400) {
                            Snackbar.make(view, "Failed", Snackbar.LENGTH_LONG)
                                    .setAction("Action", null).show();
                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {

                    }
                });

            }
        });

        //SCREEN ON
        view.findViewById(R.id.scOn_button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreenOn(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //10
        view.findViewById(R.id.sc10).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen10(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //20
        view.findViewById(R.id.sc20).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen20(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //30
        view.findViewById(R.id.sc30).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen30(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //40
        view.findViewById(R.id.sc40).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen40(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //50
        view.findViewById(R.id.sc50).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen50(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //60
        view.findViewById(R.id.sc60).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen60(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //70
        view.findViewById(R.id.sc70).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen70(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //80
        view.findViewById(R.id.sc80).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen80(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //90
        view.findViewById(R.id.sc90).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen90(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        //100 MAX
        view.findViewById(R.id.sc100).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View view) {

                HashMap<String, String> map = new HashMap<>();

                Call<Void> call = retrofitInterface.executeScreen100(map);

                call.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {

                        if (response.code() == 200) {
                            Toast.makeText(getActivity(), "Screen ON", Toast.LENGTH_SHORT).show();

                        } else if (response.code() == 400) {
                            Toast.makeText(getActivity(), "Failed!", Toast.LENGTH_SHORT).show();

                        }

                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Server Not respond!", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });


    }

}
