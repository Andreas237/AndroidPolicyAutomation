// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.android.publish.ads.banner.BannerOptions;
import com.startapp.android.publish.adsCommon.Utils.h;
import com.startapp.android.publish.adsCommon.c;
import com.startapp.android.publish.adsCommon.d.b;
import com.startapp.android.publish.adsCommon.i;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.android.publish.common.model.AdDetails;
import com.startapp.common.a;
import com.startapp.common.a.g;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.startapp.android.publish.ads.banner.banner3d:
//			b

public class Banner3DFace
	implements Parcelable, com.startapp.common.a.a
{

	public Banner3DFace(Context context, ViewGroup viewgroup, AdDetails addetails, BannerOptions banneroptions, b b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #40  <Field Bitmap c>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #42  <Field Bitmap d>
		e = new AtomicBoolean(false);
	//    8   14:aload_0         
	//    9   15:new             #44  <Class AtomicBoolean>
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:invokespecial   #47  <Method void AtomicBoolean(boolean)>
	//   13   23:putfield        #49  <Field AtomicBoolean e>
		g = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #51  <Field i g>
		h = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
		a = addetails;
	//   20   36:aload_0         
	//   21   37:aload_3         
	//   22   38:putfield        #55  <Field AdDetails a>
		f = b1;
	//   23   41:aload_0         
	//   24   42:aload           5
	//   25   44:putfield        #57  <Field b f>
		a(context, banneroptions, viewgroup);
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:aload           4
	//   29   51:aload_2         
	//   30   52:invokevirtual   #60  <Method void a(Context, BannerOptions, ViewGroup)>
	//   31   55:return          
	}

	public Banner3DFace(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #40  <Field Bitmap c>
		d = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #42  <Field Bitmap d>
		e = new AtomicBoolean(false);
	//    8   14:aload_0         
	//    9   15:new             #44  <Class AtomicBoolean>
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:invokespecial   #47  <Method void AtomicBoolean(boolean)>
	//   13   23:putfield        #49  <Field AtomicBoolean e>
		g = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #51  <Field i g>
		h = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
		a = (AdDetails)parcel.readParcelable(((Class) (com/startapp/android/publish/common/model/AdDetails)).getClassLoader());
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:ldc1            #63  <Class AdDetails>
	//   23   40:invokevirtual   #69  <Method ClassLoader Class.getClassLoader()>
	//   24   43:invokevirtual   #75  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   25   46:checkcast       #63  <Class AdDetails>
	//   26   49:putfield        #55  <Field AdDetails a>
		b = new Point(1, 1);
	//   27   52:aload_0         
	//   28   53:new             #77  <Class Point>
	//   29   56:dup             
	//   30   57:iconst_1        
	//   31   58:iconst_1        
	//   32   59:invokespecial   #80  <Method void Point(int, int)>
	//   33   62:putfield        #82  <Field Point b>
		b.x = parcel.readInt();
	//   34   65:aload_0         
	//   35   66:getfield        #82  <Field Point b>
	//   36   69:aload_1         
	//   37   70:invokevirtual   #86  <Method int Parcel.readInt()>
	//   38   73:putfield        #90  <Field int Point.x>
		b.y = parcel.readInt();
	//   39   76:aload_0         
	//   40   77:getfield        #82  <Field Point b>
	//   41   80:aload_1         
	//   42   81:invokevirtual   #86  <Method int Parcel.readInt()>
	//   43   84:putfield        #93  <Field int Point.y>
		c = (Bitmap)parcel.readParcelable(((Class) (android/graphics/Bitmap)).getClassLoader());
	//   44   87:aload_0         
	//   45   88:aload_1         
	//   46   89:ldc1            #95  <Class Bitmap>
	//   47   91:invokevirtual   #69  <Method ClassLoader Class.getClassLoader()>
	//   48   94:invokevirtual   #75  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   49   97:checkcast       #95  <Class Bitmap>
	//   50  100:putfield        #40  <Field Bitmap c>
		boolean aflag[] = new boolean[1];
	//   51  103:iconst_1        
	//   52  104:newarray        boolean[]
	//   53  106:astore_2        
		parcel.readBooleanArray(aflag);
	//   54  107:aload_1         
	//   55  108:aload_2         
	//   56  109:invokevirtual   #99  <Method void Parcel.readBooleanArray(boolean[])>
		e.set(aflag[0]);
	//   57  112:aload_0         
	//   58  113:getfield        #49  <Field AtomicBoolean e>
	//   59  116:aload_2         
	//   60  117:iconst_0        
	//   61  118:baload          
	//   62  119:invokevirtual   #102 <Method void AtomicBoolean.set(boolean)>
		f = (b)parcel.readSerializable();
	//   63  122:aload_0         
	//   64  123:aload_1         
	//   65  124:invokevirtual   #106 <Method java.io.Serializable Parcel.readSerializable()>
	//   66  127:checkcast       #108 <Class b>
	//   67  130:putfield        #57  <Field b f>
	//   68  133:return          
	}

	private Bitmap a(View view)
	{
		view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method int View.getMeasuredWidth()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #117 <Method int View.getMeasuredHeight()>
	//    5    9:invokevirtual   #120 <Method void View.measure(int, int)>
		Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #114 <Method int View.getMeasuredWidth()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #117 <Method int View.getMeasuredHeight()>
	//   10   20:getstatic       #126 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   11   23:invokestatic    #130 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   12   26:astore_2        
		Canvas canvas = new Canvas(bitmap);
	//   13   27:new             #132 <Class Canvas>
	//   14   30:dup             
	//   15   31:aload_2         
	//   16   32:invokespecial   #135 <Method void Canvas(Bitmap)>
	//   17   35:astore_3        
		view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
	//   18   36:aload_1         
	//   19   37:iconst_0        
	//   20   38:iconst_0        
	//   21   39:aload_1         
	//   22   40:invokevirtual   #114 <Method int View.getMeasuredWidth()>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #117 <Method int View.getMeasuredHeight()>
	//   25   47:invokevirtual   #139 <Method void View.layout(int, int, int, int)>
		view.draw(canvas);
	//   26   50:aload_1         
	//   27   51:aload_3         
	//   28   52:invokevirtual   #143 <Method void View.draw(Canvas)>
		return bitmap;
	//   29   55:aload_2         
	//   30   56:areturn         
	}

	private void a(Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
			bitmap.recycle();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #146 <Method void Bitmap.recycle()>
	//    4    8:return          
	}

	private void f()
	{
		d = a(((View) (h)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//    4    6:invokespecial   #148 <Method Bitmap a(View)>
	//    5    9:putfield        #42  <Field Bitmap d>
		if(b.x > 0 && b.y > 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #82  <Field Point b>
	//*   8   16:getfield        #90  <Field int Point.x>
	//*   9   19:ifle            58
	//*  10   22:aload_0         
	//*  11   23:getfield        #82  <Field Point b>
	//*  12   26:getfield        #93  <Field int Point.y>
	//*  13   29:ifle            58
			d = Bitmap.createScaledBitmap(d, b.x, b.y, false);
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #42  <Field Bitmap d>
	//   17   37:aload_0         
	//   18   38:getfield        #82  <Field Point b>
	//   19   41:getfield        #90  <Field int Point.x>
	//   20   44:aload_0         
	//   21   45:getfield        #82  <Field Point b>
	//   22   48:getfield        #93  <Field int Point.y>
	//   23   51:iconst_0        
	//   24   52:invokestatic    #152 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   25   55:putfield        #42  <Field Bitmap d>
	//   26   58:return          
	}

	private long g()
	{
		if(a().getDelayImpressionInSeconds() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #156 <Method AdDetails a()>
	//*   2    4:invokevirtual   #160 <Method Long AdDetails.getDelayImpressionInSeconds()>
	//*   3    7:ifnull          27
			return TimeUnit.SECONDS.toMillis(a().getDelayImpressionInSeconds().longValue());
	//    4   10:getstatic       #166 <Field TimeUnit TimeUnit.SECONDS>
	//    5   13:aload_0         
	//    6   14:invokevirtual   #156 <Method AdDetails a()>
	//    7   17:invokevirtual   #160 <Method Long AdDetails.getDelayImpressionInSeconds()>
	//    8   20:invokevirtual   #171 <Method long Long.longValue()>
	//    9   23:invokevirtual   #175 <Method long TimeUnit.toMillis(long)>
	//   10   26:lreturn         
		else
			return TimeUnit.SECONDS.toMillis(MetaData.getInstance().getIABDisplayImpressionDelayInSeconds());
	//   11   27:getstatic       #166 <Field TimeUnit TimeUnit.SECONDS>
	//   12   30:invokestatic    #181 <Method MetaData MetaData.getInstance()>
	//   13   33:invokevirtual   #184 <Method long MetaData.getIABDisplayImpressionDelayInSeconds()>
	//   14   36:invokevirtual   #175 <Method long TimeUnit.toMillis(long)>
	//   15   39:lreturn         
	}

	public i a(Context context)
	{
		if(a().getTrackingUrl() != null && e.compareAndSet(false, true))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #156 <Method AdDetails a()>
	//*   2    4:invokevirtual   #189 <Method String AdDetails.getTrackingUrl()>
	//*   3    7:ifnull          71
	//*   4   10:aload_0         
	//*   5   11:getfield        #49  <Field AtomicBoolean e>
	//*   6   14:iconst_0        
	//*   7   15:iconst_1        
	//*   8   16:invokevirtual   #193 <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   9   19:ifeq            71
		{
			String s = a().getTrackingUrl();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #156 <Method AdDetails a()>
	//   12   26:invokevirtual   #189 <Method String AdDetails.getTrackingUrl()>
	//   13   29:astore          4
			b b1 = f;
	//   14   31:aload_0         
	//   15   32:getfield        #57  <Field b f>
	//   16   35:astore          5
			long l = g();
	//   17   37:aload_0         
	//   18   38:invokespecial   #195 <Method long g()>
	//   19   41:lstore_2        
			g = new i(context, new String[] {
				s
			}, b1, l);
	//   20   42:aload_0         
	//   21   43:new             #197 <Class i>
	//   22   46:dup             
	//   23   47:aload_1         
	//   24   48:iconst_1        
	//   25   49:anewarray       String[]
	//   26   52:dup             
	//   27   53:iconst_0        
	//   28   54:aload           4
	//   29   56:aastore         
	//   30   57:aload           5
	//   31   59:lload_2         
	//   32   60:invokespecial   #202 <Method void i(Context, String[], b, long)>
	//   33   63:putfield        #51  <Field i g>
			return g;
	//   34   66:aload_0         
	//   35   67:getfield        #51  <Field i g>
	//   36   70:areturn         
		} else
		{
			return null;
	//   37   71:aconst_null     
	//   38   72:areturn         
		}
	}

	public AdDetails a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field AdDetails a>
	//    2    4:areturn         
	}

	public void a(Context context, BannerOptions banneroptions, ViewGroup viewgroup)
	{
		int j = com.startapp.android.publish.adsCommon.Utils.h.a(context, banneroptions.e() - 5);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #206 <Method int BannerOptions.e()>
	//    3    5:iconst_5        
	//    4    6:isub            
	//    5    7:invokestatic    #211 <Method int h.a(Context, int)>
	//    6   10:istore          4
		b = new Point((int)((float)com.startapp.android.publish.adsCommon.Utils.h.a(context, banneroptions.d()) * banneroptions.j()), (int)((float)com.startapp.android.publish.adsCommon.Utils.h.a(context, banneroptions.e()) * banneroptions.k()));
	//    7   12:aload_0         
	//    8   13:new             #77  <Class Point>
	//    9   16:dup             
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:invokevirtual   #213 <Method int BannerOptions.d()>
	//   13   22:invokestatic    #211 <Method int h.a(Context, int)>
	//   14   25:i2f             
	//   15   26:aload_2         
	//   16   27:invokevirtual   #217 <Method float BannerOptions.j()>
	//   17   30:fmul            
	//   18   31:f2i             
	//   19   32:aload_1         
	//   20   33:aload_2         
	//   21   34:invokevirtual   #206 <Method int BannerOptions.e()>
	//   22   37:invokestatic    #211 <Method int h.a(Context, int)>
	//   23   40:i2f             
	//   24   41:aload_2         
	//   25   42:invokevirtual   #220 <Method float BannerOptions.k()>
	//   26   45:fmul            
	//   27   46:f2i             
	//   28   47:invokespecial   #80  <Method void Point(int, int)>
	//   29   50:putfield        #82  <Field Point b>
		h = new com.startapp.android.publish.ads.banner.banner3d.b(context, new Point(banneroptions.d(), banneroptions.e()));
	//   30   53:aload_0         
	//   31   54:new             #222 <Class com.startapp.android.publish.ads.banner.banner3d.b>
	//   32   57:dup             
	//   33   58:aload_1         
	//   34   59:new             #77  <Class Point>
	//   35   62:dup             
	//   36   63:aload_2         
	//   37   64:invokevirtual   #213 <Method int BannerOptions.d()>
	//   38   67:aload_2         
	//   39   68:invokevirtual   #206 <Method int BannerOptions.e()>
	//   40   71:invokespecial   #80  <Method void Point(int, int)>
	//   41   74:invokespecial   #225 <Method void com.startapp.android.publish.ads.banner.banner3d.b(Context, Point)>
	//   42   77:putfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
		h.setText(a().getTitle());
	//   43   80:aload_0         
	//   44   81:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//   45   84:aload_0         
	//   46   85:invokevirtual   #156 <Method AdDetails a()>
	//   47   88:invokevirtual   #228 <Method String AdDetails.getTitle()>
	//   48   91:invokevirtual   #232 <Method void b.setText(String)>
		h.setRating(a().getRating());
	//   49   94:aload_0         
	//   50   95:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//   51   98:aload_0         
	//   52   99:invokevirtual   #156 <Method AdDetails a()>
	//   53  102:invokevirtual   #235 <Method float AdDetails.getRating()>
	//   54  105:invokevirtual   #239 <Method void b.setRating(float)>
		h.setDescription(a().getDescription());
	//   55  108:aload_0         
	//   56  109:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//   57  112:aload_0         
	//   58  113:invokevirtual   #156 <Method AdDetails a()>
	//   59  116:invokevirtual   #242 <Method String AdDetails.getDescription()>
	//   60  119:invokevirtual   #245 <Method void b.setDescription(String)>
		h.setButtonText(a.isCPE());
	//   61  122:aload_0         
	//   62  123:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//   63  126:aload_0         
	//   64  127:getfield        #55  <Field AdDetails a>
	//   65  130:invokevirtual   #249 <Method boolean AdDetails.isCPE()>
	//   66  133:invokevirtual   #252 <Method void b.setButtonText(boolean)>
		if(c != null)
	//*  67  136:aload_0         
	//*  68  137:getfield        #40  <Field Bitmap c>
	//*  69  140:ifnull          209
		{
			h.a(c, j, j);
	//   70  143:aload_0         
	//   71  144:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//   72  147:aload_0         
	//   73  148:getfield        #40  <Field Bitmap c>
	//   74  151:iload           4
	//   75  153:iload           4
	//   76  155:invokevirtual   #255 <Method void com.startapp.android.publish.ads.banner.banner3d.b.a(Bitmap, int, int)>
		} else
	//*  77  158:new             #257 <Class android.widget.RelativeLayout$LayoutParams>
	//*  78  161:dup             
	//*  79  162:aload_0         
	//*  80  163:getfield        #82  <Field Point b>
	//*  81  166:getfield        #90  <Field int Point.x>
	//*  82  169:aload_0         
	//*  83  170:getfield        #82  <Field Point b>
	//*  84  173:getfield        #93  <Field int Point.y>
	//*  85  176:invokespecial   #258 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//*  86  179:astore_1        
	//*  87  180:aload_1         
	//*  88  181:bipush          13
	//*  89  183:invokevirtual   #262 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
	//*  90  186:aload_3         
	//*  91  187:aload_0         
	//*  92  188:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//*  93  191:aload_1         
	//*  94  192:invokevirtual   #268 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
	//*  95  195:aload_0         
	//*  96  196:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//*  97  199:bipush          8
	//*  98  201:invokevirtual   #271 <Method void b.setVisibility(int)>
	//*  99  204:aload_0         
	//* 100  205:invokespecial   #273 <Method void f()>
	//* 101  208:return          
		{
			h.a(0x1080093, j, j);
	//  102  209:aload_0         
	//  103  210:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//  104  213:ldc2            #274 <Int 0x1080093>
	//  105  216:iload           4
	//  106  218:iload           4
	//  107  220:invokevirtual   #277 <Method void com.startapp.android.publish.ads.banner.banner3d.b.a(int, int, int)>
			(new a(a().getImageUrl(), ((com.startapp.common.a.a) (this)), 0)).a();
	//  108  223:new             #279 <Class a>
	//  109  226:dup             
	//  110  227:aload_0         
	//  111  228:invokevirtual   #156 <Method AdDetails a()>
	//  112  231:invokevirtual   #282 <Method String AdDetails.getImageUrl()>
	//  113  234:aload_0         
	//  114  235:iconst_0        
	//  115  236:invokespecial   #285 <Method void a(String, com.startapp.common.a$a, int)>
	//  116  239:invokevirtual   #287 <Method void a.a()>
			com.startapp.common.a.g.a("Banner3DFace", 3, (new StringBuilder()).append(" Banner Face Image Async Request: [").append(a().getTitle()).append("]").toString());
	//  117  242:ldc2            #289 <String "Banner3DFace">
	//  118  245:iconst_3        
	//  119  246:new             #291 <Class StringBuilder>
	//  120  249:dup             
	//  121  250:invokespecial   #292 <Method void StringBuilder()>
	//  122  253:ldc2            #294 <String " Banner Face Image Async Request: [">
	//  123  256:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//  124  259:aload_0         
	//  125  260:invokevirtual   #156 <Method AdDetails a()>
	//  126  263:invokevirtual   #228 <Method String AdDetails.getTitle()>
	//  127  266:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//  128  269:ldc2            #300 <String "]">
	//  129  272:invokevirtual   #298 <Method StringBuilder StringBuilder.append(String)>
	//  130  275:invokevirtual   #303 <Method String StringBuilder.toString()>
	//  131  278:invokestatic    #308 <Method void g.a(String, int, String)>
		}
		context = ((Context) (new android.widget.RelativeLayout.LayoutParams(b.x, b.y)));
		((android.widget.RelativeLayout.LayoutParams) (context)).addRule(13);
		viewgroup.addView(((View) (h)), ((android.view.ViewGroup.LayoutParams) (context)));
		h.setVisibility(8);
		f();
	//* 132  281:goto            158
	}

	public void a(Bitmap bitmap, int j)
	{
		if(bitmap != null && h != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          28
	//*   2    4:aload_0         
	//*   3    5:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//*   4    8:ifnull          28
		{
			c = bitmap;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #40  <Field Bitmap c>
			h.setImage(bitmap);
	//    8   16:aload_0         
	//    9   17:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #312 <Method void b.setImage(Bitmap)>
			f();
	//   12   24:aload_0         
	//   13   25:invokespecial   #273 <Method void f()>
		}
	//   14   28:return          
	}

	public Bitmap b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Bitmap d>
	//    2    4:areturn         
	}

	public void b(Context context)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		String s = a().getIntentPackageName();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #156 <Method AdDetails a()>
	//    4    6:invokevirtual   #317 <Method String AdDetails.getIntentPackageName()>
	//    5    9:astore          4
		boolean flag1 = com.startapp.android.publish.adsCommon.c.a(context, com.startapp.android.publish.common.model.AdPreferences.Placement.INAPP_BANNER);
	//    6   11:aload_1         
	//    7   12:getstatic       #323 <Field com.startapp.android.publish.common.model.AdPreferences$Placement com.startapp.android.publish.common.model.AdPreferences$Placement.INAPP_BANNER>
	//    8   15:invokestatic    #328 <Method boolean c.a(Context, com.startapp.android.publish.common.model.AdPreferences$Placement)>
	//    9   18:istore_3        
		if(g != null)
	//*  10   19:aload_0         
	//*  11   20:getfield        #51  <Field i g>
	//*  12   23:ifnull          34
			g.a(true);
	//   13   26:aload_0         
	//   14   27:getfield        #51  <Field i g>
	//   15   30:iconst_1        
	//   16   31:invokevirtual   #330 <Method void i.a(boolean)>
		if(s != null && !"null".equals(((Object) (s))) && !TextUtils.isEmpty(((CharSequence) (s))))
	//*  17   34:aload           4
	//*  18   36:ifnull          83
	//*  19   39:ldc2            #332 <String "null">
	//*  20   42:aload           4
	//*  21   44:invokevirtual   #336 <Method boolean String.equals(Object)>
	//*  22   47:ifne            83
	//*  23   50:aload           4
	//*  24   52:invokestatic    #342 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  25   55:ifne            83
		{
			com.startapp.android.publish.adsCommon.c.a(s, a().getIntentDetails(), a().getClickUrl(), context, f);
	//   26   58:aload           4
	//   27   60:aload_0         
	//   28   61:invokevirtual   #156 <Method AdDetails a()>
	//   29   64:invokevirtual   #345 <Method String AdDetails.getIntentDetails()>
	//   30   67:aload_0         
	//   31   68:invokevirtual   #156 <Method AdDetails a()>
	//   32   71:invokevirtual   #348 <Method String AdDetails.getClickUrl()>
	//   33   74:aload_1         
	//   34   75:aload_0         
	//   35   76:getfield        #57  <Field b f>
	//   36   79:invokestatic    #351 <Method void c.a(String, String, String, Context, b)>
			return;
	//   37   82:return          
		}
		if(a().isSmartRedirect() && !flag1)
	//*  38   83:aload_0         
	//*  39   84:invokevirtual   #156 <Method AdDetails a()>
	//*  40   87:invokevirtual   #354 <Method boolean AdDetails.isSmartRedirect()>
	//*  41   90:ifeq            148
	//*  42   93:iload_3         
	//*  43   94:ifne            148
		{
			com.startapp.android.publish.adsCommon.c.a(context, a().getClickUrl(), a().getTrackingClickUrl(), a().getPackageName(), f, com.startapp.android.publish.adsCommon.b.a().A(), a().isStartappBrowserEnabled(), a().shouldSendRedirectHops(), false);
	//   44   97:aload_1         
	//   45   98:aload_0         
	//   46   99:invokevirtual   #156 <Method AdDetails a()>
	//   47  102:invokevirtual   #348 <Method String AdDetails.getClickUrl()>
	//   48  105:aload_0         
	//   49  106:invokevirtual   #156 <Method AdDetails a()>
	//   50  109:invokevirtual   #357 <Method String AdDetails.getTrackingClickUrl()>
	//   51  112:aload_0         
	//   52  113:invokevirtual   #156 <Method AdDetails a()>
	//   53  116:invokevirtual   #360 <Method String AdDetails.getPackageName()>
	//   54  119:aload_0         
	//   55  120:getfield        #57  <Field b f>
	//   56  123:invokestatic    #365 <Method com.startapp.android.publish.adsCommon.b com.startapp.android.publish.adsCommon.b.a()>
	//   57  126:invokevirtual   #368 <Method long com.startapp.android.publish.adsCommon.b.A()>
	//   58  129:aload_0         
	//   59  130:invokevirtual   #156 <Method AdDetails a()>
	//   60  133:invokevirtual   #371 <Method boolean AdDetails.isStartappBrowserEnabled()>
	//   61  136:aload_0         
	//   62  137:invokevirtual   #156 <Method AdDetails a()>
	//   63  140:invokevirtual   #375 <Method Boolean AdDetails.shouldSendRedirectHops()>
	//   64  143:iconst_0        
	//   65  144:invokestatic    #378 <Method void c.a(Context, String, String, String, b, long, boolean, Boolean, boolean)>
			return;
	//   66  147:return          
		}
		s = a().getClickUrl();
	//   67  148:aload_0         
	//   68  149:invokevirtual   #156 <Method AdDetails a()>
	//   69  152:invokevirtual   #348 <Method String AdDetails.getClickUrl()>
	//   70  155:astore          4
		String s1 = a().getTrackingClickUrl();
	//   71  157:aload_0         
	//   72  158:invokevirtual   #156 <Method AdDetails a()>
	//   73  161:invokevirtual   #357 <Method String AdDetails.getTrackingClickUrl()>
	//   74  164:astore          5
		b b1 = f;
	//   75  166:aload_0         
	//   76  167:getfield        #57  <Field b f>
	//   77  170:astore          6
		if(!a().isStartappBrowserEnabled() || flag1)
	//*  78  172:aload_0         
	//*  79  173:invokevirtual   #156 <Method AdDetails a()>
	//*  80  176:invokevirtual   #371 <Method boolean AdDetails.isStartappBrowserEnabled()>
	//*  81  179:ifeq            199
	//*  82  182:iload_3         
	//*  83  183:ifne            199
	//*  84  186:aload_1         
	//*  85  187:aload           4
	//*  86  189:aload           5
	//*  87  191:aload           6
	//*  88  193:iload_2         
	//*  89  194:iconst_0        
	//*  90  195:invokestatic    #381 <Method void c.a(Context, String, String, b, boolean, boolean)>
	//*  91  198:return          
			flag = false;
	//   92  199:iconst_0        
	//   93  200:istore_2        
		com.startapp.android.publish.adsCommon.c.a(context, s, s1, b1, flag, false);
	//*  94  201:goto            186
	}

	public void c()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field i g>
	//*   2    4:ifnull          15
			g.a(false);
	//    3    7:aload_0         
	//    4    8:getfield        #51  <Field i g>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #330 <Method void i.a(boolean)>
	//    7   15:return          
	}

	public void d()
	{
		a(c);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field Bitmap c>
	//    3    5:invokespecial   #383 <Method void a(Bitmap)>
		a(d);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field Bitmap d>
	//    7   13:invokespecial   #383 <Method void a(Bitmap)>
		c = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #40  <Field Bitmap c>
		d = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #42  <Field Bitmap d>
	//   14   26:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void e()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #386 <Method void d()>
		if(g != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field i g>
	//*   4    8:ifnull          19
			g.a(false);
	//    5   11:aload_0         
	//    6   12:getfield        #51  <Field i g>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #330 <Method void i.a(boolean)>
		if(h != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//*  11   23:ifnull          38
		{
			h.removeAllViews();
	//   12   26:aload_0         
	//   13   27:getfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
	//   14   30:invokevirtual   #389 <Method void b.removeAllViews()>
			h = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #53  <Field com.startapp.android.publish.ads.banner.banner3d.b h>
		}
	//   18   38:return          
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		parcel.writeParcelable(((Parcelable) (a())), j);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #156 <Method AdDetails a()>
	//    3    5:iload_2         
	//    4    6:invokevirtual   #395 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeInt(b.x);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #82  <Field Point b>
	//    8   14:getfield        #90  <Field int Point.x>
	//    9   17:invokevirtual   #398 <Method void Parcel.writeInt(int)>
		parcel.writeInt(b.y);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #82  <Field Point b>
	//   13   25:getfield        #93  <Field int Point.y>
	//   14   28:invokevirtual   #398 <Method void Parcel.writeInt(int)>
		parcel.writeParcelable(((Parcelable) (c)), j);
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #40  <Field Bitmap c>
	//   18   36:iload_2         
	//   19   37:invokevirtual   #395 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeBooleanArray(new boolean[] {
			e.get()
		});
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:newarray        boolean[]
	//   23   44:dup             
	//   24   45:iconst_0        
	//   25   46:aload_0         
	//   26   47:getfield        #49  <Field AtomicBoolean e>
	//   27   50:invokevirtual   #401 <Method boolean AtomicBoolean.get()>
	//   28   53:bastore         
	//   29   54:invokevirtual   #404 <Method void Parcel.writeBooleanArray(boolean[])>
		parcel.writeSerializable(((java.io.Serializable) (f)));
	//   30   57:aload_1         
	//   31   58:aload_0         
	//   32   59:getfield        #57  <Field b f>
	//   33   62:invokevirtual   #408 <Method void Parcel.writeSerializable(java.io.Serializable)>
	//   34   65:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Banner3DFace a(Parcel parcel)
		{
			return new Banner3DFace(parcel);
		//    0    0:new             #9   <Class Banner3DFace>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void Banner3DFace(Parcel)>
		//    4    8:areturn         
		}

		public Banner3DFace[] a(int j)
		{
			return new Banner3DFace[j];
		//    0    0:iload_1         
		//    1    1:anewarray       Banner3DFace[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method Banner3DFace a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int j)
		{
			return ((Object []) (a(j)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method Banner3DFace[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private AdDetails a;
	private Point b;
	private Bitmap c;
	private Bitmap d;
	private AtomicBoolean e;
	private b f;
	private i g;
	private com.startapp.android.publish.ads.banner.banner3d.b h;

	static 
	{
	//    0    0:new             #10  <Class Banner3DFace$1>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void Banner3DFace$1()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
