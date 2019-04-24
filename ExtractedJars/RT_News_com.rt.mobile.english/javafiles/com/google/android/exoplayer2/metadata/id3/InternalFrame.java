// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Frame

public final class InternalFrame extends Id3Frame
{

	InternalFrame(Parcel parcel)
	{
		super("----");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "----">
	//    2    3:invokespecial   #28  <Method void Id3Frame(String)>
		domain = (String)Assertions.checkNotNull(((Object) (parcel.readString())));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #34  <Method String Parcel.readString()>
	//    6   11:invokestatic    #40  <Method Object Assertions.checkNotNull(Object)>
	//    7   14:checkcast       #42  <Class String>
	//    8   17:putfield        #44  <Field String domain>
		description = (String)Assertions.checkNotNull(((Object) (parcel.readString())));
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:invokevirtual   #34  <Method String Parcel.readString()>
	//   12   25:invokestatic    #40  <Method Object Assertions.checkNotNull(Object)>
	//   13   28:checkcast       #42  <Class String>
	//   14   31:putfield        #46  <Field String description>
		text = (String)Assertions.checkNotNull(((Object) (parcel.readString())));
	//   15   34:aload_0         
	//   16   35:aload_1         
	//   17   36:invokevirtual   #34  <Method String Parcel.readString()>
	//   18   39:invokestatic    #40  <Method Object Assertions.checkNotNull(Object)>
	//   19   42:checkcast       #42  <Class String>
	//   20   45:putfield        #48  <Field String text>
	//   21   48:return          
	}

	public InternalFrame(String s, String s1, String s2)
	{
		super("----");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "----">
	//    2    3:invokespecial   #28  <Method void Id3Frame(String)>
		domain = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #44  <Field String domain>
		description = s1;
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:putfield        #46  <Field String description>
		text = s2;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #48  <Field String text>
	//   12   21:return          
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
	//*   6    8:ifnull          75
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #58  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #58  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((InternalFrame)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class InternalFrame>
	//   16   28:astore_1        
			return Util.areEqual(((Object) (description)), ((Object) (((InternalFrame) (obj)).description))) && Util.areEqual(((Object) (domain)), ((Object) (((InternalFrame) (obj)).domain))) && Util.areEqual(((Object) (text)), ((Object) (((InternalFrame) (obj)).text)));
	//   17   29:aload_0         
	//   18   30:getfield        #46  <Field String description>
	//   19   33:aload_1         
	//   20   34:getfield        #46  <Field String description>
	//   21   37:invokestatic    #64  <Method boolean Util.areEqual(Object, Object)>
	//   22   40:ifeq            73
	//   23   43:aload_0         
	//   24   44:getfield        #44  <Field String domain>
	//   25   47:aload_1         
	//   26   48:getfield        #44  <Field String domain>
	//   27   51:invokestatic    #64  <Method boolean Util.areEqual(Object, Object)>
	//   28   54:ifeq            73
	//   29   57:aload_0         
	//   30   58:getfield        #48  <Field String text>
	//   31   61:aload_1         
	//   32   62:getfield        #48  <Field String text>
	//   33   65:invokestatic    #64  <Method boolean Util.areEqual(Object, Object)>
	//   34   68:ifeq            73
	//   35   71:iconst_1        
	//   36   72:ireturn         
	//   37   73:iconst_0        
	//   38   74:ireturn         
		} else
		{
			return false;
	//   39   75:iconst_0        
	//   40   76:ireturn         
		}
	}

	public int hashCode()
	{
		String s = domain;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String domain>
	//    2    4:astore          4
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		if(s != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          24
			i = domain.hashCode();
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field String domain>
	//    9   17:invokevirtual   #69  <Method int String.hashCode()>
	//   10   20:istore_1        
		else
	//*  11   21:goto            26
			i = 0;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		int j;
		if(description != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #46  <Field String description>
	//*  16   30:ifnull          44
			j = description.hashCode();
	//   17   33:aload_0         
	//   18   34:getfield        #46  <Field String description>
	//   19   37:invokevirtual   #69  <Method int String.hashCode()>
	//   20   40:istore_2        
		else
	//*  21   41:goto            46
			j = 0;
	//   22   44:iconst_0        
	//   23   45:istore_2        
		if(text != null)
	//*  24   46:aload_0         
	//*  25   47:getfield        #48  <Field String text>
	//*  26   50:ifnull          61
			k = text.hashCode();
	//   27   53:aload_0         
	//   28   54:getfield        #48  <Field String text>
	//   29   57:invokevirtual   #69  <Method int String.hashCode()>
	//   30   60:istore_3        
		return 31 * ((527 + i) * 31 + j) + k;
	//   31   61:bipush          31
	//   32   63:sipush          527
	//   33   66:iload_1         
	//   34   67:iadd            
	//   35   68:bipush          31
	//   36   70:imul            
	//   37   71:iload_2         
	//   38   72:iadd            
	//   39   73:imul            
	//   40   74:iload_3         
	//   41   75:iadd            
	//   42   76:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #72  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(id);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field String id>
	//    7   13:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(": domain=");
	//    9   17:aload_1         
	//   10   18:ldc1            #82  <String ": domain=">
	//   11   20:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(domain);
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #44  <Field String domain>
	//   16   29:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(", description=");
	//   18   33:aload_1         
	//   19   34:ldc1            #84  <String ", description=">
	//   20   36:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(description);
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #46  <Field String description>
	//   25   45:invokevirtual   #80  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #86  <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(id);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field String id>
	//    3    5:invokevirtual   #91  <Method void Parcel.writeString(String)>
		parcel.writeString(domain);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field String domain>
	//    7   13:invokevirtual   #91  <Method void Parcel.writeString(String)>
		parcel.writeString(text);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field String text>
	//   11   21:invokevirtual   #91  <Method void Parcel.writeString(String)>
	//   12   24:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public InternalFrame createFromParcel(Parcel parcel)
		{
			return new InternalFrame(parcel);
		//    0    0:new             #9   <Class InternalFrame>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void InternalFrame(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method InternalFrame createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public InternalFrame[] newArray(int i)
		{
			return new InternalFrame[i];
		//    0    0:iload_1         
		//    1    1:anewarray       InternalFrame[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method InternalFrame[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String ID = "----";
	public final String description;
	public final String domain;
	public final String text;

	static 
	{
	//    0    0:new             #6   <Class InternalFrame$1>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void InternalFrame$1()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
