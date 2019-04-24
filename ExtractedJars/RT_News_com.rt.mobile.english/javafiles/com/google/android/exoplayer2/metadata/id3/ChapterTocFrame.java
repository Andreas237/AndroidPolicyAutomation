// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.metadata.id3:
//			Id3Frame

public final class ChapterTocFrame extends Id3Frame
{

	ChapterTocFrame(Parcel parcel)
	{
		super("CTOC");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "CTOC">
	//    2    3:invokespecial   #33  <Method void Id3Frame(String)>
		elementId = parcel.readString();
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #39  <Method String Parcel.readString()>
	//    6   11:putfield        #41  <Field String elementId>
		int j = ((int) (parcel.readByte()));
	//    7   14:aload_1         
	//    8   15:invokevirtual   #45  <Method byte Parcel.readByte()>
	//    9   18:istore_3        
		int i = 0;
	//   10   19:iconst_0        
	//   11   20:istore_2        
		boolean flag1 = true;
	//   12   21:iconst_1        
	//   13   22:istore          5
		boolean flag;
		if(j != 0)
	//*  14   24:iload_3         
	//*  15   25:ifeq            34
			flag = true;
	//   16   28:iconst_1        
	//   17   29:istore          4
		else
	//*  18   31:goto            37
			flag = false;
	//   19   34:iconst_0        
	//   20   35:istore          4
		isRoot = flag;
	//   21   37:aload_0         
	//   22   38:iload           4
	//   23   40:putfield        #47  <Field boolean isRoot>
		if(parcel.readByte() != 0)
	//*  24   43:aload_1         
	//*  25   44:invokevirtual   #45  <Method byte Parcel.readByte()>
	//*  26   47:ifeq            57
			flag = flag1;
	//   27   50:iload           5
	//   28   52:istore          4
		else
	//*  29   54:goto            60
			flag = false;
	//   30   57:iconst_0        
	//   31   58:istore          4
		isOrdered = flag;
	//   32   60:aload_0         
	//   33   61:iload           4
	//   34   63:putfield        #49  <Field boolean isOrdered>
		children = parcel.createStringArray();
	//   35   66:aload_0         
	//   36   67:aload_1         
	//   37   68:invokevirtual   #53  <Method String[] Parcel.createStringArray()>
	//   38   71:putfield        #55  <Field String[] children>
		j = parcel.readInt();
	//   39   74:aload_1         
	//   40   75:invokevirtual   #59  <Method int Parcel.readInt()>
	//   41   78:istore_3        
		subFrames = new Id3Frame[j];
	//   42   79:aload_0         
	//   43   80:iload_3         
	//   44   81:anewarray       Id3Frame[]
	//   45   84:putfield        #61  <Field Id3Frame[] subFrames>
		for(; i < j; i++)
	//*  46   87:iload_2         
	//*  47   88:iload_3         
	//*  48   89:icmpge          117
			subFrames[i] = (Id3Frame)parcel.readParcelable(((Class) (com/google/android/exoplayer2/metadata/id3/Id3Frame)).getClassLoader());
	//   49   92:aload_0         
	//   50   93:getfield        #61  <Field Id3Frame[] subFrames>
	//   51   96:iload_2         
	//   52   97:aload_1         
	//   53   98:ldc1            #4   <Class Id3Frame>
	//   54  100:invokevirtual   #67  <Method ClassLoader Class.getClassLoader()>
	//   55  103:invokevirtual   #71  <Method android.os.Parcelable Parcel.readParcelable(ClassLoader)>
	//   56  106:checkcast       #4   <Class Id3Frame>
	//   57  109:aastore         

	//   58  110:iload_2         
	//   59  111:iconst_1        
	//   60  112:iadd            
	//   61  113:istore_2        
	//*  62  114:goto            87
	//   63  117:return          
	}

