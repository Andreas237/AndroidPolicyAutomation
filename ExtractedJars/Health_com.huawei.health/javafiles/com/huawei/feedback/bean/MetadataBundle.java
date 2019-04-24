// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.feedback.bean;

import android.text.TextUtils;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class MetadataBundle
{

	public MetadataBundle(int i, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		json = new JSONObject();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class JSONObject>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void JSONObject()>
	//    6   12:putfield        #22  <Field JSONObject json>
		Object obj = ((Object) (new Date()));
	//    7   15:new             #24  <Class Date>
	//    8   18:dup             
	//    9   19:invokespecial   #25  <Method void Date()>
	//   10   22:astore          4
		obj = ((Object) ((new SimpleDateFormat("yyyyMMddHHmmss")).format(((Date) (obj)))));
	//   11   24:new             #27  <Class SimpleDateFormat>
	//   12   27:dup             
	//   13   28:ldc1            #29  <String "yyyyMMddHHmmss">
	//   14   30:invokespecial   #32  <Method void SimpleDateFormat(String)>
	//   15   33:aload           4
	//   16   35:invokevirtual   #36  <Method String SimpleDateFormat.format(Date)>
	//   17   38:astore          4
		try
		{
			json.putOpt("Eventid", ((Object) (Integer.valueOf(i))));
	//   18   40:aload_0         
	//   19   41:getfield        #22  <Field JSONObject json>
	//   20   44:ldc1            #38  <String "Eventid">
	//   21   46:iload_1         
	//   22   47:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   23   50:invokevirtual   #48  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   24   53:pop             
			json.putOpt("HappenTime", obj);
	//   25   54:aload_0         
	//   26   55:getfield        #22  <Field JSONObject json>
	//   27   58:ldc1            #50  <String "HappenTime">
	//   28   60:aload           4
	//   29   62:invokevirtual   #48  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   30   65:pop             
			json.putOpt("Package", ((Object) (s)));
	//   31   66:aload_0         
	//   32   67:getfield        #22  <Field JSONObject json>
	//   33   70:ldc1            #52  <String "Package">
	//   34   72:aload_2         
	//   35   73:invokevirtual   #48  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   36   76:pop             
			json.putOpt("Version", ((Object) (s1)));
	//   37   77:aload_0         
	//   38   78:getfield        #22  <Field JSONObject json>
	//   39   81:ldc1            #54  <String "Version">
	//   40   83:aload_3         
	//   41   84:invokevirtual   #48  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   42   87:pop             
			return;
	//   43   88:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  44   89:astore_2        
		{
			Log.e("AppLogApi/MetadataBundle", "MetadataBundle JSONException!");
	//   45   90:ldc1            #8   <String "AppLogApi/MetadataBundle">
	//   46   92:ldc1            #56  <String "MetadataBundle JSONException!">
	//   47   94:invokestatic    #62  <Method int Log.e(String, String)>
	//   48   97:pop             
		}
	//   49   98:return          
	}

	public void putData(String s, String s1)
	{
		try
		{
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #71  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            26
			{
				s1 = s1.replaceAll("(\r\n|\r|\n|\n\r)", " ");
	//    3    7:aload_2         
	//    4    8:ldc1            #73  <String "(\r\n|\r|\n|\n\r)">
	//    5   10:ldc1            #75  <String " ">
	//    6   12:invokevirtual   #81  <Method String String.replaceAll(String, String)>
	//    7   15:astore_2        
				json.putOpt(s, ((Object) (s1)));
	//    8   16:aload_0         
	//    9   17:getfield        #22  <Field JSONObject json>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #48  <Method JSONObject JSONObject.putOpt(String, Object)>
	//   13   25:pop             
			}
			return;
	//   14   26:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  15   27:astore_1        
		{
			Log.e("AppLogApi/MetadataBundle", "putData JSONException!");
	//   16   28:ldc1            #8   <String "AppLogApi/MetadataBundle">
	//   17   30:ldc1            #83  <String "putData JSONException!">
	//   18   32:invokestatic    #62  <Method int Log.e(String, String)>
	//   19   35:pop             
		}
	//   20   36:return          
	}

	public String toString()
	{
		return json.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field JSONObject json>
	//    2    4:invokevirtual   #87  <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	private static final String TAG = "AppLogApi/MetadataBundle";
	private JSONObject json;
}
