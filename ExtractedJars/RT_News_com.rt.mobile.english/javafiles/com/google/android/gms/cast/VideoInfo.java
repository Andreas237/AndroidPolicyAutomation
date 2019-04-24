// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//			zzbt

public final class VideoInfo extends AbstractSafeParcelable
{

	VideoInfo(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void AbstractSafeParcelable()>
		width = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #48  <Field int width>
		height = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #50  <Field int height>
		zzgn = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #52  <Field int zzgn>
	//   11   19:return          
	}

	static VideoInfo zzg(JSONObject jsonobject)
	{
		byte byte0;
		if(jsonobject == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i;
		String s;
		try
		{
			s = jsonobject.getString("hdrType");
	//    4    6:aload_0         
	//    5    7:ldc1            #60  <String "hdrType">
	//    6    9:invokevirtual   #66  <Method String JSONObject.getString(String)>
	//    7   12:astore_3        
		}
	//*   8   13:iconst_m1       
	//*   9   14:istore_1        
	//*  10   15:aload_3         
	//*  11   16:invokevirtual   #72  <Method int String.hashCode()>
	//*  12   19:istore_2        
	//*  13   20:iload_2         
	//*  14   21:sipush          3218
	//*  15   24:icmpeq          90
	//*  16   27:iload_2         
	//*  17   28:ldc1            #73  <Int 0x192f6>
	//*  18   30:icmpeq          76
	//*  19   33:iload_2         
	//*  20   34:ldc1            #74  <Int 0x1bc41>
	//*  21   36:icmpeq          62
	//*  22   39:iload_2         
	//*  23   40:ldc1            #75  <Int 0x5e8b395>
	//*  24   42:icmpeq          48
	//*  25   45:goto            179
	//*  26   48:aload_3         
	//*  27   49:ldc1            #77  <String "hdr10">
	//*  28   51:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  29   54:ifeq            179
	//*  30   57:iconst_1        
	//*  31   58:istore_1        
	//*  32   59:goto            179
	//*  33   62:aload_3         
	//*  34   63:ldc1            #83  <String "sdr">
	//*  35   65:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  36   68:ifeq            179
	//*  37   71:iconst_3        
	//*  38   72:istore_1        
	//*  39   73:goto            179
	//*  40   76:aload_3         
	//*  41   77:ldc1            #85  <String "hdr">
	//*  42   79:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  43   82:ifeq            179
	//*  44   85:iconst_2        
	//*  45   86:istore_1        
	//*  46   87:goto            179
	//*  47   90:aload_3         
	//*  48   91:ldc1            #87  <String "dv">
	//*  49   93:invokevirtual   #81  <Method boolean String.equals(Object)>
	//*  50   96:ifeq            179
	//*  51   99:iconst_0        
	//*  52  100:istore_1        
	//*  53  101:goto            179
	//*  54  104:ldc1            #89  <String "VideoInfo">
	//*  55  106:getstatic       #95  <Field Locale Locale.ROOT>
	//*  56  109:ldc1            #97  <String "Unknown HDR type: %s">
	//*  57  111:iconst_1        
	//*  58  112:anewarray       Object[]
	//*  59  115:dup             
	//*  60  116:iconst_0        
	//*  61  117:aload_3         
	//*  62  118:aastore         
	//*  63  119:invokestatic    #103 <Method String String.format(Locale, String, Object[])>
	//*  64  122:invokestatic    #109 <Method int Log.d(String, String)>
	//*  65  125:pop             
	//*  66  126:iconst_0        
	//*  67  127:istore_1        
	//*  68  128:new             #2   <Class VideoInfo>
	//*  69  131:dup             
	//*  70  132:aload_0         
	//*  71  133:ldc1            #110 <String "width">
	//*  72  135:invokevirtual   #114 <Method int JSONObject.getInt(String)>
	//*  73  138:aload_0         
	//*  74  139:ldc1            #115 <String "height">
	//*  75  141:invokevirtual   #114 <Method int JSONObject.getInt(String)>
	//*  76  144:iload_1         
	//*  77  145:invokespecial   #117 <Method void VideoInfo(int, int, int)>
	//*  78  148:astore_0        
	//*  79  149:aload_0         
	//*  80  150:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
	//*  81  151:astore_0        
		{
			Log.d("VideoInfo", String.format(Locale.ROOT, "Error while creating a VideoInfo instance from JSON: %s", new Object[] {
				((JSONException) (jsonobject)).getMessage()
			}));
	//   82  152:ldc1            #89  <String "VideoInfo">
	//   83  154:getstatic       #95  <Field Locale Locale.ROOT>
	//   84  157:ldc1            #119 <String "Error while creating a VideoInfo instance from JSON: %s">
	//   85  159:iconst_1        
	//   86  160:anewarray       Object[]
	//   87  163:dup             
	//   88  164:iconst_0        
	//   89  165:aload_0         
	//   90  166:invokevirtual   #123 <Method String JSONException.getMessage()>
	//   91  169:aastore         
	//   92  170:invokestatic    #103 <Method String String.format(Locale, String, Object[])>
	//   93  173:invokestatic    #109 <Method int Log.d(String, String)>
	//   94  176:pop             
			return null;
	//   95  177:aconst_null     
	//   96  178:areturn         
		}
		byte0 = -1;
		i = s.hashCode();
		if(i == 3218) goto _L2; else goto _L1
_L1:
		if(i == 0x192f6) goto _L4; else goto _L3
_L3:
		if(i == 0x1bc41) goto _L6; else goto _L5
_L5:
		if(i == 0x5e8b395) goto _L8; else goto _L7
_L8:
		if(s.equals("hdr10"))
			byte0 = 1;
		  goto _L7
_L6:
		if(s.equals("sdr"))
			byte0 = 3;
		  goto _L7
_L4:
		if(s.equals("hdr"))
			byte0 = 2;
		  goto _L7
_L2:
		if(s.equals("dv"))
			byte0 = 0;
		  goto _L7
_L9:
		Log.d("VideoInfo", String.format(Locale.ROOT, "Unknown HDR type: %s", new Object[] {
			s
		}));
		byte0 = 0;
_L14:
		jsonobject = ((JSONObject) (new VideoInfo(jsonobject.getInt("width"), jsonobject.getInt("height"), ((int) (byte0)))));
		return ((VideoInfo) (jsonobject));
_L7:
		byte0;
	//   97  179:iload_1         
		JVM INSTR tableswitch 0 3: default 212
	//	               0 230
	//	               1 225
	//	               2 220
	//	               3 215;
	//   98  180:tableswitch     0 3: default 212
	//	               0 230
	//	               1 225
	//	               2 220
	//	               3 215
		   goto _L9 _L10 _L11 _L12 _L13
	//*  99  212:goto            104
_L13:
		byte0 = 1;
	//  100  215:iconst_1        
	//  101  216:istore_1        
		  goto _L14
	//* 102  217:goto            128
_L12:
		byte0 = 4;
	//  103  220:iconst_4        
	//  104  221:istore_1        
		  goto _L14
	//* 105  222:goto            128
_L11:
		byte0 = 2;
	//  106  225:iconst_2        
	//  107  226:istore_1        
		  goto _L14
	//* 108  227:goto            128
_L10:
		byte0 = 3;
	//  109  230:iconst_3        
	//  110  231:istore_1        
		  goto _L14
	//* 111  232:goto            128
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
		if(!(obj instanceof VideoInfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class VideoInfo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((VideoInfo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class VideoInfo>
	//   12   20:astore_1        
		return height == ((VideoInfo) (obj)).getHeight() && width == ((VideoInfo) (obj)).getWidth() && zzgn == ((VideoInfo) (obj)).getHdrType();
	//   13   21:aload_0         
	//   14   22:getfield        #50  <Field int height>
	//   15   25:aload_1         
	//   16   26:invokevirtual   #125 <Method int getHeight()>
	//   17   29:icmpne          56
	//   18   32:aload_0         
	//   19   33:getfield        #48  <Field int width>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #127 <Method int getWidth()>
	//   22   40:icmpne          56
	//   23   43:aload_0         
	//   24   44:getfield        #52  <Field int zzgn>
	//   25   47:aload_1         
	//   26   48:invokevirtual   #129 <Method int getHdrType()>
	//   27   51:icmpne          56
	//   28   54:iconst_1        
	//   29   55:ireturn         
	//   30   56:iconst_0        
	//   31   57:ireturn         
	}

	public final int getHdrType()
	{
		return zzgn;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field int zzgn>
	//    2    4:ireturn         
	}

	public final int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field int height>
	//    2    4:ireturn         
	}

	public final int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int width>
	//    2    4:ireturn         
	}

	public final int hashCode()
	{
		return Objects.hashCode(new Object[] {
			Integer.valueOf(height), Integer.valueOf(width), Integer.valueOf(zzgn)
		});
	//    0    0:iconst_3        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #50  <Field int height>
	//    6   10:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_0         
	//   11   17:getfield        #48  <Field int width>
	//   12   20:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:aload_0         
	//   17   27:getfield        #52  <Field int zzgn>
	//   18   30:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   19   33:aastore         
	//   20   34:invokestatic    #140 <Method int Objects.hashCode(Object[])>
	//   21   37:ireturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #148 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 2, getWidth());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #127 <Method int getWidth()>
	//    7   11:invokestatic    #152 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 3, getHeight());
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #125 <Method int getHeight()>
	//   12   20:invokestatic    #152 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 4, getHdrType());
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #129 <Method int getHdrType()>
	//   17   29:invokestatic    #152 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #155 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbt();
	public static final int HDR_TYPE_DV = 3;
	public static final int HDR_TYPE_HDR = 4;
	public static final int HDR_TYPE_HDR10 = 2;
	public static final int HDR_TYPE_SDR = 1;
	public static final int HDR_TYPE_UNKNOWN = 0;
	private int height;
	private int width;
	private int zzgn;

	static 
	{
	//    0    0:new             #36  <Class zzbt>
	//    1    3:dup             
	//    2    4:invokespecial   #39  <Method void zzbt()>
	//    3    7:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
