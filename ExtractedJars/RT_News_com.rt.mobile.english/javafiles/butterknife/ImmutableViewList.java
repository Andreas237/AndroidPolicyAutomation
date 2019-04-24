// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;

import android.view.View;
import java.util.AbstractList;
import java.util.RandomAccess;

final class ImmutableViewList extends AbstractList
	implements RandomAccess
{

	ImmutableViewList(View aview[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void AbstractList()>
		views = aview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field View[] views>
	//    5    9:return          
	}

	public boolean contains(Object obj)
	{
		View aview[] = views;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field View[] views>
	//    2    4:astore          4
		int j = aview.length;
	//    3    6:aload           4
	//    4    8:arraylength     
	//    5    9:istore_3        
		for(int i = 0; i < j; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          34
			if(aview[i] == obj)
	//*  11   17:aload           4
	//*  12   19:iload_2         
	//*  13   20:aaload          
	//*  14   21:aload_1         
	//*  15   22:if_acmpne       27
				return true;
	//   16   25:iconst_1        
	//   17   26:ireturn         

	//   18   27:iload_2         
	//   19   28:iconst_1        
	//   20   29:iadd            
	//   21   30:istore_2        
	//*  22   31:goto            12
		return false;
	//   23   34:iconst_0        
	//   24   35:ireturn         
	}

	public View get(int i)
	{
		return views[i];
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field View[] views>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public volatile Object get(int i)
	{
		return ((Object) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method View get(int)>
	//    3    5:areturn         
	}

	public int size()
	{
		return views.length;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field View[] views>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	private final View views[];
}
