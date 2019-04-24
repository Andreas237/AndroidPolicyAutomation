// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.common.a;
import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.nativead:
//			NativeAdInterface, NativeAdPreferences

public class NativeAdDetails
	implements NativeAdInterface
{
	protected static interface a
	{

		public abstract void onNativeAdDetailsLoaded(int i);
	}


	public NativeAdDetails(AdDetails addetails, NativeAdPreferences nativeadpreferences, int i, a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		f = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #36  <Field boolean f>
		com.startapp.common.a.g.a("StartAppNativeAd", 3, (new StringBuilder()).append("Initializiang SingleAd [").append(i).append("]").toString());
	//    5    9:ldc1            #38  <String "StartAppNativeAd">
	//    6   11:iconst_3        
	//    7   12:new             #40  <Class StringBuilder>
	//    8   15:dup             
	//    9   16:invokespecial   #41  <Method void StringBuilder()>
	//   10   19:ldc1            #43  <String "Initializiang SingleAd [">
	//   11   21:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:iload_3         
	//   13   25:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   14   28:ldc1            #52  <String "]">
	//   15   30:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   17   36:invokestatic    #61  <Method void g.a(String, int, String)>
		c = addetails;
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:putfield        #63  <Field AdDetails c>
		a = i;
	//   21   44:aload_0         
	//   22   45:iload_3         
	//   23   46:putfield        #65  <Field int a>
		b = a1;
	//   24   49:aload_0         
	//   25   50:aload           4
	//   26   52:putfield        #67  <Field NativeAdDetails$a b>
		if(nativeadpreferences.isAutoBitmapDownload())
	//*  27   55:aload_2         
	//*  28   56:invokevirtual   #73  <Method boolean NativeAdPreferences.isAutoBitmapDownload()>
	//*  29   59:ifeq            86
		{
			(new com.startapp.common.a(getImageUrl(), new com.startapp.common.a.a() {

				public void a(Bitmap bitmap, int j)
				{
					a.a(bitmap);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field NativeAdDetails a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #26  <Method void com.startapp.android.publish.ads.nativead.NativeAdDetails.a(Bitmap)>
					(new com.startapp.common.a(a.getSecondaryImageUrl(), new com.startapp.common.a.a(this) {

						public void a(Bitmap bitmap, int i)
						{
							a.a.b(bitmap);
						//    0    0:aload_0         
						//    1    1:getfield        #16  <Field NativeAdDetails$1 a>
						//    2    4:getfield        #23  <Field NativeAdDetails com.startapp.android.publish.ads.nativead.NativeAdDetails$1.a>
						//    3    7:aload_1         
						//    4    8:invokevirtual   #29  <Method void com.startapp.android.publish.ads.nativead.NativeAdDetails.b(Bitmap)>
							a.a.a();
						//    5   11:aload_0         
						//    6   12:getfield        #16  <Field NativeAdDetails$1 a>
						//    7   15:getfield        #23  <Field NativeAdDetails com.startapp.android.publish.ads.nativead.NativeAdDetails$1.a>
						//    8   18:invokevirtual   #31  <Method void com.startapp.android.publish.ads.nativead.NativeAdDetails.a()>
						//    9   21:return          
						}

						final _cls1 a;

			
			{
				a = _pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NativeAdDetails$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
, j)).a();
				//    4    8:new             #28  <Class a>
				//    5   11:dup             
				//    6   12:aload_0         
				//    7   13:getfield        #18  <Field NativeAdDetails a>
				//    8   16:invokevirtual   #32  <Method String NativeAdDetails.getSecondaryImageUrl()>
				//    9   19:new             #13  <Class NativeAdDetails$1$1>
				//   10   22:dup             
				//   11   23:aload_0         
				//   12   24:invokespecial   #35  <Method void NativeAdDetails$1$1(NativeAdDetails$1)>
				//   13   27:iload_2         
				//   14   28:invokespecial   #38  <Method void a(String, com.startapp.common.a$a, int)>
				//   15   31:invokevirtual   #40  <Method void a.a()>
				//   16   34:return          
				}

				final NativeAdDetails a;

			
			{
				a = NativeAdDetails.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field NativeAdDetails a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
, i)).a();
	//   30   62:new             #75  <Class a>
	//   31   65:dup             
	//   32   66:aload_0         
	//   33   67:invokevirtual   #78  <Method String getImageUrl()>
	//   34   70:new             #8   <Class NativeAdDetails$1>
	//   35   73:dup             
	//   36   74:aload_0         
	//   37   75:invokespecial   #81  <Method void NativeAdDetails$1(NativeAdDetails)>
	//   38   78:iload_3         
	//   39   79:invokespecial   #84  <Method void a(String, com.startapp.common.a$a, int)>
	//   40   82:invokevirtual   #86  <Method void a.a()>
			return;
	//   41   85:return          
		} else
		{
			a();
	//   42   86:aload_0         
	//   43   87:invokevirtual   #87  <Method void a()>
			return;
	//   44   90:return          
		}
	}

	void a()
	{
		(new Handler()).post(new Runnable() {

			public void run()
			{
				com.startapp.common.a.g.a("StartAppNativeAd", 3, (new StringBuilder()).append("SingleAd [").append(a.a).append("] Loaded").toString());
			//    0    0:ldc1            #22  <String "StartAppNativeAd">
			//    1    2:iconst_3        
			//    2    3:new             #24  <Class StringBuilder>
			//    3    6:dup             
			//    4    7:invokespecial   #25  <Method void StringBuilder()>
			//    5   10:ldc1            #27  <String "SingleAd [">
			//    6   12:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//    7   15:aload_0         
			//    8   16:getfield        #16  <Field NativeAdDetails a>
			//    9   19:getfield        #34  <Field int com.startapp.android.publish.ads.nativead.NativeAdDetails.a>
			//   10   22:invokevirtual   #37  <Method StringBuilder StringBuilder.append(int)>
			//   11   25:ldc1            #39  <String "] Loaded">
			//   12   27:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//   13   30:invokevirtual   #43  <Method String StringBuilder.toString()>
			//   14   33:invokestatic    #48  <Method void g.a(String, int, String)>
				if(a.b != null)
			//*  15   36:aload_0         
			//*  16   37:getfield        #16  <Field NativeAdDetails a>
			//*  17   40:getfield        #52  <Field NativeAdDetails$a com.startapp.android.publish.ads.nativead.NativeAdDetails.b>
			//*  18   43:ifnull          65
					a.b.onNativeAdDetailsLoaded(a.a);
			//   19   46:aload_0         
			//   20   47:getfield        #16  <Field NativeAdDetails a>
			//   21   50:getfield        #52  <Field NativeAdDetails$a com.startapp.android.publish.ads.nativead.NativeAdDetails.b>
			//   22   53:aload_0         
			//   23   54:getfield        #16  <Field NativeAdDetails a>
			//   24   57:getfield        #34  <Field int com.startapp.android.publish.ads.nativead.NativeAdDetails.a>
			//   25   60:invokeinterface #58  <Method void NativeAdDetails$a.onNativeAdDetailsLoaded(int)>
			//   26   65:return          
			}

			final NativeAdDetails a;

			
			{
				a = NativeAdDetails.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NativeAdDetails a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:new             #90  <Class Handler>
	//    1    3:dup             
	//    2    4:invokespecial   #91  <Method void Handler()>
	//    3    7:new             #12  <Class NativeAdDetails$2>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #92  <Method void NativeAdDetails$2(NativeAdDetails)>
	//    7   15:invokevirtual   #96  <Method boolean Handler.post(Runnable)>
	//    8   18:pop             
	//    9   19:return          
	}

	void a(Bitmap bitmap)
	{
		d = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field Bitmap d>
	//    3    5:return          
	}

	protected void a(String s)
	{
		g = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field String g>
	//    3    5:return          
	}

	protected AdDetails b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field AdDetails c>
	//    2    4:areturn         
	}

	void b(Bitmap bitmap)
	{
		e = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field Bitmap e>
	//    3    5:return          
	}

	public StartAppNativeAd.b getCampaignAction()
	{
		StartAppNativeAd.b b2 = com.startapp.android.publish.ads.nativead.StartAppNativeAd.b.b;
	//    0    0:getstatic       #112 <Field StartAppNativeAd$b com.startapp.android.publish.ads.nativead.StartAppNativeAd$b.b>
	//    1    3:astore_2        
		StartAppNativeAd.b b1 = b2;
	//    2    4:aload_2         
	//    3    5:astore_1        
		if(c != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #63  <Field AdDetails c>
	//*   6   10:ifnull          29
		{
			b1 = b2;
	//    7   13:aload_2         
	//    8   14:astore_1        
			if(c.isCPE())
	//*   9   15:aload_0         
	//*  10   16:getfield        #63  <Field AdDetails c>
	//*  11   19:invokevirtual   #117 <Method boolean AdDetails.isCPE()>
	//*  12   22:ifeq            29
				b1 = com.startapp.android.publish.ads.nativead.StartAppNativeAd.b.a;
	//   13   25:getstatic       #119 <Field StartAppNativeAd$b com.startapp.android.publish.ads.nativead.StartAppNativeAd$b.a>
	//   14   28:astore_1        
		}
		return b1;
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public String getCategory()
	{
		String s = "";
	//    0    0:ldc1            #122 <String "">
	//    1    2:astore_1        
		if(c != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #63  <Field AdDetails c>
	//*   4    7:ifnull          18
			s = c.getCategory();
	//    5   10:aload_0         
	//    6   11:getfield        #63  <Field AdDetails c>
	//    7   14:invokevirtual   #124 <Method String AdDetails.getCategory()>
	//    8   17:astore_1        
		return s;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public String getDescription()
	{
		String s = "";
	//    0    0:ldc1            #122 <String "">
	//    1    2:astore_1        
		if(c != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #63  <Field AdDetails c>
	//*   4    7:ifnull          18
			s = c.getDescription();
	//    5   10:aload_0         
	//    6   11:getfield        #63  <Field AdDetails c>
	//    7   14:invokevirtual   #127 <Method String AdDetails.getDescription()>
	//    8   17:astore_1        
		return s;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public Bitmap getImageBitmap()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Bitmap d>
	//    2    4:areturn         
	}

	public String getImageUrl()
	{
		String s = "";
	//    0    0:ldc1            #122 <String "">
	//    1    2:astore_1        
		if(c != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #63  <Field AdDetails c>
	//*   4    7:ifnull          18
			s = c.getImageUrl();
	//    5   10:aload_0         
	//    6   11:getfield        #63  <Field AdDetails c>
	//    7   14:invokevirtual   #130 <Method String AdDetails.getImageUrl()>
	//    8   17:astore_1        
		return s;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public String getInstalls()
	{
		String s = "";
	//    0    0:ldc1            #122 <String "">
	//    1    2:astore_1        
		if(c != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #63  <Field AdDetails c>
	//*   4    7:ifnull          18
			s = c.getInstalls();
	//    5   10:aload_0         
	//    6   11:getfield        #63  <Field AdDetails c>
	//    7   14:invokevirtual   #133 <Method String AdDetails.getInstalls()>
	//    8   17:astore_1        
		return s;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public String getPackacgeName()
	{
		String s = "";
	//    0    0:ldc1            #122 <String "">
	//    1    2:astore_1        
		if(c != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #63  <Field AdDetails c>
	//*   4    7:ifnull          18
			s = c.getPackageName();
	//    5   10:aload_0         
	//    6   11:getfield        #63  <Field AdDetails c>
	//    7   14:invokevirtual   #137 <Method String AdDetails.getPackageName()>
	//    8   17:astore_1        
		return s;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public float getRating()
	{
		float f1 = 5F;
	//    0    0:ldc1            #140 <Float 5F>
	//    1    2:fstore_1        
		if(c != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #63  <Field AdDetails c>
	//*   4    7:ifnull          18
			f1 = c.getRating();
	//    5   10:aload_0         
	//    6   11:getfield        #63  <Field AdDetails c>
	//    7   14:invokevirtual   #142 <Method float AdDetails.getRating()>
	//    8   17:fstore_1        
		return f1;
	//    9   18:fload_1         
	//   10   19:freturn         
	}

	public Bitmap getSecondaryImageBitmap()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Bitmap e>
	//    2    4:areturn         
	}

	public String getSecondaryImageUrl()
	{
		String s = "";
	//    0    0:ldc1            #122 <String "">
	//    1    2:astore_1        
		if(c != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #63  <Field AdDetails c>
	//*   4    7:ifnull          18
			s = c.getSecondaryImageUrl();
	//    5   10:aload_0         
	//    6   11:getfield        #63  <Field AdDetails c>
	//    7   14:invokevirtual   #146 <Method String AdDetails.getSecondaryImageUrl()>
	//    8   17:astore_1        
		return s;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public String getTitle()
	{
		String s = "";
	//    0    0:ldc1            #122 <String "">
	//    1    2:astore_1        
		if(c != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #63  <Field AdDetails c>
	//*   4    7:ifnull          18
			s = c.getTitle();
	//    5   10:aload_0         
	//    6   11:getfield        #63  <Field AdDetails c>
	//    7   14:invokevirtual   #149 <Method String AdDetails.getTitle()>
	//    8   17:astore_1        
		return s;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public Boolean isApp()
	{
		Boolean boolean1 = Boolean.valueOf(true);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #157 <Method Boolean Boolean.valueOf(boolean)>
	//    2    4:astore_1        
		if(c != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #63  <Field AdDetails c>
	//*   5    9:ifnull          23
			boolean1 = Boolean.valueOf(c.isApp());
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field AdDetails c>
	//    8   16:invokevirtual   #159 <Method boolean AdDetails.isApp()>
	//    9   19:invokestatic    #157 <Method Boolean Boolean.valueOf(boolean)>
	//   10   22:astore_1        
		return boolean1;
	//   11   23:aload_1         
	//   12   24:areturn         
	}

	public void sendClick(Context context)
	{
		if(c == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field AdDetails c>
	//    2    4:ifnull          40
_L1:
		static class _cls3
		{

			static final int a[];

			static 
			{
				a = new int[StartAppNativeAd.b.values().length];
			//    0    0:invokestatic    #18  <Method StartAppNativeAd$b[] StartAppNativeAd$b.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[com.startapp.android.publish.ads.nativead.StartAppNativeAd.b.b.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field StartAppNativeAd$b com.startapp.android.publish.ads.nativead.StartAppNativeAd$b.b>
			//    6   15:invokevirtual   #28  <Method int StartAppNativeAd$b.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #30  <Field StartAppNativeAd$b com.startapp.android.publish.ads.nativead.StartAppNativeAd$b.a>
			//*  11   26:invokevirtual   #28  <Method int StartAppNativeAd$b.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
			//*  15   32:astore_0        
			//*  16   33:return          
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   34:astore_0        
				try
				{
					a[com.startapp.android.publish.ads.nativead.StartAppNativeAd.b.a.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  18   35:goto            20
			}
		}

		com.startapp.android.publish.ads.nativead._cls3.a[getCampaignAction().ordinal()];
	//    3    7:getstatic       #164 <Field int[] com.startapp.android.publish.ads.nativead.NativeAdDetails$3.a>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #166 <Method StartAppNativeAd$b getCampaignAction()>
	//    6   14:invokevirtual   #170 <Method int StartAppNativeAd$b.ordinal()>
	//    7   17:iaload          
		JVM INSTR tableswitch 1 2: default 40
	//	               1 41
	//	               2 184;
	//    8   18:tableswitch     1 2: default 40
	//	               1 41
	//	               2 184
		   goto _L2 _L3 _L4
_L2:
		return;
	//    9   40:return          
_L3:
		boolean flag = com.startapp.android.publish.adsCommon.c.a(context, com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_NATIVE);
	//   10   41:aload_1         
	//   11   42:getstatic       #176 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_NATIVE>
	//   12   45:invokestatic    #181 <Method boolean c.a(Context, com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//   13   48:istore_2        
		if(c.isSmartRedirect() && !flag)
	//*  14   49:aload_0         
	//*  15   50:getfield        #63  <Field AdDetails c>
	//*  16   53:invokevirtual   #184 <Method boolean AdDetails.isSmartRedirect()>
	//*  17   56:ifeq            121
	//*  18   59:iload_2         
	//*  19   60:ifne            121
		{
			com.startapp.android.publish.adsCommon.c.a(context, c.getClickUrl(), c.getTrackingClickUrl(), c.getPackageName(), new b(g), com.startapp.android.publish.adsCommon.b.a().A(), c.isStartappBrowserEnabled(), c.shouldSendRedirectHops(), false);
	//   20   63:aload_1         
	//   21   64:aload_0         
	//   22   65:getfield        #63  <Field AdDetails c>
	//   23   68:invokevirtual   #187 <Method String AdDetails.getClickUrl()>
	//   24   71:aload_0         
	//   25   72:getfield        #63  <Field AdDetails c>
	//   26   75:invokevirtual   #190 <Method String AdDetails.getTrackingClickUrl()>
	//   27   78:aload_0         
	//   28   79:getfield        #63  <Field AdDetails c>
	//   29   82:invokevirtual   #137 <Method String AdDetails.getPackageName()>
	//   30   85:new             #192 <Class b>
	//   31   88:dup             
	//   32   89:aload_0         
	//   33   90:getfield        #102 <Field String g>
	//   34   93:invokespecial   #194 <Method void b(String)>
	//   35   96:invokestatic    #199 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//   36   99:invokevirtual   #203 <Method long com.startapp.android.publish.adsCommon.b.A()>
	//   37  102:aload_0         
	//   38  103:getfield        #63  <Field AdDetails c>
	//   39  106:invokevirtual   #206 <Method boolean AdDetails.isStartappBrowserEnabled()>
	//   40  109:aload_0         
	//   41  110:getfield        #63  <Field AdDetails c>
	//   42  113:invokevirtual   #209 <Method Boolean AdDetails.shouldSendRedirectHops()>
	//   43  116:iconst_0        
	//   44  117:invokestatic    #212 <Method void c.a(Context, String, String, String, b, long, boolean, Boolean, boolean)>
			return;
	//   45  120:return          
		}
		String s = c.getClickUrl();
	//   46  121:aload_0         
	//   47  122:getfield        #63  <Field AdDetails c>
	//   48  125:invokevirtual   #187 <Method String AdDetails.getClickUrl()>
	//   49  128:astore_3        
		String s1 = c.getTrackingClickUrl();
	//   50  129:aload_0         
	//   51  130:getfield        #63  <Field AdDetails c>
	//   52  133:invokevirtual   #190 <Method String AdDetails.getTrackingClickUrl()>
	//   53  136:astore          4
		b b1 = new b(g);
	//   54  138:new             #192 <Class b>
	//   55  141:dup             
	//   56  142:aload_0         
	//   57  143:getfield        #102 <Field String g>
	//   58  146:invokespecial   #194 <Method void b(String)>
	//   59  149:astore          5
		if(c.isStartappBrowserEnabled() && !flag)
	//*  60  151:aload_0         
	//*  61  152:getfield        #63  <Field AdDetails c>
	//*  62  155:invokevirtual   #206 <Method boolean AdDetails.isStartappBrowserEnabled()>
	//*  63  158:ifeq            179
	//*  64  161:iload_2         
	//*  65  162:ifne            179
			flag = true;
	//   66  165:iconst_1        
	//   67  166:istore_2        
		else
	//*  68  167:aload_1         
	//*  69  168:aload_3         
	//*  70  169:aload           4
	//*  71  171:aload           5
	//*  72  173:iload_2         
	//*  73  174:iconst_0        
	//*  74  175:invokestatic    #215 <Method void c.a(Context, String, String, b, boolean, boolean)>
	//*  75  178:return          
			flag = false;
	//   76  179:iconst_0        
	//   77  180:istore_2        
		com.startapp.android.publish.adsCommon.c.a(context, s, s1, b1, flag, false);
		return;
	//*  78  181:goto            167
_L4:
		com.startapp.android.publish.adsCommon.c.a(getPackacgeName(), c.getIntentDetails(), c.getClickUrl(), context, new b(g));
	//   79  184:aload_0         
	//   80  185:invokevirtual   #217 <Method String getPackacgeName()>
	//   81  188:aload_0         
	//   82  189:getfield        #63  <Field AdDetails c>
	//   83  192:invokevirtual   #220 <Method String AdDetails.getIntentDetails()>
	//   84  195:aload_0         
	//   85  196:getfield        #63  <Field AdDetails c>
	//   86  199:invokevirtual   #187 <Method String AdDetails.getClickUrl()>
	//   87  202:aload_1         
	//   88  203:new             #192 <Class b>
	//   89  206:dup             
	//   90  207:aload_0         
	//   91  208:getfield        #102 <Field String g>
	//   92  211:invokespecial   #194 <Method void b(String)>
	//   93  214:invokestatic    #223 <Method void c.a(String, String, String, Context, b)>
		return;
	//   94  217:return          
	}

	public void sendImpression(Context context)
	{
		if(!f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean f>
	//*   2    4:ifne            76
		{
			f = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #36  <Field boolean f>
			if(c == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #63  <Field AdDetails c>
	//*   8   16:ifnonnull       20
			{
				return;
	//    9   19:return          
			} else
			{
				com.startapp.common.a.g.a("StartAppNativeAd", 3, (new StringBuilder()).append("Sending Impression for [").append(a).append("]").toString());
	//   10   20:ldc1            #38  <String "StartAppNativeAd">
	//   11   22:iconst_3        
	//   12   23:new             #40  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #41  <Method void StringBuilder()>
	//   15   30:ldc1            #226 <String "Sending Impression for [">
	//   16   32:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:aload_0         
	//   18   36:getfield        #65  <Field int a>
	//   19   39:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   20   42:ldc1            #52  <String "]">
	//   21   44:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   22   47:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   23   50:invokestatic    #61  <Method void g.a(String, int, String)>
				com.startapp.android.publish.adsCommon.c.a(context, c.getTrackingUrl(), new b(g));
	//   24   53:aload_1         
	//   25   54:aload_0         
	//   26   55:getfield        #63  <Field AdDetails c>
	//   27   58:invokevirtual   #229 <Method String AdDetails.getTrackingUrl()>
	//   28   61:new             #192 <Class b>
	//   29   64:dup             
	//   30   65:aload_0         
	//   31   66:getfield        #102 <Field String g>
	//   32   69:invokespecial   #194 <Method void b(String)>
	//   33   72:invokestatic    #232 <Method void c.a(Context, String, b)>
				return;
	//   34   75:return          
			}
		} else
		{
			com.startapp.common.a.g.a("StartAppNativeAd", 3, (new StringBuilder()).append("Already sent impression for [").append(a).append("]").toString());
	//   35   76:ldc1            #38  <String "StartAppNativeAd">
	//   36   78:iconst_3        
	//   37   79:new             #40  <Class StringBuilder>
	//   38   82:dup             
	//   39   83:invokespecial   #41  <Method void StringBuilder()>
	//   40   86:ldc1            #234 <String "Already sent impression for [">
	//   41   88:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   42   91:aload_0         
	//   43   92:getfield        #65  <Field int a>
	//   44   95:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   45   98:ldc1            #52  <String "]">
	//   46  100:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   47  103:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   48  106:invokestatic    #61  <Method void g.a(String, int, String)>
			return;
	//   49  109:return          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append("         Title: [").append(getTitle()).append("]\n").append("         Description: [").append(getDescription().substring(0, 30)).append("]...\n").append("         Rating: [").append(getRating()).append("]\n").append("         Installs: [").append(getInstalls()).append("]\n").append("         Category: [").append(getCategory()).append("]\n").append("         PackageName: [").append(getPackacgeName()).append("]\n").append("         CampaginAction: [").append(((Object) (getCampaignAction()))).append("]\n").toString();
	//    0    0:new             #40  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void StringBuilder()>
	//    3    7:ldc1            #236 <String "         Title: [">
	//    4    9:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #237 <Method String getTitle()>
	//    7   16:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:ldc1            #239 <String "]\n">
	//    9   21:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:ldc1            #241 <String "         Description: [">
	//   11   26:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   29:aload_0         
	//   13   30:invokevirtual   #242 <Method String getDescription()>
	//   14   33:iconst_0        
	//   15   34:bipush          30
	//   16   36:invokevirtual   #248 <Method String String.substring(int, int)>
	//   17   39:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   18   42:ldc1            #250 <String "]...\n">
	//   19   44:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   20   47:ldc1            #252 <String "         Rating: [">
	//   21   49:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   22   52:aload_0         
	//   23   53:invokevirtual   #253 <Method float getRating()>
	//   24   56:invokevirtual   #256 <Method StringBuilder StringBuilder.append(float)>
	//   25   59:ldc1            #239 <String "]\n">
	//   26   61:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   27   64:ldc2            #258 <String "         Installs: [">
	//   28   67:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   29   70:aload_0         
	//   30   71:invokevirtual   #259 <Method String getInstalls()>
	//   31   74:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   32   77:ldc1            #239 <String "]\n">
	//   33   79:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   34   82:ldc2            #261 <String "         Category: [">
	//   35   85:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   36   88:aload_0         
	//   37   89:invokevirtual   #262 <Method String getCategory()>
	//   38   92:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   39   95:ldc1            #239 <String "]\n">
	//   40   97:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   41  100:ldc2            #264 <String "         PackageName: [">
	//   42  103:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   43  106:aload_0         
	//   44  107:invokevirtual   #217 <Method String getPackacgeName()>
	//   45  110:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   46  113:ldc1            #239 <String "]\n">
	//   47  115:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   48  118:ldc2            #266 <String "         CampaginAction: [">
	//   49  121:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   50  124:aload_0         
	//   51  125:invokevirtual   #166 <Method StartAppNativeAd$b getCampaignAction()>
	//   52  128:invokevirtual   #269 <Method StringBuilder StringBuilder.append(Object)>
	//   53  131:ldc1            #239 <String "]\n">
	//   54  133:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   55  136:invokevirtual   #56  <Method String StringBuilder.toString()>
	//   56  139:areturn         
	}

	int a;
	a b;
	private AdDetails c;
	private Bitmap d;
	private Bitmap e;
	private boolean f;
	private String g;
}
