// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Frame

public final class ChapterFrame extends Id3Frame
{

	ChapterFrame(Parcel parcel)
	{
		super("CHAP");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "CHAP">
	//    2    3:invokespecial   #34  <Method void Id3Frame(String)>
		chapterId = parcel.readString();
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #40  <Method String Parcel.readString()>
	//    6   11:putfield        #42  <Field String chapterId>
		startTimeMs = parcel.readInt();
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #46  <Method int Parcel.readInt()>
	//   10   19:putfield        #48  <Field int startTimeMs>
		endTimeMs = parcel.readInt();
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #46  <Method int Parcel.readInt()>
	//   14   27:putfield        #50  <Field int endTimeMs>
		startOffset = parcel.readLong();
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #54  <Method long Parcel.readLong()>
	//   18   35:putfield        #56  <Field long startOffset>
		endOffset = parcel.readLong();
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokevirtual   #54  <Method long Parcel.readLong()>
	//   22   43:putfield        #58  <Field long endOffset>
		int j = parcel.readInt();
	//   23   46:aload_1         
	//   24   47:invokevirtual   #46  <Method int Parcel.readInt()>
	//   25   50:istore_3        
		subFrames = new Id3Frame[j];
	//   26   51:aload_0         
	//   27   52:iload_3         
	//   28   53:anewarray       Id3Frame[]
	//   29   56:putfield        #60  <Field Id3Frame[] subFrames>
		for(int i = 0; i < j; i++)
	//*  30   59:iconst_0        
	//*  31   60:istore_2        
	//*  32   61:iload_2         
	//*  33   62:iload_3         
	//*  34   63:icmpge          91
			subFrames[i] = (Id3Frame)parcel.readParcelable(((Class) (com/google/android/exoplayer2/metadata/id3/Id3Frame)).getClassLoader());
	//   35   66:aload_0         
	//   36   67:getfield        #60  <Field Id3Frame[] subFrames>
	//   37   70:iload_2         
	//   38   71:aload_1         
	//   39   72:ldc1            #4   <Class Id3Frame>
	//   40   74:invokevirtual   #66  <Method ClassLoader Class.getClassLoader()>
	//   41   77:invokevirtual   #70  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   42   80:checkcast       #4   <Class Id3Frame>
	//   43   83:aastore         

	//   44   84:iload_2         
	//   45   85:iconst_1        
	//   46   86:iadd            
	//   47   87:istore_2        
	//*  48   88:goto            61
	//   49   91:return          
	}

