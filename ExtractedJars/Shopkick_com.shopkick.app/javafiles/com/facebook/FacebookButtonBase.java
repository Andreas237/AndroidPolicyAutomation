// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FragmentWrapper;

// Referenced classes of package com.facebook:
//			FacebookException

public abstract class FacebookButtonBase extends Button
{

	protected FacebookButtonBase(Context context, AttributeSet attributeset, int i, int j, String s, String s1)
	{
		super(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #24  <Method void Button(Context, AttributeSet, int)>
		int k = j;
	//    5    7:iload           4
	//    6    9:istore          7
		if(j == 0)
	//*   7   11:iload           4
	//*   8   13:ifne            22
			k = getDefaultStyleResource();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #28  <Method int getDefaultStyleResource()>
	//   11   20:istore          7
		j = k;
	//   12   22:iload           7
	//   13   24:istore          4
		if(k == 0)
	//*  14   26:iload           7
	//*  15   28:ifne            36
			j = com.facebook.common.R.style.com_facebook_button;
	//   16   31:getstatic       #33  <Field int com.facebook.common.R$style.com_facebook_button>
	//   17   34:istore          4
		configureButton(context, attributeset, i, j);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:iload_3         
	//   22   40:iload           4
	//   23   42:invokevirtual   #37  <Method void configureButton(Context, AttributeSet, int, int)>
		analyticsButtonCreatedEventName = s;
	//   24   45:aload_0         
	//   25   46:aload           5
	//   26   48:putfield        #39  <Field String analyticsButtonCreatedEventName>
		analyticsButtonTappedEventName = s1;
	//   27   51:aload_0         
	//   28   52:aload           6
	//   29   54:putfield        #41  <Field String analyticsButtonTappedEventName>
		setClickable(true);
	//   30   57:aload_0         
	//   31   58:iconst_1        
	//   32   59:invokevirtual   #45  <Method void setClickable(boolean)>
		setFocusable(true);
	//   33   62:aload_0         
	//   34   63:iconst_1        
	//   35   64:invokevirtual   #48  <Method void setFocusable(boolean)>
	//   36   67:return          
	}

	private void logButtonCreated(Context context)
	{
		AppEventsLogger.newLogger(context).logSdkEvent(analyticsButtonCreatedEventName, ((Double) (null)), ((android.os.Bundle) (null)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #69  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field String analyticsButtonCreatedEventName>
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #73  <Method void AppEventsLogger.logSdkEvent(String, Double, android.os.Bundle)>
	//    7   13:return          
	}

	private void logButtonTapped(Context context)
	{
		AppEventsLogger.newLogger(context).logSdkEvent(analyticsButtonTappedEventName, ((Double) (null)), ((android.os.Bundle) (null)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #69  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field String analyticsButtonTappedEventName>
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #73  <Method void AppEventsLogger.logSdkEvent(String, Double, android.os.Bundle)>
	//    7   13:return          
	}

	private void parseBackgroundAttributes(Context context, AttributeSet attributeset, int i, int j)
	{
		if(isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #78  <Method boolean isInEditMode()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		attributeset = ((AttributeSet) (context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x10100d4
		}, i, j)));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #84  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:newarray        int[]
	//    9   16:dup             
	//   10   17:iconst_0        
	//   11   18:ldc1            #85  <Int 0x10100d4>
	//   12   20:iastore         
	//   13   21:iload_3         
	//   14   22:iload           4
	//   15   24:invokevirtual   #91  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   16   27:astore_2        
		if(!((TypedArray) (attributeset)).hasValue(0))
			break MISSING_BLOCK_LABEL_68;
	//   17   28:aload_2         
	//   18   29:iconst_0        
	//   19   30:invokevirtual   #97  <Method boolean TypedArray.hasValue(int)>
	//   20   33:ifeq            68
		i = ((TypedArray) (attributeset)).getResourceId(0, 0);
	//   21   36:aload_2         
	//   22   37:iconst_0        
	//   23   38:iconst_0        
	//   24   39:invokevirtual   #101 <Method int TypedArray.getResourceId(int, int)>
	//   25   42:istore_3        
		if(i == 0)
			break MISSING_BLOCK_LABEL_55;
	//   26   43:iload_3         
	//   27   44:ifeq            55
		setBackgroundResource(i);
	//   28   47:aload_0         
	//   29   48:iload_3         
	//   30   49:invokevirtual   #105 <Method void setBackgroundResource(int)>
		break MISSING_BLOCK_LABEL_79;
	//   31   52:goto            79
		setBackgroundColor(((TypedArray) (attributeset)).getColor(0, 0));
	//   32   55:aload_0         
	//   33   56:aload_2         
	//   34   57:iconst_0        
	//   35   58:iconst_0        
	//   36   59:invokevirtual   #108 <Method int TypedArray.getColor(int, int)>
	//   37   62:invokevirtual   #111 <Method void setBackgroundColor(int)>
		break MISSING_BLOCK_LABEL_79;
	//   38   65:goto            79
		setBackgroundColor(ContextCompat.getColor(context, com.facebook.common.R.color.com_facebook_blue));
	//   39   68:aload_0         
	//   40   69:aload_1         
	//   41   70:getstatic       #116 <Field int com.facebook.common.R$color.com_facebook_blue>
	//   42   73:invokestatic    #121 <Method int ContextCompat.getColor(Context, int)>
	//   43   76:invokevirtual   #111 <Method void setBackgroundColor(int)>
		((TypedArray) (attributeset)).recycle();
	//   44   79:aload_2         
	//   45   80:invokevirtual   #125 <Method void TypedArray.recycle()>
		return;
	//   46   83:return          
		context;
	//   47   84:astore_1        
		((TypedArray) (attributeset)).recycle();
	//   48   85:aload_2         
	//   49   86:invokevirtual   #125 <Method void TypedArray.recycle()>
		throw context;
	//   50   89:aload_1         
	//   51   90:athrow          
	}

	private void parseCompoundDrawableAttributes(Context context, AttributeSet attributeset, int i, int j)
	{
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x101016f, 0x101016d, 0x1010170, 0x101016e, 0x1010171
		}, i, j)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #84  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:iconst_5        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #130 <Int 0x101016f>
	//    8   12:iastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:ldc1            #131 <Int 0x101016d>
	//   12   17:iastore         
	//   13   18:dup             
	//   14   19:iconst_2        
	//   15   20:ldc1            #132 <Int 0x1010170>
	//   16   22:iastore         
	//   17   23:dup             
	//   18   24:iconst_3        
	//   19   25:ldc1            #133 <Int 0x101016e>
	//   20   27:iastore         
	//   21   28:dup             
	//   22   29:iconst_4        
	//   23   30:ldc1            #134 <Int 0x1010171>
	//   24   32:iastore         
	//   25   33:iload_3         
	//   26   34:iload           4
	//   27   36:invokevirtual   #91  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   28   39:astore_1        
		setCompoundDrawablesWithIntrinsicBounds(((TypedArray) (context)).getResourceId(0, 0), ((TypedArray) (context)).getResourceId(1, 0), ((TypedArray) (context)).getResourceId(2, 0), ((TypedArray) (context)).getResourceId(3, 0));
	//   29   40:aload_0         
	//   30   41:aload_1         
	//   31   42:iconst_0        
	//   32   43:iconst_0        
	//   33   44:invokevirtual   #101 <Method int TypedArray.getResourceId(int, int)>
	//   34   47:aload_1         
	//   35   48:iconst_1        
	//   36   49:iconst_0        
	//   37   50:invokevirtual   #101 <Method int TypedArray.getResourceId(int, int)>
	//   38   53:aload_1         
	//   39   54:iconst_2        
	//   40   55:iconst_0        
	//   41   56:invokevirtual   #101 <Method int TypedArray.getResourceId(int, int)>
	//   42   59:aload_1         
	//   43   60:iconst_3        
	//   44   61:iconst_0        
	//   45   62:invokevirtual   #101 <Method int TypedArray.getResourceId(int, int)>
	//   46   65:invokevirtual   #138 <Method void setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
		setCompoundDrawablePadding(((TypedArray) (context)).getDimensionPixelSize(4, 0));
	//   47   68:aload_0         
	//   48   69:aload_1         
	//   49   70:iconst_4        
	//   50   71:iconst_0        
	//   51   72:invokevirtual   #141 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   52   75:invokevirtual   #144 <Method void setCompoundDrawablePadding(int)>
		((TypedArray) (context)).recycle();
	//   53   78:aload_1         
	//   54   79:invokevirtual   #125 <Method void TypedArray.recycle()>
		return;
	//   55   82:return          
		attributeset;
	//   56   83:astore_2        
		((TypedArray) (context)).recycle();
	//   57   84:aload_1         
	//   58   85:invokevirtual   #125 <Method void TypedArray.recycle()>
		throw attributeset;
	//   59   88:aload_2         
	//   60   89:athrow          
	}