	public ChapterTocFrame(String s, boolean flag, boolean flag1, String as[], Id3Frame aid3frame[])
	{
		super("CTOC");
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <String "CTOC">
	//    2    3:invokespecial   #33  <Method void Id3Frame(String)>
		elementId = s;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #41  <Field String elementId>
		isRoot = flag;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:putfield        #47  <Field boolean isRoot>
		isOrdered = flag1;
	//    9   16:aload_0         
	//   10   17:iload_3         
	//   11   18:putfield        #49  <Field boolean isOrdered>
		children = as;
	//   12   21:aload_0         
	//   13   22:aload           4
	//   14   24:putfield        #55  <Field String[] children>
		subFrames = aid3frame;
	//   15   27:aload_0         
	//   16   28:aload           5
	//   17   30:putfield        #61  <Field Id3Frame[] subFrames>
	//   18   33:return          
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
	//*   6    8:ifnull          97
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
			obj = ((Object) ((ChapterTocFrame)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ChapterTocFrame>
	//   16   28:astore_1        
			return isRoot == ((ChapterTocFrame) (obj)).isRoot && isOrdered == ((ChapterTocFrame) (obj)).isOrdered && Util.areEqual(((Object) (elementId)), ((Object) (((ChapterTocFrame) (obj)).elementId))) && Arrays.equals(((Object []) (children)), ((Object []) (((ChapterTocFrame) (obj)).children))) && Arrays.equals(((Object []) (subFrames)), ((Object []) (((ChapterTocFrame) (obj)).subFrames)));
	//   17   29:aload_0         
	//   18   30:getfield        #47  <Field boolean isRoot>
	//   19   33:aload_1         
	//   20   34:getfield        #47  <Field boolean isRoot>
	//   21   37:icmpne          95
	//   22   40:aload_0         
	//   23   41:getfield        #49  <Field boolean isOrdered>
	//   24   44:aload_1         
	//   25   45:getfield        #49  <Field boolean isOrdered>
	//   26   48:icmpne          95
	//   27   51:aload_0         
	//   28   52:getfield        #41  <Field String elementId>
	//   29   55:aload_1         
	//   30   56:getfield        #41  <Field String elementId>
	//   31   59:invokestatic    #87  <Method boolean Util.areEqual(Object, Object)>
	//   32   62:ifeq            95
	//   33   65:aload_0         
	//   34   66:getfield        #55  <Field String[] children>
	//   35   69:aload_1         
	//   36   70:getfield        #55  <Field String[] children>
	//   37   73:invokestatic    #92  <Method boolean Arrays.equals(Object[], Object[])>
	//   38   76:ifeq            95
	//   39   79:aload_0         
	//   40   80:getfield        #61  <Field Id3Frame[] subFrames>
	//   41   83:aload_1         
	//   42   84:getfield        #61  <Field Id3Frame[] subFrames>
	//   43   87:invokestatic    #92  <Method boolean Arrays.equals(Object[], Object[])>
	//   44   90:ifeq            95
	//   45   93:iconst_1        
	//   46   94:ireturn         
	//   47   95:iconst_0        
	//   48   96:ireturn         
		} else
		{
			return false;
	//   49   97:iconst_0        
	//   50   98:ireturn         
		}
	}

	public Id3Frame getSubFrame(int i)
	{
		return subFrames[i];
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Id3Frame[] subFrames>
	//    2    4:iload_1         
	//    3    5:aaload          
	//    4    6:areturn         
	}

	public int getSubFrameCount()
	{
		return subFrames.length;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field Id3Frame[] subFrames>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #99  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #101 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #104 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(elementId);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field String elementId>
	//    3    5:invokevirtual   #109 <Method void Parcel.writeString(String)>
		parcel.writeByte((byte)isRoot);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #47  <Field boolean isRoot>
	//    7   13:int2byte        
	//    8   14:invokevirtual   #113 <Method void Parcel.writeByte(byte)>
		parcel.writeByte((byte)isOrdered);
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:getfield        #49  <Field boolean isOrdered>
	//   12   22:int2byte        
	//   13   23:invokevirtual   #113 <Method void Parcel.writeByte(byte)>
		parcel.writeStringArray(children);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #55  <Field String[] children>
	//   17   31:invokevirtual   #117 <Method void Parcel.writeStringArray(String[])>
		parcel.writeInt(subFrames.length);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #61  <Field Id3Frame[] subFrames>
	//   21   39:arraylength     
	//   22   40:invokevirtual   #121 <Method void Parcel.writeInt(int)>
		Id3Frame aid3frame[] = subFrames;
	//   23   43:aload_0         
	//   24   44:getfield        #61  <Field Id3Frame[] subFrames>
	//   25   47:astore          4
		int j = aid3frame.length;
	//   26   49:aload           4
	//   27   51:arraylength     
	//   28   52:istore_3        
		for(i = 0; i < j; i++)
	//*  29   53:iconst_0        
	//*  30   54:istore_2        
	//*  31   55:iload_2         
	//*  32   56:iload_3         
	//*  33   57:icmpge          76
			parcel.writeParcelable(((android.os.Parcelable) (aid3frame[i])), 0);
	//   34   60:aload_1         
	//   35   61:aload           4
	//   36   63:iload_2         
	//   37   64:aaload          
	//   38   65:iconst_0        
	//   39   66:invokevirtual   #125 <Method void Parcel.writeParcelable(android.os.Parcelable, int)>

	//   40   69:iload_2         
	//   41   70:iconst_1        
	//   42   71:iadd            
	//   43   72:istore_2        
	//*  44   73:goto            55
	//   45   76:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ChapterTocFrame createFromParcel(Parcel parcel)
		{
			return new ChapterTocFrame(parcel);
		//    0    0:new             #9   <Class ChapterTocFrame>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ChapterTocFrame(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method ChapterTocFrame createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public ChapterTocFrame[] newArray(int i)
		{
			return new ChapterTocFrame[i];
		//    0    0:iload_1         
		//    1    1:anewarray       ChapterTocFrame[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method ChapterTocFrame[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	public static final String ID = "CTOC";
	public final String children[];
	public final String elementId;
	public final boolean isOrdered;
	public final boolean isRoot;
	private final Id3Frame subFrames[];

	static 
	{
	//    0    0:new             #6   <Class ChapterTocFrame$1>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ChapterTocFrame$1()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
