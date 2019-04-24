// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.*;
import java.util.ArrayList;

// Referenced classes of package com.ext.ui:
//			MainActivity

private class MainActivity$a extends AsyncTask
{

	protected transient String a(ArrayList aarraylist[])
	{
		aarraylist = ((ArrayList []) (aarraylist[0]));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:astore_1        
		if(b == 1)
	//*   4    4:aload_0         
	//*   5    5:getfield        #22  <Field int b>
	//*   6    8:iconst_1        
	//*   7    9:icmpne          72
		{
			int i = ((Integer)((ArrayList) (aarraylist)).get(0)).intValue();
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #32  <Method Object ArrayList.get(int)>
	//   11   17:checkcast       #34  <Class Integer>
	//   12   20:invokevirtual   #38  <Method int Integer.intValue()>
	//   13   23:istore_2        
			aarraylist = ((ArrayList []) (MainActivity.a(a).a(i)));
	//   14   24:aload_0         
	//   15   25:getfield        #17  <Field MainActivity a>
	//   16   28:invokestatic    #41  <Method bv MainActivity.a(MainActivity)>
	//   17   31:iload_2         
	//   18   32:invokevirtual   #46  <Method android.support.v7.ck bv.a(int)>
	//   19   35:astore_1        
			ci.a("MainActivity : ", (new StringBuilder()).append("app to extract : ").append(((Object) (aarraylist))).toString());
	//   20   36:ldc1            #48  <String "MainActivity : ">
	//   21   38:new             #50  <Class StringBuilder>
	//   22   41:dup             
	//   23   42:invokespecial   #51  <Method void StringBuilder()>
	//   24   45:ldc1            #53  <String "app to extract : ">
	//   25   47:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   26   50:aload_1         
	//   27   51:invokevirtual   #60  <Method StringBuilder StringBuilder.append(Object)>
	//   28   54:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   29   57:invokestatic    #69  <Method void ci.a(String, String)>
			return MainActivity.f(a).a(((Object) (aarraylist)));
	//   30   60:aload_0         
	//   31   61:getfield        #17  <Field MainActivity a>
	//   32   64:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
	//   33   67:aload_1         
	//   34   68:invokevirtual   #78  <Method String cn.a(Object)>
	//   35   71:areturn         
		}
		for(int j = 0; j < ((ArrayList) (aarraylist)).size(); j++)
	//*  36   72:iconst_0        
	//*  37   73:istore_2        
	//*  38   74:iload_2         
	//*  39   75:aload_1         
	//*  40   76:invokevirtual   #81  <Method int ArrayList.size()>
	//*  41   79:icmpge          154
		{
			int k = ((Integer)((ArrayList) (aarraylist)).get(j)).intValue();
	//   42   82:aload_1         
	//   43   83:iload_2         
	//   44   84:invokevirtual   #32  <Method Object ArrayList.get(int)>
	//   45   87:checkcast       #34  <Class Integer>
	//   46   90:invokevirtual   #38  <Method int Integer.intValue()>
	//   47   93:istore_3        
			android.support.v7.ck ck = MainActivity.a(a).a(k);
	//   48   94:aload_0         
	//   49   95:getfield        #17  <Field MainActivity a>
	//   50   98:invokestatic    #41  <Method bv MainActivity.a(MainActivity)>
	//   51  101:iload_3         
	//   52  102:invokevirtual   #46  <Method android.support.v7.ck bv.a(int)>
	//   53  105:astore          4
			MainActivity.f(a).a(((Object) (ck)));
	//   54  107:aload_0         
	//   55  108:getfield        #17  <Field MainActivity a>
	//   56  111:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
	//   57  114:aload           4
	//   58  116:invokevirtual   #78  <Method String cn.a(Object)>
	//   59  119:pop             
			publishProgress(((Object []) (new Integer[] {
				Integer.valueOf(j + 1), Integer.valueOf(((ArrayList) (aarraylist)).size())
			})));
	//   60  120:aload_0         
	//   61  121:iconst_2        
	//   62  122:anewarray       Integer[]
	//   63  125:dup             
	//   64  126:iconst_0        
	//   65  127:iload_2         
	//   66  128:iconst_1        
	//   67  129:iadd            
	//   68  130:invokestatic    #85  <Method Integer Integer.valueOf(int)>
	//   69  133:aastore         
	//   70  134:dup             
	//   71  135:iconst_1        
	//   72  136:aload_1         
	//   73  137:invokevirtual   #81  <Method int ArrayList.size()>
	//   74  140:invokestatic    #85  <Method Integer Integer.valueOf(int)>
	//   75  143:aastore         
	//   76  144:invokevirtual   #89  <Method void publishProgress(Object[])>
		}

	//   77  147:iload_2         
	//   78  148:iconst_1        
	//   79  149:iadd            
	//   80  150:istore_2        
	//*  81  151:goto            74
		return cm.d();
	//   82  154:invokestatic    #94  <Method String cm.d()>
	//   83  157:areturn         
	}

