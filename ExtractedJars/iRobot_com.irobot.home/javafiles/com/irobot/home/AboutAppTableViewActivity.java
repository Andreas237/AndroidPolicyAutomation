// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.View;
import android.widget.*;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.model.rest.SocialInfo;
import com.irobot.home.model.rest.SocialInfoList;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, LanguagePickerActivity_

public class AboutAppTableViewActivity extends BaseFragmentActivity
{

	public AboutAppTableViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	private InputStream a(String s)
	{
		s = ((String) ((new URL(s)).openConnection()));
	//    0    0:new             #32  <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #35  <Method void URL(String)>
	//    4    8:invokevirtual   #39  <Method java.net.URLConnection URL.openConnection()>
	//    5   11:astore_1        
		s = ((String) ((HttpURLConnection)s));
	//    6   12:aload_1         
	//    7   13:checkcast       #41  <Class HttpURLConnection>
	//    8   16:astore_1        
		((HttpURLConnection) (s)).setRequestMethod("GET");
	//    9   17:aload_1         
	//   10   18:ldc1            #43  <String "GET">
	//   11   20:invokevirtual   #46  <Method void HttpURLConnection.setRequestMethod(String)>
		((HttpURLConnection) (s)).connect();
	//   12   23:aload_1         
	//   13   24:invokevirtual   #49  <Method void HttpURLConnection.connect()>
		if(((HttpURLConnection) (s)).getResponseCode() != 200)
			break MISSING_BLOCK_LABEL_49;
	//   14   27:aload_1         
	//   15   28:invokevirtual   #53  <Method int HttpURLConnection.getResponseCode()>
	//   16   31:sipush          200
	//   17   34:icmpne          49
		s = ((String) (((HttpURLConnection) (s)).getInputStream()));
	//   18   37:aload_1         
	//   19   38:invokevirtual   #57  <Method InputStream HttpURLConnection.getInputStream()>
	//   20   41:astore_1        
		return ((InputStream) (s));
	//   21   42:aload_1         
	//   22   43:areturn         
		s;
	//   23   44:astore_1        
		((Exception) (s)).printStackTrace();
	//   24   45:aload_1         
	//   25   46:invokevirtual   #60  <Method void Exception.printStackTrace()>
		return null;
	//   26   49:aconst_null     
	//   27   50:areturn         
	}

	private Bitmap b(String s)
	{
		android.graphics.BitmapFactory.Options options;
		options = new android.graphics.BitmapFactory.Options();
	//    0    0:new             #65  <Class android.graphics.BitmapFactory$Options>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void android.graphics.BitmapFactory$Options()>
	//    3    7:astore_2        
		options.inSampleSize = 1;
	//    4    8:aload_2         
	//    5    9:iconst_1        
	//    6   10:putfield        #70  <Field int android.graphics.BitmapFactory$Options.inSampleSize>
		InputStream inputstream;
		inputstream = a(s);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #72  <Method InputStream a(String)>
	//   10   18:astore_3        
		s = ((String) (BitmapFactory.decodeStream(inputstream, ((android.graphics.Rect) (null)), options)));
	//   11   19:aload_3         
	//   12   20:aconst_null     
	//   13   21:aload_2         
	//   14   22:invokestatic    #78  <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   15   25:astore_1        
		inputstream.close();
	//   16   26:aload_3         
	//   17   27:invokevirtual   #83  <Method void InputStream.close()>
		return ((Bitmap) (s));
	//   18   30:aload_1         
	//   19   31:areturn         
		IOException ioexception;
		ioexception;
	//   20   32:astore_2        
		break MISSING_BLOCK_LABEL_39;
	//   21   33:goto            39
		ioexception;
	//   22   36:astore_2        
		s = null;
	//   23   37:aconst_null     
	//   24   38:astore_1        
		ioexception.printStackTrace();
	//   25   39:aload_2         
	//   26   40:invokevirtual   #84  <Method void IOException.printStackTrace()>
		return ((Bitmap) (s));
	//   27   43:aload_1         
	//   28   44:areturn         
	}

