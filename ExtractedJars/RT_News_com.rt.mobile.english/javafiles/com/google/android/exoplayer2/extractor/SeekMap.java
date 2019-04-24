// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;

// Referenced classes of package com.google.android.exoplayer2.extractor:
//			SeekPoint

public interface SeekMap
{
	public static final class SeekPoints
	{

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
		//*   6    8:ifnull          61
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #38  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #38  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((SeekPoints)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class SeekMap$SeekPoints>
		//   16   28:astore_1        
				return first.equals(((Object) (((SeekPoints) (obj)).first))) && second.equals(((Object) (((SeekPoints) (obj)).second)));
		//   17   29:aload_0         
		//   18   30:getfield        #29  <Field SeekPoint first>
		//   19   33:aload_1         
		//   20   34:getfield        #29  <Field SeekPoint first>
		//   21   37:invokevirtual   #40  <Method boolean SeekPoint.equals(Object)>
		//   22   40:ifeq            59
		//   23   43:aload_0         
		//   24   44:getfield        #31  <Field SeekPoint second>
		//   25   47:aload_1         
		//   26   48:getfield        #31  <Field SeekPoint second>
		//   27   51:invokevirtual   #40  <Method boolean SeekPoint.equals(Object)>
		//   28   54:ifeq            59
		//   29   57:iconst_1        
		//   30   58:ireturn         
		//   31   59:iconst_0        
		//   32   60:ireturn         
			} else
			{
				return false;
		//   33   61:iconst_0        
		//   34   62:ireturn         
			}
		}

		public int hashCode()
		{
			return 31 * first.hashCode() + second.hashCode();
		//    0    0:bipush          31
		//    1    2:aload_0         
		//    2    3:getfield        #29  <Field SeekPoint first>
		//    3    6:invokevirtual   #45  <Method int SeekPoint.hashCode()>
		//    4    9:imul            
		//    5   10:aload_0         
		//    6   11:getfield        #31  <Field SeekPoint second>
		//    7   14:invokevirtual   #45  <Method int SeekPoint.hashCode()>
		//    8   17:iadd            
		//    9   18:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #49  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #50  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("[");
		//    4    8:aload_2         
		//    5    9:ldc1            #52  <String "[">
		//    6   11:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(((Object) (first)));
		//    8   15:aload_2         
		//    9   16:aload_0         
		//   10   17:getfield        #29  <Field SeekPoint first>
		//   11   20:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
		//   12   23:pop             
			Object obj;
			if(first.equals(((Object) (second))))
		//*  13   24:aload_0         
		//*  14   25:getfield        #29  <Field SeekPoint first>
		//*  15   28:aload_0         
		//*  16   29:getfield        #31  <Field SeekPoint second>
		//*  17   32:invokevirtual   #40  <Method boolean SeekPoint.equals(Object)>
		//*  18   35:ifeq            44
			{
				obj = "";
		//   19   38:ldc1            #61  <String "">
		//   20   40:astore_1        
			} else
		//*  21   41:goto            73
			{
				obj = ((Object) (new StringBuilder()));
		//   22   44:new             #49  <Class StringBuilder>
		//   23   47:dup             
		//   24   48:invokespecial   #50  <Method void StringBuilder()>
		//   25   51:astore_1        
				((StringBuilder) (obj)).append(", ");
		//   26   52:aload_1         
		//   27   53:ldc1            #63  <String ", ">
		//   28   55:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   29   58:pop             
				((StringBuilder) (obj)).append(((Object) (second)));
		//   30   59:aload_1         
		//   31   60:aload_0         
		//   32   61:getfield        #31  <Field SeekPoint second>
		//   33   64:invokevirtual   #59  <Method StringBuilder StringBuilder.append(Object)>
		//   34   67:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
		//   35   68:aload_1         
		//   36   69:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   37   72:astore_1        
			}
			stringbuilder.append(((String) (obj)));
		//   38   73:aload_2         
		//   39   74:aload_1         
		//   40   75:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   41   78:pop             
			stringbuilder.append("]");
		//   42   79:aload_2         
		//   43   80:ldc1            #67  <String "]">
		//   44   82:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
		//   45   85:pop             
			return stringbuilder.toString();
		//   46   86:aload_2         
		//   47   87:invokevirtual   #65  <Method String StringBuilder.toString()>
		//   48   90:areturn         
		}

		public final SeekPoint first;
		public final SeekPoint second;

		public SeekPoints(SeekPoint seekpoint)
		{
			this(seekpoint, seekpoint);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_1         
		//    3    3:invokespecial   #15  <Method void SeekMap$SeekPoints(SeekPoint, SeekPoint)>
		//    4    6:return          
		}

		public SeekPoints(SeekPoint seekpoint, SeekPoint seekpoint1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			first = (SeekPoint)Assertions.checkNotNull(((Object) (seekpoint)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #25  <Method Object Assertions.checkNotNull(Object)>
		//    5    9:checkcast       #27  <Class SeekPoint>
		//    6   12:putfield        #29  <Field SeekPoint first>
			second = (SeekPoint)Assertions.checkNotNull(((Object) (seekpoint1)));
		//    7   15:aload_0         
		//    8   16:aload_2         
		//    9   17:invokestatic    #25  <Method Object Assertions.checkNotNull(Object)>
		//   10   20:checkcast       #27  <Class SeekPoint>
		//   11   23:putfield        #31  <Field SeekPoint second>
		//   12   26:return          
		}
	}

	public static final class Unseekable
		implements SeekMap
	{

		public long getDurationUs()
		{
			return durationUs;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field long durationUs>
		//    2    4:lreturn         
		}

		public SeekPoints getSeekPoints(long l)
		{
			return startSeekPoints;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field SeekMap$SeekPoints startSeekPoints>
		//    2    4:areturn         
		}

		public boolean isSeekable()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		private final long durationUs;
		private final SeekPoints startSeekPoints;

		public Unseekable(long l)
		{
			this(l, 0L);
		//    0    0:aload_0         
		//    1    1:lload_1         
		//    2    2:lconst_0        
		//    3    3:invokespecial   #16  <Method void SeekMap$Unseekable(long, long)>
		//    4    6:return          
		}

		public Unseekable(long l, long l1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			durationUs = l;
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:putfield        #22  <Field long durationUs>
			SeekPoint seekpoint;
			if(l1 == 0L)
		//*   5    9:lload_3         
		//*   6   10:lconst_0        
		//*   7   11:lcmp            
		//*   8   12:ifne            23
				seekpoint = SeekPoint.START;
		//    9   15:getstatic       #28  <Field SeekPoint SeekPoint.START>
		//   10   18:astore          5
			else
		//*  11   20:goto            34
				seekpoint = new SeekPoint(0L, l1);
		//   12   23:new             #24  <Class SeekPoint>
		//   13   26:dup             
		//   14   27:lconst_0        
		//   15   28:lload_3         
		//   16   29:invokespecial   #29  <Method void SeekPoint(long, long)>
		//   17   32:astore          5
			startSeekPoints = new SeekPoints(seekpoint);
		//   18   34:aload_0         
		//   19   35:new             #31  <Class SeekMap$SeekPoints>
		//   20   38:dup             
		//   21   39:aload           5
		//   22   41:invokespecial   #34  <Method void SeekMap$SeekPoints(SeekPoint)>
		//   23   44:putfield        #36  <Field SeekMap$SeekPoints startSeekPoints>
		//   24   47:return          
		}
	}


	public abstract long getDurationUs();

	public abstract SeekPoints getSeekPoints(long l);

	public abstract boolean isSeekable();
}
