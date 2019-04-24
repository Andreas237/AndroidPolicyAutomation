// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.*;
import android.content.pm.*;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import org.xmlpull.v1.*;

class ActivityChooserModel extends DataSetObservable
{
	public static interface ActivityChooserModelClient
	{

		public abstract void setActivityChooserModel(ActivityChooserModel activitychoosermodel);
	}

	public final class ActivityResolveInfo
		implements Comparable
	{

		public int compareTo(ActivityResolveInfo activityresolveinfo)
		{
			return Float.floatToIntBits(activityresolveinfo.weight) - Float.floatToIntBits(weight);
		//    0    0:aload_1         
		//    1    1:getfield        #30  <Field float weight>
		//    2    4:invokestatic    #36  <Method int Float.floatToIntBits(float)>
		//    3    7:aload_0         
		//    4    8:getfield        #30  <Field float weight>
		//    5   11:invokestatic    #36  <Method int Float.floatToIntBits(float)>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((ActivityResolveInfo)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
		//    3    5:invokevirtual   #39  <Method int compareTo(ActivityChooserModel$ActivityResolveInfo)>
		//    4    8:ireturn         
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
			if(obj == null)
		//*   5    7:aload_1         
		//*   6    8:ifnonnull       13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			if(((Object)this).getClass() != obj.getClass())
		//*   9   13:aload_0         
		//*  10   14:invokevirtual   #45  <Method Class Object.getClass()>
		//*  11   17:aload_1         
		//*  12   18:invokevirtual   #45  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
				return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
			obj = ((Object) ((ActivityResolveInfo)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
		//   18   30:astore_1        
			return Float.floatToIntBits(weight) == Float.floatToIntBits(((ActivityResolveInfo) (obj)).weight);
		//   19   31:aload_0         
		//   20   32:getfield        #30  <Field float weight>
		//   21   35:invokestatic    #36  <Method int Float.floatToIntBits(float)>
		//   22   38:aload_1         
		//   23   39:getfield        #30  <Field float weight>
		//   24   42:invokestatic    #36  <Method int Float.floatToIntBits(float)>
		//   25   45:icmpeq          50
		//   26   48:iconst_0        
		//   27   49:ireturn         
		//   28   50:iconst_1        
		//   29   51:ireturn         
		}

		public int hashCode()
		{
			return Float.floatToIntBits(weight) + 31;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field float weight>
		//    2    4:invokestatic    #36  <Method int Float.floatToIntBits(float)>
		//    3    7:bipush          31
		//    4    9:iadd            
		//    5   10:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #51  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #52  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("[");
		//    4    8:aload_1         
		//    5    9:ldc1            #54  <String "[">
		//    6   11:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append("resolveInfo:").append(resolveInfo.toString());
		//    8   15:aload_1         
		//    9   16:ldc1            #60  <String "resolveInfo:">
		//   10   18:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   11   21:aload_0         
		//   12   22:getfield        #25  <Field ResolveInfo resolveInfo>
		//   13   25:invokevirtual   #64  <Method String ResolveInfo.toString()>
		//   14   28:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   15   31:pop             
			stringbuilder.append("; weight:").append(((Object) (new BigDecimal(weight))));
		//   16   32:aload_1         
		//   17   33:ldc1            #66  <String "; weight:">
		//   18   35:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   19   38:new             #68  <Class BigDecimal>
		//   20   41:dup             
		//   21   42:aload_0         
		//   22   43:getfield        #30  <Field float weight>
		//   23   46:f2d             
		//   24   47:invokespecial   #71  <Method void BigDecimal(double)>
		//   25   50:invokevirtual   #74  <Method StringBuilder StringBuilder.append(Object)>
		//   26   53:pop             
			stringbuilder.append("]");
		//   27   54:aload_1         
		//   28   55:ldc1            #76  <String "]">
		//   29   57:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   30   60:pop             
			return stringbuilder.toString();
		//   31   61:aload_1         
		//   32   62:invokevirtual   #77  <Method String StringBuilder.toString()>
		//   33   65:areturn         
		}

		public final ResolveInfo resolveInfo;
		final ActivityChooserModel this$0;
		public float weight;

		public ActivityResolveInfo(ResolveInfo resolveinfo)
		{
			this$0 = ActivityChooserModel.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field ActivityChooserModel this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			resolveInfo = resolveinfo;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field ResolveInfo resolveInfo>
		//    8   14:return          
		}
	}

	public static interface ActivitySorter
	{

		public abstract void sort(Intent intent, List list, List list1);
	}

	final class DefaultSorter
		implements ActivitySorter
	{

		public void sort(Intent intent, List list, List list1)
		{
			intent = ((Intent) (mPackageNameToActivityMap));
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field Map mPackageNameToActivityMap>
		//    2    4:astore_1        
			((Map) (intent)).clear();
		//    3    5:aload_1         
		//    4    6:invokeinterface #37  <Method void Map.clear()>
			int k = list.size();
		//    5   11:aload_2         
		//    6   12:invokeinterface #43  <Method int List.size()>
		//    7   17:istore          7
			for(int i = 0; i < k; i++)
		//*   8   19:iconst_0        
		//*   9   20:istore          6
		//*  10   22:iload           6
		//*  11   24:iload           7
		//*  12   26:icmpge          95
			{
				ActivityResolveInfo activityresolveinfo = (ActivityResolveInfo)list.get(i);
		//   13   29:aload_2         
		//   14   30:iload           6
		//   15   32:invokeinterface #47  <Method Object List.get(int)>
		//   16   37:checkcast       #49  <Class ActivityChooserModel$ActivityResolveInfo>
		//   17   40:astore          8
				activityresolveinfo.weight = 0.0F;
		//   18   42:aload           8
		//   19   44:fconst_0        
		//   20   45:putfield        #52  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
				((Map) (intent)).put(((Object) (new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name))), ((Object) (activityresolveinfo)));
		//   21   48:aload_1         
		//   22   49:new             #54  <Class ComponentName>
		//   23   52:dup             
		//   24   53:aload           8
		//   25   55:getfield        #58  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
		//   26   58:getfield        #64  <Field ActivityInfo ResolveInfo.activityInfo>
		//   27   61:getfield        #70  <Field String ActivityInfo.packageName>
		//   28   64:aload           8
		//   29   66:getfield        #58  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
		//   30   69:getfield        #64  <Field ActivityInfo ResolveInfo.activityInfo>
		//   31   72:getfield        #73  <Field String ActivityInfo.name>
		//   32   75:invokespecial   #76  <Method void ComponentName(String, String)>
		//   33   78:aload           8
		//   34   80:invokeinterface #80  <Method Object Map.put(Object, Object)>
		//   35   85:pop             
			}

		//   36   86:iload           6
		//   37   88:iconst_1        
		//   38   89:iadd            
		//   39   90:istore          6
		//*  40   92:goto            22
			int j = list1.size();
		//   41   95:aload_3         
		//   42   96:invokeinterface #43  <Method int List.size()>
		//   43  101:istore          6
			float f = 1.0F;
		//   44  103:fconst_1        
		//   45  104:fstore          4
			for(j--; j >= 0;)
		//*  46  106:iload           6
		//*  47  108:iconst_1        
		//*  48  109:isub            
		//*  49  110:istore          6
		//*  50  112:iload           6
		//*  51  114:iflt            194
			{
				HistoricalRecord historicalrecord = (HistoricalRecord)list1.get(j);
		//   52  117:aload_3         
		//   53  118:iload           6
		//   54  120:invokeinterface #47  <Method Object List.get(int)>
		//   55  125:checkcast       #82  <Class ActivityChooserModel$HistoricalRecord>
		//   56  128:astore          8
				ActivityResolveInfo activityresolveinfo1 = (ActivityResolveInfo)((Map) (intent)).get(((Object) (historicalrecord.activity)));
		//   57  130:aload_1         
		//   58  131:aload           8
		//   59  133:getfield        #86  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
		//   60  136:invokeinterface #89  <Method Object Map.get(Object)>
		//   61  141:checkcast       #49  <Class ActivityChooserModel$ActivityResolveInfo>
		//   62  144:astore          9
				float f1 = f;
		//   63  146:fload           4
		//   64  148:fstore          5
				if(activityresolveinfo1 != null)
		//*  65  150:aload           9
		//*  66  152:ifnull          181
				{
					activityresolveinfo1.weight = activityresolveinfo1.weight + historicalrecord.weight * f;
		//   67  155:aload           9
		//   68  157:aload           9
		//   69  159:getfield        #52  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
		//   70  162:aload           8
		//   71  164:getfield        #90  <Field float ActivityChooserModel$HistoricalRecord.weight>
		//   72  167:fload           4
		//   73  169:fmul            
		//   74  170:fadd            
		//   75  171:putfield        #52  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
					f1 = f * 0.95F;
		//   76  174:fload           4
		//   77  176:ldc1            #12  <Float 0.95F>
		//   78  178:fmul            
		//   79  179:fstore          5
				}
				j--;
		//   80  181:iload           6
		//   81  183:iconst_1        
		//   82  184:isub            
		//   83  185:istore          6
				f = f1;
		//   84  187:fload           5
		//   85  189:fstore          4
			}

		//*  86  191:goto            112
			Collections.sort(list);
		//   87  194:aload_2         
		//   88  195:invokestatic    #95  <Method void Collections.sort(List)>
		//   89  198:return          
		}

		private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
		private final Map mPackageNameToActivityMap = new HashMap();
		final ActivityChooserModel this$0;

		DefaultSorter()
		{
			this$0 = ActivityChooserModel.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field ActivityChooserModel this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #26  <Class HashMap>
		//    7   13:dup             
		//    8   14:invokespecial   #27  <Method void HashMap()>
		//    9   17:putfield        #29  <Field Map mPackageNameToActivityMap>
		//   10   20:return          
		}
	}

	public static final class HistoricalRecord
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
			obj = ((Object) ((HistoricalRecord)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class ActivityChooserModel$HistoricalRecord>
		//   18   30:astore_1        
			if(activity == null)
		//*  19   31:aload_0         
		//*  20   32:getfield        #20  <Field ComponentName activity>
		//*  21   35:ifnonnull       47
			{
				if(((HistoricalRecord) (obj)).activity != null)
		//*  22   38:aload_1         
		//*  23   39:getfield        #20  <Field ComponentName activity>
		//*  24   42:ifnull          63
					return false;
		//   25   45:iconst_0        
		//   26   46:ireturn         
			} else
			if(!activity.equals(((Object) (((HistoricalRecord) (obj)).activity))))
		//*  27   47:aload_0         
		//*  28   48:getfield        #20  <Field ComponentName activity>
		//*  29   51:aload_1         
		//*  30   52:getfield        #20  <Field ComponentName activity>
		//*  31   55:invokevirtual   #42  <Method boolean ComponentName.equals(Object)>
		//*  32   58:ifne            63
				return false;
		//   33   61:iconst_0        
		//   34   62:ireturn         
			if(time != ((HistoricalRecord) (obj)).time)
		//*  35   63:aload_0         
		//*  36   64:getfield        #22  <Field long time>
		//*  37   67:aload_1         
		//*  38   68:getfield        #22  <Field long time>
		//*  39   71:lcmp            
		//*  40   72:ifeq            77
				return false;
		//   41   75:iconst_0        
		//   42   76:ireturn         
			return Float.floatToIntBits(weight) == Float.floatToIntBits(((HistoricalRecord) (obj)).weight);
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
			return ((i + 31) * 31 + (int)(time ^ time >>> 32)) * 31 + Float.floatToIntBits(weight);
		//   10   20:iload_1         
		//   11   21:bipush          31
		//   12   23:iadd            
		//   13   24:bipush          31
		//   14   26:imul            
		//   15   27:aload_0         
		//   16   28:getfield        #22  <Field long time>
		//   17   31:aload_0         
		//   18   32:getfield        #22  <Field long time>
		//   19   35:bipush          32
		//   20   37:lushr           
		//   21   38:lxor            
		//   22   39:l2i             
		//   23   40:iadd            
		//   24   41:bipush          31
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

		public HistoricalRecord(ComponentName componentname, long l, float f)
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

		public HistoricalRecord(String s, long l, float f)
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

	public static interface OnChooseActivityListener
	{

		public abstract boolean onChooseActivity(ActivityChooserModel activitychoosermodel, Intent intent);
	}

	final class PersistHistoryAsyncTask extends AsyncTask
	{

		public volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground(aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #23  <Method Void doInBackground(Object[])>
		//    3    5:areturn         
		}

		public transient Void doInBackground(Object aobj[])
		{
			List list;
			Object obj1;
			list = (List)aobj[0];
		//    0    0:aload_1         
		//    1    1:iconst_0        
		//    2    2:aaload          
		//    3    3:checkcast       #33  <Class List>
		//    4    6:astore          4
			obj1 = ((Object) ((String)aobj[1]));
		//    5    8:aload_1         
		//    6    9:iconst_1        
		//    7   10:aaload          
		//    8   11:checkcast       #35  <Class String>
		//    9   14:astore          5
			try
			{
				aobj = ((Object []) (mContext.openFileOutput(((String) (obj1)), 0)));
		//   10   16:aload_0         
		//   11   17:getfield        #14  <Field ActivityChooserModel this$0>
		//   12   20:getfield        #39  <Field Context ActivityChooserModel.mContext>
		//   13   23:aload           5
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #45  <Method FileOutputStream Context.openFileOutput(String, int)>
		//   16   29:astore_1        
			}
		//*  17   30:goto            64
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
		//*  18   33:astore_1        
			{
				Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(((String) (obj1))).toString(), ((Throwable) (aobj)));
		//   19   34:getstatic       #49  <Field String ActivityChooserModel.LOG_TAG>
		//   20   37:new             #51  <Class StringBuilder>
		//   21   40:dup             
		//   22   41:invokespecial   #52  <Method void StringBuilder()>
		//   23   44:ldc1            #54  <String "Error writing historical record file: ">
		//   24   46:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   25   49:aload           5
		//   26   51:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   27   54:invokevirtual   #62  <Method String StringBuilder.toString()>
		//   28   57:aload_1         
		//   29   58:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
		//   30   61:pop             
				return null;
		//   31   62:aconst_null     
		//   32   63:areturn         
			}
			obj1 = ((Object) (Xml.newSerializer()));
		//   33   64:invokestatic    #74  <Method XmlSerializer Xml.newSerializer()>
		//   34   67:astore          5
			int j;
			((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), ((String) (null)));
		//   35   69:aload           5
		//   36   71:aload_1         
		//   37   72:aconst_null     
		//   38   73:invokeinterface #80  <Method void XmlSerializer.setOutput(java.io.OutputStream, String)>
			((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
		//   39   78:aload           5
		//   40   80:ldc1            #82  <String "UTF-8">
		//   41   82:iconst_1        
		//   42   83:invokestatic    #88  <Method Boolean Boolean.valueOf(boolean)>
		//   43   86:invokeinterface #92  <Method void XmlSerializer.startDocument(String, Boolean)>
			((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-records");
		//   44   91:aload           5
		//   45   93:aconst_null     
		//   46   94:ldc1            #94  <String "historical-records">
		//   47   96:invokeinterface #98  <Method XmlSerializer XmlSerializer.startTag(String, String)>
		//   48  101:pop             
			j = list.size();
		//   49  102:aload           4
		//   50  104:invokeinterface #102 <Method int List.size()>
		//   51  109:istore_3        
			int i = 0;
		//   52  110:iconst_0        
		//   53  111:istore_2        
_L2:
			if(i >= j)
				break; /* Loop/switch isn't completed */
		//   54  112:iload_2         
		//   55  113:iload_3         
		//   56  114:icmpge          216
			HistoricalRecord historicalrecord = (HistoricalRecord)list.remove(0);
		//   57  117:aload           4
		//   58  119:iconst_0        
		//   59  120:invokeinterface #106 <Method Object List.remove(int)>
		//   60  125:checkcast       #108 <Class ActivityChooserModel$HistoricalRecord>
		//   61  128:astore          6
			((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-record");
		//   62  130:aload           5
		//   63  132:aconst_null     
		//   64  133:ldc1            #110 <String "historical-record">
		//   65  135:invokeinterface #98  <Method XmlSerializer XmlSerializer.startTag(String, String)>
		//   66  140:pop             
			((XmlSerializer) (obj1)).attribute(((String) (null)), "activity", historicalrecord.activity.flattenToString());
		//   67  141:aload           5
		//   68  143:aconst_null     
		//   69  144:ldc1            #112 <String "activity">
		//   70  146:aload           6
		//   71  148:getfield        #115 <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
		//   72  151:invokevirtual   #120 <Method String ComponentName.flattenToString()>
		//   73  154:invokeinterface #124 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//   74  159:pop             
			((XmlSerializer) (obj1)).attribute(((String) (null)), "time", String.valueOf(historicalrecord.time));
		//   75  160:aload           5
		//   76  162:aconst_null     
		//   77  163:ldc1            #126 <String "time">
		//   78  165:aload           6
		//   79  167:getfield        #129 <Field long ActivityChooserModel$HistoricalRecord.time>
		//   80  170:invokestatic    #132 <Method String String.valueOf(long)>
		//   81  173:invokeinterface #124 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//   82  178:pop             
			((XmlSerializer) (obj1)).attribute(((String) (null)), "weight", String.valueOf(historicalrecord.weight));
		//   83  179:aload           5
		//   84  181:aconst_null     
		//   85  182:ldc1            #134 <String "weight">
		//   86  184:aload           6
		//   87  186:getfield        #137 <Field float ActivityChooserModel$HistoricalRecord.weight>
		//   88  189:invokestatic    #140 <Method String String.valueOf(float)>
		//   89  192:invokeinterface #124 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//   90  197:pop             
			((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-record");
		//   91  198:aload           5
		//   92  200:aconst_null     
		//   93  201:ldc1            #110 <String "historical-record">
		//   94  203:invokeinterface #143 <Method XmlSerializer XmlSerializer.endTag(String, String)>
		//   95  208:pop             
			i++;
		//   96  209:iload_2         
		//   97  210:iconst_1        
		//   98  211:iadd            
		//   99  212:istore_2        
			if(true) goto _L2; else goto _L1
		//  100  213:goto            112
_L1:
			((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-records");
		//  101  216:aload           5
		//  102  218:aconst_null     
		//  103  219:ldc1            #94  <String "historical-records">
		//  104  221:invokeinterface #143 <Method XmlSerializer XmlSerializer.endTag(String, String)>
		//  105  226:pop             
			((XmlSerializer) (obj1)).endDocument();
		//  106  227:aload           5
		//  107  229:invokeinterface #146 <Method void XmlSerializer.endDocument()>
			mCanReadHistoricalData = true;
		//  108  234:aload_0         
		//  109  235:getfield        #14  <Field ActivityChooserModel this$0>
		//  110  238:iconst_1        
		//  111  239:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 112  242:aload_1         
		//* 113  243:ifnull          459
				try
				{
					((FileOutputStream) (aobj)).close();
		//  114  246:aload_1         
		//  115  247:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 116  250:goto            459
				// Misplaced declaration of an exception variable
				catch(Object aobj[]) { }
		//  117  253:astore_1        
			break MISSING_BLOCK_LABEL_459;
		//  118  254:goto            459
			Object obj;
			obj;
		//  119  257:astore          4
			Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		//  120  259:getstatic       #49  <Field String ActivityChooserModel.LOG_TAG>
		//  121  262:new             #51  <Class StringBuilder>
		//  122  265:dup             
		//  123  266:invokespecial   #52  <Method void StringBuilder()>
		//  124  269:ldc1            #54  <String "Error writing historical record file: ">
		//  125  271:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//  126  274:aload_0         
		//  127  275:getfield        #14  <Field ActivityChooserModel this$0>
		//  128  278:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
		//  129  281:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//  130  284:invokevirtual   #62  <Method String StringBuilder.toString()>
		//  131  287:aload           4
		//  132  289:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
		//  133  292:pop             
			mCanReadHistoricalData = true;
		//  134  293:aload_0         
		//  135  294:getfield        #14  <Field ActivityChooserModel this$0>
		//  136  297:iconst_1        
		//  137  298:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 138  301:aload_1         
		//* 139  302:ifnull          459
				try
				{
					((FileOutputStream) (aobj)).close();
		//  140  305:aload_1         
		//  141  306:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 142  309:goto            459
				// Misplaced declaration of an exception variable
				catch(Object aobj[]) { }
		//  143  312:astore_1        
			break MISSING_BLOCK_LABEL_459;
		//  144  313:goto            459
			obj;
		//  145  316:astore          4
			Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		//  146  318:getstatic       #49  <Field String ActivityChooserModel.LOG_TAG>
		//  147  321:new             #51  <Class StringBuilder>
		//  148  324:dup             
		//  149  325:invokespecial   #52  <Method void StringBuilder()>
		//  150  328:ldc1            #54  <String "Error writing historical record file: ">
		//  151  330:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//  152  333:aload_0         
		//  153  334:getfield        #14  <Field ActivityChooserModel this$0>
		//  154  337:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
		//  155  340:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//  156  343:invokevirtual   #62  <Method String StringBuilder.toString()>
		//  157  346:aload           4
		//  158  348:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
		//  159  351:pop             
			mCanReadHistoricalData = true;
		//  160  352:aload_0         
		//  161  353:getfield        #14  <Field ActivityChooserModel this$0>
		//  162  356:iconst_1        
		//  163  357:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 164  360:aload_1         
		//* 165  361:ifnull          459
				try
				{
					((FileOutputStream) (aobj)).close();
		//  166  364:aload_1         
		//  167  365:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 168  368:goto            459
				// Misplaced declaration of an exception variable
				catch(Object aobj[]) { }
		//  169  371:astore_1        
			break MISSING_BLOCK_LABEL_459;
		//  170  372:goto            459
			obj;
		//  171  375:astore          4
			Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		//  172  377:getstatic       #49  <Field String ActivityChooserModel.LOG_TAG>
		//  173  380:new             #51  <Class StringBuilder>
		//  174  383:dup             
		//  175  384:invokespecial   #52  <Method void StringBuilder()>
		//  176  387:ldc1            #54  <String "Error writing historical record file: ">
		//  177  389:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//  178  392:aload_0         
		//  179  393:getfield        #14  <Field ActivityChooserModel this$0>
		//  180  396:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
		//  181  399:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//  182  402:invokevirtual   #62  <Method String StringBuilder.toString()>
		//  183  405:aload           4
		//  184  407:invokestatic    #68  <Method int Log.e(String, String, Throwable)>
		//  185  410:pop             
			mCanReadHistoricalData = true;
		//  186  411:aload_0         
		//  187  412:getfield        #14  <Field ActivityChooserModel this$0>
		//  188  415:iconst_1        
		//  189  416:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 190  419:aload_1         
		//* 191  420:ifnull          459
				try
				{
					((FileOutputStream) (aobj)).close();
		//  192  423:aload_1         
		//  193  424:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 194  427:goto            459
				// Misplaced declaration of an exception variable
				catch(Object aobj[]) { }
		//  195  430:astore_1        
			break MISSING_BLOCK_LABEL_459;
		//  196  431:goto            459
			obj;
		//  197  434:astore          4
			mCanReadHistoricalData = true;
		//  198  436:aload_0         
		//  199  437:getfield        #14  <Field ActivityChooserModel this$0>
		//  200  440:iconst_1        
		//  201  441:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 202  444:aload_1         
		//* 203  445:ifnull          456
				try
				{
					((FileOutputStream) (aobj)).close();
		//  204  448:aload_1         
		//  205  449:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 206  452:goto            456
				// Misplaced declaration of an exception variable
				catch(Object aobj[]) { }
		//  207  455:astore_1        
			throw obj;
		//  208  456:aload           4
		//  209  458:athrow          
			return null;
		//  210  459:aconst_null     
		//  211  460:areturn         
		}

		final ActivityChooserModel this$0;

		PersistHistoryAsyncTask()
		{
			this$0 = ActivityChooserModel.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field ActivityChooserModel this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void AsyncTask()>
		//    5    9:return          
		}
	}


	private ActivityChooserModel(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #111 <Method void DataSetObservable()>
	//    2    4:aload_0         
	//    3    5:new             #98  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #101 <Method void Object()>
	//    6   12:putfield        #113 <Field Object mInstanceLock>
	//    7   15:aload_0         
	//    8   16:new             #115 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #116 <Method void ArrayList()>
	//   11   23:putfield        #118 <Field List mActivities>
	//   12   26:aload_0         
	//   13   27:new             #115 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #116 <Method void ArrayList()>
	//   16   34:putfield        #120 <Field List mHistoricalRecords>
		mActivitySorter = ((ActivitySorter) (new DefaultSorter()));
	//   17   37:aload_0         
	//   18   38:new             #15  <Class ActivityChooserModel$DefaultSorter>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:invokespecial   #123 <Method void ActivityChooserModel$DefaultSorter(ActivityChooserModel)>
	//   22   46:putfield        #125 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
		mHistoryMaxSize = 50;
	//   23   49:aload_0         
	//   24   50:bipush          50
	//   25   52:putfield        #127 <Field int mHistoryMaxSize>
		mCanReadHistoricalData = true;
	//   26   55:aload_0         
	//   27   56:iconst_1        
	//   28   57:putfield        #129 <Field boolean mCanReadHistoricalData>
		mReadShareHistoryCalled = false;
	//   29   60:aload_0         
	//   30   61:iconst_0        
	//   31   62:putfield        #131 <Field boolean mReadShareHistoryCalled>
		mHistoricalRecordsChanged = true;
	//   32   65:aload_0         
	//   33   66:iconst_1        
	//   34   67:putfield        #133 <Field boolean mHistoricalRecordsChanged>
		mReloadActivities = false;
	//   35   70:aload_0         
	//   36   71:iconst_0        
	//   37   72:putfield        #135 <Field boolean mReloadActivities>
		mContext = context.getApplicationContext();
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:invokevirtual   #141 <Method Context Context.getApplicationContext()>
	//   41   80:putfield        #143 <Field Context mContext>
		if(!TextUtils.isEmpty(((CharSequence) (s))) && !s.endsWith(".xml"))
	//*  42   83:aload_2         
	//*  43   84:invokestatic    #149 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  44   87:ifne            123
	//*  45   90:aload_2         
	//*  46   91:ldc1            #52  <String ".xml">
	//*  47   93:invokevirtual   #155 <Method boolean String.endsWith(String)>
	//*  48   96:ifne            123
		{
			mHistoryFileName = (new StringBuilder()).append(s).append(".xml").toString();
	//   49   99:aload_0         
	//   50  100:new             #157 <Class StringBuilder>
	//   51  103:dup             
	//   52  104:invokespecial   #158 <Method void StringBuilder()>
	//   53  107:aload_2         
	//   54  108:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   55  111:ldc1            #52  <String ".xml">
	//   56  113:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   57  116:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   58  119:putfield        #167 <Field String mHistoryFileName>
			return;
	//   59  122:return          
		} else
		{
			mHistoryFileName = s;
	//   60  123:aload_0         
	//   61  124:aload_2         
	//   62  125:putfield        #167 <Field String mHistoryFileName>
			return;
	//   63  128:return          
		}
	}

	private boolean addHistoricalRecord(HistoricalRecord historicalrecord)
	{
		boolean flag = mHistoricalRecords.add(((Object) (historicalrecord)));
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List mHistoricalRecords>
	//    2    4:aload_1         
	//    3    5:invokeinterface #175 <Method boolean List.add(Object)>
	//    4   10:istore_2        
		if(flag)
	//*   5   11:iload_2         
	//*   6   12:ifeq            37
		{
			mHistoricalRecordsChanged = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #133 <Field boolean mHistoricalRecordsChanged>
			pruneExcessiveHistoricalRecordsIfNeeded();
	//   10   20:aload_0         
	//   11   21:invokespecial   #178 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
			persistHistoricalDataIfNeeded();
	//   12   24:aload_0         
	//   13   25:invokespecial   #181 <Method void persistHistoricalDataIfNeeded()>
			sortActivitiesIfNeeded();
	//   14   28:aload_0         
	//   15   29:invokespecial   #185 <Method boolean sortActivitiesIfNeeded()>
	//   16   32:pop             
			notifyChanged();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #188 <Method void notifyChanged()>
		}
		return flag;
	//   19   37:iload_2         
	//   20   38:ireturn         
	}

	private void ensureConsistentState()
	{
		boolean flag = loadActivitiesIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method boolean loadActivitiesIfNeeded()>
	//    2    4:istore_1        
		boolean flag1 = readHistoricalDataIfNeeded();
	//    3    5:aload_0         
	//    4    6:invokespecial   #195 <Method boolean readHistoricalDataIfNeeded()>
	//    5    9:istore_2        
		pruneExcessiveHistoricalRecordsIfNeeded();
	//    6   10:aload_0         
	//    7   11:invokespecial   #178 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
		if(flag | flag1)
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:ior             
	//*  11   17:ifeq            29
		{
			sortActivitiesIfNeeded();
	//   12   20:aload_0         
	//   13   21:invokespecial   #185 <Method boolean sortActivitiesIfNeeded()>
	//   14   24:pop             
			notifyChanged();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #188 <Method void notifyChanged()>
		}
	//   17   29:return          
	}

	public static ActivityChooserModel get(Context context, String s)
	{
		Object obj = sRegistryLock;
	//    0    0:getstatic       #103 <Field Object sRegistryLock>
	//    1    3:astore          4
		obj;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		ActivityChooserModel activitychoosermodel1 = (ActivityChooserModel)sDataModelRegistry.get(((Object) (s)));
	//    4    8:getstatic       #108 <Field Map sDataModelRegistry>
	//    5   11:aload_1         
	//    6   12:invokeinterface #202 <Method Object Map.get(Object)>
	//    7   17:checkcast       #2   <Class ActivityChooserModel>
	//    8   20:astore_3        
		ActivityChooserModel activitychoosermodel;
		activitychoosermodel = activitychoosermodel1;
	//    9   21:aload_3         
	//   10   22:astore_2        
		if(activitychoosermodel1 != null)
			break MISSING_BLOCK_LABEL_48;
	//   11   23:aload_3         
	//   12   24:ifnonnull       48
		activitychoosermodel = new ActivityChooserModel(context, s);
	//   13   27:new             #2   <Class ActivityChooserModel>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #204 <Method void ActivityChooserModel(Context, String)>
	//   18   36:astore_2        
		sDataModelRegistry.put(((Object) (s)), ((Object) (activitychoosermodel)));
	//   19   37:getstatic       #108 <Field Map sDataModelRegistry>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokeinterface #208 <Method Object Map.put(Object, Object)>
	//   23   47:pop             
		obj;
	//   24   48:aload           4
		JVM INSTR monitorexit ;
	//   25   50:monitorexit     
		return activitychoosermodel;
	//   26   51:aload_2         
	//   27   52:areturn         
		context;
	//   28   53:astore_0        
	//*  29   54:aload           4
		throw context;
	//   30   56:monitorexit     
	//   31   57:aload_0         
	//   32   58:athrow          
	}

	private boolean loadActivitiesIfNeeded()
	{
		if(mReloadActivities && mIntent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field boolean mReloadActivities>
	//*   2    4:ifeq            99
	//*   3    7:aload_0         
	//*   4    8:getfield        #210 <Field Intent mIntent>
	//*   5   11:ifnull          99
		{
			mReloadActivities = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #135 <Field boolean mReloadActivities>
			mActivities.clear();
	//    9   19:aload_0         
	//   10   20:getfield        #118 <Field List mActivities>
	//   11   23:invokeinterface #213 <Method void List.clear()>
			List list = mContext.getPackageManager().queryIntentActivities(mIntent, 0);
	//   12   28:aload_0         
	//   13   29:getfield        #143 <Field Context mContext>
	//   14   32:invokevirtual   #217 <Method PackageManager Context.getPackageManager()>
	//   15   35:aload_0         
	//   16   36:getfield        #210 <Field Intent mIntent>
	//   17   39:iconst_0        
	//   18   40:invokevirtual   #223 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   19   43:astore_3        
			int j = list.size();
	//   20   44:aload_3         
	//   21   45:invokeinterface #227 <Method int List.size()>
	//   22   50:istore_2        
			for(int i = 0; i < j; i++)
	//*  23   51:iconst_0        
	//*  24   52:istore_1        
	//*  25   53:iload_1         
	//*  26   54:iload_2         
	//*  27   55:icmpge          97
			{
				ResolveInfo resolveinfo = (ResolveInfo)list.get(i);
	//   28   58:aload_3         
	//   29   59:iload_1         
	//   30   60:invokeinterface #230 <Method Object List.get(int)>
	//   31   65:checkcast       #232 <Class ResolveInfo>
	//   32   68:astore          4
				mActivities.add(((Object) (new ActivityResolveInfo(resolveinfo))));
	//   33   70:aload_0         
	//   34   71:getfield        #118 <Field List mActivities>
	//   35   74:new             #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   36   77:dup             
	//   37   78:aload_0         
	//   38   79:aload           4
	//   39   81:invokespecial   #235 <Method void ActivityChooserModel$ActivityResolveInfo(ActivityChooserModel, ResolveInfo)>
	//   40   84:invokeinterface #175 <Method boolean List.add(Object)>
	//   41   89:pop             
			}

	//   42   90:iload_1         
	//   43   91:iconst_1        
	//   44   92:iadd            
	//   45   93:istore_1        
	//*  46   94:goto            53
			return true;
	//   47   97:iconst_1        
	//   48   98:ireturn         
		} else
		{
			return false;
	//   49   99:iconst_0        
	//   50  100:ireturn         
		}
	}

	private void persistHistoricalDataIfNeeded()
	{
		if(!mReadShareHistoryCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #131 <Field boolean mReadShareHistoryCalled>
	//*   2    4:ifne            17
			throw new IllegalStateException("No preceding call to #readHistoricalData");
	//    3    7:new             #237 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #239 <String "No preceding call to #readHistoricalData">
	//    6   13:invokespecial   #242 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(!mHistoricalRecordsChanged)
	//*   8   17:aload_0         
	//*   9   18:getfield        #133 <Field boolean mHistoricalRecordsChanged>
	//*  10   21:ifne            25
			return;
	//   11   24:return          
		mHistoricalRecordsChanged = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #133 <Field boolean mHistoricalRecordsChanged>
		if(!TextUtils.isEmpty(((CharSequence) (mHistoryFileName))))
	//*  15   30:aload_0         
	//*  16   31:getfield        #167 <Field String mHistoryFileName>
	//*  17   34:invokestatic    #149 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   37:ifne            80
			(new PersistHistoryAsyncTask()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
				new ArrayList(((java.util.Collection) (mHistoricalRecords))), mHistoryFileName
			});
	//   19   40:new             #24  <Class ActivityChooserModel$PersistHistoryAsyncTask>
	//   20   43:dup             
	//   21   44:aload_0         
	//   22   45:invokespecial   #243 <Method void ActivityChooserModel$PersistHistoryAsyncTask(ActivityChooserModel)>
	//   23   48:getstatic       #249 <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//   24   51:iconst_2        
	//   25   52:anewarray       Object[]
	//   26   55:dup             
	//   27   56:iconst_0        
	//   28   57:new             #115 <Class ArrayList>
	//   29   60:dup             
	//   30   61:aload_0         
	//   31   62:getfield        #120 <Field List mHistoricalRecords>
	//   32   65:invokespecial   #252 <Method void ArrayList(java.util.Collection)>
	//   33   68:aastore         
	//   34   69:dup             
	//   35   70:iconst_1        
	//   36   71:aload_0         
	//   37   72:getfield        #167 <Field String mHistoryFileName>
	//   38   75:aastore         
	//   39   76:invokevirtual   #256 <Method AsyncTask ActivityChooserModel$PersistHistoryAsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   40   79:pop             
	//   41   80:return          
	}

	private void pruneExcessiveHistoricalRecordsIfNeeded()
	{
		int j = mHistoricalRecords.size() - mHistoryMaxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List mHistoricalRecords>
	//    2    4:invokeinterface #227 <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #127 <Field int mHistoryMaxSize>
	//    5   13:isub            
	//    6   14:istore_2        
		if(j <= 0)
	//*   7   15:iload_2         
	//*   8   16:ifgt            20
			return;
	//    9   19:return          
		mHistoricalRecordsChanged = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #133 <Field boolean mHistoricalRecordsChanged>
		for(int i = 0; i < j; i++)
	//*  13   25:iconst_0        
	//*  14   26:istore_1        
	//*  15   27:iload_1         
	//*  16   28:iload_2         
	//*  17   29:icmpge          53
		{
			HistoricalRecord historicalrecord = (HistoricalRecord)mHistoricalRecords.remove(0);
	//   18   32:aload_0         
	//   19   33:getfield        #120 <Field List mHistoricalRecords>
	//   20   36:iconst_0        
	//   21   37:invokeinterface #259 <Method Object List.remove(int)>
	//   22   42:checkcast       #18  <Class ActivityChooserModel$HistoricalRecord>
	//   23   45:astore_3        
		}

	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_1        
	//*  28   50:goto            27
	//   29   53:return          
	}

	private boolean readHistoricalDataIfNeeded()
	{
		if(mCanReadHistoricalData && mHistoricalRecordsChanged && !TextUtils.isEmpty(((CharSequence) (mHistoryFileName))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field boolean mCanReadHistoricalData>
	//*   2    4:ifeq            40
	//*   3    7:aload_0         
	//*   4    8:getfield        #133 <Field boolean mHistoricalRecordsChanged>
	//*   5   11:ifeq            40
	//*   6   14:aload_0         
	//*   7   15:getfield        #167 <Field String mHistoryFileName>
	//*   8   18:invokestatic    #149 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   21:ifne            40
		{
			mCanReadHistoricalData = false;
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:putfield        #129 <Field boolean mCanReadHistoricalData>
			mReadShareHistoryCalled = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #131 <Field boolean mReadShareHistoryCalled>
			readHistoricalDataImpl();
	//   16   34:aload_0         
	//   17   35:invokespecial   #262 <Method void readHistoricalDataImpl()>
			return true;
	//   18   38:iconst_1        
	//   19   39:ireturn         
		} else
		{
			return false;
	//   20   40:iconst_0        
	//   21   41:ireturn         
		}
	}

	private void readHistoricalDataImpl()
	{
		Object obj;
		try
		{
			obj = ((Object) (mContext.openFileInput(mHistoryFileName)));
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #167 <Field String mHistoryFileName>
	//    4    8:invokevirtual   #272 <Method FileInputStream Context.openFileInput(String)>
	//    5   11:astore_2        
		}
	//*   6   12:goto            17
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   7   15:astore_2        
		{
			return;
	//    8   16:return          
		}
		XmlPullParser xmlpullparser;
		xmlpullparser = Xml.newPullParser();
	//    9   17:invokestatic    #278 <Method XmlPullParser Xml.newPullParser()>
	//   10   20:astore_3        
		xmlpullparser.setInput(((java.io.InputStream) (obj)), "UTF-8");
	//   11   21:aload_3         
	//   12   22:aload_2         
	//   13   23:ldc2            #280 <String "UTF-8">
	//   14   26:invokeinterface #286 <Method void XmlPullParser.setInput(java.io.InputStream, String)>
		int i = 0;
	//   15   31:iconst_0        
	//   16   32:istore_1        
_L1:
		if(i == 1 || i == 2)
			break MISSING_BLOCK_LABEL_53;
	//   17   33:iload_1         
	//   18   34:iconst_1        
	//   19   35:icmpeq          53
	//   20   38:iload_1         
	//   21   39:iconst_2        
	//   22   40:icmpeq          53
		i = xmlpullparser.next();
	//   23   43:aload_3         
	//   24   44:invokeinterface #289 <Method int XmlPullParser.next()>
	//   25   49:istore_1        
		  goto _L1
	//*  26   50:goto            33
		List list;
		if(!"historical-records".equals(((Object) (xmlpullparser.getName()))))
	//*  27   53:ldc1            #61  <String "historical-records">
	//*  28   55:aload_3         
	//*  29   56:invokeinterface #292 <Method String XmlPullParser.getName()>
	//*  30   61:invokevirtual   #295 <Method boolean String.equals(Object)>
	//*  31   64:ifne            78
			throw new XmlPullParserException("Share records file does not start with historical-records tag.");
	//   32   67:new             #266 <Class XmlPullParserException>
	//   33   70:dup             
	//   34   71:ldc2            #297 <String "Share records file does not start with historical-records tag.">
	//   35   74:invokespecial   #298 <Method void XmlPullParserException(String)>
	//   36   77:athrow          
		list = mHistoricalRecords;
	//   37   78:aload_0         
	//   38   79:getfield        #120 <Field List mHistoricalRecords>
	//   39   82:astore          4
		list.clear();
	//   40   84:aload           4
	//   41   86:invokeinterface #213 <Method void List.clear()>
_L3:
		i = xmlpullparser.next();
	//   42   91:aload_3         
	//   43   92:invokeinterface #289 <Method int XmlPullParser.next()>
	//   44   97:istore_1        
		if(i == 1)
	//*  45   98:iload_1         
	//*  46   99:iconst_1        
	//*  47  100:icmpne          295
	//*  48  103:goto            182
	//*  49  106:ldc1            #58  <String "historical-record">
	//*  50  108:aload_3         
	//*  51  109:invokeinterface #292 <Method String XmlPullParser.getName()>
	//*  52  114:invokevirtual   #295 <Method boolean String.equals(Object)>
	//*  53  117:ifne            131
	//*  54  120:new             #266 <Class XmlPullParserException>
	//*  55  123:dup             
	//*  56  124:ldc2            #300 <String "Share records file not well-formed.">
	//*  57  127:invokespecial   #298 <Method void XmlPullParserException(String)>
	//*  58  130:athrow          
	//*  59  131:aload           4
	//*  60  133:new             #18  <Class ActivityChooserModel$HistoricalRecord>
	//*  61  136:dup             
	//*  62  137:aload_3         
	//*  63  138:aconst_null     
	//*  64  139:ldc1            #29  <String "activity">
	//*  65  141:invokeinterface #304 <Method String XmlPullParser.getAttributeValue(String, String)>
	//*  66  146:aload_3         
	//*  67  147:aconst_null     
	//*  68  148:ldc1            #32  <String "time">
	//*  69  150:invokeinterface #304 <Method String XmlPullParser.getAttributeValue(String, String)>
	//*  70  155:invokestatic    #310 <Method long Long.parseLong(String)>
	//*  71  158:aload_3         
	//*  72  159:aconst_null     
	//*  73  160:ldc1            #35  <String "weight">
	//*  74  162:invokeinterface #304 <Method String XmlPullParser.getAttributeValue(String, String)>
	//*  75  167:invokestatic    #316 <Method float Float.parseFloat(String)>
	//*  76  170:invokespecial   #319 <Method void ActivityChooserModel$HistoricalRecord(String, long, float)>
	//*  77  173:invokeinterface #175 <Method boolean List.add(Object)>
	//*  78  178:pop             
	//*  79  179:goto            91
		{
			if(obj != null)
	//*  80  182:aload_2         
	//*  81  183:ifnull          294
				try
				{
					((FileInputStream) (obj)).close();
	//   82  186:aload_2         
	//   83  187:invokevirtual   #324 <Method void FileInputStream.close()>
					return;
	//   84  190:return          
				}
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  85  191:astore_2        
				{
					return;
	//   86  192:return          
				}
			break MISSING_BLOCK_LABEL_294;
		}
		  goto _L2
_L4:
		if(!"historical-record".equals(((Object) (xmlpullparser.getName()))))
			throw new XmlPullParserException("Share records file not well-formed.");
		list.add(((Object) (new HistoricalRecord(xmlpullparser.getAttributeValue(((String) (null)), "activity"), Long.parseLong(xmlpullparser.getAttributeValue(((String) (null)), "time")), Float.parseFloat(xmlpullparser.getAttributeValue(((String) (null)), "weight"))))));
		break; /* Loop/switch isn't completed */
		Object obj1;
		obj1;
	//   87  193:astore_3        
		Log.e(LOG_TAG, (new StringBuilder()).append("Error reading historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj1)));
	//   88  194:getstatic       #96  <Field String LOG_TAG>
	//   89  197:new             #157 <Class StringBuilder>
	//   90  200:dup             
	//   91  201:invokespecial   #158 <Method void StringBuilder()>
	//   92  204:ldc2            #326 <String "Error reading historical recrod file: ">
	//   93  207:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   94  210:aload_0         
	//   95  211:getfield        #167 <Field String mHistoryFileName>
	//   96  214:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   97  217:invokevirtual   #165 <Method String StringBuilder.toString()>
	//   98  220:aload_3         
	//   99  221:invokestatic    #332 <Method int Log.e(String, String, Throwable)>
	//  100  224:pop             
		if(obj != null)
	//* 101  225:aload_2         
	//* 102  226:ifnull          294
			try
			{
				((FileInputStream) (obj)).close();
	//  103  229:aload_2         
	//  104  230:invokevirtual   #324 <Method void FileInputStream.close()>
				return;
	//  105  233:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 106  234:astore_2        
			{
				return;
	//  107  235:return          
			}
		break MISSING_BLOCK_LABEL_294;
		obj1;
	//  108  236:astore_3        
		Log.e(LOG_TAG, (new StringBuilder()).append("Error reading historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj1)));
	//  109  237:getstatic       #96  <Field String LOG_TAG>
	//  110  240:new             #157 <Class StringBuilder>
	//  111  243:dup             
	//  112  244:invokespecial   #158 <Method void StringBuilder()>
	//  113  247:ldc2            #326 <String "Error reading historical recrod file: ">
	//  114  250:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  115  253:aload_0         
	//  116  254:getfield        #167 <Field String mHistoryFileName>
	//  117  257:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  118  260:invokevirtual   #165 <Method String StringBuilder.toString()>
	//  119  263:aload_3         
	//  120  264:invokestatic    #332 <Method int Log.e(String, String, Throwable)>
	//  121  267:pop             
		if(obj != null)
	//* 122  268:aload_2         
	//* 123  269:ifnull          294
			try
			{
				((FileInputStream) (obj)).close();
	//  124  272:aload_2         
	//  125  273:invokevirtual   #324 <Method void FileInputStream.close()>
				return;
	//  126  276:return          
			}
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//* 127  277:astore_2        
			{
				return;
	//  128  278:return          
			}
		break MISSING_BLOCK_LABEL_294;
		obj1;
	//  129  279:astore_3        
		if(obj != null)
	//* 130  280:aload_2         
	//* 131  281:ifnull          292
			try
			{
				((FileInputStream) (obj)).close();
	//  132  284:aload_2         
	//  133  285:invokevirtual   #324 <Method void FileInputStream.close()>
			}
	//* 134  288:goto            292
			catch(IOException ioexception) { }
	//  135  291:astore_2        
		throw obj1;
	//  136  292:aload_3         
	//  137  293:athrow          
		return;
	//  138  294:return          
_L2:
		if(i != 3 && i != 4) goto _L4; else goto _L3
	//  139  295:iload_1         
	//  140  296:iconst_3        
	//  141  297:icmpeq          91
	//  142  300:iload_1         
	//  143  301:iconst_4        
	//  144  302:icmpne          106
	//* 145  305:goto            91
	}

	private boolean sortActivitiesIfNeeded()
	{
		if(mActivitySorter != null && mIntent != null && !mActivities.isEmpty() && !mHistoricalRecords.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//*   2    4:ifnull          64
	//*   3    7:aload_0         
	//*   4    8:getfield        #210 <Field Intent mIntent>
	//*   5   11:ifnull          64
	//*   6   14:aload_0         
	//*   7   15:getfield        #118 <Field List mActivities>
	//*   8   18:invokeinterface #334 <Method boolean List.isEmpty()>
	//*   9   23:ifne            64
	//*  10   26:aload_0         
	//*  11   27:getfield        #120 <Field List mHistoricalRecords>
	//*  12   30:invokeinterface #334 <Method boolean List.isEmpty()>
	//*  13   35:ifne            64
		{
			mActivitySorter.sort(mIntent, mActivities, Collections.unmodifiableList(mHistoricalRecords));
	//   14   38:aload_0         
	//   15   39:getfield        #125 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//   16   42:aload_0         
	//   17   43:getfield        #210 <Field Intent mIntent>
	//   18   46:aload_0         
	//   19   47:getfield        #118 <Field List mActivities>
	//   20   50:aload_0         
	//   21   51:getfield        #120 <Field List mHistoricalRecords>
	//   22   54:invokestatic    #340 <Method List Collections.unmodifiableList(List)>
	//   23   57:invokeinterface #344 <Method void ActivityChooserModel$ActivitySorter.sort(Intent, List, List)>
			return true;
	//   24   62:iconst_1        
	//   25   63:ireturn         
		} else
		{
			return false;
	//   26   64:iconst_0        
	//   27   65:ireturn         
		}
	}

	public Intent chooseActivity(int i)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1 = ((Object) (mIntent));
	//    5    7:aload_0         
	//    6    8:getfield        #210 <Field Intent mIntent>
	//    7   11:astore          4
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_22;
	//    8   13:aload           4
	//    9   15:ifnonnull       22
		obj;
	//   10   18:aload_3         
		JVM INSTR monitorexit ;
	//   11   19:monitorexit     
		return null;
	//   12   20:aconst_null     
	//   13   21:areturn         
		boolean flag;
		Intent intent;
		ensureConsistentState();
	//   14   22:aload_0         
	//   15   23:invokespecial   #348 <Method void ensureConsistentState()>
		obj1 = ((Object) ((ActivityResolveInfo)mActivities.get(i)));
	//   16   26:aload_0         
	//   17   27:getfield        #118 <Field List mActivities>
	//   18   30:iload_1         
	//   19   31:invokeinterface #230 <Method Object List.get(int)>
	//   20   36:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   21   39:astore          4
		obj1 = ((Object) (new ComponentName(((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.packageName, ((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.name)));
	//   22   41:new             #350 <Class ComponentName>
	//   23   44:dup             
	//   24   45:aload           4
	//   25   47:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   26   50:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   27   53:getfield        #363 <Field String ActivityInfo.packageName>
	//   28   56:aload           4
	//   29   58:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   30   61:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   31   64:getfield        #366 <Field String ActivityInfo.name>
	//   32   67:invokespecial   #369 <Method void ComponentName(String, String)>
	//   33   70:astore          4
		intent = new Intent(mIntent);
	//   34   72:new             #371 <Class Intent>
	//   35   75:dup             
	//   36   76:aload_0         
	//   37   77:getfield        #210 <Field Intent mIntent>
	//   38   80:invokespecial   #374 <Method void Intent(Intent)>
	//   39   83:astore          5
		intent.setComponent(((ComponentName) (obj1)));
	//   40   85:aload           5
	//   41   87:aload           4
	//   42   89:invokevirtual   #378 <Method Intent Intent.setComponent(ComponentName)>
	//   43   92:pop             
		if(mActivityChoserModelPolicy == null)
			break MISSING_BLOCK_LABEL_132;
	//   44   93:aload_0         
	//   45   94:getfield        #380 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
	//   46   97:ifnull          132
		Intent intent1 = new Intent(intent);
	//   47  100:new             #371 <Class Intent>
	//   48  103:dup             
	//   49  104:aload           5
	//   50  106:invokespecial   #374 <Method void Intent(Intent)>
	//   51  109:astore          6
		flag = mActivityChoserModelPolicy.onChooseActivity(this, intent1);
	//   52  111:aload_0         
	//   53  112:getfield        #380 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
	//   54  115:aload_0         
	//   55  116:aload           6
	//   56  118:invokeinterface #384 <Method boolean ActivityChooserModel$OnChooseActivityListener.onChooseActivity(ActivityChooserModel, Intent)>
	//   57  123:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_132;
	//   58  124:iload_2         
	//   59  125:ifeq            132
		obj;
	//   60  128:aload_3         
		JVM INSTR monitorexit ;
	//   61  129:monitorexit     
		return null;
	//   62  130:aconst_null     
	//   63  131:areturn         
		addHistoricalRecord(new HistoricalRecord(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
	//   64  132:aload_0         
	//   65  133:new             #18  <Class ActivityChooserModel$HistoricalRecord>
	//   66  136:dup             
	//   67  137:aload           4
	//   68  139:invokestatic    #390 <Method long System.currentTimeMillis()>
	//   69  142:fconst_1        
	//   70  143:invokespecial   #393 <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
	//   71  146:invokespecial   #395 <Method boolean addHistoricalRecord(ActivityChooserModel$HistoricalRecord)>
	//   72  149:pop             
		obj;
	//   73  150:aload_3         
		JVM INSTR monitorexit ;
	//   74  151:monitorexit     
		return intent;
	//   75  152:aload           5
	//   76  154:areturn         
		Exception exception;
		exception;
	//   77  155:astore          4
	//*  78  157:aload_3         
		throw exception;
	//   79  158:monitorexit     
	//   80  159:aload           4
	//   81  161:athrow          
	}

	public ResolveInfo getActivity(int i)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ResolveInfo resolveinfo;
		ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #348 <Method void ensureConsistentState()>
		resolveinfo = ((ActivityResolveInfo)mActivities.get(i)).resolveInfo;
	//    7   11:aload_0         
	//    8   12:getfield        #118 <Field List mActivities>
	//    9   15:iload_1         
	//   10   16:invokeinterface #230 <Method Object List.get(int)>
	//   11   21:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   12   24:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   13   27:astore_3        
		obj;
	//   14   28:aload_2         
		JVM INSTR monitorexit ;
	//   15   29:monitorexit     
		return resolveinfo;
	//   16   30:aload_3         
	//   17   31:areturn         
		Exception exception;
		exception;
	//   18   32:astore_3        
	//*  19   33:aload_2         
		throw exception;
	//   20   34:monitorexit     
	//   21   35:aload_3         
	//   22   36:athrow          
	}

	public int getActivityCount()
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i;
		ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #348 <Method void ensureConsistentState()>
		i = mActivities.size();
	//    7   11:aload_0         
	//    8   12:getfield        #118 <Field List mActivities>
	//    9   15:invokeinterface #227 <Method int List.size()>
	//   10   20:istore_1        
		obj;
	//   11   21:aload_2         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
		Exception exception;
		exception;
	//   15   25:astore_3        
	//*  16   26:aload_2         
		throw exception;
	//   17   27:monitorexit     
	//   18   28:aload_3         
	//   19   29:athrow          
	}

	public int getActivityIndex(ResolveInfo resolveinfo)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j;
		List list;
		ensureConsistentState();
	//    5    9:aload_0         
	//    6   10:invokespecial   #348 <Method void ensureConsistentState()>
		list = mActivities;
	//    7   13:aload_0         
	//    8   14:getfield        #118 <Field List mActivities>
	//    9   17:astore          5
		j = list.size();
	//   10   19:aload           5
	//   11   21:invokeinterface #227 <Method int List.size()>
	//   12   26:istore_3        
		int i = 0;
	//   13   27:iconst_0        
	//   14   28:istore_2        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   15   29:iload_2         
	//   16   30:iload_3         
	//   17   31:icmpge          68
		ResolveInfo resolveinfo1 = ((ActivityResolveInfo)list.get(i)).resolveInfo;
	//   18   34:aload           5
	//   19   36:iload_2         
	//   20   37:invokeinterface #230 <Method Object List.get(int)>
	//   21   42:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   22   45:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   23   48:astore          6
		if(resolveinfo1 != resolveinfo)
			break MISSING_BLOCK_LABEL_61;
	//   24   50:aload           6
	//   25   52:aload_1         
	//   26   53:if_acmpne       61
		obj;
	//   27   56:aload           4
		JVM INSTR monitorexit ;
	//   28   58:monitorexit     
		return i;
	//   29   59:iload_2         
	//   30   60:ireturn         
		i++;
	//   31   61:iload_2         
	//   32   62:iconst_1        
	//   33   63:iadd            
	//   34   64:istore_2        
		if(true) goto _L2; else goto _L1
	//   35   65:goto            29
	//*  36   68:aload           4
_L1:
		return -1;
	//   37   70:monitorexit     
	//   38   71:iconst_m1       
	//   39   72:ireturn         
		resolveinfo;
	//   40   73:astore_1        
	//*  41   74:aload           4
		throw resolveinfo;
	//   42   76:monitorexit     
	//   43   77:aload_1         
	//   44   78:athrow          
	}

	public ResolveInfo getDefaultActivity()
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ResolveInfo resolveinfo;
		ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #348 <Method void ensureConsistentState()>
		if(mActivities.isEmpty())
			break MISSING_BLOCK_LABEL_44;
	//    7   11:aload_0         
	//    8   12:getfield        #118 <Field List mActivities>
	//    9   15:invokeinterface #334 <Method boolean List.isEmpty()>
	//   10   20:ifne            44
		resolveinfo = ((ActivityResolveInfo)mActivities.get(0)).resolveInfo;
	//   11   23:aload_0         
	//   12   24:getfield        #118 <Field List mActivities>
	//   13   27:iconst_0        
	//   14   28:invokeinterface #230 <Method Object List.get(int)>
	//   15   33:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   16   36:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   17   39:astore_2        
	//*  18   40:aload_1         
	//*  19   41:monitorexit     
		return resolveinfo;
	//   20   42:aload_2         
	//   21   43:areturn         
		obj;
	//   22   44:aload_1         
		JVM INSTR monitorexit ;
	//   23   45:monitorexit     
		  goto _L1
	//*  24   46:goto            54
		Exception exception;
		exception;
	//   25   49:astore_2        
	//*  26   50:aload_1         
		throw exception;
	//   27   51:monitorexit     
	//   28   52:aload_2         
	//   29   53:athrow          
_L1:
		return null;
	//   30   54:aconst_null     
	//   31   55:areturn         
	}

	public int getHistoryMaxSize()
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i = mHistoryMaxSize;
	//    5    7:aload_0         
	//    6    8:getfield        #127 <Field int mHistoryMaxSize>
	//    7   11:istore_1        
		obj;
	//    8   12:aload_2         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return i;
	//   10   14:iload_1         
	//   11   15:ireturn         
		Exception exception;
		exception;
	//   12   16:astore_3        
	//*  13   17:aload_2         
		throw exception;
	//   14   18:monitorexit     
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public int getHistorySize()
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i;
		ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #348 <Method void ensureConsistentState()>
		i = mHistoricalRecords.size();
	//    7   11:aload_0         
	//    8   12:getfield        #120 <Field List mHistoricalRecords>
	//    9   15:invokeinterface #227 <Method int List.size()>
	//   10   20:istore_1        
		obj;
	//   11   21:aload_2         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
		Exception exception;
		exception;
	//   15   25:astore_3        
	//*  16   26:aload_2         
		throw exception;
	//   17   27:monitorexit     
	//   18   28:aload_3         
	//   19   29:athrow          
	}

	public Intent getIntent()
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Intent intent = mIntent;
	//    5    7:aload_0         
	//    6    8:getfield        #210 <Field Intent mIntent>
	//    7   11:astore_2        
		obj;
	//    8   12:aload_1         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return intent;
	//   10   14:aload_2         
	//   11   15:areturn         
		Exception exception;
		exception;
	//   12   16:astore_2        
	//*  13   17:aload_1         
		throw exception;
	//   14   18:monitorexit     
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public void setActivitySorter(ActivitySorter activitysorter)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ActivitySorter activitysorter1 = mActivitySorter;
	//    5    7:aload_0         
	//    6    8:getfield        #125 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//    7   11:astore_3        
		if(activitysorter1 != activitysorter)
			break MISSING_BLOCK_LABEL_20;
	//    8   12:aload_3         
	//    9   13:aload_1         
	//   10   14:if_acmpne       20
		obj;
	//   11   17:aload_2         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		mActivitySorter = activitysorter;
	//   14   20:aload_0         
	//   15   21:aload_1         
	//   16   22:putfield        #125 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
		if(sortActivitiesIfNeeded())
	//*  17   25:aload_0         
	//*  18   26:invokespecial   #185 <Method boolean sortActivitiesIfNeeded()>
	//*  19   29:ifeq            36
			notifyChanged();
	//   20   32:aload_0         
	//   21   33:invokevirtual   #188 <Method void notifyChanged()>
		obj;
	//   22   36:aload_2         
		JVM INSTR monitorexit ;
	//   23   37:monitorexit     
		return;
	//   24   38:return          
		activitysorter;
	//   25   39:astore_1        
	//*  26   40:aload_2         
		throw activitysorter;
	//   27   41:monitorexit     
	//   28   42:aload_1         
	//   29   43:athrow          
	}

	public void setDefaultActivity(int i)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		ActivityResolveInfo activityresolveinfo;
		ActivityResolveInfo activityresolveinfo1;
		ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #348 <Method void ensureConsistentState()>
		activityresolveinfo = (ActivityResolveInfo)mActivities.get(i);
	//    7   11:aload_0         
	//    8   12:getfield        #118 <Field List mActivities>
	//    9   15:iload_1         
	//   10   16:invokeinterface #230 <Method Object List.get(int)>
	//   11   21:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   12   24:astore          4
		activityresolveinfo1 = (ActivityResolveInfo)mActivities.get(0);
	//   13   26:aload_0         
	//   14   27:getfield        #118 <Field List mActivities>
	//   15   30:iconst_0        
	//   16   31:invokeinterface #230 <Method Object List.get(int)>
	//   17   36:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   18   39:astore          5
		if(activityresolveinfo1 == null) goto _L2; else goto _L1
	//   19   41:aload           5
	//   20   43:ifnull          120
_L1:
		float f = (activityresolveinfo1.weight - activityresolveinfo.weight) + 5F;
	//   21   46:aload           5
	//   22   48:getfield        #412 <Field float ActivityChooserModel$ActivityResolveInfo.weight>
	//   23   51:aload           4
	//   24   53:getfield        #412 <Field float ActivityChooserModel$ActivityResolveInfo.weight>
	//   25   56:fsub            
	//   26   57:ldc2            #413 <Float 5F>
	//   27   60:fadd            
	//   28   61:fstore_2        
	//*  29   62:goto            65
_L4:
		addHistoricalRecord(new HistoricalRecord(new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
	//   30   65:aload_0         
	//   31   66:new             #18  <Class ActivityChooserModel$HistoricalRecord>
	//   32   69:dup             
	//   33   70:new             #350 <Class ComponentName>
	//   34   73:dup             
	//   35   74:aload           4
	//   36   76:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   37   79:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   38   82:getfield        #363 <Field String ActivityInfo.packageName>
	//   39   85:aload           4
	//   40   87:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   41   90:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   42   93:getfield        #366 <Field String ActivityInfo.name>
	//   43   96:invokespecial   #369 <Method void ComponentName(String, String)>
	//   44   99:invokestatic    #390 <Method long System.currentTimeMillis()>
	//   45  102:fload_2         
	//   46  103:invokespecial   #393 <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
	//   47  106:invokespecial   #395 <Method boolean addHistoricalRecord(ActivityChooserModel$HistoricalRecord)>
	//   48  109:pop             
		obj;
	//   49  110:aload_3         
		JVM INSTR monitorexit ;
	//   50  111:monitorexit     
		return;
	//   51  112:return          
		Exception exception;
		exception;
	//   52  113:astore          4
	//*  53  115:aload_3         
		throw exception;
	//   54  116:monitorexit     
	//   55  117:aload           4
	//   56  119:athrow          
_L2:
		f = 1.0F;
	//   57  120:fconst_1        
	//   58  121:fstore_2        
		if(true) goto _L4; else goto _L3
	//   59  122:goto            65
_L3:
	}

	public void setHistoryMaxSize(int i)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int j = mHistoryMaxSize;
	//    5    7:aload_0         
	//    6    8:getfield        #127 <Field int mHistoryMaxSize>
	//    7   11:istore_2        
		if(j != i)
			break MISSING_BLOCK_LABEL_20;
	//    8   12:iload_2         
	//    9   13:iload_1         
	//   10   14:icmpne          20
		obj;
	//   11   17:aload_3         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		mHistoryMaxSize = i;
	//   14   20:aload_0         
	//   15   21:iload_1         
	//   16   22:putfield        #127 <Field int mHistoryMaxSize>
		pruneExcessiveHistoricalRecordsIfNeeded();
	//   17   25:aload_0         
	//   18   26:invokespecial   #178 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
		if(sortActivitiesIfNeeded())
	//*  19   29:aload_0         
	//*  20   30:invokespecial   #185 <Method boolean sortActivitiesIfNeeded()>
	//*  21   33:ifeq            40
			notifyChanged();
	//   22   36:aload_0         
	//   23   37:invokevirtual   #188 <Method void notifyChanged()>
		obj;
	//   24   40:aload_3         
		JVM INSTR monitorexit ;
	//   25   41:monitorexit     
		return;
	//   26   42:return          
		Exception exception;
		exception;
	//   27   43:astore          4
	//*  28   45:aload_3         
		throw exception;
	//   29   46:monitorexit     
	//   30   47:aload           4
	//   31   49:athrow          
	}

	public void setIntent(Intent intent)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Intent intent1 = mIntent;
	//    5    7:aload_0         
	//    6    8:getfield        #210 <Field Intent mIntent>
	//    7   11:astore_3        
		if(intent1 != intent)
			break MISSING_BLOCK_LABEL_20;
	//    8   12:aload_3         
	//    9   13:aload_1         
	//   10   14:if_acmpne       20
		obj;
	//   11   17:aload_2         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return;
	//   13   19:return          
		mIntent = intent;
	//   14   20:aload_0         
	//   15   21:aload_1         
	//   16   22:putfield        #210 <Field Intent mIntent>
		mReloadActivities = true;
	//   17   25:aload_0         
	//   18   26:iconst_1        
	//   19   27:putfield        #135 <Field boolean mReloadActivities>
		ensureConsistentState();
	//   20   30:aload_0         
	//   21   31:invokespecial   #348 <Method void ensureConsistentState()>
		obj;
	//   22   34:aload_2         
		JVM INSTR monitorexit ;
	//   23   35:monitorexit     
		return;
	//   24   36:return          
		intent;
	//   25   37:astore_1        
	//*  26   38:aload_2         
		throw intent;
	//   27   39:monitorexit     
	//   28   40:aload_1         
	//   29   41:athrow          
	}

	public void setOnChooseActivityListener(OnChooseActivityListener onchooseactivitylistener)
	{
		Object obj = mInstanceLock;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Object mInstanceLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		mActivityChoserModelPolicy = onchooseactivitylistener;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #380 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
		obj;
	//    8   12:aload_2         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		onchooseactivitylistener;
	//   11   15:astore_1        
	//*  12   16:aload_2         
		throw onchooseactivitylistener;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	static final String ATTRIBUTE_ACTIVITY = "activity";
	static final String ATTRIBUTE_TIME = "time";
	static final String ATTRIBUTE_WEIGHT = "weight";
	static final boolean DEBUG = false;
	private static final int DEFAULT_ACTIVITY_INFLATION = 5;
	private static final float DEFAULT_HISTORICAL_RECORD_WEIGHT = 1F;
	public static final String DEFAULT_HISTORY_FILE_NAME = "activity_choser_model_history.xml";
	public static final int DEFAULT_HISTORY_MAX_LENGTH = 50;
	private static final String HISTORY_FILE_EXTENSION = ".xml";
	private static final int INVALID_INDEX = -1;
	static final String LOG_TAG = ((Class) (android/support/v7/widget/ActivityChooserModel)).getSimpleName();
	static final String TAG_HISTORICAL_RECORD = "historical-record";
	static final String TAG_HISTORICAL_RECORDS = "historical-records";
	private static final Map sDataModelRegistry = new HashMap();
	private static final Object sRegistryLock = new Object();
	private final List mActivities = new ArrayList();
	private OnChooseActivityListener mActivityChoserModelPolicy;
	private ActivitySorter mActivitySorter;
	boolean mCanReadHistoricalData;
	final Context mContext;
	private final List mHistoricalRecords = new ArrayList();
	private boolean mHistoricalRecordsChanged;
	final String mHistoryFileName;
	private int mHistoryMaxSize;
	private final Object mInstanceLock = new Object();
	private Intent mIntent;
	private boolean mReadShareHistoryCalled;
	private boolean mReloadActivities;

	static 
	{
	//    0    0:ldc1            #2   <Class ActivityChooserModel>
	//    1    2:invokevirtual   #94  <Method String Class.getSimpleName()>
	//    2    5:putstatic       #96  <Field String LOG_TAG>
	//    3    8:new             #98  <Class Object>
	//    4   11:dup             
	//    5   12:invokespecial   #101 <Method void Object()>
	//    6   15:putstatic       #103 <Field Object sRegistryLock>
	//    7   18:new             #105 <Class HashMap>
	//    8   21:dup             
	//    9   22:invokespecial   #106 <Method void HashMap()>
	//   10   25:putstatic       #108 <Field Map sDataModelRegistry>
	//*  11   28:return          
	}
}