	private void parseContentAttributes(Context context, AttributeSet attributeset, int i, int j)
	{
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x10100d6, 0x10100d7, 0x10100d8, 0x10100d9
		}, i, j)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #84  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:iconst_4        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #147 <Int 0x10100d6>
	//    8   12:iastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:ldc1            #148 <Int 0x10100d7>
	//   12   17:iastore         
	//   13   18:dup             
	//   14   19:iconst_2        
	//   15   20:ldc1            #149 <Int 0x10100d8>
	//   16   22:iastore         
	//   17   23:dup             
	//   18   24:iconst_3        
	//   19   25:ldc1            #150 <Int 0x10100d9>
	//   20   27:iastore         
	//   21   28:iload_3         
	//   22   29:iload           4
	//   23   31:invokevirtual   #91  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   24   34:astore_1        
		setPadding(((TypedArray) (context)).getDimensionPixelSize(0, 0), ((TypedArray) (context)).getDimensionPixelSize(1, 0), ((TypedArray) (context)).getDimensionPixelSize(2, 0), ((TypedArray) (context)).getDimensionPixelSize(3, 0));
	//   25   35:aload_0         
	//   26   36:aload_1         
	//   27   37:iconst_0        
	//   28   38:iconst_0        
	//   29   39:invokevirtual   #141 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   30   42:aload_1         
	//   31   43:iconst_1        
	//   32   44:iconst_0        
	//   33   45:invokevirtual   #141 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   34   48:aload_1         
	//   35   49:iconst_2        
	//   36   50:iconst_0        
	//   37   51:invokevirtual   #141 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   38   54:aload_1         
	//   39   55:iconst_3        
	//   40   56:iconst_0        
	//   41   57:invokevirtual   #141 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   42   60:invokevirtual   #153 <Method void setPadding(int, int, int, int)>
		((TypedArray) (context)).recycle();
	//   43   63:aload_1         
	//   44   64:invokevirtual   #125 <Method void TypedArray.recycle()>
		return;
	//   45   67:return          
		attributeset;
	//   46   68:astore_2        
		((TypedArray) (context)).recycle();
	//   47   69:aload_1         
	//   48   70:invokevirtual   #125 <Method void TypedArray.recycle()>
		throw attributeset;
	//   49   73:aload_2         
	//   50   74:athrow          
	}

	private void parseTextAttributes(Context context, AttributeSet attributeset, int i, int j)
	{
		TypedArray typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x1010098
		}, i, j);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #84  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:iconst_1        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #155 <Int 0x1010098>
	//    8   12:iastore         
	//    9   13:iload_3         
	//   10   14:iload           4
	//   11   16:invokevirtual   #91  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   12   19:astore          5
		setTextColor(typedarray.getColorStateList(0));
	//   13   21:aload_0         
	//   14   22:aload           5
	//   15   24:iconst_0        
	//   16   25:invokevirtual   #159 <Method android.content.res.ColorStateList TypedArray.getColorStateList(int)>
	//   17   28:invokevirtual   #163 <Method void setTextColor(android.content.res.ColorStateList)>
		typedarray.recycle();
	//   18   31:aload           5
	//   19   33:invokevirtual   #125 <Method void TypedArray.recycle()>
		typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x10100af
		}, i, j);
	//   20   36:aload_1         
	//   21   37:invokevirtual   #84  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   22   40:aload_2         
	//   23   41:iconst_1        
	//   24   42:newarray        int[]
	//   25   44:dup             
	//   26   45:iconst_0        
	//   27   46:ldc1            #164 <Int 0x10100af>
	//   28   48:iastore         
	//   29   49:iload_3         
	//   30   50:iload           4
	//   31   52:invokevirtual   #91  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   32   55:astore          5
		setGravity(typedarray.getInt(0, 17));
	//   33   57:aload_0         
	//   34   58:aload           5
	//   35   60:iconst_0        
	//   36   61:bipush          17
	//   37   63:invokevirtual   #167 <Method int TypedArray.getInt(int, int)>
	//   38   66:invokevirtual   #170 <Method void setGravity(int)>
		typedarray.recycle();
	//   39   69:aload           5
	//   40   71:invokevirtual   #125 <Method void TypedArray.recycle()>
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x1010095, 0x1010097, 0x101014f
		}, i, j)));
	//   41   74:aload_1         
	//   42   75:invokevirtual   #84  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   43   78:aload_2         
	//   44   79:iconst_3        
	//   45   80:newarray        int[]
	//   46   82:dup             
	//   47   83:iconst_0        
	//   48   84:ldc1            #171 <Int 0x1010095>
	//   49   86:iastore         
	//   50   87:dup             
	//   51   88:iconst_1        
	//   52   89:ldc1            #172 <Int 0x1010097>
	//   53   91:iastore         
	//   54   92:dup             
	//   55   93:iconst_2        
	//   56   94:ldc1            #173 <Int 0x101014f>
	//   57   96:iastore         
	//   58   97:iload_3         
	//   59   98:iload           4
	//   60  100:invokevirtual   #91  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   61  103:astore_1        
		setTextSize(0, ((TypedArray) (context)).getDimensionPixelSize(0, 0));
	//   62  104:aload_0         
	//   63  105:iconst_0        
	//   64  106:aload_1         
	//   65  107:iconst_0        
	//   66  108:iconst_0        
	//   67  109:invokevirtual   #141 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   68  112:i2f             
	//   69  113:invokevirtual   #177 <Method void setTextSize(int, float)>
		setTypeface(Typeface.defaultFromStyle(((TypedArray) (context)).getInt(1, 1)));
	//   70  116:aload_0         
	//   71  117:aload_1         
	//   72  118:iconst_1        
	//   73  119:iconst_1        
	//   74  120:invokevirtual   #167 <Method int TypedArray.getInt(int, int)>
	//   75  123:invokestatic    #183 <Method Typeface Typeface.defaultFromStyle(int)>
	//   76  126:invokevirtual   #187 <Method void setTypeface(Typeface)>
		setText(((CharSequence) (((TypedArray) (context)).getString(2))));
	//   77  129:aload_0         
	//   78  130:aload_1         
	//   79  131:iconst_2        
	//   80  132:invokevirtual   #191 <Method String TypedArray.getString(int)>
	//   81  135:invokevirtual   #195 <Method void setText(CharSequence)>
		((TypedArray) (context)).recycle();
	//   82  138:aload_1         
	//   83  139:invokevirtual   #125 <Method void TypedArray.recycle()>
		return;
	//   84  142:return          
		attributeset;
	//   85  143:astore_2        
		((TypedArray) (context)).recycle();
	//   86  144:aload_1         
	//   87  145:invokevirtual   #125 <Method void TypedArray.recycle()>
		throw attributeset;
	//   88  148:aload_2         
	//   89  149:athrow          
		context;
	//   90  150:astore_1        
		typedarray.recycle();
	//   91  151:aload           5
	//   92  153:invokevirtual   #125 <Method void TypedArray.recycle()>
		throw context;
	//   93  156:aload_1         
	//   94  157:athrow          
		context;
	//   95  158:astore_1        
		typedarray.recycle();
	//   96  159:aload           5
	//   97  161:invokevirtual   #125 <Method void TypedArray.recycle()>
		throw context;
	//   98  164:aload_1         
	//   99  165:athrow          
	}

	private void setupOnClickListener()
	{
		super.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				FacebookButtonBase facebookbuttonbase = FacebookButtonBase.this;
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FacebookButtonBase this$0>
			//    2    4:astore_2        
				facebookbuttonbase.logButtonTapped(facebookbuttonbase.getContext());
			//    3    5:aload_2         
			//    4    6:aload_2         
			//    5    7:invokevirtual   #26  <Method Context FacebookButtonBase.getContext()>
			//    6   10:invokestatic    #30  <Method void FacebookButtonBase.access$000(FacebookButtonBase, Context)>
				if(internalOnClickListener != null)
			//*   7   13:aload_0         
			//*   8   14:getfield        #17  <Field FacebookButtonBase this$0>
			//*   9   17:invokestatic    #34  <Method android.view.View$OnClickListener FacebookButtonBase.access$100(FacebookButtonBase)>
			//*  10   20:ifnull          37
				{
					internalOnClickListener.onClick(view);
			//   11   23:aload_0         
			//   12   24:getfield        #17  <Field FacebookButtonBase this$0>
			//   13   27:invokestatic    #34  <Method android.view.View$OnClickListener FacebookButtonBase.access$100(FacebookButtonBase)>
			//   14   30:aload_1         
			//   15   31:invokeinterface #36  <Method void android.view.View$OnClickListener.onClick(View)>
					return;
			//   16   36:return          
				}
				if(externalOnClickListener != null)
			//*  17   37:aload_0         
			//*  18   38:getfield        #17  <Field FacebookButtonBase this$0>
			//*  19   41:invokestatic    #39  <Method android.view.View$OnClickListener FacebookButtonBase.access$200(FacebookButtonBase)>
			//*  20   44:ifnull          60
					externalOnClickListener.onClick(view);
			//   21   47:aload_0         
			//   22   48:getfield        #17  <Field FacebookButtonBase this$0>
			//   23   51:invokestatic    #39  <Method android.view.View$OnClickListener FacebookButtonBase.access$200(FacebookButtonBase)>
			//   24   54:aload_1         
			//   25   55:invokeinterface #36  <Method void android.view.View$OnClickListener.onClick(View)>
			//   26   60:return          
			}

			final FacebookButtonBase this$0;

			
			{
				this$0 = FacebookButtonBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FacebookButtonBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class FacebookButtonBase$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #199 <Method void FacebookButtonBase$1(FacebookButtonBase)>
	//    5    9:invokespecial   #203 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//    6   12:return          
	}

	protected void callExternalOnClickListener(View view)
	{
		android.view.View.OnClickListener onclicklistener = externalOnClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field android.view.View$OnClickListener externalOnClickListener>
	//    2    4:astore_2        
		if(onclicklistener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			onclicklistener.onClick(view);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #210 <Method void android.view.View$OnClickListener.onClick(View)>
	//    8   16:return          
	}

	protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
	{
		parseBackgroundAttributes(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #212 <Method void parseBackgroundAttributes(Context, AttributeSet, int, int)>
		parseCompoundDrawableAttributes(context, attributeset, i, j);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:iload_3         
	//   10   13:iload           4
	//   11   15:invokespecial   #214 <Method void parseCompoundDrawableAttributes(Context, AttributeSet, int, int)>
		parseContentAttributes(context, attributeset, i, j);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:aload_2         
	//   15   21:iload_3         
	//   16   22:iload           4
	//   17   24:invokespecial   #216 <Method void parseContentAttributes(Context, AttributeSet, int, int)>
		parseTextAttributes(context, attributeset, i, j);
	//   18   27:aload_0         
	//   19   28:aload_1         
	//   20   29:aload_2         
	//   21   30:iload_3         
	//   22   31:iload           4
	//   23   33:invokespecial   #218 <Method void parseTextAttributes(Context, AttributeSet, int, int)>
		setupOnClickListener();
	//   24   36:aload_0         
	//   25   37:invokespecial   #220 <Method void setupOnClickListener()>
	//   26   40:return          
	}

	protected Activity getActivity()
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #226 <Method Context getContext()>
	//    2    4:astore_2        
		boolean flag;
		do
		{
			flag = context instanceof Activity;
	//    3    5:aload_2         
	//    4    6:instanceof      #228 <Class Activity>
	//    5    9:istore_1        
			if(flag || !(context instanceof ContextWrapper))
				break;
	//    6   10:iload_1         
	//    7   11:ifne            32
	//    8   14:aload_2         
	//    9   15:instanceof      #230 <Class ContextWrapper>
	//   10   18:ifeq            32
			context = ((ContextWrapper)context).getBaseContext();
	//   11   21:aload_2         
	//   12   22:checkcast       #230 <Class ContextWrapper>
	//   13   25:invokevirtual   #233 <Method Context ContextWrapper.getBaseContext()>
	//   14   28:astore_2        
		} while(true);
	//   15   29:goto            5
		if(flag)
	//*  16   32:iload_1         
	//*  17   33:ifeq            41
			return (Activity)context;
	//   18   36:aload_2         
	//   19   37:checkcast       #228 <Class Activity>
	//   20   40:areturn         
		else
			throw new FacebookException("Unable to get Activity.");
	//   21   41:new             #235 <Class FacebookException>
	//   22   44:dup             
	//   23   45:ldc1            #237 <String "Unable to get Activity.">
	//   24   47:invokespecial   #240 <Method void FacebookException(String)>
	//   25   50:athrow          
	}

	public int getCompoundPaddingLeft()
	{
		if(overrideCompoundPadding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #243 <Field boolean overrideCompoundPadding>
	//*   2    4:ifeq            12
			return overrideCompoundPaddingLeft;
	//    3    7:aload_0         
	//    4    8:getfield        #245 <Field int overrideCompoundPaddingLeft>
	//    5   11:ireturn         
		else
			return super.getCompoundPaddingLeft();
	//    6   12:aload_0         
	//    7   13:invokespecial   #247 <Method int Button.getCompoundPaddingLeft()>
	//    8   16:ireturn         
	}

	public int getCompoundPaddingRight()
	{
		if(overrideCompoundPadding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #243 <Field boolean overrideCompoundPadding>
	//*   2    4:ifeq            12
			return overrideCompoundPaddingRight;
	//    3    7:aload_0         
	//    4    8:getfield        #250 <Field int overrideCompoundPaddingRight>
	//    5   11:ireturn         
		else
			return super.getCompoundPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokespecial   #252 <Method int Button.getCompoundPaddingRight()>
	//    8   16:ireturn         
	}

	protected abstract int getDefaultRequestCode();

	protected int getDefaultStyleResource()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Fragment getFragment()
	{
		FragmentWrapper fragmentwrapper = parentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field FragmentWrapper parentFragment>
	//    2    4:astore_1        
		if(fragmentwrapper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return fragmentwrapper.getSupportFragment();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #262 <Method Fragment FragmentWrapper.getSupportFragment()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public android.app.Fragment getNativeFragment()
	{
		FragmentWrapper fragmentwrapper = parentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field FragmentWrapper parentFragment>
	//    2    4:astore_1        
		if(fragmentwrapper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return fragmentwrapper.getNativeFragment();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #266 <Method android.app.Fragment FragmentWrapper.getNativeFragment()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public int getRequestCode()
	{
		return getDefaultRequestCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method int getDefaultRequestCode()>
	//    2    4:ireturn         
	}

	protected int measureTextWidth(String s)
	{
		return (int)Math.ceil(getPaint().measureText(s));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #275 <Method TextPaint getPaint()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #281 <Method float TextPaint.measureText(String)>
	//    4    8:f2d             
	//    5    9:invokestatic    #287 <Method double Math.ceil(double)>
	//    6   12:d2i             
	//    7   13:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #290 <Method void Button.onAttachedToWindow()>
		if(!isInEditMode())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #78  <Method boolean isInEditMode()>
	//*   4    8:ifne            19
			logButtonCreated(getContext());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #226 <Method Context getContext()>
	//    8   16:invokespecial   #292 <Method void logButtonCreated(Context)>
	//    9   19:return          
	}

	protected void onDraw(Canvas canvas)
	{
		boolean flag;
		if((getGravity() & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #297 <Method int getGravity()>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:ifeq            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(flag)
	//*  10   16:iload_2         
	//*  11   17:ifeq            97
		{
			int i = getCompoundPaddingLeft();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #298 <Method int getCompoundPaddingLeft()>
	//   14   24:istore_2        
			int j = getCompoundPaddingRight();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #299 <Method int getCompoundPaddingRight()>
	//   17   29:istore_3        
			int k = getCompoundDrawablePadding();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #302 <Method int getCompoundDrawablePadding()>
	//   20   34:istore          4
			k = Math.min((getWidth() - (k + i) - j - measureTextWidth(getText().toString())) / 2, (i - getPaddingLeft()) / 2);
	//   21   36:aload_0         
	//   22   37:invokevirtual   #305 <Method int getWidth()>
	//   23   40:iload           4
	//   24   42:iload_2         
	//   25   43:iadd            
	//   26   44:isub            
	//   27   45:iload_3         
	//   28   46:isub            
	//   29   47:aload_0         
	//   30   48:aload_0         
	//   31   49:invokevirtual   #309 <Method CharSequence getText()>
	//   32   52:invokeinterface #315 <Method String CharSequence.toString()>
	//   33   57:invokevirtual   #317 <Method int measureTextWidth(String)>
	//   34   60:isub            
	//   35   61:iconst_2        
	//   36   62:idiv            
	//   37   63:iload_2         
	//   38   64:aload_0         
	//   39   65:invokevirtual   #320 <Method int getPaddingLeft()>
	//   40   68:isub            
	//   41   69:iconst_2        
	//   42   70:idiv            
	//   43   71:invokestatic    #323 <Method int Math.min(int, int)>
	//   44   74:istore          4
			overrideCompoundPaddingLeft = i - k;
	//   45   76:aload_0         
	//   46   77:iload_2         
	//   47   78:iload           4
	//   48   80:isub            
	//   49   81:putfield        #245 <Field int overrideCompoundPaddingLeft>
			overrideCompoundPaddingRight = j + k;
	//   50   84:aload_0         
	//   51   85:iload_3         
	//   52   86:iload           4
	//   53   88:iadd            
	//   54   89:putfield        #250 <Field int overrideCompoundPaddingRight>
			overrideCompoundPadding = true;
	//   55   92:aload_0         
	//   56   93:iconst_1        
	//   57   94:putfield        #243 <Field boolean overrideCompoundPadding>
		}
		super.onDraw(canvas);
	//   58   97:aload_0         
	//   59   98:aload_1         
	//   60   99:invokespecial   #325 <Method void Button.onDraw(Canvas)>
		overrideCompoundPadding = false;
	//   61  102:aload_0         
	//   62  103:iconst_0        
	//   63  104:putfield        #243 <Field boolean overrideCompoundPadding>
	//   64  107:return          
	}

	public void setFragment(android.app.Fragment fragment)
	{
		parentFragment = new FragmentWrapper(fragment);
	//    0    0:aload_0         
	//    1    1:new             #259 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #329 <Method void FragmentWrapper(android.app.Fragment)>
	//    5    9:putfield        #257 <Field FragmentWrapper parentFragment>
	//    6   12:return          
	}

	public void setFragment(Fragment fragment)
	{
		parentFragment = new FragmentWrapper(fragment);
	//    0    0:aload_0         
	//    1    1:new             #259 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #332 <Method void FragmentWrapper(Fragment)>
	//    5    9:putfield        #257 <Field FragmentWrapper parentFragment>
	//    6   12:return          
	}

	protected void setInternalOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		internalOnClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field android.view.View$OnClickListener internalOnClickListener>
	//    3    5:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		externalOnClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field android.view.View$OnClickListener externalOnClickListener>
	//    3    5:return          
	}

	private String analyticsButtonCreatedEventName;
	private String analyticsButtonTappedEventName;
	private android.view.View.OnClickListener externalOnClickListener;
	private android.view.View.OnClickListener internalOnClickListener;
	private boolean overrideCompoundPadding;
	private int overrideCompoundPaddingLeft;
	private int overrideCompoundPaddingRight;
	private FragmentWrapper parentFragment;


/*
	static void access$000(FacebookButtonBase facebookbuttonbase, Context context)
	{
		facebookbuttonbase.logButtonTapped(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #55  <Method void logButtonTapped(Context)>
		return;
	//    3    5:return          
	}

*/


/*
	static android.view.View.OnClickListener access$100(FacebookButtonBase facebookbuttonbase)
	{
		return facebookbuttonbase.internalOnClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field android.view.View$OnClickListener internalOnClickListener>
	//    2    4:areturn         
	}

*/


/*
	static android.view.View.OnClickListener access$200(FacebookButtonBase facebookbuttonbase)
	{
		return facebookbuttonbase.externalOnClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field android.view.View$OnClickListener externalOnClickListener>
	//    2    4:areturn         
	}

*/
}
