// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.*;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public class ActionBarPolicy
{

	private ActionBarPolicy(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Context mContext>
	//    5    9:return          
	}

	public static ActionBarPolicy get(Context context)
	{
		return new ActionBarPolicy(context);
	//    0    0:new             #2   <Class ActionBarPolicy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #22  <Method void ActionBarPolicy(Context)>
	//    4    8:areturn         
	}

	public boolean enableHomeButtonByDefault()
	{
		return mContext.getApplicationInfo().targetSdkVersion < 14;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context mContext>
	//    2    4:invokevirtual   #30  <Method ApplicationInfo Context.getApplicationInfo()>
	//    3    7:getfield        #36  <Field int ApplicationInfo.targetSdkVersion>
	//    4   10:bipush          14
	//    5   12:icmpge          17
	//    6   15:iconst_1        
	//    7   16:ireturn         
	//    8   17:iconst_0        
	//    9   18:ireturn         
	}

	public int getEmbeddedMenuWidthLimit()
	{
		return mContext.getResources().getDisplayMetrics().widthPixels / 2;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context mContext>
	//    2    4:invokevirtual   #42  <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #48  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    4   10:getfield        #53  <Field int DisplayMetrics.widthPixels>
	//    5   13:iconst_2        
	//    6   14:idiv            
	//    7   15:ireturn         
	}

	public int getMaxActionButtons()
	{
		Configuration configuration = mContext.getResources().getConfiguration();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context mContext>
	//    2    4:invokevirtual   #42  <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #58  <Method Configuration Resources.getConfiguration()>
	//    4   10:astore_3        
		int i = configuration.screenWidthDp;
	//    5   11:aload_3         
	//    6   12:getfield        #63  <Field int Configuration.screenWidthDp>
	//    7   15:istore_1        
		int j = configuration.screenHeightDp;
	//    8   16:aload_3         
	//    9   17:getfield        #66  <Field int Configuration.screenHeightDp>
	//   10   20:istore_2        
		if(configuration.smallestScreenWidthDp <= 600 && i <= 600 && (i <= 960 || j <= 720) && (i <= 720 || j <= 960))
	//*  11   21:aload_3         
	//*  12   22:getfield        #69  <Field int Configuration.smallestScreenWidthDp>
	//*  13   25:sipush          600
	//*  14   28:icmpgt          120
	//*  15   31:iload_1         
	//*  16   32:sipush          600
	//*  17   35:icmpgt          120
	//*  18   38:iload_1         
	//*  19   39:sipush          960
	//*  20   42:icmple          52
	//*  21   45:iload_2         
	//*  22   46:sipush          720
	//*  23   49:icmpgt          120
	//*  24   52:iload_1         
	//*  25   53:sipush          720
	//*  26   56:icmple          69
	//*  27   59:iload_2         
	//*  28   60:sipush          960
	//*  29   63:icmple          69
	//*  30   66:goto            120
		{
			if(i < 500 && (i <= 640 || j <= 480) && (i <= 480 || j <= 640))
	//*  31   69:iload_1         
	//*  32   70:sipush          500
	//*  33   73:icmpge          118
	//*  34   76:iload_1         
	//*  35   77:sipush          640
	//*  36   80:icmple          90
	//*  37   83:iload_2         
	//*  38   84:sipush          480
	//*  39   87:icmpgt          118
	//*  40   90:iload_1         
	//*  41   91:sipush          480
	//*  42   94:icmple          107
	//*  43   97:iload_2         
	//*  44   98:sipush          640
	//*  45  101:icmple          107
	//*  46  104:goto            118
				return i < 360 ? 2 : 3;
	//   47  107:iload_1         
	//   48  108:sipush          360
	//   49  111:icmplt          116
	//   50  114:iconst_3        
	//   51  115:ireturn         
	//   52  116:iconst_2        
	//   53  117:ireturn         
			else
				return 4;
	//   54  118:iconst_4        
	//   55  119:ireturn         
		} else
		{
			return 5;
	//   56  120:iconst_5        
	//   57  121:ireturn         
		}
	}

	public int getStackedTabMaxWidth()
	{
		return mContext.getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_action_bar_stacked_tab_max_width);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context mContext>
	//    2    4:invokevirtual   #42  <Method Resources Context.getResources()>
	//    3    7:getstatic       #75  <Field int android.support.v7.appcompat.R$dimen.abc_action_bar_stacked_tab_max_width>
	//    4   10:invokevirtual   #79  <Method int Resources.getDimensionPixelSize(int)>
	//    5   13:ireturn         
	}

	public int getTabContainerHeight()
	{
		TypedArray typedarray = mContext.obtainStyledAttributes(((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context mContext>
	//    2    4:aconst_null     
	//    3    5:getstatic       #86  <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//    4    8:getstatic       #91  <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #95  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//    7   15:astore_3        
		int j = typedarray.getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionBar_height, 0);
	//    8   16:aload_3         
	//    9   17:getstatic       #98  <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #104 <Method int TypedArray.getLayoutDimension(int, int)>
	//   12   24:istore_2        
		Resources resources = mContext.getResources();
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field Context mContext>
	//   15   29:invokevirtual   #42  <Method Resources Context.getResources()>
	//   16   32:astore          4
		int i = j;
	//   17   34:iload_2         
	//   18   35:istore_1        
		if(!hasEmbeddedTabs())
	//*  19   36:aload_0         
	//*  20   37:invokevirtual   #107 <Method boolean hasEmbeddedTabs()>
	//*  21   40:ifne            56
			i = Math.min(j, resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_action_bar_stacked_max_height));
	//   22   43:iload_2         
	//   23   44:aload           4
	//   24   46:getstatic       #110 <Field int android.support.v7.appcompat.R$dimen.abc_action_bar_stacked_max_height>
	//   25   49:invokevirtual   #79  <Method int Resources.getDimensionPixelSize(int)>
	//   26   52:invokestatic    #115 <Method int Math.min(int, int)>
	//   27   55:istore_1        
		typedarray.recycle();
	//   28   56:aload_3         
	//   29   57:invokevirtual   #118 <Method void TypedArray.recycle()>
		return i;
	//   30   60:iload_1         
	//   31   61:ireturn         
	}

	public boolean hasEmbeddedTabs()
	{
		return mContext.getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_action_bar_embed_tabs);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context mContext>
	//    2    4:invokevirtual   #42  <Method Resources Context.getResources()>
	//    3    7:getstatic       #123 <Field int android.support.v7.appcompat.R$bool.abc_action_bar_embed_tabs>
	//    4   10:invokevirtual   #127 <Method boolean Resources.getBoolean(int)>
	//    5   13:ireturn         
	}

	public boolean showsOverflowMenuButton()
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #133 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          10
			return true;
	//    3    8:iconst_1        
	//    4    9:ireturn         
		else
			return ViewConfiguration.get(mContext).hasPermanentMenuKey() ^ true;
	//    5   10:aload_0         
	//    6   11:getfield        #17  <Field Context mContext>
	//    7   14:invokestatic    #138 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//    8   17:invokevirtual   #141 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//    9   20:iconst_1        
	//   10   21:ixor            
	//   11   22:ireturn         
	}

	private Context mContext;
}
