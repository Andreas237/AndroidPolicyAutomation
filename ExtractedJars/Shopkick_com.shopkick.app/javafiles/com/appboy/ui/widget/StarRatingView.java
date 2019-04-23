// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.List;

public class StarRatingView extends LinearLayout
{

	public StarRatingView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void LinearLayout(Context, AttributeSet)>
		mRating = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #31  <Field float mRating>
		setOrientation(0);
	//    7   11:aload_0         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #35  <Method void setOrientation(int)>
		mStarRating = ((List) (new ArrayList(5)));
	//   10   16:aload_0         
	//   11   17:new             #37  <Class ArrayList>
	//   12   20:dup             
	//   13   21:iconst_5        
	//   14   22:invokespecial   #39  <Method void ArrayList(int)>
	//   15   25:putfield        #41  <Field List mStarRating>
		for(int i = 0; i < 5; i++)
	//*  16   28:iconst_0        
	//*  17   29:istore_3        
	//*  18   30:iload_3         
	//*  19   31:iconst_5        
	//*  20   32:icmpge          86
		{
			attributeset = ((AttributeSet) (new ImageView(context)));
	//   21   35:new             #43  <Class ImageView>
	//   22   38:dup             
	//   23   39:aload_1         
	//   24   40:invokespecial   #46  <Method void ImageView(Context)>
	//   25   43:astore_2        
			((ImageView) (attributeset)).setTag(((Object) (Integer.valueOf(0))));
	//   26   44:aload_2         
	//   27   45:iconst_0        
	//   28   46:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   29   49:invokevirtual   #56  <Method void ImageView.setTag(Object)>
			addView(((android.view.View) (attributeset)), new android.view.ViewGroup.LayoutParams(-2, -2));
	//   30   52:aload_0         
	//   31   53:aload_2         
	//   32   54:new             #58  <Class android.view.ViewGroup$LayoutParams>
	//   33   57:dup             
	//   34   58:bipush          -2
	//   35   60:bipush          -2
	//   36   62:invokespecial   #61  <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   37   65:invokevirtual   #65  <Method void addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			mStarRating.add(((Object) (attributeset)));
	//   38   68:aload_0         
	//   39   69:getfield        #41  <Field List mStarRating>
	//   40   72:aload_2         
	//   41   73:invokeinterface #71  <Method boolean List.add(Object)>
	//   42   78:pop             
		}

