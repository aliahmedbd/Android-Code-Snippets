package com.example.aliahmed.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    String dummyJson = "{\"-L5micovVkXLLUL8wFS4\":{\"approved\":false,\"body\":\"<p class=\\\"ql-align-justify\\\"><span style=\\\"color: rgb(17, 17, 17);\\\">‘ম্যাচ ফিক্সিং’&nbsp; নামটা বেশ পরিচিত হলেও এর শুরুটা কিন্তু সবার জানা নেই। প্রায় ৭০০ বছর আগে থেকে এর শুরু, গ্রিসে দুই তরুনের মধ্যে একটি কুস্তি ম্যাচ পাতানো ছিল, খেলা শুরুর আগে থেকেই এর ফলাফল নির্ধারিত ছিল। খেলার এক পক্ষে ছিল কুস্তিগির &nbsp;</span><strong style=\\\"color: rgb(17, 17, 17);\\\">নিকান্তিনাস </strong><span style=\\\"color: rgb(17, 17, 17);\\\">&nbsp;আরেক পক্ষে </span><strong style=\\\"color: rgb(17, 17, 17);\\\">দিমিত্রিস</strong><span style=\\\"color: rgb(17, 17, 17);\\\">। গ্রেট এন্তিনয়িয়া নামে এই ম্যাচে ৮০০ গ্রিক মুদ্রার নিনিময়ে </span><strong style=\\\"color: rgb(17, 17, 17);\\\">দিমিত্রিস </strong><span style=\\\"color: rgb(17, 17, 17);\\\">এই চুক্তিতে রাজি হয়, শর্ত ছিল তিন বার তিনি মাটিতে পড়ে যাবেন। চুক্তি তে আরো ছিল যদি কেউ বুঝে ফেলে ম্যাচ পাতানো ছিল , তাহলে তাকে এই মুদ্রা ফেরত দিতে হবে।</span> <span style=\\\"color: rgb(17, 17, 17);\\\">চুক্তি হয়েছিল নিকান্তিনাসের বাবা আর দিমিত্রিস এর মধ্যে। তার বাবা আরো শর্তারোপ করেন যে , যদি চুক্তির পরে&nbsp; দিমিত্রিস&nbsp; হেরে যেতে অস্বীকার করে তাহলে তাকে আরো বেশি পরিমান মুদ্রা ফেরত দিতে হবে। তখনকার দিনে এই রুপার মুদ্রা আহামরি কিছু ছিল না,৮০০ মুদ্রা দিয়ে একটি গাধা কেনা যেত বড়জোর । তাহলে কেন একজন প্রশিক্ষক হয়েও ফিক্সিং করতো তারা ? কুস্তিগির প্রশিক্ষন অনেক ব্যায়বহুল&nbsp; হবার&nbsp; কারনে টাকার অভাবে তারা এই ফিক্সিং করতো বলে ধারনা করা হয় ।</span></p><p class=\\\"ql-align-justify\\\"><span style=\\\"color: rgb(17, 17, 17);\\\"><br></span></p><p class=\\\"ql-align-justify\\\"><br></p><p class=\\\"ql-align-justify\\\"><span style=\\\"color: rgb(17, 17, 17);\\\">বলে রাখা ভালো, ওয়াসিম আকরাম এর মতো পাকিস্তানি তারকা প্লেয়ার ও কিন্তু&nbsp; ফিক্সিং এ জড়িত থাকার কারনে অধিনায়কত্ব হারান। পাকিস্তানের কাইয়ুম কমিশন তাকে ২০০০ সালের পর থেকে পাকিস্তানের  অধিনায়ক হওয়ার ব্যাপারে নিষেধাজ্ঞা আরোপ করে, এছাড়াও শ্রীশান্ত (ভারত) , আশরাফুল (বাংলাদেশ), মোহাম্মদ আমির (পাকিস্তান), মোহাম্মদ আসিফ (পাকিস্তান) সহ আরও অনেকেই এতে জড়িত </span> ছিল ।</p>\",\"created_at\":1519122026051,\"title\":\"পৃথিবীর প্রথম ম্যাচ ফিক্সিং !\",\"titleImage\":\"https://firebasestorage.googleapis.com/v0/b/dashboard-8b18b.appspot.com/o/posts%2F-L5micovVkXLLUL8wFS4%2Fdcc2d16c-a170-67cd-9599-7f80e4492b57?alt=media&token=83651cf8-e4c1-45f0-827a-57ab9f9eae58\",\"user_id\":\"XQpTV9x3CFUlEt7JzFnxw8yDMRH2\",\"viewCount\":\"3\"},\"-L6BX7HSQPTzdOcBrGsw\":{\"body\":\"<p class=\\\"ql-align-justify\\\">ইউটিউব বর্তমানে পৃথিবীর সবচেয়ে জনপ্রিয় ভিডিও শেয়ারিং ওয়েবসাইট । এটি বর্তমান ইন্টারনেট জগতের সবচেয়ে নামকরা ভিডিও শেয়ারিং ওয়েবসাইট। ইউটিউবের মাধ্যমে ভিডিও আপলোড,দর্শন ,আদান-প্রদান করা যায়। এছাড়া ভিডিও পর্যালোচনা, অভিমত প্রকাশের স্বাধীনতা এই ওয়েবসাইটকে আরো জনপ্রিয় করে তুলেছে। ইউটিউবের প্রতিষ্ঠাতা হিসেবে স্টিভ চেন, জাওয়েদ করিম, চাঁদ হারলের নাম চিরস্মরণীয়। এর সদরদপ্তর মার্কিন যুক্তরাষ্ট্রের ক্যালিফোর্নিয়ার অন্তর্গত ৯০১ চেরী এভিনিউতে অবস্থিত। &nbsp;ইউটিউবের যাত্রা শুরু &nbsp;হয় ১৪ ফ্রেব্রুয়ারী, ২০০৫ সালে । ২০০৫ ও ২০০৬ সালের দিকে এই ওয়েবসাইট স্বাধীন থাকলেও বর্তমানে এটি গুগল এর নিয়ন্ত্রণাধীন। ইউটিইউবের শ্লোগান ”নিজে সম্প্রচার”। এই জনপ্রিয় ওয়েবসাইট এর ঠিকানাটি হল youtube.com। ইউটিউবের মোট ৫৪ টি উপলব্ধ ভাষা এর ব্যবহারকে আরও বহুগুণে</p><p>বাড়িয়ে দিয়েছে।</p><p><br></p>\",\"created_at\":1519554954659,\"title\":\"ইউটিউব পরিচিতি\",\"titleImage\":\"https://firebasestorage.googleapis.com/v0/b/dashboard-8b18b.appspot.com/o/posts%2F-L6BX7HSQPTzdOcBrGsw%2F654362ce-c6f9-1f8d-a9f4-807f7e61c29e?alt=media&token=5002cad2-92e4-4c9e-a388-43593ec6d132\",\"user_id\":\"bgDhtRsn70grJuCmE3gr2LfIgj13\",\"viewCount\":\"4\"}}";
    Map<String, String> jsonMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jsonMap = new HashMap<>();
        parseJsonObjects();
    }

    private void parseJsonObjects() {
        try {
            JSONObject jsonObject = new JSONObject(dummyJson);
            Iterator iterator = jsonObject.keys();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                String value = jsonObject.getString(key);
                jsonMap.put(key, value);
            }

            Toast.makeText(this, jsonMap.toString(), Toast.LENGTH_LONG).show();

        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Json
    }
}
