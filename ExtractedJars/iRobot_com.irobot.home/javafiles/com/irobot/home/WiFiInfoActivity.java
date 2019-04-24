// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import android.widget.TextView;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;

public class WiFiInfoActivity extends Activity
{

	public WiFiInfoActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Activity()>
	//    2    4:return          
	}

	protected void a()
	{
	//    0    0:return          
	}

	public void b()
	{
		j.l(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #20  <Method boolean j.l(android.content.Context)>
	//    2    4:pop             
		finish();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #23  <Method void finish()>
	//    5    9:return          
	}

	public void onStart()
	{
		Object obj = ((Object) (j.a(((android.content.Context) (this)))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method android.graphics.Typeface j.a(android.content.Context)>
	//    2    4:astore_1        
		b.setTypeface(((android.graphics.Typeface) (obj)));
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field TextView b>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #35  <Method void TextView.setTypeface(android.graphics.Typeface)>
		obj = ((Object) (j.m(((android.content.Context) (this)))));
	//    7   13:aload_0         
	//    8   14:invokestatic    #39  <Method WifiInfo j.m(android.content.Context)>
	//    9   17:astore_1        
		if(obj != null && !TextUtils.isEmpty(((CharSequence) (((WifiInfo) (obj)).getSSID()))))
	//*  10   18:aload_1         
	//*  11   19:ifnull          46
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #45  <Method String WifiInfo.getSSID()>
	//*  14   26:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   29:ifne            46
			c.setText(((CharSequence) (j.e(((WifiInfo) (obj)).getSSID()))));
	//   16   32:aload_0         
	//   17   33:getfield        #53  <Field CustomTextView c>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #45  <Method String WifiInfo.getSSID()>
	//   20   40:invokestatic    #57  <Method String j.e(String)>
	//   21   43:invokevirtual   #63  <Method void CustomTextView.setText(CharSequence)>
		super.onStart();
	//   22   46:aload_0         
	//   23   47:invokespecial   #65  <Method void Activity.onStart()>
	//   24   50:return          
	}

	TextView a;
	TextView b;
	CustomTextView c;
}
