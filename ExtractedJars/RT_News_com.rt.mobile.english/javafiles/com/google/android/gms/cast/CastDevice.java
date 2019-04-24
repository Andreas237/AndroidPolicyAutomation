// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.cast.zzcu;
import java.net.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.cast:
//			zzn

public class CastDevice extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	CastDevice(String s, String s1, String s2, String s3, String s4, int i, List list, 
			int j, int k, String s5, String s6, int l, String s7, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method void AbstractSafeParcelable()>
		zzam = zza(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #94  <Method String zza(String)>
	//    5    9:putfield        #96  <Field String zzam>
		zzan = zza(s1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokestatic    #94  <Method String zza(String)>
	//    9   17:putfield        #98  <Field String zzan>
		if(!TextUtils.isEmpty(((CharSequence) (zzan))))
	//*  10   20:aload_0         
	//*  11   21:getfield        #98  <Field String zzan>
	//*  12   24:invokestatic    #104 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   27:ifne            123
			try
			{
				zzao = InetAddress.getByName(zzan);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #98  <Field String zzan>
	//   17   35:invokestatic    #110 <Method InetAddress InetAddress.getByName(String)>
	//   18   38:putfield        #112 <Field InetAddress zzao>
			}
	//*  19   41:goto            123
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  20   44:astore_2        
			{
				s = zzan;
	//   21   45:aload_0         
	//   22   46:getfield        #98  <Field String zzan>
	//   23   49:astore_1        
				s1 = ((UnknownHostException) (s1)).getMessage();
	//   24   50:aload_2         
	//   25   51:invokevirtual   #116 <Method String UnknownHostException.getMessage()>
	//   26   54:astore_2        
				StringBuilder stringbuilder = new StringBuilder(48 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length());
	//   27   55:new             #118 <Class StringBuilder>
	//   28   58:dup             
	//   29   59:bipush          48
	//   30   61:aload_1         
	//   31   62:invokestatic    #124 <Method String String.valueOf(Object)>
	//   32   65:invokevirtual   #128 <Method int String.length()>
	//   33   68:iadd            
	//   34   69:aload_2         
	//   35   70:invokestatic    #124 <Method String String.valueOf(Object)>
	//   36   73:invokevirtual   #128 <Method int String.length()>
	//   37   76:iadd            
	//   38   77:invokespecial   #131 <Method void StringBuilder(int)>
	//   39   80:astore          15
				stringbuilder.append("Unable to convert host address (");
	//   40   82:aload           15
	//   41   84:ldc1            #133 <String "Unable to convert host address (">
	//   42   86:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
				stringbuilder.append(s);
	//   44   90:aload           15
	//   45   92:aload_1         
	//   46   93:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   47   96:pop             
				stringbuilder.append(") to ipaddress: ");
	//   48   97:aload           15
	//   49   99:ldc1            #139 <String ") to ipaddress: ">
	//   50  101:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   51  104:pop             
				stringbuilder.append(s1);
	//   52  105:aload           15
	//   53  107:aload_2         
	//   54  108:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   55  111:pop             
				Log.i("CastDevice", stringbuilder.toString());
	//   56  112:ldc1            #141 <String "CastDevice">
	//   57  114:aload           15
	//   58  116:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   59  119:invokestatic    #150 <Method int Log.i(String, String)>
	//   60  122:pop             
			}
		zzap = zza(s2);
	//   61  123:aload_0         
	//   62  124:aload_3         
	//   63  125:invokestatic    #94  <Method String zza(String)>
	//   64  128:putfield        #152 <Field String zzap>
		zzaq = zza(s3);
	//   65  131:aload_0         
	//   66  132:aload           4
	//   67  134:invokestatic    #94  <Method String zza(String)>
	//   68  137:putfield        #154 <Field String zzaq>
		zzar = zza(s4);
	//   69  140:aload_0         
	//   70  141:aload           5
	//   71  143:invokestatic    #94  <Method String zza(String)>
	//   72  146:putfield        #156 <Field String zzar>
		zzas = i;
	//   73  149:aload_0         
	//   74  150:iload           6
	//   75  152:putfield        #158 <Field int zzas>
		if(list == null)
	//*  76  155:aload           7
	//*  77  157:ifnull          163
	//*  78  160:goto            172
			list = ((List) (new ArrayList()));
	//   79  163:new             #160 <Class ArrayList>
	//   80  166:dup             
	//   81  167:invokespecial   #161 <Method void ArrayList()>
	//   82  170:astore          7
		zzat = list;
	//   83  172:aload_0         
	//   84  173:aload           7
	//   85  175:putfield        #163 <Field List zzat>
		zzau = j;
	//   86  178:aload_0         
	//   87  179:iload           8
	//   88  181:putfield        #165 <Field int zzau>
		status = k;
	//   89  184:aload_0         
	//   90  185:iload           9
	//   91  187:putfield        #167 <Field int status>
		zzav = zza(s5);
	//   92  190:aload_0         
	//   93  191:aload           10
	//   94  193:invokestatic    #94  <Method String zza(String)>
	//   95  196:putfield        #169 <Field String zzav>
		zzaw = s6;
	//   96  199:aload_0         
	//   97  200:aload           11
	//   98  202:putfield        #171 <Field String zzaw>
		zzax = l;
	//   99  205:aload_0         
	//  100  206:iload           12
	//  101  208:putfield        #173 <Field int zzax>
		zzay = s7;
	//  102  211:aload_0         
	//  103  212:aload           13
	//  104  214:putfield        #175 <Field String zzay>
		zzaz = abyte0;
	//  105  217:aload_0         
	//  106  218:aload           14
	//  107  220:putfield        #177 <Field byte[] zzaz>
	//  108  223:return          
	}

	public static CastDevice getFromBundle(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			bundle.setClassLoader(((Class) (com/google/android/gms/cast/CastDevice)).getClassLoader());
	//    4    6:aload_0         
	//    5    7:ldc1            #2   <Class CastDevice>
	//    6    9:invokevirtual   #189 <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #195 <Method void Bundle.setClassLoader(ClassLoader)>
			return (CastDevice)bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
	//    8   15:aload_0         
	//    9   16:ldc1            #197 <String "com.google.android.gms.cast.EXTRA_CAST_DEVICE">
	//   10   18:invokevirtual   #201 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   11   21:checkcast       #2   <Class CastDevice>
	//   12   24:areturn         
		}
	}

	private static String zza(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       9
			s1 = "";
	//    4    6:ldc1            #203 <String "">
	//    5    8:astore_1        
		return s1;
	//    6    9:aload_1         
	//    7   10:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof CastDevice))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class CastDevice>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((CastDevice)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class CastDevice>
	//   12   20:astore_1        
		if(zzam == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #96  <Field String zzam>
	//*  15   25:ifnonnull       39
			return ((CastDevice) (obj)).zzam == null;
	//   16   28:aload_1         
	//   17   29:getfield        #96  <Field String zzam>
	//   18   32:ifnonnull       37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
		return zzcu.zza(((Object) (zzam)), ((Object) (((CastDevice) (obj)).zzam))) && zzcu.zza(((Object) (zzao)), ((Object) (((CastDevice) (obj)).zzao))) && zzcu.zza(((Object) (zzaq)), ((Object) (((CastDevice) (obj)).zzaq))) && zzcu.zza(((Object) (zzap)), ((Object) (((CastDevice) (obj)).zzap))) && zzcu.zza(((Object) (zzar)), ((Object) (((CastDevice) (obj)).zzar))) && zzas == ((CastDevice) (obj)).zzas && zzcu.zza(((Object) (zzat)), ((Object) (((CastDevice) (obj)).zzat))) && zzau == ((CastDevice) (obj)).zzau && status == ((CastDevice) (obj)).status && zzcu.zza(((Object) (zzav)), ((Object) (((CastDevice) (obj)).zzav))) && zzcu.zza(((Object) (Integer.valueOf(zzax))), ((Object) (Integer.valueOf(((CastDevice) (obj)).zzax)))) && zzcu.zza(((Object) (zzay)), ((Object) (((CastDevice) (obj)).zzay))) && zzcu.zza(((Object) (zzaw)), ((Object) (((CastDevice) (obj)).zzaw))) && zzcu.zza(((Object) (zzar)), ((Object) (((CastDevice) (obj)).getDeviceVersion()))) && zzas == ((CastDevice) (obj)).getServicePort() && (zzaz == null && ((CastDevice) (obj)).zzaz == null || Arrays.equals(zzaz, ((CastDevice) (obj)).zzaz));
	//   23   39:aload_0         
	//   24   40:getfield        #96  <Field String zzam>
	//   25   43:aload_1         
	//   26   44:getfield        #96  <Field String zzam>
	//   27   47:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   28   50:ifeq            273
	//   29   53:aload_0         
	//   30   54:getfield        #112 <Field InetAddress zzao>
	//   31   57:aload_1         
	//   32   58:getfield        #112 <Field InetAddress zzao>
	//   33   61:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   34   64:ifeq            273
	//   35   67:aload_0         
	//   36   68:getfield        #154 <Field String zzaq>
	//   37   71:aload_1         
	//   38   72:getfield        #154 <Field String zzaq>
	//   39   75:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   40   78:ifeq            273
	//   41   81:aload_0         
	//   42   82:getfield        #152 <Field String zzap>
	//   43   85:aload_1         
	//   44   86:getfield        #152 <Field String zzap>
	//   45   89:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   46   92:ifeq            273
	//   47   95:aload_0         
	//   48   96:getfield        #156 <Field String zzar>
	//   49   99:aload_1         
	//   50  100:getfield        #156 <Field String zzar>
	//   51  103:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   52  106:ifeq            273
	//   53  109:aload_0         
	//   54  110:getfield        #158 <Field int zzas>
	//   55  113:aload_1         
	//   56  114:getfield        #158 <Field int zzas>
	//   57  117:icmpne          273
	//   58  120:aload_0         
	//   59  121:getfield        #163 <Field List zzat>
	//   60  124:aload_1         
	//   61  125:getfield        #163 <Field List zzat>
	//   62  128:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   63  131:ifeq            273
	//   64  134:aload_0         
	//   65  135:getfield        #165 <Field int zzau>
	//   66  138:aload_1         
	//   67  139:getfield        #165 <Field int zzau>
	//   68  142:icmpne          273
	//   69  145:aload_0         
	//   70  146:getfield        #167 <Field int status>
	//   71  149:aload_1         
	//   72  150:getfield        #167 <Field int status>
	//   73  153:icmpne          273
	//   74  156:aload_0         
	//   75  157:getfield        #169 <Field String zzav>
	//   76  160:aload_1         
	//   77  161:getfield        #169 <Field String zzav>
	//   78  164:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   79  167:ifeq            273
	//   80  170:aload_0         
	//   81  171:getfield        #173 <Field int zzax>
	//   82  174:invokestatic    #215 <Method Integer Integer.valueOf(int)>
	//   83  177:aload_1         
	//   84  178:getfield        #173 <Field int zzax>
	//   85  181:invokestatic    #215 <Method Integer Integer.valueOf(int)>
	//   86  184:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   87  187:ifeq            273
	//   88  190:aload_0         
	//   89  191:getfield        #175 <Field String zzay>
	//   90  194:aload_1         
	//   91  195:getfield        #175 <Field String zzay>
	//   92  198:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   93  201:ifeq            273
	//   94  204:aload_0         
	//   95  205:getfield        #171 <Field String zzaw>
	//   96  208:aload_1         
	//   97  209:getfield        #171 <Field String zzaw>
	//   98  212:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//   99  215:ifeq            273
	//  100  218:aload_0         
	//  101  219:getfield        #156 <Field String zzar>
	//  102  222:aload_1         
	//  103  223:invokevirtual   #217 <Method String getDeviceVersion()>
	//  104  226:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//  105  229:ifeq            273
	//  106  232:aload_0         
	//  107  233:getfield        #158 <Field int zzas>
	//  108  236:aload_1         
	//  109  237:invokevirtual   #219 <Method int getServicePort()>
	//  110  240:icmpne          273
	//  111  243:aload_0         
	//  112  244:getfield        #177 <Field byte[] zzaz>
	//  113  247:ifnonnull       257
	//  114  250:aload_1         
	//  115  251:getfield        #177 <Field byte[] zzaz>
	//  116  254:ifnull          271
	//  117  257:aload_0         
	//  118  258:getfield        #177 <Field byte[] zzaz>
	//  119  261:aload_1         
	//  120  262:getfield        #177 <Field byte[] zzaz>
	//  121  265:invokestatic    #224 <Method boolean Arrays.equals(byte[], byte[])>
	//  122  268:ifeq            273
	//  123  271:iconst_1        
	//  124  272:ireturn         
	//  125  273:iconst_0        
	//  126  274:ireturn         
	}

	public String getDeviceId()
	{
		if(zzam.startsWith("__cast_nearby__"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field String zzam>
	//*   2    4:ldc1            #227 <String "__cast_nearby__">
	//*   3    6:invokevirtual   #231 <Method boolean String.startsWith(String)>
	//*   4    9:ifeq            22
			return zzam.substring(16);
	//    5   12:aload_0         
	//    6   13:getfield        #96  <Field String zzam>
	//    7   16:bipush          16
	//    8   18:invokevirtual   #235 <Method String String.substring(int)>
	//    9   21:areturn         
		else
			return zzam;
	//   10   22:aload_0         
	//   11   23:getfield        #96  <Field String zzam>
	//   12   26:areturn         
	}

	public String getDeviceVersion()
	{
		return zzar;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field String zzar>
	//    2    4:areturn         
	}

	public String getFriendlyName()
	{
		return zzap;
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field String zzap>
	//    2    4:areturn         
	}

	public WebImage getIcon(int i, int j)
	{
		boolean flag = zzat.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field List zzat>
	//    2    4:invokeinterface #242 <Method boolean List.isEmpty()>
	//    3    9:istore          5
		WebImage webimage1 = null;
	//    4   11:aconst_null     
	//    5   12:astore          7
		if(flag)
	//*   6   14:iload           5
	//*   7   16:ifeq            21
			return null;
	//    8   19:aconst_null     
	//    9   20:areturn         
		if(i > 0 && j > 0)
	//*  10   21:iload_1         
	//*  11   22:ifle            195
	//*  12   25:iload_2         
	//*  13   26:ifgt            32
	//*  14   29:goto            195
		{
			Iterator iterator = zzat.iterator();
	//   15   32:aload_0         
	//   16   33:getfield        #163 <Field List zzat>
	//   17   36:invokeinterface #246 <Method Iterator List.iterator()>
	//   18   41:astore          9
			WebImage webimage = null;
	//   19   43:aconst_null     
	//   20   44:astore          6
			do
			{
				if(!iterator.hasNext())
					break;
	//   21   46:aload           9
	//   22   48:invokeinterface #251 <Method boolean Iterator.hasNext()>
	//   23   53:ifeq            165
				WebImage webimage2 = (WebImage)iterator.next();
	//   24   56:aload           9
	//   25   58:invokeinterface #255 <Method Object Iterator.next()>
	//   26   63:checkcast       #257 <Class WebImage>
	//   27   66:astore          8
				int k = webimage2.getWidth();
	//   28   68:aload           8
	//   29   70:invokevirtual   #260 <Method int WebImage.getWidth()>
	//   30   73:istore_3        
				int l = webimage2.getHeight();
	//   31   74:aload           8
	//   32   76:invokevirtual   #263 <Method int WebImage.getHeight()>
	//   33   79:istore          4
				if(k >= i && l >= j)
	//*  34   81:iload_3         
	//*  35   82:iload_1         
	//*  36   83:icmplt          123
	//*  37   86:iload           4
	//*  38   88:iload_2         
	//*  39   89:icmplt          123
				{
					if(webimage1 == null || webimage1.getWidth() > k && webimage1.getHeight() > l)
	//*  40   92:aload           7
	//*  41   94:ifnull          116
	//*  42   97:aload           7
	//*  43   99:invokevirtual   #260 <Method int WebImage.getWidth()>
	//*  44  102:iload_3         
	//*  45  103:icmple          46
	//*  46  106:aload           7
	//*  47  108:invokevirtual   #263 <Method int WebImage.getHeight()>
	//*  48  111:iload           4
	//*  49  113:icmple          46
						webimage1 = webimage2;
	//   50  116:aload           8
	//   51  118:astore          7
				} else
	//*  52  120:goto            46
				if(k < i && l < j && (webimage == null || webimage.getWidth() < k && webimage.getHeight() < l))
	//*  53  123:iload_3         
	//*  54  124:iload_1         
	//*  55  125:icmpge          46
	//*  56  128:iload           4
	//*  57  130:iload_2         
	//*  58  131:icmpge          46
	//*  59  134:aload           6
	//*  60  136:ifnull          158
	//*  61  139:aload           6
	//*  62  141:invokevirtual   #260 <Method int WebImage.getWidth()>
	//*  63  144:iload_3         
	//*  64  145:icmpge          46
	//*  65  148:aload           6
	//*  66  150:invokevirtual   #263 <Method int WebImage.getHeight()>
	//*  67  153:iload           4
	//*  68  155:icmpge          46
					webimage = webimage2;
	//   69  158:aload           8
	//   70  160:astore          6
			} while(true);
	//   71  162:goto            46
			if(webimage1 != null)
	//*  72  165:aload           7
	//*  73  167:ifnull          173
				return webimage1;
	//   74  170:aload           7
	//   75  172:areturn         
			if(webimage != null)
	//*  76  173:aload           6
	//*  77  175:ifnull          181
				return webimage;
	//   78  178:aload           6
	//   79  180:areturn         
			else
				return (WebImage)zzat.get(0);
	//   80  181:aload_0         
	//   81  182:getfield        #163 <Field List zzat>
	//   82  185:iconst_0        
	//   83  186:invokeinterface #267 <Method Object List.get(int)>
	//   84  191:checkcast       #257 <Class WebImage>
	//   85  194:areturn         
		} else
		{
			return (WebImage)zzat.get(0);
	//   86  195:aload_0         
	//   87  196:getfield        #163 <Field List zzat>
	//   88  199:iconst_0        
	//   89  200:invokeinterface #267 <Method Object List.get(int)>
	//   90  205:checkcast       #257 <Class WebImage>
	//   91  208:areturn         
		}
	}

	public List getIcons()
	{
		return Collections.unmodifiableList(zzat);
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field List zzat>
	//    2    4:invokestatic    #274 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public Inet4Address getIpAddress()
	{
		boolean flag;
		if(zzao != null && (zzao instanceof Inet4Address))
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field InetAddress zzao>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #112 <Field InetAddress zzao>
	//*   5   11:instanceof      #279 <Class Inet4Address>
	//*   6   14:ifeq            22
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_1        
		else
	//*   9   19:goto            24
			flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_1        
		if(flag)
	//*  12   24:iload_1         
	//*  13   25:ifeq            36
			return (Inet4Address)zzao;
	//   14   28:aload_0         
	//   15   29:getfield        #112 <Field InetAddress zzao>
	//   16   32:checkcast       #279 <Class Inet4Address>
	//   17   35:areturn         
		else
			return null;
	//   18   36:aconst_null     
	//   19   37:areturn         
	}

	public String getModelName()
	{
		return zzaq;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field String zzaq>
	//    2    4:areturn         
	}

	public int getServicePort()
	{
		return zzas;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field int zzas>
	//    2    4:ireturn         
	}

	public boolean hasCapabilities(int ai[])
	{
		if(ai == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int j = ai.length;
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:istore_3        
		for(int i = 0; i < j; i++)
	//*   7    9:iconst_0        
	//*   8   10:istore_2        
	//*   9   11:iload_2         
	//*  10   12:iload_3         
	//*  11   13:icmpge          35
			if(!hasCapability(ai[i]))
	//*  12   16:aload_0         
	//*  13   17:aload_1         
	//*  14   18:iload_2         
	//*  15   19:iaload          
	//*  16   20:invokevirtual   #285 <Method boolean hasCapability(int)>
	//*  17   23:ifne            28
				return false;
	//   18   26:iconst_0        
	//   19   27:ireturn         

	//   20   28:iload_2         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_2        
	//*  24   32:goto            11
		return true;
	//   25   35:iconst_1        
	//   26   36:ireturn         
	}

	public boolean hasCapability(int i)
	{
		return (zzau & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field int zzau>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public boolean hasIcons()
	{
		return !zzat.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field List zzat>
	//    2    4:invokeinterface #242 <Method boolean List.isEmpty()>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	public int hashCode()
	{
		if(zzam == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field String zzam>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return zzam.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #96  <Field String zzam>
	//    7   13:invokevirtual   #290 <Method int String.hashCode()>
	//    8   16:ireturn         
	}

	public boolean isOnLocalNetwork()
	{
		return !zzam.startsWith("__cast_nearby__");
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String zzam>
	//    2    4:ldc1            #227 <String "__cast_nearby__">
	//    3    6:invokevirtual   #231 <Method boolean String.startsWith(String)>
	//    4    9:ifne            14
	//    5   12:iconst_1        
	//    6   13:ireturn         
	//    7   14:iconst_0        
	//    8   15:ireturn         
	}

	public boolean isSameDevice(CastDevice castdevice)
	{
		if(castdevice == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		String s;
		if(!TextUtils.isEmpty(((CharSequence) (getDeviceId()))) && !getDeviceId().startsWith("__cast_ble__") && !TextUtils.isEmpty(((CharSequence) (castdevice.getDeviceId()))) && !castdevice.getDeviceId().startsWith("__cast_ble__"))
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #295 <Method String getDeviceId()>
	//*   6   10:invokestatic    #104 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifne            70
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #295 <Method String getDeviceId()>
	//*  10   20:ldc2            #297 <String "__cast_ble__">
	//*  11   23:invokevirtual   #231 <Method boolean String.startsWith(String)>
	//*  12   26:ifne            70
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #295 <Method String getDeviceId()>
	//*  15   33:invokestatic    #104 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   36:ifne            70
	//*  17   39:aload_1         
	//*  18   40:invokevirtual   #295 <Method String getDeviceId()>
	//*  19   43:ldc2            #297 <String "__cast_ble__">
	//*  20   46:invokevirtual   #231 <Method boolean String.startsWith(String)>
	//*  21   49:ifne            70
		{
			String s1 = getDeviceId();
	//   22   52:aload_0         
	//   23   53:invokevirtual   #295 <Method String getDeviceId()>
	//   24   56:astore_3        
			s = castdevice.getDeviceId();
	//   25   57:aload_1         
	//   26   58:invokevirtual   #295 <Method String getDeviceId()>
	//   27   61:astore_2        
			castdevice = ((CastDevice) (s1));
	//   28   62:aload_3         
	//   29   63:astore_1        
		} else
	//*  30   64:aload_1         
	//*  31   65:aload_2         
	//*  32   66:invokestatic    #210 <Method boolean zzcu.zza(Object, Object)>
	//*  33   69:ireturn         
		if(!TextUtils.isEmpty(((CharSequence) (zzay))) && !TextUtils.isEmpty(((CharSequence) (castdevice.zzay))))
	//*  34   70:aload_0         
	//*  35   71:getfield        #175 <Field String zzay>
	//*  36   74:invokestatic    #104 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   77:ifne            107
	//*  38   80:aload_1         
	//*  39   81:getfield        #175 <Field String zzay>
	//*  40   84:invokestatic    #104 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  41   87:ifne            107
		{
			s = zzay;
	//   42   90:aload_0         
	//   43   91:getfield        #175 <Field String zzay>
	//   44   94:astore_2        
			String s2 = castdevice.zzay;
	//   45   95:aload_1         
	//   46   96:getfield        #175 <Field String zzay>
	//   47   99:astore_3        
			castdevice = ((CastDevice) (s));
	//   48  100:aload_2         
	//   49  101:astore_1        
			s = s2;
	//   50  102:aload_3         
	//   51  103:astore_2        
		} else
	//*  52  104:goto            64
		{
			return false;
	//   53  107:iconst_0        
	//   54  108:ireturn         
		}
		return zzcu.zza(((Object) (castdevice)), ((Object) (s)));
	}

	public void putInBundle(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", ((android.os.Parcelable) (this)));
	//    3    5:aload_1         
	//    4    6:ldc1            #197 <String "com.google.android.gms.cast.EXTRA_CAST_DEVICE">
	//    5    8:aload_0         
	//    6    9:invokevirtual   #303 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return;
	//    7   12:return          
		}
	}

	public String toString()
	{
		return String.format("\"%s\" (%s)", new Object[] {
			zzap, zzam
		});
	//    0    0:ldc2            #305 <String "\"%s\" (%s)">
	//    1    3:iconst_2        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #152 <Field String zzap>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #96  <Field String zzam>
	//   12   20:aastore         
	//   13   21:invokestatic    #311 <Method String String.format(String, Object[])>
	//   14   24:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #319 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, zzam, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #96  <Field String zzam>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #323 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, zzan, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #98  <Field String zzan>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #323 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 4, getFriendlyName(), false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #325 <Method String getFriendlyName()>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #323 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getModelName(), false);
	//   21   35:aload_1         
	//   22   36:iconst_5        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #327 <Method String getModelName()>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #323 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getDeviceVersion(), false);
	//   27   45:aload_1         
	//   28   46:bipush          6
	//   29   48:aload_0         
	//   30   49:invokevirtual   #217 <Method String getDeviceVersion()>
	//   31   52:iconst_0        
	//   32   53:invokestatic    #323 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 7, getServicePort());
	//   33   56:aload_1         
	//   34   57:bipush          7
	//   35   59:aload_0         
	//   36   60:invokevirtual   #219 <Method int getServicePort()>
	//   37   63:invokestatic    #331 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeTypedList(parcel, 8, getIcons(), false);
	//   38   66:aload_1         
	//   39   67:bipush          8
	//   40   69:aload_0         
	//   41   70:invokevirtual   #333 <Method List getIcons()>
	//   42   73:iconst_0        
	//   43   74:invokestatic    #337 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeInt(parcel, 9, zzau);
	//   44   77:aload_1         
	//   45   78:bipush          9
	//   46   80:aload_0         
	//   47   81:getfield        #165 <Field int zzau>
	//   48   84:invokestatic    #331 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 10, status);
	//   49   87:aload_1         
	//   50   88:bipush          10
	//   51   90:aload_0         
	//   52   91:getfield        #167 <Field int status>
	//   53   94:invokestatic    #331 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 11, zzav, false);
	//   54   97:aload_1         
	//   55   98:bipush          11
	//   56  100:aload_0         
	//   57  101:getfield        #169 <Field String zzav>
	//   58  104:iconst_0        
	//   59  105:invokestatic    #323 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 12, zzaw, false);
	//   60  108:aload_1         
	//   61  109:bipush          12
	//   62  111:aload_0         
	//   63  112:getfield        #171 <Field String zzaw>
	//   64  115:iconst_0        
	//   65  116:invokestatic    #323 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeInt(parcel, 13, zzax);
	//   66  119:aload_1         
	//   67  120:bipush          13
	//   68  122:aload_0         
	//   69  123:getfield        #173 <Field int zzax>
	//   70  126:invokestatic    #331 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 14, zzay, false);
	//   71  129:aload_1         
	//   72  130:bipush          14
	//   73  132:aload_0         
	//   74  133:getfield        #175 <Field String zzay>
	//   75  136:iconst_0        
	//   76  137:invokestatic    #323 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeByteArray(parcel, 15, zzaz, false);
	//   77  140:aload_1         
	//   78  141:bipush          15
	//   79  143:aload_0         
	//   80  144:getfield        #177 <Field byte[] zzaz>
	//   81  147:iconst_0        
	//   82  148:invokestatic    #341 <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   83  151:aload_1         
	//   84  152:iload_2         
	//   85  153:invokestatic    #344 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   86  156:return          
	}

	public static final int CAPABILITY_AUDIO_IN = 8;
	public static final int CAPABILITY_AUDIO_OUT = 4;
	public static final int CAPABILITY_MULTIZONE_GROUP = 32;
	public static final int CAPABILITY_VIDEO_IN = 2;
	public static final int CAPABILITY_VIDEO_OUT = 1;
	public static final android.os.Parcelable.Creator CREATOR = new zzn();
	private int status;
	private String zzam;
	private String zzan;
	private InetAddress zzao;
	private String zzap;
	private String zzaq;
	private String zzar;
	private int zzas;
	private List zzat;
	private int zzau;
	private String zzav;
	private String zzaw;
	private int zzax;
	private String zzay;
	private byte zzaz[];

	static 
	{
	//    0    0:new             #78  <Class zzn>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void zzn()>
	//    3    7:putstatic       #83  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
