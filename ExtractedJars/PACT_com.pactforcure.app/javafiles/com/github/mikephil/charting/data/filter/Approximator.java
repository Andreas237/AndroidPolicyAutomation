// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.filter;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;

public class Approximator
{
	public static final class ApproximatorType extends Enum
	{

		public static ApproximatorType valueOf(String s)
		{
			return (ApproximatorType)Enum.valueOf(com/github/mikephil/charting/data/filter/Approximator$ApproximatorType, s);
		//    0    0:ldc1            #2   <Class Approximator$ApproximatorType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class Approximator$ApproximatorType>
		//    4    9:areturn         
		}

		public static ApproximatorType[] values()
		{
			return (ApproximatorType[])((ApproximatorType []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field Approximator$ApproximatorType[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.github.mikephil.charting.data.filter.Approximator$ApproximatorType_3B_.clone()>
		//    2    6:checkcast       #38  <Class Approximator$ApproximatorType[]>
		//    3    9:areturn         
		}

		private static final ApproximatorType $VALUES[];
		public static final ApproximatorType DOUGLAS_PEUCKER;
		public static final ApproximatorType NONE;

		static 
		{
			NONE = new ApproximatorType("NONE", 0);
		//    0    0:new             #2   <Class Approximator$ApproximatorType>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void Approximator$ApproximatorType(String, int)>
		//    5   10:putstatic       #22  <Field Approximator$ApproximatorType NONE>
			DOUGLAS_PEUCKER = new ApproximatorType("DOUGLAS_PEUCKER", 1);
		//    6   13:new             #2   <Class Approximator$ApproximatorType>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "DOUGLAS_PEUCKER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void Approximator$ApproximatorType(String, int)>
		//   11   23:putstatic       #25  <Field Approximator$ApproximatorType DOUGLAS_PEUCKER>
			$VALUES = (new ApproximatorType[] {
				NONE, DOUGLAS_PEUCKER
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       ApproximatorType[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field Approximator$ApproximatorType NONE>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field Approximator$ApproximatorType DOUGLAS_PEUCKER>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field Approximator$ApproximatorType[] $VALUES>
		//*  23   45:return          
		}

		private ApproximatorType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public Approximator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mType = ApproximatorType.DOUGLAS_PEUCKER;
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field Approximator$ApproximatorType Approximator$ApproximatorType.DOUGLAS_PEUCKER>
	//    4    8:putfield        #27  <Field Approximator$ApproximatorType mType>
		mTolerance = 0.0D;
	//    5   11:aload_0         
	//    6   12:dconst_0        
	//    7   13:putfield        #29  <Field double mTolerance>
		mScaleRatio = 1.0F;
	//    8   16:aload_0         
	//    9   17:fconst_1        
	//   10   18:putfield        #31  <Field float mScaleRatio>
		mDeltaRatio = 1.0F;
	//   11   21:aload_0         
	//   12   22:fconst_1        
	//   13   23:putfield        #33  <Field float mDeltaRatio>
		mType = ApproximatorType.NONE;
	//   14   26:aload_0         
	//   15   27:getstatic       #36  <Field Approximator$ApproximatorType Approximator$ApproximatorType.NONE>
	//   16   30:putfield        #27  <Field Approximator$ApproximatorType mType>
	//   17   33:return          
	}

	public Approximator(ApproximatorType approximatortype, double d)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mType = ApproximatorType.DOUGLAS_PEUCKER;
	//    2    4:aload_0         
	//    3    5:getstatic       #25  <Field Approximator$ApproximatorType Approximator$ApproximatorType.DOUGLAS_PEUCKER>
	//    4    8:putfield        #27  <Field Approximator$ApproximatorType mType>
		mTolerance = 0.0D;
	//    5   11:aload_0         
	//    6   12:dconst_0        
	//    7   13:putfield        #29  <Field double mTolerance>
		mScaleRatio = 1.0F;
	//    8   16:aload_0         
	//    9   17:fconst_1        
	//   10   18:putfield        #31  <Field float mScaleRatio>
		mDeltaRatio = 1.0F;
	//   11   21:aload_0         
	//   12   22:fconst_1        
	//   13   23:putfield        #33  <Field float mDeltaRatio>
		setup(approximatortype, d);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:dload_2         
	//   17   29:invokevirtual   #41  <Method void setup(Approximator$ApproximatorType, double)>
	//   18   32:return          
	}

	private void algorithmDouglasPeucker(List list, double d, int i, int j)
	{
		if(j > i + 1)
	//*   0    0:iload           5
	//*   1    2:iload           4
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:icmpgt          10
	//*   5    9:return          
		{
			int l = 0;
	//    6   10:iconst_0        
	//    7   11:istore          13
			double d1 = 0.0D;
	//    8   13:dconst_0        
	//    9   14:dstore          6
			Entry entry = (Entry)list.get(i);
	//   10   16:aload_1         
	//   11   17:iload           4
	//   12   19:invokeinterface #49  <Method Object List.get(int)>
	//   13   24:checkcast       #51  <Class Entry>
	//   14   27:astore          14
			Entry entry1 = (Entry)list.get(j);
	//   15   29:aload_1         
	//   16   30:iload           5
	//   17   32:invokeinterface #49  <Method Object List.get(int)>
	//   18   37:checkcast       #51  <Class Entry>
	//   19   40:astore          15
			for(int k = i + 1; k < j;)
	//*  20   42:iload           4
	//*  21   44:iconst_1        
	//*  22   45:iadd            
	//*  23   46:istore          12
	//*  24   48:iload           12
	//*  25   50:iload           5
	//*  26   52:icmpge          111
			{
				double d3 = calcAngleBetweenLines(entry, entry1, entry, (Entry)list.get(k));
	//   27   55:aload_0         
	//   28   56:aload           14
	//   29   58:aload           15
	//   30   60:aload           14
	//   31   62:aload_1         
	//   32   63:iload           12
	//   33   65:invokeinterface #49  <Method Object List.get(int)>
	//   34   70:checkcast       #51  <Class Entry>
	//   35   73:invokevirtual   #55  <Method double calcAngleBetweenLines(Entry, Entry, Entry, Entry)>
	//   36   76:dstore          10
				double d2 = d1;
	//   37   78:dload           6
	//   38   80:dstore          8
				if(d3 > d1)
	//*  39   82:dload           10
	//*  40   84:dload           6
	//*  41   86:dcmpl           
	//*  42   87:ifle            98
				{
					d2 = d3;
	//   43   90:dload           10
	//   44   92:dstore          8
					l = k;
	//   45   94:iload           12
	//   46   96:istore          13
				}
				k++;
	//   47   98:iload           12
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:istore          12
				d1 = d2;
	//   51  104:dload           8
	//   52  106:dstore          6
			}

	//*  53  108:goto            48
			if(d1 > d)
	//*  54  111:dload           6
	//*  55  113:dload_2         
	//*  56  114:dcmpl           
	//*  57  115:ifle            9
			{
				keep[l] = true;
	//   58  118:aload_0         
	//   59  119:getfield        #57  <Field boolean[] keep>
	//   60  122:iload           13
	//   61  124:iconst_1        
	//   62  125:bastore         
				algorithmDouglasPeucker(list, d, i, l);
	//   63  126:aload_0         
	//   64  127:aload_1         
	//   65  128:dload_2         
	//   66  129:iload           4
	//   67  131:iload           13
	//   68  133:invokespecial   #59  <Method void algorithmDouglasPeucker(List, double, int, int)>
				algorithmDouglasPeucker(list, d, l, j);
	//   69  136:aload_0         
	//   70  137:aload_1         
	//   71  138:dload_2         
	//   72  139:iload           13
	//   73  141:iload           5
	//   74  143:invokespecial   #59  <Method void algorithmDouglasPeucker(List, double, int, int)>
				return;
	//   75  146:return          
			}
		}
	}

	private List reduceWithDouglasPeuker(List list, double d)
	{
		if(d > 0.0D && list.size() >= 3) goto _L2; else goto _L1
	//    0    0:dload_2         
	//    1    1:dconst_0        
	//    2    2:dcmpg           
	//    3    3:ifle            16
	//    4    6:aload_1         
	//    5    7:invokeinterface #67  <Method int List.size()>
	//    6   12:iconst_3        
	//    7   13:icmpge          22
_L1:
		Object obj = ((Object) (list));
	//    8   16:aload_1         
	//    9   17:astore          5
_L4:
		return ((List) (obj));
	//   10   19:aload           5
	//   11   21:areturn         
_L2:
		keep[0] = true;
	//   12   22:aload_0         
	//   13   23:getfield        #57  <Field boolean[] keep>
	//   14   26:iconst_0        
	//   15   27:iconst_1        
	//   16   28:bastore         
		keep[list.size() - 1] = true;
	//   17   29:aload_0         
	//   18   30:getfield        #57  <Field boolean[] keep>
	//   19   33:aload_1         
	//   20   34:invokeinterface #67  <Method int List.size()>
	//   21   39:iconst_1        
	//   22   40:isub            
	//   23   41:iconst_1        
	//   24   42:bastore         
		algorithmDouglasPeucker(list, d, 0, list.size() - 1);
	//   25   43:aload_0         
	//   26   44:aload_1         
	//   27   45:dload_2         
	//   28   46:iconst_0        
	//   29   47:aload_1         
	//   30   48:invokeinterface #67  <Method int List.size()>
	//   31   53:iconst_1        
	//   32   54:isub            
	//   33   55:invokespecial   #59  <Method void algorithmDouglasPeucker(List, double, int, int)>
		ArrayList arraylist = new ArrayList();
	//   34   58:new             #69  <Class ArrayList>
	//   35   61:dup             
	//   36   62:invokespecial   #70  <Method void ArrayList()>
	//   37   65:astore          6
		int i = 0;
	//   38   67:iconst_0        
	//   39   68:istore          4
		do
		{
			obj = ((Object) (arraylist));
	//   40   70:aload           6
	//   41   72:astore          5
			if(i >= list.size())
				continue;
	//   42   74:iload           4
	//   43   76:aload_1         
	//   44   77:invokeinterface #67  <Method int List.size()>
	//   45   82:icmpge          19
			if(keep[i])
	//*  46   85:aload_0         
	//*  47   86:getfield        #57  <Field boolean[] keep>
	//*  48   89:iload           4
	//*  49   91:baload          
	//*  50   92:ifeq            133
			{
				Entry entry = (Entry)list.get(i);
	//   51   95:aload_1         
	//   52   96:iload           4
	//   53   98:invokeinterface #49  <Method Object List.get(int)>
	//   54  103:checkcast       #51  <Class Entry>
	//   55  106:astore          5
				((List) (arraylist)).add(((Object) (new Entry(entry.getVal(), entry.getXIndex()))));
	//   56  108:aload           6
	//   57  110:new             #51  <Class Entry>
	//   58  113:dup             
	//   59  114:aload           5
	//   60  116:invokevirtual   #74  <Method float Entry.getVal()>
	//   61  119:aload           5
	//   62  121:invokevirtual   #77  <Method int Entry.getXIndex()>
	//   63  124:invokespecial   #80  <Method void Entry(float, int)>
	//   64  127:invokeinterface #84  <Method boolean List.add(Object)>
	//   65  132:pop             
			}
			i++;
	//   66  133:iload           4
	//   67  135:iconst_1        
	//   68  136:iadd            
	//   69  137:istore          4
		} while(true);
	//   70  139:goto            70
		if(true) goto _L4; else goto _L3
_L3:
	}

	public double calcAngle(Entry entry, Entry entry1)
	{
		float f = entry1.getXIndex() - entry.getXIndex();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #77  <Method int Entry.getXIndex()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #77  <Method int Entry.getXIndex()>
	//    4    8:isub            
	//    5    9:i2f             
	//    6   10:fstore_3        
		return (Math.atan2(entry1.getVal() - entry.getVal(), f) * 180D) / 3.1415926535897931D;
	//    7   11:aload_2         
	//    8   12:invokevirtual   #74  <Method float Entry.getVal()>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #74  <Method float Entry.getVal()>
	//   11   19:fsub            
	//   12   20:f2d             
	//   13   21:fload_3         
	//   14   22:f2d             
	//   15   23:invokestatic    #93  <Method double Math.atan2(double, double)>
	//   16   26:ldc2w           #94  <Double 180D>
	//   17   29:dmul            
	//   18   30:ldc2w           #96  <Double 3.1415926535897931D>
	//   19   33:ddiv            
	//   20   34:dreturn         
	}

	public double calcAngleBetweenLines(Entry entry, Entry entry1, Entry entry2, Entry entry3)
	{
		return Math.abs(calcAngleWithRatios(entry, entry1) - calcAngleWithRatios(entry2, entry3));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #100 <Method double calcAngleWithRatios(Entry, Entry)>
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokevirtual   #100 <Method double calcAngleWithRatios(Entry, Entry)>
	//    8   13:dsub            
	//    9   14:invokestatic    #104 <Method double Math.abs(double)>
	//   10   17:dreturn         
	}

	public double calcAngleWithRatios(Entry entry, Entry entry1)
	{
		float f = entry1.getXIndex();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #77  <Method int Entry.getXIndex()>
	//    2    4:i2f             
	//    3    5:fstore_3        
		float f1 = mDeltaRatio;
	//    4    6:aload_0         
	//    5    7:getfield        #33  <Field float mDeltaRatio>
	//    6   10:fstore          4
		float f2 = entry.getXIndex();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #77  <Method int Entry.getXIndex()>
	//    9   16:i2f             
	//   10   17:fstore          5
		float f3 = mDeltaRatio;
	//   11   19:aload_0         
	//   12   20:getfield        #33  <Field float mDeltaRatio>
	//   13   23:fstore          6
		return (Math.atan2(entry1.getVal() * mScaleRatio - entry.getVal() * mScaleRatio, f * f1 - f2 * f3) * 180D) / 3.1415926535897931D;
	//   14   25:aload_2         
	//   15   26:invokevirtual   #74  <Method float Entry.getVal()>
	//   16   29:aload_0         
	//   17   30:getfield        #31  <Field float mScaleRatio>
	//   18   33:fmul            
	//   19   34:aload_1         
	//   20   35:invokevirtual   #74  <Method float Entry.getVal()>
	//   21   38:aload_0         
	//   22   39:getfield        #31  <Field float mScaleRatio>
	//   23   42:fmul            
	//   24   43:fsub            
	//   25   44:f2d             
	//   26   45:fload_3         
	//   27   46:fload           4
	//   28   48:fmul            
	//   29   49:fload           5
	//   30   51:fload           6
	//   31   53:fmul            
	//   32   54:fsub            
	//   33   55:f2d             
	//   34   56:invokestatic    #93  <Method double Math.atan2(double, double)>
	//   35   59:ldc2w           #94  <Double 180D>
	//   36   62:dmul            
	//   37   63:ldc2w           #96  <Double 3.1415926535897931D>
	//   38   66:ddiv            
	//   39   67:dreturn         
	}

	public double calcPointToLineDistance(Entry entry, Entry entry1, Entry entry2)
	{
		float f = (float)entry1.getXIndex() - (float)entry.getXIndex();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #77  <Method int Entry.getXIndex()>
	//    2    4:i2f             
	//    3    5:aload_1         
	//    4    6:invokevirtual   #77  <Method int Entry.getXIndex()>
	//    5    9:i2f             
	//    6   10:fsub            
	//    7   11:fstore          6
		float f1 = entry2.getXIndex();
	//    8   13:aload_3         
	//    9   14:invokevirtual   #77  <Method int Entry.getXIndex()>
	//   10   17:i2f             
	//   11   18:fstore          7
		float f2 = entry.getXIndex();
	//   12   20:aload_1         
	//   13   21:invokevirtual   #77  <Method int Entry.getXIndex()>
	//   14   24:i2f             
	//   15   25:fstore          8
		double d = Math.sqrt(f * f + (entry1.getVal() - entry.getVal()) * (entry1.getVal() - entry.getVal()));
	//   16   27:fload           6
	//   17   29:fload           6
	//   18   31:fmul            
	//   19   32:aload_2         
	//   20   33:invokevirtual   #74  <Method float Entry.getVal()>
	//   21   36:aload_1         
	//   22   37:invokevirtual   #74  <Method float Entry.getVal()>
	//   23   40:fsub            
	//   24   41:aload_2         
	//   25   42:invokevirtual   #74  <Method float Entry.getVal()>
	//   26   45:aload_1         
	//   27   46:invokevirtual   #74  <Method float Entry.getVal()>
	//   28   49:fsub            
	//   29   50:fmul            
	//   30   51:fadd            
	//   31   52:f2d             
	//   32   53:invokestatic    #109 <Method double Math.sqrt(double)>
	//   33   56:dstore          4
		return (double)Math.abs((entry1.getVal() - entry.getVal()) * (f1 - f2) - (entry2.getVal() - entry.getVal()) * f) / d;
	//   34   58:aload_2         
	//   35   59:invokevirtual   #74  <Method float Entry.getVal()>
	//   36   62:aload_1         
	//   37   63:invokevirtual   #74  <Method float Entry.getVal()>
	//   38   66:fsub            
	//   39   67:fload           7
	//   40   69:fload           8
	//   41   71:fsub            
	//   42   72:fmul            
	//   43   73:aload_3         
	//   44   74:invokevirtual   #74  <Method float Entry.getVal()>
	//   45   77:aload_1         
	//   46   78:invokevirtual   #74  <Method float Entry.getVal()>
	//   47   81:fsub            
	//   48   82:fload           6
	//   49   84:fmul            
	//   50   85:fsub            
	//   51   86:invokestatic    #112 <Method float Math.abs(float)>
	//   52   89:f2d             
	//   53   90:dload           4
	//   54   92:ddiv            
	//   55   93:dreturn         
	}

	public List filter(List list)
	{
		return filter(list, mTolerance);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field double mTolerance>
	//    4    6:invokevirtual   #116 <Method List filter(List, double)>
	//    5    9:areturn         
	}

	public List filter(List list, double d)
	{
		if(d > 0.0D) goto _L2; else goto _L1
	//    0    0:dload_2         
	//    1    1:dconst_0        
	//    2    2:dcmpg           
	//    3    3:ifgt            8
_L1:
		return list;
	//    4    6:aload_1         
	//    5    7:areturn         
_L2:
		keep = new boolean[list.size()];
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:invokeinterface #67  <Method int List.size()>
	//    9   15:newarray        boolean[]
	//   10   17:putfield        #57  <Field boolean[] keep>
		static class _cls1
		{

			static final int $SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType[];

			static 
			{
				$SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType = new int[ApproximatorType.values().length];
			//    0    0:invokestatic    #18  <Method Approximator$ApproximatorType[] Approximator$ApproximatorType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType>
				try
				{
					$SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType[ApproximatorType.DOUGLAS_PEUCKER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType>
			//    5   12:getstatic       #24  <Field Approximator$ApproximatorType Approximator$ApproximatorType.DOUGLAS_PEUCKER>
			//    6   15:invokevirtual   #28  <Method int Approximator$ApproximatorType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType>
			//*  10   23:getstatic       #31  <Field Approximator$ApproximatorType Approximator$ApproximatorType.NONE>
			//*  11   26:invokevirtual   #28  <Method int Approximator$ApproximatorType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
			//*  15   32:astore_0        
			//*  16   33:return          
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   34:astore_0        
				try
				{
					$SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType[ApproximatorType.NONE.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  18   35:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.github.mikephil.charting.data.filter.Approximator.ApproximatorType[mType.ordinal()])
	//*  11   20:getstatic       #121 <Field int[] Approximator$1.$SwitchMap$com$github$mikephil$charting$data$filter$Approximator$ApproximatorType>
	//*  12   23:aload_0         
	//*  13   24:getfield        #27  <Field Approximator$ApproximatorType mType>
	//*  14   27:invokevirtual   #124 <Method int Approximator$ApproximatorType.ordinal()>
	//*  15   30:iaload          
		{
	//*  16   31:tableswitch     1 2: default 52
	//	               1 54
	//	               2 6
		default:
			return list;
	//   17   52:aload_1         
	//   18   53:areturn         

		case 1: // '\001'
			return reduceWithDouglasPeuker(list, d);
	//   19   54:aload_0         
	//   20   55:aload_1         
	//   21   56:dload_2         
	//   22   57:invokespecial   #126 <Method List reduceWithDouglasPeuker(List, double)>
	//   23   60:areturn         

		case 2: // '\002'
			break;
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	public void setRatios(float f, float f1)
	{
		mDeltaRatio = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #33  <Field float mDeltaRatio>
		mScaleRatio = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #31  <Field float mScaleRatio>
	//    6   10:return          
	}

	public void setTolerance(double d)
	{
		mTolerance = d;
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:putfield        #29  <Field double mTolerance>
	//    3    5:return          
	}

	public void setType(ApproximatorType approximatortype)
	{
		mType = approximatortype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field Approximator$ApproximatorType mType>
	//    3    5:return          
	}

	public void setup(ApproximatorType approximatortype, double d)
	{
		mType = approximatortype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field Approximator$ApproximatorType mType>
		mTolerance = d;
	//    3    5:aload_0         
	//    4    6:dload_2         
	//    5    7:putfield        #29  <Field double mTolerance>
	//    6   10:return          
	}

	private boolean keep[];
	private float mDeltaRatio;
	private float mScaleRatio;
	private double mTolerance;
	private ApproximatorType mType;
}
