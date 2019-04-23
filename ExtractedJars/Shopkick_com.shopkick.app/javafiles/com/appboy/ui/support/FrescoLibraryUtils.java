// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.support;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.appboy.Appboy;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

public class FrescoLibraryUtils
{

	public FrescoLibraryUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void Object()>
	//    2    4:return          
	}

	public static boolean canUseFresco(Context context)
	{
		if(sCanUseFrescoSet)
	//*   0    0:getstatic       #38  <Field boolean sCanUseFrescoSet>
	//*   1    3:ifeq            10
			return sCanUseFresco;
	//    2    6:getstatic       #36  <Field boolean sCanUseFresco>
	//    3    9:ireturn         
		if(!getIsFrescoEnabled(context.getApplicationContext()))
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #72  <Method Context Context.getApplicationContext()>
	//*   6   14:invokestatic    #75  <Method boolean getIsFrescoEnabled(Context)>
	//*   7   17:ifne            30
		{
			sCanUseFresco = false;
	//    8   20:iconst_0        
	//    9   21:putstatic       #36  <Field boolean sCanUseFresco>
			sCanUseFrescoSet = true;
	//   10   24:iconst_1        
	//   11   25:putstatic       #38  <Field boolean sCanUseFrescoSet>
			return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
		}
		int j;
		String as[];
		context = ((Context) (((Class) (com/appboy/ui/support/FrescoLibraryUtils)).getClassLoader()));
	//   14   30:ldc1            #2   <Class FrescoLibraryUtils>
	//   15   32:invokevirtual   #81  <Method ClassLoader Class.getClassLoader()>
	//   16   35:astore_0        
		sCanUseFresco = true;
	//   17   36:iconst_1        
	//   18   37:putstatic       #36  <Field boolean sCanUseFresco>
		as = USED_FRESCO_CLASSES;
	//   19   40:getstatic       #54  <Field String[] USED_FRESCO_CLASSES>
	//   20   43:astore_3        
		j = as.length;
	//   21   44:aload_3         
	//   22   45:arraylength     
	//   23   46:istore_2        
		int i = 0;
	//   24   47:iconst_0        
	//   25   48:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   26   49:iload_1         
	//   27   50:iload_2         
	//   28   51:icmpge          97
		if(Class.forName(as[i], false, ((ClassLoader) (context))) == null)
	//*  29   54:aload_3         
	//*  30   55:iload_1         
	//*  31   56:aaload          
	//*  32   57:iconst_0        
	//*  33   58:aload_0         
	//*  34   59:invokestatic    #85  <Method Class Class.forName(String, boolean, ClassLoader)>
	//*  35   62:ifnonnull       72
		{
			sCanUseFresco = false;
	//   36   65:iconst_0        
	//   37   66:putstatic       #36  <Field boolean sCanUseFresco>
			break; /* Loop/switch isn't completed */
	//   38   69:goto            97
		}
		i++;
	//   39   72:iload_1         
	//   40   73:iconst_1        
	//   41   74:iadd            
	//   42   75:istore_1        
		if(true) goto _L2; else goto _L1
	//   43   76:goto            49
_L8:
		sCanUseFresco = false;
	//   44   79:iconst_0        
	//   45   80:putstatic       #36  <Field boolean sCanUseFresco>
		  goto _L1
	//*  46   83:goto            97
_L6:
		sCanUseFresco = false;
	//   47   86:iconst_0        
	//   48   87:putstatic       #36  <Field boolean sCanUseFresco>
		  goto _L1
	//*  49   90:goto            97
_L4:
		sCanUseFresco = false;
	//   50   93:iconst_0        
	//   51   94:putstatic       #36  <Field boolean sCanUseFresco>
_L1:
		sCanUseFrescoSet = true;
	//   52   97:iconst_1        
	//   53   98:putstatic       #38  <Field boolean sCanUseFrescoSet>
		return sCanUseFresco;
	//   54  101:getstatic       #36  <Field boolean sCanUseFresco>
	//   55  104:ireturn         
		context;
	//   56  105:astore_0        
		if(true) goto _L4; else goto _L3
	//   57  106:goto            93
_L3:
		context;
	//   58  109:astore_0        
		if(true) goto _L6; else goto _L5
	//   59  110:goto            86
_L5:
		context;
	//   60  113:astore_0        
		if(true) goto _L8; else goto _L7
_L7:
	//*  61  114:goto            79
	}

	static Uri getFrescoUri(String s)
	{
		Object obj = ((Object) (Uri.parse(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #92  <Method Uri Uri.parse(String)>
	//    2    4:astore_1        
		if(StringUtils.isNullOrBlank(((Uri) (obj)).getScheme()))
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #96  <Method String Uri.getScheme()>
	//*   5    9:invokestatic    #102 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   6   12:ifeq            44
		{
			obj = ((Object) (new StringBuilder()));
	//    7   15:new             #104 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #105 <Method void StringBuilder()>
	//   10   22:astore_1        
			((StringBuilder) (obj)).append("file://");
	//   11   23:aload_1         
	//   12   24:ldc1            #107 <String "file://">
	//   13   26:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			((StringBuilder) (obj)).append(s);
	//   15   30:aload_1         
	//   16   31:aload_0         
	//   17   32:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			return Uri.parse(((StringBuilder) (obj)).toString());
	//   19   36:aload_1         
	//   20   37:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   21   40:invokestatic    #92  <Method Uri Uri.parse(String)>
	//   22   43:areturn         
		} else
		{
			return ((Uri) (obj));
	//   23   44:aload_1         
	//   24   45:areturn         
		}
	}

	private static boolean getIsFrescoEnabled(Context context)
	{
		return (new AppboyConfigurationProvider(context)).getIsFrescoLibraryUseEnabled();
	//    0    0:new             #116 <Class AppboyConfigurationProvider>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #119 <Method void AppboyConfigurationProvider(Context)>
	//    4    8:invokevirtual   #123 <Method boolean AppboyConfigurationProvider.getIsFrescoLibraryUseEnabled()>
	//    5   11:ireturn         
	}

	public static void setDraweeControllerHelper(SimpleDraweeView simpledraweeview, String s, float f, boolean flag)
	{
		setDraweeControllerHelper(simpledraweeview, s, f, flag, ((ControllerListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokestatic    #128 <Method void setDraweeControllerHelper(SimpleDraweeView, String, float, boolean, ControllerListener)>
	//    6    8:return          
	}

	public static void setDraweeControllerHelper(SimpleDraweeView simpledraweeview, String s, float f, boolean flag, ControllerListener controllerlistener)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #102 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            17
		{
			AppboyLogger.w(TAG, "The url set for the Drawee controller was null. Controller not set.");
	//    3    7:getstatic       #34  <Field String TAG>
	//    4   10:ldc1            #132 <String "The url set for the Drawee controller was null. Controller not set.">
	//    5   12:invokestatic    #136 <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return;
	//    7   16:return          
		}
		if(simpledraweeview == null)
	//*   8   17:aload_0         
	//*   9   18:ifnonnull       31
		{
			AppboyLogger.w(TAG, "The SimpleDraweeView set for the Drawee controller was null. Controller not set.");
	//   10   21:getstatic       #34  <Field String TAG>
	//   11   24:ldc1            #138 <String "The SimpleDraweeView set for the Drawee controller was null. Controller not set.">
	//   12   26:invokestatic    #136 <Method int AppboyLogger.w(String, String)>
	//   13   29:pop             
			return;
	//   14   30:return          
		}
		com.facebook.imagepipeline.request.ImageRequest.RequestLevel requestlevel;
		if(Appboy.getOutboundNetworkRequestsOffline())
	//*  15   31:invokestatic    #143 <Method boolean Appboy.getOutboundNetworkRequestsOffline()>
	//*  16   34:ifeq            45
			requestlevel = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.DISK_CACHE;
	//   17   37:getstatic       #149 <Field com.facebook.imagepipeline.request.ImageRequest$RequestLevel com.facebook.imagepipeline.request.ImageRequest$RequestLevel.DISK_CACHE>
	//   18   40:astore          5
		else
	//*  19   42:goto            50
			requestlevel = com.facebook.imagepipeline.request.ImageRequest.RequestLevel.FULL_FETCH;
	//   20   45:getstatic       #152 <Field com.facebook.imagepipeline.request.ImageRequest$RequestLevel com.facebook.imagepipeline.request.ImageRequest$RequestLevel.FULL_FETCH>
	//   21   48:astore          5
		Object obj = ((Object) (TAG));
	//   22   50:getstatic       #34  <Field String TAG>
	//   23   53:astore          6
		StringBuilder stringbuilder = new StringBuilder();
	//   24   55:new             #104 <Class StringBuilder>
	//   25   58:dup             
	//   26   59:invokespecial   #105 <Method void StringBuilder()>
	//   27   62:astore          7
		stringbuilder.append("Setting Fresco image request level to: ");
	//   28   64:aload           7
	//   29   66:ldc1            #154 <String "Setting Fresco image request level to: ">
	//   30   68:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   31   71:pop             
		stringbuilder.append(((Object) (requestlevel)));
	//   32   72:aload           7
	//   33   74:aload           5
	//   34   76:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   35   79:pop             
		AppboyLogger.d(((String) (obj)), stringbuilder.toString());
	//   36   80:aload           6
	//   37   82:aload           7
	//   38   84:invokevirtual   #114 <Method String StringBuilder.toString()>
	//   39   87:invokestatic    #160 <Method int AppboyLogger.d(String, String)>
	//   40   90:pop             
		obj = ((Object) (controllerlistener));
	//   41   91:aload           4
	//   42   93:astore          6
		if(controllerlistener == null)
	//*  43   95:aload           4
	//*  44   97:ifnonnull       112
			obj = ((Object) (new BaseControllerListener(flag, f, simpledraweeview) {

				public void onFinalImageSet(String s1, ImageInfo imageinfo, Animatable animatable)
				{
					if(imageinfo == null)
				//*   0    0:aload_2         
				//*   1    1:ifnonnull       5
						return;
				//    2    4:return          
					float f1;
					if(respectAspectRatio)
				//*   3    5:aload_0         
				//*   4    6:getfield        #22  <Field boolean val$respectAspectRatio>
				//*   5    9:ifeq            21
						f1 = aspectRatio;
				//    6   12:aload_0         
				//    7   13:getfield        #24  <Field float val$aspectRatio>
				//    8   16:fstore          4
					else
				//*   9   18:goto            37
						f1 = imageinfo.getWidth() / imageinfo.getHeight();
				//   10   21:aload_2         
				//   11   22:invokeinterface #38  <Method int ImageInfo.getWidth()>
				//   12   27:aload_2         
				//   13   28:invokeinterface #41  <Method int ImageInfo.getHeight()>
				//   14   33:idiv            
				//   15   34:i2f             
				//   16   35:fstore          4
					simpleDraweeView.post(((_cls1) (f1)). new Runnable() {

						public void run()
						{
							simpleDraweeView.setAspectRatio(imageAspectRatio);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field FrescoLibraryUtils$1 this$0>
						//    2    4:getfield        #30  <Field SimpleDraweeView FrescoLibraryUtils$1.val$simpleDraweeView>
						//    3    7:aload_0         
						//    4    8:getfield        #21  <Field float val$imageAspectRatio>
						//    5   11:invokevirtual   #36  <Method void SimpleDraweeView.setAspectRatio(float)>
						//    6   14:return          
						}

						final _cls1 this$0;
						final float val$imageAspectRatio;

			
			{
				this$0 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FrescoLibraryUtils$1 this$0>
				imageAspectRatio = F.this;
			//    3    5:aload_0         
			//    4    6:fload_2         
			//    5    7:putfield        #21  <Field float val$imageAspectRatio>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
					}
);
				//   17   37:aload_0         
				//   18   38:getfield        #26  <Field SimpleDraweeView val$simpleDraweeView>
				//   19   41:new             #12  <Class FrescoLibraryUtils$1$1>
				//   20   44:dup             
				//   21   45:aload_0         
				//   22   46:fload           4
				//   23   48:invokespecial   #44  <Method void FrescoLibraryUtils$1$1(FrescoLibraryUtils$1, float)>
				//   24   51:invokevirtual   #50  <Method boolean SimpleDraweeView.post(Runnable)>
				//   25   54:pop             
				//   26   55:return          
				}

				public volatile void onFinalImageSet(String s1, Object obj1, Animatable animatable)
				{
					onFinalImageSet(s1, (ImageInfo)obj1, animatable);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #34  <Class ImageInfo>
				//    4    6:aload_3         
				//    5    7:invokevirtual   #53  <Method void onFinalImageSet(String, ImageInfo, Animatable)>
				//    6   10:return          
				}

				final float val$aspectRatio;
				final boolean val$respectAspectRatio;
				final SimpleDraweeView val$simpleDraweeView;

			
			{
				respectAspectRatio = flag;
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:putfield        #22  <Field boolean val$respectAspectRatio>
				aspectRatio = f;
			//    3    5:aload_0         
			//    4    6:fload_2         
			//    5    7:putfield        #24  <Field float val$aspectRatio>
				simpleDraweeView = simpledraweeview;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field SimpleDraweeView val$simpleDraweeView>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void BaseControllerListener()>
			//   11   19:return          
			}
			}
));
	//   45  100:new             #6   <Class FrescoLibraryUtils$1>
	//   46  103:dup             
	//   47  104:iload_3         
	//   48  105:fload_2         
	//   49  106:aload_0         
	//   50  107:invokespecial   #163 <Method void FrescoLibraryUtils$1(boolean, float, SimpleDraweeView)>
	//   51  110:astore          6
		try
		{
			s = ((String) (getFrescoUri(s)));
	//   52  112:aload_1         
	//   53  113:invokestatic    #165 <Method Uri getFrescoUri(String)>
	//   54  116:astore_1        
			controllerlistener = ((ControllerListener) (ImageRequestBuilder.newBuilderWithSource(((Uri) (s))).setLowestPermittedRequestLevel(requestlevel).build()));
	//   55  117:aload_1         
	//   56  118:invokestatic    #171 <Method ImageRequestBuilder ImageRequestBuilder.newBuilderWithSource(Uri)>
	//   57  121:aload           5
	//   58  123:invokevirtual   #175 <Method ImageRequestBuilder ImageRequestBuilder.setLowestPermittedRequestLevel(com.facebook.imagepipeline.request.ImageRequest$RequestLevel)>
	//   59  126:invokevirtual   #179 <Method com.facebook.imagepipeline.request.ImageRequest ImageRequestBuilder.build()>
	//   60  129:astore          4
			simpledraweeview.setController(((com.facebook.drawee.interfaces.DraweeController) (((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)Fresco.newDraweeControllerBuilder().setUri(((Uri) (s))).setAutoPlayAnimations(true)).setTapToRetryEnabled(true)).setControllerListener(((ControllerListener) (obj)))).setImageRequest(((Object) (controllerlistener)))).build())));
	//   61  131:aload_0         
	//   62  132:invokestatic    #185 <Method PipelineDraweeControllerBuilder Fresco.newDraweeControllerBuilder()>
	//   63  135:aload_1         
	//   64  136:invokevirtual   #191 <Method PipelineDraweeControllerBuilder PipelineDraweeControllerBuilder.setUri(Uri)>
	//   65  139:iconst_1        
	//   66  140:invokevirtual   #195 <Method com.facebook.drawee.controller.AbstractDraweeControllerBuilder PipelineDraweeControllerBuilder.setAutoPlayAnimations(boolean)>
	//   67  143:checkcast       #187 <Class PipelineDraweeControllerBuilder>
	//   68  146:iconst_1        
	//   69  147:invokevirtual   #198 <Method com.facebook.drawee.controller.AbstractDraweeControllerBuilder PipelineDraweeControllerBuilder.setTapToRetryEnabled(boolean)>
	//   70  150:checkcast       #187 <Class PipelineDraweeControllerBuilder>
	//   71  153:aload           6
	//   72  155:invokevirtual   #202 <Method com.facebook.drawee.controller.AbstractDraweeControllerBuilder PipelineDraweeControllerBuilder.setControllerListener(ControllerListener)>
	//   73  158:checkcast       #187 <Class PipelineDraweeControllerBuilder>
	//   74  161:aload           4
	//   75  163:invokevirtual   #206 <Method com.facebook.drawee.controller.AbstractDraweeControllerBuilder PipelineDraweeControllerBuilder.setImageRequest(Object)>
	//   76  166:checkcast       #187 <Class PipelineDraweeControllerBuilder>
	//   77  169:invokevirtual   #209 <Method com.facebook.drawee.controller.AbstractDraweeController PipelineDraweeControllerBuilder.build()>
	//   78  172:invokevirtual   #215 <Method void SimpleDraweeView.setController(com.facebook.drawee.interfaces.DraweeController)>
			return;
	//   79  175:return          
		}
	//*  80  176:astore_0        
	//*  81  177:getstatic       #34  <Field String TAG>
	//*  82  180:ldc1            #217 <String "Fresco controller builder could not be retrieved. Fresco most likely prematurely shutdown.">
	//*  83  182:aload_0         
	//*  84  183:invokestatic    #221 <Method int AppboyLogger.e(String, String, Throwable)>
	//*  85  186:pop             
	//*  86  187:return          
		// Misplaced declaration of an exception variable
		catch(SimpleDraweeView simpledraweeview)
	//*  87  188:astore_0        
		{
			AppboyLogger.e(TAG, "Fresco controller builder could not be retrieved. Fresco most likely prematurely shutdown.", ((Throwable) (simpledraweeview)));
	//   88  189:getstatic       #34  <Field String TAG>
	//   89  192:ldc1            #217 <String "Fresco controller builder could not be retrieved. Fresco most likely prematurely shutdown.">
	//   90  194:aload_0         
	//   91  195:invokestatic    #221 <Method int AppboyLogger.e(String, String, Throwable)>
	//   92  198:pop             
		}
		// Misplaced declaration of an exception variable
		catch(SimpleDraweeView simpledraweeview)
		{
			AppboyLogger.e(TAG, "Fresco controller builder could not be retrieved. Fresco most likely prematurely shutdown.", ((Throwable) (simpledraweeview)));
			return;
		}
	//   93  199:return          
	}

	private static final String FILE_SCHEME = "file";
	private static final String HTTPS_SCHEME = "https";
	private static final String HTTP_SCHEME = "http";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/support/FrescoLibraryUtils);
	private static final String USED_FRESCO_CLASSES[] = {
		"com.facebook.drawee.backends.pipeline.Fresco", "com.facebook.drawee.interfaces.DraweeController", "com.facebook.drawee.view.SimpleDraweeView", "com.facebook.drawee.backends.pipeline.Fresco", "com.facebook.drawee.controller.BaseControllerListener", "com.facebook.drawee.controller.ControllerListener", "com.facebook.imagepipeline.image.ImageInfo"
	};
	private static boolean sCanUseFresco = false;
	private static boolean sCanUseFrescoSet = false;

	static 
	{
	//    0    0:ldc1            #2   <Class FrescoLibraryUtils>
	//    1    2:invokestatic    #32  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #34  <Field String TAG>
	//    3    8:iconst_0        
	//    4    9:putstatic       #36  <Field boolean sCanUseFresco>
	//    5   12:iconst_0        
	//    6   13:putstatic       #38  <Field boolean sCanUseFrescoSet>
	//    7   16:bipush          7
	//    8   18:anewarray       String[]
	//    9   21:dup             
	//   10   22:iconst_0        
	//   11   23:ldc1            #42  <String "com.facebook.drawee.backends.pipeline.Fresco">
	//   12   25:aastore         
	//   13   26:dup             
	//   14   27:iconst_1        
	//   15   28:ldc1            #44  <String "com.facebook.drawee.interfaces.DraweeController">
	//   16   30:aastore         
	//   17   31:dup             
	//   18   32:iconst_2        
	//   19   33:ldc1            #46  <String "com.facebook.drawee.view.SimpleDraweeView">
	//   20   35:aastore         
	//   21   36:dup             
	//   22   37:iconst_3        
	//   23   38:ldc1            #42  <String "com.facebook.drawee.backends.pipeline.Fresco">
	//   24   40:aastore         
	//   25   41:dup             
	//   26   42:iconst_4        
	//   27   43:ldc1            #48  <String "com.facebook.drawee.controller.BaseControllerListener">
	//   28   45:aastore         
	//   29   46:dup             
	//   30   47:iconst_5        
	//   31   48:ldc1            #50  <String "com.facebook.drawee.controller.ControllerListener">
	//   32   50:aastore         
	//   33   51:dup             
	//   34   52:bipush          6
	//   35   54:ldc1            #52  <String "com.facebook.imagepipeline.image.ImageInfo">
	//   36   56:aastore         
	//   37   57:putstatic       #54  <Field String[] USED_FRESCO_CLASSES>
	//*  38   60:return          
	}
}
