// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserModel

public static final class ActivityChooserModel$HistoricalRecord
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
	//*  10   14:invokevirtual   #40  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #40  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((ActivityChooserModel$HistoricalRecord)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class ActivityChooserModel$HistoricalRecord>
	//   18   30:astore_1        
		if(activity == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #20  <Field ComponentName activity>
	//*  21   35:ifnonnull       47
		{
			if(((ActivityChooserModel$HistoricalRecord) (obj)).activity != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #20  <Field ComponentName activity>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!activity.equals(((Object) (((ActivityChooserModel$HistoricalRecord) (obj)).activity))))
	//*  27   47:aload_0         
	//*  28   48:getfield        #20  <Field ComponentName activity>
	//*  29   51:aload_1         
	//*  30   52:getfield        #20  <Field ComponentName activity>
	//*  31   55:invokevirtual   #42  <Method boolean ComponentName.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(time != ((ActivityChooserModel$HistoricalRecord) (obj)).time)
	//*  35   63:aload_0         
	//*  36   64:getfield        #22  <Field long time>
	//*  37   67:aload_1         
	//*  38   68:getfield        #22  <Field long time>
	//*  39   71:lcmp            
	//*  40   72:ifeq            77
			return false;
	//   41   75:iconst_0        
	//   42   76:ireturn         
		return Float.floatToIntBits(weight) == Float.floatToIntBits(((ActivityChooserModel$HistoricalRecord) (obj)).weight);
	//   43   77:aload_0         
	//   44   78:getfield        #24  <Field float weight>
	//   45   81:invokestatic    #48  <Method int Float.floatToIntBits(float)>
	//   46   84:aload_1         
	//   47   85:getfield        #24  <Field float weight>
	//   48   88:invokestatic    #48  <Method int Float.floatToIntBits(float)>
	//   49   91:icmpeq          96
	//   50   94:iconst_0        
	//   51   95:ireturn         
	//   52   96:iconst_1        
	//   53   97:ireturn         
	}

	public int hashCode()
	{
		int i;
		if(activity == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ComponentName activity>
	//*   2    4:ifnonnull       12
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:goto            20
			i = activity.hashCode();
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field ComponentName activity>
	//    8   16:invokevirtual   #52  <Method int ComponentName.hashCode()>
	//    9   19:istore_1        
		return 31 * ((i + 31) * 31 + (int)(time ^ time >>> 32)) + Float.floatToIntBits(weight);
	//   10   20:bipush          31
	//   11   22:iload_1         
	//   12   23:bipush          31
	//   13   25:iadd            
	//   14   26:bipush          31
	//   15   28:imul            
	//   16   29:aload_0         
	//   17   30:getfield        #22  <Field long time>
	//   18   33:aload_0         
	//   19   34:getfield        #22  <Field long time>
	//   20   37:bipush          32
	//   21   39:lushr           
	//   22   40:lxor            
	//   23   41:l2i             
	//   24   42:iadd            
	//   25   43:imul            
	//   26   44:aload_0         
	//   27   45:getfield        #24  <Field float weight>
	//   28   48:invokestatic    #48  <Method int Float.floatToIntBits(float)>
	//   29   51:iadd            
	//   30   52:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #56  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("[");
	//    4    8:aload_1         
	//    5    9:ldc1            #59  <String "[">
	//    6   11:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("; activity:");
	//    8   15:aload_1         
	//    9   16:ldc1            #65  <String "; activity:">
	//   10   18:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(((Object) (activity)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #20  <Field ComponentName activity>
	//   15   27:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
		stringbuilder.append("; time:");
	//   17   31:aload_1         
	//   18   32:ldc1            #70  <String "; time:">
	//   19   34:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(time);
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #22  <Field long time>
	//   24   43:invokevirtual   #73  <Method StringBuilder StringBuilder.append(long)>
	//   25   46:pop             
		stringbuilder.append("; weight:");
	//   26   47:aload_1         
	//   27   48:ldc1            #75  <String "; weight:">
	//   28   50:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		stringbuilder.append(((Object) (new BigDecimal(weight))));
	//   30   54:aload_1         
	//   31   55:new             #77  <Class BigDecimal>
	//   32   58:dup             
	//   33   59:aload_0         
	//   34   60:getfield        #24  <Field float weight>
	//   35   63:f2d             
	//   36   64:invokespecial   #80  <Method void BigDecimal(double)>
	//   37   67:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   38   70:pop             
		stringbuilder.append("]");
	//   39   71:aload_1         
	//   40   72:ldc1            #82  <String "]">
	//   41   74:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   42   77:pop             
		return stringbuilder.toString();
	//   43   78:aload_1         
	//   44   79:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   45   82:areturn         
	}

	public final ComponentName activity;
	public final long time;
	public final float weight;

	public ActivityChooserModel$HistoricalRecord(ComponentName componentname, long l, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		activity = componentname;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ComponentName activity>
		time = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #22  <Field long time>
		weight = f;
	//    8   14:aload_0         
	//    9   15:fload           4
	//   10   17:putfield        #24  <Field float weight>
	//   11   20:return          
	}

	public ActivityChooserModel$HistoricalRecord(String s, long l, float f)
	{
		this(ComponentName.unflattenFromString(s), l, f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method ComponentName ComponentName.unflattenFromString(String)>
	//    3    5:lload_2         
	//    4    6:fload           4
	//    5    8:invokespecial   #34  <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
	//    6   11:return          
	}
}
