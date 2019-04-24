// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.content.res.*;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class CustomButton extends Button
{

	public CustomButton(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void Button(Context)>
		a(context, ((AttributeSet) (null)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokespecial   #13  <Method void a(Context, AttributeSet)>
	//    7   11:return          
	}

	public CustomButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void Button(Context, AttributeSet)>
		a(context, attributeset);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokespecial   #13  <Method void a(Context, AttributeSet)>
	//    8   12:return          
	}

	public CustomButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #19  <Method void Button(Context, AttributeSet, int)>
		a(context, attributeset);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokespecial   #13  <Method void a(Context, AttributeSet)>
	//    9   13:return          
	}

	private void a(Context context, AttributeSet attributeset)
	{
		String s;
		TypedArray typedarray;
		s = "";
	//    0    0:ldc1            #21  <String "">
	//    1    2:astore          6
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_44;
	//    2    4:aload_2         
	//    3    5:ifnull          44
		typedarray = context.obtainStyledAttributes(attributeset, com.irobot.home.g.a.irobotAttributes, 0, 0);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:getstatic       #27  <Field int[] com.irobot.home.g$a.irobotAttributes>
	//    7   13:iconst_0        
	//    8   14:iconst_0        
	//    9   15:invokevirtual   #33  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   18:astore          7
		s = typedarray.getString(0);
	//   11   20:aload           7
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #39  <Method String TypedArray.getString(int)>
	//   14   26:astore          6
		typedarray.recycle();
	//   15   28:aload           7
	//   16   30:invokevirtual   #43  <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_44;
	//   17   33:goto            44
		context;
	//   18   36:astore_1        
		typedarray.recycle();
	//   19   37:aload           7
	//   20   39:invokevirtual   #43  <Method void TypedArray.recycle()>
		throw context;
	//   21   42:aload_1         
	//   22   43:athrow          
		if(!isInEditMode())
	//*  23   44:aload_0         
	//*  24   45:invokevirtual   #47  <Method boolean isInEditMode()>
	//*  25   48:ifne            177
		{
			int j = attributeset.getAttributeCount();
	//   26   51:aload_2         
	//   27   52:invokeinterface #53  <Method int AttributeSet.getAttributeCount()>
	//   28   57:istore          4
			int i = 0;
	//   29   59:iconst_0        
	//   30   60:istore_3        
			boolean flag = false;
	//   31   61:iconst_0        
	//   32   62:istore          5
			for(; i < j; i++)
	//*  33   64:iload_3         
	//*  34   65:iload           4
	//*  35   67:icmpge          102
				if(attributeset.getAttributeName(i).equals("textAllCaps"))
	//*  36   70:aload_2         
	//*  37   71:iload_3         
	//*  38   72:invokeinterface #56  <Method String AttributeSet.getAttributeName(int)>
	//*  39   77:ldc1            #58  <String "textAllCaps">
	//*  40   79:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  41   82:ifeq            95
					flag = attributeset.getAttributeBooleanValue(i, false);
	//   42   85:aload_2         
	//   43   86:iload_3         
	//   44   87:iconst_0        
	//   45   88:invokeinterface #68  <Method boolean AttributeSet.getAttributeBooleanValue(int, boolean)>
	//   46   93:istore          5

	//   47   95:iload_3         
	//   48   96:iconst_1        
	//   49   97:iadd            
	//   50   98:istore_3        
	//*  51   99:goto            64
			if(flag)
	//*  52  102:iload           5
	//*  53  104:ifeq            138
			{
				attributeset = ((AttributeSet) (context.getResources().getConfiguration().locale));
	//   54  107:aload_1         
	//   55  108:invokevirtual   #72  <Method Resources Context.getResources()>
	//   56  111:invokevirtual   #78  <Method Configuration Resources.getConfiguration()>
	//   57  114:getfield        #84  <Field java.util.Locale Configuration.locale>
	//   58  117:astore_2        
				setText(((CharSequence) (getText().toString().toUpperCase(((java.util.Locale) (attributeset))))));
	//   59  118:aload_0         
	//   60  119:aload_0         
	//   61  120:invokevirtual   #88  <Method CharSequence getText()>
	//   62  123:invokeinterface #94  <Method String CharSequence.toString()>
	//   63  128:aload_2         
	//   64  129:invokevirtual   #98  <Method String String.toUpperCase(java.util.Locale)>
	//   65  132:invokevirtual   #102 <Method void setText(CharSequence)>
			} else
	//*  66  135:goto            143
			{
				setTransformationMethod(((android.text.method.TransformationMethod) (null)));
	//   67  138:aload_0         
	//   68  139:aconst_null     
	//   69  140:invokevirtual   #106 <Method void setTransformationMethod(android.text.method.TransformationMethod)>
			}
			if(s != null && !s.equals(""))
	//*  70  143:aload           6
	//*  71  145:ifnull          164
	//*  72  148:aload           6
	//*  73  150:ldc1            #21  <String "">
	//*  74  152:invokevirtual   #64  <Method boolean String.equals(Object)>
	//*  75  155:ifne            164
				a = s;
	//   76  158:aload_0         
	//   77  159:aload           6
	//   78  161:putfield        #108 <Field String a>
			setTypeface(Typeface.createFromAsset(context.getAssets(), s));
	//   79  164:aload_0         
	//   80  165:aload_1         
	//   81  166:invokevirtual   #112 <Method android.content.res.AssetManager Context.getAssets()>
	//   82  169:aload           6
	//   83  171:invokestatic    #118 <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
	//   84  174:invokevirtual   #122 <Method void setTypeface(Typeface)>
		}
		return;
	//   85  177:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #126 <Method void Button.setTextAppearance(Context, int)>
		if(a != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #108 <Field String a>
	//*   6   10:ifnull          28
			setTypeface(Typeface.createFromAsset(context.getAssets(), a));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #112 <Method android.content.res.AssetManager Context.getAssets()>
	//   10   18:aload_0         
	//   11   19:getfield        #108 <Field String a>
	//   12   22:invokestatic    #118 <Method Typeface Typeface.createFromAsset(android.content.res.AssetManager, String)>
	//   13   25:invokevirtual   #122 <Method void setTypeface(Typeface)>
	//   14   28:return          
	}

	private String a;
}
