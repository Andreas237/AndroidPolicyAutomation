// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbv;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzty, zzjj, zzajm, zzakb

final class zzuc
{

	private zzuc(zzjj zzjj1, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzaao = zzjj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzjj zzaao>
		zzye = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field String zzye>
		zzbop = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int zzbop>
	//   11   19:return          
	}

	zzuc(zzty zzty1)
	{
		this(zzty1.zzlf(), zzty1.getAdUnitId(), zzty1.getNetworkType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method zzjj zzty.zzlf()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #36  <Method String zzty.getAdUnitId()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #40  <Method int zzty.getNetworkType()>
	//    7   13:invokespecial   #42  <Method void zzuc(zzjj, String, int)>
	//    8   16:return          
	}

	static zzuc zzba(String s)
		throws IOException
	{
		Object aobj[];
		aobj = ((Object []) (s.split("\0")));
	//    0    0:aload_0         
	//    1    1:ldc1            #54  <String "\0">
	//    2    3:invokevirtual   #60  <Method String[] String.split(String)>
	//    3    6:astore_3        
		if(aobj.length != 3)
	//*   4    7:aload_3         
	//*   5    8:arraylength     
	//*   6    9:iconst_3        
	//*   7   10:icmpeq          23
			throw new IOException("Incorrect field count for QueueSeed.");
	//    8   13:new             #46  <Class IOException>
	//    9   16:dup             
	//   10   17:ldc1            #62  <String "Incorrect field count for QueueSeed.">
	//   11   19:invokespecial   #65  <Method void IOException(String)>
	//   12   22:athrow          
		s = ((String) (Parcel.obtain()));
	//   13   23:invokestatic    #71  <Method Parcel Parcel.obtain()>
	//   14   26:astore_0        
		Object obj;
		obj = ((Object) (new String(Base64.decode(aobj[0], 0), "UTF-8")));
	//   15   27:new             #56  <Class String>
	//   16   30:dup             
	//   17   31:aload_3         
	//   18   32:iconst_0        
	//   19   33:aaload          
	//   20   34:iconst_0        
	//   21   35:invokestatic    #77  <Method byte[] Base64.decode(String, int)>
	//   22   38:ldc1            #79  <String "UTF-8">
	//   23   40:invokespecial   #82  <Method void String(byte[], String)>
	//   24   43:astore_2        
		int i = Integer.parseInt(aobj[1]);
	//   25   44:aload_3         
	//   26   45:iconst_1        
	//   27   46:aaload          
	//   28   47:invokestatic    #88  <Method int Integer.parseInt(String)>
	//   29   50:istore_1        
		aobj = ((Object []) (Base64.decode(aobj[2], 0)));
	//   30   51:aload_3         
	//   31   52:iconst_2        
	//   32   53:aaload          
	//   33   54:iconst_0        
	//   34   55:invokestatic    #77  <Method byte[] Base64.decode(String, int)>
	//   35   58:astore_3        
		((Parcel) (s)).unmarshall(((byte []) (aobj)), 0, aobj.length);
	//   36   59:aload_0         
	//   37   60:aload_3         
	//   38   61:iconst_0        
	//   39   62:aload_3         
	//   40   63:arraylength     
	//   41   64:invokevirtual   #92  <Method void Parcel.unmarshall(byte[], int, int)>
		((Parcel) (s)).setDataPosition(0);
	//   42   67:aload_0         
	//   43   68:iconst_0        
	//   44   69:invokevirtual   #96  <Method void Parcel.setDataPosition(int)>
		obj = ((Object) (new zzuc((zzjj)zzjj.CREATOR.createFromParcel(((Parcel) (s))), ((String) (obj)), i)));
	//   45   72:new             #2   <Class zzuc>
	//   46   75:dup             
	//   47   76:getstatic       #102 <Field android.os.Parcelable$Creator zzjj.CREATOR>
	//   48   79:aload_0         
	//   49   80:invokeinterface #108 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   50   85:checkcast       #98  <Class zzjj>
	//   51   88:aload_2         
	//   52   89:iload_1         
	//   53   90:invokespecial   #42  <Method void zzuc(zzjj, String, int)>
	//   54   93:astore_2        
		((Parcel) (s)).recycle();
	//   55   94:aload_0         
	//   56   95:invokevirtual   #111 <Method void Parcel.recycle()>
		return ((zzuc) (obj));
	//   57   98:aload_2         
	//   58   99:areturn         
		Object obj1;
		obj1;
	//   59  100:astore_2        
		break MISSING_BLOCK_LABEL_125;
	//   60  101:goto            125
		obj1;
	//   61  104:astore_2        
		zzbv.zzeo().zza(((Throwable) (obj1)), "QueueSeed.decode");
	//   62  105:invokestatic    #117 <Method zzajm zzbv.zzeo()>
	//   63  108:aload_2         
	//   64  109:ldc1            #119 <String "QueueSeed.decode">
	//   65  111:invokevirtual   #125 <Method void zzajm.zza(Throwable, String)>
		throw new IOException("Malformed QueueSeed encoding.", ((Throwable) (obj1)));
	//   66  114:new             #46  <Class IOException>
	//   67  117:dup             
	//   68  118:ldc1            #127 <String "Malformed QueueSeed encoding.">
	//   69  120:aload_2         
	//   70  121:invokespecial   #130 <Method void IOException(String, Throwable)>
	//   71  124:athrow          
		((Parcel) (s)).recycle();
	//   72  125:aload_0         
	//   73  126:invokevirtual   #111 <Method void Parcel.recycle()>
		throw obj1;
	//   74  129:aload_2         
	//   75  130:athrow          
	}

	final String zzlu()
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #71  <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		String s;
		s = Base64.encodeToString(zzye.getBytes("UTF-8"), 0);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String zzye>
	//    4    8:ldc1            #79  <String "UTF-8">
	//    5   10:invokevirtual   #138 <Method byte[] String.getBytes(String)>
	//    6   13:iconst_0        
	//    7   14:invokestatic    #142 <Method String Base64.encodeToString(byte[], int)>
	//    8   17:astore_2        
		String s1 = Integer.toString(zzbop);
	//    9   18:aload_0         
	//   10   19:getfield        #23  <Field int zzbop>
	//   11   22:invokestatic    #146 <Method String Integer.toString(int)>
	//   12   25:astore_3        
		zzaao.writeToParcel(parcel, 0);
	//   13   26:aload_0         
	//   14   27:getfield        #19  <Field zzjj zzaao>
	//   15   30:aload_1         
	//   16   31:iconst_0        
	//   17   32:invokevirtual   #150 <Method void zzjj.writeToParcel(Parcel, int)>
		String s2 = Base64.encodeToString(parcel.marshall(), 0);
	//   18   35:aload_1         
	//   19   36:invokevirtual   #154 <Method byte[] Parcel.marshall()>
	//   20   39:iconst_0        
	//   21   40:invokestatic    #142 <Method String Base64.encodeToString(byte[], int)>
	//   22   43:astore          4
		StringBuilder stringbuilder = new StringBuilder(2 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   23   45:new             #156 <Class StringBuilder>
	//   24   48:dup             
	//   25   49:iconst_2        
	//   26   50:aload_2         
	//   27   51:invokestatic    #160 <Method String String.valueOf(Object)>
	//   28   54:invokevirtual   #163 <Method int String.length()>
	//   29   57:iadd            
	//   30   58:aload_3         
	//   31   59:invokestatic    #160 <Method String String.valueOf(Object)>
	//   32   62:invokevirtual   #163 <Method int String.length()>
	//   33   65:iadd            
	//   34   66:aload           4
	//   35   68:invokestatic    #160 <Method String String.valueOf(Object)>
	//   36   71:invokevirtual   #163 <Method int String.length()>
	//   37   74:iadd            
	//   38   75:invokespecial   #165 <Method void StringBuilder(int)>
	//   39   78:astore          5
		stringbuilder.append(s);
	//   40   80:aload           5
	//   41   82:aload_2         
	//   42   83:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   43   86:pop             
		stringbuilder.append("\0");
	//   44   87:aload           5
	//   45   89:ldc1            #54  <String "\0">
	//   46   91:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
		stringbuilder.append(s1);
	//   48   95:aload           5
	//   49   97:aload_3         
	//   50   98:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   51  101:pop             
		stringbuilder.append("\0");
	//   52  102:aload           5
	//   53  104:ldc1            #54  <String "\0">
	//   54  106:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   55  109:pop             
		stringbuilder.append(s2);
	//   56  110:aload           5
	//   57  112:aload           4
	//   58  114:invokevirtual   #169 <Method StringBuilder StringBuilder.append(String)>
	//   59  117:pop             
		s = stringbuilder.toString();
	//   60  118:aload           5
	//   61  120:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   62  123:astore_2        
		parcel.recycle();
	//   63  124:aload_1         
	//   64  125:invokevirtual   #111 <Method void Parcel.recycle()>
		return s;
	//   65  128:aload_2         
	//   66  129:areturn         
		Object obj;
		obj;
	//   67  130:astore_2        
		  goto _L1
	//*  68  131:goto            146
_L3:
		zzakb.e("QueueSeed encode failed because UTF-8 is not available.");
	//   69  134:ldc1            #173 <String "QueueSeed encode failed because UTF-8 is not available.">
	//   70  136:invokestatic    #178 <Method void zzakb.e(String)>
		parcel.recycle();
	//   71  139:aload_1         
	//   72  140:invokevirtual   #111 <Method void Parcel.recycle()>
		return "";
	//   73  143:ldc1            #180 <String "">
	//   74  145:areturn         
_L1:
		parcel.recycle();
	//   75  146:aload_1         
	//   76  147:invokevirtual   #111 <Method void Parcel.recycle()>
		throw obj;
	//   77  150:aload_2         
	//   78  151:athrow          
		obj;
	//   79  152:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  80  153:goto            134
	}

	final zzjj zzaao;
	final int zzbop;
	final String zzye;
}
