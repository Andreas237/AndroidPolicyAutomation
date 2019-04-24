// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.widget.ArrayAdapter;

// Referenced classes of package android.support.v7.app:
//			AlertController

private static class AlertController$CheckedItemAdapter extends ArrayAdapter
{

	public long getItemId(int i)
	{
		return (long)i;
	//    0    0:iload_1         
	//    1    1:i2l             
	//    2    2:lreturn         
	}

	public boolean hasStableIds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public AlertController$CheckedItemAdapter(Context context, int i, int j, CharSequence acharsequence[])
	{
		super(context, i, j, ((Object []) (acharsequence)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #13  <Method void ArrayAdapter(Context, int, int, Object[])>
	//    6    9:return          
	}
}
