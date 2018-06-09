package com.londonappbrewery.destini;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {



    // TODO: Steps 4 & 8 - Declare member variables here:
        TextView story;
        Button topButton;
        Button bottomButton;
        Button endGame;
        int story_value;
        int ans_value_top;
        int ans_value_bottom;
        Story[] all_stories=new Story[]{new Story(R.string.T1_Story)
        ,new Story(R.string.T2_Story)
        ,new Story(R.string.T3_Story)};
        storyAns[] all_storyans=new storyAns[]{new storyAns(R.string.T1_Ans1)
                ,new storyAns(R.string.T1_Ans2)
                ,new storyAns(R.string.T2_Ans1)
                ,new storyAns(R.string.T2_Ans2)
                ,new storyAns(R.string.T3_Ans1)
                ,new storyAns(R.string.T3_Ans2)};
        storyEnd[] all_storyend=new storyEnd[]{new storyEnd(R.string.T4_End)
                ,new storyEnd(R.string.T5_End)
                ,new storyEnd(R.string.T6_End)};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables://
            story = (TextView)findViewById(R.id.storyTextView);
            topButton=(Button)findViewById(R.id.buttonTop);
            bottomButton=(Button)findViewById(R.id.buttonBottom);
            endGame=(Button)findViewById(R.id.end_button);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
            story_value=all_stories[0].getMyStory();
            ans_value_top=all_storyans[0].getStoryanswer();
            ans_value_bottom=all_storyans[1].getStoryanswer();
            endGame.setVisibility(View.GONE);
            story.setText(story_value);
            topButton.setText(ans_value_top);
            bottomButton.setText(ans_value_bottom);
            topButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rules(0);
                }
            });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
            bottomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rules(1);
                }
            });

    }
            public void rules(int click) {
                if (story_value == (all_stories[0].getMyStory())) {
                    if (click == 0) {
                        story_value = all_stories[2].getMyStory();
                        ans_value_top = all_storyans[4].getStoryanswer();
                        ans_value_bottom = all_storyans[5].getStoryanswer();
                        story.setText(story_value);
                        topButton.setText(ans_value_top);
                        bottomButton.setText(ans_value_bottom);
                    } else {
                        story_value = all_stories[1].getMyStory();
                        ans_value_top = all_storyans[2].getStoryanswer();
                        ans_value_bottom = all_storyans[3].getStoryanswer();
                        story.setText(story_value);
                        topButton.setText(ans_value_top);
                        bottomButton.setText(ans_value_bottom);
                    }
                } else if (story_value == (all_stories[1].getMyStory())) {
                    if (click == 0) {
                        story_value = all_stories[2].getMyStory();
                        ans_value_top = all_storyans[4].getStoryanswer();
                        ans_value_bottom = all_storyans[5].getStoryanswer();
                        story.setText(story_value);
                        topButton.setText(ans_value_top);
                        bottomButton.setText(ans_value_bottom);
                    } else {
                        story_value = all_storyend[1].getStoryendID();
                        story.setText(story_value);
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        end_game();
                    }
                } else if (story_value == (all_stories[2].getMyStory())) {
                    if (click == 0) {
                        story_value = all_storyend[2].getStoryendID();
                        story.setText(story_value);
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        end_game();

                    } else {
                        story_value = all_storyend[1].getStoryendID();
                        story.setText(story_value);
                        topButton.setVisibility(View.GONE);
                        bottomButton.setVisibility(View.GONE);
                        end_game();
                    }
                }
            }
            public void end_game()
                {
                    endGame.setVisibility(View.VISIBLE);
                    endGame.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            finish();
                        }
                    });
                }
}

