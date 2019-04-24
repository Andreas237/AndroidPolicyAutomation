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
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
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
			if(Float.floatToIntBits(weight) != Float.floatToIntBits(((ActivityChooserModel$HistoricalRecord) (obj)).weight))
	//*  43   77:aload_0         
	//*  44   78:getfield        #24  <Field float weight>
	//*  45   81:invokestatic    #48  <Method int Float.floatToIntBits(float)>
	//*  46   84:aload_1         
	//*  47   85:getfield        #24  <Field float weight>
	//*  48   88:invokestatic    #48  <Method int Float.floatToIntBits(float)>
	//*  49   91:icmpeq          5
				return false;
	//   50   94:iconst_0        
	//   51   95:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		int i;
		if(activity == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field ComponentName activity>
	//*   2    4:ifnonnull       42
			i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
		else
	//*   5    9:iload_1         
	//*   6   10:bipush          31
	//*   7   12:iadd            
	//*   8   13:bipush          31
	//*   9   15:imul            
	//*  10   16:aload_0         
	//*  11   17:getfield        #22  <Field long time>
	//*  12   20:aload_0         
	//*  13   21:getfield        #22  <Field long time>
	//*  14   24:bipush          32
	//*  15   26:lushr           
	//*  16   27:lxor            
	//*  17   28:l2i             
	//*  18   29:iadd            
	//*  19   30:bipush          31
	//*  20   32:imul            
	//*  21   33:aload_0         
	//*  22   34:getfield        #24  <Field float weight>
	//*  23   37:invokestatic    #48  <Method int Float.floatToIntBits(float)>
	//*  24   40:iadd            
	//*  25   41:ireturn         
			i = activity.hashCode();
	//   26   42:aload_0         
	//   27   43:getfield        #20  <Field ComponentName activity>
	//   28   46:invokevirtual   #52  <Method int ComponentName.hashCode()>
	//   29   49:istore_1        
		return ((i + 31) * 31 + (int)(time ^ time >>> 32)) * 31 + Float.floatToIntBits(weight);
	//*  30   50:goto            9
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
		stringbuilder.append("; activity:").append(((Object) (activity)));
	//    8   15:aload_1         
	//    9   16:ldc1            #65  <String "; activity:">
	//   10   18:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:aload_0         
	//   12   22:getfield        #20  <Field ComponentName activity>
	//   13   25:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
		stringbuilder.append("; time:").append(time);
	//   15   29:aload_1         
	//   16   30:ldc1            #70  <String "; time:">
	//   17   32:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:aload_0         
	//   19   36:getfield        #22  <Field long time>
	//   20   39:invokevirtual   #73  <Method StringBuilder StringBuilder.append(long)>
	//   21   42:pop             
		stringbuilder.append("; weight:").append(((Object) (new BigDecimal(weight))));
	//   22   43:aload_1         
	//   23   44:ldc1            #75  <String "; weight:">
	//   24   46:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:new             #77  <Class BigDecimal>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:getfield        #24  <Field float weight>
	//   29   57:f2d             
	//   30   58:invokespecial   #80  <Method void BigDecimal(double)>
	//   31   61:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
	//   32   64:pop             
		stringbuilder.append("]");
	//   33   65:aload_1         
	//   34   66:ldc1            #82  <String "]">
	//   35   68:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
		return stringbuilder.toString();
	//   37   72:aload_1         
	//   38   73:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   39   76:areturn         
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
