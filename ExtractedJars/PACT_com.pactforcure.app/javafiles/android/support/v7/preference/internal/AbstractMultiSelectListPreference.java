// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.preference.internal;

import android.content.Context;
import android.support.v7.preference.DialogPreference;
import android.util.AttributeSet;
import java.util.Set;

public abstract class AbstractMultiSelectListPreference extends DialogPreference
{

	public AbstractMultiSelectListPreference(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void DialogPreference(Context)>
	//    3    5:return          
	}

	public AbstractMultiSelectListPreference(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void DialogPreference(Context, AttributeSet)>
	//    4    6:return          
	}

	public AbstractMultiSelectListPreference(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #19  <Method void DialogPreference(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public AbstractMultiSelectListPreference(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #22  <Method void DialogPreference(Context, AttributeSet, int, int)>
	//    6    9:return          
	}

	public abstract CharSequence[] getEntries();

	public abstract CharSequence[] getEntryValues();

	public abstract Set getValues();

	public abstract void setValues(Set set);
}
