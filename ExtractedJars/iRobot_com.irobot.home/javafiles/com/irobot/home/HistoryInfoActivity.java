// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.LayoutInflater;
import android.widget.ListView;
import com.irobot.home.b.n;
import com.irobot.home.model.HistoryInfoItem;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.irobot.home:
//			BaseListActivity

public class HistoryInfoActivity extends BaseListActivity
{

	public HistoryInfoActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BaseListActivity()>
		d = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #17  <Method void ArrayList()>
	//    6   12:putfield        #19  <Field ArrayList d>
		e = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #16  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #17  <Method void ArrayList()>
	//   11   23:putfield        #21  <Field ArrayList e>
	//   12   26:return          
	}

	private void b()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #16  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < d.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #19  <Field ArrayList d>
	//*   9   15:invokevirtual   #27  <Method int ArrayList.size()>
	//*  10   18:icmpge          78
			((List) (arraylist)).add(((Object) (new HistoryInfoItem(getString(((Integer)d.get(i)).intValue()), getString(((Integer)e.get(i)).intValue())))));
	//   11   21:aload_2         
	//   12   22:new             #29  <Class HistoryInfoItem>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #19  <Field ArrayList d>
	//   17   31:iload_1         
	//   18   32:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #35  <Class Integer>
	//   20   38:invokevirtual   #38  <Method int Integer.intValue()>
	//   21   41:invokevirtual   #42  <Method String getString(int)>
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #21  <Field ArrayList e>
	//   25   49:iload_1         
	//   26   50:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   27   53:checkcast       #35  <Class Integer>
	//   28   56:invokevirtual   #38  <Method int Integer.intValue()>
	//   29   59:invokevirtual   #42  <Method String getString(int)>
	//   30   62:invokespecial   #45  <Method void HistoryInfoItem(String, String)>
	//   31   65:invokeinterface #51  <Method boolean List.add(Object)>
	//   32   70:pop             

	//   33   71:iload_1         
	//   34   72:iconst_1        
	//   35   73:iadd            
	//   36   74:istore_1        
	//*  37   75:goto            10
		setListAdapter(((android.widget.ListAdapter) (new n(((android.content.Context) (this)), ((List) (arraylist))))));
	//   38   78:aload_0         
	//   39   79:new             #53  <Class n>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:aload_2         
	//   43   85:invokespecial   #56  <Method void n(android.content.Context, List)>
	//   44   88:invokevirtual   #60  <Method void setListAdapter(android.widget.ListAdapter)>
	//   45   91:return          
	}

	void a()
	{
		b(0x7f0f0359);
	//    0    0:aload_0         
	//    1    1:ldc1            #62  <Int 0x7f0f0359>
	//    2    3:invokevirtual   #65  <Method void b(int)>
		b();
	//    3    6:aload_0         
	//    4    7:invokespecial   #67  <Method void b()>
		if(c)
	//*   5   10:aload_0         
	//*   6   11:getfield        #69  <Field boolean c>
	//*   7   14:ifeq            38
		{
			android.view.View view = getLayoutInflater().inflate(0x7f0b00e2, ((android.view.ViewGroup) (null)));
	//    8   17:aload_0         
	//    9   18:invokevirtual   #73  <Method LayoutInflater getLayoutInflater()>
	//   10   21:ldc1            #74  <Int 0x7f0b00e2>
	//   11   23:aconst_null     
	//   12   24:invokevirtual   #80  <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   13   27:astore_1        
			getListView().addHeaderView(view, ((Object) (null)), false);
	//   14   28:aload_0         
	//   15   29:invokevirtual   #84  <Method ListView getListView()>
	//   16   32:aload_1         
	//   17   33:aconst_null     
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #90  <Method void ListView.addHeaderView(android.view.View, Object, boolean)>
		}
	//   20   38:return          
	}

	boolean c;
	ArrayList d;
	ArrayList e;
}
