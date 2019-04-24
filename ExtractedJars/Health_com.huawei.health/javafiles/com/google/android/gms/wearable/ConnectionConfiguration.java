// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaa;

// Referenced classes of package com.google.android.gms.wearable:
//			zzg

public class ConnectionConfiguration extends zza
	implements ReflectedParcelable
{

	ConnectionConfiguration(String s, String s1, int i, int j, boolean flag, boolean flag1, String s2, 
			boolean flag2, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void zza()>
		mName = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field String mName>
		zzaSq = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String zzaSq>
		zzakD = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #39  <Field int zzakD>
		zzaLu = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #41  <Field int zzaLu>
		zzbSP = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #43  <Field boolean zzbSP>
		zzagx = flag1;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #45  <Field boolean zzagx>
		zzbSQ = s2;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #47  <Field String zzbSQ>
		zzbSR = flag2;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #49  <Field boolean zzbSR>
		zzbSS = s3;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #51  <Field String zzbSS>
	//   29   55:return          
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof ConnectionConfiguration))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ConnectionConfiguration>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		obj = ((Object) ((ConnectionConfiguration)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class ConnectionConfiguration>
	//    7   13:astore_1        
		return zzaa.equal(((Object) (mName)), ((Object) (((ConnectionConfiguration) (obj)).mName))) && zzaa.equal(((Object) (zzaSq)), ((Object) (((ConnectionConfiguration) (obj)).zzaSq))) && zzaa.equal(((Object) (Integer.valueOf(zzakD))), ((Object) (Integer.valueOf(((ConnectionConfiguration) (obj)).zzakD)))) && zzaa.equal(((Object) (Integer.valueOf(zzaLu))), ((Object) (Integer.valueOf(((ConnectionConfiguration) (obj)).zzaLu)))) && zzaa.equal(((Object) (Boolean.valueOf(zzbSP))), ((Object) (Boolean.valueOf(((ConnectionConfiguration) (obj)).zzbSP)))) && zzaa.equal(((Object) (Boolean.valueOf(zzbSR))), ((Object) (Boolean.valueOf(((ConnectionConfiguration) (obj)).zzbSR))));
	//    8   14:aload_0         
	//    9   15:getfield        #35  <Field String mName>
	//   10   18:aload_1         
	//   11   19:getfield        #35  <Field String mName>
	//   12   22:invokestatic    #59  <Method boolean zzaa.equal(Object, Object)>
	//   13   25:ifeq            124
	//   14   28:aload_0         
	//   15   29:getfield        #37  <Field String zzaSq>
	//   16   32:aload_1         
	//   17   33:getfield        #37  <Field String zzaSq>
	//   18   36:invokestatic    #59  <Method boolean zzaa.equal(Object, Object)>
	//   19   39:ifeq            124
	//   20   42:aload_0         
	//   21   43:getfield        #39  <Field int zzakD>
	//   22   46:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   23   49:aload_1         
	//   24   50:getfield        #39  <Field int zzakD>
	//   25   53:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   26   56:invokestatic    #59  <Method boolean zzaa.equal(Object, Object)>
	//   27   59:ifeq            124
	//   28   62:aload_0         
	//   29   63:getfield        #41  <Field int zzaLu>
	//   30   66:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   31   69:aload_1         
	//   32   70:getfield        #41  <Field int zzaLu>
	//   33   73:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   34   76:invokestatic    #59  <Method boolean zzaa.equal(Object, Object)>
	//   35   79:ifeq            124
	//   36   82:aload_0         
	//   37   83:getfield        #43  <Field boolean zzbSP>
	//   38   86:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   39   89:aload_1         
	//   40   90:getfield        #43  <Field boolean zzbSP>
	//   41   93:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   42   96:invokestatic    #59  <Method boolean zzaa.equal(Object, Object)>
	//   43   99:ifeq            124
	//   44  102:aload_0         
	//   45  103:getfield        #49  <Field boolean zzbSR>
	//   46  106:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   47  109:aload_1         
	//   48  110:getfield        #49  <Field boolean zzbSR>
	//   49  113:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   50  116:invokestatic    #59  <Method boolean zzaa.equal(Object, Object)>
	//   51  119:ifeq            124
	//   52  122:iconst_1        
	//   53  123:ireturn         
	//   54  124:iconst_0        
	//   55  125:ireturn         
	}

	public String getAddress()
	{
		return zzaSq;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String zzaSq>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String mName>
	//    2    4:areturn         
	}

	public String getNodeId()
	{
		return zzbSS;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String zzbSS>
	//    2    4:areturn         
	}

	public int getRole()
	{
		return zzaLu;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int zzaLu>
	//    2    4:ireturn         
	}

	public int getType()
	{
		return zzakD;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int zzakD>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return zzaa.hashCode(new Object[] {
			mName, zzaSq, Integer.valueOf(zzakD), Integer.valueOf(zzaLu), Boolean.valueOf(zzbSP), Boolean.valueOf(zzbSR)
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #35  <Field String mName>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #37  <Field String zzaSq>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #39  <Field int zzakD>
	//   16   25:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   17   28:aastore         
	//   18   29:dup             
	//   19   30:iconst_3        
	//   20   31:aload_0         
	//   21   32:getfield        #41  <Field int zzaLu>
	//   22   35:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   23   38:aastore         
	//   24   39:dup             
	//   25   40:iconst_4        
	//   26   41:aload_0         
	//   27   42:getfield        #43  <Field boolean zzbSP>
	//   28   45:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   29   48:aastore         
	//   30   49:dup             
	//   31   50:iconst_5        
	//   32   51:aload_0         
	//   33   52:getfield        #49  <Field boolean zzbSR>
	//   34   55:invokestatic    #70  <Method Boolean Boolean.valueOf(boolean)>
	//   35   58:aastore         
	//   36   59:invokestatic    #83  <Method int zzaa.hashCode(Object[])>
	//   37   62:ireturn         
	}

	public boolean isConnected()
	{
		return zzagx;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field boolean zzagx>
	//    2    4:ireturn         
	}

	public boolean isEnabled()
	{
		return zzbSP;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field boolean zzbSP>
	//    2    4:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("ConnectionConfiguration[ ");
	//    0    0:new             #89  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #91  <String "ConnectionConfiguration[ ">
	//    3    6:invokespecial   #94  <Method void StringBuilder(String)>
	//    4    9:astore          4
		String s = String.valueOf(((Object) (mName)));
	//    5   11:aload_0         
	//    6   12:getfield        #35  <Field String mName>
	//    7   15:invokestatic    #99  <Method String String.valueOf(Object)>
	//    8   18:astore_3        
		if(s.length() != 0)
	//*   9   19:aload_3         
	//*  10   20:invokevirtual   #102 <Method int String.length()>
	//*  11   23:ifeq            36
			s = "mName=".concat(s);
	//   12   26:ldc1            #104 <String "mName=">
	//   13   28:aload_3         
	//   14   29:invokevirtual   #108 <Method String String.concat(String)>
	//   15   32:astore_3        
		else
	//*  16   33:goto            46
			s = new String("mName=");
	//   17   36:new             #96  <Class String>
	//   18   39:dup             
	//   19   40:ldc1            #104 <String "mName=">
	//   20   42:invokespecial   #109 <Method void String(String)>
	//   21   45:astore_3        
		stringbuilder.append(s);
	//   22   46:aload           4
	//   23   48:aload_3         
	//   24   49:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		s = String.valueOf(((Object) (zzaSq)));
	//   26   53:aload_0         
	//   27   54:getfield        #37  <Field String zzaSq>
	//   28   57:invokestatic    #99  <Method String String.valueOf(Object)>
	//   29   60:astore_3        
		if(s.length() != 0)
	//*  30   61:aload_3         
	//*  31   62:invokevirtual   #102 <Method int String.length()>
	//*  32   65:ifeq            78
			s = ", mAddress=".concat(s);
	//   33   68:ldc1            #115 <String ", mAddress=">
	//   34   70:aload_3         
	//   35   71:invokevirtual   #108 <Method String String.concat(String)>
	//   36   74:astore_3        
		else
	//*  37   75:goto            88
			s = new String(", mAddress=");
	//   38   78:new             #96  <Class String>
	//   39   81:dup             
	//   40   82:ldc1            #115 <String ", mAddress=">
	//   41   84:invokespecial   #109 <Method void String(String)>
	//   42   87:astore_3        
		stringbuilder.append(s);
	//   43   88:aload           4
	//   44   90:aload_3         
	//   45   91:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   46   94:pop             
		int i = zzakD;
	//   47   95:aload_0         
	//   48   96:getfield        #39  <Field int zzakD>
	//   49   99:istore_1        
		stringbuilder.append((new StringBuilder(19)).append(", mType=").append(i).toString());
	//   50  100:aload           4
	//   51  102:new             #89  <Class StringBuilder>
	//   52  105:dup             
	//   53  106:bipush          19
	//   54  108:invokespecial   #118 <Method void StringBuilder(int)>
	//   55  111:ldc1            #120 <String ", mType=">
	//   56  113:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   57  116:iload_1         
	//   58  117:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   59  120:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   60  123:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   61  126:pop             
		i = zzaLu;
	//   62  127:aload_0         
	//   63  128:getfield        #41  <Field int zzaLu>
	//   64  131:istore_1        
		stringbuilder.append((new StringBuilder(19)).append(", mRole=").append(i).toString());
	//   65  132:aload           4
	//   66  134:new             #89  <Class StringBuilder>
	//   67  137:dup             
	//   68  138:bipush          19
	//   69  140:invokespecial   #118 <Method void StringBuilder(int)>
	//   70  143:ldc1            #127 <String ", mRole=">
	//   71  145:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   72  148:iload_1         
	//   73  149:invokevirtual   #123 <Method StringBuilder StringBuilder.append(int)>
	//   74  152:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   75  155:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   76  158:pop             
		boolean flag = zzbSP;
	//   77  159:aload_0         
	//   78  160:getfield        #43  <Field boolean zzbSP>
	//   79  163:istore_2        
		stringbuilder.append((new StringBuilder(16)).append(", mEnabled=").append(flag).toString());
	//   80  164:aload           4
	//   81  166:new             #89  <Class StringBuilder>
	//   82  169:dup             
	//   83  170:bipush          16
	//   84  172:invokespecial   #118 <Method void StringBuilder(int)>
	//   85  175:ldc1            #129 <String ", mEnabled=">
	//   86  177:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   87  180:iload_2         
	//   88  181:invokevirtual   #132 <Method StringBuilder StringBuilder.append(boolean)>
	//   89  184:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   90  187:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   91  190:pop             
		flag = zzagx;
	//   92  191:aload_0         
	//   93  192:getfield        #45  <Field boolean zzagx>
	//   94  195:istore_2        
		stringbuilder.append((new StringBuilder(20)).append(", mIsConnected=").append(flag).toString());
	//   95  196:aload           4
	//   96  198:new             #89  <Class StringBuilder>
	//   97  201:dup             
	//   98  202:bipush          20
	//   99  204:invokespecial   #118 <Method void StringBuilder(int)>
	//  100  207:ldc1            #134 <String ", mIsConnected=">
	//  101  209:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  102  212:iload_2         
	//  103  213:invokevirtual   #132 <Method StringBuilder StringBuilder.append(boolean)>
	//  104  216:invokevirtual   #125 <Method String StringBuilder.toString()>
	//  105  219:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  106  222:pop             
		s = String.valueOf(((Object) (zzbSQ)));
	//  107  223:aload_0         
	//  108  224:getfield        #47  <Field String zzbSQ>
	//  109  227:invokestatic    #99  <Method String String.valueOf(Object)>
	//  110  230:astore_3        
		if(s.length() != 0)
	//* 111  231:aload_3         
	//* 112  232:invokevirtual   #102 <Method int String.length()>
	//* 113  235:ifeq            248
			s = ", mPeerNodeId=".concat(s);
	//  114  238:ldc1            #136 <String ", mPeerNodeId=">
	//  115  240:aload_3         
	//  116  241:invokevirtual   #108 <Method String String.concat(String)>
	//  117  244:astore_3        
		else
	//* 118  245:goto            258
			s = new String(", mPeerNodeId=");
	//  119  248:new             #96  <Class String>
	//  120  251:dup             
	//  121  252:ldc1            #136 <String ", mPeerNodeId=">
	//  122  254:invokespecial   #109 <Method void String(String)>
	//  123  257:astore_3        
		stringbuilder.append(s);
	//  124  258:aload           4
	//  125  260:aload_3         
	//  126  261:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  127  264:pop             
		flag = zzbSR;
	//  128  265:aload_0         
	//  129  266:getfield        #49  <Field boolean zzbSR>
	//  130  269:istore_2        
		stringbuilder.append((new StringBuilder(21)).append(", mBtlePriority=").append(flag).toString());
	//  131  270:aload           4
	//  132  272:new             #89  <Class StringBuilder>
	//  133  275:dup             
	//  134  276:bipush          21
	//  135  278:invokespecial   #118 <Method void StringBuilder(int)>
	//  136  281:ldc1            #138 <String ", mBtlePriority=">
	//  137  283:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  138  286:iload_2         
	//  139  287:invokevirtual   #132 <Method StringBuilder StringBuilder.append(boolean)>
	//  140  290:invokevirtual   #125 <Method String StringBuilder.toString()>
	//  141  293:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  142  296:pop             
		s = String.valueOf(((Object) (zzbSS)));
	//  143  297:aload_0         
	//  144  298:getfield        #51  <Field String zzbSS>
	//  145  301:invokestatic    #99  <Method String String.valueOf(Object)>
	//  146  304:astore_3        
		if(s.length() != 0)
	//* 147  305:aload_3         
	//* 148  306:invokevirtual   #102 <Method int String.length()>
	//* 149  309:ifeq            322
			s = ", mNodeId=".concat(s);
	//  150  312:ldc1            #140 <String ", mNodeId=">
	//  151  314:aload_3         
	//  152  315:invokevirtual   #108 <Method String String.concat(String)>
	//  153  318:astore_3        
		else
	//* 154  319:goto            332
			s = new String(", mNodeId=");
	//  155  322:new             #96  <Class String>
	//  156  325:dup             
	//  157  326:ldc1            #140 <String ", mNodeId=">
	//  158  328:invokespecial   #109 <Method void String(String)>
	//  159  331:astore_3        
		stringbuilder.append(s);
	//  160  332:aload           4
	//  161  334:aload_3         
	//  162  335:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  163  338:pop             
		stringbuilder.append("]");
	//  164  339:aload           4
	//  165  341:ldc1            #142 <String "]">
	//  166  343:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//  167  346:pop             
		return stringbuilder.toString();
	//  168  347:aload           4
	//  169  349:invokevirtual   #125 <Method String StringBuilder.toString()>
	//  170  352:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.zzg.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #148 <Method void com.google.android.gms.wearable.zzg.zza(ConnectionConfiguration, Parcel, int)>
	//    4    6:return          
	}

	public String zzUe()
	{
		return zzbSQ;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String zzbSQ>
	//    2    4:areturn         
	}

	public boolean zzUf()
	{
		return zzbSR;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean zzbSR>
	//    2    4:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzg();
	private final String mName;
	private final int zzaLu;
	private final String zzaSq;
	private boolean zzagx;
	private final int zzakD;
	private final boolean zzbSP;
	private String zzbSQ;
	private boolean zzbSR;
	private String zzbSS;

	static 
	{
	//    0    0:new             #25  <Class zzg>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzg()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
