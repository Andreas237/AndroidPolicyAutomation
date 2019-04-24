// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class InAppButton
	implements Parcelable
{

	public InAppButton(Parcel parcel)
	{
		JSONObject jsonobject;
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		jsonobject = new JSONObject();
	//    2    4:new             #34  <Class JSONObject>
	//    3    7:dup             
	//    4    8:invokespecial   #35  <Method void JSONObject()>
	//    5   11:astore_2        
		JSONObject jsonobject1 = new JSONObject(parcel.readString());
	//    6   12:new             #34  <Class JSONObject>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokevirtual   #41  <Method String Parcel.readString()>
	//   10   20:invokespecial   #44  <Method void JSONObject(String)>
	//   11   23:astore_3        
		jsonobject = jsonobject1;
	//   12   24:aload_3         
	//   13   25:astore_2        
		  goto _L1
	//*  14   26:goto            37
_L3:
		Log.e("MixpanelAPI.InAppButton", "Error reading JSON when creating InAppButton from Parcel");
	//   15   29:ldc1            #46  <String "MixpanelAPI.InAppButton">
	//   16   31:ldc1            #48  <String "Error reading JSON when creating InAppButton from Parcel">
	//   17   33:invokestatic    #53  <Method int Log.e(String, String)>
	//   18   36:pop             
_L1:
		a = jsonobject;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #55  <Field JSONObject a>
		b = parcel.readString();
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #41  <Method String Parcel.readString()>
	//   25   47:putfield        #57  <Field String b>
		c = parcel.readInt();
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #61  <Method int Parcel.readInt()>
	//   29   55:putfield        #63  <Field int c>
		d = parcel.readInt();
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:invokevirtual   #61  <Method int Parcel.readInt()>
	//   33   63:putfield        #65  <Field int d>
		e = parcel.readInt();
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:invokevirtual   #61  <Method int Parcel.readInt()>
	//   37   71:putfield        #67  <Field int e>
		f = parcel.readString();
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:invokevirtual   #41  <Method String Parcel.readString()>
	//   41   79:putfield        #69  <Field String f>
		return;
	//   42   82:return          
		JSONException jsonexception;
		jsonexception;
	//   43   83:astore_3        
		if(true) goto _L3; else goto _L2
_L2:
	//*  44   84:goto            29
	}

	InAppButton(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		a = jsonobject;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #55  <Field JSONObject a>
		b = jsonobject.getString("text");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #72  <String "text">
	//    8   13:invokevirtual   #76  <Method String JSONObject.getString(String)>
	//    9   16:putfield        #57  <Field String b>
		c = jsonobject.getInt("text_color");
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:ldc1            #78  <String "text_color">
	//   13   23:invokevirtual   #82  <Method int JSONObject.getInt(String)>
	//   14   26:putfield        #63  <Field int c>
		d = jsonobject.getInt("bg_color");
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:ldc1            #84  <String "bg_color">
	//   18   33:invokevirtual   #82  <Method int JSONObject.getInt(String)>
	//   19   36:putfield        #65  <Field int d>
		e = jsonobject.getInt("border_color");
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:ldc1            #86  <String "border_color">
	//   23   43:invokevirtual   #82  <Method int JSONObject.getInt(String)>
	//   24   46:putfield        #67  <Field int e>
		f = jsonobject.getString("cta_url");
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:ldc1            #88  <String "cta_url">
	//   28   53:invokevirtual   #76  <Method String JSONObject.getString(String)>
	//   29   56:putfield        #69  <Field String f>
	//   30   59:return          
	}

	public String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String b>
	//    2    4:areturn         
	}

	public int b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int c>
	//    2    4:ireturn         
	}

	public int c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int d>
	//    2    4:ireturn         
	}

	public int d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int e>
	//    2    4:ireturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field String f>
	//    2    4:areturn         
	}

	public String toString()
	{
		return a.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field JSONObject a>
	//    2    4:invokevirtual   #92  <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a.toString());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field JSONObject a>
	//    3    5:invokevirtual   #92  <Method String JSONObject.toString()>
	//    4    8:invokevirtual   #97  <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #57  <Field String b>
	//    8   16:invokevirtual   #97  <Method void Parcel.writeString(String)>
		parcel.writeInt(c);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #63  <Field int c>
	//   12   24:invokevirtual   #101 <Method void Parcel.writeInt(int)>
		parcel.writeInt(d);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #65  <Field int d>
	//   16   32:invokevirtual   #101 <Method void Parcel.writeInt(int)>
		parcel.writeInt(e);
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #67  <Field int e>
	//   20   40:invokevirtual   #101 <Method void Parcel.writeInt(int)>
		parcel.writeString(f);
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #69  <Field String f>
	//   24   48:invokevirtual   #97  <Method void Parcel.writeString(String)>
	//   25   51:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public InAppButton a(Parcel parcel)
		{
			return new InAppButton(parcel);
		//    0    0:new             #9   <Class InAppButton>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void InAppButton(Parcel)>
		//    4    8:areturn         
		}

		public InAppButton[] a(int i)
		{
			return new InAppButton[i];
		//    0    0:iload_1         
		//    1    1:anewarray       InAppButton[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method InAppButton a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method InAppButton[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private JSONObject a;
	private String b;
	private int c;
	private int d;
	private int e;
	private String f;

	static 
	{
	//    0    0:new             #8   <Class InAppButton$1>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void InAppButton$1()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
