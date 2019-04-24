// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.irobot.home.b.an;
import com.irobot.home.model.TroubleshootingItem;
import com.irobot.home.util.o;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, ContactTableViewActivity_

public class TroubleshootingSetup1Activity extends BaseFragmentActivity
{

	public TroubleshootingSetup1Activity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	protected void e()
	{
		b(0x7f0f08f5);
	//    0    0:aload_0         
	//    1    1:ldc1            #22  <Int 0x7f0f08f5>
	//    2    3:invokevirtual   #25  <Method void b(int)>
		((TextView)e.findViewById(0x7f09019d)).setText(0x7f0f0074);
	//    3    6:aload_0         
	//    4    7:getfield        #27  <Field View e>
	//    5   10:ldc1            #28  <Int 0x7f09019d>
	//    6   12:invokevirtual   #34  <Method View View.findViewById(int)>
	//    7   15:checkcast       #36  <Class TextView>
	//    8   18:ldc1            #37  <Int 0x7f0f0074>
	//    9   20:invokevirtual   #40  <Method void TextView.setText(int)>
		h();
	//   10   23:aload_0         
	//   11   24:invokevirtual   #43  <Method void h()>
	//   12   27:return          
	}

	public void f()
	{
		ContactTableViewActivity_.a(((android.content.Context) (this))).b(a).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #48  <Method ContactTableViewActivity_$a ContactTableViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field String a>
	//    4    8:invokevirtual   #55  <Method ContactTableViewActivity_$a ContactTableViewActivity_$a.b(String)>
	//    5   11:invokevirtual   #58  <Method org.androidannotations.api.a.e ContactTableViewActivity_$a.a()>
	//    6   14:pop             
	//    7   15:return          
	}

	public void g()
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field ArrayList f>
	//*   2    4:ifnull          30
		{
			an an1 = new an(((android.content.Context) (this)), 0x7f0b0156, ((java.util.List) (f)));
	//    3    7:new             #63  <Class an>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:ldc1            #64  <Int 0x7f0b0156>
	//    7   14:aload_0         
	//    8   15:getfield        #61  <Field ArrayList f>
	//    9   18:invokespecial   #67  <Method void an(android.content.Context, int, java.util.List)>
	//   10   21:astore_1        
			d.setAdapter(((android.widget.ListAdapter) (an1)));
	//   11   22:aload_0         
	//   12   23:getfield        #69  <Field ListView d>
	//   13   26:aload_1         
	//   14   27:invokevirtual   #75  <Method void ListView.setAdapter(android.widget.ListAdapter)>
		}
	//   15   30:return          
	}

	public void h()
	{
		f = new ArrayList();
	//    0    0:aload_0         
	//    1    1:new             #77  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #78  <Method void ArrayList()>
	//    4    8:putfield        #61  <Field ArrayList f>
		CharSequence acharsequence[] = getResources().getTextArray(b);
	//    5   11:aload_0         
	//    6   12:invokevirtual   #82  <Method Resources getResources()>
	//    7   15:aload_0         
	//    8   16:getfield        #84  <Field int b>
	//    9   19:invokevirtual   #90  <Method CharSequence[] Resources.getTextArray(int)>
	//   10   22:astore_3        
		CharSequence acharsequence1[] = getResources().getTextArray(c);
	//   11   23:aload_0         
	//   12   24:invokevirtual   #82  <Method Resources getResources()>
	//   13   27:aload_0         
	//   14   28:getfield        #92  <Field int c>
	//   15   31:invokevirtual   #90  <Method CharSequence[] Resources.getTextArray(int)>
	//   16   34:astore          4
		if(acharsequence.length != acharsequence1.length)
	//*  17   36:aload_3         
	//*  18   37:arraylength     
	//*  19   38:aload           4
	//*  20   40:arraylength     
	//*  21   41:icmpeq          51
			o.e("Troubleshooting1", "Number of troubleshooting topics and answers do not match!");
	//   22   44:ldc1            #94  <String "Troubleshooting1">
	//   23   46:ldc1            #96  <String "Number of troubleshooting topics and answers do not match!">
	//   24   48:invokestatic    #101 <Method void o.e(String, String)>
		int j = Math.min(acharsequence.length, acharsequence1.length);
	//   25   51:aload_3         
	//   26   52:arraylength     
	//   27   53:aload           4
	//   28   55:arraylength     
	//   29   56:invokestatic    #107 <Method int Math.min(int, int)>
	//   30   59:istore_2        
		for(int i = 0; i < j; i++)
	//*  31   60:iconst_0        
	//*  32   61:istore_1        
	//*  33   62:iload_1         
	//*  34   63:iload_2         
	//*  35   64:icmpge          106
			f.add(((Object) (new TroubleshootingItem(acharsequence[i].toString(), acharsequence1[i].toString()))));
	//   36   67:aload_0         
	//   37   68:getfield        #61  <Field ArrayList f>
	//   38   71:new             #109 <Class TroubleshootingItem>
	//   39   74:dup             
	//   40   75:aload_3         
	//   41   76:iload_1         
	//   42   77:aaload          
	//   43   78:invokeinterface #115 <Method String CharSequence.toString()>
	//   44   83:aload           4
	//   45   85:iload_1         
	//   46   86:aaload          
	//   47   87:invokeinterface #115 <Method String CharSequence.toString()>
	//   48   92:invokespecial   #117 <Method void TroubleshootingItem(String, String)>
	//   49   95:invokevirtual   #121 <Method boolean ArrayList.add(Object)>
	//   50   98:pop             

	//   51   99:iload_1         
	//   52  100:iconst_1        
	//   53  101:iadd            
	//   54  102:istore_1        
	//*  55  103:goto            62
		g();
	//   56  106:aload_0         
	//   57  107:invokevirtual   #123 <Method void g()>
	//   58  110:return          
	}

	String a;
	int b;
	int c;
	ListView d;
	View e;
	private ArrayList f;
}
