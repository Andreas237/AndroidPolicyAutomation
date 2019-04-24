// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

public final class TrackGroup
	implements Parcelable
{

	TrackGroup(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		length = parcel.readInt();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #32  <Method int Parcel.readInt()>
	//    5    9:putfield        #34  <Field int length>
		formats = new Format[length];
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field int length>
	//    9   17:anewarray       Format[]
	//   10   20:putfield        #38  <Field Format[] formats>
		for(int i = 0; i < length; i++)
	//*  11   23:iconst_0        
	//*  12   24:istore_2        
	//*  13   25:iload_2         
	//*  14   26:aload_0         
	//*  15   27:getfield        #34  <Field int length>
	//*  16   30:icmpge          58
			formats[i] = (Format)parcel.readParcelable(((Class) (com/google/android/exoplayer2/Format)).getClassLoader());
	//   17   33:aload_0         
	//   18   34:getfield        #38  <Field Format[] formats>
	//   19   37:iload_2         
	//   20   38:aload_1         
	//   21   39:ldc1            #36  <Class Format>
	//   22   41:invokevirtual   #44  <Method ClassLoader Class.getClassLoader()>
	//   23   44:invokevirtual   #48  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   24   47:checkcast       #36  <Class Format>
	//   25   50:aastore         

	//   26   51:iload_2         
	//   27   52:iconst_1        
	//   28   53:iadd            
	//   29   54:istore_2        
	//*  30   55:goto            25
	//   31   58:return          
	}

	public transient TrackGroup(Format aformat[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		boolean flag;
		if(aformat.length > 0)
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifle            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		Assertions.checkState(flag);
	//   10   16:iload_2         
	//   11   17:invokestatic    #55  <Method void Assertions.checkState(boolean)>
		formats = aformat;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #38  <Field Format[] formats>
		length = aformat.length;
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:arraylength     
	//   18   28:putfield        #34  <Field int length>
	//   19   31:return          
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
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #63  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #63  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((TrackGroup)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class TrackGroup>
	//   16   28:astore_1        
			return length == ((TrackGroup) (obj)).length && Arrays.equals(((Object []) (formats)), ((Object []) (((TrackGroup) (obj)).formats)));
	//   17   29:aload_0         
	//   18   30:getfield        #34  <Field int length>
	//   19   33:aload_1         
	//   20   34:getfield        #34  <Field int length>
	//   21   37:icmpne          56
	//   22   40:aload_0         
	//   23   41:getfield        #38  <Field Format[] formats>
	//   24   44:aload_1         
	//   25   45:getfield        #38  <Field Format[] formats>
	//   26   48:invokestatic    #68  <Method boolean Arrays.equals(Object[], Object[])>
	//   27   51:ifeq            56
	//   28   54:iconst_1        
	//   29   55:ireturn         
	//   30   56:iconst_0        
	//   31   57:ireturn         
		} else
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
	}

	public Format getFormat(int i)
	{
		return formats[i];
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Format[] formats>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int hashCode>
	//*   2    4:ifne            22
			hashCode = 527 + Arrays.hashCode(((Object []) (formats)));
	//    3    7:aload_0         
	//    4    8:sipush          527
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field Format[] formats>
	//    7   15:invokestatic    #76  <Method int Arrays.hashCode(Object[])>
	//    8   18:iadd            
	//    9   19:putfield        #73  <Field int hashCode>
		return hashCode;
	//   10   22:aload_0         
	//   11   23:getfield        #73  <Field int hashCode>
	//   12   26:ireturn         
	}

	public int indexOf(Format format)
	{
		for(int i = 0; i < formats.length; i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #38  <Field Format[] formats>
	//*   5    7:arraylength     
	//*   6    8:icmpge          30
			if(format == formats[i])
	//*   7   11:aload_1         
	//*   8   12:aload_0         
	//*   9   13:getfield        #38  <Field Format[] formats>
	//*  10   16:iload_2         
	//*  11   17:aaload          
	//*  12   18:if_acmpne       23
				return i;
	//   13   21:iload_2         
	//   14   22:ireturn         

	//   15   23:iload_2         
	//   16   24:iconst_1        
	//   17   25:iadd            
	//   18   26:istore_2        
	//*  19   27:goto            2
		return -1;
	//   20   30:iconst_m1       
	//   21   31:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeInt(length);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field int length>
	//    3    5:invokevirtual   #84  <Method void Parcel.writeInt(int)>
		for(i = 0; i < length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #34  <Field int length>
	//*   9   15:icmpge          36
			parcel.writeParcelable(((Parcelable) (formats[i])), 0);
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #38  <Field Format[] formats>
	//   13   23:iload_2         
	//   14   24:aaload          
	//   15   25:iconst_0        
	//   16   26:invokevirtual   #88  <Method void Parcel.writeParcelable(Parcelable, int)>

	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_2        
	//*  21   33:goto            10
	//   22   36:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public TrackGroup createFromParcel(Parcel parcel)
		{
			return new TrackGroup(parcel);
		//    0    0:new             #9   <Class TrackGroup>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void TrackGroup(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method TrackGroup createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public TrackGroup[] newArray(int i)
		{
			return new TrackGroup[i];
		//    0    0:iload_1         
		//    1    1:anewarray       TrackGroup[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method TrackGroup[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final Format formats[];
	private int hashCode;
	public final int length;

	static 
	{
	//    0    0:new             #8   <Class TrackGroup$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void TrackGroup$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
