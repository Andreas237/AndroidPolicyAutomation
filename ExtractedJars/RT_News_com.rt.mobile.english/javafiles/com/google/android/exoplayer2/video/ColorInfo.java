// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class ColorInfo
	implements Parcelable
{

	public ColorInfo(int i, int j, int k, byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		colorSpace = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int colorSpace>
		colorRange = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #32  <Field int colorRange>
		colorTransfer = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #34  <Field int colorTransfer>
		hdrStaticInfo = abyte0;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #36  <Field byte[] hdrStaticInfo>
	//   14   25:return          
	}

	ColorInfo(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		colorSpace = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #43  <Method int Parcel.readInt()>
	//    5    9:putfield        #30  <Field int colorSpace>
		colorRange = parcel.readInt();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #43  <Method int Parcel.readInt()>
	//    9   17:putfield        #32  <Field int colorRange>
		colorTransfer = parcel.readInt();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #43  <Method int Parcel.readInt()>
	//   13   25:putfield        #34  <Field int colorTransfer>
		if(Util.readBoolean(parcel))
	//*  14   28:aload_1         
	//*  15   29:invokestatic    #49  <Method boolean Util.readBoolean(Parcel)>
	//*  16   32:ifeq            43
			parcel = ((Parcel) (parcel.createByteArray()));
	//   17   35:aload_1         
	//   18   36:invokevirtual   #53  <Method byte[] Parcel.createByteArray()>
	//   19   39:astore_1        
		else
	//*  20   40:goto            45
			parcel = null;
	//   21   43:aconst_null     
	//   22   44:astore_1        
		hdrStaticInfo = ((byte []) (parcel));
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:putfield        #36  <Field byte[] hdrStaticInfo>
	//   26   50:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          80
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #61  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #61  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((ColorInfo)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ColorInfo>
	//   16   28:astore_1        
			return colorSpace == ((ColorInfo) (obj)).colorSpace && colorRange == ((ColorInfo) (obj)).colorRange && colorTransfer == ((ColorInfo) (obj)).colorTransfer && Arrays.equals(hdrStaticInfo, ((ColorInfo) (obj)).hdrStaticInfo);
	//   17   29:aload_0         
	//   18   30:getfield        #30  <Field int colorSpace>
	//   19   33:aload_1         
	//   20   34:getfield        #30  <Field int colorSpace>
	//   21   37:icmpne          78
	//   22   40:aload_0         
	//   23   41:getfield        #32  <Field int colorRange>
	//   24   44:aload_1         
	//   25   45:getfield        #32  <Field int colorRange>
	//   26   48:icmpne          78
	//   27   51:aload_0         
	//   28   52:getfield        #34  <Field int colorTransfer>
	//   29   55:aload_1         
	//   30   56:getfield        #34  <Field int colorTransfer>
	//   31   59:icmpne          78
	//   32   62:aload_0         
	//   33   63:getfield        #36  <Field byte[] hdrStaticInfo>
	//   34   66:aload_1         
	//   35   67:getfield        #36  <Field byte[] hdrStaticInfo>
	//   36   70:invokestatic    #66  <Method boolean Arrays.equals(byte[], byte[])>
	//   37   73:ifeq            78
	//   38   76:iconst_1        
	//   39   77:ireturn         
	//   40   78:iconst_0        
	//   41   79:ireturn         
		} else
		{
			return false;
	//   42   80:iconst_0        
	//   43   81:ireturn         
		}
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field int hashCode>
	//*   2    4:ifne            46
			hashCode = 31 * (((527 + colorSpace) * 31 + colorRange) * 31 + colorTransfer) + Arrays.hashCode(hdrStaticInfo);
	//    3    7:aload_0         
	//    4    8:bipush          31
	//    5   10:sipush          527
	//    6   13:aload_0         
	//    7   14:getfield        #30  <Field int colorSpace>
	//    8   17:iadd            
	//    9   18:bipush          31
	//   10   20:imul            
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field int colorRange>
	//   13   25:iadd            
	//   14   26:bipush          31
	//   15   28:imul            
	//   16   29:aload_0         
	//   17   30:getfield        #34  <Field int colorTransfer>
	//   18   33:iadd            
	//   19   34:imul            
	//   20   35:aload_0         
	//   21   36:getfield        #36  <Field byte[] hdrStaticInfo>
	//   22   39:invokestatic    #72  <Method int Arrays.hashCode(byte[])>
	//   23   42:iadd            
	//   24   43:putfield        #69  <Field int hashCode>
		return hashCode;
	//   25   46:aload_0         
	//   26   47:getfield        #69  <Field int hashCode>
	//   27   50:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("ColorInfo(");
	//    4    8:aload_2         
	//    5    9:ldc1            #79  <String "ColorInfo(">
	//    6   11:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(colorSpace);
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:getfield        #30  <Field int colorSpace>
	//   11   20:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", ");
	//   13   24:aload_2         
	//   14   25:ldc1            #88  <String ", ">
	//   15   27:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(colorRange);
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #32  <Field int colorRange>
	//   20   36:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", ");
	//   22   40:aload_2         
	//   23   41:ldc1            #88  <String ", ">
	//   24   43:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(colorTransfer);
	//   26   47:aload_2         
	//   27   48:aload_0         
	//   28   49:getfield        #34  <Field int colorTransfer>
	//   29   52:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   30   55:pop             
		stringbuilder.append(", ");
	//   31   56:aload_2         
	//   32   57:ldc1            #88  <String ", ">
	//   33   59:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		boolean flag;
		if(hdrStaticInfo != null)
	//*  35   63:aload_0         
	//*  36   64:getfield        #36  <Field byte[] hdrStaticInfo>
	//*  37   67:ifnull          75
			flag = true;
	//   38   70:iconst_1        
	//   39   71:istore_1        
		else
	//*  40   72:goto            77
			flag = false;
	//   41   75:iconst_0        
	//   42   76:istore_1        
		stringbuilder.append(flag);
	//   43   77:aload_2         
	//   44   78:iload_1         
	//   45   79:invokevirtual   #91  <Method StringBuilder StringBuilder.append(boolean)>
	//   46   82:pop             
		stringbuilder.append(")");
	//   47   83:aload_2         
	//   48   84:ldc1            #93  <String ")">
	//   49   86:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   50   89:pop             
		return stringbuilder.toString();
	//   51   90:aload_2         
	//   52   91:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   53   94:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(colorSpace);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field int colorSpace>
	//    3    5:invokevirtual   #101 <Method void Parcel.writeInt(int)>
		parcel.writeInt(colorRange);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field int colorRange>
	//    7   13:invokevirtual   #101 <Method void Parcel.writeInt(int)>
		parcel.writeInt(colorTransfer);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #34  <Field int colorTransfer>
	//   11   21:invokevirtual   #101 <Method void Parcel.writeInt(int)>
		boolean flag;
		if(hdrStaticInfo != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #36  <Field byte[] hdrStaticInfo>
	//*  14   28:ifnull          36
			flag = true;
	//   15   31:iconst_1        
	//   16   32:istore_3        
		else
	//*  17   33:goto            38
			flag = false;
	//   18   36:iconst_0        
	//   19   37:istore_3        
		Util.writeBoolean(parcel, flag);
	//   20   38:aload_1         
	//   21   39:iload_3         
	//   22   40:invokestatic    #105 <Method void Util.writeBoolean(Parcel, boolean)>
		if(hdrStaticInfo != null)
	//*  23   43:aload_0         
	//*  24   44:getfield        #36  <Field byte[] hdrStaticInfo>
	//*  25   47:ifnull          58
			parcel.writeByteArray(hdrStaticInfo);
	//   26   50:aload_1         
	//   27   51:aload_0         
	//   28   52:getfield        #36  <Field byte[] hdrStaticInfo>
	//   29   55:invokevirtual   #109 <Method void Parcel.writeByteArray(byte[])>
	//   30   58:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ColorInfo createFromParcel(Parcel parcel)
		{
			return new ColorInfo(parcel);
		//    0    0:new             #9   <Class ColorInfo>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ColorInfo(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ColorInfo createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ColorInfo[] newArray(int i)
		{
			return new ColorInfo[0];
		//    0    0:iconst_0        
		//    1    1:anewarray       ColorInfo[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ColorInfo[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final int colorRange;
	public final int colorSpace;
	public final int colorTransfer;
	private int hashCode;
	public final byte hdrStaticInfo[];

	static 
	{
	//    0    0:new             #8   <Class ColorInfo$1>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ColorInfo$1()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
