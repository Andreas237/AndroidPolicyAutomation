// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore;


// Referenced classes of package com.autonavi.amap.mapcore:
//			FPoint

public class FPointBounds
{
	public static final class Builder
	{

		private boolean containsx(double d)
		{
			if(mWest <= mEast)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field float mWest>
		//*   2    4:aload_0         
		//*   3    5:getfield        #26  <Field float mEast>
		//*   4    8:fcmpg           
		//*   5    9:ifgt            36
				return (double)mWest <= d && d <= (double)mEast;
		//    6   12:aload_0         
		//    7   13:getfield        #24  <Field float mWest>
		//    8   16:f2d             
		//    9   17:dload_1         
		//   10   18:dcmpg           
		//   11   19:ifgt            34
		//   12   22:dload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #26  <Field float mEast>
		//   15   27:f2d             
		//   16   28:dcmpg           
		//   17   29:ifgt            34
		//   18   32:iconst_1        
		//   19   33:ireturn         
		//   20   34:iconst_0        
		//   21   35:ireturn         
			return (double)mWest <= d || d <= (double)mEast;
		//   22   36:aload_0         
		//   23   37:getfield        #24  <Field float mWest>
		//   24   40:f2d             
		//   25   41:dload_1         
		//   26   42:dcmpg           
		//   27   43:ifle            56
		//   28   46:dload_1         
		//   29   47:aload_0         
		//   30   48:getfield        #26  <Field float mEast>
		//   31   51:f2d             
		//   32   52:dcmpg           
		//   33   53:ifgt            58
		//   34   56:iconst_1        
		//   35   57:ireturn         
		//   36   58:iconst_0        
		//   37   59:ireturn         
		}

		public FPointBounds build()
		{
			return new FPointBounds(FPoint.obtain(mWest, mSouth), FPoint.obtain(mEast, mNorth));
		//    0    0:new             #6   <Class FPointBounds>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field float mWest>
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field float mSouth>
		//    6   12:invokestatic    #37  <Method FPoint FPoint.obtain(float, float)>
		//    7   15:aload_0         
		//    8   16:getfield        #26  <Field float mEast>
		//    9   19:aload_0         
		//   10   20:getfield        #22  <Field float mNorth>
		//   11   23:invokestatic    #37  <Method FPoint FPoint.obtain(float, float)>
		//   12   26:invokespecial   #40  <Method void FPointBounds(FPoint, FPoint)>
		//   13   29:areturn         
		}

		public Builder include(FPoint fpoint)
		{
			mSouth = Math.min(mSouth, fpoint.y);
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #19  <Field float mSouth>
		//    3    5:aload_1         
		//    4    6:getfield        #45  <Field float FPoint.y>
		//    5    9:invokestatic    #51  <Method float Math.min(float, float)>
		//    6   12:putfield        #19  <Field float mSouth>
			mNorth = Math.max(mNorth, fpoint.y);
		//    7   15:aload_0         
		//    8   16:aload_0         
		//    9   17:getfield        #22  <Field float mNorth>
		//   10   20:aload_1         
		//   11   21:getfield        #45  <Field float FPoint.y>
		//   12   24:invokestatic    #54  <Method float Math.max(float, float)>
		//   13   27:putfield        #22  <Field float mNorth>
			mWest = Math.min(mWest, fpoint.x);
		//   14   30:aload_0         
		//   15   31:aload_0         
		//   16   32:getfield        #24  <Field float mWest>
		//   17   35:aload_1         
		//   18   36:getfield        #57  <Field float FPoint.x>
		//   19   39:invokestatic    #51  <Method float Math.min(float, float)>
		//   20   42:putfield        #24  <Field float mWest>
			mEast = Math.max(mEast, fpoint.x);
		//   21   45:aload_0         
		//   22   46:aload_0         
		//   23   47:getfield        #26  <Field float mEast>
		//   24   50:aload_1         
		//   25   51:getfield        #57  <Field float FPoint.x>
		//   26   54:invokestatic    #54  <Method float Math.max(float, float)>
		//   27   57:putfield        #26  <Field float mEast>
			return this;
		//   28   60:aload_0         
		//   29   61:areturn         
		}

