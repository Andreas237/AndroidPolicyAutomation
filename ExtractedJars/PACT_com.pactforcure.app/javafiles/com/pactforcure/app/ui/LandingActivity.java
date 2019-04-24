// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.*;
import android.widget.TextView;
import com.pactforcure.app.studies.Res;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class LandingActivity extends AppCompatActivity
{

	public LandingActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void AppCompatActivity()>
	//    2    4:return          
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(((Context) (CalligraphyContextWrapper.wrap(context))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #28  <Method android.content.ContextWrapper CalligraphyContextWrapper.wrap(Context)>
	//    3    5:invokespecial   #30  <Method void AppCompatActivity.attachBaseContext(Context)>
	//    4    8:return          
	}

	protected void onCreate(Bundle bundle)
	{
		boolean flag;
		int i;
		String s;
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void AppCompatActivity.onCreate(Bundle)>
		setContentView(0x7f040021);
	//    3    5:aload_0         
	//    4    6:ldc1            #35  <Int 0x7f040021>
	//    5    8:invokevirtual   #39  <Method void setContentView(int)>
		flag = false;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		i = getIntent().getIntExtra("reasonExtra", -1);
	//    8   13:aload_0         
	//    9   14:invokevirtual   #43  <Method Intent getIntent()>
	//   10   17:ldc1            #11  <String "reasonExtra">
	//   11   19:iconst_m1       
	//   12   20:invokevirtual   #49  <Method int Intent.getIntExtra(String, int)>
	//   13   23:istore_3        
		s = "";
	//   14   24:ldc1            #51  <String "">
	//   15   26:astore          4
		bundle = "";
	//   16   28:ldc1            #51  <String "">
	//   17   30:astore_1        
		i;
	//   18   31:iload_3         
		JVM INSTR tableswitch 0 1: default 56
	//	               0 118
	//	               1 134;
	//   19   32:tableswitch     0 1: default 56
	//	               0 118
	//	               1 134
		   goto _L1 _L2 _L3
_L1:
		toolbar = (Toolbar)findViewById(0x7f0e00af);
	//   20   56:aload_0         
	//   21   57:aload_0         
	//   22   58:ldc1            #52  <Int 0x7f0e00af>
	//   23   60:invokevirtual   #56  <Method View findViewById(int)>
	//   24   63:checkcast       #58  <Class Toolbar>
	//   25   66:putfield        #60  <Field Toolbar toolbar>
		toolbar.setTitle(((CharSequence) (s)));
	//   26   69:aload_0         
	//   27   70:getfield        #60  <Field Toolbar toolbar>
	//   28   73:aload           4
	//   29   75:invokevirtual   #64  <Method void Toolbar.setTitle(CharSequence)>
		setSupportActionBar(toolbar);
	//   30   78:aload_0         
	//   31   79:aload_0         
	//   32   80:getfield        #60  <Field Toolbar toolbar>
	//   33   83:invokevirtual   #68  <Method void setSupportActionBar(Toolbar)>
		((TextView)findViewById(0x7f0e00a7)).setText(((CharSequence) (Html.fromHtml(((String) (bundle))))));
	//   34   86:aload_0         
	//   35   87:ldc1            #69  <Int 0x7f0e00a7>
	//   36   89:invokevirtual   #56  <Method View findViewById(int)>
	//   37   92:checkcast       #71  <Class TextView>
	//   38   95:aload_1         
	//   39   96:invokestatic    #77  <Method android.text.Spanned Html.fromHtml(String)>
	//   40   99:invokevirtual   #80  <Method void TextView.setText(CharSequence)>
		if(flag)
	//*  41  102:iload_2         
	//*  42  103:ifeq            117
			findViewById(0x7f0e00c4).setVisibility(8);
	//   43  106:aload_0         
	//   44  107:ldc1            #81  <Int 0x7f0e00c4>
	//   45  109:invokevirtual   #56  <Method View findViewById(int)>
	//   46  112:bipush          8
	//   47  114:invokevirtual   #86  <Method void View.setVisibility(int)>
		return;
	//   48  117:return          
_L2:
		s = Res.getRegularString(0x7f08002f);
	//   49  118:ldc1            #87  <Int 0x7f08002f>
	//   50  120:invokestatic    #93  <Method String Res.getRegularString(int)>
	//   51  123:astore          4
		bundle = ((Bundle) (Res.getRegularString(0x7f08002e)));
	//   52  125:ldc1            #94  <Int 0x7f08002e>
	//   53  127:invokestatic    #93  <Method String Res.getRegularString(int)>
	//   54  130:astore_1        
		continue; /* Loop/switch isn't completed */
	//   55  131:goto            56
_L3:
		flag = true;
	//   56  134:iconst_1        
	//   57  135:istore_2        
		s = Res.getStudySpecificString(0x7f080212);
	//   58  136:ldc1            #95  <Int 0x7f080212>
	//   59  138:invokestatic    #98  <Method String Res.getStudySpecificString(int)>
	//   60  141:astore          4
		bundle = ((Bundle) (Res.getStudySpecificRawAsString(0x7f07000e)));
	//   61  143:ldc1            #99  <Int 0x7f07000e>
	//   62  145:invokestatic    #102 <Method String Res.getStudySpecificRawAsString(int)>
	//   63  148:astore_1        
		if(true) goto _L1; else goto _L4
	//   64  149:goto            56
_L4:
	}

	public boolean onCreateOptionsMenu(Menu menu)
	{
		toolbar.inflateMenu(0x7f0f0007);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Toolbar toolbar>
	//    2    4:ldc1            #105 <Int 0x7f0f0007>
	//    3    6:invokevirtual   #108 <Method void Toolbar.inflateMenu(int)>
		return true;
	//    4    9:iconst_1        
	//    5   10:ireturn         
	}

	public boolean onOptionsItemSelected(MenuItem menuitem)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method void finish()>
		return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	}

	public static final int REASON_CONSENT = 0;
	public static final String REASON_EXTRA = "reasonExtra";
	public static final int REASON_THANKS_DNA = 1;
	private Toolbar toolbar;
}
