// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.feed;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageSwitcher;
import com.appboy.support.AppboyLogger;

public class AppboyImageSwitcher extends ImageSwitcher
{

	public AppboyImageSwitcher(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void ImageSwitcher(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, com.appboy.ui.R.styleable.com_appboy_ui_feed_AppboyImageSwitcher)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #32  <Field int[] com.appboy.ui.R$styleable.com_appboy_ui_feed_AppboyImageSwitcher>
	//    7   11:invokevirtual   #38  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
_L2:
		int j;
		if(i >= ((TypedArray) (context)).getIndexCount())
			break MISSING_BLOCK_LABEL_89;
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:invokevirtual   #44  <Method int TypedArray.getIndexCount()>
	//   14   22:icmpge          89
		j = ((TypedArray) (context)).getIndex(i);
	//   15   25:aload_1         
	//   16   26:iload_3         
	//   17   27:invokevirtual   #48  <Method int TypedArray.getIndex(int)>
	//   18   30:istore          4
		if(j != com.appboy.ui.R.styleable.com_appboy_ui_feed_AppboyImageSwitcher_appboyFeedCustomReadIcon)
			break MISSING_BLOCK_LABEL_59;
	//   19   32:iload           4
	//   20   34:getstatic       #52  <Field int com.appboy.ui.R$styleable.com_appboy_ui_feed_AppboyImageSwitcher_appboyFeedCustomReadIcon>
	//   21   37:icmpne          59
		attributeset = ((AttributeSet) (((TypedArray) (context)).getDrawable(j)));
	//   22   40:aload_1         
	//   23   41:iload           4
	//   24   43:invokevirtual   #56  <Method Drawable TypedArray.getDrawable(int)>
	//   25   46:astore_2        
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_106;
	//   26   47:aload_2         
	//   27   48:ifnull          106
		mReadIcon = ((Drawable) (attributeset));
	//   28   51:aload_0         
	//   29   52:aload_2         
	//   30   53:putfield        #58  <Field Drawable mReadIcon>
		break MISSING_BLOCK_LABEL_106;
	//   31   56:goto            106
		if(((TypedArray) (context)).getIndex(i) != com.appboy.ui.R.styleable.com_appboy_ui_feed_AppboyImageSwitcher_appboyFeedCustomUnReadIcon)
			break MISSING_BLOCK_LABEL_106;
	//   32   59:aload_1         
	//   33   60:iload_3         
	//   34   61:invokevirtual   #48  <Method int TypedArray.getIndex(int)>
	//   35   64:getstatic       #61  <Field int com.appboy.ui.R$styleable.com_appboy_ui_feed_AppboyImageSwitcher_appboyFeedCustomUnReadIcon>
	//   36   67:icmpne          106
		attributeset = ((AttributeSet) (((TypedArray) (context)).getDrawable(j)));
	//   37   70:aload_1         
	//   38   71:iload           4
	//   39   73:invokevirtual   #56  <Method Drawable TypedArray.getDrawable(int)>
	//   40   76:astore_2        
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_106;
	//   41   77:aload_2         
	//   42   78:ifnull          106
		mUnReadIcon = ((Drawable) (attributeset));
	//   43   81:aload_0         
	//   44   82:aload_2         
	//   45   83:putfield        #63  <Field Drawable mUnReadIcon>
		break MISSING_BLOCK_LABEL_106;
	//   46   86:goto            106
		try
		{
			((TypedArray) (context)).recycle();
	//   47   89:aload_1         
	//   48   90:invokevirtual   #66  <Method void TypedArray.recycle()>
			return;
	//   49   93:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  50   94:astore_1        
		{
			AppboyLogger.w(TAG, "Error while checking for custom drawable.", ((Throwable) (context)));
	//   51   95:getstatic       #19  <Field String TAG>
	//   52   98:ldc1            #68  <String "Error while checking for custom drawable.">
	//   53  100:aload_1         
	//   54  101:invokestatic    #72  <Method int AppboyLogger.w(String, String, Throwable)>
	//   55  104:pop             
		}
		return;
	//   56  105:return          
		i++;
	//   57  106:iload_3         
	//   58  107:iconst_1        
	//   59  108:iadd            
	//   60  109:istore_3        
		if(true) goto _L2; else goto _L1
	//   61  110:goto            17
_L1:
	}

	public Drawable getReadIcon()
	{
		return mReadIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Drawable mReadIcon>
	//    2    4:areturn         
	}

	public Drawable getUnReadIcon()
	{
		return mUnReadIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field Drawable mUnReadIcon>
	//    2    4:areturn         
	}

	public void setReadIcon(Drawable drawable)
	{
		mReadIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field Drawable mReadIcon>
	//    3    5:return          
	}

	public void setUnReadIcon(Drawable drawable)
	{
		mUnReadIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #63  <Field Drawable mUnReadIcon>
	//    3    5:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/feed/AppboyImageSwitcher);
	private Drawable mReadIcon;
	private Drawable mUnReadIcon;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyImageSwitcher>
	//    1    2:invokestatic    #17  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #19  <Field String TAG>
	//*   3    8:return          
	}
}
