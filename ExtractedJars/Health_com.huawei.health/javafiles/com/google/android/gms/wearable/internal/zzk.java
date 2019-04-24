// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.zzd;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzl

public final class zzk extends zza
	implements zzd
{

	public zzk(int i, String s, String s1, String s2, String s3, String s4, String s5, 
			byte byte0, byte byte1, byte byte2, byte byte3, String s6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void zza()>
		mId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #38  <Field int mId>
		mAppId = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field String mAppId>
		zzbTD = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #42  <Field String zzbTD>
		zzaoc = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #44  <Field String zzaoc>
		zzamJ = s3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #46  <Field String zzamJ>
		zzaZc = s4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #48  <Field String zzaZc>
		zzakb = s5;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #50  <Field String zzakb>
		zzbTE = byte0;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #52  <Field byte zzbTE>
		zzbTF = byte1;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #54  <Field byte zzbTF>
		zzbTG = byte2;
	//   29   55:aload_0         
	//   30   56:iload           10
	//   31   58:putfield        #56  <Field byte zzbTG>
		zzbTH = byte3;
	//   32   61:aload_0         
	//   33   62:iload           11
	//   34   64:putfield        #58  <Field byte zzbTH>
		zzRg = s6;
	//   35   67:aload_0         
	//   36   68:aload           12
	//   37   70:putfield        #60  <Field String zzRg>
	//   38   73:return          
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #68  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #68  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		obj = ((Object) ((zzk)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzk>
	//   16   28:astore_1        
		if(mId != ((zzk) (obj)).mId)
	//*  17   29:aload_0         
	//*  18   30:getfield        #38  <Field int mId>
	//*  19   33:aload_1         
	//*  20   34:getfield        #38  <Field int mId>
	//*  21   37:icmpeq          42
			return false;
	//   22   40:iconst_0        
	//   23   41:ireturn         
		if(zzbTE != ((zzk) (obj)).zzbTE)
	//*  24   42:aload_0         
	//*  25   43:getfield        #52  <Field byte zzbTE>
	//*  26   46:aload_1         
	//*  27   47:getfield        #52  <Field byte zzbTE>
	//*  28   50:icmpeq          55
			return false;
	//   29   53:iconst_0        
	//   30   54:ireturn         
		if(zzbTF != ((zzk) (obj)).zzbTF)
	//*  31   55:aload_0         
	//*  32   56:getfield        #54  <Field byte zzbTF>
	//*  33   59:aload_1         
	//*  34   60:getfield        #54  <Field byte zzbTF>
	//*  35   63:icmpeq          68
			return false;
	//   36   66:iconst_0        
	//   37   67:ireturn         
		if(zzbTG != ((zzk) (obj)).zzbTG)
	//*  38   68:aload_0         
	//*  39   69:getfield        #56  <Field byte zzbTG>
	//*  40   72:aload_1         
	//*  41   73:getfield        #56  <Field byte zzbTG>
	//*  42   76:icmpeq          81
			return false;
	//   43   79:iconst_0        
	//   44   80:ireturn         
		if(zzbTH != ((zzk) (obj)).zzbTH)
	//*  45   81:aload_0         
	//*  46   82:getfield        #58  <Field byte zzbTH>
	//*  47   85:aload_1         
	//*  48   86:getfield        #58  <Field byte zzbTH>
	//*  49   89:icmpeq          94
			return false;
	//   50   92:iconst_0        
	//   51   93:ireturn         
		if(!mAppId.equals(((Object) (((zzk) (obj)).mAppId))))
	//*  52   94:aload_0         
	//*  53   95:getfield        #40  <Field String mAppId>
	//*  54   98:aload_1         
	//*  55   99:getfield        #40  <Field String mAppId>
	//*  56  102:invokevirtual   #72  <Method boolean String.equals(Object)>
	//*  57  105:ifne            110
			return false;
	//   58  108:iconst_0        
	//   59  109:ireturn         
		if(zzbTD == null ? ((zzk) (obj)).zzbTD != null : !zzbTD.equals(((Object) (((zzk) (obj)).zzbTD))))
	//*  60  110:aload_0         
	//*  61  111:getfield        #42  <Field String zzbTD>
	//*  62  114:ifnull          134
	//*  63  117:aload_0         
	//*  64  118:getfield        #42  <Field String zzbTD>
	//*  65  121:aload_1         
	//*  66  122:getfield        #42  <Field String zzbTD>
	//*  67  125:invokevirtual   #72  <Method boolean String.equals(Object)>
	//*  68  128:ifne            143
	//*  69  131:goto            141
	//*  70  134:aload_1         
	//*  71  135:getfield        #42  <Field String zzbTD>
	//*  72  138:ifnull          143
			return false;
	//   73  141:iconst_0        
	//   74  142:ireturn         
		if(!zzaoc.equals(((Object) (((zzk) (obj)).zzaoc))))
	//*  75  143:aload_0         
	//*  76  144:getfield        #44  <Field String zzaoc>
	//*  77  147:aload_1         
	//*  78  148:getfield        #44  <Field String zzaoc>
	//*  79  151:invokevirtual   #72  <Method boolean String.equals(Object)>
	//*  80  154:ifne            159
			return false;
	//   81  157:iconst_0        
	//   82  158:ireturn         
		if(!zzamJ.equals(((Object) (((zzk) (obj)).zzamJ))))
	//*  83  159:aload_0         
	//*  84  160:getfield        #46  <Field String zzamJ>
	//*  85  163:aload_1         
	//*  86  164:getfield        #46  <Field String zzamJ>
	//*  87  167:invokevirtual   #72  <Method boolean String.equals(Object)>
	//*  88  170:ifne            175
			return false;
	//   89  173:iconst_0        
	//   90  174:ireturn         
		if(!zzaZc.equals(((Object) (((zzk) (obj)).zzaZc))))
	//*  91  175:aload_0         
	//*  92  176:getfield        #48  <Field String zzaZc>
	//*  93  179:aload_1         
	//*  94  180:getfield        #48  <Field String zzaZc>
	//*  95  183:invokevirtual   #72  <Method boolean String.equals(Object)>
	//*  96  186:ifne            191
			return false;
	//   97  189:iconst_0        
	//   98  190:ireturn         
		if(zzakb == null ? ((zzk) (obj)).zzakb != null : !zzakb.equals(((Object) (((zzk) (obj)).zzakb))))
	//*  99  191:aload_0         
	//* 100  192:getfield        #50  <Field String zzakb>
	//* 101  195:ifnull          215
	//* 102  198:aload_0         
	//* 103  199:getfield        #50  <Field String zzakb>
	//* 104  202:aload_1         
	//* 105  203:getfield        #50  <Field String zzakb>
	//* 106  206:invokevirtual   #72  <Method boolean String.equals(Object)>
	//* 107  209:ifne            224
	//* 108  212:goto            222
	//* 109  215:aload_1         
	//* 110  216:getfield        #50  <Field String zzakb>
	//* 111  219:ifnull          224
			return false;
	//  112  222:iconst_0        
	//  113  223:ireturn         
		if(zzRg != null)
	//* 114  224:aload_0         
	//* 115  225:getfield        #60  <Field String zzRg>
	//* 116  228:ifnull          243
			return zzRg.equals(((Object) (((zzk) (obj)).zzRg)));
	//  117  231:aload_0         
	//  118  232:getfield        #60  <Field String zzRg>
	//  119  235:aload_1         
	//  120  236:getfield        #60  <Field String zzRg>
	//  121  239:invokevirtual   #72  <Method boolean String.equals(Object)>
	//  122  242:ireturn         
		return ((zzk) (obj)).zzRg == null;
	//  123  243:aload_1         
	//  124  244:getfield        #60  <Field String zzRg>
	//  125  247:ifnonnull       252
	//  126  250:iconst_1        
	//  127  251:ireturn         
	//  128  252:iconst_0        
	//  129  253:ireturn         
	}

	public String getDisplayName()
	{
		if(zzakb == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field String zzakb>
	//*   2    4:ifnonnull       12
			return mAppId;
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field String mAppId>
	//    5   11:areturn         
		else
			return zzakb;
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field String zzakb>
	//    8   16:areturn         
	}

	public int getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mId>
	//    2    4:ireturn         
	}

	public String getPackageName()
	{
		return zzRg;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String zzRg>
	//    2    4:areturn         
	}

	public String getTitle()
	{
		return zzamJ;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String zzamJ>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		int l = mId;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mId>
	//    2    4:istore          4
		int i1 = mAppId.hashCode();
	//    3    6:aload_0         
	//    4    7:getfield        #40  <Field String mAppId>
	//    5   10:invokevirtual   #81  <Method int String.hashCode()>
	//    6   13:istore          5
		int i;
		if(zzbTD != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #42  <Field String zzbTD>
	//*   9   19:ifnull          33
			i = zzbTD.hashCode();
	//   10   22:aload_0         
	//   11   23:getfield        #42  <Field String zzbTD>
	//   12   26:invokevirtual   #81  <Method int String.hashCode()>
	//   13   29:istore_1        
		else
	//*  14   30:goto            35
			i = 0;
	//   15   33:iconst_0        
	//   16   34:istore_1        
		int j1 = zzaoc.hashCode();
	//   17   35:aload_0         
	//   18   36:getfield        #44  <Field String zzaoc>
	//   19   39:invokevirtual   #81  <Method int String.hashCode()>
	//   20   42:istore          6
		int k1 = zzamJ.hashCode();
	//   21   44:aload_0         
	//   22   45:getfield        #46  <Field String zzamJ>
	//   23   48:invokevirtual   #81  <Method int String.hashCode()>
	//   24   51:istore          7
		int l1 = zzaZc.hashCode();
	//   25   53:aload_0         
	//   26   54:getfield        #48  <Field String zzaZc>
	//   27   57:invokevirtual   #81  <Method int String.hashCode()>
	//   28   60:istore          8
		int j;
		if(zzakb != null)
	//*  29   62:aload_0         
	//*  30   63:getfield        #50  <Field String zzakb>
	//*  31   66:ifnull          80
			j = zzakb.hashCode();
	//   32   69:aload_0         
	//   33   70:getfield        #50  <Field String zzakb>
	//   34   73:invokevirtual   #81  <Method int String.hashCode()>
	//   35   76:istore_2        
		else
	//*  36   77:goto            82
			j = 0;
	//   37   80:iconst_0        
	//   38   81:istore_2        
		byte byte0 = zzbTE;
	//   39   82:aload_0         
	//   40   83:getfield        #52  <Field byte zzbTE>
	//   41   86:istore          9
		byte byte1 = zzbTF;
	//   42   88:aload_0         
	//   43   89:getfield        #54  <Field byte zzbTF>
	//   44   92:istore          10
		byte byte2 = zzbTG;
	//   45   94:aload_0         
	//   46   95:getfield        #56  <Field byte zzbTG>
	//   47   98:istore          11
		byte byte3 = zzbTH;
	//   48  100:aload_0         
	//   49  101:getfield        #58  <Field byte zzbTH>
	//   50  104:istore          12
		int k;
		if(zzRg != null)
	//*  51  106:aload_0         
	//*  52  107:getfield        #60  <Field String zzRg>
	//*  53  110:ifnull          124
			k = zzRg.hashCode();
	//   54  113:aload_0         
	//   55  114:getfield        #60  <Field String zzRg>
	//   56  117:invokevirtual   #81  <Method int String.hashCode()>
	//   57  120:istore_3        
		else
	//*  58  121:goto            126
			k = 0;
	//   59  124:iconst_0        
	//   60  125:istore_3        
		return (((((((((((l + 31) * 31 + i1) * 31 + i) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + j) * 31 + byte0) * 31 + byte1) * 31 + byte2) * 31 + byte3) * 31 + k;
	//   61  126:iload           4
	//   62  128:bipush          31
	//   63  130:iadd            
	//   64  131:bipush          31
	//   65  133:imul            
	//   66  134:iload           5
	//   67  136:iadd            
	//   68  137:bipush          31
	//   69  139:imul            
	//   70  140:iload_1         
	//   71  141:iadd            
	//   72  142:bipush          31
	//   73  144:imul            
	//   74  145:iload           6
	//   75  147:iadd            
	//   76  148:bipush          31
	//   77  150:imul            
	//   78  151:iload           7
	//   79  153:iadd            
	//   80  154:bipush          31
	//   81  156:imul            
	//   82  157:iload           8
	//   83  159:iadd            
	//   84  160:bipush          31
	//   85  162:imul            
	//   86  163:iload_2         
	//   87  164:iadd            
	//   88  165:bipush          31
	//   89  167:imul            
	//   90  168:iload           9
	//   91  170:iadd            
	//   92  171:bipush          31
	//   93  173:imul            
	//   94  174:iload           10
	//   95  176:iadd            
	//   96  177:bipush          31
	//   97  179:imul            
	//   98  180:iload           11
	//   99  182:iadd            
	//  100  183:bipush          31
	//  101  185:imul            
	//  102  186:iload           12
	//  103  188:iadd            
	//  104  189:bipush          31
	//  105  191:imul            
	//  106  192:iload_3         
	//  107  193:iadd            
	//  108  194:ireturn         
	}

	public String toString()
	{
		int i = mId;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mId>
	//    2    4:istore_1        
		String s = mAppId;
	//    3    5:aload_0         
	//    4    6:getfield        #40  <Field String mAppId>
	//    5    9:astore          12
		String s1 = zzbTD;
	//    6   11:aload_0         
	//    7   12:getfield        #42  <Field String zzbTD>
	//    8   15:astore          13
		String s2 = zzaoc;
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field String zzaoc>
	//   11   21:astore          14
		String s3 = zzamJ;
	//   12   23:aload_0         
	//   13   24:getfield        #46  <Field String zzamJ>
	//   14   27:astore          15
		String s4 = zzaZc;
	//   15   29:aload_0         
	//   16   30:getfield        #48  <Field String zzaZc>
	//   17   33:astore          16
		String s5 = zzakb;
	//   18   35:aload_0         
	//   19   36:getfield        #50  <Field String zzakb>
	//   20   39:astore          17
		byte byte0 = zzbTE;
	//   21   41:aload_0         
	//   22   42:getfield        #52  <Field byte zzbTE>
	//   23   45:istore_2        
		byte byte1 = zzbTF;
	//   24   46:aload_0         
	//   25   47:getfield        #54  <Field byte zzbTF>
	//   26   50:istore_3        
		byte byte2 = zzbTG;
	//   27   51:aload_0         
	//   28   52:getfield        #56  <Field byte zzbTG>
	//   29   55:istore          4
		byte byte3 = zzbTH;
	//   30   57:aload_0         
	//   31   58:getfield        #58  <Field byte zzbTH>
	//   32   61:istore          5
		String s6 = zzRg;
	//   33   63:aload_0         
	//   34   64:getfield        #60  <Field String zzRg>
	//   35   67:astore          18
		int j = String.valueOf(((Object) (s))).length();
	//   36   69:aload           12
	//   37   71:invokestatic    #86  <Method String String.valueOf(Object)>
	//   38   74:invokevirtual   #89  <Method int String.length()>
	//   39   77:istore          6
		int k = String.valueOf(((Object) (s1))).length();
	//   40   79:aload           13
	//   41   81:invokestatic    #86  <Method String String.valueOf(Object)>
	//   42   84:invokevirtual   #89  <Method int String.length()>
	//   43   87:istore          7
		int l = String.valueOf(((Object) (s2))).length();
	//   44   89:aload           14
	//   45   91:invokestatic    #86  <Method String String.valueOf(Object)>
	//   46   94:invokevirtual   #89  <Method int String.length()>
	//   47   97:istore          8
		int i1 = String.valueOf(((Object) (s3))).length();
	//   48   99:aload           15
	//   49  101:invokestatic    #86  <Method String String.valueOf(Object)>
	//   50  104:invokevirtual   #89  <Method int String.length()>
	//   51  107:istore          9
		int j1 = String.valueOf(((Object) (s4))).length();
	//   52  109:aload           16
	//   53  111:invokestatic    #86  <Method String String.valueOf(Object)>
	//   54  114:invokevirtual   #89  <Method int String.length()>
	//   55  117:istore          10
		int k1 = String.valueOf(((Object) (s5))).length();
	//   56  119:aload           17
	//   57  121:invokestatic    #86  <Method String String.valueOf(Object)>
	//   58  124:invokevirtual   #89  <Method int String.length()>
	//   59  127:istore          11
		return (new StringBuilder(String.valueOf(((Object) (s6))).length() + (j + 211 + k + l + i1 + j1 + k1))).append("AncsNotificationParcelable{, id=").append(i).append(", appId='").append(s).append("'").append(", dateTime='").append(s1).append("'").append(", notificationText='").append(s2).append("'").append(", title='").append(s3).append("'").append(", subtitle='").append(s4).append("'").append(", displayName='").append(s5).append("'").append(", eventId=").append(((int) (byte0))).append(", eventFlags=").append(((int) (byte1))).append(", categoryId=").append(((int) (byte2))).append(", categoryCount=").append(((int) (byte3))).append(", packageName='").append(s6).append("'").append("}").toString();
	//   60  129:new             #91  <Class StringBuilder>
	//   61  132:dup             
	//   62  133:aload           18
	//   63  135:invokestatic    #86  <Method String String.valueOf(Object)>
	//   64  138:invokevirtual   #89  <Method int String.length()>
	//   65  141:iload           6
	//   66  143:sipush          211
	//   67  146:iadd            
	//   68  147:iload           7
	//   69  149:iadd            
	//   70  150:iload           8
	//   71  152:iadd            
	//   72  153:iload           9
	//   73  155:iadd            
	//   74  156:iload           10
	//   75  158:iadd            
	//   76  159:iload           11
	//   77  161:iadd            
	//   78  162:iadd            
	//   79  163:invokespecial   #94  <Method void StringBuilder(int)>
	//   80  166:ldc1            #96  <String "AncsNotificationParcelable{, id=">
	//   81  168:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   82  171:iload_1         
	//   83  172:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//   84  175:ldc1            #105 <String ", appId='">
	//   85  177:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   86  180:aload           12
	//   87  182:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   88  185:ldc1            #107 <String "'">
	//   89  187:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   90  190:ldc1            #109 <String ", dateTime='">
	//   91  192:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   92  195:aload           13
	//   93  197:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   94  200:ldc1            #107 <String "'">
	//   95  202:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   96  205:ldc1            #111 <String ", notificationText='">
	//   97  207:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//   98  210:aload           14
	//   99  212:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  100  215:ldc1            #107 <String "'">
	//  101  217:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  102  220:ldc1            #113 <String ", title='">
	//  103  222:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  104  225:aload           15
	//  105  227:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  106  230:ldc1            #107 <String "'">
	//  107  232:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  108  235:ldc1            #115 <String ", subtitle='">
	//  109  237:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  110  240:aload           16
	//  111  242:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  112  245:ldc1            #107 <String "'">
	//  113  247:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  114  250:ldc1            #117 <String ", displayName='">
	//  115  252:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  116  255:aload           17
	//  117  257:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  118  260:ldc1            #107 <String "'">
	//  119  262:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  120  265:ldc1            #119 <String ", eventId=">
	//  121  267:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  122  270:iload_2         
	//  123  271:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//  124  274:ldc1            #121 <String ", eventFlags=">
	//  125  276:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  126  279:iload_3         
	//  127  280:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//  128  283:ldc1            #123 <String ", categoryId=">
	//  129  285:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  130  288:iload           4
	//  131  290:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//  132  293:ldc1            #125 <String ", categoryCount=">
	//  133  295:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  134  298:iload           5
	//  135  300:invokevirtual   #103 <Method StringBuilder StringBuilder.append(int)>
	//  136  303:ldc1            #127 <String ", packageName='">
	//  137  305:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  138  308:aload           18
	//  139  310:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  140  313:ldc1            #107 <String "'">
	//  141  315:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  142  318:ldc1            #129 <String "}">
	//  143  320:invokevirtual   #100 <Method StringBuilder StringBuilder.append(String)>
	//  144  323:invokevirtual   #131 <Method String StringBuilder.toString()>
	//  145  326:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzl.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #137 <Method void com.google.android.gms.wearable.internal.zzl.zza(zzk, Parcel, int)>
	//    4    6:return          
	}

	public String zzEv()
	{
		return zzaZc;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String zzaZc>
	//    2    4:areturn         
	}

	public String zzUm()
	{
		return zzbTD;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String zzbTD>
	//    2    4:areturn         
	}

	public String zzUn()
	{
		return zzaoc;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String zzaoc>
	//    2    4:areturn         
	}

	public byte zzUo()
	{
		return zzbTE;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field byte zzbTE>
	//    2    4:ireturn         
	}

	public byte zzUp()
	{
		return zzbTF;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field byte zzbTF>
	//    2    4:ireturn         
	}

	public byte zzUq()
	{
		return zzbTG;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field byte zzbTG>
	//    2    4:ireturn         
	}

	public byte zzUr()
	{
		return zzbTH;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field byte zzbTH>
	//    2    4:ireturn         
	}

	public String zzke()
	{
		return mAppId;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String mAppId>
	//    2    4:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzl();
	private final String mAppId;
	private int mId;
	private final String zzRg;
	private final String zzaZc;
	private final String zzakb;
	private final String zzamJ;
	private final String zzaoc;
	private final String zzbTD;
	private final byte zzbTE;
	private final byte zzbTF;
	private final byte zzbTG;
	private final byte zzbTH;

	static 
	{
	//    0    0:new             #28  <Class zzl>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void zzl()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