	public void a(Bitmap bitmap, String s, String s1)
	{
		int i = (int)getResources().getDimension(0x7f07018a);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #89  <Method Resources getResources()>
	//    2    4:ldc1            #90  <Int 0x7f07018a>
	//    3    6:invokevirtual   #96  <Method float Resources.getDimension(int)>
	//    4    9:f2i             
	//    5   10:istore          4
		s = ((String) (new android.view.ViewGroup.LayoutParams(i, i)));
	//    6   12:new             #98  <Class android.view.ViewGroup$LayoutParams>
	//    7   15:dup             
	//    8   16:iload           4
	//    9   18:iload           4
	//   10   20:invokespecial   #101 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   11   23:astore_2        
		ImageView imageview = new ImageView(((android.content.Context) (this)));
	//   12   24:new             #103 <Class ImageView>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #106 <Method void ImageView(android.content.Context)>
	//   16   32:astore          5
		imageview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (s)));
	//   17   34:aload           5
	//   18   36:aload_2         
	//   19   37:invokevirtual   #110 <Method void ImageView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		i = (int)getResources().getDimension(0x7f070189);
	//   20   40:aload_0         
	//   21   41:invokevirtual   #89  <Method Resources getResources()>
	//   22   44:ldc1            #111 <Int 0x7f070189>
	//   23   46:invokevirtual   #96  <Method float Resources.getDimension(int)>
	//   24   49:f2i             
	//   25   50:istore          4
		imageview.setPadding(i, i, i, i);
	//   26   52:aload           5
	//   27   54:iload           4
	//   28   56:iload           4
	//   29   58:iload           4
	//   30   60:iload           4
	//   31   62:invokevirtual   #115 <Method void ImageView.setPadding(int, int, int, int)>
		imageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
	//   32   65:aload           5
	//   33   67:getstatic       #121 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   34   70:invokevirtual   #125 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		imageview.setImageBitmap(bitmap);
	//   35   73:aload           5
	//   36   75:aload_1         
	//   37   76:invokevirtual   #129 <Method void ImageView.setImageBitmap(Bitmap)>
		imageview.setTag(((Object) (s1)));
	//   38   79:aload           5
	//   39   81:aload_3         
	//   40   82:invokevirtual   #133 <Method void ImageView.setTag(Object)>
		imageview.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				Intent intent = new Intent("android.intent.action.VIEW");
			//    0    0:new             #24  <Class Intent>
			//    1    3:dup             
			//    2    4:ldc1            #26  <String "android.intent.action.VIEW">
			//    3    6:invokespecial   #29  <Method void Intent(String)>
			//    4    9:astore_2        
				intent.setData(Uri.parse(view.getTag().toString()));
			//    5   10:aload_2         
			//    6   11:aload_1         
			//    7   12:invokevirtual   #35  <Method Object View.getTag()>
			//    8   15:invokevirtual   #39  <Method String Object.toString()>
			//    9   18:invokestatic    #45  <Method Uri Uri.parse(String)>
			//   10   21:invokevirtual   #49  <Method Intent Intent.setData(Uri)>
			//   11   24:pop             
				a.startActivity(intent);
			//   12   25:aload_0         
			//   13   26:getfield        #16  <Field AboutAppTableViewActivity a>
			//   14   29:aload_2         
			//   15   30:invokevirtual   #53  <Method void AboutAppTableViewActivity.startActivity(Intent)>
				AnalyticsSubsystem.getInstance().trackAboutThisAppFollowButtonPressed();
			//   16   33:invokestatic    #59  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//   17   36:invokevirtual   #62  <Method void AnalyticsSubsystem.trackAboutThisAppFollowButtonPressed()>
			//   18   39:return          
			}

			final AboutAppTableViewActivity a;

			
			{
				a = AboutAppTableViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AboutAppTableViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   41   85:aload           5
	//   42   87:new             #6   <Class AboutAppTableViewActivity$1>
	//   43   90:dup             
	//   44   91:aload_0         
	//   45   92:invokespecial   #136 <Method void AboutAppTableViewActivity$1(AboutAppTableViewActivity)>
	//   46   95:invokevirtual   #140 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		a.addView(((View) (imageview)));
	//   47   98:aload_0         
	//   48   99:getfield        #142 <Field LinearLayout a>
	//   49  102:aload           5
	//   50  104:invokevirtual   #148 <Method void LinearLayout.addView(View)>
	//   51  107:return          
	}

	public void e()
	{
		LanguagePickerActivity_.a(((android.content.Context) (this))).a(true).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #153 <Method LanguagePickerActivity_$a LanguagePickerActivity_.a(android.content.Context)>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #158 <Method LanguagePickerActivity_$a LanguagePickerActivity_$a.a(boolean)>
	//    4    8:invokevirtual   #161 <Method org.androidannotations.api.a.e LanguagePickerActivity_$a.a()>
	//    5   11:pop             
	//    6   12:return          
	}

	public void f()
	{
		b(0x7f0f0020);
	//    0    0:aload_0         
	//    1    1:ldc1            #162 <Int 0x7f0f0020>
	//    2    3:invokevirtual   #165 <Method void b(int)>
		f = j.i(((android.content.Context) (this)));
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:invokestatic    #171 <Method CustomerCareRestClient j.i(android.content.Context)>
	//    6   11:putfield        #173 <Field CustomerCareRestClient f>
		g();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #175 <Method void g()>
		j.a(c, 0x7f0f0096);
	//    9   18:aload_0         
	//   10   19:getfield        #177 <Field RelativeLayout c>
	//   11   22:ldc1            #178 <Int 0x7f0f0096>
	//   12   24:invokestatic    #181 <Method android.widget.TextView j.a(RelativeLayout, int)>
	//   13   27:pop             
		j.c(c, j.b(((android.content.Context) (this))));
	//   14   28:aload_0         
	//   15   29:getfield        #177 <Field RelativeLayout c>
	//   16   32:aload_0         
	//   17   33:invokestatic    #184 <Method String j.b(android.content.Context)>
	//   18   36:invokestatic    #187 <Method android.widget.TextView j.c(RelativeLayout, String)>
	//   19   39:pop             
		j.a(e, 0x7f0f0092);
	//   20   40:aload_0         
	//   21   41:getfield        #189 <Field RelativeLayout e>
	//   22   44:ldc1            #190 <Int 0x7f0f0092>
	//   23   46:invokestatic    #181 <Method android.widget.TextView j.a(RelativeLayout, int)>
	//   24   49:pop             
		j.c(e, j.d(((android.content.Context) (this))));
	//   25   50:aload_0         
	//   26   51:getfield        #189 <Field RelativeLayout e>
	//   27   54:aload_0         
	//   28   55:invokestatic    #192 <Method String j.d(android.content.Context)>
	//   29   58:invokestatic    #187 <Method android.widget.TextView j.c(RelativeLayout, String)>
	//   30   61:pop             
		AnalyticsSubsystem.getInstance().trackView(ViewId.AboutThisApp);
	//   31   62:invokestatic    #198 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   32   65:getstatic       #204 <Field ViewId ViewId.AboutThisApp>
	//   33   68:invokevirtual   #208 <Method void AnalyticsSubsystem.trackView(ViewId)>
	//   34   71:return          
	}

	public void g()
	{
		Object obj;
		obj = ((Object) (Locale.getDefault()));
	//    0    0:invokestatic    #214 <Method Locale Locale.getDefault()>
	//    1    3:astore_1        
		try
		{
			obj = ((Object) (f.getSocialInfo(j.a(((Locale) (obj))), j.h(((android.content.Context) (this))), g)));
	//    2    4:aload_0         
	//    3    5:getfield        #173 <Field CustomerCareRestClient f>
	//    4    8:aload_1         
	//    5    9:invokestatic    #217 <Method String j.a(Locale)>
	//    6   12:aload_0         
	//    7   13:invokestatic    #219 <Method String j.h(android.content.Context)>
	//    8   16:aload_0         
	//    9   17:getfield        #221 <Field String g>
	//   10   20:invokeinterface #227 <Method SocialInfoList CustomerCareRestClient.getSocialInfo(String, String, String)>
	//   11   25:astore_1        
		}
	//*  12   26:goto            68
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  13   29:astore_1        
		{
			String s = h;
	//   14   30:getstatic       #229 <Field String h>
	//   15   33:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   34:new             #231 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #232 <Method void StringBuilder()>
	//   19   41:astore_3        
			stringbuilder.append("Error in getSocialInfo: ");
	//   20   42:aload_3         
	//   21   43:ldc1            #234 <String "Error in getSocialInfo: ">
	//   22   45:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			stringbuilder.append(((Exception) (obj)).getMessage());
	//   24   49:aload_3         
	//   25   50:aload_1         
	//   26   51:invokevirtual   #242 <Method String Exception.getMessage()>
	//   27   54:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//   28   57:pop             
			o.e(s, stringbuilder.toString());
	//   29   58:aload_2         
	//   30   59:aload_3         
	//   31   60:invokevirtual   #245 <Method String StringBuilder.toString()>
	//   32   63:invokestatic    #250 <Method void o.e(String, String)>
			obj = null;
	//   33   66:aconst_null     
	//   34   67:astore_1        
		}
		if(obj == null || !((SocialInfoList) (obj)).hasItems()) goto _L2; else goto _L1
	//   35   68:aload_1         
	//   36   69:ifnull          233
	//   37   72:aload_1         
	//   38   73:invokevirtual   #256 <Method boolean SocialInfoList.hasItems()>
	//   39   76:ifeq            233
_L1:
		obj = ((Object) (((SocialInfoList) (obj)).socialMediaItems.iterator()));
	//   40   79:aload_1         
	//   41   80:getfield        #260 <Field ArrayList SocialInfoList.socialMediaItems>
	//   42   83:invokevirtual   #266 <Method Iterator ArrayList.iterator()>
	//   43   86:astore_1        
_L4:
		SocialInfo socialinfo;
		if(!((Iterator) (obj)).hasNext())
			break; /* Loop/switch isn't completed */
	//   44   87:aload_1         
	//   45   88:invokeinterface #271 <Method boolean Iterator.hasNext()>
	//   46   93:ifeq            237
		socialinfo = (SocialInfo)((Iterator) (obj)).next();
	//   47   96:aload_1         
	//   48   97:invokeinterface #275 <Method Object Iterator.next()>
	//   49  102:checkcast       #277 <Class SocialInfo>
	//   50  105:astore_2        
		Object obj1 = ((Object) (b(socialinfo.iconHighResURL)));
	//   51  106:aload_0         
	//   52  107:aload_2         
	//   53  108:getfield        #280 <Field String SocialInfo.iconHighResURL>
	//   54  111:invokespecial   #282 <Method Bitmap b(String)>
	//   55  114:astore_3        
		if(obj1 != null)
	//*  56  115:aload_3         
	//*  57  116:ifnull          135
		{
			StringBuilder stringbuilder1;
			try
			{
				a(((Bitmap) (obj1)), socialinfo.name, socialinfo.URL);
	//   58  119:aload_0         
	//   59  120:aload_3         
	//   60  121:aload_2         
	//   61  122:getfield        #285 <Field String SocialInfo.name>
	//   62  125:aload_2         
	//   63  126:getfield        #288 <Field String SocialInfo.URL>
	//   64  129:invokevirtual   #290 <Method void a(Bitmap, String, String)>
			}
	//*  65  132:goto            87
	//*  66  135:getstatic       #229 <Field String h>
	//*  67  138:astore_3        
	//*  68  139:new             #231 <Class StringBuilder>
	//*  69  142:dup             
	//*  70  143:invokespecial   #232 <Method void StringBuilder()>
	//*  71  146:astore          4
	//*  72  148:aload           4
	//*  73  150:ldc2            #292 <String "Image can't be loaded (">
	//*  74  153:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//*  75  156:pop             
	//*  76  157:aload           4
	//*  77  159:aload_2         
	//*  78  160:getfield        #280 <Field String SocialInfo.iconHighResURL>
	//*  79  163:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//*  80  166:pop             
	//*  81  167:aload           4
	//*  82  169:ldc2            #294 <String ")">
	//*  83  172:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//*  84  175:pop             
	//*  85  176:aload_3         
	//*  86  177:aload           4
	//*  87  179:invokevirtual   #245 <Method String StringBuilder.toString()>
	//*  88  182:invokestatic    #296 <Method void o.c(String, String)>
	//*  89  185:goto            87
			catch(Exception exception)
	//*  90  188:astore_2        
			{
				String s1 = h;
	//   91  189:getstatic       #229 <Field String h>
	//   92  192:astore_3        
				StringBuilder stringbuilder2 = new StringBuilder();
	//   93  193:new             #231 <Class StringBuilder>
	//   94  196:dup             
	//   95  197:invokespecial   #232 <Method void StringBuilder()>
	//   96  200:astore          4
				stringbuilder2.append("Error in getSocialInfo while loading social media icons: ");
	//   97  202:aload           4
	//   98  204:ldc2            #298 <String "Error in getSocialInfo while loading social media icons: ">
	//   99  207:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//  100  210:pop             
				stringbuilder2.append(exception.getMessage());
	//  101  211:aload           4
	//  102  213:aload_2         
	//  103  214:invokevirtual   #242 <Method String Exception.getMessage()>
	//  104  217:invokevirtual   #238 <Method StringBuilder StringBuilder.append(String)>
	//  105  220:pop             
				o.e(s1, stringbuilder2.toString());
	//  106  221:aload_3         
	//  107  222:aload           4
	//  108  224:invokevirtual   #245 <Method String StringBuilder.toString()>
	//  109  227:invokestatic    #250 <Method void o.e(String, String)>
			}
			continue; /* Loop/switch isn't completed */
	//  110  230:goto            87
		}
		obj1 = ((Object) (h));
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Image can't be loaded (");
		stringbuilder1.append(socialinfo.iconHighResURL);
		stringbuilder1.append(")");
		o.c(((String) (obj1)), stringbuilder1.toString());
		if(true) goto _L4; else goto _L3
_L2:
		h();
	//  111  233:aload_0         
	//  112  234:invokevirtual   #300 <Method void h()>
_L3:
	//  113  237:return          
	}

	void h()
	{
		b.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #302 <Field RelativeLayout b>
	//    2    4:bipush          8
	//    3    6:invokevirtual   #307 <Method void RelativeLayout.setVisibility(int)>
	//    4    9:return          
	}

	private static String h = "Settings";
	LinearLayout a;
	RelativeLayout b;
	RelativeLayout c;
	CustomTextView d;
	protected RelativeLayout e;
	CustomerCareRestClient f;
	String g;

	static 
	{
	//    0    0:return          
	}
}
