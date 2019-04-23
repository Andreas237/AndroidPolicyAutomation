// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class ActivityChooserModel$HistoricalRecord
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
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #37  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #37  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ActivityChooserModel$HistoricalRecord)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ActivityChooserModel$HistoricalRecord>
	//   18   30:astore_1        
		ComponentName componentname = activity;
	//   19   31:aload_0         
	//   20   32:getfield        #17  <Field ComponentName activity>
	//   21   35:astore_2        
		if(componentname == null)
	//*  22   36:aload_2         
	//*  23   37:ifnonnull       49
		{
			if(((ActivityChooserModel$HistoricalRecord) (obj)).activity != null)
	//*  24   40:aload_1         
	//*  25   41:getfield        #17  <Field ComponentName activity>
	//*  26   44:ifnull          62
				return false;
	//   27   47:iconst_0        
	//   28   48:ireturn         
		} else
		if(!componentname.equals(((Object) (((ActivityChooserModel$HistoricalRecord) (obj)).activity))))
	//*  29   49:aload_2         
	//*  30   50:aload_1         
	//*  31   51:getfield        #17  <Field ComponentName activity>
	//*  32   54:invokevirtual   #39  <Method boolean ComponentName.equals(Object)>
	//*  33   57:ifne            62
			return false;
	//   34   60:iconst_0        
	//   35   61:ireturn         
		if(time != ((ActivityChooserModel$HistoricalRecord) (obj)).time)
	//*  36   62:aload_0         
	//*  37   63:getfield        #19  <Field long time>
	//*  38   66:aload_1         
	//*  39   67:getfield        #19  <Field long time>
	//*  40   70:lcmp            
	//*  41   71:ifeq            76
			return false;
	//   42   74:iconst_0        
	//   43   75:ireturn         
		return Float.floatToIntBits(weight) == Float.floatToIntBits(((ActivityChooserModel$HistoricalRecord) (obj)).weight);
	//   44   76:aload_0         
	//   45   77:getfield        #21  <Field float weight>
	//   46   80:invokestatic    #45  <Method int Float.floatToIntBits(float)>
	//   47   83:aload_1         
	//   48   84:getfield        #21  <Field float weight>
	//   49   87:invokestatic    #45  <Method int Float.floatToIntBits(float)>
	//   50   90:icmpeq          95
	//   51   93:iconst_0        
	//   52   94:ireturn         
	//   53   95:iconst_1        
	//   54   96:ireturn         
	}

	public int hashCode()
	{
		ComponentName componentname = activity;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ComponentName activity>
	//    2    4:astore          4
		int i;
		if(componentname == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       16
			i = 0;
	//    5   11:iconst_0        
	//    6   12:istore_1        
		else
	//*   7   13:goto            22
			i = componentname.hashCode();
	//    8   16:aload           4
	//    9   18:invokevirtual   #49  <Method int ComponentName.hashCode()>
	//   10   21:istore_1        
		long l = time;
	//   11   22:aload_0         
	//   12   23:getfield        #19  <Field long time>
	//   13   26:lstore_2        
		return ((i + 31) * 31 + (int)(l ^ l >>> 32)) * 31 + Float.floatToIntBits(weight);
	//   14   27:iload_1         
	//   15   28:bipush          31
	//   16   30:iadd            
	//   17   31:bipush          31
	//   18   33:imul            
	//   19   34:lload_2         
	//   20   35:lload_2         
	//   21   36:bipush          32
	//   22   38:lushr           
	//   23   39:lxor            
	//   24   40:l2i             
	//   25   41:iadd            
	//   26   42:bipush          31
	//   27   44:imul            
	//   28   45:aload_0         
	//   29   46:getfield        #21  <Field float weight>
	//   30   49:invokestatic    #45  <Method int Float.floatToIntBits(float)>
	//   31   52:iadd            
	//   32   53:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[");
	//    4    8:aload_1         
	//    5    9:ldc1            #56  <String "[">
	//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("; activity:");
	//    8   15:aload_1         
	//    9   16:ldc1            #62  <String "; activity:">
	//   10   18:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(((Object) (activity)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #17  <Field ComponentName activity>
	//   15   27:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
		stringbuilder.append("; time:");
	//   17   31:aload_1         
	//   18   32:ldc1            #67  <String "; time:">
	//   19   34:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(time);
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #19  <Field long time>
	//   24   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(long)>
	//   25   46:pop             
		stringbuilder.append("; weight:");
	//   26   47:aload_1         
	//   27   48:ldc1            #72  <String "; weight:">
	//   28   50:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(((Object) (new BigDecimal(weight))));
	//   30   54:aload_1         
	//   31   55:new             #74  <Class BigDecimal>
	//   32   58:dup             
	//   33   59:aload_0         
	//   34   60:getfield        #21  <Field float weight>
	//   35   63:f2d             
	//   36   64:invokespecial   #77  <Method void BigDecimal(double)>
	//   37   67:invokevirtual   #65  <Method StringBuilder StringBuilder.append(Object)>
	//   38   70:pop             
		stringbuilder.append("]");
	//   39   71:aload_1         
	//   40   72:ldc1            #79  <String "]">
	//   41   74:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   42   77:pop             
		return stringbuilder.toString();
	//   43   78:aload_1         
	//   44   79:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   45   82:areturn         
	}

	public final ComponentName activity;
	public final long time;
	public final float weight;

	public ActivityChooserModel$HistoricalRecord(ComponentName componentname, long l, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		activity = componentname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ComponentName activity>
		time = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #19  <Field long time>
		weight = f;
	//    8   14:aload_0         
	//    9   15:fload           4
	//   10   17:putfield        #21  <Field float weight>
	//   11   20:return          
	}

	public ActivityChooserModel$HistoricalRecord(String s, long l, float f)
	{
		this(ComponentName.unflattenFromString(s), l, f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method ComponentName ComponentName.unflattenFromString(String)>
	//    3    5:lload_2         
	//    4    6:fload           4
	//    5    8:invokespecial   #31  <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
	//    6   11:return          
	}
}
