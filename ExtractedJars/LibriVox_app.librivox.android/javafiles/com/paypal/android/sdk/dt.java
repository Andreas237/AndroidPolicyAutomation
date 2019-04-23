// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Date;

// Referenced classes of package com.paypal.android.sdk:
//			cs, cw, cx, a, 
//			dv

public final class dt extends cs
	implements Parcelable
{

	public dt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void cs()>
	//    2    4:return          
	}

	private dt(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void cs()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method String Parcel.readString()>
	//    5    9:putfield        #39  <Field String a>
		b = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #36  <Method String Parcel.readString()>
	//    9   17:putfield        #41  <Field String b>
		d = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #36  <Method String Parcel.readString()>
	//   13   25:putfield        #43  <Field String d>
		c = (Date)parcel.readSerializable();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #47  <Method java.io.Serializable Parcel.readSerializable()>
	//   17   33:checkcast       #49  <Class Date>
	//   18   36:putfield        #51  <Field Date c>
		e = (cx)parcel.readSerializable();
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #47  <Method java.io.Serializable Parcel.readSerializable()>
	//   22   44:checkcast       #53  <Class cx>
	//   23   47:putfield        #55  <Field cx e>
		f = parcel.readInt();
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:invokevirtual   #59  <Method int Parcel.readInt()>
	//   27   55:putfield        #61  <Field int f>
		g = parcel.readInt();
	//   28   58:aload_0         
	//   29   59:aload_1         
	//   30   60:invokevirtual   #59  <Method int Parcel.readInt()>
	//   31   63:putfield        #63  <Field int g>
	//   32   66:return          
	}

	dt(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void dt(Parcel)>
	//    3    5:return          
	}

	public dt(a a1, String s, String s1, Date date, String s2, String s3, int i, 
			int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void cs()>
		a = a1.b(s1);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #72  <Method String a.b(String)>
	//    6   10:putfield        #39  <Field String a>
		b = s;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #41  <Field String b>
		c = date;
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:putfield        #51  <Field Date c>
		b(s2);
	//   13   24:aload_0         
	//   14   25:aload           5
	//   15   27:invokespecial   #75  <Method void b(String)>
		c(s3);
	//   16   30:aload_0         
	//   17   31:aload           6
	//   18   33:invokespecial   #77  <Method void c(String)>
		f = i;
	//   19   36:aload_0         
	//   20   37:iload           7
	//   21   39:putfield        #61  <Field int f>
		g = j;
	//   22   42:aload_0         
	//   23   43:iload           8
	//   24   45:putfield        #63  <Field int g>
	//   25   48:return          
	}

	public dt(String s, String s1, String s2, String s3, String s4, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void cs()>
		a = s1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #39  <Field String a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #41  <Field String b>
		c = dv.a(s2);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #83  <Method Date dv.a(String)>
	//   11   19:putfield        #51  <Field Date c>
		b(s3);
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:invokespecial   #75  <Method void b(String)>
		c(s4);
	//   15   28:aload_0         
	//   16   29:aload           5
	//   17   31:invokespecial   #77  <Method void c(String)>
		f = i;
	//   18   34:aload_0         
	//   19   35:iload           6
	//   20   37:putfield        #61  <Field int f>
		g = j;
	//   21   40:aload_0         
	//   22   41:iload           7
	//   23   43:putfield        #63  <Field int g>
	//   24   46:return          
	}

	public static String a(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder("x-");
	//    4    6:new             #85  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:ldc1            #87  <String "x-">
	//    7   12:invokespecial   #89  <Method void StringBuilder(String)>
	//    8   15:astore_1        
			stringbuilder.append(s.substring(s.length() - 4));
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:aload_0         
	//   12   19:invokevirtual   #94  <Method int String.length()>
	//   13   22:iconst_4        
	//   14   23:isub            
	//   15   24:invokevirtual   #98  <Method String String.substring(int)>
	//   16   27:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   17   30:pop             
			return stringbuilder.toString();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   20   35:areturn         
		}
	}

	private void b(String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
			s = s.substring(s.length() - 4);
	//    2    4:aload_1         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #94  <Method int String.length()>
	//    5    9:iconst_4        
	//    6   10:isub            
	//    7   11:invokevirtual   #98  <Method String String.substring(int)>
	//    8   14:astore_1        
		else
	//*   9   15:aload_0         
	//*  10   16:aload_1         
	//*  11   17:putfield        #43  <Field String d>
	//*  12   20:return          
			s = null;
	//   13   21:aconst_null     
	//   14   22:astore_1        
		d = s;
	//*  15   23:goto            15
	}

	private void c(String s)
	{
		e = cx.a(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #108 <Method cx cx.a(String)>
	//    3    5:putfield        #55  <Field cx e>
	//    4    8:return          
	}

	public final boolean b()
	{
		if(!TextUtils.isEmpty(((CharSequence) (b))) && !TextUtils.isEmpty(((CharSequence) (d))) && !TextUtils.isEmpty(((CharSequence) (a))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field String b>
	//*   2    4:invokestatic    #115 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifne            102
	//*   4   10:aload_0         
	//*   5   11:getfield        #43  <Field String d>
	//*   6   14:invokestatic    #115 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   17:ifne            102
	//*   8   20:aload_0         
	//*   9   21:getfield        #39  <Field String a>
	//*  10   24:invokestatic    #115 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   27:ifne            102
		{
			Date date = c;
	//   12   30:aload_0         
	//   13   31:getfield        #51  <Field Date c>
	//   14   34:astore_2        
			if(date != null && !date.before(new Date()))
	//*  15   35:aload_2         
	//*  16   36:ifnull          102
	//*  17   39:aload_2         
	//*  18   40:new             #49  <Class Date>
	//*  19   43:dup             
	//*  20   44:invokespecial   #116 <Method void Date()>
	//*  21   47:invokevirtual   #120 <Method boolean Date.before(Date)>
	//*  22   50:ifne            102
			{
				cx cx1 = e;
	//   23   53:aload_0         
	//   24   54:getfield        #55  <Field cx e>
	//   25   57:astore_2        
				if(cx1 != null && cx1 != cx.a)
	//*  26   58:aload_2         
	//*  27   59:ifnull          102
	//*  28   62:aload_2         
	//*  29   63:getstatic       #122 <Field cx cx.a>
	//*  30   66:if_acmpeq       102
				{
					int i = f;
	//   31   69:aload_0         
	//   32   70:getfield        #61  <Field int f>
	//   33   73:istore_1        
					if(i > 0 && i <= 12)
	//*  34   74:iload_1         
	//*  35   75:ifle            102
	//*  36   78:iload_1         
	//*  37   79:bipush          12
	//*  38   81:icmpgt          102
					{
						int j = g;
	//   39   84:aload_0         
	//   40   85:getfield        #63  <Field int g>
	//   41   88:istore_1        
						if(j >= 0 && j <= 9999)
	//*  42   89:iload_1         
	//*  43   90:iflt            102
	//*  44   93:iload_1         
	//*  45   94:sipush          9999
	//*  46   97:icmpgt          102
							return true;
	//   47  100:iconst_1        
	//   48  101:ireturn         
					}
				}
			}
		}
		return false;
	//   49  102:iconst_0        
	//   50  103:ireturn         
	}

	public final Date c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Date c>
	//    2    4:areturn         
	}

	public final String d()
	{
		return a(d);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String d>
	//    2    4:invokestatic    #125 <Method String a(String)>
	//    3    7:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final String e()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String b>
	//    2    4:areturn         
	}

	public final int f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int f>
	//    2    4:ireturn         
	}

	public final int g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int g>
	//    2    4:ireturn         
	}

	public final cx h()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field cx e>
	//    2    4:areturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("TokenizedCreditCard(token=");
	//    0    0:new             #85  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #130 <String "TokenizedCreditCard(token=">
	//    3    6:invokespecial   #89  <Method void StringBuilder(String)>
	//    4    9:astore_1        
		stringbuilder.append(b);
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #41  <Field String b>
	//    8   15:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(",lastFourDigits=");
	//   10   19:aload_1         
	//   11   20:ldc1            #132 <String ",lastFourDigits=">
	//   12   22:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(d);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #43  <Field String d>
	//   17   31:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(",payerId=");
	//   19   35:aload_1         
	//   20   36:ldc1            #134 <String ",payerId=">
	//   21   38:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
		stringbuilder.append(a);
	//   23   42:aload_1         
	//   24   43:aload_0         
	//   25   44:getfield        #39  <Field String a>
	//   26   47:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   27   50:pop             
		stringbuilder.append(",tokenValidUntil=");
	//   28   51:aload_1         
	//   29   52:ldc1            #136 <String ",tokenValidUntil=">
	//   30   54:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
		stringbuilder.append(((Object) (c)));
	//   32   58:aload_1         
	//   33   59:aload_0         
	//   34   60:getfield        #51  <Field Date c>
	//   35   63:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   36   66:pop             
		stringbuilder.append(",cardType=");
	//   37   67:aload_1         
	//   38   68:ldc1            #141 <String ",cardType=">
	//   39   70:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   40   73:pop             
		stringbuilder.append(((Object) (e)));
	//   41   74:aload_1         
	//   42   75:aload_0         
	//   43   76:getfield        #55  <Field cx e>
	//   44   79:invokevirtual   #139 <Method StringBuilder StringBuilder.append(Object)>
	//   45   82:pop             
		stringbuilder.append(",expiryMonth/year=");
	//   46   83:aload_1         
	//   47   84:ldc1            #143 <String ",expiryMonth/year=">
	//   48   86:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   49   89:pop             
		stringbuilder.append(f);
	//   50   90:aload_1         
	//   51   91:aload_0         
	//   52   92:getfield        #61  <Field int f>
	//   53   95:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//   54   98:pop             
		stringbuilder.append("/");
	//   55   99:aload_1         
	//   56  100:ldc1            #148 <String "/">
	//   57  102:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   58  105:pop             
		stringbuilder.append(g);
	//   59  106:aload_1         
	//   60  107:aload_0         
	//   61  108:getfield        #63  <Field int g>
	//   62  111:invokevirtual   #146 <Method StringBuilder StringBuilder.append(int)>
	//   63  114:pop             
		stringbuilder.append(")");
	//   64  115:aload_1         
	//   65  116:ldc1            #150 <String ")">
	//   66  118:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//   67  121:pop             
		return stringbuilder.toString();
	//   68  122:aload_1         
	//   69  123:invokevirtual   #105 <Method String StringBuilder.toString()>
	//   70  126:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field String a>
	//    3    5:invokevirtual   #155 <Method void Parcel.writeString(String)>
		parcel.writeString(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field String b>
	//    7   13:invokevirtual   #155 <Method void Parcel.writeString(String)>
		parcel.writeString(d);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field String d>
	//   11   21:invokevirtual   #155 <Method void Parcel.writeString(String)>
		parcel.writeSerializable(((java.io.Serializable) (c)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #51  <Field Date c>
	//   15   29:invokevirtual   #159 <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeSerializable(((java.io.Serializable) (e)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #55  <Field cx e>
	//   19   37:invokevirtual   #159 <Method void Parcel.writeSerializable(java.io.Serializable)>
		parcel.writeInt(f);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #61  <Field int f>
	//   23   45:invokevirtual   #163 <Method void Parcel.writeInt(int)>
		parcel.writeInt(g);
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #63  <Field int g>
	//   27   53:invokevirtual   #163 <Method void Parcel.writeInt(int)>
	//   28   56:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new cw();
	private String b;
	private Date c;
	private String d;
	private cx e;
	private int f;
	private int g;

	static 
	{
	//    0    0:new             #22  <Class cw>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void cw()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
