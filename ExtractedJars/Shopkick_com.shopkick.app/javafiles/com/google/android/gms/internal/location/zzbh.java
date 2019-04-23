// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzbi

public final class zzbh extends AbstractSafeParcelable
	implements Geofence
{

	public zzbh(String s, int i, short word0, double d, double d1, 
			float f, long l, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void AbstractSafeParcelable()>
		if(s != null && s.length() <= 100)
	//*   2    4:aload_1         
	//*   3    5:ifnull          270
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #75  <Method int String.length()>
	//*   6   12:bipush          100
	//*   7   14:icmple          20
	//*   8   17:goto            270
			if(f > 0.0F)
	//*   9   20:fload           8
	//*  10   22:fconst_0        
	//*  11   23:fcmpg           
	//*  12   24:ifle            234
			{
				if(d <= 90D && d >= -90D)
	//*  13   27:dload           4
	//*  14   29:ldc2w           #76  <Double 90D>
	//*  15   32:dcmpl           
	//*  16   33:ifgt            198
	//*  17   36:dload           4
	//*  18   38:ldc2w           #78  <Double -90D>
	//*  19   41:dcmpg           
	//*  20   42:iflt            198
				{
					if(d1 <= 180D && d1 >= -180D)
	//*  21   45:dload           6
	//*  22   47:ldc2w           #80  <Double 180D>
	//*  23   50:dcmpl           
	//*  24   51:ifgt            162
	//*  25   54:dload           6
	//*  26   56:ldc2w           #82  <Double -180D>
	//*  27   59:dcmpg           
	//*  28   60:iflt            162
					{
						int i1 = i & 7;
	//   29   63:iload_2         
	//   30   64:bipush          7
	//   31   66:iand            
	//   32   67:istore          13
						if(i1 != 0)
	//*  33   69:iload           13
	//*  34   71:ifeq            127
						{
							zzag = word0;
	//   35   74:aload_0         
	//   36   75:iload_3         
	//   37   76:putfield        #85  <Field short zzag>
							zzad = s;
	//   38   79:aload_0         
	//   39   80:aload_1         
	//   40   81:putfield        #87  <Field String zzad>
							zzah = d;
	//   41   84:aload_0         
	//   42   85:dload           4
	//   43   87:putfield        #89  <Field double zzah>
							zzai = d1;
	//   44   90:aload_0         
	//   45   91:dload           6
	//   46   93:putfield        #91  <Field double zzai>
							zzaj = f;
	//   47   96:aload_0         
	//   48   97:fload           8
	//   49   99:putfield        #93  <Field float zzaj>
							zzdo = l;
	//   50  102:aload_0         
	//   51  103:lload           9
	//   52  105:putfield        #95  <Field long zzdo>
							zzae = i1;
	//   53  108:aload_0         
	//   54  109:iload           13
	//   55  111:putfield        #97  <Field int zzae>
							zzak = j;
	//   56  114:aload_0         
	//   57  115:iload           11
	//   58  117:putfield        #99  <Field int zzak>
							zzal = k;
	//   59  120:aload_0         
	//   60  121:iload           12
	//   61  123:putfield        #101 <Field int zzal>
							return;
	//   62  126:return          
						} else
						{
							s = ((String) (new StringBuilder(46)));
	//   63  127:new             #103 <Class StringBuilder>
	//   64  130:dup             
	//   65  131:bipush          46
	//   66  133:invokespecial   #106 <Method void StringBuilder(int)>
	//   67  136:astore_1        
							((StringBuilder) (s)).append("No supported transition specified: ");
	//   68  137:aload_1         
	//   69  138:ldc1            #108 <String "No supported transition specified: ">
	//   70  140:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   71  143:pop             
							((StringBuilder) (s)).append(i);
	//   72  144:aload_1         
	//   73  145:iload_2         
	//   74  146:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   75  149:pop             
							throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   76  150:new             #117 <Class IllegalArgumentException>
	//   77  153:dup             
	//   78  154:aload_1         
	//   79  155:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   80  158:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//   81  161:athrow          
						}
					} else
					{
						s = ((String) (new StringBuilder(43)));
	//   82  162:new             #103 <Class StringBuilder>
	//   83  165:dup             
	//   84  166:bipush          43
	//   85  168:invokespecial   #106 <Method void StringBuilder(int)>
	//   86  171:astore_1        
						((StringBuilder) (s)).append("invalid longitude: ");
	//   87  172:aload_1         
	//   88  173:ldc1            #126 <String "invalid longitude: ">
	//   89  175:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   90  178:pop             
						((StringBuilder) (s)).append(d1);
	//   91  179:aload_1         
	//   92  180:dload           6
	//   93  182:invokevirtual   #129 <Method StringBuilder StringBuilder.append(double)>
	//   94  185:pop             
						throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   95  186:new             #117 <Class IllegalArgumentException>
	//   96  189:dup             
	//   97  190:aload_1         
	//   98  191:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   99  194:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//  100  197:athrow          
					}
				} else
				{
					s = ((String) (new StringBuilder(42)));
	//  101  198:new             #103 <Class StringBuilder>
	//  102  201:dup             
	//  103  202:bipush          42
	//  104  204:invokespecial   #106 <Method void StringBuilder(int)>
	//  105  207:astore_1        
					((StringBuilder) (s)).append("invalid latitude: ");
	//  106  208:aload_1         
	//  107  209:ldc1            #131 <String "invalid latitude: ">
	//  108  211:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  109  214:pop             
					((StringBuilder) (s)).append(d);
	//  110  215:aload_1         
	//  111  216:dload           4
	//  112  218:invokevirtual   #129 <Method StringBuilder StringBuilder.append(double)>
	//  113  221:pop             
					throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//  114  222:new             #117 <Class IllegalArgumentException>
	//  115  225:dup             
	//  116  226:aload_1         
	//  117  227:invokevirtual   #121 <Method String StringBuilder.toString()>
	//  118  230:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//  119  233:athrow          
				}
			} else
			{
				s = ((String) (new StringBuilder(31)));
	//  120  234:new             #103 <Class StringBuilder>
	//  121  237:dup             
	//  122  238:bipush          31
	//  123  240:invokespecial   #106 <Method void StringBuilder(int)>
	//  124  243:astore_1        
				((StringBuilder) (s)).append("invalid radius: ");
	//  125  244:aload_1         
	//  126  245:ldc1            #133 <String "invalid radius: ">
	//  127  247:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//  128  250:pop             
				((StringBuilder) (s)).append(f);
	//  129  251:aload_1         
	//  130  252:fload           8
	//  131  254:invokevirtual   #136 <Method StringBuilder StringBuilder.append(float)>
	//  132  257:pop             
				throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//  133  258:new             #117 <Class IllegalArgumentException>
	//  134  261:dup             
	//  135  262:aload_1         
	//  136  263:invokevirtual   #121 <Method String StringBuilder.toString()>
	//  137  266:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//  138  269:athrow          
			}
		s = String.valueOf(((Object) (s)));
	//  139  270:aload_1         
	//  140  271:invokestatic    #140 <Method String String.valueOf(Object)>
	//  141  274:astore_1        
		if(s.length() != 0)
	//* 142  275:aload_1         
	//* 143  276:invokevirtual   #75  <Method int String.length()>
	//* 144  279:ifeq            292
			s = "requestId is null or too long: ".concat(s);
	//  145  282:ldc1            #142 <String "requestId is null or too long: ">
	//  146  284:aload_1         
	//  147  285:invokevirtual   #146 <Method String String.concat(String)>
	//  148  288:astore_1        
		else
	//* 149  289:goto            302
			s = new String("requestId is null or too long: ");
	//  150  292:new             #71  <Class String>
	//  151  295:dup             
	//  152  296:ldc1            #142 <String "requestId is null or too long: ">
	//  153  298:invokespecial   #147 <Method void String(String)>
	//  154  301:astore_1        
		throw new IllegalArgumentException(s);
	//  155  302:new             #117 <Class IllegalArgumentException>
	//  156  305:dup             
	//  157  306:aload_1         
	//  158  307:invokespecial   #124 <Method void IllegalArgumentException(String)>
	//  159  310:athrow          
	}

	public static zzbh zza(byte abyte0[])
	{
		Parcel parcel = Parcel.obtain();
	//    0    0:invokestatic    #157 <Method Parcel Parcel.obtain()>
	//    1    3:astore_1        
		parcel.unmarshall(abyte0, 0, abyte0.length);
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:aload_0         
	//    6    8:arraylength     
	//    7    9:invokevirtual   #161 <Method void Parcel.unmarshall(byte[], int, int)>
		parcel.setDataPosition(0);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #164 <Method void Parcel.setDataPosition(int)>
		abyte0 = ((byte []) ((zzbh)CREATOR.createFromParcel(parcel)));
	//   11   17:getstatic       #64  <Field android.os.Parcelable$Creator CREATOR>
	//   12   20:aload_1         
	//   13   21:invokeinterface #170 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   14   26:checkcast       #2   <Class zzbh>
	//   15   29:astore_0        
		parcel.recycle();
	//   16   30:aload_1         
	//   17   31:invokevirtual   #173 <Method void Parcel.recycle()>
		return ((zzbh) (abyte0));
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(!(obj instanceof zzbh))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class zzbh>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		obj = ((Object) ((zzbh)obj));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class zzbh>
	//   16   26:astore_1        
		if(zzaj != ((zzbh) (obj)).zzaj)
	//*  17   27:aload_0         
	//*  18   28:getfield        #93  <Field float zzaj>
	//*  19   31:aload_1         
	//*  20   32:getfield        #93  <Field float zzaj>
	//*  21   35:fcmpl           
	//*  22   36:ifeq            41
			return false;
	//   23   39:iconst_0        
	//   24   40:ireturn         
		if(zzah != ((zzbh) (obj)).zzah)
	//*  25   41:aload_0         
	//*  26   42:getfield        #89  <Field double zzah>
	//*  27   45:aload_1         
	//*  28   46:getfield        #89  <Field double zzah>
	//*  29   49:dcmpl           
	//*  30   50:ifeq            55
			return false;
	//   31   53:iconst_0        
	//   32   54:ireturn         
		if(zzai != ((zzbh) (obj)).zzai)
	//*  33   55:aload_0         
	//*  34   56:getfield        #91  <Field double zzai>
	//*  35   59:aload_1         
	//*  36   60:getfield        #91  <Field double zzai>
	//*  37   63:dcmpl           
	//*  38   64:ifeq            69
			return false;
	//   39   67:iconst_0        
	//   40   68:ireturn         
		return zzag == ((zzbh) (obj)).zzag;
	//   41   69:aload_0         
	//   42   70:getfield        #85  <Field short zzag>
	//   43   73:aload_1         
	//   44   74:getfield        #85  <Field short zzag>
	//   45   77:icmpeq          82
	//   46   80:iconst_0        
	//   47   81:ireturn         
	//   48   82:iconst_1        
	//   49   83:ireturn         
	}

	public final String getRequestId()
	{
		return zzad;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String zzad>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		long l = Double.doubleToLongBits(zzah);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field double zzah>
	//    2    4:invokestatic    #182 <Method long Double.doubleToLongBits(double)>
	//    3    7:lstore_2        
		int i = (int)(l ^ l >>> 32);
	//    4    8:lload_2         
	//    5    9:lload_2         
	//    6   10:bipush          32
	//    7   12:lushr           
	//    8   13:lxor            
	//    9   14:l2i             
	//   10   15:istore_1        
		l = Double.doubleToLongBits(zzai);
	//   11   16:aload_0         
	//   12   17:getfield        #91  <Field double zzai>
	//   13   20:invokestatic    #182 <Method long Double.doubleToLongBits(double)>
	//   14   23:lstore_2        
		return ((((i + 31) * 31 + (int)(l >>> 32 ^ l)) * 31 + Float.floatToIntBits(zzaj)) * 31 + zzag) * 31 + zzae;
	//   15   24:iload_1         
	//   16   25:bipush          31
	//   17   27:iadd            
	//   18   28:bipush          31
	//   19   30:imul            
	//   20   31:lload_2         
	//   21   32:bipush          32
	//   22   34:lushr           
	//   23   35:lload_2         
	//   24   36:lxor            
	//   25   37:l2i             
	//   26   38:iadd            
	//   27   39:bipush          31
	//   28   41:imul            
	//   29   42:aload_0         
	//   30   43:getfield        #93  <Field float zzaj>
	//   31   46:invokestatic    #188 <Method int Float.floatToIntBits(float)>
	//   32   49:iadd            
	//   33   50:bipush          31
	//   34   52:imul            
	//   35   53:aload_0         
	//   36   54:getfield        #85  <Field short zzag>
	//   37   57:iadd            
	//   38   58:bipush          31
	//   39   60:imul            
	//   40   61:aload_0         
	//   41   62:getfield        #97  <Field int zzae>
	//   42   65:iadd            
	//   43   66:ireturn         
	}

	public final String toString()
	{
		Locale locale = Locale.US;
	//    0    0:getstatic       #194 <Field Locale Locale.US>
	//    1    3:astore_2        
		String s;
		if(zzag != 1)
	//*   2    4:aload_0         
	//*   3    5:getfield        #85  <Field short zzag>
	//*   4    8:iconst_1        
	//*   5    9:icmpeq          17
			s = null;
	//    6   12:aconst_null     
	//    7   13:astore_1        
		else
	//*   8   14:goto            20
			s = "CIRCLE";
	//    9   17:ldc1            #196 <String "CIRCLE">
	//   10   19:astore_1        
		return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", new Object[] {
			s, zzad.replaceAll("\\p{C}", "?"), Integer.valueOf(zzae), Double.valueOf(zzah), Double.valueOf(zzai), Float.valueOf(zzaj), Integer.valueOf(zzak / 1000), Integer.valueOf(zzal), Long.valueOf(zzdo)
		});
	//   11   20:aload_2         
	//   12   21:ldc1            #198 <String "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]">
	//   13   23:bipush          9
	//   14   25:anewarray       Object[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:aload_1         
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_1        
	//   21   34:aload_0         
	//   22   35:getfield        #87  <Field String zzad>
	//   23   38:ldc1            #202 <String "\\p{C}">
	//   24   40:ldc1            #204 <String "?">
	//   25   42:invokevirtual   #208 <Method String String.replaceAll(String, String)>
	//   26   45:aastore         
	//   27   46:dup             
	//   28   47:iconst_2        
	//   29   48:aload_0         
	//   30   49:getfield        #97  <Field int zzae>
	//   31   52:invokestatic    #213 <Method Integer Integer.valueOf(int)>
	//   32   55:aastore         
	//   33   56:dup             
	//   34   57:iconst_3        
	//   35   58:aload_0         
	//   36   59:getfield        #89  <Field double zzah>
	//   37   62:invokestatic    #216 <Method Double Double.valueOf(double)>
	//   38   65:aastore         
	//   39   66:dup             
	//   40   67:iconst_4        
	//   41   68:aload_0         
	//   42   69:getfield        #91  <Field double zzai>
	//   43   72:invokestatic    #216 <Method Double Double.valueOf(double)>
	//   44   75:aastore         
	//   45   76:dup             
	//   46   77:iconst_5        
	//   47   78:aload_0         
	//   48   79:getfield        #93  <Field float zzaj>
	//   49   82:invokestatic    #219 <Method Float Float.valueOf(float)>
	//   50   85:aastore         
	//   51   86:dup             
	//   52   87:bipush          6
	//   53   89:aload_0         
	//   54   90:getfield        #99  <Field int zzak>
	//   55   93:sipush          1000
	//   56   96:idiv            
	//   57   97:invokestatic    #213 <Method Integer Integer.valueOf(int)>
	//   58  100:aastore         
	//   59  101:dup             
	//   60  102:bipush          7
	//   61  104:aload_0         
	//   62  105:getfield        #101 <Field int zzal>
	//   63  108:invokestatic    #213 <Method Integer Integer.valueOf(int)>
	//   64  111:aastore         
	//   65  112:dup             
	//   66  113:bipush          8
	//   67  115:aload_0         
	//   68  116:getfield        #95  <Field long zzdo>
	//   69  119:invokestatic    #224 <Method Long Long.valueOf(long)>
	//   70  122:aastore         
	//   71  123:invokestatic    #228 <Method String String.format(Locale, String, Object[])>
	//   72  126:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #236 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 1, getRequestId(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #238 <Method String getRequestId()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #242 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 2, zzdo);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #95  <Field long zzdo>
	//   13   21:invokestatic    #246 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeShort(parcel, 3, zzag);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #85  <Field short zzag>
	//   18   30:invokestatic    #250 <Method void SafeParcelWriter.writeShort(Parcel, int, short)>
		SafeParcelWriter.writeDouble(parcel, 4, zzah);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #89  <Field double zzah>
	//   23   39:invokestatic    #254 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeDouble(parcel, 5, zzai);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #91  <Field double zzai>
	//   28   48:invokestatic    #254 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
		SafeParcelWriter.writeFloat(parcel, 6, zzaj);
	//   29   51:aload_1         
	//   30   52:bipush          6
	//   31   54:aload_0         
	//   32   55:getfield        #93  <Field float zzaj>
	//   33   58:invokestatic    #258 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
		SafeParcelWriter.writeInt(parcel, 7, zzae);
	//   34   61:aload_1         
	//   35   62:bipush          7
	//   36   64:aload_0         
	//   37   65:getfield        #97  <Field int zzae>
	//   38   68:invokestatic    #262 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 8, zzak);
	//   39   71:aload_1         
	//   40   72:bipush          8
	//   41   74:aload_0         
	//   42   75:getfield        #99  <Field int zzak>
	//   43   78:invokestatic    #262 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 9, zzal);
	//   44   81:aload_1         
	//   45   82:bipush          9
	//   46   84:aload_0         
	//   47   85:getfield        #101 <Field int zzal>
	//   48   88:invokestatic    #262 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   49   91:aload_1         
	//   50   92:iload_2         
	//   51   93:invokestatic    #265 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   52   96:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbi();
	private final String zzad;
	private final int zzae;
	private final short zzag;
	private final double zzah;
	private final double zzai;
	private final float zzaj;
	private final int zzak;
	private final int zzal;
	private final long zzdo;

	static 
	{
	//    0    0:new             #59  <Class zzbi>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void zzbi()>
	//    3    7:putstatic       #64  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
