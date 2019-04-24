// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.hwproxy;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.f;
import com.baidu.android.pushservice.h.u;

public class HwNotifyActivity extends Activity
{

	public HwNotifyActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Activity()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void Activity.onCreate(Bundle)>
		bundle = ((Bundle) (getIntent()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #19  <Method Intent getIntent()>
	//    5    9:astore_1        
		if(bundle == null)
			break MISSING_BLOCK_LABEL_203;
	//    6   10:aload_1         
	//    7   11:ifnull          203
		Uri uri;
		Object obj;
		String s;
		uri = ((Intent) (bundle)).getData();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #25  <Method Uri Intent.getData()>
	//   10   18:astore_3        
		obj = ((Object) (new StringBuilder()));
	//   11   19:new             #27  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #28  <Method void StringBuilder()>
	//   14   26:astore          4
		((StringBuilder) (obj)).append("intentUri  Data = ");
	//   15   28:aload           4
	//   16   30:ldc1            #30  <String "intentUri  Data = ">
	//   17   32:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
		((StringBuilder) (obj)).append(uri.toString());
	//   19   36:aload           4
	//   20   38:aload_3         
	//   21   39:invokevirtual   #40  <Method String Uri.toString()>
	//   22   42:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		a.c("HwNotifyActivity", ((StringBuilder) (obj)).toString());
	//   24   46:ldc1            #42  <String "HwNotifyActivity">
	//   25   48:aload           4
	//   26   50:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   27   53:invokestatic    #49  <Method void a.c(String, String)>
		obj = ((Object) (f.d(getApplicationContext(), ((Intent) (bundle)))));
	//   28   56:aload_0         
	//   29   57:invokevirtual   #53  <Method android.content.Context getApplicationContext()>
	//   30   60:aload_1         
	//   31   61:invokestatic    #59  <Method String f.d(android.content.Context, Intent)>
	//   32   64:astore          4
		s = f.c(getApplicationContext(), ((Intent) (bundle)));
	//   33   66:aload_0         
	//   34   67:invokevirtual   #53  <Method android.content.Context getApplicationContext()>
	//   35   70:aload_1         
	//   36   71:invokestatic    #61  <Method String f.c(android.content.Context, Intent)>
	//   37   74:astore          5
		StringBuilder stringbuilder1 = new StringBuilder();
	//   38   76:new             #27  <Class StringBuilder>
	//   39   79:dup             
	//   40   80:invokespecial   #28  <Method void StringBuilder()>
	//   41   83:astore          6
		stringbuilder1.append("hwsigninfo = ");
	//   42   85:aload           6
	//   43   87:ldc1            #63  <String "hwsigninfo = ">
	//   44   89:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   45   92:pop             
		stringbuilder1.append(s);
	//   46   93:aload           6
	//   47   95:aload           5
	//   48   97:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   49  100:pop             
		stringbuilder1.append("  checkinfo = ");
	//   50  101:aload           6
	//   51  103:ldc1            #65  <String "  checkinfo = ">
	//   52  105:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   53  108:pop             
		stringbuilder1.append(((String) (obj)));
	//   54  109:aload           6
	//   55  111:aload           4
	//   56  113:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   57  116:pop             
		a.c("HwNotifyActivity", stringbuilder1.toString());
	//   58  117:ldc1            #42  <String "HwNotifyActivity">
	//   59  119:aload           6
	//   60  121:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   61  124:invokestatic    #49  <Method void a.c(String, String)>
		if(TextUtils.isEmpty(((CharSequence) (s))) || uri == null)
			break MISSING_BLOCK_LABEL_203;
	//   62  127:aload           5
	//   63  129:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   64  132:ifne            203
	//   65  135:aload_3         
	//   66  136:ifnull          203
		boolean flag;
		flag = f.a(getApplicationContext(), s, ((String) (obj)));
	//   67  139:aload_0         
	//   68  140:invokevirtual   #53  <Method android.content.Context getApplicationContext()>
	//   69  143:aload           5
	//   70  145:aload           4
	//   71  147:invokestatic    #75  <Method boolean f.a(android.content.Context, String, String)>
	//   72  150:istore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   73  151:new             #27  <Class StringBuilder>
	//   74  154:dup             
	//   75  155:invokespecial   #28  <Method void StringBuilder()>
	//   76  158:astore_3        
		stringbuilder.append("hwMessageVerify = ");
	//   77  159:aload_3         
	//   78  160:ldc1            #77  <String "hwMessageVerify = ">
	//   79  162:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   80  165:pop             
		stringbuilder.append(flag);
	//   81  166:aload_3         
	//   82  167:iload_2         
	//   83  168:invokevirtual   #80  <Method StringBuilder StringBuilder.append(boolean)>
	//   84  171:pop             
		a.c("HwNotifyActivity", stringbuilder.toString());
	//   85  172:ldc1            #42  <String "HwNotifyActivity">
	//   86  174:aload_3         
	//   87  175:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   88  178:invokestatic    #49  <Method void a.c(String, String)>
		if(flag)
	//*  89  181:iload_2         
	//*  90  182:ifeq            203
			try
			{
				u.a(getApplicationContext(), ((Intent) (bundle)));
	//   91  185:aload_0         
	//   92  186:invokevirtual   #53  <Method android.content.Context getApplicationContext()>
	//   93  189:aload_1         
	//   94  190:invokestatic    #85  <Method void u.a(android.content.Context, Intent)>
			}
	//*  95  193:goto            203
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
	//*  96  196:astore_1        
			{
				a.a("HwNotifyActivity", ((Throwable) (bundle)));
	//   97  197:ldc1            #42  <String "HwNotifyActivity">
	//   98  199:aload_1         
	//   99  200:invokestatic    #88  <Method void a.a(String, Throwable)>
			}
		finish();
	//  100  203:aload_0         
	//  101  204:invokevirtual   #91  <Method void finish()>
		return;
	//  102  207:return          
	}
}
