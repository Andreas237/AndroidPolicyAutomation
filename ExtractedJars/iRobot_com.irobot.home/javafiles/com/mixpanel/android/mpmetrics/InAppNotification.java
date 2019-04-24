// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.mixpanel.android.a.e;
import com.mixpanel.android.a.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			b

public abstract class InAppNotification
	implements Parcelable
{
	public static class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/mixpanel/android/mpmetrics/InAppNotification$a, s);
		//    0    0:ldc1            #2   <Class InAppNotification$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #49  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class InAppNotification$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field InAppNotification$a[] $VALUES>
		//    1    3:invokevirtual   #56  <Method Object _5B_Lcom.mixpanel.android.mpmetrics.InAppNotification$a_3B_.clone()>
		//    2    6:checkcast       #52  <Class InAppNotification$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a MINI;
		public static final a TAKEOVER;
		public static final a UNKNOWN;

		static 
		{
			UNKNOWN = ((a) (new a("UNKNOWN", 0) {

				public String toString()
				{
					return "*unknown_type*";
				//    0    0:ldc1            #17  <String "*unknown_type*">
				//    1    2:areturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void InAppNotification$a(String, int, InAppNotification$1)>
			//    5    7:return          
			}
			}
));
		//    0    0:new             #10  <Class InAppNotification$a$1>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #27  <Method void InAppNotification$a$1(String, int)>
		//    5   10:putstatic       #29  <Field InAppNotification$a UNKNOWN>
			MINI = ((a) (new a("MINI", 1) {

				public String toString()
				{
					return "mini";
				//    0    0:ldc1            #17  <String "mini">
				//    1    2:areturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void InAppNotification$a(String, int, InAppNotification$1)>
			//    5    7:return          
			}
			}
));
		//    6   13:new             #12  <Class InAppNotification$a$2>
		//    7   16:dup             
		//    8   17:ldc1            #30  <String "MINI">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #31  <Method void InAppNotification$a$2(String, int)>
		//   11   23:putstatic       #33  <Field InAppNotification$a MINI>
			TAKEOVER = ((a) (new a("TAKEOVER", 2) {

				public String toString()
				{
					return "takeover";
				//    0    0:ldc1            #17  <String "takeover">
				//    1    2:areturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void InAppNotification$a(String, int, InAppNotification$1)>
			//    5    7:return          
			}
			}
));
		//   12   26:new             #14  <Class InAppNotification$a$3>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "TAKEOVER">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #35  <Method void InAppNotification$a$3(String, int)>
		//   17   36:putstatic       #37  <Field InAppNotification$a TAKEOVER>
			$VALUES = (new a[] {
				UNKNOWN, MINI, TAKEOVER
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       a[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #29  <Field InAppNotification$a UNKNOWN>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #33  <Field InAppNotification$a MINI>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #37  <Field InAppNotification$a TAKEOVER>
		//   31   60:aastore         
		//   32   61:putstatic       #39  <Field InAppNotification$a[] $VALUES>
		//*  33   64:return          
		}

		private a(String s, int i1)
		{
			super(s, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}

	}


	public InAppNotification()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #49  <Field JSONObject a>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #51  <Field JSONObject b>
		c = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #53  <Field int c>
		d = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #55  <Field int d>
		f = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #57  <Field int f>
		g = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #59  <Field String g>
		h = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #61  <Field int h>
		i = null;
	//   23   39:aload_0         
	//   24   40:aconst_null     
	//   25   41:putfield        #63  <Field String i>
	//   26   44:return          
	}

	public InAppNotification(Parcel parcel)
	{
		JSONObject jsonobject1;
		JSONObject jsonobject2;
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		jsonobject2 = new JSONObject();
	//    2    4:new             #68  <Class JSONObject>
	//    3    7:dup             
	//    4    8:invokespecial   #69  <Method void JSONObject()>
	//    5   11:astore          4
		jsonobject1 = new JSONObject();
	//    6   13:new             #68  <Class JSONObject>
	//    7   16:dup             
	//    8   17:invokespecial   #69  <Method void JSONObject()>
	//    9   20:astore_3        
		JSONObject jsonobject = new JSONObject(parcel.readString());
	//   10   21:new             #68  <Class JSONObject>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokevirtual   #75  <Method String Parcel.readString()>
	//   14   29:invokespecial   #78  <Method void JSONObject(String)>
	//   15   32:astore_2        
		jsonobject2 = new JSONObject(parcel.readString());
	//   16   33:new             #68  <Class JSONObject>
	//   17   36:dup             
	//   18   37:aload_1         
	//   19   38:invokevirtual   #75  <Method String Parcel.readString()>
	//   20   41:invokespecial   #78  <Method void JSONObject(String)>
	//   21   44:astore          4
		jsonobject1 = jsonobject2;
	//   22   46:aload           4
	//   23   48:astore_3        
		  goto _L1
	//*  24   49:goto            62
_L2:
		jsonobject = jsonobject2;
	//   25   52:aload           4
	//   26   54:astore_2        
_L3:
		com.mixpanel.android.a.f.e("MixpanelAPI.InAppNotif", "Error reading JSON when creating InAppNotification from Parcel");
	//   27   55:ldc1            #80  <String "MixpanelAPI.InAppNotif">
	//   28   57:ldc1            #82  <String "Error reading JSON when creating InAppNotification from Parcel">
	//   29   59:invokestatic    #87  <Method void f.e(String, String)>
_L1:
		a = jsonobject;
	//   30   62:aload_0         
	//   31   63:aload_2         
	//   32   64:putfield        #49  <Field JSONObject a>
		b = jsonobject1;
	//   33   67:aload_0         
	//   34   68:aload_3         
	//   35   69:putfield        #51  <Field JSONObject b>
		c = parcel.readInt();
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:invokevirtual   #91  <Method int Parcel.readInt()>
	//   39   77:putfield        #53  <Field int c>
		d = parcel.readInt();
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:invokevirtual   #91  <Method int Parcel.readInt()>
	//   43   85:putfield        #55  <Field int d>
		f = parcel.readInt();
	//   44   88:aload_0         
	//   45   89:aload_1         
	//   46   90:invokevirtual   #91  <Method int Parcel.readInt()>
	//   47   93:putfield        #57  <Field int f>
		g = parcel.readString();
	//   48   96:aload_0         
	//   49   97:aload_1         
	//   50   98:invokevirtual   #75  <Method String Parcel.readString()>
	//   51  101:putfield        #59  <Field String g>
		h = parcel.readInt();
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:invokevirtual   #91  <Method int Parcel.readInt()>
	//   55  109:putfield        #61  <Field int h>
		i = parcel.readString();
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:invokevirtual   #75  <Method String Parcel.readString()>
	//   59  117:putfield        #63  <Field String i>
		j = (Bitmap)parcel.readParcelable(((Class) (android/graphics/Bitmap)).getClassLoader());
	//   60  120:aload_0         
	//   61  121:aload_1         
	//   62  122:ldc1            #93  <Class Bitmap>
	//   63  124:invokevirtual   #99  <Method ClassLoader Class.getClassLoader()>
	//   64  127:invokevirtual   #103 <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   65  130:checkcast       #93  <Class Bitmap>
	//   66  133:putfield        #105 <Field Bitmap j>
		return;
	//   67  136:return          
		JSONException jsonexception;
		jsonexception;
	//   68  137:astore_2        
		  goto _L2
	//*  69  138:goto            52
		JSONException jsonexception1;
		jsonexception1;
	//   70  141:astore          4
		  goto _L3
	//*  71  143:goto            55
	}

	InAppNotification(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		try
		{
			a = jsonobject;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field JSONObject a>
			b = jsonobject.getJSONObject("extras");
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:ldc1            #108 <String "extras">
	//    8   13:invokevirtual   #112 <Method JSONObject JSONObject.getJSONObject(String)>
	//    9   16:putfield        #51  <Field JSONObject b>
			c = jsonobject.getInt("id");
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:ldc1            #114 <String "id">
	//   13   23:invokevirtual   #118 <Method int JSONObject.getInt(String)>
	//   14   26:putfield        #53  <Field int c>
			d = jsonobject.getInt("message_id");
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:ldc1            #120 <String "message_id">
	//   18   33:invokevirtual   #118 <Method int JSONObject.getInt(String)>
	//   19   36:putfield        #55  <Field int d>
			f = jsonobject.getInt("bg_color");
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:ldc1            #122 <String "bg_color">
	//   23   43:invokevirtual   #118 <Method int JSONObject.getInt(String)>
	//   24   46:putfield        #57  <Field int f>
			g = com.mixpanel.android.a.e.a(jsonobject, "body");
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:ldc1            #124 <String "body">
	//   28   53:invokestatic    #129 <Method String e.a(JSONObject, String)>
	//   29   56:putfield        #59  <Field String g>
			h = jsonobject.optInt("body_color");
	//   30   59:aload_0         
	//   31   60:aload_1         
	//   32   61:ldc1            #131 <String "body_color">
	//   33   63:invokevirtual   #134 <Method int JSONObject.optInt(String)>
	//   34   66:putfield        #61  <Field int h>
			i = jsonobject.getString("image_url");
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:ldc1            #136 <String "image_url">
	//   38   73:invokevirtual   #140 <Method String JSONObject.getString(String)>
	//   39   76:putfield        #63  <Field String i>
			j = Bitmap.createBitmap(500, 500, android.graphics.Bitmap.Config.ARGB_8888);
	//   40   79:aload_0         
	//   41   80:sipush          500
	//   42   83:sipush          500
	//   43   86:getstatic       #146 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   44   89:invokestatic    #150 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   45   92:putfield        #105 <Field Bitmap j>
			return;
	//   46   95:return          
		}
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  47   96:astore_1        
		{
			throw new b("Notification JSON was unexpected or bad", ((Throwable) (jsonobject)));
	//   48   97:new             #152 <Class b>
	//   49  100:dup             
	//   50  101:ldc1            #154 <String "Notification JSON was unexpected or bad">
	//   51  103:aload_1         
	//   52  104:invokespecial   #157 <Method void b(String, Throwable)>
	//   53  107:athrow          
		}
	}

	static String a(String s, String s1)
	{
		Matcher matcher = e.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #43  <Field Pattern e>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #162 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_2        
		if(matcher.find())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #168 <Method boolean Matcher.find()>
	//*   6   12:ifeq            45
		{
			s = ((String) (new StringBuilder()));
	//    7   15:new             #170 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #171 <Method void StringBuilder()>
	//   10   22:astore_0        
			((StringBuilder) (s)).append(s1);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			((StringBuilder) (s)).append("$1");
	//   15   29:aload_0         
	//   16   30:ldc1            #177 <String "$1">
	//   17   32:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			s = matcher.replaceFirst(((StringBuilder) (s)).toString());
	//   19   36:aload_2         
	//   20   37:aload_0         
	//   21   38:invokevirtual   #180 <Method String StringBuilder.toString()>
	//   22   41:invokevirtual   #183 <Method String Matcher.replaceFirst(String)>
	//   23   44:astore_0        
		}
		return s;
	//   24   45:aload_0         
	//   25   46:areturn         
	}

	JSONObject a()
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #68  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("campaign_id", b());
	//    4    8:aload_1         
	//    5    9:ldc1            #186 <String "campaign_id">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #188 <Method int b()>
	//    8   15:invokevirtual   #192 <Method JSONObject JSONObject.put(String, int)>
	//    9   18:pop             
			jsonobject.put("message_id", c());
	//   10   19:aload_1         
	//   11   20:ldc1            #120 <String "message_id">
	//   12   22:aload_0         
	//   13   23:invokevirtual   #194 <Method int c()>
	//   14   26:invokevirtual   #192 <Method JSONObject JSONObject.put(String, int)>
	//   15   29:pop             
			jsonobject.put("message_type", "inapp");
	//   16   30:aload_1         
	//   17   31:ldc1            #196 <String "message_type">
	//   18   33:ldc1            #198 <String "inapp">
	//   19   35:invokevirtual   #201 <Method JSONObject JSONObject.put(String, Object)>
	//   20   38:pop             
			jsonobject.put("message_subtype", ((Object) (d().toString())));
	//   21   39:aload_1         
	//   22   40:ldc1            #203 <String "message_subtype">
	//   23   42:aload_0         
	//   24   43:invokevirtual   #206 <Method InAppNotification$a d()>
	//   25   46:invokevirtual   #207 <Method String InAppNotification$a.toString()>
	//   26   49:invokevirtual   #201 <Method JSONObject JSONObject.put(String, Object)>
	//   27   52:pop             
		}
	//*  28   53:aload_1         
	//*  29   54:areturn         
		catch(JSONException jsonexception)
	//*  30   55:astore_2        
		{
			com.mixpanel.android.a.f.e("MixpanelAPI.InAppNotif", "Impossible JSON Exception", ((Throwable) (jsonexception)));
	//   31   56:ldc1            #80  <String "MixpanelAPI.InAppNotif">
	//   32   58:ldc1            #209 <String "Impossible JSON Exception">
	//   33   60:aload_2         
	//   34   61:invokestatic    #212 <Method void f.e(String, String, Throwable)>
			return jsonobject;
	//   35   64:aload_1         
	//   36   65:areturn         
		}
		return jsonobject;
	}

	void a(Bitmap bitmap)
	{
		j = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #105 <Field Bitmap j>
	//    3    5:return          
	}

	public int b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int c>
	//    2    4:ireturn         
	}

	public int c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int d>
	//    2    4:ireturn         
	}

	public abstract a d();

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int f>
	//    2    4:ireturn         
	}

	public boolean f()
	{
		return g != null;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String g>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String g>
	//    2    4:areturn         
	}

	public int h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int h>
	//    2    4:ireturn         
	}

	public String i()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String i>
	//    2    4:areturn         
	}

	public String j()
	{
		return a(i, "@2x");
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String i>
	//    2    4:ldc1            #216 <String "@2x">
	//    3    6:invokestatic    #218 <Method String a(String, String)>
	//    4    9:areturn         
	}

	public String k()
	{
		return a(i, "@4x");
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String i>
	//    2    4:ldc1            #221 <String "@4x">
	//    3    6:invokestatic    #218 <Method String a(String, String)>
	//    4    9:areturn         
	}

	public Bitmap l()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Bitmap j>
	//    2    4:areturn         
	}

	protected JSONObject m()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field JSONObject b>
	//    2    4:areturn         
	}

	public String toString()
	{
		return a.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field JSONObject a>
	//    2    4:invokevirtual   #225 <Method String JSONObject.toString()>
	//    3    7:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeString(a.toString());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field JSONObject a>
	//    3    5:invokevirtual   #225 <Method String JSONObject.toString()>
	//    4    8:invokevirtual   #230 <Method void Parcel.writeString(String)>
		parcel.writeString(b.toString());
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #51  <Field JSONObject b>
	//    8   16:invokevirtual   #225 <Method String JSONObject.toString()>
	//    9   19:invokevirtual   #230 <Method void Parcel.writeString(String)>
		parcel.writeInt(c);
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #53  <Field int c>
	//   13   27:invokevirtual   #234 <Method void Parcel.writeInt(int)>
		parcel.writeInt(d);
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #55  <Field int d>
	//   17   35:invokevirtual   #234 <Method void Parcel.writeInt(int)>
		parcel.writeInt(f);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #57  <Field int f>
	//   21   43:invokevirtual   #234 <Method void Parcel.writeInt(int)>
		parcel.writeString(g);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:getfield        #59  <Field String g>
	//   25   51:invokevirtual   #230 <Method void Parcel.writeString(String)>
		parcel.writeInt(h);
	//   26   54:aload_1         
	//   27   55:aload_0         
	//   28   56:getfield        #61  <Field int h>
	//   29   59:invokevirtual   #234 <Method void Parcel.writeInt(int)>
		parcel.writeString(i);
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:getfield        #63  <Field String i>
	//   33   67:invokevirtual   #230 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (j)), i1);
	//   34   70:aload_1         
	//   35   71:aload_0         
	//   36   72:getfield        #105 <Field Bitmap j>
	//   37   75:iload_2         
	//   38   76:invokevirtual   #238 <Method void Parcel.writeParcelable(Parcelable, int)>
	//   39   79:return          
	}

	private static final Pattern e = Pattern.compile("(\\.[^./]+$)");
	protected final JSONObject a;
	protected final JSONObject b;
	protected final int c;
	protected final int d;
	private final int f;
	private final String g;
	private final int h;
	private final String i;
	private Bitmap j;

	static 
	{
	//    0    0:ldc1            #35  <String "(\\.[^./]+$)">
	//    1    2:invokestatic    #41  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #43  <Field Pattern e>
	//*   3    8:return          
	}
}
