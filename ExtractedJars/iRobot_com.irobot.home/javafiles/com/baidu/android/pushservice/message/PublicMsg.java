// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.message;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.baidu.android.pushservice.b.f;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.f.a.b;
import com.baidu.android.pushservice.f.i;
import com.baidu.android.pushservice.f.j;
import com.baidu.android.pushservice.f.p;
import com.baidu.android.pushservice.g.c;
import com.baidu.android.pushservice.g.d;
import com.baidu.android.pushservice.h;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.message.a.l;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class PublicMsg
	implements Parcelable
{

	public PublicMsg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		mPkgVercode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #62  <Field int mPkgVercode>
		mNetType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #64  <Field int mNetType>
		mNotificationBuilder = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #66  <Field int mNotificationBuilder>
		mOpenType = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #68  <Field int mOpenType>
		mNotificationBasicStyle = 7;
	//   14   24:aload_0         
	//   15   25:bipush          7
	//   16   27:putfield        #70  <Field int mNotificationBasicStyle>
		mIsSupportApp = true;
	//   17   30:aload_0         
	//   18   31:iconst_1        
	//   19   32:putfield        #72  <Field boolean mIsSupportApp>
		mUserConfirm = 0;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #74  <Field int mUserConfirm>
	//   23   40:return          
	}

	PublicMsg(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		mPkgVercode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #62  <Field int mPkgVercode>
		mNetType = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #64  <Field int mNetType>
		mNotificationBuilder = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #66  <Field int mNotificationBuilder>
		mOpenType = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #68  <Field int mOpenType>
		mNotificationBasicStyle = 7;
	//   14   24:aload_0         
	//   15   25:bipush          7
	//   16   27:putfield        #70  <Field int mNotificationBasicStyle>
		mIsSupportApp = true;
	//   17   30:aload_0         
	//   18   31:iconst_1        
	//   19   32:putfield        #72  <Field boolean mIsSupportApp>
		mUserConfirm = 0;
	//   20   35:aload_0         
	//   21   36:iconst_0        
	//   22   37:putfield        #74  <Field int mUserConfirm>
		mMsgId = parcel.readString();
	//   23   40:aload_0         
	//   24   41:aload_1         
	//   25   42:invokevirtual   #81  <Method String Parcel.readString()>
	//   26   45:putfield        #83  <Field String mMsgId>
		mAppId = parcel.readString();
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:invokevirtual   #81  <Method String Parcel.readString()>
	//   30   53:putfield        #85  <Field String mAppId>
		mTitle = parcel.readString();
	//   31   56:aload_0         
	//   32   57:aload_1         
	//   33   58:invokevirtual   #81  <Method String Parcel.readString()>
	//   34   61:putfield        #87  <Field String mTitle>
		mDescription = parcel.readString();
	//   35   64:aload_0         
	//   36   65:aload_1         
	//   37   66:invokevirtual   #81  <Method String Parcel.readString()>
	//   38   69:putfield        #89  <Field String mDescription>
		mUrl = parcel.readString();
	//   39   72:aload_0         
	//   40   73:aload_1         
	//   41   74:invokevirtual   #81  <Method String Parcel.readString()>
	//   42   77:putfield        #91  <Field String mUrl>
		mPkgName = parcel.readString();
	//   43   80:aload_0         
	//   44   81:aload_1         
	//   45   82:invokevirtual   #81  <Method String Parcel.readString()>
	//   46   85:putfield        #93  <Field String mPkgName>
		mPkgVercode = parcel.readInt();
	//   47   88:aload_0         
	//   48   89:aload_1         
	//   49   90:invokevirtual   #97  <Method int Parcel.readInt()>
	//   50   93:putfield        #62  <Field int mPkgVercode>
		mNotificationBuilder = parcel.readInt();
	//   51   96:aload_0         
	//   52   97:aload_1         
	//   53   98:invokevirtual   #97  <Method int Parcel.readInt()>
	//   54  101:putfield        #66  <Field int mNotificationBuilder>
		mNotificationBasicStyle = parcel.readInt();
	//   55  104:aload_0         
	//   56  105:aload_1         
	//   57  106:invokevirtual   #97  <Method int Parcel.readInt()>
	//   58  109:putfield        #70  <Field int mNotificationBasicStyle>
		mOpenType = parcel.readInt();
	//   59  112:aload_0         
	//   60  113:aload_1         
	//   61  114:invokevirtual   #97  <Method int Parcel.readInt()>
	//   62  117:putfield        #68  <Field int mOpenType>
		mUserConfirm = parcel.readInt();
	//   63  120:aload_0         
	//   64  121:aload_1         
	//   65  122:invokevirtual   #97  <Method int Parcel.readInt()>
	//   66  125:putfield        #74  <Field int mUserConfirm>
		mCustomContent = parcel.readString();
	//   67  128:aload_0         
	//   68  129:aload_1         
	//   69  130:invokevirtual   #81  <Method String Parcel.readString()>
	//   70  133:putfield        #99  <Field String mCustomContent>
		mPkgContent = parcel.readString();
	//   71  136:aload_0         
	//   72  137:aload_1         
	//   73  138:invokevirtual   #81  <Method String Parcel.readString()>
	//   74  141:putfield        #101 <Field String mPkgContent>
		mAdvertiseStyle = parcel.readInt();
	//   75  144:aload_0         
	//   76  145:aload_1         
	//   77  146:invokevirtual   #97  <Method int Parcel.readInt()>
	//   78  149:putfield        #103 <Field int mAdvertiseStyle>
		mAdvertiseSmallIconUrl = parcel.readString();
	//   79  152:aload_0         
	//   80  153:aload_1         
	//   81  154:invokevirtual   #81  <Method String Parcel.readString()>
	//   82  157:putfield        #105 <Field String mAdvertiseSmallIconUrl>
		mAdvertiseLargeIconUrl = parcel.readString();
	//   83  160:aload_0         
	//   84  161:aload_1         
	//   85  162:invokevirtual   #81  <Method String Parcel.readString()>
	//   86  165:putfield        #107 <Field String mAdvertiseLargeIconUrl>
		mAdvertiseClickUrl = parcel.readString();
	//   87  168:aload_0         
	//   88  169:aload_1         
	//   89  170:invokevirtual   #81  <Method String Parcel.readString()>
	//   90  173:putfield        #109 <Field String mAdvertiseClickUrl>
		mAdvertiseBigPictureUrl = parcel.readString();
	//   91  176:aload_0         
	//   92  177:aload_1         
	//   93  178:invokevirtual   #81  <Method String Parcel.readString()>
	//   94  181:putfield        #111 <Field String mAdvertiseBigPictureUrl>
		mAdvertiseBigPictureClickUrl = parcel.readString();
	//   95  184:aload_0         
	//   96  185:aload_1         
	//   97  186:invokevirtual   #81  <Method String Parcel.readString()>
	//   98  189:putfield        #113 <Field String mAdvertiseBigPictureClickUrl>
		mAdvertiseDownloadClickUrl = parcel.readString();
	//   99  192:aload_0         
	//  100  193:aload_1         
	//  101  194:invokevirtual   #81  <Method String Parcel.readString()>
	//  102  197:putfield        #115 <Field String mAdvertiseDownloadClickUrl>
		mAdvertiseDetailClickUrl = parcel.readString();
	//  103  200:aload_0         
	//  104  201:aload_1         
	//  105  202:invokevirtual   #81  <Method String Parcel.readString()>
	//  106  205:putfield        #117 <Field String mAdvertiseDetailClickUrl>
		mAdvertiseBigPictureTitle = parcel.readString();
	//  107  208:aload_0         
	//  108  209:aload_1         
	//  109  210:invokevirtual   #81  <Method String Parcel.readString()>
	//  110  213:putfield        #119 <Field String mAdvertiseBigPictureTitle>
		mAdvertiseBigPictureContent = parcel.readString();
	//  111  216:aload_0         
	//  112  217:aload_1         
	//  113  218:invokevirtual   #81  <Method String Parcel.readString()>
	//  114  221:putfield        #121 <Field String mAdvertiseBigPictureContent>
	//  115  224:return          
	}

	private void addCustomContentToIntent(Intent intent)
	{
		if(mCustomContent == null)
			break MISSING_BLOCK_LABEL_106;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String mCustomContent>
	//    2    4:ifnull          106
		JSONObject jsonobject = new JSONObject(mCustomContent);
	//    3    7:new             #127 <Class JSONObject>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #99  <Field String mCustomContent>
	//    7   15:invokespecial   #130 <Method void JSONObject(String)>
	//    8   18:astore_2        
		String s;
		for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); intent.putExtra(s, jsonobject.getString(s)))
	//*   9   19:aload_2         
	//*  10   20:invokevirtual   #134 <Method Iterator JSONObject.keys()>
	//*  11   23:astore_3        
	//*  12   24:aload_3         
	//*  13   25:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//*  14   30:ifeq            60
			s = (String)iterator.next();
	//   15   33:aload_3         
	//   16   34:invokeinterface #144 <Method Object Iterator.next()>
	//   17   39:checkcast       #146 <Class String>
	//   18   42:astore          4

	//   19   44:aload_1         
	//   20   45:aload           4
	//   21   47:aload_2         
	//   22   48:aload           4
	//   23   50:invokevirtual   #150 <Method String JSONObject.getString(String)>
	//   24   53:invokevirtual   #156 <Method Intent Intent.putExtra(String, String)>
	//   25   56:pop             
	//*  26   57:goto            24
		StringBuilder stringbuilder;
		try
		{
			intent.putExtra("extra_extra_custom_content", mCustomContent);
	//   27   60:aload_1         
	//   28   61:ldc1            #158 <String "extra_extra_custom_content">
	//   29   63:aload_0         
	//   30   64:getfield        #99  <Field String mCustomContent>
	//   31   67:invokevirtual   #156 <Method Intent Intent.putExtra(String, String)>
	//   32   70:pop             
			return;
	//   33   71:return          
		}
		// Misplaced declaration of an exception variable
		catch(Intent intent)
	//*  34   72:astore_1        
		{
			stringbuilder = new StringBuilder();
	//   35   73:new             #160 <Class StringBuilder>
	//   36   76:dup             
	//   37   77:invokespecial   #161 <Method void StringBuilder()>
	//   38   80:astore_2        
		}
		stringbuilder.append("Custom content to JSONObject exception::");
	//   39   81:aload_2         
	//   40   82:ldc1            #163 <String "Custom content to JSONObject exception::">
	//   41   84:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   42   87:pop             
		stringbuilder.append(((JSONException) (intent)).getMessage());
	//   43   88:aload_2         
	//   44   89:aload_1         
	//   45   90:invokevirtual   #170 <Method String JSONException.getMessage()>
	//   46   93:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   47   96:pop             
		a.e("PublicMsg", stringbuilder.toString());
	//   48   97:ldc1            #24  <String "PublicMsg">
	//   49   99:aload_2         
	//   50  100:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   51  103:invokestatic    #179 <Method void a.e(String, String)>
	//   52  106:return          
	}

	private void insertBehavior(Context context, f f1, j j1, i k)
	{
		if(f1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          65
		{
			k.d(f1.c());
	//    2    4:aload           4
	//    3    6:aload_2         
	//    4    7:invokevirtual   #188 <Method String f.c()>
	//    5   10:invokevirtual   #193 <Method void i.d(String)>
			k.c(u.a(f1.f));
	//    6   13:aload           4
	//    7   15:aload_2         
	//    8   16:getfield        #196 <Field String f.f>
	//    9   19:invokestatic    #201 <Method String u.a(String)>
	//   10   22:invokevirtual   #203 <Method void i.c(String)>
			k.b(f1.f);
	//   11   25:aload           4
	//   12   27:aload_2         
	//   13   28:getfield        #196 <Field String f.f>
	//   14   31:invokevirtual   #206 <Method void i.b(String)>
			f1 = ((f) (u.a(k, context, f1.c())));
	//   15   34:aload           4
	//   16   36:aload_1         
	//   17   37:aload_2         
	//   18   38:invokevirtual   #188 <Method String f.c()>
	//   19   41:invokestatic    #209 <Method i u.a(i, Context, String)>
	//   20   44:astore_2        
			try
			{
				p.a(context, j1);
	//   21   45:aload_1         
	//   22   46:aload_3         
	//   23   47:invokestatic    #214 <Method long p.a(Context, j)>
	//   24   50:pop2            
				p.a(context, ((i) (f1)));
	//   25   51:aload_1         
	//   26   52:aload_2         
	//   27   53:invokestatic    #217 <Method long p.a(Context, i)>
	//   28   56:pop2            
				return;
	//   29   57:return          
			}
	//*  30   58:ldc1            #24  <String "PublicMsg">
	//*  31   60:ldc1            #219 <String "PM insert db exception">
	//*  32   62:invokestatic    #221 <Method void a.b(String, String)>
	//*  33   65:return          
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				a.b("PublicMsg", "PM insert db exception");
			}
		}
	//*  34   66:astore_1        
	//*  35   67:goto            58
	}

	private void insertNotiBehavior(Context context, String s, String s1, String s2)
	{
		j j1 = new j();
	//    0    0:new             #225 <Class j>
	//    1    3:dup             
	//    2    4:invokespecial   #226 <Method void j()>
	//    3    7:astore          5
		j1.d = s2;
	//    4    9:aload           5
	//    5   11:aload           4
	//    6   13:putfield        #228 <Field String j.d>
		j1.a = s;
	//    7   16:aload           5
	//    8   18:aload_2         
	//    9   19:putfield        #230 <Field String j.a>
		j1.e = System.currentTimeMillis();
	//   10   22:aload           5
	//   11   24:invokestatic    #236 <Method long System.currentTimeMillis()>
	//   12   27:putfield        #239 <Field long j.e>
		j1.f = b.c(context);
	//   13   30:aload           5
	//   14   32:aload_1         
	//   15   33:invokestatic    #244 <Method String b.c(Context)>
	//   16   36:putfield        #245 <Field String j.f>
		j1.c = l.f.a();
	//   17   39:aload           5
	//   18   41:getstatic       #250 <Field l l.f>
	//   19   44:invokevirtual   #252 <Method int l.a()>
	//   20   47:putfield        #254 <Field int j.c>
		j1.h = s1;
	//   21   50:aload           5
	//   22   52:aload_3         
	//   23   53:putfield        #257 <Field String j.h>
		s = ((String) (com.baidu.android.pushservice.b.b.a(context).d(s1)));
	//   24   56:aload_1         
	//   25   57:invokestatic    #262 <Method com.baidu.android.pushservice.b.b com.baidu.android.pushservice.b.b.a(Context)>
	//   26   60:aload_3         
	//   27   61:invokevirtual   #265 <Method f com.baidu.android.pushservice.b.b.d(String)>
	//   28   64:astore_2        
		if(s != null)
	//*  29   65:aload_2         
	//*  30   66:ifnull          85
			insertBehavior(context, ((f) (s)), j1, new i(s1));
	//   31   69:aload_0         
	//   32   70:aload_1         
	//   33   71:aload_2         
	//   34   72:aload           5
	//   35   74:new             #190 <Class i>
	//   36   77:dup             
	//   37   78:aload_3         
	//   38   79:invokespecial   #266 <Method void i(String)>
	//   39   82:invokespecial   #268 <Method void insertBehavior(Context, f, j, i)>
	//   40   85:return          
	}

	private void sendResult(Context context, String s, int k)
	{
		String s1 = com.baidu.android.pushservice.j.a(context).a();
	//    0    0:aload_1         
	//    1    1:invokestatic    #275 <Method com.baidu.android.pushservice.j com.baidu.android.pushservice.j.a(Context)>
	//    2    4:invokevirtual   #277 <Method String com.baidu.android.pushservice.j.a()>
	//    3    7:astore          4
		String s2 = com.baidu.android.pushservice.j.a(context).b();
	//    4    9:aload_1         
	//    5   10:invokestatic    #275 <Method com.baidu.android.pushservice.j com.baidu.android.pushservice.j.a(Context)>
	//    6   13:invokevirtual   #279 <Method String com.baidu.android.pushservice.j.b()>
	//    7   16:astore          5
		if(!TextUtils.isEmpty(((CharSequence) (s1))) && !TextUtils.isEmpty(((CharSequence) (s2))))
	//*   8   18:aload           4
	//*   9   20:invokestatic    #285 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   23:ifne            171
	//*  11   26:aload           5
	//*  12   28:invokestatic    #285 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   31:ifeq            37
	//*  14   34:goto            171
		{
			Object obj = ((Object) (new StringBuilder()));
	//   15   37:new             #160 <Class StringBuilder>
	//   16   40:dup             
	//   17   41:invokespecial   #161 <Method void StringBuilder()>
	//   18   44:astore          6
			((StringBuilder) (obj)).append("Send Linkhit, msgId = ");
	//   19   46:aload           6
	//   20   48:ldc2            #287 <String "Send Linkhit, msgId = ">
	//   21   51:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   22   54:pop             
			((StringBuilder) (obj)).append(s);
	//   23   55:aload           6
	//   24   57:aload_2         
	//   25   58:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   26   61:pop             
			((StringBuilder) (obj)).append(", resultCode = ");
	//   27   62:aload           6
	//   28   64:ldc2            #289 <String ", resultCode = ">
	//   29   67:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   30   70:pop             
			((StringBuilder) (obj)).append(k);
	//   31   71:aload           6
	//   32   73:iload_3         
	//   33   74:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//   34   77:pop             
			com.baidu.android.pushservice.e.b.a("PublicMsg", ((StringBuilder) (obj)).toString(), context.getApplicationContext());
	//   35   78:ldc1            #24  <String "PublicMsg">
	//   36   80:aload           6
	//   37   82:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   38   85:aload_1         
	//   39   86:invokevirtual   #298 <Method Context Context.getApplicationContext()>
	//   40   89:invokestatic    #303 <Method void com.baidu.android.pushservice.e.b.a(String, String, Context)>
			obj = ((Object) (new JSONObject()));
	//   41   92:new             #127 <Class JSONObject>
	//   42   95:dup             
	//   43   96:invokespecial   #304 <Method void JSONObject()>
	//   44   99:astore          6
			try
			{
				((JSONObject) (obj)).put("msgid", ((Object) (s)));
	//   45  101:aload           6
	//   46  103:ldc2            #306 <String "msgid">
	//   47  106:aload_2         
	//   48  107:invokevirtual   #310 <Method JSONObject JSONObject.put(String, Object)>
	//   49  110:pop             
				((JSONObject) (obj)).put("result_code", k);
	//   50  111:aload           6
	//   51  113:ldc2            #312 <String "result_code">
	//   52  116:iload_3         
	//   53  117:invokevirtual   #315 <Method JSONObject JSONObject.put(String, int)>
	//   54  120:pop             
			}
	//*  55  121:goto            138
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  56  124:astore_2        
			{
				com.baidu.android.pushservice.e.b.b("PublicMsg", ((JSONException) (s)).getMessage(), context.getApplicationContext());
	//   57  125:ldc1            #24  <String "PublicMsg">
	//   58  127:aload_2         
	//   59  128:invokevirtual   #170 <Method String JSONException.getMessage()>
	//   60  131:aload_1         
	//   61  132:invokevirtual   #298 <Method Context Context.getApplicationContext()>
	//   62  135:invokestatic    #317 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
			}
			s = ((JSONObject) (obj)).toString();
	//   63  138:aload           6
	//   64  140:invokevirtual   #318 <Method String JSONObject.toString()>
	//   65  143:astore_2        
			d.a().a(((c) (new c("PushService-linkhit", (short)90, s2, s, s1, context) {

				public void a()
				{
					Object obj1;
					StringBuilder stringbuilder1;
					try
					{
						obj1 = ((Object) (new HashMap()));
				//    0    0:new             #38  <Class HashMap>
				//    1    3:dup             
				//    2    4:invokespecial   #40  <Method void HashMap()>
				//    3    7:astore_1        
						com.baidu.android.pushservice.c.b.b(((HashMap) (obj1)));
				//    4    8:aload_1         
				//    5    9:invokestatic    #45  <Method void com.baidu.android.pushservice.c.b.b(HashMap)>
						((HashMap) (obj1)).put("method", "linkhit");
				//    6   12:aload_1         
				//    7   13:ldc1            #47  <String "method">
				//    8   15:ldc1            #49  <String "linkhit">
				//    9   17:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
				//   10   20:pop             
						((HashMap) (obj1)).put("channel_token", ((Object) (a)));
				//   11   21:aload_1         
				//   12   22:ldc1            #55  <String "channel_token">
				//   13   24:aload_0         
				//   14   25:getfield        #23  <Field String a>
				//   15   28:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
				//   16   31:pop             
						((HashMap) (obj1)).put("data", ((Object) (b)));
				//   17   32:aload_1         
				//   18   33:ldc1            #57  <String "data">
				//   19   35:aload_0         
				//   20   36:getfield        #25  <Field String b>
				//   21   39:invokevirtual   #53  <Method Object HashMap.put(Object, Object)>
				//   22   42:pop             
						StringBuilder stringbuilder = new StringBuilder();
				//   23   43:new             #59  <Class StringBuilder>
				//   24   46:dup             
				//   25   47:invokespecial   #60  <Method void StringBuilder()>
				//   26   50:astore_2        
						stringbuilder.append("linkhit param -- ");
				//   27   51:aload_2         
				//   28   52:ldc1            #62  <String "linkhit param -- ">
				//   29   54:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//   30   57:pop             
						stringbuilder.append(com.baidu.android.pushservice.c.b.a(((HashMap) (obj1))));
				//   31   58:aload_2         
				//   32   59:aload_1         
				//   33   60:invokestatic    #69  <Method String com.baidu.android.pushservice.c.b.a(HashMap)>
				//   34   63:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//   35   66:pop             
						com.baidu.android.pushservice.e.a.c("PublicMsg", stringbuilder.toString());
				//   36   67:ldc1            #71  <String "PublicMsg">
				//   37   69:aload_2         
				//   38   70:invokevirtual   #75  <Method String StringBuilder.toString()>
				//   39   73:invokestatic    #80  <Method void a.c(String, String)>
						stringbuilder = new StringBuilder();
				//   40   76:new             #59  <Class StringBuilder>
				//   41   79:dup             
				//   42   80:invokespecial   #60  <Method void StringBuilder()>
				//   43   83:astore_2        
						stringbuilder.append(h.e());
				//   44   84:aload_2         
				//   45   85:invokestatic    #84  <Method String h.e()>
				//   46   88:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//   47   91:pop             
						stringbuilder.append(c);
				//   48   92:aload_2         
				//   49   93:aload_0         
				//   50   94:getfield        #27  <Field String c>
				//   51   97:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//   52  100:pop             
						obj1 = ((Object) (com.baidu.android.pushservice.d.b.a(stringbuilder.toString(), "POST", ((HashMap) (obj1)))));
				//   53  101:aload_2         
				//   54  102:invokevirtual   #75  <Method String StringBuilder.toString()>
				//   55  105:ldc1            #86  <String "POST">
				//   56  107:aload_1         
				//   57  108:invokestatic    #91  <Method com.baidu.android.pushservice.d.a com.baidu.android.pushservice.d.b.a(String, String, HashMap)>
				//   58  111:astore_1        
						if(((com.baidu.android.pushservice.d.a) (obj1)).b() == 200)
				//*  59  112:aload_1         
				//*  60  113:invokevirtual   #96  <Method int com.baidu.android.pushservice.d.a.b()>
				//*  61  116:sipush          200
				//*  62  119:icmpne          137
						{
							com.baidu.android.pushservice.e.b.c("PublicMsg", "<<< public msg send result return OK!", d.getApplicationContext());
				//   63  122:ldc1            #71  <String "PublicMsg">
				//   64  124:ldc1            #98  <String "<<< public msg send result return OK!">
				//   65  126:aload_0         
				//   66  127:getfield        #29  <Field Context d>
				//   67  130:invokevirtual   #104 <Method Context Context.getApplicationContext()>
				//   68  133:invokestatic    #109 <Method void com.baidu.android.pushservice.e.b.c(String, String, Context)>
							return;
				//   69  136:return          
						}
					}
				//*  70  137:new             #59  <Class StringBuilder>
				//*  71  140:dup             
				//*  72  141:invokespecial   #60  <Method void StringBuilder()>
				//*  73  144:astore_2        
				//*  74  145:aload_2         
				//*  75  146:ldc1            #111 <String "networkRegister request failed, code=">
				//*  76  148:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//*  77  151:pop             
				//*  78  152:aload_2         
				//*  79  153:aload_1         
				//*  80  154:invokevirtual   #96  <Method int com.baidu.android.pushservice.d.a.b()>
				//*  81  157:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
				//*  82  160:pop             
				//*  83  161:aload_2         
				//*  84  162:ldc1            #116 <String ", err=">
				//*  85  164:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//*  86  167:pop             
				//*  87  168:aload_2         
				//*  88  169:aload_1         
				//*  89  170:invokevirtual   #119 <Method java.io.InputStream com.baidu.android.pushservice.d.a.a()>
				//*  90  173:invokestatic    #124 <Method String b.a(java.io.InputStream)>
				//*  91  176:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//*  92  179:pop             
				//*  93  180:ldc1            #71  <String "PublicMsg">
				//*  94  182:aload_2         
				//*  95  183:invokevirtual   #75  <Method String StringBuilder.toString()>
				//*  96  186:invokestatic    #126 <Method void a.e(String, String)>
				//*  97  189:return          
					catch(Exception exception)
				//*  98  190:astore_1        
					{
						StringBuilder stringbuilder2 = new StringBuilder();
				//   99  191:new             #59  <Class StringBuilder>
				//  100  194:dup             
				//  101  195:invokespecial   #60  <Method void StringBuilder()>
				//  102  198:astore_2        
						stringbuilder2.append("error : ");
				//  103  199:aload_2         
				//  104  200:ldc1            #128 <String "error : ">
				//  105  202:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//  106  205:pop             
						stringbuilder2.append(exception.getMessage());
				//  107  206:aload_2         
				//  108  207:aload_1         
				//  109  208:invokevirtual   #131 <Method String Exception.getMessage()>
				//  110  211:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
				//  111  214:pop             
						com.baidu.android.pushservice.e.b.b("PublicMsg", stringbuilder2.toString(), d.getApplicationContext());
				//  112  215:ldc1            #71  <String "PublicMsg">
				//  113  217:aload_2         
				//  114  218:invokevirtual   #75  <Method String StringBuilder.toString()>
				//  115  221:aload_0         
				//  116  222:getfield        #29  <Field Context d>
				//  117  225:invokevirtual   #104 <Method Context Context.getApplicationContext()>
				//  118  228:invokestatic    #133 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
						return;
				//  119  231:return          
					}
					stringbuilder1 = new StringBuilder();
					stringbuilder1.append("networkRegister request failed, code=");
					stringbuilder1.append(((com.baidu.android.pushservice.d.a) (obj1)).b());
					stringbuilder1.append(", err=");
					stringbuilder1.append(com.baidu.android.pushservice.f.a.b.a(((com.baidu.android.pushservice.d.a) (obj1)).a()));
					com.baidu.android.pushservice.e.a.e("PublicMsg", stringbuilder1.toString());
					return;
				}

				final String a;
				final String b;
				final String c;
				final Context d;
				final PublicMsg e;

			
			{
				e = PublicMsg.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field PublicMsg e>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload           4
			//    5    8:putfield        #23  <Field String a>
				b = s2;
			//    6   11:aload_0         
			//    7   12:aload           5
			//    8   14:putfield        #25  <Field String b>
				c = s3;
			//    9   17:aload_0         
			//   10   18:aload           6
			//   11   20:putfield        #27  <Field String c>
				d = context;
			//   12   23:aload_0         
			//   13   24:aload           7
			//   14   26:putfield        #29  <Field Context d>
				super(s, word0);
			//   15   29:aload_0         
			//   16   30:aload_2         
			//   17   31:iload_3         
			//   18   32:invokespecial   #32  <Method void c(String, short)>
			//   19   35:return          
			}
			}
)));
	//   66  144:invokestatic    #323 <Method d d.a()>
	//   67  147:new             #8   <Class PublicMsg$1>
	//   68  150:dup             
	//   69  151:aload_0         
	//   70  152:ldc2            #325 <String "PushService-linkhit">
	//   71  155:bipush          90
	//   72  157:aload           5
	//   73  159:aload_2         
	//   74  160:aload           4
	//   75  162:aload_1         
	//   76  163:invokespecial   #328 <Method void PublicMsg$1(PublicMsg, String, short, String, String, String, Context)>
	//   77  166:invokevirtual   #331 <Method boolean d.a(c)>
	//   78  169:pop             
			return;
	//   79  170:return          
		} else
		{
			com.baidu.android.pushservice.e.b.b("PublicMsg", "Fail Send Public msg result. Token invalid!", context.getApplicationContext());
	//   80  171:ldc1            #24  <String "PublicMsg">
	//   81  173:ldc2            #333 <String "Fail Send Public msg result. Token invalid!">
	//   82  176:aload_1         
	//   83  177:invokevirtual   #298 <Method Context Context.getApplicationContext()>
	//   84  180:invokestatic    #317 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
			return;
	//   85  183:return          
		}
	}

	private void startApplicationLauncher(Context context, String s, String s1)
	{
		Intent intent;
		if(mPkgContent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field String mPkgContent>
	//*   2    4:ifnull          20
		{
			intent = Intent.parseUri(mPkgContent, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field String mPkgContent>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #341 <Method Intent Intent.parseUri(String, int)>
	//    7   15:astore          4
			break MISSING_BLOCK_LABEL_29;
	//    8   17:goto            29
		}
		intent = new Intent();
	//    9   20:new             #152 <Class Intent>
	//   10   23:dup             
	//   11   24:invokespecial   #342 <Method void Intent()>
	//   12   27:astore          4
		String s2 = getLauncherActivityName(context, s);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:invokevirtual   #346 <Method String getLauncherActivityName(Context, String)>
	//   17   35:astore          5
		if(s2 != null)
	//*  18   37:aload           5
	//*  19   39:ifnull          132
		{
			try
			{
				intent.setClassName(s, s2);
	//   20   42:aload           4
	//   21   44:aload_2         
	//   22   45:aload           5
	//   23   47:invokevirtual   #349 <Method Intent Intent.setClassName(String, String)>
	//   24   50:pop             
				intent.setFlags(intent.getFlags() | 0x10000000);
	//   25   51:aload           4
	//   26   53:aload           4
	//   27   55:invokevirtual   #352 <Method int Intent.getFlags()>
	//   28   58:ldc2            #353 <Int 0x10000000>
	//   29   61:ior             
	//   30   62:invokevirtual   #357 <Method Intent Intent.setFlags(int)>
	//   31   65:pop             
				intent.putExtra("open_type", 1);
	//   32   66:aload           4
	//   33   68:ldc2            #359 <String "open_type">
	//   34   71:iconst_1        
	//   35   72:invokevirtual   #361 <Method Intent Intent.putExtra(String, int)>
	//   36   75:pop             
				intent.putExtra("msgid", s1);
	//   37   76:aload           4
	//   38   78:ldc2            #306 <String "msgid">
	//   39   81:aload_3         
	//   40   82:invokevirtual   #156 <Method Intent Intent.putExtra(String, String)>
	//   41   85:pop             
				context.startActivity(intent);
	//   42   86:aload_1         
	//   43   87:aload           4
	//   44   89:invokevirtual   #364 <Method void Context.startActivity(Intent)>
				return;
	//   45   92:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  46   93:astore_2        
			{
				s1 = ((String) (new StringBuilder()));
	//   47   94:new             #160 <Class StringBuilder>
	//   48   97:dup             
	//   49   98:invokespecial   #161 <Method void StringBuilder()>
	//   50  101:astore_3        
			}
			((StringBuilder) (s1)).append("error ");
	//   51  102:aload_3         
	//   52  103:ldc2            #366 <String "error ">
	//   53  106:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   54  109:pop             
			((StringBuilder) (s1)).append(((URISyntaxException) (s)).getMessage());
	//   55  110:aload_3         
	//   56  111:aload_2         
	//   57  112:invokevirtual   #367 <Method String URISyntaxException.getMessage()>
	//   58  115:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   59  118:pop             
			com.baidu.android.pushservice.e.b.b("PublicMsg", ((StringBuilder) (s1)).toString(), context.getApplicationContext());
	//   60  119:ldc1            #24  <String "PublicMsg">
	//   61  121:aload_3         
	//   62  122:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   63  125:aload_1         
	//   64  126:invokevirtual   #298 <Method Context Context.getApplicationContext()>
	//   65  129:invokestatic    #317 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
		}
		return;
	//   66  132:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String getLauncherActivityName(Context context, String s)
	{
		Intent intent = new Intent();
	//    0    0:new             #152 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #342 <Method void Intent()>
	//    3    7:astore_3        
		intent.setAction("android.intent.action.MAIN");
	//    4    8:aload_3         
	//    5    9:ldc2            #370 <String "android.intent.action.MAIN">
	//    6   12:invokevirtual   #374 <Method Intent Intent.setAction(String)>
	//    7   15:pop             
		intent.addCategory("android.intent.category.LAUNCHER");
	//    8   16:aload_3         
	//    9   17:ldc2            #376 <String "android.intent.category.LAUNCHER">
	//   10   20:invokevirtual   #379 <Method Intent Intent.addCategory(String)>
	//   11   23:pop             
		intent.setPackage(s);
	//   12   24:aload_3         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #382 <Method Intent Intent.setPackage(String)>
	//   15   29:pop             
		for(context = ((Context) (context.getPackageManager().queryIntentActivities(intent, 0).iterator())); ((Iterator) (context)).hasNext();)
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #386 <Method PackageManager Context.getPackageManager()>
	//*  18   34:aload_3         
	//*  19   35:iconst_0        
	//*  20   36:invokevirtual   #392 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//*  21   39:invokeinterface #397 <Method Iterator List.iterator()>
	//*  22   44:astore_1        
	//*  23   45:aload_1         
	//*  24   46:invokeinterface #140 <Method boolean Iterator.hasNext()>
	//*  25   51:ifeq            79
		{
			s = ((String) ((ResolveInfo)((Iterator) (context)).next()));
	//   26   54:aload_1         
	//   27   55:invokeinterface #144 <Method Object Iterator.next()>
	//   28   60:checkcast       #399 <Class ResolveInfo>
	//   29   63:astore_2        
			if(((ResolveInfo) (s)).activityInfo != null)
	//*  30   64:aload_2         
	//*  31   65:getfield        #403 <Field ActivityInfo ResolveInfo.activityInfo>
	//*  32   68:ifnull          45
				return ((ResolveInfo) (s)).activityInfo.name;
	//   33   71:aload_2         
	//   34   72:getfield        #403 <Field ActivityInfo ResolveInfo.activityInfo>
	//   35   75:getfield        #408 <Field String ActivityInfo.name>
	//   36   78:areturn         
		}

		return null;
	//   37   79:aconst_null     
	//   38   80:areturn         
	}

	public void handle(Context context, String s, String s1)
	{
		int k;
		Object obj;
		obj = ((Object) (new StringBuilder()));
	//    0    0:new             #160 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #161 <Method void StringBuilder()>
	//    3    7:astore          6
		((StringBuilder) (obj)).append("=== Handle msg: ");
	//    4    9:aload           6
	//    5   11:ldc2            #415 <String "=== Handle msg: ">
	//    6   14:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		((StringBuilder) (obj)).append(toString());
	//    8   18:aload           6
	//    9   20:aload_0         
	//   10   21:invokevirtual   #416 <Method String toString()>
	//   11   24:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		a.c("PublicMsg", ((StringBuilder) (obj)).toString());
	//   13   28:ldc1            #24  <String "PublicMsg">
	//   14   30:aload           6
	//   15   32:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   16   35:invokestatic    #418 <Method void a.c(String, String)>
		com.baidu.android.pushservice.e.b.a("PublicMsg", "--handle--", context.getApplicationContext());
	//   17   38:ldc1            #24  <String "PublicMsg">
	//   18   40:ldc2            #420 <String "--handle--">
	//   19   43:aload_1         
	//   20   44:invokevirtual   #298 <Method Context Context.getApplicationContext()>
	//   21   47:invokestatic    #303 <Method void com.baidu.android.pushservice.e.b.a(String, String, Context)>
		if("com.baidu.pushservice.action.publicmsg.DELETE_V2".equals(((Object) (s))))
	//*  22   50:ldc2            #422 <String "com.baidu.pushservice.action.publicmsg.DELETE_V2">
	//*  23   53:aload_2         
	//*  24   54:invokevirtual   #426 <Method boolean String.equals(Object)>
	//*  25   57:ifeq            114
		{
			s = ((String) (new StringBuilder()));
	//   26   60:new             #160 <Class StringBuilder>
	//   27   63:dup             
	//   28   64:invokespecial   #161 <Method void StringBuilder()>
	//   29   67:astore_2        
			((StringBuilder) (s)).append("Public msg deleted by user, title = ");
	//   30   68:aload_2         
	//   31   69:ldc2            #428 <String "Public msg deleted by user, title = ">
	//   32   72:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   33   75:pop             
			((StringBuilder) (s)).append(mTitle);
	//   34   76:aload_2         
	//   35   77:aload_0         
	//   36   78:getfield        #87  <Field String mTitle>
	//   37   81:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   38   84:pop             
			a.c("PublicMsg", ((StringBuilder) (s)).toString());
	//   39   85:ldc1            #24  <String "PublicMsg">
	//   40   87:aload_2         
	//   41   88:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   42   91:invokestatic    #418 <Method void a.c(String, String)>
			com.baidu.android.pushservice.e.b.a("PublicMsg", "Public msg deleted by user", context.getApplicationContext());
	//   43   94:ldc1            #24  <String "PublicMsg">
	//   44   96:ldc2            #430 <String "Public msg deleted by user">
	//   45   99:aload_1         
	//   46  100:invokevirtual   #298 <Method Context Context.getApplicationContext()>
	//   47  103:invokestatic    #303 <Method void com.baidu.android.pushservice.e.b.a(String, String, Context)>
			sendResult(context, s1, 2);
	//   48  106:aload_0         
	//   49  107:aload_1         
	//   50  108:aload_3         
	//   51  109:iconst_2        
	//   52  110:invokespecial   #432 <Method void sendResult(Context, String, int)>
			return;
	//   53  113:return          
		}
		obj = ((Object) (context.getPackageManager()));
	//   54  114:aload_1         
	//   55  115:invokevirtual   #386 <Method PackageManager Context.getPackageManager()>
	//   56  118:astore          6
		k = 0;
	//   57  120:iconst_0        
	//   58  121:istore          4
		int i1 = ((PackageManager) (obj)).getPackageInfo(mPkgName, 0).versionCode;
	//   59  123:aload           6
	//   60  125:aload_0         
	//   61  126:getfield        #93  <Field String mPkgName>
	//   62  129:iconst_0        
	//   63  130:invokevirtual   #436 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   64  133:getfield        #441 <Field int PackageInfo.versionCode>
	//   65  136:istore          5
		if(i1 < mPkgVercode) goto _L2; else goto _L1
	//   66  138:iload           5
	//   67  140:aload_0         
	//   68  141:getfield        #62  <Field int mPkgVercode>
	//   69  144:icmplt          344
_L1:
		s = ((String) (Intent.parseUri(mPkgContent, 0)));
	//   70  147:aload_0         
	//   71  148:getfield        #101 <Field String mPkgContent>
	//   72  151:iconst_0        
	//   73  152:invokestatic    #341 <Method Intent Intent.parseUri(String, int)>
	//   74  155:astore_2        
		((Intent) (s)).setPackage(mPkgName);
	//   75  156:aload_2         
	//   76  157:aload_0         
	//   77  158:getfield        #93  <Field String mPkgName>
	//   78  161:invokevirtual   #382 <Method Intent Intent.setPackage(String)>
	//   79  164:pop             
		if(((PackageManager) (obj)).queryBroadcastReceivers(((Intent) (s)), 0).size() <= 0) goto _L4; else goto _L3
	//   80  165:aload           6
	//   81  167:aload_2         
	//   82  168:iconst_0        
	//   83  169:invokevirtual   #444 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//   84  172:invokeinterface #447 <Method int List.size()>
	//   85  177:ifle            227
_L3:
		obj = ((Object) (new StringBuilder()));
	//   86  180:new             #160 <Class StringBuilder>
	//   87  183:dup             
	//   88  184:invokespecial   #161 <Method void StringBuilder()>
	//   89  187:astore          6
		((StringBuilder) (obj)).append("Intent broadcasted to app! ===> ");
	//   90  189:aload           6
	//   91  191:ldc2            #449 <String "Intent broadcasted to app! ===> ">
	//   92  194:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   93  197:pop             
		((StringBuilder) (obj)).append(((Intent) (s)).toUri(0));
	//   94  198:aload           6
	//   95  200:aload_2         
	//   96  201:iconst_0        
	//   97  202:invokevirtual   #453 <Method String Intent.toUri(int)>
	//   98  205:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   99  208:pop             
		a.c("PublicMsg", ((StringBuilder) (obj)).toString());
	//  100  209:ldc1            #24  <String "PublicMsg">
	//  101  211:aload           6
	//  102  213:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  103  216:invokestatic    #418 <Method void a.c(String, String)>
		context.sendBroadcast(((Intent) (s)));
	//  104  219:aload_1         
	//  105  220:aload_2         
	//  106  221:invokevirtual   #456 <Method void Context.sendBroadcast(Intent)>
		  goto _L5
	//* 107  224:goto            583
_L4:
		if(((PackageManager) (obj)).queryIntentActivities(((Intent) (s)), 0).size() <= 0) goto _L7; else goto _L6
	//  108  227:aload           6
	//  109  229:aload_2         
	//  110  230:iconst_0        
	//  111  231:invokevirtual   #392 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//  112  234:invokeinterface #447 <Method int List.size()>
	//  113  239:ifle            297
_L6:
		obj = ((Object) (new StringBuilder()));
	//  114  242:new             #160 <Class StringBuilder>
	//  115  245:dup             
	//  116  246:invokespecial   #161 <Method void StringBuilder()>
	//  117  249:astore          6
		((StringBuilder) (obj)).append("Intent sent to actvity! ===> ");
	//  118  251:aload           6
	//  119  253:ldc2            #458 <String "Intent sent to actvity! ===> ">
	//  120  256:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  121  259:pop             
		((StringBuilder) (obj)).append(((Intent) (s)).toUri(0));
	//  122  260:aload           6
	//  123  262:aload_2         
	//  124  263:iconst_0        
	//  125  264:invokevirtual   #453 <Method String Intent.toUri(int)>
	//  126  267:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  127  270:pop             
		a.c("PublicMsg", ((StringBuilder) (obj)).toString());
	//  128  271:ldc1            #24  <String "PublicMsg">
	//  129  273:aload           6
	//  130  275:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  131  278:invokestatic    #418 <Method void a.c(String, String)>
		((Intent) (s)).addFlags(0x10000000);
	//  132  281:aload_2         
	//  133  282:ldc2            #353 <Int 0x10000000>
	//  134  285:invokevirtual   #461 <Method Intent Intent.addFlags(int)>
	//  135  288:pop             
		context.startActivity(((Intent) (s)));
	//  136  289:aload_1         
	//  137  290:aload_2         
	//  138  291:invokevirtual   #364 <Method void Context.startActivity(Intent)>
		  goto _L5
	//* 139  294:goto            583
_L7:
		s = ((String) (new StringBuilder()));
	//  140  297:new             #160 <Class StringBuilder>
	//  141  300:dup             
	//  142  301:invokespecial   #161 <Method void StringBuilder()>
	//  143  304:astore_2        
		((StringBuilder) (s)).append("No app component can deal, so start ");
	//  144  305:aload_2         
	//  145  306:ldc2            #463 <String "No app component can deal, so start ">
	//  146  309:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  147  312:pop             
		((StringBuilder) (s)).append(mPkgName);
	//  148  313:aload_2         
	//  149  314:aload_0         
	//  150  315:getfield        #93  <Field String mPkgName>
	//  151  318:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  152  321:pop             
		((StringBuilder) (s)).append(" launcher activity!");
	//  153  322:aload_2         
	//  154  323:ldc2            #465 <String " launcher activity!">
	//  155  326:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  156  329:pop             
		s = ((StringBuilder) (s)).toString();
	//  157  330:aload_2         
	//  158  331:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  159  334:astore_2        
_L9:
		a.c("PublicMsg", s);
	//  160  335:ldc1            #24  <String "PublicMsg">
	//  161  337:aload_2         
	//  162  338:invokestatic    #418 <Method void a.c(String, String)>
		  goto _L8
	//* 163  341:goto            490
_L2:
		s = ((String) (new StringBuilder()));
	//  164  344:new             #160 <Class StringBuilder>
	//  165  347:dup             
	//  166  348:invokespecial   #161 <Method void StringBuilder()>
	//  167  351:astore_2        
		((StringBuilder) (s)).append("Version code is too low! ===> app ver: ");
	//  168  352:aload_2         
	//  169  353:ldc2            #467 <String "Version code is too low! ===> app ver: ">
	//  170  356:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  171  359:pop             
		((StringBuilder) (s)).append(i1);
	//  172  360:aload_2         
	//  173  361:iload           5
	//  174  363:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//  175  366:pop             
		((StringBuilder) (s)).append(", request ver:");
	//  176  367:aload_2         
	//  177  368:ldc2            #469 <String ", request ver:">
	//  178  371:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  179  374:pop             
		((StringBuilder) (s)).append(mPkgVercode);
	//  180  375:aload_2         
	//  181  376:aload_0         
	//  182  377:getfield        #62  <Field int mPkgVercode>
	//  183  380:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//  184  383:pop             
		s = ((StringBuilder) (s)).toString();
	//  185  384:aload_2         
	//  186  385:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  187  388:astore_2        
		  goto _L9
	//* 188  389:goto            335
		Object obj1;
		obj1;
	//  189  392:astore          6
		s = ((String) (new StringBuilder()));
	//  190  394:new             #160 <Class StringBuilder>
	//  191  397:dup             
	//  192  398:invokespecial   #161 <Method void StringBuilder()>
	//  193  401:astore_2        
		((StringBuilder) (s)).append("parse customize action error\r\n");
	//  194  402:aload_2         
	//  195  403:ldc2            #471 <String "parse customize action error\r\n">
	//  196  406:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  197  409:pop             
		obj1 = ((Object) (((Exception) (obj1)).getMessage()));
	//  198  410:aload           6
	//  199  412:invokevirtual   #472 <Method String Exception.getMessage()>
	//  200  415:astore          6
		break MISSING_BLOCK_LABEL_473;
	//  201  417:goto            473
		obj1;
	//  202  420:astore          6
		s = ((String) (new StringBuilder()));
	//  203  422:new             #160 <Class StringBuilder>
	//  204  425:dup             
	//  205  426:invokespecial   #161 <Method void StringBuilder()>
	//  206  429:astore_2        
		((StringBuilder) (s)).append("uri to intent fail \r\n");
	//  207  430:aload_2         
	//  208  431:ldc2            #474 <String "uri to intent fail \r\n">
	//  209  434:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  210  437:pop             
		obj1 = ((Object) (((URISyntaxException) (obj1)).getMessage()));
	//  211  438:aload           6
	//  212  440:invokevirtual   #367 <Method String URISyntaxException.getMessage()>
	//  213  443:astore          6
		break MISSING_BLOCK_LABEL_473;
	//  214  445:goto            473
		obj1;
	//  215  448:astore          6
		s = ((String) (new StringBuilder()));
	//  216  450:new             #160 <Class StringBuilder>
	//  217  453:dup             
	//  218  454:invokespecial   #161 <Method void StringBuilder()>
	//  219  457:astore_2        
		((StringBuilder) (s)).append("package not exist \r\n");
	//  220  458:aload_2         
	//  221  459:ldc2            #476 <String "package not exist \r\n">
	//  222  462:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  223  465:pop             
		obj1 = ((Object) (((android.content.pm.PackageManager.NameNotFoundException) (obj1)).getMessage()));
	//  224  466:aload           6
	//  225  468:invokevirtual   #477 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//  226  471:astore          6
		((StringBuilder) (s)).append(((String) (obj1)));
	//  227  473:aload_2         
	//  228  474:aload           6
	//  229  476:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  230  479:pop             
		com.baidu.android.pushservice.e.b.b("PublicMsg", ((StringBuilder) (s)).toString(), context);
	//  231  480:ldc1            #24  <String "PublicMsg">
	//  232  482:aload_2         
	//  233  483:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  234  486:aload_1         
	//  235  487:invokestatic    #317 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
_L8:
		if(k == 0)
	//* 236  490:iload           4
	//* 237  492:ifne            574
		{
			s = ((String) (new Intent("android.intent.action.VIEW")));
	//  238  495:new             #152 <Class Intent>
	//  239  498:dup             
	//  240  499:ldc2            #479 <String "android.intent.action.VIEW">
	//  241  502:invokespecial   #480 <Method void Intent(String)>
	//  242  505:astore_2        
			((Intent) (s)).setData(Uri.parse(mUrl));
	//  243  506:aload_2         
	//  244  507:aload_0         
	//  245  508:getfield        #91  <Field String mUrl>
	//  246  511:invokestatic    #486 <Method Uri Uri.parse(String)>
	//  247  514:invokevirtual   #490 <Method Intent Intent.setData(Uri)>
	//  248  517:pop             
			((Intent) (s)).addFlags(0x10000000);
	//  249  518:aload_2         
	//  250  519:ldc2            #353 <Int 0x10000000>
	//  251  522:invokevirtual   #461 <Method Intent Intent.addFlags(int)>
	//  252  525:pop             
			try
			{
				context.startActivity(((Intent) (s)));
	//  253  526:aload_1         
	//  254  527:aload_2         
	//  255  528:invokevirtual   #364 <Method void Context.startActivity(Intent)>
			}
	//* 256  531:goto            574
			// Misplaced declaration of an exception variable
			catch(String s)
	//* 257  534:astore_2        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  258  535:new             #160 <Class StringBuilder>
	//  259  538:dup             
	//  260  539:invokespecial   #161 <Method void StringBuilder()>
	//  261  542:astore          6
				stringbuilder.append(">>> Url cann't be deal! \r\n");
	//  262  544:aload           6
	//  263  546:ldc2            #492 <String ">>> Url cann't be deal! \r\n">
	//  264  549:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  265  552:pop             
				stringbuilder.append(((ActivityNotFoundException) (s)).getMessage());
	//  266  553:aload           6
	//  267  555:aload_2         
	//  268  556:invokevirtual   #493 <Method String ActivityNotFoundException.getMessage()>
	//  269  559:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  270  562:pop             
				com.baidu.android.pushservice.e.b.b("PublicMsg", stringbuilder.toString(), context);
	//  271  563:ldc1            #24  <String "PublicMsg">
	//  272  565:aload           6
	//  273  567:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  274  570:aload_1         
	//  275  571:invokestatic    #317 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
			}
		}
		sendResult(context, s1, k);
	//  276  574:aload_0         
	//  277  575:aload_1         
	//  278  576:aload_3         
	//  279  577:iload           4
	//  280  579:invokespecial   #432 <Method void sendResult(Context, String, int)>
		return;
	//  281  582:return          
_L5:
		k = 1;
	//  282  583:iconst_1        
	//  283  584:istore          4
		if(true) goto _L8; else goto _L10
	//  284  586:goto            490
_L10:
	}

	public void handleAlarmMessage(Context context, String s, String s1, String s2)
	{
		a.c("PublicMsg", "handle AlarmMessage ");
	//    0    0:ldc1            #24  <String "PublicMsg">
	//    1    2:ldc2            #496 <String "handle AlarmMessage ">
	//    2    5:invokestatic    #418 <Method void a.c(String, String)>
		insertNotiBehavior(context, s1, s2, s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_3         
	//    6   11:aload           4
	//    7   13:aload_2         
	//    8   14:invokespecial   #498 <Method void insertNotiBehavior(Context, String, String, String)>
	//    9   17:return          
	}

	public void handlePrivateNotification(Context context, String s, String s1, String s2)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #160 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #161 <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("=== Handle private notification: ");
	//    4    9:aload           6
	//    5   11:ldc2            #501 <String "=== Handle private notification: ">
	//    6   14:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(s);
	//    8   18:aload           6
	//    9   20:aload_2         
	//   10   21:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
		com.baidu.android.pushservice.e.b.a("PublicMsg", stringbuilder.toString(), context);
	//   12   25:ldc1            #24  <String "PublicMsg">
	//   13   27:aload           6
	//   14   29:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   15   32:aload_1         
	//   16   33:invokestatic    #303 <Method void com.baidu.android.pushservice.e.b.a(String, String, Context)>
		if("com.baidu.android.pushservice.action.privatenotification.DELETE".equals(((Object) (s))))
	//*  17   36:ldc2            #503 <String "com.baidu.android.pushservice.action.privatenotification.DELETE">
	//*  18   39:aload_2         
	//*  19   40:invokevirtual   #426 <Method boolean String.equals(Object)>
	//*  20   43:ifeq            92
		{
			s = ((String) (new StringBuilder()));
	//   21   46:new             #160 <Class StringBuilder>
	//   22   49:dup             
	//   23   50:invokespecial   #161 <Method void StringBuilder()>
	//   24   53:astore_2        
			((StringBuilder) (s)).append("private notification deleted by user, title = ");
	//   25   54:aload_2         
	//   26   55:ldc2            #505 <String "private notification deleted by user, title = ">
	//   27   58:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   28   61:pop             
			((StringBuilder) (s)).append(mTitle);
	//   29   62:aload_2         
	//   30   63:aload_0         
	//   31   64:getfield        #87  <Field String mTitle>
	//   32   67:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   33   70:pop             
			a.c("PublicMsg", ((StringBuilder) (s)).toString());
	//   34   71:ldc1            #24  <String "PublicMsg">
	//   35   73:aload_2         
	//   36   74:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   37   77:invokestatic    #418 <Method void a.c(String, String)>
			insertNotiBehavior(context, s1, s2, "010202");
	//   38   80:aload_0         
	//   39   81:aload_1         
	//   40   82:aload_3         
	//   41   83:aload           4
	//   42   85:ldc2            #507 <String "010202">
	//   43   88:invokespecial   #498 <Method void insertNotiBehavior(Context, String, String, String)>
			return;
	//   44   91:return          
		}
		s = ((String) (context.getPackageManager()));
	//   45   92:aload_1         
	//   46   93:invokevirtual   #386 <Method PackageManager Context.getPackageManager()>
	//   47   96:astore_2        
		int k;
		k = ((PackageManager) (s)).getPackageInfo(mPkgName, 0).versionCode;
	//   48   97:aload_2         
	//   49   98:aload_0         
	//   50   99:getfield        #93  <Field String mPkgName>
	//   51  102:iconst_0        
	//   52  103:invokevirtual   #436 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   53  106:getfield        #441 <Field int PackageInfo.versionCode>
	//   54  109:istore          5
		if(k < mPkgVercode)
			break MISSING_BLOCK_LABEL_447;
	//   55  111:iload           5
	//   56  113:aload_0         
	//   57  114:getfield        #62  <Field int mPkgVercode>
	//   58  117:icmplt          447
		Intent intent = new Intent();
	//   59  120:new             #152 <Class Intent>
	//   60  123:dup             
	//   61  124:invokespecial   #342 <Method void Intent()>
	//   62  127:astore          6
		intent.putExtra("notification_title", mTitle);
	//   63  129:aload           6
	//   64  131:ldc2            #509 <String "notification_title">
	//   65  134:aload_0         
	//   66  135:getfield        #87  <Field String mTitle>
	//   67  138:invokevirtual   #156 <Method Intent Intent.putExtra(String, String)>
	//   68  141:pop             
		intent.putExtra("notification_content", mDescription);
	//   69  142:aload           6
	//   70  144:ldc2            #511 <String "notification_content">
	//   71  147:aload_0         
	//   72  148:getfield        #89  <Field String mDescription>
	//   73  151:invokevirtual   #156 <Method Intent Intent.putExtra(String, String)>
	//   74  154:pop             
		intent.putExtra("com.baidu.pushservice.app_id", s2);
	//   75  155:aload           6
	//   76  157:ldc2            #513 <String "com.baidu.pushservice.app_id">
	//   77  160:aload           4
	//   78  162:invokevirtual   #156 <Method Intent Intent.putExtra(String, String)>
	//   79  165:pop             
		addCustomContentToIntent(intent);
	//   80  166:aload_0         
	//   81  167:aload           6
	//   82  169:invokespecial   #515 <Method void addCustomContentToIntent(Intent)>
		u.b(context, intent, "com.baidu.android.pushservice.action.notification.CLICK", mPkgName);
	//   83  172:aload_1         
	//   84  173:aload           6
	//   85  175:ldc2            #517 <String "com.baidu.android.pushservice.action.notification.CLICK">
	//   86  178:aload_0         
	//   87  179:getfield        #93  <Field String mPkgName>
	//   88  182:invokestatic    #520 <Method void u.b(Context, Intent, String, String)>
		insertNotiBehavior(context, s1, s2, "010201");
	//   89  185:aload_0         
	//   90  186:aload_1         
	//   91  187:aload_3         
	//   92  188:aload           4
	//   93  190:ldc2            #522 <String "010201">
	//   94  193:invokespecial   #498 <Method void insertNotiBehavior(Context, String, String, String)>
		if(mOpenType == 1 && mUrl != null)
	//*  95  196:aload_0         
	//*  96  197:getfield        #68  <Field int mOpenType>
	//*  97  200:iconst_1        
	//*  98  201:icmpne          253
	//*  99  204:aload_0         
	//* 100  205:getfield        #91  <Field String mUrl>
	//* 101  208:ifnull          253
		{
			s = ((String) (new Intent()));
	//  102  211:new             #152 <Class Intent>
	//  103  214:dup             
	//  104  215:invokespecial   #342 <Method void Intent()>
	//  105  218:astore_2        
			((Intent) (s)).setAction("android.intent.action.VIEW");
	//  106  219:aload_2         
	//  107  220:ldc2            #479 <String "android.intent.action.VIEW">
	//  108  223:invokevirtual   #374 <Method Intent Intent.setAction(String)>
	//  109  226:pop             
			((Intent) (s)).setData(Uri.parse(mUrl));
	//  110  227:aload_2         
	//  111  228:aload_0         
	//  112  229:getfield        #91  <Field String mUrl>
	//  113  232:invokestatic    #486 <Method Uri Uri.parse(String)>
	//  114  235:invokevirtual   #490 <Method Intent Intent.setData(Uri)>
	//  115  238:pop             
			((Intent) (s)).addFlags(0x10000000);
	//  116  239:aload_2         
	//  117  240:ldc2            #353 <Int 0x10000000>
	//  118  243:invokevirtual   #461 <Method Intent Intent.addFlags(int)>
	//  119  246:pop             
			context.startActivity(((Intent) (s)));
	//  120  247:aload_1         
	//  121  248:aload_2         
	//  122  249:invokevirtual   #364 <Method void Context.startActivity(Intent)>
			return;
	//  123  252:return          
		}
		if(mOpenType != 2)
			break MISSING_BLOCK_LABEL_560;
	//  124  253:aload_0         
	//  125  254:getfield        #68  <Field int mOpenType>
	//  126  257:iconst_2        
	//  127  258:icmpne          560
		if(TextUtils.isEmpty(((CharSequence) (mPkgContent))))
			break MISSING_BLOCK_LABEL_436;
	//  128  261:aload_0         
	//  129  262:getfield        #101 <Field String mPkgContent>
	//  130  265:invokestatic    #285 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  131  268:ifne            436
		s2 = ((String) (Intent.parseUri(mPkgContent, 0)));
	//  132  271:aload_0         
	//  133  272:getfield        #101 <Field String mPkgContent>
	//  134  275:iconst_0        
	//  135  276:invokestatic    #341 <Method Intent Intent.parseUri(String, int)>
	//  136  279:astore          4
		((Intent) (s2)).setPackage(mPkgName);
	//  137  281:aload           4
	//  138  283:aload_0         
	//  139  284:getfield        #93  <Field String mPkgName>
	//  140  287:invokevirtual   #382 <Method Intent Intent.setPackage(String)>
	//  141  290:pop             
		if(((PackageManager) (s)).queryBroadcastReceivers(((Intent) (s2)), 0).size() > 0)
	//* 142  291:aload_2         
	//* 143  292:aload           4
	//* 144  294:iconst_0        
	//* 145  295:invokevirtual   #444 <Method List PackageManager.queryBroadcastReceivers(Intent, int)>
	//* 146  298:invokeinterface #447 <Method int List.size()>
	//* 147  303:ifle            349
		{
			s = ((String) (new StringBuilder()));
	//  148  306:new             #160 <Class StringBuilder>
	//  149  309:dup             
	//  150  310:invokespecial   #161 <Method void StringBuilder()>
	//  151  313:astore_2        
			((StringBuilder) (s)).append("Intent broadcasted to app! ===> ");
	//  152  314:aload_2         
	//  153  315:ldc2            #449 <String "Intent broadcasted to app! ===> ">
	//  154  318:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  155  321:pop             
			((StringBuilder) (s)).append(((Intent) (s2)).toUri(0));
	//  156  322:aload_2         
	//  157  323:aload           4
	//  158  325:iconst_0        
	//  159  326:invokevirtual   #453 <Method String Intent.toUri(int)>
	//  160  329:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  161  332:pop             
			a.c("PublicMsg", ((StringBuilder) (s)).toString());
	//  162  333:ldc1            #24  <String "PublicMsg">
	//  163  335:aload_2         
	//  164  336:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  165  339:invokestatic    #418 <Method void a.c(String, String)>
			context.sendBroadcast(((Intent) (s2)));
	//  166  342:aload_1         
	//  167  343:aload           4
	//  168  345:invokevirtual   #456 <Method void Context.sendBroadcast(Intent)>
			return;
	//  169  348:return          
		}
		if(((PackageManager) (s)).queryIntentActivities(((Intent) (s2)), 0).size() > 0)
	//* 170  349:aload_2         
	//* 171  350:aload           4
	//* 172  352:iconst_0        
	//* 173  353:invokevirtual   #392 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//* 174  356:invokeinterface #447 <Method int List.size()>
	//* 175  361:ifle            560
		{
			s = ((String) (new StringBuilder()));
	//  176  364:new             #160 <Class StringBuilder>
	//  177  367:dup             
	//  178  368:invokespecial   #161 <Method void StringBuilder()>
	//  179  371:astore_2        
			((StringBuilder) (s)).append("Intent sent to actvity! ===> ");
	//  180  372:aload_2         
	//  181  373:ldc2            #458 <String "Intent sent to actvity! ===> ">
	//  182  376:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  183  379:pop             
			((StringBuilder) (s)).append(((Intent) (s2)).toUri(0));
	//  184  380:aload_2         
	//  185  381:aload           4
	//  186  383:iconst_0        
	//  187  384:invokevirtual   #453 <Method String Intent.toUri(int)>
	//  188  387:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  189  390:pop             
			a.c("PublicMsg", ((StringBuilder) (s)).toString());
	//  190  391:ldc1            #24  <String "PublicMsg">
	//  191  393:aload_2         
	//  192  394:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  193  397:invokestatic    #418 <Method void a.c(String, String)>
			((Intent) (s2)).addFlags(0x10000000);
	//  194  400:aload           4
	//  195  402:ldc2            #353 <Int 0x10000000>
	//  196  405:invokevirtual   #461 <Method Intent Intent.addFlags(int)>
	//  197  408:pop             
			((Intent) (s2)).putExtra("open_type", 1);
	//  198  409:aload           4
	//  199  411:ldc2            #359 <String "open_type">
	//  200  414:iconst_1        
	//  201  415:invokevirtual   #361 <Method Intent Intent.putExtra(String, int)>
	//  202  418:pop             
			((Intent) (s2)).putExtra("msgid", s1);
	//  203  419:aload           4
	//  204  421:ldc2            #306 <String "msgid">
	//  205  424:aload_3         
	//  206  425:invokevirtual   #156 <Method Intent Intent.putExtra(String, String)>
	//  207  428:pop             
			context.startActivity(((Intent) (s2)));
	//  208  429:aload_1         
	//  209  430:aload           4
	//  210  432:invokevirtual   #364 <Method void Context.startActivity(Intent)>
			return;
	//  211  435:return          
		}
		break MISSING_BLOCK_LABEL_560;
		try
		{
			startApplicationLauncher(context, mPkgName, s1);
	//  212  436:aload_0         
	//  213  437:aload_1         
	//  214  438:aload_0         
	//  215  439:getfield        #93  <Field String mPkgName>
	//  216  442:aload_3         
	//  217  443:invokespecial   #524 <Method void startApplicationLauncher(Context, String, String)>
			return;
	//  218  446:return          
		}
	//* 219  447:new             #160 <Class StringBuilder>
	//* 220  450:dup             
	//* 221  451:invokespecial   #161 <Method void StringBuilder()>
	//* 222  454:astore_2        
	//* 223  455:aload_2         
	//* 224  456:ldc2            #467 <String "Version code is too low! ===> app ver: ">
	//* 225  459:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//* 226  462:pop             
	//* 227  463:aload_2         
	//* 228  464:iload           5
	//* 229  466:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//* 230  469:pop             
	//* 231  470:aload_2         
	//* 232  471:ldc2            #469 <String ", request ver:">
	//* 233  474:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//* 234  477:pop             
	//* 235  478:aload_2         
	//* 236  479:aload_0         
	//* 237  480:getfield        #62  <Field int mPkgVercode>
	//* 238  483:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//* 239  486:pop             
	//* 240  487:ldc1            #24  <String "PublicMsg">
	//* 241  489:aload_2         
	//* 242  490:invokevirtual   #173 <Method String StringBuilder.toString()>
	//* 243  493:invokestatic    #418 <Method void a.c(String, String)>
	//* 244  496:return          
	//* 245  497:astore_2        
	//* 246  498:new             #160 <Class StringBuilder>
	//* 247  501:dup             
	//* 248  502:invokespecial   #161 <Method void StringBuilder()>
	//* 249  505:astore_3        
	//* 250  506:aload_3         
	//* 251  507:ldc2            #474 <String "uri to intent fail \r\n">
	//* 252  510:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//* 253  513:pop             
	//* 254  514:aload_2         
	//* 255  515:invokevirtual   #367 <Method String URISyntaxException.getMessage()>
	//* 256  518:astore_2        
	//* 257  519:goto            544
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 258  522:astore_2        
		{
			s1 = ((String) (new StringBuilder()));
	//  259  523:new             #160 <Class StringBuilder>
	//  260  526:dup             
	//  261  527:invokespecial   #161 <Method void StringBuilder()>
	//  262  530:astore_3        
			((StringBuilder) (s1)).append("package not exist \r\n");
	//  263  531:aload_3         
	//  264  532:ldc2            #476 <String "package not exist \r\n">
	//  265  535:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  266  538:pop             
			s = ((android.content.pm.PackageManager.NameNotFoundException) (s)).getMessage();
	//  267  539:aload_2         
	//  268  540:invokevirtual   #477 <Method String android.content.pm.PackageManager$NameNotFoundException.getMessage()>
	//  269  543:astore_2        
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			s1 = ((String) (new StringBuilder()));
			((StringBuilder) (s1)).append("uri to intent fail \r\n");
			s = ((URISyntaxException) (s)).getMessage();
		}
		break MISSING_BLOCK_LABEL_544;
		s = ((String) (new StringBuilder()));
		((StringBuilder) (s)).append("Version code is too low! ===> app ver: ");
		((StringBuilder) (s)).append(k);
		((StringBuilder) (s)).append(", request ver:");
		((StringBuilder) (s)).append(mPkgVercode);
		a.c("PublicMsg", ((StringBuilder) (s)).toString());
		return;
		((StringBuilder) (s1)).append(s);
	//  270  544:aload_3         
	//  271  545:aload_2         
	//  272  546:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  273  549:pop             
		com.baidu.android.pushservice.e.b.b("PublicMsg", ((StringBuilder) (s1)).toString(), context);
	//  274  550:ldc1            #24  <String "PublicMsg">
	//  275  552:aload_3         
	//  276  553:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  277  556:aload_1         
	//  278  557:invokestatic    #317 <Method void com.baidu.android.pushservice.e.b.b(String, String, Context)>
	//  279  560:return          
	}

	public void handleRichMediaNotification(Context context, String s, String s1)
	{
		com.baidu.android.pushservice.e.b.a("PublicMsg", "Handle rich media notification", context);
	//    0    0:ldc1            #24  <String "PublicMsg">
	//    1    2:ldc2            #527 <String "Handle rich media notification">
	//    2    5:aload_1         
	//    3    6:invokestatic    #303 <Method void com.baidu.android.pushservice.e.b.a(String, String, Context)>
		Object obj = ((Object) (new StringBuilder()));
	//    4    9:new             #160 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #161 <Method void StringBuilder()>
	//    7   16:astore          4
		((StringBuilder) (obj)).append("=== Handle rich media notification: ");
	//    8   18:aload           4
	//    9   20:ldc2            #529 <String "=== Handle rich media notification: ">
	//   10   23:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:pop             
		((StringBuilder) (obj)).append(s);
	//   12   27:aload           4
	//   13   29:aload_2         
	//   14   30:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
		((StringBuilder) (obj)).append(" title = ");
	//   16   34:aload           4
	//   17   36:ldc2            #531 <String " title = ">
	//   18   39:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:pop             
		((StringBuilder) (obj)).append(mTitle);
	//   20   43:aload           4
	//   21   45:aload_0         
	//   22   46:getfield        #87  <Field String mTitle>
	//   23   49:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   24   52:pop             
		a.c("PublicMsg", ((StringBuilder) (obj)).toString());
	//   25   53:ldc1            #24  <String "PublicMsg">
	//   26   55:aload           4
	//   27   57:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   28   60:invokestatic    #418 <Method void a.c(String, String)>
		obj = ((Object) (new j()));
	//   29   63:new             #225 <Class j>
	//   30   66:dup             
	//   31   67:invokespecial   #226 <Method void j()>
	//   32   70:astore          4
		if("com.baidu.android.pushservice.action.media.DELETE".equals(((Object) (s))))
	//*  33   72:ldc2            #533 <String "com.baidu.android.pushservice.action.media.DELETE">
	//*  34   75:aload_2         
	//*  35   76:invokevirtual   #426 <Method boolean String.equals(Object)>
	//*  36   79:ifeq            129
		{
			s = ((String) (new StringBuilder()));
	//   37   82:new             #160 <Class StringBuilder>
	//   38   85:dup             
	//   39   86:invokespecial   #161 <Method void StringBuilder()>
	//   40   89:astore_2        
			((StringBuilder) (s)).append("rich media notification deleted by user, title = ");
	//   41   90:aload_2         
	//   42   91:ldc2            #535 <String "rich media notification deleted by user, title = ">
	//   43   94:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   44   97:pop             
			((StringBuilder) (s)).append(mTitle);
	//   45   98:aload_2         
	//   46   99:aload_0         
	//   47  100:getfield        #87  <Field String mTitle>
	//   48  103:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   49  106:pop             
			a.c("PublicMsg", ((StringBuilder) (s)).toString());
	//   50  107:ldc1            #24  <String "PublicMsg">
	//   51  109:aload_2         
	//   52  110:invokevirtual   #173 <Method String StringBuilder.toString()>
	//   53  113:invokestatic    #418 <Method void a.c(String, String)>
			s = "010402";
	//   54  116:ldc2            #537 <String "010402">
	//   55  119:astore_2        
		} else
	//*  56  120:aload           4
	//*  57  122:aload_2         
	//*  58  123:putfield        #228 <Field String j.d>
	//*  59  126:goto            170
		{
			s = ((String) (new Intent("com.baidu.android.pushservice.action.media.CLICK")));
	//   60  129:new             #152 <Class Intent>
	//   61  132:dup             
	//   62  133:ldc2            #539 <String "com.baidu.android.pushservice.action.media.CLICK">
	//   63  136:invokespecial   #480 <Method void Intent(String)>
	//   64  139:astore_2        
			((Intent) (s)).setPackage(mPkgName);
	//   65  140:aload_2         
	//   66  141:aload_0         
	//   67  142:getfield        #93  <Field String mPkgName>
	//   68  145:invokevirtual   #382 <Method Intent Intent.setPackage(String)>
	//   69  148:pop             
			((Intent) (s)).putExtra("public_msg", ((Parcelable) (this)));
	//   70  149:aload_2         
	//   71  150:ldc2            #541 <String "public_msg">
	//   72  153:aload_0         
	//   73  154:invokevirtual   #544 <Method Intent Intent.putExtra(String, Parcelable)>
	//   74  157:pop             
			context.sendBroadcast(((Intent) (s)));
	//   75  158:aload_1         
	//   76  159:aload_2         
	//   77  160:invokevirtual   #456 <Method void Context.sendBroadcast(Intent)>
			s = "010401";
	//   78  163:ldc2            #546 <String "010401">
	//   79  166:astore_2        
		}
		obj.d = s;
	//*  80  167:goto            120
		obj.a = mMsgId;
	//   81  170:aload           4
	//   82  172:aload_0         
	//   83  173:getfield        #83  <Field String mMsgId>
	//   84  176:putfield        #230 <Field String j.a>
		obj.c = l.h.a();
	//   85  179:aload           4
	//   86  181:getstatic       #548 <Field l l.h>
	//   87  184:invokevirtual   #252 <Method int l.a()>
	//   88  187:putfield        #254 <Field int j.c>
		obj.e = System.currentTimeMillis();
	//   89  190:aload           4
	//   90  192:invokestatic    #236 <Method long System.currentTimeMillis()>
	//   91  195:putfield        #239 <Field long j.e>
		obj.g = 0;
	//   92  198:aload           4
	//   93  200:iconst_0        
	//   94  201:putfield        #551 <Field int j.g>
		obj.f = b.c(context);
	//   95  204:aload           4
	//   96  206:aload_1         
	//   97  207:invokestatic    #244 <Method String b.c(Context)>
	//   98  210:putfield        #245 <Field String j.f>
		obj.h = s1;
	//   99  213:aload           4
	//  100  215:aload_3         
	//  101  216:putfield        #257 <Field String j.h>
		s = ((String) (com.baidu.android.pushservice.b.b.a(context).d(s1)));
	//  102  219:aload_1         
	//  103  220:invokestatic    #262 <Method com.baidu.android.pushservice.b.b com.baidu.android.pushservice.b.b.a(Context)>
	//  104  223:aload_3         
	//  105  224:invokevirtual   #265 <Method f com.baidu.android.pushservice.b.b.d(String)>
	//  106  227:astore_2        
		if(s != null)
	//* 107  228:aload_2         
	//* 108  229:ifnull          248
			insertBehavior(context, ((f) (s)), ((j) (obj)), new i(s1));
	//  109  232:aload_0         
	//  110  233:aload_1         
	//  111  234:aload_2         
	//  112  235:aload           4
	//  113  237:new             #190 <Class i>
	//  114  240:dup             
	//  115  241:aload_3         
	//  116  242:invokespecial   #266 <Method void i(String)>
	//  117  245:invokespecial   #268 <Method void insertBehavior(Context, f, j, i)>
	//  118  248:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #160 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #161 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("\r\n mMsgId = ");
	//    4    8:aload_1         
	//    5    9:ldc2            #553 <String "\r\n mMsgId = ">
	//    6   12:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mMsgId);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #83  <Field String mMsgId>
	//   11   21:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append("\r\n mAppId = ");
	//   13   25:aload_1         
	//   14   26:ldc2            #555 <String "\r\n mAppId = ">
	//   15   29:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(mAppId);
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #85  <Field String mAppId>
	//   20   38:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
		stringbuilder.append("\r\n mTitle = ");
	//   22   42:aload_1         
	//   23   43:ldc2            #557 <String "\r\n mTitle = ">
	//   24   46:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
		stringbuilder.append(mTitle);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #87  <Field String mTitle>
	//   29   55:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
		stringbuilder.append("\r\n mDescription = ");
	//   31   59:aload_1         
	//   32   60:ldc2            #559 <String "\r\n mDescription = ">
	//   33   63:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		stringbuilder.append(mDescription);
	//   35   67:aload_1         
	//   36   68:aload_0         
	//   37   69:getfield        #89  <Field String mDescription>
	//   38   72:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   39   75:pop             
		stringbuilder.append("\r\n mUrl = ");
	//   40   76:aload_1         
	//   41   77:ldc2            #561 <String "\r\n mUrl = ">
	//   42   80:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:pop             
		stringbuilder.append(mUrl);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #91  <Field String mUrl>
	//   47   89:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
		stringbuilder.append("\r\n mNetType = ");
	//   49   93:aload_1         
	//   50   94:ldc2            #563 <String "\r\n mNetType = ">
	//   51   97:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   52  100:pop             
		stringbuilder.append(mNetType);
	//   53  101:aload_1         
	//   54  102:aload_0         
	//   55  103:getfield        #64  <Field int mNetType>
	//   56  106:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//   57  109:pop             
		stringbuilder.append("\r\n mSupportAppname = ");
	//   58  110:aload_1         
	//   59  111:ldc2            #565 <String "\r\n mSupportAppname = ">
	//   60  114:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   61  117:pop             
		stringbuilder.append(mSupportAppname);
	//   62  118:aload_1         
	//   63  119:aload_0         
	//   64  120:getfield        #567 <Field String mSupportAppname>
	//   65  123:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   66  126:pop             
		stringbuilder.append("\r\n mIsSupportApp = ");
	//   67  127:aload_1         
	//   68  128:ldc2            #569 <String "\r\n mIsSupportApp = ">
	//   69  131:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   70  134:pop             
		stringbuilder.append(mIsSupportApp);
	//   71  135:aload_1         
	//   72  136:aload_0         
	//   73  137:getfield        #72  <Field boolean mIsSupportApp>
	//   74  140:invokevirtual   #572 <Method StringBuilder StringBuilder.append(boolean)>
	//   75  143:pop             
		stringbuilder.append("\r\n mPkgName = ");
	//   76  144:aload_1         
	//   77  145:ldc2            #574 <String "\r\n mPkgName = ">
	//   78  148:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   79  151:pop             
		stringbuilder.append(mPkgName);
	//   80  152:aload_1         
	//   81  153:aload_0         
	//   82  154:getfield        #93  <Field String mPkgName>
	//   83  157:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   84  160:pop             
		stringbuilder.append("\r\n mPlgVercode = ");
	//   85  161:aload_1         
	//   86  162:ldc2            #576 <String "\r\n mPlgVercode = ">
	//   87  165:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   88  168:pop             
		stringbuilder.append(mPkgVercode);
	//   89  169:aload_1         
	//   90  170:aload_0         
	//   91  171:getfield        #62  <Field int mPkgVercode>
	//   92  174:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//   93  177:pop             
		stringbuilder.append("\r\n mNotificationBuilder = ");
	//   94  178:aload_1         
	//   95  179:ldc2            #578 <String "\r\n mNotificationBuilder = ">
	//   96  182:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//   97  185:pop             
		stringbuilder.append(mNotificationBuilder);
	//   98  186:aload_1         
	//   99  187:aload_0         
	//  100  188:getfield        #66  <Field int mNotificationBuilder>
	//  101  191:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//  102  194:pop             
		stringbuilder.append("\r\n mNotificationBasicStyle = ");
	//  103  195:aload_1         
	//  104  196:ldc2            #580 <String "\r\n mNotificationBasicStyle = ">
	//  105  199:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  106  202:pop             
		stringbuilder.append(mNotificationBasicStyle);
	//  107  203:aload_1         
	//  108  204:aload_0         
	//  109  205:getfield        #70  <Field int mNotificationBasicStyle>
	//  110  208:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//  111  211:pop             
		stringbuilder.append("\r\n mOpenType = ");
	//  112  212:aload_1         
	//  113  213:ldc2            #582 <String "\r\n mOpenType = ">
	//  114  216:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  115  219:pop             
		stringbuilder.append(mOpenType);
	//  116  220:aload_1         
	//  117  221:aload_0         
	//  118  222:getfield        #68  <Field int mOpenType>
	//  119  225:invokevirtual   #292 <Method StringBuilder StringBuilder.append(int)>
	//  120  228:pop             
		stringbuilder.append("\r\n mCustomContent = ");
	//  121  229:aload_1         
	//  122  230:ldc2            #584 <String "\r\n mCustomContent = ">
	//  123  233:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  124  236:pop             
		stringbuilder.append(mCustomContent);
	//  125  237:aload_1         
	//  126  238:aload_0         
	//  127  239:getfield        #99  <Field String mCustomContent>
	//  128  242:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  129  245:pop             
		stringbuilder.append("\r\n mIntent = ");
	//  130  246:aload_1         
	//  131  247:ldc2            #586 <String "\r\n mIntent = ">
	//  132  250:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  133  253:pop             
		stringbuilder.append(mPkgContent);
	//  134  254:aload_1         
	//  135  255:aload_0         
	//  136  256:getfield        #101 <Field String mPkgContent>
	//  137  259:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  138  262:pop             
		stringbuilder.append("\r\n");
	//  139  263:aload_1         
	//  140  264:ldc2            #588 <String "\r\n">
	//  141  267:invokevirtual   #167 <Method StringBuilder StringBuilder.append(String)>
	//  142  270:pop             
		return stringbuilder.toString();
	//  143  271:aload_1         
	//  144  272:invokevirtual   #173 <Method String StringBuilder.toString()>
	//  145  275:areturn         
	}

	public void writeToParcel(Parcel parcel, int k)
	{
		parcel.writeString(mMsgId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #83  <Field String mMsgId>
	//    3    5:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAppId);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #85  <Field String mAppId>
	//    7   13:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mTitle);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #87  <Field String mTitle>
	//   11   21:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mDescription);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #89  <Field String mDescription>
	//   15   29:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mUrl);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #91  <Field String mUrl>
	//   19   37:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mPkgName);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #93  <Field String mPkgName>
	//   23   45:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeInt(mPkgVercode);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #62  <Field int mPkgVercode>
	//   27   53:invokevirtual   #597 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mNotificationBuilder);
	//   28   56:aload_1         
	//   29   57:aload_0         
	//   30   58:getfield        #66  <Field int mNotificationBuilder>
	//   31   61:invokevirtual   #597 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mNotificationBasicStyle);
	//   32   64:aload_1         
	//   33   65:aload_0         
	//   34   66:getfield        #70  <Field int mNotificationBasicStyle>
	//   35   69:invokevirtual   #597 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mOpenType);
	//   36   72:aload_1         
	//   37   73:aload_0         
	//   38   74:getfield        #68  <Field int mOpenType>
	//   39   77:invokevirtual   #597 <Method void Parcel.writeInt(int)>
		parcel.writeInt(mUserConfirm);
	//   40   80:aload_1         
	//   41   81:aload_0         
	//   42   82:getfield        #74  <Field int mUserConfirm>
	//   43   85:invokevirtual   #597 <Method void Parcel.writeInt(int)>
		parcel.writeString(mCustomContent);
	//   44   88:aload_1         
	//   45   89:aload_0         
	//   46   90:getfield        #99  <Field String mCustomContent>
	//   47   93:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mPkgContent);
	//   48   96:aload_1         
	//   49   97:aload_0         
	//   50   98:getfield        #101 <Field String mPkgContent>
	//   51  101:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeInt(mAdvertiseStyle);
	//   52  104:aload_1         
	//   53  105:aload_0         
	//   54  106:getfield        #103 <Field int mAdvertiseStyle>
	//   55  109:invokevirtual   #597 <Method void Parcel.writeInt(int)>
		parcel.writeString(mAdvertiseSmallIconUrl);
	//   56  112:aload_1         
	//   57  113:aload_0         
	//   58  114:getfield        #105 <Field String mAdvertiseSmallIconUrl>
	//   59  117:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAdvertiseLargeIconUrl);
	//   60  120:aload_1         
	//   61  121:aload_0         
	//   62  122:getfield        #107 <Field String mAdvertiseLargeIconUrl>
	//   63  125:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAdvertiseClickUrl);
	//   64  128:aload_1         
	//   65  129:aload_0         
	//   66  130:getfield        #109 <Field String mAdvertiseClickUrl>
	//   67  133:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAdvertiseBigPictureUrl);
	//   68  136:aload_1         
	//   69  137:aload_0         
	//   70  138:getfield        #111 <Field String mAdvertiseBigPictureUrl>
	//   71  141:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAdvertiseBigPictureClickUrl);
	//   72  144:aload_1         
	//   73  145:aload_0         
	//   74  146:getfield        #113 <Field String mAdvertiseBigPictureClickUrl>
	//   75  149:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAdvertiseDownloadClickUrl);
	//   76  152:aload_1         
	//   77  153:aload_0         
	//   78  154:getfield        #115 <Field String mAdvertiseDownloadClickUrl>
	//   79  157:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAdvertiseDetailClickUrl);
	//   80  160:aload_1         
	//   81  161:aload_0         
	//   82  162:getfield        #117 <Field String mAdvertiseDetailClickUrl>
	//   83  165:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAdvertiseBigPictureTitle);
	//   84  168:aload_1         
	//   85  169:aload_0         
	//   86  170:getfield        #119 <Field String mAdvertiseBigPictureTitle>
	//   87  173:invokevirtual   #593 <Method void Parcel.writeString(String)>
		parcel.writeString(mAdvertiseBigPictureContent);
	//   88  176:aload_1         
	//   89  177:aload_0         
	//   90  178:getfield        #121 <Field String mAdvertiseBigPictureContent>
	//   91  181:invokevirtual   #593 <Method void Parcel.writeString(String)>
	//   92  184:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public PublicMsg a(Parcel parcel)
		{
			return new PublicMsg(parcel);
		//    0    0:new             #9   <Class PublicMsg>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void PublicMsg(Parcel)>
		//    4    8:areturn         
		}

		public PublicMsg[] a(int k)
		{
			return new PublicMsg[k];
		//    0    0:iload_1         
		//    1    1:anewarray       PublicMsg[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method PublicMsg a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int k)
		{
			return ((Object []) (a(k)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method PublicMsg[] a(int)>
		//    3    5:areturn         
		}

	}
;
	public static final int FLAG_NEED_CLEAR = 1;
	public static final int FLAG_NEED_SOUND = 4;
	public static final int FLAG_NEED_VIBRATE = 2;
	private static final String TAG = "PublicMsg";
	public String mAdvertiseBigPictureClickUrl;
	public String mAdvertiseBigPictureContent;
	public String mAdvertiseBigPictureTitle;
	public String mAdvertiseBigPictureUrl;
	public String mAdvertiseClickUrl;
	public String mAdvertiseDetailClickUrl;
	public String mAdvertiseDownloadClickUrl;
	public String mAdvertiseLargeIconUrl;
	public String mAdvertiseSmallIconUrl;
	public int mAdvertiseStyle;
	public String mAppId;
	public String mCustomContent;
	public String mDescription;
	public boolean mIsSupportApp;
	public String mMsgId;
	public int mNetType;
	public int mNotificationBasicStyle;
	public int mNotificationBuilder;
	public int mOpenType;
	public String mPkgContent;
	public String mPkgName;
	public int mPkgVercode;
	public String mSupportAppname;
	public String mTitle;
	public String mUrl;
	public int mUserConfirm;

	static 
	{
	//    0    0:new             #10  <Class PublicMsg$2>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void PublicMsg$2()>
	//    3    7:putstatic       #58  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