	public ChapterFrame(String s, int i, int j, long l, long l1, 
			Id3Frame aid3frame[])
	{
		super("CHAP");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "CHAP">
	//    2    3:invokespecial   #34  <Method void Id3Frame(String)>
		chapterId = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #42  <Field String chapterId>
		startTimeMs = i;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:putfield        #48  <Field int startTimeMs>
		endTimeMs = j;
	//    9   16:aload_0         
	//   10   17:iload_3         
	//   11   18:putfield        #50  <Field int endTimeMs>
		startOffset = l;
	//   12   21:aload_0         
	//   13   22:lload           4
	//   14   24:putfield        #56  <Field long startOffset>
		endOffset = l1;
	//   15   27:aload_0         
	//   16   28:lload           6
	//   17   30:putfield        #58  <Field long endOffset>
		subFrames = aid3frame;
	//   18   33:aload_0         
	//   19   34:aload           8
	//   20   36:putfield        #60  <Field Id3Frame[] subFrames>
	//   21   39:return          
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
	//*   6    8:ifnull          107
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #81  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #81  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((ChapterFrame)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ChapterFrame>
	//   16   28:astore_1        
			return startTimeMs == ((ChapterFrame) (obj)).startTimeMs && endTimeMs == ((ChapterFrame) (obj)).endTimeMs && startOffset == ((ChapterFrame) (obj)).startOffset && endOffset == ((ChapterFrame) (obj)).endOffset && Util.areEqual(((Object) (chapterId)), ((Object) (((ChapterFrame) (obj)).chapterId))) && Arrays.equals(((Object []) (subFrames)), ((Object []) (((ChapterFrame) (obj)).subFrames)));
	//   17   29:aload_0         
	//   18   30:getfield        #48  <Field int startTimeMs>
	//   19   33:aload_1         
	//   20   34:getfield        #48  <Field int startTimeMs>
	//   21   37:icmpne          105
	//   22   40:aload_0         
	//   23   41:getfield        #50  <Field int endTimeMs>
	//   24   44:aload_1         
	//   25   45:getfield        #50  <Field int endTimeMs>
	//   26   48:icmpne          105
	//   27   51:aload_0         
	//   28   52:getfield        #56  <Field long startOffset>
	//   29   55:aload_1         
	//   30   56:getfield        #56  <Field long startOffset>
	//   31   59:lcmp            
	//   32   60:ifne            105
	//   33   63:aload_0         
	//   34   64:getfield        #58  <Field long endOffset>
	//   35   67:aload_1         
	//   36   68:getfield        #58  <Field long endOffset>
	//   37   71:lcmp            
	//   38   72:ifne            105
	//   39   75:aload_0         
	//   40   76:getfield        #42  <Field String chapterId>
	//   41   79:aload_1         
	//   42   80:getfield        #42  <Field String chapterId>
	//   43   83:invokestatic    #87  <Method boolean Util.areEqual(Object, Object)>
	//   44   86:ifeq            105
	//   45   89:aload_0         
	//   46   90:getfield        #60  <Field Id3Frame[] subFrames>
	//   47   93:aload_1         
	//   48   94:getfield        #60  <Field Id3Frame[] subFrames>
	//   49   97:invokestatic    #92  <Method boolean Arrays.equals(Object[], Object[])>
	//   50  100:ifeq            105
	//   51  103:iconst_1        
	//   52  104:ireturn         
	//   53  105:iconst_0        
	//   54  106:ireturn         
		} else
		{
			return false;
	//   55  107:iconst_0        
	//   56  108:ireturn         
		}
	}

	public Id3Frame getSubFrame(int i)
	{
		return subFrames[i];
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Id3Frame[] subFrames>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int getSubFrameCount()
	{
		return subFrames.length;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Id3Frame[] subFrames>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public int hashCode()
	{
		int j = startTimeMs;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int startTimeMs>
	//    2    4:istore_2        
		int k = endTimeMs;
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field int endTimeMs>
	//    5    9:istore_3        
		int l = (int)startOffset;
	//    6   10:aload_0         
	//    7   11:getfield        #56  <Field long startOffset>
	//    8   14:l2i             
	//    9   15:istore          4
		int i1 = (int)endOffset;
	//   10   17:aload_0         
	//   11   18:getfield        #58  <Field long endOffset>
	//   12   21:l2i             
	//   13   22:istore          5
		int i;
		if(chapterId != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #42  <Field String chapterId>
	//*  16   28:ifnull          42
			i = chapterId.hashCode();
	//   17   31:aload_0         
	//   18   32:getfield        #42  <Field String chapterId>
	//   19   35:invokevirtual   #101 <Method int String.hashCode()>
	//   20   38:istore_1        
		else
	//*  21   39:goto            44
			i = 0;
	//   22   42:iconst_0        
	//   23   43:istore_1        
		return 31 * ((((527 + j) * 31 + k) * 31 + l) * 31 + i1) + i;
	//   24   44:bipush          31
	//   25   46:sipush          527
	//   26   49:iload_2         
	//   27   50:iadd            
	//   28   51:bipush          31
	//   29   53:imul            
	//   30   54:iload_3         
	//   31   55:iadd            
	//   32   56:bipush          31
	//   33   58:imul            
	//   34   59:iload           4
	//   35   61:iadd            
	//   36   62:bipush          31
	//   37   64:imul            
	//   38   65:iload           5
	//   39   67:iadd            
	//   40   68:imul            
	//   41   69:iload_1         
	//   42   70:iadd            
	//   43   71:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(chapterId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #42  <Field String chapterId>
	//    3    5:invokevirtual   #106 <Method void Parcel.writeString(String)>
		parcel.writeInt(startTimeMs);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field int startTimeMs>
	//    7   13:invokevirtual   #110 <Method void Parcel.writeInt(int)>
		parcel.writeInt(endTimeMs);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #50  <Field int endTimeMs>
	//   11   21:invokevirtual   #110 <Method void Parcel.writeInt(int)>
		parcel.writeLong(startOffset);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #56  <Field long startOffset>
	//   15   29:invokevirtual   #114 <Method void Parcel.writeLong(long)>
		parcel.writeLong(endOffset);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #58  <Field long endOffset>
	//   19   37:invokevirtual   #114 <Method void Parcel.writeLong(long)>
		parcel.writeInt(subFrames.length);
	//   20   40:aload_1         
	//   21   41:aload_0         
	//   22   42:getfield        #60  <Field Id3Frame[] subFrames>
	//   23   45:arraylength     
	//   24   46:invokevirtual   #110 <Method void Parcel.writeInt(int)>
		Id3Frame aid3frame[] = subFrames;
	//   25   49:aload_0         
	//   26   50:getfield        #60  <Field Id3Frame[] subFrames>
	//   27   53:astore          4
		int j = aid3frame.length;
	//   28   55:aload           4
	//   29   57:arraylength     
	//   30   58:istore_3        
		for(i = 0; i < j; i++)
	//*  31   59:iconst_0        
	//*  32   60:istore_2        
	//*  33   61:iload_2         
	//*  34   62:iload_3         
	//*  35   63:icmpge          82
			parcel.writeParcelable(((android.os.Parcelable) (aid3frame[i])), 0);
	//   36   66:aload_1         
	//   37   67:aload           4
	//   38   69:iload_2         
	//   39   70:aaload          
	//   40   71:iconst_0        
	//   41   72:invokevirtual   #118 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>

	//   42   75:iload_2         
	//   43   76:iconst_1        
	//   44   77:iadd            
	//   45   78:istore_2        
	//*  46   79:goto            61
	//   47   82:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ChapterFrame createFromParcel(Parcel parcel)
		{
			return new ChapterFrame(parcel);
		//    0    0:new             #9   <Class ChapterFrame>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ChapterFrame(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ChapterFrame createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ChapterFrame[] newArray(int i)
		{
			return new ChapterFrame[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ChapterFrame[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ChapterFrame[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String ID = "CHAP";
	public final String chapterId;
	public final long endOffset;
	public final int endTimeMs;
	public final long startOffset;
	public final int startTimeMs;
	private final Id3Frame subFrames[];

	static 
	{
	//    0    0:new             #6   <Class ChapterFrame$1>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void ChapterFrame$1()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
