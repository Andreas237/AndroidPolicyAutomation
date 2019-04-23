// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.paypal.android.sdk.at;
import com.paypal.android.sdk.cd;

// Referenced classes of package com.paypal.android.sdk.payments:
//			ak, cd

public final class PayPalConfiguration
	implements Parcelable
{

	public PayPalConfiguration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		j = cd.d();
	//    2    4:aload_0         
	//    3    5:invokestatic    #44  <Method boolean cd.d()>
	//    4    8:putfield        #46  <Field boolean j>
		o = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #48  <Field boolean o>
	//    8   16:return          
	}

	private PayPalConfiguration(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		j = cd.d();
	//    2    4:aload_0         
	//    3    5:invokestatic    #44  <Method boolean cd.d()>
	//    4    8:putfield        #46  <Field boolean j>
		boolean flag1 = true;
	//    5   11:iconst_1        
	//    6   12:istore_3        
		o = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #48  <Field boolean o>
		c = parcel.readString();
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #55  <Method String Parcel.readString()>
	//   13   23:putfield        #57  <Field String c>
		b = parcel.readString();
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #55  <Method String Parcel.readString()>
	//   17   31:putfield        #59  <Field String b>
		d = parcel.readString();
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #55  <Method String Parcel.readString()>
	//   21   39:putfield        #61  <Field String d>
		e = parcel.readString();
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokevirtual   #55  <Method String Parcel.readString()>
	//   25   47:putfield        #63  <Field String e>
		f = parcel.readString();
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #55  <Method String Parcel.readString()>
	//   29   55:putfield        #65  <Field String f>
		boolean flag;
		if(parcel.readByte() == 1)
	//*  30   58:aload_1         
	//*  31   59:invokevirtual   #69  <Method byte Parcel.readByte()>
	//*  32   62:iconst_1        
	//*  33   63:icmpne          71
			flag = true;
	//   34   66:iconst_1        
	//   35   67:istore_2        
		else
	//*  36   68:goto            73
			flag = false;
	//   37   71:iconst_0        
	//   38   72:istore_2        
		g = flag;
	//   39   73:aload_0         
	//   40   74:iload_2         
	//   41   75:putfield        #71  <Field boolean g>
		h = parcel.readString();
	//   42   78:aload_0         
	//   43   79:aload_1         
	//   44   80:invokevirtual   #55  <Method String Parcel.readString()>
	//   45   83:putfield        #73  <Field String h>
		i = parcel.readString();
	//   46   86:aload_0         
	//   47   87:aload_1         
	//   48   88:invokevirtual   #55  <Method String Parcel.readString()>
	//   49   91:putfield        #75  <Field String i>
		if(parcel.readByte() == 1)
	//*  50   94:aload_1         
	//*  51   95:invokevirtual   #69  <Method byte Parcel.readByte()>
	//*  52   98:iconst_1        
	//*  53   99:icmpne          107
			flag = true;
	//   54  102:iconst_1        
	//   55  103:istore_2        
		else
	//*  56  104:goto            109
			flag = false;
	//   57  107:iconst_0        
	//   58  108:istore_2        
		j = flag;
	//   59  109:aload_0         
	//   60  110:iload_2         
	//   61  111:putfield        #46  <Field boolean j>
		k = parcel.readString();
	//   62  114:aload_0         
	//   63  115:aload_1         
	//   64  116:invokevirtual   #55  <Method String Parcel.readString()>
	//   65  119:putfield        #77  <Field String k>
		l = parcel.readString();
	//   66  122:aload_0         
	//   67  123:aload_1         
	//   68  124:invokevirtual   #55  <Method String Parcel.readString()>
	//   69  127:putfield        #79  <Field String l>
		m = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   70  130:aload_0         
	//   71  131:aload_1         
	//   72  132:ldc1            #81  <Class Uri>
	//   73  134:invokevirtual   #87  <Method ClassLoader Class.getClassLoader()>
	//   74  137:invokevirtual   #91  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   75  140:checkcast       #81  <Class Uri>
	//   76  143:putfield        #93  <Field Uri m>
		n = (Uri)parcel.readParcelable(((Class) (android/net/Uri)).getClassLoader());
	//   77  146:aload_0         
	//   78  147:aload_1         
	//   79  148:ldc1            #81  <Class Uri>
	//   80  150:invokevirtual   #87  <Method ClassLoader Class.getClassLoader()>
	//   81  153:invokevirtual   #91  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   82  156:checkcast       #81  <Class Uri>
	//   83  159:putfield        #95  <Field Uri n>
		if(parcel.readByte() == 1)
	//*  84  162:aload_1         
	//*  85  163:invokevirtual   #69  <Method byte Parcel.readByte()>
	//*  86  166:iconst_1        
	//*  87  167:icmpne          175
			flag = flag1;
	//   88  170:iload_3         
	//   89  171:istore_2        
		else
	//*  90  172:goto            177
			flag = false;
	//   91  175:iconst_0        
	//   92  176:istore_2        
		o = flag;
	//   93  177:aload_0         
	//   94  178:iload_2         
	//   95  179:putfield        #48  <Field boolean o>
	//   96  182:return          
	}

	PayPalConfiguration(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void PayPalConfiguration(Parcel)>
	//    3    5:return          
	}

	private static void a(boolean flag, String s)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            38
		{
			String s1 = a;
	//    2    4:getstatic       #101 <Field String a>
	//    3    7:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #103 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #104 <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append(s);
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
			stringbuilder.append(" is invalid.  Please see the docs.");
	//   12   22:aload_3         
	//   13   23:ldc1            #110 <String " is invalid.  Please see the docs.">
	//   14   25:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
			Log.e(s1, stringbuilder.toString());
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   19   34:invokestatic    #118 <Method int Log.e(String, String)>
	//   20   37:pop             
		}
	//   21   38:return          
	}

	public final PayPalConfiguration a(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field String c>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	final String a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String b>
	//    2    4:areturn         
	}

	public final PayPalConfiguration b(String s)
	{
		k = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field String k>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	final String b()
	{
		if(TextUtils.isEmpty(((CharSequence) (c))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field String c>
	//*   2    4:invokestatic    #125 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            24
		{
			c = "live";
	//    4   10:aload_0         
	//    5   11:ldc1            #127 <String "live">
	//    6   13:putfield        #57  <Field String c>
			Log.w("paypal.sdk", "defaulting to production environment");
	//    7   16:ldc1            #129 <String "paypal.sdk">
	//    8   18:ldc1            #131 <String "defaulting to production environment">
	//    9   20:invokestatic    #134 <Method int Log.w(String, String)>
	//   10   23:pop             
		}
		return c;
	//   11   24:aload_0         
	//   12   25:getfield        #57  <Field String c>
	//   13   28:areturn         
	}

	final String c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String d>
	//    2    4:areturn         
	}

	final String d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String e>
	//    2    4:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final String e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String f>
	//    2    4:areturn         
	}

	final boolean f()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean g>
	//    2    4:ireturn         
	}

	final String g()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field String h>
	//    2    4:areturn         
	}

	final String h()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String i>
	//    2    4:areturn         
	}

	final boolean i()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean j>
	//    2    4:ireturn         
	}

	final boolean j()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field boolean o>
	//    2    4:ireturn         
	}

	final String k()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String k>
	//    2    4:areturn         
	}

	final String l()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String l>
	//    2    4:areturn         
	}

	final Uri m()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Uri m>
	//    2    4:areturn         
	}

	final Uri n()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field Uri n>
	//    2    4:areturn         
	}

	final boolean o()
	{
		boolean flag1 = cd.a(a, b(), "environment");
	//    0    0:getstatic       #101 <Field String a>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #139 <Method String b()>
	//    3    7:ldc1            #141 <String "environment">
	//    4    9:invokestatic    #146 <Method boolean cd.a(String, String, String)>
	//    5   12:istore_2        
		a(flag1, "environment");
	//    6   13:iload_2         
	//    7   14:ldc1            #141 <String "environment">
	//    8   16:invokestatic    #148 <Method void a(boolean, String)>
		boolean flag;
		if(flag1)
	//*   9   19:iload_2         
	//*  10   20:ifeq            60
		{
			if(at.a(b()))
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #139 <Method String b()>
	//*  13   27:invokestatic    #153 <Method boolean at.a(String)>
	//*  14   30:ifeq            38
			{
				flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_1        
			} else
	//*  17   35:goto            62
			{
				flag = cd.a(a, k, "clientId");
	//   18   38:getstatic       #101 <Field String a>
	//   19   41:aload_0         
	//   20   42:getfield        #77  <Field String k>
	//   21   45:ldc1            #155 <String "clientId">
	//   22   47:invokestatic    #146 <Method boolean cd.a(String, String, String)>
	//   23   50:istore_1        
				a(flag, "clientId");
	//   24   51:iload_1         
	//   25   52:ldc1            #155 <String "clientId">
	//   26   54:invokestatic    #148 <Method void a(boolean, String)>
			}
		} else
	//*  27   57:goto            62
		{
			flag = false;
	//   28   60:iconst_0        
	//   29   61:istore_1        
		}
		return flag1 && flag;
	//   30   62:iload_2         
	//   31   63:ifeq            72
	//   32   66:iload_1         
	//   33   67:ifeq            72
	//   34   70:iconst_1        
	//   35   71:ireturn         
	//   36   72:iconst_0        
	//   37   73:ireturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #103 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #104 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Class) (com/paypal/android/sdk/payments/PayPalConfiguration)).getSimpleName());
	//    4    8:aload_1         
	//    5    9:ldc1            #2   <Class PayPalConfiguration>
	//    6   11:invokevirtual   #158 <Method String Class.getSimpleName()>
	//    7   14:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(": {environment:%s, client_id:%s, languageOrLocale:%s}");
	//    9   18:aload_1         
	//   10   19:ldc1            #160 <String ": {environment:%s, client_id:%s, languageOrLocale:%s}">
	//   11   21:invokevirtual   #108 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		return String.format(stringbuilder.toString(), new Object[] {
			c, k, b
		});
	//   13   25:aload_1         
	//   14   26:invokevirtual   #113 <Method String StringBuilder.toString()>
	//   15   29:iconst_3        
	//   16   30:anewarray       Object[]
	//   17   33:dup             
	//   18   34:iconst_0        
	//   19   35:aload_0         
	//   20   36:getfield        #57  <Field String c>
	//   21   39:aastore         
	//   22   40:dup             
	//   23   41:iconst_1        
	//   24   42:aload_0         
	//   25   43:getfield        #77  <Field String k>
	//   26   46:aastore         
	//   27   47:dup             
	//   28   48:iconst_2        
	//   29   49:aload_0         
	//   30   50:getfield        #59  <Field String b>
	//   31   53:aastore         
	//   32   54:invokestatic    #166 <Method String String.format(String, Object[])>
	//   33   57:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i1)
	{
		parcel.writeString(c);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #57  <Field String c>
	//    3    5:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #59  <Field String b>
	//    7   13:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #61  <Field String d>
	//   11   21:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeString(e);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #63  <Field String e>
	//   15   29:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeString(f);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #65  <Field String f>
	//   19   37:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeByte((byte)g);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #71  <Field boolean g>
	//   23   45:int2byte        
	//   24   46:invokevirtual   #176 <Method void Parcel.writeByte(byte)>
		parcel.writeString(h);
	//   25   49:aload_1         
	//   26   50:aload_0         
	//   27   51:getfield        #73  <Field String h>
	//   28   54:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeString(i);
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:getfield        #75  <Field String i>
	//   32   62:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeByte((byte)j);
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #46  <Field boolean j>
	//   36   70:int2byte        
	//   37   71:invokevirtual   #176 <Method void Parcel.writeByte(byte)>
		parcel.writeString(k);
	//   38   74:aload_1         
	//   39   75:aload_0         
	//   40   76:getfield        #77  <Field String k>
	//   41   79:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeString(l);
	//   42   82:aload_1         
	//   43   83:aload_0         
	//   44   84:getfield        #79  <Field String l>
	//   45   87:invokevirtual   #172 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (m)), 0);
	//   46   90:aload_1         
	//   47   91:aload_0         
	//   48   92:getfield        #93  <Field Uri m>
	//   49   95:iconst_0        
	//   50   96:invokevirtual   #180 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeParcelable(((Parcelable) (n)), 0);
	//   51   99:aload_1         
	//   52  100:aload_0         
	//   53  101:getfield        #95  <Field Uri n>
	//   54  104:iconst_0        
	//   55  105:invokevirtual   #180 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeByte((byte)o);
	//   56  108:aload_1         
	//   57  109:aload_0         
	//   58  110:getfield        #48  <Field boolean o>
	//   59  113:int2byte        
	//   60  114:invokevirtual   #176 <Method void Parcel.writeByte(byte)>
	//   61  117:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ak();
	private static final String a = "PayPalConfiguration";
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private boolean g;
	private String h;
	private String i;
	private boolean j;
	private String k;
	private String l;
	private Uri m;
	private Uri n;
	private boolean o;

	static 
	{
	//    0    0:new             #32  <Class ak>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ak()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
