// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ext.ui;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.*;
import java.util.ArrayList;

// Referenced classes of package com.ext.ui:
//			MainActivity

class MainActivity$6
	implements android.content..OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(((Object) (a[i])).equals("Launch"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field CharSequence[] a>
	//*   2    4:iload_2         
	//*   3    5:aaload          
	//*   4    6:ldc1            #36  <String "Launch">
	//*   5    8:invokevirtual   #40  <Method boolean Object.equals(Object)>
	//*   6   11:ifeq            33
		{
			MainActivity.f(d).b(b, ((android.content.Context) (d)));
	//    7   14:aload_0         
	//    8   15:getfield        #22  <Field MainActivity d>
	//    9   18:invokestatic    #44  <Method cn MainActivity.f(MainActivity)>
	//   10   21:aload_0         
	//   11   22:getfield        #26  <Field ck b>
	//   12   25:aload_0         
	//   13   26:getfield        #22  <Field MainActivity d>
	//   14   29:invokevirtual   #49  <Method void cn.b(ck, android.content.Context)>
		} else
	//*  15   32:return          
		{
			if(((Object) (a[i])).equals("View in play store"))
	//*  16   33:aload_0         
	//*  17   34:getfield        #24  <Field CharSequence[] a>
	//*  18   37:iload_2         
	//*  19   38:aaload          
	//*  20   39:ldc1            #51  <String "View in play store">
	//*  21   41:invokevirtual   #40  <Method boolean Object.equals(Object)>
	//*  22   44:ifeq            66
			{
				MainActivity.f(d).a(b, ((android.content.Context) (d)));
	//   23   47:aload_0         
	//   24   48:getfield        #22  <Field MainActivity d>
	//   25   51:invokestatic    #44  <Method cn MainActivity.f(MainActivity)>
	//   26   54:aload_0         
	//   27   55:getfield        #26  <Field ck b>
	//   28   58:aload_0         
	//   29   59:getfield        #22  <Field MainActivity d>
	//   30   62:invokevirtual   #53  <Method void cn.a(ck, android.content.Context)>
				return;
	//   31   65:return          
			}
			if(((Object) (a[i])).equals(((Object) (d.getResources().getString(0x7f0d005c)))))
	//*  32   66:aload_0         
	//*  33   67:getfield        #24  <Field CharSequence[] a>
	//*  34   70:iload_2         
	//*  35   71:aaload          
	//*  36   72:aload_0         
	//*  37   73:getfield        #22  <Field MainActivity d>
	//*  38   76:invokevirtual   #57  <Method Resources MainActivity.getResources()>
	//*  39   79:ldc1            #58  <Int 0x7f0d005c>
	//*  40   81:invokevirtual   #64  <Method String Resources.getString(int)>
	//*  41   84:invokevirtual   #40  <Method boolean Object.equals(Object)>
	//*  42   87:ifeq            121
			{
				dialoginterface = ((DialogInterface) (new ArrayList()));
	//   43   90:new             #66  <Class ArrayList>
	//   44   93:dup             
	//   45   94:invokespecial   #67  <Method void ArrayList()>
	//   46   97:astore_1        
				((ArrayList) (dialoginterface)).add(((Object) (Integer.valueOf(c))));
	//   47   98:aload_1         
	//   48   99:aload_0         
	//   49  100:getfield        #28  <Field int c>
	//   50  103:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   51  106:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   52  109:pop             
				MainActivity.a(d, 1, ((ArrayList) (dialoginterface)), true);
	//   53  110:aload_0         
	//   54  111:getfield        #22  <Field MainActivity d>
	//   55  114:iconst_1        
	//   56  115:aload_1         
	//   57  116:iconst_1        
	//   58  117:invokestatic    #79  <Method void MainActivity.a(MainActivity, int, ArrayList, boolean)>
				return;
	//   59  120:return          
			}
			if(((Object) (a[i])).equals(((Object) (d.getResources().getString(0x7f0d005b)))))
	//*  60  121:aload_0         
	//*  61  122:getfield        #24  <Field CharSequence[] a>
	//*  62  125:iload_2         
	//*  63  126:aaload          
	//*  64  127:aload_0         
	//*  65  128:getfield        #22  <Field MainActivity d>
	//*  66  131:invokevirtual   #57  <Method Resources MainActivity.getResources()>
	//*  67  134:ldc1            #80  <Int 0x7f0d005b>
	//*  68  136:invokevirtual   #64  <Method String Resources.getString(int)>
	//*  69  139:invokevirtual   #40  <Method boolean Object.equals(Object)>
	//*  70  142:ifeq            32
			{
				MainActivity.f(d).a(((android.content.Context) (d)), MainActivity.a(d).a(c).e());
	//   71  145:aload_0         
	//   72  146:getfield        #22  <Field MainActivity d>
	//   73  149:invokestatic    #44  <Method cn MainActivity.f(MainActivity)>
	//   74  152:aload_0         
	//   75  153:getfield        #22  <Field MainActivity d>
	//   76  156:aload_0         
	//   77  157:getfield        #22  <Field MainActivity d>
	//   78  160:invokestatic    #83  <Method bv MainActivity.a(MainActivity)>
	//   79  163:aload_0         
	//   80  164:getfield        #28  <Field int c>
	//   81  167:invokevirtual   #88  <Method ck bv.a(int)>
	//   82  170:invokevirtual   #94  <Method String ck.e()>
	//   83  173:invokevirtual   #97  <Method void cn.a(android.content.Context, String)>
				return;
	//   84  176:return          
			}
		}
	}

	final CharSequence a[];
	final ck b;
	final int c;
	final MainActivity d;

	MainActivity$6(MainActivity mainactivity, CharSequence acharsequence[], ck ck1, int i)
	{
		d = mainactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field MainActivity d>
		a = acharsequence;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field CharSequence[] a>
		b = ck1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field ck b>
		c = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #28  <Field int c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
