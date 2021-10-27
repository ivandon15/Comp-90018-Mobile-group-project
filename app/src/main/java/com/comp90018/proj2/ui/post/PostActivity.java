package com.comp90018.proj2.ui.post;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.os.Bundle;

import com.comp90018.proj2.R;
import com.comp90018.proj2.MainActivity;
public class PostActivity extends AppCompatActivity {
    PostItem postItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int postId = bundle.getInt("postId");

        // post id传递
        Log.e("post", String.valueOf(postId));
        setContentView(R.layout.activity_post);
        postItem = new PostItem();
    }
    public void back_onclick(View view)
    {
        Intent intent=new Intent();
        intent.setClass(PostActivity.this, MainActivity.class);
        PostActivity.this.startActivity(intent);
    }
}