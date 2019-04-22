// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import java.util.Arrays;
import java.util.Set;

// Referenced classes of package android.arch.persistence.room:
//			InvalidationTracker

public static abstract class InvalidationTracker$Observer
{

	public abstract void onInvalidated(Set set);

	final String mTables[];

	protected transient InvalidationTracker$Observer(String s, String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mTables = (String[])Arrays.copyOf(((Object []) (as)), as.length + 1);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:arraylength     
	//    6    8:iconst_1        
	//    7    9:iadd            
	//    8   10:invokestatic    #21  <Method Object[] Arrays.copyOf(Object[], int)>
	//    9   13:checkcast       #22  <Class String[]>
	//   10   16:putfield        #24  <Field String[] mTables>
		mTables[as.length] = s;
	//   11   19:aload_0         
	//   12   20:getfield        #24  <Field String[] mTables>
	//   13   23:aload_2         
	//   14   24:arraylength     
	//   15   25:aload_1         
	//   16   26:aastore         
	//   17   27:return          
	}

	public InvalidationTracker$Observer(String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mTables = (String[])Arrays.copyOf(((Object []) (as)), as.length);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokestatic    #21  <Method Object[] Arrays.copyOf(Object[], int)>
	//    7   11:checkcast       #22  <Class String[]>
	//    8   14:putfield        #24  <Field String[] mTables>
	//    9   17:return          
	}
}
