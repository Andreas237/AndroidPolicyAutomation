// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import java.io.IOException;
import java.util.*;
import junit.framework.Assert;

// Referenced classes of package com.airbnb.lottie:
//			LottieImageAsset, ImageAssetDelegate

class ImageAssetBitmapManager
{

	ImageAssetBitmapManager(android.graphics.drawable.Drawable.Callback callback, String s, ImageAssetDelegate imageassetdelegate, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void HashMap()>
	//    6   12:putfield        #27  <Field Map bitmaps>
		Assert.assertNotNull(((Object) (callback)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #33  <Method void Assert.assertNotNull(Object)>
		imagesFolder = s;
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:putfield        #35  <Field String imagesFolder>
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  12   24:aload_2         
	//*  13   25:invokestatic    #41  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   28:ifne            83
		{
			s = imagesFolder;
	//   15   31:aload_0         
	//   16   32:getfield        #35  <Field String imagesFolder>
	//   17   35:astore_2        
			if(s.charAt(s.length() - 1) != '/')
	//*  18   36:aload_2         
	//*  19   37:aload_2         
	//*  20   38:invokevirtual   #47  <Method int String.length()>
	//*  21   41:iconst_1        
	//*  22   42:isub            
	//*  23   43:invokevirtual   #51  <Method char String.charAt(int)>
	//*  24   46:bipush          47
	//*  25   48:icmpeq          83
			{
				s = ((String) (new StringBuilder()));
	//   26   51:new             #53  <Class StringBuilder>
	//   27   54:dup             
	//   28   55:invokespecial   #54  <Method void StringBuilder()>
	//   29   58:astore_2        
				((StringBuilder) (s)).append(imagesFolder);
	//   30   59:aload_2         
	//   31   60:aload_0         
	//   32   61:getfield        #35  <Field String imagesFolder>
	//   33   64:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
				((StringBuilder) (s)).append('/');
	//   35   68:aload_2         
	//   36   69:bipush          47
	//   37   71:invokevirtual   #61  <Method StringBuilder StringBuilder.append(char)>
	//   38   74:pop             
				imagesFolder = ((StringBuilder) (s)).toString();
	//   39   75:aload_0         
	//   40   76:aload_2         
	//   41   77:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   42   80:putfield        #35  <Field String imagesFolder>
			}
		}
		if(!(callback instanceof View))
	//*  43   83:aload_1         
	//*  44   84:instanceof      #67  <Class View>
	//*  45   87:ifne            115
		{
			Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
	//   46   90:ldc1            #69  <String "LOTTIE">
	//   47   92:ldc1            #71  <String "LottieDrawable must be inside of a view for images to work.">
	//   48   94:invokestatic    #77  <Method int Log.w(String, String)>
	//   49   97:pop             
			imageAssets = ((Map) (new HashMap()));
	//   50   98:aload_0         
	//   51   99:new             #24  <Class HashMap>
	//   52  102:dup             
	//   53  103:invokespecial   #25  <Method void HashMap()>
	//   54  106:putfield        #79  <Field Map imageAssets>
			context = null;
	//   55  109:aload_0         
	//   56  110:aconst_null     
	//   57  111:putfield        #81  <Field Context context>
			return;
	//   58  114:return          
		} else
		{
			context = ((View)callback).getContext();
	//   59  115:aload_0         
	//   60  116:aload_1         
	//   61  117:checkcast       #67  <Class View>
	//   62  120:invokevirtual   #85  <Method Context View.getContext()>
	//   63  123:putfield        #81  <Field Context context>
			imageAssets = map;
	//   64  126:aload_0         
	//   65  127:aload           4
	//   66  129:putfield        #79  <Field Map imageAssets>
			setAssetDelegate(imageassetdelegate);
	//   67  132:aload_0         
	//   68  133:aload_3         
	//   69  134:invokevirtual   #89  <Method void setAssetDelegate(ImageAssetDelegate)>
			return;
	//   70  137:return          
		}
	}

	Bitmap bitmapForId(String s)
	{
		Object obj;
		obj = ((Object) ((Bitmap)bitmaps.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Map bitmaps>
	//    2    4:aload_1         
	//    3    5:invokeinterface #102 <Method Object Map.get(Object)>
	//    4   10:checkcast       #104 <Class Bitmap>
	//    5   13:astore_2        
		if(obj != null)
			break MISSING_BLOCK_LABEL_189;
	//    6   14:aload_2         
	//    7   15:ifnonnull       189
		obj = ((Object) ((LottieImageAsset)imageAssets.get(((Object) (s)))));
	//    8   18:aload_0         
	//    9   19:getfield        #79  <Field Map imageAssets>
	//   10   22:aload_1         
	//   11   23:invokeinterface #102 <Method Object Map.get(Object)>
	//   12   28:checkcast       #106 <Class LottieImageAsset>
	//   13   31:astore_2        
		if(obj == null)
	//*  14   32:aload_2         
	//*  15   33:ifnonnull       38
			return null;
	//   16   36:aconst_null     
	//   17   37:areturn         
		ImageAssetDelegate imageassetdelegate = assetDelegate;
	//   18   38:aload_0         
	//   19   39:getfield        #108 <Field ImageAssetDelegate assetDelegate>
	//   20   42:astore_3        
		if(imageassetdelegate != null)
	//*  21   43:aload_3         
	//*  22   44:ifnull          69
		{
			obj = ((Object) (imageassetdelegate.fetchBitmap(((LottieImageAsset) (obj)))));
	//   23   47:aload_3         
	//   24   48:aload_2         
	//   25   49:invokeinterface #114 <Method Bitmap ImageAssetDelegate.fetchBitmap(LottieImageAsset)>
	//   26   54:astore_2        
			bitmaps.put(((Object) (s)), obj);
	//   27   55:aload_0         
	//   28   56:getfield        #27  <Field Map bitmaps>
	//   29   59:aload_1         
	//   30   60:aload_2         
	//   31   61:invokeinterface #118 <Method Object Map.put(Object, Object)>
	//   32   66:pop             
			return ((Bitmap) (obj));
	//   33   67:aload_2         
	//   34   68:areturn         
		}
		if(TextUtils.isEmpty(((CharSequence) (imagesFolder))))
			break MISSING_BLOCK_LABEL_167;
	//   35   69:aload_0         
	//   36   70:getfield        #35  <Field String imagesFolder>
	//   37   73:invokestatic    #41  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   38   76:ifne            167
		AssetManager assetmanager = context.getAssets();
	//   39   79:aload_0         
	//   40   80:getfield        #81  <Field Context context>
	//   41   83:invokevirtual   #124 <Method AssetManager Context.getAssets()>
	//   42   86:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   43   87:new             #53  <Class StringBuilder>
	//   44   90:dup             
	//   45   91:invokespecial   #54  <Method void StringBuilder()>
	//   46   94:astore          4
		stringbuilder.append(imagesFolder);
	//   47   96:aload           4
	//   48   98:aload_0         
	//   49   99:getfield        #35  <Field String imagesFolder>
	//   50  102:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   51  105:pop             
		stringbuilder.append(((LottieImageAsset) (obj)).getFileName());
	//   52  106:aload           4
	//   53  108:aload_2         
	//   54  109:invokevirtual   #127 <Method String LottieImageAsset.getFileName()>
	//   55  112:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   56  115:pop             
		obj = ((Object) (assetmanager.open(stringbuilder.toString())));
	//   57  116:aload_3         
	//   58  117:aload           4
	//   59  119:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   60  122:invokevirtual   #133 <Method java.io.InputStream AssetManager.open(String)>
	//   61  125:astore_2        
		android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
	//   62  126:new             #135 <Class android.graphics.BitmapFactory$Options>
	//   63  129:dup             
	//   64  130:invokespecial   #136 <Method void android.graphics.BitmapFactory$Options()>
	//   65  133:astore_3        
		options.inScaled = true;
	//   66  134:aload_3         
	//   67  135:iconst_1        
	//   68  136:putfield        #140 <Field boolean android.graphics.BitmapFactory$Options.inScaled>
		options.inDensity = 160;
	//   69  139:aload_3         
	//   70  140:sipush          160
	//   71  143:putfield        #144 <Field int android.graphics.BitmapFactory$Options.inDensity>
		obj = ((Object) (BitmapFactoryInstrumentation.decodeStream(((java.io.InputStream) (obj)), ((android.graphics.Rect) (null)), options)));
	//   72  146:aload_2         
	//   73  147:aconst_null     
	//   74  148:aload_3         
	//   75  149:invokestatic    #150 <Method Bitmap BitmapFactoryInstrumentation.decodeStream(java.io.InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   76  152:astore_2        
		bitmaps.put(((Object) (s)), obj);
	//   77  153:aload_0         
	//   78  154:getfield        #27  <Field Map bitmaps>
	//   79  157:aload_1         
	//   80  158:aload_2         
	//   81  159:invokeinterface #118 <Method Object Map.put(Object, Object)>
	//   82  164:pop             
		return ((Bitmap) (obj));
	//   83  165:aload_2         
	//   84  166:areturn         
		try
		{
			throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
	//   85  167:new             #152 <Class IllegalStateException>
	//   86  170:dup             
	//   87  171:ldc1            #154 <String "You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder">
	//   88  173:invokespecial   #157 <Method void IllegalStateException(String)>
	//   89  176:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  90  177:astore_1        
		{
			Log.w("LOTTIE", "Unable to open asset.", ((Throwable) (s)));
	//   91  178:ldc1            #69  <String "LOTTIE">
	//   92  180:ldc1            #159 <String "Unable to open asset.">
	//   93  182:aload_1         
	//   94  183:invokestatic    #162 <Method int Log.w(String, String, Throwable)>
	//   95  186:pop             
		}
		return null;
	//   96  187:aconst_null     
	//   97  188:areturn         
		return ((Bitmap) (obj));
	//   98  189:aload_2         
	//   99  190:areturn         
	}

	boolean hasSameContext(Context context1)
	{
		return context1 == null && context == null || context1 != null && ((Object) (context)).equals(((Object) (context1)));
	//    0    0:aload_1         
	//    1    1:ifnonnull       11
	//    2    4:aload_0         
	//    3    5:getfield        #81  <Field Context context>
	//    4    8:ifnull          26
	//    5   11:aload_1         
	//    6   12:ifnull          28
	//    7   15:aload_0         
	//    8   16:getfield        #81  <Field Context context>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #169 <Method boolean Object.equals(Object)>
	//   11   23:ifeq            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	void recycleBitmaps()
	{
		for(Iterator iterator = bitmaps.entrySet().iterator(); iterator.hasNext(); iterator.remove())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Map bitmaps>
	//*   2    4:invokeinterface #174 <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #180 <Method Iterator Set.iterator()>
	//*   4   14:astore_1        
	//*   5   15:aload_1         
	//*   6   16:invokeinterface #186 <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            53
			((Bitmap)((java.util.Map.Entry)iterator.next()).getValue()).recycle();
	//    8   24:aload_1         
	//    9   25:invokeinterface #190 <Method Object Iterator.next()>
	//   10   30:checkcast       #192 <Class java.util.Map$Entry>
	//   11   33:invokeinterface #195 <Method Object java.util.Map$Entry.getValue()>
	//   12   38:checkcast       #104 <Class Bitmap>
	//   13   41:invokevirtual   #198 <Method void Bitmap.recycle()>

	//   14   44:aload_1         
	//   15   45:invokeinterface #201 <Method void Iterator.remove()>
	//*  16   50:goto            15
	//   17   53:return          
	}

	void setAssetDelegate(ImageAssetDelegate imageassetdelegate)
	{
		assetDelegate = imageassetdelegate;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field ImageAssetDelegate assetDelegate>
	//    3    5:return          
	}

	private ImageAssetDelegate assetDelegate;
	private final Map bitmaps = new HashMap();
	private final Context context;
	private final Map imageAssets;
	private String imagesFolder;
}
