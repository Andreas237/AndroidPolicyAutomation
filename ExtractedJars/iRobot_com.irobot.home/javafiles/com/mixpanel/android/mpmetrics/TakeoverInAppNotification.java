// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import com.mixpanel.android.a.e;
import java.util.ArrayList;
import org.json.*;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//			InAppNotification, InAppButton, b

public class TakeoverInAppNotification extends InAppNotification
{

	public TakeoverInAppNotification(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void InAppNotification(Parcel)>
		e = parcel.createTypedArrayList(InAppButton.CREATOR);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #33  <Field android.os.Parcelable$Creator InAppButton.CREATOR>
	//    6   10:invokevirtual   #39  <Method ArrayList Parcel.createTypedArrayList(android.os.Parcelable$Creator)>
	//    7   13:putfield        #41  <Field ArrayList e>
		f = parcel.readInt();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #45  <Method int Parcel.readInt()>
	//   11   21:putfield        #47  <Field int f>
		g = parcel.readString();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #51  <Method String Parcel.readString()>
	//   15   29:putfield        #53  <Field String g>
		h = parcel.readInt();
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #45  <Method int Parcel.readInt()>
	//   19   37:putfield        #55  <Field int h>
		boolean flag;
		if(parcel.readByte() != 0)
	//*  20   40:aload_1         
	//*  21   41:invokevirtual   #59  <Method byte Parcel.readByte()>
	//*  22   44:ifeq            52
			flag = true;
	//   23   47:iconst_1        
	//   24   48:istore_2        
		else
	//*  25   49:goto            54
			flag = false;
	//   26   52:iconst_0        
	//   27   53:istore_2        
		i = flag;
	//   28   54:aload_0         
	//   29   55:iload_2         
	//   30   56:putfield        #61  <Field boolean i>
	//   31   59:return          
	}

	TakeoverInAppNotification(JSONObject jsonobject)
	{
		super(jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void InAppNotification(JSONObject)>
		int j;
		JSONArray jsonarray;
		JSONObject jsonobject1;
		try
		{
			jsonarray = jsonobject.getJSONArray("buttons");
	//    3    5:aload_1         
	//    4    6:ldc1            #68  <String "buttons">
	//    5    8:invokevirtual   #74  <Method JSONArray JSONObject.getJSONArray(String)>
	//    6   11:astore_3        
			e = new ArrayList();
	//    7   12:aload_0         
	//    8   13:new             #76  <Class ArrayList>
	//    9   16:dup             
	//   10   17:invokespecial   #77  <Method void ArrayList()>
	//   11   20:putfield        #41  <Field ArrayList e>
		}
	//*  12   23:iconst_0        
	//*  13   24:istore_2        
	//*  14   25:iload_2         
	//*  15   26:aload_3         
	//*  16   27:invokevirtual   #82  <Method int JSONArray.length()>
	//*  17   30:icmpge          67
	//*  18   33:aload_3         
	//*  19   34:iload_2         
	//*  20   35:invokevirtual   #86  <Method Object JSONArray.get(int)>
	//*  21   38:checkcast       #70  <Class JSONObject>
	//*  22   41:astore          4
	//*  23   43:aload_0         
	//*  24   44:getfield        #41  <Field ArrayList e>
	//*  25   47:new             #32  <Class InAppButton>
	//*  26   50:dup             
	//*  27   51:aload           4
	//*  28   53:invokespecial   #87  <Method void InAppButton(JSONObject)>
	//*  29   56:invokevirtual   #91  <Method boolean ArrayList.add(Object)>
	//*  30   59:pop             
	//*  31   60:iload_2         
	//*  32   61:iconst_1        
	//*  33   62:iadd            
	//*  34   63:istore_2        
	//*  35   64:goto            25
	//*  36   67:aload_0         
	//*  37   68:aload_1         
	//*  38   69:ldc1            #93  <String "close_color">
	//*  39   71:invokevirtual   #97  <Method int JSONObject.getInt(String)>
	//*  40   74:putfield        #47  <Field int f>
	//*  41   77:aload_0         
	//*  42   78:aload_1         
	//*  43   79:ldc1            #99  <String "title">
	//*  44   81:invokestatic    #105 <Method String e.a(JSONObject, String)>
	//*  45   84:putfield        #53  <Field String g>
	//*  46   87:aload_0         
	//*  47   88:aload_1         
	//*  48   89:ldc1            #107 <String "title_color">
	//*  49   91:invokevirtual   #110 <Method int JSONObject.optInt(String)>
	//*  50   94:putfield        #55  <Field int h>
	//*  51   97:aload_0         
	//*  52   98:aload_0         
	//*  53   99:invokevirtual   #114 <Method JSONObject m()>
	//*  54  102:ldc1            #116 <String "image_fade">
	//*  55  104:invokevirtual   #120 <Method boolean JSONObject.getBoolean(String)>
	//*  56  107:putfield        #61  <Field boolean i>
	//*  57  110:return          
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  58  111:astore_1        
		{
			throw new b("Notification JSON was unexpected or bad", ((Throwable) (jsonobject)));
	//   59  112:new             #122 <Class b>
	//   60  115:dup             
	//   61  116:ldc1            #124 <String "Notification JSON was unexpected or bad">
	//   62  118:aload_1         
	//   63  119:invokespecial   #127 <Method void b(String, Throwable)>
	//   64  122:athrow          
		}
		j = 0;
		if(j >= jsonarray.length())
			break; /* Loop/switch isn't completed */
		jsonobject1 = (JSONObject)jsonarray.get(j);
		e.add(((Object) (new InAppButton(jsonobject1))));
		j++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_25;
_L1:
		f = jsonobject.getInt("close_color");
		g = com.mixpanel.android.a.e.a(jsonobject, "title");
		h = jsonobject.optInt("title_color");
		i = m().getBoolean("image_fade");
		return;
	}

	public InAppButton a(int j)
	{
		if(e.size() > j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field ArrayList e>
	//*   2    4:invokevirtual   #131 <Method int ArrayList.size()>
	//*   3    7:iload_1         
	//*   4    8:icmple          23
			return (InAppButton)e.get(j);
	//    5   11:aload_0         
	//    6   12:getfield        #41  <Field ArrayList e>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #132 <Method Object ArrayList.get(int)>
	//    9   19:checkcast       #32  <Class InAppButton>
	//   10   22:areturn         
		else
			return null;
	//   11   23:aconst_null     
	//   12   24:areturn         
	}

	public InAppNotification.a d()
	{
		return InAppNotification.a.TAKEOVER;
	//    0    0:getstatic       #140 <Field InAppNotification$a InAppNotification$a.TAKEOVER>
	//    1    3:areturn         
	}

	public boolean n()
	{
		return g != null;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String g>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String o()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String g>
	//    2    4:areturn         
	}

	public int p()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int h>
	//    2    4:ireturn         
	}

	public int q()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field int f>
	//    2    4:ireturn         
	}

