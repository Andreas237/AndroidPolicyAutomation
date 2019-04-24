// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.callmemaybe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package io.michaelrocks.callmemaybe:
//			FormatParameters, CallMeMaybe

public class PhoneEditText extends EditText
{

	public PhoneEditText(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void EditText(Context)>
		initialize(((AttributeSet) (null)), 0, 0);
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:invokespecial   #12  <Method void initialize(AttributeSet, int, int)>
	//    8   12:return          
	}

	public PhoneEditText(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void EditText(Context, AttributeSet)>
		initialize(attributeset, 0, 0);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:iconst_0        
	//    7    9:iconst_0        
	//    8   10:invokespecial   #12  <Method void initialize(AttributeSet, int, int)>
	//    9   13:return          
	}

	public PhoneEditText(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #19  <Method void EditText(Context, AttributeSet, int)>
		initialize(attributeset, i, 0);
	//    5    7:aload_0         
	//    6    8:aload_2         
	//    7    9:iload_3         
	//    8   10:iconst_0        
	//    9   11:invokespecial   #12  <Method void initialize(AttributeSet, int, int)>
	//   10   14:return          
	}

	public PhoneEditText(Context context, AttributeSet attributeset, int i, int j)
	{
		super(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #25  <Method void EditText(Context, AttributeSet, int, int)>
		initialize(attributeset, i, j);
	//    6    9:aload_0         
	//    7   10:aload_2         
	//    8   11:iload_3         
	//    9   12:iload           4
	//   10   14:invokespecial   #12  <Method void initialize(AttributeSet, int, int)>
	//   11   17:return          
	}

	private void initialize(AttributeSet attributeset, int i, int j)
	{
		attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, R.styleable.PhoneEditText, i, j)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method Context getContext()>
	//    2    4:aload_1         
	//    3    5:getstatic       #36  <Field int[] R$styleable.PhoneEditText>
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:invokevirtual   #42  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    7   13:astore_1        
		initializeFromTypedArray(((TypedArray) (attributeset)));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #46  <Method void initializeFromTypedArray(TypedArray)>
		((TypedArray) (attributeset)).recycle();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #52  <Method void TypedArray.recycle()>
	//   13   23:return          
	}

	private void initializeFromTypedArray(TypedArray typedarray)
	{
		CallMeMaybe.attachTo(((android.widget.TextView) (this)), FormatParameters.newBuilder().region(typedarray.getString(R.styleable.PhoneEditText_cmm_region)).build());
	//    0    0:aload_0         
	//    1    1:invokestatic    #58  <Method FormatParameters$Builder FormatParameters.newBuilder()>
	//    2    4:aload_1         
	//    3    5:getstatic       #62  <Field int R$styleable.PhoneEditText_cmm_region>
	//    4    8:invokevirtual   #66  <Method String TypedArray.getString(int)>
	//    5   11:invokevirtual   #72  <Method FormatParameters$Builder FormatParameters$Builder.region(String)>
	//    6   14:invokevirtual   #76  <Method FormatParameters FormatParameters$Builder.build()>
	//    7   17:invokestatic    #82  <Method void CallMeMaybe.attachTo(android.widget.TextView, FormatParameters)>
	//    8   20:return          
	}
}
