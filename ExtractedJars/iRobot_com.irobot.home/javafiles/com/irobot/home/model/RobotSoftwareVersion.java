// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.irobot.home.util.o;

public class RobotSoftwareVersion
	implements Parcelable
{

	public RobotSoftwareVersion(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		d = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <String "">
	//    4    7:putfield        #31  <Field String d>
		a = parcel.readInt();
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #37  <Method int Parcel.readInt()>
	//    8   15:putfield        #39  <Field int a>
		b = parcel.readInt();
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #37  <Method int Parcel.readInt()>
	//   12   23:putfield        #41  <Field int b>
		c = parcel.readInt();
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #37  <Method int Parcel.readInt()>
	//   16   31:putfield        #43  <Field int c>
		d = parcel.readString();
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #47  <Method String Parcel.readString()>
	//   20   39:putfield        #31  <Field String d>
	//   21   42:return          
	}

	public RobotSoftwareVersion(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		d = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #29  <String "">
	//    4    7:putfield        #31  <Field String d>
		a(s);
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #50  <Method void a(String)>
	//    8   15:return          
	}

	public void a(String s)
	{
		String as[] = s.split("\\.|-|\\+");
	//    0    0:aload_1         
	//    1    1:ldc1            #54  <String "\\.|-|\\+">
	//    2    3:invokevirtual   #60  <Method String[] String.split(String)>
	//    3    6:astore_3        
		if(as.length < 3) goto _L2; else goto _L1
	//    4    7:aload_3         
	//    5    8:arraylength     
	//    6    9:iconst_3        
	//    7   10:icmplt          118
_L1:
		Object obj;
		if(!as[0].startsWith("v"))
			break MISSING_BLOCK_LABEL_123;
	//    8   13:aload_3         
	//    9   14:iconst_0        
	//   10   15:aaload          
	//   11   16:ldc1            #62  <String "v">
	//   12   18:invokevirtual   #66  <Method boolean String.startsWith(String)>
	//   13   21:ifeq            123
		obj = ((Object) (as[0].substring(1)));
	//   14   24:aload_3         
	//   15   25:iconst_0        
	//   16   26:aaload          
	//   17   27:iconst_1        
	//   18   28:invokevirtual   #70  <Method String String.substring(int)>
	//   19   31:astore_2        
_L3:
		obj = ((Object) (Integer.valueOf(((String) (obj)))));
	//   20   32:aload_2         
	//   21   33:invokestatic    #76  <Method Integer Integer.valueOf(String)>
	//   22   36:astore_2        
	//*  23   37:goto            40
		try
		{
			a = ((Integer) (obj)).intValue();
	//   24   40:aload_0         
	//   25   41:aload_2         
	//   26   42:invokevirtual   #79  <Method int Integer.intValue()>
	//   27   45:putfield        #39  <Field int a>
			b = Integer.valueOf(as[1]).intValue();
	//   28   48:aload_0         
	//   29   49:aload_3         
	//   30   50:iconst_1        
	//   31   51:aaload          
	//   32   52:invokestatic    #76  <Method Integer Integer.valueOf(String)>
	//   33   55:invokevirtual   #79  <Method int Integer.intValue()>
	//   34   58:putfield        #41  <Field int b>
			c = Integer.valueOf(as[2]).intValue();
	//   35   61:aload_0         
	//   36   62:aload_3         
	//   37   63:iconst_2        
	//   38   64:aaload          
	//   39   65:invokestatic    #76  <Method Integer Integer.valueOf(String)>
	//   40   68:invokevirtual   #79  <Method int Integer.intValue()>
	//   41   71:putfield        #43  <Field int c>
			if(as.length >= 4)
	//*  42   74:aload_3         
	//*  43   75:arraylength     
	//*  44   76:iconst_4        
	//*  45   77:icmplt          118
			{
				d = as[3];
	//   46   80:aload_0         
	//   47   81:aload_3         
	//   48   82:iconst_3        
	//   49   83:aaload          
	//   50   84:putfield        #31  <Field String d>
				return;
	//   51   87:return          
			}
		}
	//*  52   88:new             #81  <Class StringBuilder>
	//*  53   91:dup             
	//*  54   92:invokespecial   #82  <Method void StringBuilder()>
	//*  55   95:astore_2        
	//*  56   96:aload_2         
	//*  57   97:ldc1            #84  <String "Invalid version string: ">
	//*  58   99:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//*  59  102:pop             
	//*  60  103:aload_2         
	//*  61  104:aload_1         
	//*  62  105:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//*  63  108:pop             
	//*  64  109:ldc1            #90  <String "SoftwareVersion">
	//*  65  111:aload_2         
	//*  66  112:invokevirtual   #93  <Method String StringBuilder.toString()>
	//*  67  115:invokestatic    #99  <Method void o.e(String, String)>
	//*  68  118:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Invalid version string: ");
			((StringBuilder) (obj)).append(s);
			o.e("SoftwareVersion", ((StringBuilder) (obj)).toString());
		}
_L2:
		return;
	//*  69  119:astore_2        
	//*  70  120:goto            88
		obj = ((Object) (as[0]));
	//   71  123:aload_3         
	//   72  124:iconst_0        
	//   73  125:aaload          
	//   74  126:astore_2        
		  goto _L3
	//*  75  127:goto            32
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field int a>
	//    7   13:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//    8   16:pop             
		((StringBuilder) (obj)).append(".");
	//    9   17:aload_1         
	//   10   18:ldc1            #105 <String ".">
	//   11   20:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		((StringBuilder) (obj)).append(b);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #41  <Field int b>
	//   16   29:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   17   32:pop             
		((StringBuilder) (obj)).append(".");
	//   18   33:aload_1         
	//   19   34:ldc1            #105 <String ".">
	//   20   36:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		((StringBuilder) (obj)).append(c);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #43  <Field int c>
	//   25   45:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   26   48:pop             
		String s = ((StringBuilder) (obj)).toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   29   53:astore_2        
		obj = ((Object) (s));
	//   30   54:aload_2         
	//   31   55:astore_1        
		if(!d.isEmpty())
	//*  32   56:aload_0         
	//*  33   57:getfield        #31  <Field String d>
	//*  34   60:invokevirtual   #109 <Method boolean String.isEmpty()>
	//*  35   63:ifne            101
		{
			obj = ((Object) (new StringBuilder()));
	//   36   66:new             #81  <Class StringBuilder>
	//   37   69:dup             
	//   38   70:invokespecial   #82  <Method void StringBuilder()>
	//   39   73:astore_1        
			((StringBuilder) (obj)).append(s);
	//   40   74:aload_1         
	//   41   75:aload_2         
	//   42   76:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
			((StringBuilder) (obj)).append("-");
	//   44   80:aload_1         
	//   45   81:ldc1            #111 <String "-">
	//   46   83:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   47   86:pop             
			((StringBuilder) (obj)).append(d);
	//   48   87:aload_1         
	//   49   88:aload_0         
	//   50   89:getfield        #31  <Field String d>
	//   51   92:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   52   95:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   53   96:aload_1         
	//   54   97:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   55  100:astore_1        
		}
		return ((String) (obj));
	//   56  101:aload_1         
	//   57  102:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field int a>
	//    3    5:invokevirtual   #117 <Method void Parcel.writeInt(int)>
		parcel.writeInt(b);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field int b>
	//    7   13:invokevirtual   #117 <Method void Parcel.writeInt(int)>
		parcel.writeInt(c);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field int c>
	//   11   21:invokevirtual   #117 <Method void Parcel.writeInt(int)>
		parcel.writeString(d);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #31  <Field String d>
	//   15   29:invokevirtual   #120 <Method void Parcel.writeString(String)>
	//   16   32:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public RobotSoftwareVersion a(Parcel parcel)
		{
			return new RobotSoftwareVersion(parcel);
		//    0    0:new             #9   <Class RobotSoftwareVersion>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void RobotSoftwareVersion(Parcel)>
		//    4    8:areturn         
		}

		public RobotSoftwareVersion[] a(int i)
		{
			return new RobotSoftwareVersion[i];
		//    0    0:iload_1         
		//    1    1:anewarray       RobotSoftwareVersion[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method RobotSoftwareVersion a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method RobotSoftwareVersion[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private int a;
	private int b;
	private int c;
	private String d;

	static 
	{
	//    0    0:new             #8   <Class RobotSoftwareVersion$1>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void RobotSoftwareVersion$1()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
