// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.*;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.ext.ui:
//			MainActivity

class MainActivity$5
	implements cl
{

	public void a()
	{
		Snackbar.make(((View) (MainActivity.e(c))), "Cannot Extract, Storage Permission denied.", -2).setAction("Enable", new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				view = ((View) (new Intent()));
			//    0    0:new             #23  <Class Intent>
			//    1    3:dup             
			//    2    4:invokespecial   #24  <Method void Intent()>
			//    3    7:astore_1        
				((Intent) (view)).setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
			//    4    8:aload_1         
			//    5    9:ldc1            #26  <String "android.settings.APPLICATION_DETAILS_SETTINGS">
			//    6   11:invokevirtual   #30  <Method Intent Intent.setAction(String)>
			//    7   14:pop             
				((Intent) (view)).setData(Uri.fromParts("package", a.c.getPackageName(), ((String) (null))));
			//    8   15:aload_1         
			//    9   16:ldc1            #32  <String "package">
			//   10   18:aload_0         
			//   11   19:getfield        #16  <Field MainActivity$5 a>
			//   12   22:getfield        #36  <Field MainActivity MainActivity$5.c>
			//   13   25:invokevirtual   #42  <Method String MainActivity.getPackageName()>
			//   14   28:aconst_null     
			//   15   29:invokestatic    #48  <Method Uri Uri.fromParts(String, String, String)>
			//   16   32:invokevirtual   #52  <Method Intent Intent.setData(Uri)>
			//   17   35:pop             
				a.c.startActivity(((Intent) (view)));
			//   18   36:aload_0         
			//   19   37:getfield        #16  <Field MainActivity$5 a>
			//   20   40:getfield        #36  <Field MainActivity MainActivity$5.c>
			//   21   43:aload_1         
			//   22   44:invokevirtual   #56  <Method void MainActivity.startActivity(Intent)>
			//   23   47:return          
			}

			final MainActivity._cls5 a;

			
			{
				a = MainActivity._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field MainActivity$5 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
).show();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field MainActivity c>
	//    2    4:invokestatic    #34  <Method android.support.v7.widget.RecyclerView MainActivity.e(MainActivity)>
	//    3    7:ldc1            #36  <String "Cannot Extract, Storage Permission denied.">
	//    4    9:bipush          -2
	//    5   11:invokestatic    #42  <Method Snackbar Snackbar.make(View, CharSequence, int)>
	//    6   14:ldc1            #44  <String "Enable">
	//    7   16:new             #13  <Class MainActivity$5$1>
	//    8   19:dup             
	//    9   20:aload_0         
	//   10   21:invokespecial   #47  <Method void MainActivity$5$1(MainActivity$5)>
	//   11   24:invokevirtual   #51  <Method Snackbar Snackbar.setAction(CharSequence, android.view.View$OnClickListener)>
	//   12   27:invokevirtual   #54  <Method void Snackbar.show()>
	//   13   30:return          
	}

	public void a(String as[])
	{
		if(cm.a())
	//*   0    0:invokestatic    #60  <Method boolean cm.a()>
	//*   1    3:ifeq            60
		{
			Snackbar.make(((View) (MainActivity.e(c))), "Storage Permission Granted.", 0).show();
	//    2    6:aload_0         
	//    3    7:getfield        #22  <Field MainActivity c>
	//    4   10:invokestatic    #34  <Method android.support.v7.widget.RecyclerView MainActivity.e(MainActivity)>
	//    5   13:ldc1            #62  <String "Storage Permission Granted.">
	//    6   15:iconst_0        
	//    7   16:invokestatic    #42  <Method Snackbar Snackbar.make(View, CharSequence, int)>
	//    8   19:invokevirtual   #54  <Method void Snackbar.show()>
			(new MainActivity$a(c, a.size(), b)).execute(((Object []) (new ArrayList[] {
				a
			})));
	//    9   22:new             #64  <Class MainActivity$a>
	//   10   25:dup             
	//   11   26:aload_0         
	//   12   27:getfield        #22  <Field MainActivity c>
	//   13   30:aload_0         
	//   14   31:getfield        #24  <Field ArrayList a>
	//   15   34:invokevirtual   #70  <Method int ArrayList.size()>
	//   16   37:aload_0         
	//   17   38:getfield        #26  <Field boolean b>
	//   18   41:invokespecial   #73  <Method void MainActivity$a(MainActivity, int, boolean)>
	//   19   44:iconst_1        
	//   20   45:anewarray       ArrayList[]
	//   21   48:dup             
	//   22   49:iconst_0        
	//   23   50:aload_0         
	//   24   51:getfield        #24  <Field ArrayList a>
	//   25   54:aastore         
	//   26   55:invokevirtual   #77  <Method android.os.AsyncTask MainActivity$a.execute(Object[])>
	//   27   58:pop             
			return;
	//   28   59:return          
		} else
		{
			MainActivity.b(c, cm.b());
	//   29   60:aload_0         
	//   30   61:getfield        #22  <Field MainActivity c>
	//   31   64:invokestatic    #80  <Method String cm.b()>
	//   32   67:invokestatic    #83  <Method void MainActivity.b(MainActivity, String)>
			return;
	//   33   70:return          
		}
	}

	public void b(String as[])
	{
		boolean flag = cm.a();
	//    0    0:invokestatic    #60  <Method boolean cm.a()>
	//    1    3:istore_2        
		ci.a("MainActivity : ", (new StringBuilder()).append("executeOrder APK_EXTRACT sdcard status : ").append(flag).toString());
	//    2    4:ldc1            #85  <String "MainActivity : ">
	//    3    6:new             #87  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #88  <Method void StringBuilder()>
	//    6   13:ldc1            #90  <String "executeOrder APK_EXTRACT sdcard status : ">
	//    7   15:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:iload_2         
	//    9   19:invokevirtual   #97  <Method StringBuilder StringBuilder.append(boolean)>
	//   10   22:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   11   25:invokestatic    #105 <Method void ci.a(String, String)>
		if(flag)
	//*  12   28:iload_2         
	//*  13   29:ifeq            70
		{
			(new MainActivity$a(c, a.size(), b)).execute(((Object []) (new ArrayList[] {
				a
			})));
	//   14   32:new             #64  <Class MainActivity$a>
	//   15   35:dup             
	//   16   36:aload_0         
	//   17   37:getfield        #22  <Field MainActivity c>
	//   18   40:aload_0         
	//   19   41:getfield        #24  <Field ArrayList a>
	//   20   44:invokevirtual   #70  <Method int ArrayList.size()>
	//   21   47:aload_0         
	//   22   48:getfield        #26  <Field boolean b>
	//   23   51:invokespecial   #73  <Method void MainActivity$a(MainActivity, int, boolean)>
	//   24   54:iconst_1        
	//   25   55:anewarray       ArrayList[]
	//   26   58:dup             
	//   27   59:iconst_0        
	//   28   60:aload_0         
	//   29   61:getfield        #24  <Field ArrayList a>
	//   30   64:aastore         
	//   31   65:invokevirtual   #77  <Method android.os.AsyncTask MainActivity$a.execute(Object[])>
	//   32   68:pop             
			return;
	//   33   69:return          
		} else
		{
			MainActivity.b(c, cm.b());
	//   34   70:aload_0         
	//   35   71:getfield        #22  <Field MainActivity c>
	//   36   74:invokestatic    #80  <Method String cm.b()>
	//   37   77:invokestatic    #83  <Method void MainActivity.b(MainActivity, String)>
			return;
	//   38   80:return          
		}
	}

	final ArrayList a;
	final boolean b;
	final MainActivity c;

	MainActivity$5(MainActivity mainactivity, ArrayList arraylist, boolean flag)
	{
		c = mainactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MainActivity c>
		a = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ArrayList a>
		b = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field boolean b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