	//   43   79:iload_3         
	//   44   80:iconst_1        
	//   45   81:iadd            
	//   46   82:istore_3        
	//*  47   83:goto            30
		setRating(mRating);
	//   48   86:aload_0         
	//   49   87:aload_0         
	//   50   88:getfield        #31  <Field float mRating>
	//   51   91:invokevirtual   #75  <Method boolean setRating(float)>
	//   52   94:pop             
	//   53   95:return          
	}

	List getImageViewList()
	{
		return mStarRating;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field List mStarRating>
	//    2    4:areturn         
	}

	public float getRating()
	{
		return mRating;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field float mRating>
	//    2    4:freturn         
	}

	public boolean setRating(float f)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(f >= 0.0F && f <= 5F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpg           
	//*   5    5:iflt            256
	//*   6    8:fload_1         
	//*   7    9:ldc1            #82  <Float 5F>
	//*   8   11:fcmpl           
	//*   9   12:ifle            18
	//*  10   15:goto            256
		{
			mRating = f;
	//   11   18:aload_0         
	//   12   19:fload_1         
	//   13   20:putfield        #31  <Field float mRating>
			int l = (int)Math.floor(mRating);
	//   14   23:aload_0         
	//   15   24:getfield        #31  <Field float mRating>
	//   16   27:f2d             
	//   17   28:invokestatic    #88  <Method double Math.floor(double)>
	//   18   31:d2i             
	//   19   32:istore          5
			int k = (int)Math.ceil(mRating);
	//   20   34:aload_0         
	//   21   35:getfield        #31  <Field float mRating>
	//   22   38:f2d             
	//   23   39:invokestatic    #91  <Method double Math.ceil(double)>
	//   24   42:d2i             
	//   25   43:istore          4
			int j;
			do
			{
				j = k;
	//   26   45:iload           4
	//   27   47:istore_3        
				if(i >= l)
					break;
	//   28   48:iload_2         
	//   29   49:iload           5
	//   30   51:icmpge          95
				ImageView imageview = (ImageView)mStarRating.get(i);
	//   31   54:aload_0         
	//   32   55:getfield        #41  <Field List mStarRating>
	//   33   58:iload_2         
	//   34   59:invokeinterface #95  <Method Object List.get(int)>
	//   35   64:checkcast       #43  <Class ImageView>
	//   36   67:astore          6
				imageview.setTag(((Object) (Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_full_star))));
	//   37   69:aload           6
	//   38   71:getstatic       #100 <Field int com.appboy.ui.R$drawable.com_appboy_rating_full_star>
	//   39   74:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   40   77:invokevirtual   #56  <Method void ImageView.setTag(Object)>
				imageview.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_full_star);
	//   41   80:aload           6
	//   42   82:getstatic       #100 <Field int com.appboy.ui.R$drawable.com_appboy_rating_full_star>
	//   43   85:invokevirtual   #103 <Method void ImageView.setImageResource(int)>
				i++;
	//   44   88:iload_2         
	//   45   89:iconst_1        
	//   46   90:iadd            
	//   47   91:istore_2        
			} while(true);
	//   48   92:goto            45
			for(; j < mStarRating.size(); j++)
	//*  49   95:iload_3         
	//*  50   96:aload_0         
	//*  51   97:getfield        #41  <Field List mStarRating>
	//*  52  100:invokeinterface #107 <Method int List.size()>
	//*  53  105:icmpge          149
			{
				ImageView imageview1 = (ImageView)mStarRating.get(j);
	//   54  108:aload_0         
	//   55  109:getfield        #41  <Field List mStarRating>
	//   56  112:iload_3         
	//   57  113:invokeinterface #95  <Method Object List.get(int)>
	//   58  118:checkcast       #43  <Class ImageView>
	//   59  121:astore          6
				imageview1.setTag(((Object) (Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_empty_star))));
	//   60  123:aload           6
	//   61  125:getstatic       #110 <Field int com.appboy.ui.R$drawable.com_appboy_rating_empty_star>
	//   62  128:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   63  131:invokevirtual   #56  <Method void ImageView.setTag(Object)>
				imageview1.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_empty_star);
	//   64  134:aload           6
	//   65  136:getstatic       #110 <Field int com.appboy.ui.R$drawable.com_appboy_rating_empty_star>
	//   66  139:invokevirtual   #103 <Method void ImageView.setImageResource(int)>
			}

	//   67  142:iload_3         
	//   68  143:iconst_1        
	//   69  144:iadd            
	//   70  145:istore_3        
	//*  71  146:goto            95
			f -= l;
	//   72  149:fload_1         
	//   73  150:iload           5
	//   74  152:i2f             
	//   75  153:fsub            
	//   76  154:fstore_1        
			if(f > 0.0F)
	//*  77  155:fload_1         
	//*  78  156:fconst_0        
	//*  79  157:fcmpl           
	//*  80  158:ifle            254
			{
				ImageView imageview2 = (ImageView)mStarRating.get(l);
	//   81  161:aload_0         
	//   82  162:getfield        #41  <Field List mStarRating>
	//   83  165:iload           5
	//   84  167:invokeinterface #95  <Method Object List.get(int)>
	//   85  172:checkcast       #43  <Class ImageView>
	//   86  175:astore          6
				if(f < 0.25F)
	//*  87  177:fload_1         
	//*  88  178:ldc1            #111 <Float 0.25F>
	//*  89  180:fcmpg           
	//*  90  181:ifge            206
				{
					imageview2.setTag(((Object) (Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_empty_star))));
	//   91  184:aload           6
	//   92  186:getstatic       #110 <Field int com.appboy.ui.R$drawable.com_appboy_rating_empty_star>
	//   93  189:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//   94  192:invokevirtual   #56  <Method void ImageView.setTag(Object)>
					imageview2.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_empty_star);
	//   95  195:aload           6
	//   96  197:getstatic       #110 <Field int com.appboy.ui.R$drawable.com_appboy_rating_empty_star>
	//   97  200:invokevirtual   #103 <Method void ImageView.setImageResource(int)>
				} else
	//*  98  203:goto            254
				if(f < 0.75F)
	//*  99  206:fload_1         
	//* 100  207:ldc1            #112 <Float 0.75F>
	//* 101  209:fcmpg           
	//* 102  210:ifge            235
				{
					imageview2.setTag(((Object) (Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_half_star))));
	//  103  213:aload           6
	//  104  215:getstatic       #115 <Field int com.appboy.ui.R$drawable.com_appboy_rating_half_star>
	//  105  218:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//  106  221:invokevirtual   #56  <Method void ImageView.setTag(Object)>
					imageview2.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_half_star);
	//  107  224:aload           6
	//  108  226:getstatic       #115 <Field int com.appboy.ui.R$drawable.com_appboy_rating_half_star>
	//  109  229:invokevirtual   #103 <Method void ImageView.setImageResource(int)>
				} else
	//* 110  232:goto            254
				{
					imageview2.setTag(((Object) (Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_full_star))));
	//  111  235:aload           6
	//  112  237:getstatic       #100 <Field int com.appboy.ui.R$drawable.com_appboy_rating_full_star>
	//  113  240:invokestatic    #52  <Method Integer Integer.valueOf(int)>
	//  114  243:invokevirtual   #56  <Method void ImageView.setTag(Object)>
					imageview2.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_full_star);
	//  115  246:aload           6
	//  116  248:getstatic       #100 <Field int com.appboy.ui.R$drawable.com_appboy_rating_full_star>
	//  117  251:invokevirtual   #103 <Method void ImageView.setImageResource(int)>
				}
			}
			return true;
	//  118  254:iconst_1        
	//  119  255:ireturn         
		} else
		{
			String s = TAG;
	//  120  256:getstatic       #24  <Field String TAG>
	//  121  259:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//  122  261:new             #117 <Class StringBuilder>
	//  123  264:dup             
	//  124  265:invokespecial   #119 <Method void StringBuilder()>
	//  125  268:astore          7
			stringbuilder.append("Unable to set rating to ");
	//  126  270:aload           7
	//  127  272:ldc1            #121 <String "Unable to set rating to ">
	//  128  274:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  129  277:pop             
			stringbuilder.append(f);
	//  130  278:aload           7
	//  131  280:fload_1         
	//  132  281:invokevirtual   #128 <Method StringBuilder StringBuilder.append(float)>
	//  133  284:pop             
			stringbuilder.append(". Rating must be between 0 and ");
	//  134  285:aload           7
	//  135  287:ldc1            #130 <String ". Rating must be between 0 and ">
	//  136  289:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  137  292:pop             
			stringbuilder.append(5);
	//  138  293:aload           7
	//  139  295:iconst_5        
	//  140  296:invokevirtual   #133 <Method StringBuilder StringBuilder.append(int)>
	//  141  299:pop             
			AppboyLogger.e(s, stringbuilder.toString());
	//  142  300:aload           6
	//  143  302:aload           7
	//  144  304:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  145  307:invokestatic    #141 <Method int AppboyLogger.e(String, String)>
	//  146  310:pop             
			return false;
	//  147  311:iconst_0        
	//  148  312:ireturn         
		}
	}

	private static final int MAX_NUMBER_OF_STARS = 5;
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/widget/StarRatingView);
	private float mRating;
	private List mStarRating;

	static 
	{
	//    0    0:ldc1            #2   <Class StarRatingView>
	//    1    2:invokestatic    #22  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String TAG>
	//*   3    8:return          
	}
}
