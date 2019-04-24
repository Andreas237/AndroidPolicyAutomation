// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

public final class EventMessage
	implements com.google.android.exoplayer2.metadata.Metadata.Entry
{

	EventMessage(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		schemeIdUri = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method String Parcel.readString()>
	//    5    9:putfield        #40  <Field String schemeIdUri>
		value = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #38  <Method String Parcel.readString()>
	//    9   17:putfield        #42  <Field String value>
		presentationTimeUs = parcel.readLong();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #46  <Method long Parcel.readLong()>
	//   13   25:putfield        #48  <Field long presentationTimeUs>
		durationMs = parcel.readLong();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #46  <Method long Parcel.readLong()>
	//   17   33:putfield        #50  <Field long durationMs>
		id = parcel.readLong();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #46  <Method long Parcel.readLong()>
	//   21   41:putfield        #52  <Field long id>
		messageData = parcel.createByteArray();
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:invokevirtual   #56  <Method byte[] Parcel.createByteArray()>
	//   25   49:putfield        #58  <Field byte[] messageData>
	//   26   52:return          
	}

	public EventMessage(String s, String s1, long l, long l1, byte abyte0[], 
			long l2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		schemeIdUri = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field String schemeIdUri>
		value = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field String value>
		durationMs = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #50  <Field long durationMs>
		id = l1;
	//   11   19:aload_0         
	//   12   20:lload           5
	//   13   22:putfield        #52  <Field long id>
		messageData = abyte0;
	//   14   25:aload_0         
	//   15   26:aload           7
	//   16   28:putfield        #58  <Field byte[] messageData>
		presentationTimeUs = l2;
	//   17   31:aload_0         
	//   18   32:lload           8
	//   19   34:putfield        #48  <Field long presentationTimeUs>
	//   20   37:return          
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
	//*   6    8:ifnull          111
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #68  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #68  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((EventMessage)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class EventMessage>
	//   16   28:astore_1        
			return presentationTimeUs == ((EventMessage) (obj)).presentationTimeUs && durationMs == ((EventMessage) (obj)).durationMs && id == ((EventMessage) (obj)).id && Util.areEqual(((Object) (schemeIdUri)), ((Object) (((EventMessage) (obj)).schemeIdUri))) && Util.areEqual(((Object) (value)), ((Object) (((EventMessage) (obj)).value))) && Arrays.equals(messageData, ((EventMessage) (obj)).messageData);
	//   17   29:aload_0         
	//   18   30:getfield        #48  <Field long presentationTimeUs>
	//   19   33:aload_1         
	//   20   34:getfield        #48  <Field long presentationTimeUs>
	//   21   37:lcmp            
	//   22   38:ifne            109
	//   23   41:aload_0         
	//   24   42:getfield        #50  <Field long durationMs>
	//   25   45:aload_1         
	//   26   46:getfield        #50  <Field long durationMs>
	//   27   49:lcmp            
	//   28   50:ifne            109
	//   29   53:aload_0         
	//   30   54:getfield        #52  <Field long id>
	//   31   57:aload_1         
	//   32   58:getfield        #52  <Field long id>
	//   33   61:lcmp            
	//   34   62:ifne            109
	//   35   65:aload_0         
	//   36   66:getfield        #40  <Field String schemeIdUri>
	//   37   69:aload_1         
	//   38   70:getfield        #40  <Field String schemeIdUri>
	//   39   73:invokestatic    #74  <Method boolean Util.areEqual(Object, Object)>
	//   40   76:ifeq            109
	//   41   79:aload_0         
	//   42   80:getfield        #42  <Field String value>
	//   43   83:aload_1         
	//   44   84:getfield        #42  <Field String value>
	//   45   87:invokestatic    #74  <Method boolean Util.areEqual(Object, Object)>
	//   46   90:ifeq            109
	//   47   93:aload_0         
	//   48   94:getfield        #58  <Field byte[] messageData>
	//   49   97:aload_1         
	//   50   98:getfield        #58  <Field byte[] messageData>
	//   51  101:invokestatic    #79  <Method boolean Arrays.equals(byte[], byte[])>
	//   52  104:ifeq            109
	//   53  107:iconst_1        
	//   54  108:ireturn         
	//   55  109:iconst_0        
	//   56  110:ireturn         
		} else
		{
			return false;
	//   57  111:iconst_0        
	//   58  112:ireturn         
		}
	}

	public int hashCode()
	{
		if(hashCode == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field int hashCode>
	//*   2    4:ifne            122
		{
			String s = schemeIdUri;
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field String schemeIdUri>
	//    5   11:astore_3        
			int j = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
			int i;
			if(s != null)
	//*   8   14:aload_3         
	//*   9   15:ifnull          29
				i = schemeIdUri.hashCode();
	//   10   18:aload_0         
	//   11   19:getfield        #40  <Field String schemeIdUri>
	//   12   22:invokevirtual   #86  <Method int String.hashCode()>
	//   13   25:istore_1        
			else
	//*  14   26:goto            31
				i = 0;
	//   15   29:iconst_0        
	//   16   30:istore_1        
			if(value != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #42  <Field String value>
	//*  19   35:ifnull          46
				j = value.hashCode();
	//   20   38:aload_0         
	//   21   39:getfield        #42  <Field String value>
	//   22   42:invokevirtual   #86  <Method int String.hashCode()>
	//   23   45:istore_2        
			hashCode = 31 * (((((527 + i) * 31 + j) * 31 + (int)(presentationTimeUs ^ presentationTimeUs >>> 32)) * 31 + (int)(durationMs ^ durationMs >>> 32)) * 31 + (int)(id ^ id >>> 32)) + Arrays.hashCode(messageData);
	//   24   46:aload_0         
	//   25   47:bipush          31
	//   26   49:sipush          527
	//   27   52:iload_1         
	//   28   53:iadd            
	//   29   54:bipush          31
	//   30   56:imul            
	//   31   57:iload_2         
	//   32   58:iadd            
	//   33   59:bipush          31
	//   34   61:imul            
	//   35   62:aload_0         
	//   36   63:getfield        #48  <Field long presentationTimeUs>
	//   37   66:aload_0         
	//   38   67:getfield        #48  <Field long presentationTimeUs>
	//   39   70:bipush          32
	//   40   72:lushr           
	//   41   73:lxor            
	//   42   74:l2i             
	//   43   75:iadd            
	//   44   76:bipush          31
	//   45   78:imul            
	//   46   79:aload_0         
	//   47   80:getfield        #50  <Field long durationMs>
	//   48   83:aload_0         
	//   49   84:getfield        #50  <Field long durationMs>
	//   50   87:bipush          32
	//   51   89:lushr           
	//   52   90:lxor            
	//   53   91:l2i             
	//   54   92:iadd            
	//   55   93:bipush          31
	//   56   95:imul            
	//   57   96:aload_0         
	//   58   97:getfield        #52  <Field long id>
	//   59  100:aload_0         
	//   60  101:getfield        #52  <Field long id>
	//   61  104:bipush          32
	//   62  106:lushr           
	//   63  107:lxor            
	//   64  108:l2i             
	//   65  109:iadd            
	//   66  110:imul            
	//   67  111:aload_0         
	//   68  112:getfield        #58  <Field byte[] messageData>
	//   69  115:invokestatic    #89  <Method int Arrays.hashCode(byte[])>
	//   70  118:iadd            
	//   71  119:putfield        #82  <Field int hashCode>
		}
		return hashCode;
	//   72  122:aload_0         
	//   73  123:getfield        #82  <Field int hashCode>
	//   74  126:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("EMSG: scheme=");
	//    4    8:aload_1         
	//    5    9:ldc1            #95  <String "EMSG: scheme=">
	//    6   11:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(schemeIdUri);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #40  <Field String schemeIdUri>
	//   11   20:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", id=");
	//   13   24:aload_1         
	//   14   25:ldc1            #101 <String ", id=">
	//   15   27:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(id);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #52  <Field long id>
	//   20   36:invokevirtual   #104 <Method StringBuilder StringBuilder.append(long)>
	//   21   39:pop             
		stringbuilder.append(", value=");
	//   22   40:aload_1         
	//   23   41:ldc1            #106 <String ", value=">
	//   24   43:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(value);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #42  <Field String value>
	//   29   52:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		return stringbuilder.toString();
	//   31   56:aload_1         
	//   32   57:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   33   60:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(schemeIdUri);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #40  <Field String schemeIdUri>
	//    3    5:invokevirtual   #114 <Method void Parcel.writeString(String)>
		parcel.writeString(value);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #42  <Field String value>
	//    7   13:invokevirtual   #114 <Method void Parcel.writeString(String)>
		parcel.writeLong(presentationTimeUs);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #48  <Field long presentationTimeUs>
	//   11   21:invokevirtual   #118 <Method void Parcel.writeLong(long)>
		parcel.writeLong(durationMs);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #50  <Field long durationMs>
	//   15   29:invokevirtual   #118 <Method void Parcel.writeLong(long)>
		parcel.writeLong(id);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #52  <Field long id>
	//   19   37:invokevirtual   #118 <Method void Parcel.writeLong(long)>
		parcel.writeByteArray(messageData);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #58  <Field byte[] messageData>
	//   23   45:invokevirtual   #122 <Method void Parcel.writeByteArray(byte[])>
	//   24   48:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public EventMessage createFromParcel(Parcel parcel)
		{
			return new EventMessage(parcel);
		//    0    0:new             #9   <Class EventMessage>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void EventMessage(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method EventMessage createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public EventMessage[] newArray(int i)
		{
			return new EventMessage[i];
		//    0    0:iload_1         
		//    1    1:anewarray       EventMessage[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method EventMessage[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public final long durationMs;
	private int hashCode;
	public final long id;
	public final byte messageData[];
	public final long presentationTimeUs;
	public final String schemeIdUri;
	public final String value;

	static 
	{
	//    0    0:new             #8   <Class EventMessage$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void EventMessage$1()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
