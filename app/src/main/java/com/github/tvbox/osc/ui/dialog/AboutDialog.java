package com.github.tvbox.osc.ui.dialog;

import android.content.Context;

import androidx.annotation.NonNull;

import com.github.tvbox.osc.R;

import org.jetbrains.annotations.NotNull;

import android.widget.TextView;
import android.content.pm.PackageInfo;  
import android.content.pm.PackageManager; 

public class AboutDialog extends BaseDialog {
    private String versionName; // 声明versionName作为类的一个成员变量	
    public AboutDialog(@NonNull @NotNull Context context) {
        super(context);
        setContentView(R.layout.dialog_about); 
        try {  
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);  
            versionName = packageInfo.versionName;  
        } catch (PackageManager.NameNotFoundException e) {  
            e.printStackTrace();  
        } 
		// 获取TextView对象  
        TextView txtView = findViewById(R.id.abouttxt); // 这里需要替换为你的TextView的ID
        // 设置TextView的文本，添加版本号到原有文本的后面  
        txtView.setText(txtView.getText() + "\n版本: V" + versionName);
    }	  		
}
