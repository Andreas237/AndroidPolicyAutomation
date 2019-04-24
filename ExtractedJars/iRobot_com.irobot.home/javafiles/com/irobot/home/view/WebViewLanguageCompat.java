// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.irobot.home.IRobotApplication;

public class WebViewLanguageCompat extends WebView
{

	public WebViewLanguageCompat(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void WebView(Context)>
		a(context);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #11  <Method void a(Context)>
	//    6   10:return          
	}

	public WebViewLanguageCompat(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void WebView(Context, AttributeSet)>
		a(context);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #11  <Method void a(Context)>
	//    7   11:return          
	}

	public WebViewLanguageCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #18  <Method void WebView(Context, AttributeSet, int)>
		a(context);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokespecial   #11  <Method void a(Context)>
	//    8   12:return          
	}

	private void a(Context context)
	{
		((IRobotApplication)((Activity)context).getApplication()).p();
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class Activity>
	//    2    4:invokevirtual   #24  <Method android.app.Application Activity.getApplication()>
	//    3    7:checkcast       #26  <Class IRobotApplication>
	//    4   10:invokevirtual   #30  <Method void IRobotApplication.p()>
		setLayerType(1, new Paint());
	//    5   13:aload_0         
	//    6   14:iconst_1        
	//    7   15:new             #32  <Class Paint>
	//    8   18:dup             
	//    9   19:invokespecial   #34  <Method void Paint()>
	//   10   22:invokevirtual   #38  <Method void setLayerType(int, Paint)>
	//   11   25:return          
	}
}