	protected void a(String s)
	{
		super.onPostExecute(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #101 <Method void AsyncTask.onPostExecute(Object)>
		a.c();
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field MainActivity a>
	//    5    9:invokevirtual   #103 <Method void MainActivity.c()>
		String s1 = (new StringBuilder()).append(a.getString(0x7f0d0041)).append(s).toString();
	//    6   12:new             #50  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #51  <Method void StringBuilder()>
	//    9   19:aload_0         
	//   10   20:getfield        #17  <Field MainActivity a>
	//   11   23:ldc1            #104 <Int 0x7f0d0041>
	//   12   25:invokevirtual   #108 <Method String MainActivity.getString(int)>
	//   13   28:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   14   31:aload_1         
	//   15   32:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   17   38:astore_2        
		MainActivity.b(a, s1);
	//   18   39:aload_0         
	//   19   40:getfield        #17  <Field MainActivity a>
	//   20   43:aload_2         
	//   21   44:invokestatic    #111 <Method void MainActivity.b(MainActivity, String)>
		if(c && !s.equals(((Object) (MainActivity.f(a).a(0x7f0d003f)))))
	//*  22   47:aload_0         
	//*  23   48:getfield        #24  <Field boolean c>
	//*  24   51:ifeq            88
	//*  25   54:aload_1         
	//*  26   55:aload_0         
	//*  27   56:getfield        #17  <Field MainActivity a>
	//*  28   59:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
	//*  29   62:ldc1            #112 <Int 0x7f0d003f>
	//*  30   64:invokevirtual   #114 <Method String cn.a(int)>
	//*  31   67:invokevirtual   #120 <Method boolean String.equals(Object)>
	//*  32   70:ifne            88
			MainActivity.f(a).b(((android.content.Context) (a)), s);
	//   33   73:aload_0         
	//   34   74:getfield        #17  <Field MainActivity a>
	//   35   77:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
	//   36   80:aload_0         
	//   37   81:getfield        #17  <Field MainActivity a>
	//   38   84:aload_1         
	//   39   85:invokevirtual   #123 <Method void cn.b(android.content.Context, String)>
	//   40   88:return          
	}

	protected transient void a(Integer ainteger[])
	{
		super.onProgressUpdate(((Object []) (ainteger)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #127 <Method void AsyncTask.onProgressUpdate(Object[])>
		if(MainActivity.g(a) != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field MainActivity a>
	//*   5    9:invokestatic    #131 <Method ProgressDialog MainActivity.g(MainActivity)>
	//*   6   12:ifnull          47
		{
			MainActivity.g(a).setProgress(ainteger[0].intValue());
	//    7   15:aload_0         
	//    8   16:getfield        #17  <Field MainActivity a>
	//    9   19:invokestatic    #131 <Method ProgressDialog MainActivity.g(MainActivity)>
	//   10   22:aload_1         
	//   11   23:iconst_0        
	//   12   24:aaload          
	//   13   25:invokevirtual   #38  <Method int Integer.intValue()>
	//   14   28:invokevirtual   #137 <Method void ProgressDialog.setProgress(int)>
			MainActivity.g(a).setMax(ainteger[1].intValue());
	//   15   31:aload_0         
	//   16   32:getfield        #17  <Field MainActivity a>
	//   17   35:invokestatic    #131 <Method ProgressDialog MainActivity.g(MainActivity)>
	//   18   38:aload_1         
	//   19   39:iconst_1        
	//   20   40:aaload          
	//   21   41:invokevirtual   #38  <Method int Integer.intValue()>
	//   22   44:invokevirtual   #140 <Method void ProgressDialog.setMax(int)>
		}
	//   23   47:return          
	}

	protected Object doInBackground(Object aobj[])
	{
		return ((Object) (a((ArrayList[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #144 <Class ArrayList[]>
	//    3    5:invokevirtual   #146 <Method String a(ArrayList[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(Object obj)
	{
		a((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #116 <Class String>
	//    3    5:invokevirtual   #148 <Method void a(String)>
	//    4    8:return          
	}

	protected void onPreExecute()
	{
		super.onPreExecute();
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method void AsyncTask.onPreExecute()>
		ci.a("MainActivity : ", (new StringBuilder()).append("Extract:: onPreExecute ,Size:").append(b).toString());
	//    2    4:ldc1            #48  <String "MainActivity : ">
	//    3    6:new             #50  <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #51  <Method void StringBuilder()>
	//    6   13:ldc1            #153 <String "Extract:: onPreExecute ,Size:">
	//    7   15:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field int b>
	//   10   22:invokevirtual   #156 <Method StringBuilder StringBuilder.append(int)>
	//   11   25:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   12   28:invokestatic    #69  <Method void ci.a(String, String)>
		if(b == 1)
	//*  13   31:aload_0         
	//*  14   32:getfield        #22  <Field int b>
	//*  15   35:iconst_1        
	//*  16   36:icmpne          60
		{
			a.a(MainActivity.f(a).a(0x7f0d0042), 0);
	//   17   39:aload_0         
	//   18   40:getfield        #17  <Field MainActivity a>
	//   19   43:aload_0         
	//   20   44:getfield        #17  <Field MainActivity a>
	//   21   47:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
	//   22   50:ldc1            #157 <Int 0x7f0d0042>
	//   23   52:invokevirtual   #114 <Method String cn.a(int)>
	//   24   55:iconst_0        
	//   25   56:invokevirtual   #160 <Method void MainActivity.a(String, int)>
			return;
	//   26   59:return          
		} else
		{
			a.a(MainActivity.f(a).a(0x7f0d0042), 1);
	//   27   60:aload_0         
	//   28   61:getfield        #17  <Field MainActivity a>
	//   29   64:aload_0         
	//   30   65:getfield        #17  <Field MainActivity a>
	//   31   68:invokestatic    #73  <Method cn MainActivity.f(MainActivity)>
	//   32   71:ldc1            #157 <Int 0x7f0d0042>
	//   33   73:invokevirtual   #114 <Method String cn.a(int)>
	//   34   76:iconst_1        
	//   35   77:invokevirtual   #160 <Method void MainActivity.a(String, int)>
			return;
	//   36   80:return          
		}
	}

	protected void onProgressUpdate(Object aobj[])
	{
		a((Integer[])aobj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #162 <Class Integer[]>
	//    3    5:invokevirtual   #164 <Method void a(Integer[])>
	//    4    8:return          
	}

	final MainActivity a;
	private int b;
	private boolean c;

	public MainActivity$a(MainActivity mainactivity, int i, boolean flag)
	{
		a = mainactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MainActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void AsyncTask()>
		b = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field int b>
		c = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #24  <Field boolean c>
		b = i;
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:putfield        #22  <Field int b>
		c = flag;
	//   14   24:aload_0         
	//   15   25:iload_3         
	//   16   26:putfield        #24  <Field boolean c>
	//   17   29:return          
	}
}
