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
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.facebook.appevents.AppEventsLogger;

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
			j = R.style.com_facebook_button;
	//   16   31:getstatic       #33  <Field int R$style.com_facebook_button>
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
	//   30   57:return          
	}

	private void logButtonCreated(Context context)
	{
		AppEventsLogger.newLogger(context).logSdkEvent(analyticsButtonCreatedEventName, ((Double) (null)), ((android.os.Bundle) (null)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #62  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field String analyticsButtonCreatedEventName>
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #66  <Method void AppEventsLogger.logSdkEvent(String, Double, android.os.Bundle)>
	//    7   13:return          
	}

	private void logButtonTapped(Context context)
	{
		AppEventsLogger.newLogger(context).logSdkEvent(analyticsButtonTappedEventName, ((Double) (null)), ((android.os.Bundle) (null)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #62  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field String analyticsButtonTappedEventName>
	//    4    8:aconst_null     
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #66  <Method void AppEventsLogger.logSdkEvent(String, Double, android.os.Bundle)>
	//    7   13:return          
	}

	private void parseBackgroundAttributes(Context context, AttributeSet attributeset, int i, int j)
	{
		if(isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #71  <Method boolean isInEditMode()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x10100d4
		}, i, j)));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #77  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:aload_2         
	//    7   13:iconst_1        
	//    8   14:newarray        int[]
	//    9   16:dup             
	//   10   17:iconst_0        
	//   11   18:ldc1            #78  <Int 0x10100d4>
	//   12   20:iastore         
	//   13   21:iload_3         
	//   14   22:iload           4
	//   15   24:invokevirtual   #84  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   16   27:astore_1        
		if(!((TypedArray) (context)).hasValue(0))
			break MISSING_BLOCK_LABEL_68;
	//   17   28:aload_1         
	//   18   29:iconst_0        
	//   19   30:invokevirtual   #90  <Method boolean TypedArray.hasValue(int)>
	//   20   33:ifeq            68
		i = ((TypedArray) (context)).getResourceId(0, 0);
	//   21   36:aload_1         
	//   22   37:iconst_0        
	//   23   38:iconst_0        
	//   24   39:invokevirtual   #94  <Method int TypedArray.getResourceId(int, int)>
	//   25   42:istore_3        
		if(i == 0)
			break MISSING_BLOCK_LABEL_55;
	//   26   43:iload_3         
	//   27   44:ifeq            55
		setBackgroundResource(i);
	//   28   47:aload_0         
	//   29   48:iload_3         
	//   30   49:invokevirtual   #98  <Method void setBackgroundResource(int)>
		break MISSING_BLOCK_LABEL_80;
	//   31   52:goto            80
		setBackgroundColor(((TypedArray) (context)).getColor(0, 0));
	//   32   55:aload_0         
	//   33   56:aload_1         
	//   34   57:iconst_0        
	//   35   58:iconst_0        
	//   36   59:invokevirtual   #101 <Method int TypedArray.getColor(int, int)>
	//   37   62:invokevirtual   #104 <Method void setBackgroundColor(int)>
		break MISSING_BLOCK_LABEL_80;
	//   38   65:goto            80
		setBackgroundColor(((TypedArray) (context)).getColor(0, R.color.com_facebook_blue));
	//   39   68:aload_0         
	//   40   69:aload_1         
	//   41   70:iconst_0        
	//   42   71:getstatic       #109 <Field int R$color.com_facebook_blue>
	//   43   74:invokevirtual   #101 <Method int TypedArray.getColor(int, int)>
	//   44   77:invokevirtual   #104 <Method void setBackgroundColor(int)>
		((TypedArray) (context)).recycle();
	//   45   80:aload_1         
	//   46   81:invokevirtual   #113 <Method void TypedArray.recycle()>
		return;
	//   47   84:return          
		attributeset;
	//   48   85:astore_2        
		((TypedArray) (context)).recycle();
	//   49   86:aload_1         
	//   50   87:invokevirtual   #113 <Method void TypedArray.recycle()>
		throw attributeset;
	//   51   90:aload_2         
	//   52   91:athrow          
	}

	private void parseCompoundDrawableAttributes(Context context, AttributeSet attributeset, int i, int j)
	{
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x101016f, 0x101016d, 0x1010170, 0x101016e, 0x1010171
		}, i, j)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #77  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:iconst_5        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #115 <Int 0x101016f>
	//    8   12:iastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:ldc1            #116 <Int 0x101016d>
	//   12   17:iastore         
	//   13   18:dup             
	//   14   19:iconst_2        
	//   15   20:ldc1            #117 <Int 0x1010170>
	//   16   22:iastore         
	//   17   23:dup             
	//   18   24:iconst_3        
	//   19   25:ldc1            #118 <Int 0x101016e>
	//   20   27:iastore         
	//   21   28:dup             
	//   22   29:iconst_4        
	//   23   30:ldc1            #119 <Int 0x1010171>
	//   24   32:iastore         
	//   25   33:iload_3         
	//   26   34:iload           4
	//   27   36:invokevirtual   #84  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   28   39:astore_1        
		setCompoundDrawablesWithIntrinsicBounds(((TypedArray) (context)).getResourceId(0, 0), ((TypedArray) (context)).getResourceId(1, 0), ((TypedArray) (context)).getResourceId(2, 0), ((TypedArray) (context)).getResourceId(3, 0));
	//   29   40:aload_0         
	//   30   41:aload_1         
	//   31   42:iconst_0        
	//   32   43:iconst_0        
	//   33   44:invokevirtual   #94  <Method int TypedArray.getResourceId(int, int)>
	//   34   47:aload_1         
	//   35   48:iconst_1        
	//   36   49:iconst_0        
	//   37   50:invokevirtual   #94  <Method int TypedArray.getResourceId(int, int)>
	//   38   53:aload_1         
	//   39   54:iconst_2        
	//   40   55:iconst_0        
	//   41   56:invokevirtual   #94  <Method int TypedArray.getResourceId(int, int)>
	//   42   59:aload_1         
	//   43   60:iconst_3        
	//   44   61:iconst_0        
	//   45   62:invokevirtual   #94  <Method int TypedArray.getResourceId(int, int)>
	//   46   65:invokevirtual   #123 <Method void setCompoundDrawablesWithIntrinsicBounds(int, int, int, int)>
		setCompoundDrawablePadding(((TypedArray) (context)).getDimensionPixelSize(4, 0));
	//   47   68:aload_0         
	//   48   69:aload_1         
	//   49   70:iconst_4        
	//   50   71:iconst_0        
	//   51   72:invokevirtual   #126 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   52   75:invokevirtual   #129 <Method void setCompoundDrawablePadding(int)>
		((TypedArray) (context)).recycle();
	//   53   78:aload_1         
	//   54   79:invokevirtual   #113 <Method void TypedArray.recycle()>
		return;
	//   55   82:return          
		attributeset;
	//   56   83:astore_2        
		((TypedArray) (context)).recycle();
	//   57   84:aload_1         
	//   58   85:invokevirtual   #113 <Method void TypedArray.recycle()>
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
	//    1    1:invokevirtual   #77  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:iconst_4        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #131 <Int 0x10100d6>
	//    8   12:iastore         
	//    9   13:dup             
	//   10   14:iconst_1        
	//   11   15:ldc1            #132 <Int 0x10100d7>
	//   12   17:iastore         
	//   13   18:dup             
	//   14   19:iconst_2        
	//   15   20:ldc1            #133 <Int 0x10100d8>
	//   16   22:iastore         
	//   17   23:dup             
	//   18   24:iconst_3        
	//   19   25:ldc1            #134 <Int 0x10100d9>
	//   20   27:iastore         
	//   21   28:iload_3         
	//   22   29:iload           4
	//   23   31:invokevirtual   #84  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   24   34:astore_1        
		setPadding(((TypedArray) (context)).getDimensionPixelSize(0, 0), ((TypedArray) (context)).getDimensionPixelSize(1, 0), ((TypedArray) (context)).getDimensionPixelSize(2, 0), ((TypedArray) (context)).getDimensionPixelSize(3, 0));
	//   25   35:aload_0         
	//   26   36:aload_1         
	//   27   37:iconst_0        
	//   28   38:iconst_0        
	//   29   39:invokevirtual   #126 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   30   42:aload_1         
	//   31   43:iconst_1        
	//   32   44:iconst_0        
	//   33   45:invokevirtual   #126 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   34   48:aload_1         
	//   35   49:iconst_2        
	//   36   50:iconst_0        
	//   37   51:invokevirtual   #126 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   38   54:aload_1         
	//   39   55:iconst_3        
	//   40   56:iconst_0        
	//   41   57:invokevirtual   #126 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   42   60:invokevirtual   #137 <Method void setPadding(int, int, int, int)>
		((TypedArray) (context)).recycle();
	//   43   63:aload_1         
	//   44   64:invokevirtual   #113 <Method void TypedArray.recycle()>
		return;
	//   45   67:return          
		attributeset;
	//   46   68:astore_2        
		((TypedArray) (context)).recycle();
	//   47   69:aload_1         
	//   48   70:invokevirtual   #113 <Method void TypedArray.recycle()>
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
	//    1    1:invokevirtual   #77  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:iconst_1        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #139 <Int 0x1010098>
	//    8   12:iastore         
	//    9   13:iload_3         
	//   10   14:iload           4
	//   11   16:invokevirtual   #84  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   12   19:astore          5
		setTextColor(typedarray.getColor(0, -1));
	//   13   21:aload_0         
	//   14   22:aload           5
	//   15   24:iconst_0        
	//   16   25:iconst_m1       
	//   17   26:invokevirtual   #101 <Method int TypedArray.getColor(int, int)>
	//   18   29:invokevirtual   #142 <Method void setTextColor(int)>
		typedarray.recycle();
	//   19   32:aload           5
	//   20   34:invokevirtual   #113 <Method void TypedArray.recycle()>
		typedarray = context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x10100af
		}, i, j);
	//   21   37:aload_1         
	//   22   38:invokevirtual   #77  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   23   41:aload_2         
	//   24   42:iconst_1        
	//   25   43:newarray        int[]
	//   26   45:dup             
	//   27   46:iconst_0        
	//   28   47:ldc1            #143 <Int 0x10100af>
	//   29   49:iastore         
	//   30   50:iload_3         
	//   31   51:iload           4
	//   32   53:invokevirtual   #84  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   33   56:astore          5
		setGravity(typedarray.getInt(0, 17));
	//   34   58:aload_0         
	//   35   59:aload           5
	//   36   61:iconst_0        
	//   37   62:bipush          17
	//   38   64:invokevirtual   #146 <Method int TypedArray.getInt(int, int)>
	//   39   67:invokevirtual   #149 <Method void setGravity(int)>
		typedarray.recycle();
	//   40   70:aload           5
	//   41   72:invokevirtual   #113 <Method void TypedArray.recycle()>
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, new int[] {
			0x1010095, 0x1010097, 0x101014f
		}, i, j)));
	//   42   75:aload_1         
	//   43   76:invokevirtual   #77  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   44   79:aload_2         
	//   45   80:iconst_3        
	//   46   81:newarray        int[]
	//   47   83:dup             
	//   48   84:iconst_0        
	//   49   85:ldc1            #150 <Int 0x1010095>
	//   50   87:iastore         
	//   51   88:dup             
	//   52   89:iconst_1        
	//   53   90:ldc1            #151 <Int 0x1010097>
	//   54   92:iastore         
	//   55   93:dup             
	//   56   94:iconst_2        
	//   57   95:ldc1            #152 <Int 0x101014f>
	//   58   97:iastore         
	//   59   98:iload_3         
	//   60   99:iload           4
	//   61  101:invokevirtual   #84  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   62  104:astore_1        
		setTextSize(0, ((TypedArray) (context)).getDimensionPixelSize(0, 0));
	//   63  105:aload_0         
	//   64  106:iconst_0        
	//   65  107:aload_1         
	//   66  108:iconst_0        
	//   67  109:iconst_0        
	//   68  110:invokevirtual   #126 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   69  113:i2f             
	//   70  114:invokevirtual   #156 <Method void setTextSize(int, float)>
		setTypeface(Typeface.defaultFromStyle(((TypedArray) (context)).getInt(1, 1)));
	//   71  117:aload_0         
	//   72  118:aload_1         
	//   73  119:iconst_1        
	//   74  120:iconst_1        
	//   75  121:invokevirtual   #146 <Method int TypedArray.getInt(int, int)>
	//   76  124:invokestatic    #162 <Method Typeface Typeface.defaultFromStyle(int)>
	//   77  127:invokevirtual   #166 <Method void setTypeface(Typeface)>
		setText(((CharSequence) (((TypedArray) (context)).getString(2))));
	//   78  130:aload_0         
	//   79  131:aload_1         
	//   80  132:iconst_2        
	//   81  133:invokevirtual   #170 <Method String TypedArray.getString(int)>
	//   82  136:invokevirtual   #174 <Method void setText(CharSequence)>
		((TypedArray) (context)).recycle();
	//   83  139:aload_1         
	//   84  140:invokevirtual   #113 <Method void TypedArray.recycle()>
		return;
	//   85  143:return          
		attributeset;
	//   86  144:astore_2        
		((TypedArray) (context)).recycle();
	//   87  145:aload_1         
	//   88  146:invokevirtual   #113 <Method void TypedArray.recycle()>
		throw attributeset;
	//   89  149:aload_2         
	//   90  150:athrow          
		context;
	//   91  151:astore_1        
		typedarray.recycle();
	//   92  152:aload           5
	//   93  154:invokevirtual   #113 <Method void TypedArray.recycle()>
		throw context;
	//   94  157:aload_1         
	//   95  158:athrow          
		context;
	//   96  159:astore_1        
		typedarray.recycle();
	//   97  160:aload           5
	//   98  162:invokevirtual   #113 <Method void TypedArray.recycle()>
		throw context;
	//   99  165:aload_1         
	//  100  166:athrow          
	}

	private void setupOnClickListener()
	{
		super.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				logButtonTapped(getContext());
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FacebookButtonBase this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #17  <Field FacebookButtonBase this$0>
			//    4    8:invokevirtual   #26  <Method Context FacebookButtonBase.getContext()>
			//    5   11:invokestatic    #30  <Method void FacebookButtonBase.access$000(FacebookButtonBase, Context)>
				if(internalOnClickListener != null)
			//*   6   14:aload_0         
			//*   7   15:getfield        #17  <Field FacebookButtonBase this$0>
			//*   8   18:invokestatic    #34  <Method android.view.View$OnClickListener FacebookButtonBase.access$100(FacebookButtonBase)>
			//*   9   21:ifnull          38
				{
					internalOnClickListener.onClick(view);
			//   10   24:aload_0         
			//   11   25:getfield        #17  <Field FacebookButtonBase this$0>
			//   12   28:invokestatic    #34  <Method android.view.View$OnClickListener FacebookButtonBase.access$100(FacebookButtonBase)>
			//   13   31:aload_1         
			//   14   32:invokeinterface #36  <Method void android.view.View$OnClickListener.onClick(View)>
					return;
			//   15   37:return          
				}
				if(externalOnClickListener != null)
			//*  16   38:aload_0         
			//*  17   39:getfield        #17  <Field FacebookButtonBase this$0>
			//*  18   42:invokestatic    #39  <Method android.view.View$OnClickListener FacebookButtonBase.access$200(FacebookButtonBase)>
			//*  19   45:ifnull          61
					externalOnClickListener.onClick(view);
			//   20   48:aload_0         
			//   21   49:getfield        #17  <Field FacebookButtonBase this$0>
			//   22   52:invokestatic    #39  <Method android.view.View$OnClickListener FacebookButtonBase.access$200(FacebookButtonBase)>
			//   23   55:aload_1         
			//   24   56:invokeinterface #36  <Method void android.view.View$OnClickListener.onClick(View)>
			//   25   61:return          
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
	//    4    6:invokespecial   #178 <Method void FacebookButtonBase$1(FacebookButtonBase)>
	//    5    9:invokespecial   #182 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
	//    6   12:return          
	}

	protected void callExternalOnClickListener(View view)
	{
		if(externalOnClickListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field android.view.View$OnClickListener externalOnClickListener>
	//*   2    4:ifnull          17
			externalOnClickListener.onClick(view);
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field android.view.View$OnClickListener externalOnClickListener>
	//    5   11:aload_1         
	//    6   12:invokeinterface #189 <Method void android.view.View$OnClickListener.onClick(View)>
	//    7   17:return          
	}

	protected void configureButton(Context context, AttributeSet attributeset, int i, int j)
	{
		parseBackgroundAttributes(context, attributeset, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #191 <Method void parseBackgroundAttributes(Context, AttributeSet, int, int)>
		parseCompoundDrawableAttributes(context, attributeset, i, j);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:aload_2         
	//    9   12:iload_3         
	//   10   13:iload           4
	//   11   15:invokespecial   #193 <Method void parseCompoundDrawableAttributes(Context, AttributeSet, int, int)>
		parseContentAttributes(context, attributeset, i, j);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:aload_2         
	//   15   21:iload_3         
	//   16   22:iload           4
	//   17   24:invokespecial   #195 <Method void parseContentAttributes(Context, AttributeSet, int, int)>
		parseTextAttributes(context, attributeset, i, j);
	//   18   27:aload_0         
	//   19   28:aload_1         
	//   20   29:aload_2         
	//   21   30:iload_3         
	//   22   31:iload           4
	//   23   33:invokespecial   #197 <Method void parseTextAttributes(Context, AttributeSet, int, int)>
		setupOnClickListener();
	//   24   36:aload_0         
	//   25   37:invokespecial   #199 <Method void setupOnClickListener()>
	//   26   40:return          
	}

	protected Activity getActivity()
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #205 <Method Context getContext()>
	//    2    4:astore_2        
		boolean flag;
		do
		{
			flag = context instanceof Activity;
	//    3    5:aload_2         
	//    4    6:instanceof      #207 <Class Activity>
	//    5    9:istore_1        
			if(flag || !(context instanceof ContextWrapper))
				break;
	//    6   10:iload_1         
	//    7   11:ifne            32
	//    8   14:aload_2         
	//    9   15:instanceof      #209 <Class ContextWrapper>
	//   10   18:ifeq            32
			context = ((ContextWrapper)context).getBaseContext();
	//   11   21:aload_2         
	//   12   22:checkcast       #209 <Class ContextWrapper>
	//   13   25:invokevirtual   #212 <Method Context ContextWrapper.getBaseContext()>
	//   14   28:astore_2        
		} while(true);
	//   15   29:goto            5
		if(flag)
	//*  16   32:iload_1         
	//*  17   33:ifeq            41
			return (Activity)context;
	//   18   36:aload_2         
	//   19   37:checkcast       #207 <Class Activity>
	//   20   40:areturn         
		else
			throw new FacebookException("Unable to get Activity.");
	//   21   41:new             #214 <Class FacebookException>
	//   22   44:dup             
	//   23   45:ldc1            #216 <String "Unable to get Activity.">
	//   24   47:invokespecial   #219 <Method void FacebookException(String)>
	//   25   50:athrow          
	}

	public int getCompoundPaddingLeft()
	{
		if(overrideCompoundPadding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field boolean overrideCompoundPadding>
	//*   2    4:ifeq            12
			return overrideCompoundPaddingLeft;
	//    3    7:aload_0         
	//    4    8:getfield        #224 <Field int overrideCompoundPaddingLeft>
	//    5   11:ireturn         
		else
			return super.getCompoundPaddingLeft();
	//    6   12:aload_0         
	//    7   13:invokespecial   #226 <Method int Button.getCompoundPaddingLeft()>
	//    8   16:ireturn         
	}

	public int getCompoundPaddingRight()
	{
		if(overrideCompoundPadding)
	//*   0    0:aload_0         
	//*   1    1:getfield        #222 <Field boolean overrideCompoundPadding>
	//*   2    4:ifeq            12
			return overrideCompoundPaddingRight;
	//    3    7:aload_0         
	//    4    8:getfield        #229 <Field int overrideCompoundPaddingRight>
	//    5   11:ireturn         
		else
			return super.getCompoundPaddingRight();
	//    6   12:aload_0         
	//    7   13:invokespecial   #231 <Method int Button.getCompoundPaddingRight()>
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
		return parentFragment;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field Fragment parentFragment>
	//    2    4:areturn         
	}

	public int getRequestCode()
	{
		return getDefaultRequestCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #239 <Method int getDefaultRequestCode()>
	//    2    4:ireturn         
	}

	protected int measureTextWidth(String s)
	{
		return (int)Math.ceil(getPaint().measureText(s));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #245 <Method TextPaint getPaint()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #251 <Method float TextPaint.measureText(String)>
	//    4    8:f2d             
	//    5    9:invokestatic    #257 <Method double Math.ceil(double)>
	//    6   12:d2i             
	//    7   13:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void Button.onAttachedToWindow()>
		if(!isInEditMode())
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #71  <Method boolean isInEditMode()>
	//*   4    8:ifne            19
			logButtonCreated(getContext());
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #205 <Method Context getContext()>
	//    8   16:invokespecial   #262 <Method void logButtonCreated(Context)>
	//    9   19:return          
	}

	protected void onDraw(Canvas canvas)
	{
		boolean flag;
		if((getGravity() & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #267 <Method int getGravity()>
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
	//   13   21:invokevirtual   #268 <Method int getCompoundPaddingLeft()>
	//   14   24:istore_2        
			int j = getCompoundPaddingRight();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #269 <Method int getCompoundPaddingRight()>
	//   17   29:istore_3        
			int k = getCompoundDrawablePadding();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #272 <Method int getCompoundDrawablePadding()>
	//   20   34:istore          4
			k = Math.min((getWidth() - (k + i) - j - measureTextWidth(getText().toString())) / 2, (i - getPaddingLeft()) / 2);
	//   21   36:aload_0         
	//   22   37:invokevirtual   #275 <Method int getWidth()>
	//   23   40:iload           4
	//   24   42:iload_2         
	//   25   43:iadd            
	//   26   44:isub            
	//   27   45:iload_3         
	//   28   46:isub            
	//   29   47:aload_0         
	//   30   48:aload_0         
	//   31   49:invokevirtual   #279 <Method CharSequence getText()>
	//   32   52:invokeinterface #285 <Method String CharSequence.toString()>
	//   33   57:invokevirtual   #287 <Method int measureTextWidth(String)>
	//   34   60:isub            
	//   35   61:iconst_2        
	//   36   62:idiv            
	//   37   63:iload_2         
	//   38   64:aload_0         
	//   39   65:invokevirtual   #290 <Method int getPaddingLeft()>
	//   40   68:isub            
	//   41   69:iconst_2        
	//   42   70:idiv            
	//   43   71:invokestatic    #293 <Method int Math.min(int, int)>
	//   44   74:istore          4
			overrideCompoundPaddingLeft = i - k;
	//   45   76:aload_0         
	//   46   77:iload_2         
	//   47   78:iload           4
	//   48   80:isub            
	//   49   81:putfield        #224 <Field int overrideCompoundPaddingLeft>
			overrideCompoundPaddingRight = j + k;
	//   50   84:aload_0         
	//   51   85:iload_3         
	//   52   86:iload           4
	//   53   88:iadd            
	//   54   89:putfield        #229 <Field int overrideCompoundPaddingRight>
			overrideCompoundPadding = true;
	//   55   92:aload_0         
	//   56   93:iconst_1        
	//   57   94:putfield        #222 <Field boolean overrideCompoundPadding>
		}
		super.onDraw(canvas);
	//   58   97:aload_0         
	//   59   98:aload_1         
	//   60   99:invokespecial   #295 <Method void Button.onDraw(Canvas)>
		overrideCompoundPadding = false;
	//   61  102:aload_0         
	//   62  103:iconst_0        
	//   63  104:putfield        #222 <Field boolean overrideCompoundPadding>
	//   64  107:return          
	}

	public void setFragment(Fragment fragment)
	{
		parentFragment = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #236 <Field Fragment parentFragment>
	//    3    5:return          
	}

	protected void setInternalOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		internalOnClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field android.view.View$OnClickListener internalOnClickListener>
	//    3    5:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		externalOnClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #55  <Field android.view.View$OnClickListener externalOnClickListener>
	//    3    5:return          
	}

	private String analyticsButtonCreatedEventName;
	private String analyticsButtonTappedEventName;
	private android.view.View.OnClickListener externalOnClickListener;
	private android.view.View.OnClickListener internalOnClickListener;
	private boolean overrideCompoundPadding;
	private int overrideCompoundPaddingLeft;
	private int overrideCompoundPaddingRight;
	private Fragment parentFragment;


/*
	static void access$000(FacebookButtonBase facebookbuttonbase, Context context)
	{
		facebookbuttonbase.logButtonTapped(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #48  <Method void logButtonTapped(Context)>
		return;
	//    3    5:return          
	}

*/


/*
	static android.view.View.OnClickListener access$100(FacebookButtonBase facebookbuttonbase)
	{
		return facebookbuttonbase.internalOnClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field android.view.View$OnClickListener internalOnClickListener>
	//    2    4:areturn         
	}

*/


/*
	static android.view.View.OnClickListener access$200(FacebookButtonBase facebookbuttonbase)
	{
		return facebookbuttonbase.externalOnClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field android.view.View$OnClickListener externalOnClickListener>
	//    2    4:areturn         
	}

*/
}