	public int r()
	{
		return e.size();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ArrayList e>
	//    2    4:invokevirtual   #131 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public boolean s()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field boolean i>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		super.writeToParcel(parcel, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #151 <Method void InAppNotification.writeToParcel(Parcel, int)>
		parcel.writeTypedList(((java.util.List) (e)));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #41  <Field ArrayList e>
	//    7   11:invokevirtual   #155 <Method void Parcel.writeTypedList(java.util.List)>
		parcel.writeInt(f);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #47  <Field int f>
	//   11   19:invokevirtual   #159 <Method void Parcel.writeInt(int)>
		parcel.writeString(g);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #53  <Field String g>
	//   15   27:invokevirtual   #163 <Method void Parcel.writeString(String)>
		parcel.writeInt(h);
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #55  <Field int h>
	//   19   35:invokevirtual   #159 <Method void Parcel.writeInt(int)>
		parcel.writeByte((byte)i);
	//   20   38:aload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #61  <Field boolean i>
	//   23   43:int2byte        
	//   24   44:invokevirtual   #167 <Method void Parcel.writeByte(byte)>
	//   25   47:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public TakeoverInAppNotification a(Parcel parcel)
		{
			return new TakeoverInAppNotification(parcel);
		//    0    0:new             #9   <Class TakeoverInAppNotification>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void TakeoverInAppNotification(Parcel)>
		//    4    8:areturn         
		}

		public TakeoverInAppNotification[] a(int j)
		{
			return new TakeoverInAppNotification[j];
		//    0    0:iload_1         
		//    1    1:anewarray       TakeoverInAppNotification[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method TakeoverInAppNotification a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int j)
		{
			return ((Object []) (a(j)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method TakeoverInAppNotification[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private final ArrayList e;
	private final int f;
	private final String g;
	private final int h;
	private final boolean i;

	static 
	{
	//    0    0:new             #6   <Class TakeoverInAppNotification$1>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void TakeoverInAppNotification$1()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