		private float mEast;
		private float mNorth;
		private float mSouth;
		private float mWest;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			mSouth = (1.0F / 0.0F);
		//    2    4:aload_0         
		//    3    5:ldc1            #17  <Float (1.0F / 0.0F)>
		//    4    7:putfield        #19  <Field float mSouth>
			mNorth = (-1.0F / 0.0F);
		//    5   10:aload_0         
		//    6   11:ldc1            #20  <Float (-1.0F / 0.0F)>
		//    7   13:putfield        #22  <Field float mNorth>
			mWest = (1.0F / 0.0F);
		//    8   16:aload_0         
		//    9   17:ldc1            #17  <Float (1.0F / 0.0F)>
		//   10   19:putfield        #24  <Field float mWest>
			mEast = (-1.0F / 0.0F);
		//   11   22:aload_0         
		//   12   23:ldc1            #20  <Float (-1.0F / 0.0F)>
		//   13   25:putfield        #26  <Field float mEast>
		//   14   28:return          
		}
	}


	FPointBounds(int i, FPoint fpoint, FPoint fpoint1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mVersionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #19  <Field int mVersionCode>
		southwest = fpoint;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field FPoint southwest>
		northeast = fpoint1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field FPoint northeast>
	//   11   19:return          
	}

	public FPointBounds(FPoint fpoint, FPoint fpoint1)
	{
		this(1, fpoint, fpoint1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #27  <Method void FPointBounds(int, FPoint, FPoint)>
	//    5    7:return          
	}

	public static Builder builder()
	{
		return new Builder();
	//    0    0:new             #6   <Class FPointBounds$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void FPointBounds$Builder()>
	//    3    7:areturn         
	}

	private boolean containsx(double d)
	{
		if(southwest.x <= northeast.x)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field FPoint southwest>
	//*   2    4:getfield        #38  <Field float FPoint.x>
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field FPoint northeast>
	//*   5   11:getfield        #38  <Field float FPoint.x>
	//*   6   14:fcmpg           
	//*   7   15:ifgt            48
			return (double)southwest.x <= d && d <= (double)northeast.x;
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field FPoint southwest>
	//   10   22:getfield        #38  <Field float FPoint.x>
	//   11   25:f2d             
	//   12   26:dload_1         
	//   13   27:dcmpg           
	//   14   28:ifgt            46
	//   15   31:dload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #23  <Field FPoint northeast>
	//   18   36:getfield        #38  <Field float FPoint.x>
	//   19   39:f2d             
	//   20   40:dcmpg           
	//   21   41:ifgt            46
	//   22   44:iconst_1        
	//   23   45:ireturn         
	//   24   46:iconst_0        
	//   25   47:ireturn         
		return (double)southwest.x <= d || d <= (double)northeast.x;
	//   26   48:aload_0         
	//   27   49:getfield        #21  <Field FPoint southwest>
	//   28   52:getfield        #38  <Field float FPoint.x>
	//   29   55:f2d             
	//   30   56:dload_1         
	//   31   57:dcmpg           
	//   32   58:ifle            74
	//   33   61:dload_1         
	//   34   62:aload_0         
	//   35   63:getfield        #23  <Field FPoint northeast>
	//   36   66:getfield        #38  <Field float FPoint.x>
	//   37   69:f2d             
	//   38   70:dcmpg           
	//   39   71:ifgt            76
	//   40   74:iconst_1        
	//   41   75:ireturn         
	//   42   76:iconst_0        
	//   43   77:ireturn         
	}

	private boolean containsy(double d)
	{
		return (double)southwest.y <= d && d <= (double)northeast.y;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field FPoint southwest>
	//    2    4:getfield        #42  <Field float FPoint.y>
	//    3    7:f2d             
	//    4    8:dload_1         
	//    5    9:dcmpg           
	//    6   10:ifgt            28
	//    7   13:dload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field FPoint northeast>
	//   10   18:getfield        #42  <Field float FPoint.y>
	//   11   21:f2d             
	//   12   22:dcmpg           
	//   13   23:ifgt            28
	//   14   26:iconst_1        
	//   15   27:ireturn         
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	private boolean intersect(FPointBounds fpointbounds)
	{
		if(fpointbounds == null || fpointbounds.northeast == null || fpointbounds.southwest == null || northeast == null || southwest == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          32
	//*   2    4:aload_1         
	//*   3    5:getfield        #23  <Field FPoint northeast>
	//*   4    8:ifnull          32
	//*   5   11:aload_1         
	//*   6   12:getfield        #21  <Field FPoint southwest>
	//*   7   15:ifnull          32
	//*   8   18:aload_0         
	//*   9   19:getfield        #23  <Field FPoint northeast>
	//*  10   22:ifnull          32
	//*  11   25:aload_0         
	//*  12   26:getfield        #21  <Field FPoint southwest>
	//*  13   29:ifnonnull       34
			return false;
	//   14   32:iconst_0        
	//   15   33:ireturn         
		double d = (fpointbounds.northeast.x + fpointbounds.southwest.x) - northeast.x - southwest.x;
	//   16   34:aload_1         
	//   17   35:getfield        #23  <Field FPoint northeast>
	//   18   38:getfield        #38  <Field float FPoint.x>
	//   19   41:aload_1         
	//   20   42:getfield        #21  <Field FPoint southwest>
	//   21   45:getfield        #38  <Field float FPoint.x>
	//   22   48:fadd            
	//   23   49:aload_0         
	//   24   50:getfield        #23  <Field FPoint northeast>
	//   25   53:getfield        #38  <Field float FPoint.x>
	//   26   56:fsub            
	//   27   57:aload_0         
	//   28   58:getfield        #21  <Field FPoint southwest>
	//   29   61:getfield        #38  <Field float FPoint.x>
	//   30   64:fsub            
	//   31   65:f2d             
	//   32   66:dstore_2        
		double d1 = ((northeast.x - southwest.x) + fpointbounds.northeast.x) - southwest.x;
	//   33   67:aload_0         
	//   34   68:getfield        #23  <Field FPoint northeast>
	//   35   71:getfield        #38  <Field float FPoint.x>
	//   36   74:aload_0         
	//   37   75:getfield        #21  <Field FPoint southwest>
	//   38   78:getfield        #38  <Field float FPoint.x>
	//   39   81:fsub            
	//   40   82:aload_1         
	//   41   83:getfield        #23  <Field FPoint northeast>
	//   42   86:getfield        #38  <Field float FPoint.x>
	//   43   89:fadd            
	//   44   90:aload_0         
	//   45   91:getfield        #21  <Field FPoint southwest>
	//   46   94:getfield        #38  <Field float FPoint.x>
	//   47   97:fsub            
	//   48   98:f2d             
	//   49   99:dstore          4
		double d2 = (fpointbounds.northeast.y + fpointbounds.southwest.y) - northeast.y - southwest.y;
	//   50  101:aload_1         
	//   51  102:getfield        #23  <Field FPoint northeast>
	//   52  105:getfield        #42  <Field float FPoint.y>
	//   53  108:aload_1         
	//   54  109:getfield        #21  <Field FPoint southwest>
	//   55  112:getfield        #42  <Field float FPoint.y>
	//   56  115:fadd            
	//   57  116:aload_0         
	//   58  117:getfield        #23  <Field FPoint northeast>
	//   59  120:getfield        #42  <Field float FPoint.y>
	//   60  123:fsub            
	//   61  124:aload_0         
	//   62  125:getfield        #21  <Field FPoint southwest>
	//   63  128:getfield        #42  <Field float FPoint.y>
	//   64  131:fsub            
	//   65  132:f2d             
	//   66  133:dstore          6
		double d3 = ((northeast.y - southwest.y) + fpointbounds.northeast.y) - fpointbounds.southwest.y;
	//   67  135:aload_0         
	//   68  136:getfield        #23  <Field FPoint northeast>
	//   69  139:getfield        #42  <Field float FPoint.y>
	//   70  142:aload_0         
	//   71  143:getfield        #21  <Field FPoint southwest>
	//   72  146:getfield        #42  <Field float FPoint.y>
	//   73  149:fsub            
	//   74  150:aload_1         
	//   75  151:getfield        #23  <Field FPoint northeast>
	//   76  154:getfield        #42  <Field float FPoint.y>
	//   77  157:fadd            
	//   78  158:aload_1         
	//   79  159:getfield        #21  <Field FPoint southwest>
	//   80  162:getfield        #42  <Field float FPoint.y>
	//   81  165:fsub            
	//   82  166:f2d             
	//   83  167:dstore          8
		return Math.abs(d) < d1 && Math.abs(d2) < d3;
	//   84  169:dload_2         
	//   85  170:invokestatic    #50  <Method double Math.abs(double)>
	//   86  173:dload           4
	//   87  175:dcmpg           
	//   88  176:ifge            192
	//   89  179:dload           6
	//   90  181:invokestatic    #50  <Method double Math.abs(double)>
	//   91  184:dload           8
	//   92  186:dcmpg           
	//   93  187:ifge            192
	//   94  190:iconst_1        
	//   95  191:ireturn         
	//   96  192:iconst_0        
	//   97  193:ireturn         
	}

	public boolean contains(FPoint fpoint)
	{
		return containsy(fpoint.y) && containsx(fpoint.x);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #42  <Field float FPoint.y>
	//    3    5:f2d             
	//    4    6:invokespecial   #54  <Method boolean containsy(double)>
	//    5    9:ifeq            26
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #38  <Field float FPoint.x>
	//    9   17:f2d             
	//   10   18:invokespecial   #56  <Method boolean containsx(double)>
	//   11   21:ifeq            26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public boolean contains(FPointBounds fpointbounds)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(fpointbounds == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		boolean flag = flag1;
	//    6    8:iload_3         
	//    7    9:istore_2        
		if(contains(fpointbounds.southwest))
	//*   8   10:aload_0         
	//*   9   11:aload_1         
	//*  10   12:getfield        #21  <Field FPoint southwest>
	//*  11   15:invokevirtual   #58  <Method boolean contains(FPoint)>
	//*  12   18:ifeq            36
		{
			flag = flag1;
	//   13   21:iload_3         
	//   14   22:istore_2        
			if(contains(fpointbounds.northeast))
	//*  15   23:aload_0         
	//*  16   24:aload_1         
	//*  17   25:getfield        #23  <Field FPoint northeast>
	//*  18   28:invokevirtual   #58  <Method boolean contains(FPoint)>
	//*  19   31:ifeq            36
				flag = true;
	//   20   34:iconst_1        
	//   21   35:istore_2        
		}
		return flag;
	//   22   36:iload_2         
	//   23   37:ireturn         
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
		if(!(obj instanceof FPointBounds))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class FPointBounds>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((FPointBounds)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class FPointBounds>
	//   12   20:astore_1        
		return southwest.equals(((Object) (((FPointBounds) (obj)).southwest))) && northeast.equals(((Object) (((FPointBounds) (obj)).northeast)));
	//   13   21:aload_0         
	//   14   22:getfield        #21  <Field FPoint southwest>
	//   15   25:aload_1         
	//   16   26:getfield        #21  <Field FPoint southwest>
	//   17   29:invokevirtual   #62  <Method boolean FPoint.equals(Object)>
	//   18   32:ifeq            51
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field FPoint northeast>
	//   21   39:aload_1         
	//   22   40:getfield        #23  <Field FPoint northeast>
	//   23   43:invokevirtual   #62  <Method boolean FPoint.equals(Object)>
	//   24   46:ifeq            51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
	}

	int getVersionCode()
	{
		return mVersionCode;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int mVersionCode>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method int Object.hashCode()>
	//    2    4:ireturn         
	}

	public boolean intersects(FPointBounds fpointbounds)
	{
		if(fpointbounds == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		return intersect(fpointbounds) || fpointbounds.intersect(this);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #70  <Method boolean intersect(FPointBounds)>
	//    7   11:ifne            22
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokespecial   #70  <Method boolean intersect(FPointBounds)>
	//   11   19:ifeq            24
	//   12   22:iconst_1        
	//   13   23:ireturn         
	//   14   24:iconst_0        
	//   15   25:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #74  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("southwest = (");
	//    4    8:aload_1         
	//    5    9:ldc1            #77  <String "southwest = (">
	//    6   11:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(southwest.x);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field FPoint southwest>
	//   11   20:getfield        #38  <Field float FPoint.x>
	//   12   23:invokevirtual   #84  <Method StringBuilder StringBuilder.append(float)>
	//   13   26:pop             
		stringbuilder.append(",");
	//   14   27:aload_1         
	//   15   28:ldc1            #86  <String ",">
	//   16   30:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(southwest.y);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #21  <Field FPoint southwest>
	//   21   39:getfield        #42  <Field float FPoint.y>
	//   22   42:invokevirtual   #84  <Method StringBuilder StringBuilder.append(float)>
	//   23   45:pop             
		stringbuilder.append(") northeast = (");
	//   24   46:aload_1         
	//   25   47:ldc1            #88  <String ") northeast = (">
	//   26   49:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		stringbuilder.append(northeast.x);
	//   28   53:aload_1         
	//   29   54:aload_0         
	//   30   55:getfield        #23  <Field FPoint northeast>
	//   31   58:getfield        #38  <Field float FPoint.x>
	//   32   61:invokevirtual   #84  <Method StringBuilder StringBuilder.append(float)>
	//   33   64:pop             
		stringbuilder.append(",");
	//   34   65:aload_1         
	//   35   66:ldc1            #86  <String ",">
	//   36   68:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append(northeast.y);
	//   38   72:aload_1         
	//   39   73:aload_0         
	//   40   74:getfield        #23  <Field FPoint northeast>
	//   41   77:getfield        #42  <Field float FPoint.y>
	//   42   80:invokevirtual   #84  <Method StringBuilder StringBuilder.append(float)>
	//   43   83:pop             
		stringbuilder.append(")");
	//   44   84:aload_1         
	//   45   85:ldc1            #90  <String ")">
	//   46   87:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
		return stringbuilder.toString();
	//   48   91:aload_1         
	//   49   92:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   50   95:areturn         
	}

	private final int mVersionCode;
	public final FPoint northeast;
	public final FPoint southwest;
}
