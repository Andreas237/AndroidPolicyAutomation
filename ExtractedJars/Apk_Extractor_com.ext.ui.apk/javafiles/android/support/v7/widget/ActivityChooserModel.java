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

	public static final class ActivityResolveInfo
		implements Comparable
	{

		public int compareTo(ActivityResolveInfo activityresolveinfo)
		{
			return Float.floatToIntBits(activityresolveinfo.weight) - Float.floatToIntBits(weight);
		//    0    0:aload_1         
		//    1    1:getfield        #26  <Field float weight>
		//    2    4:invokestatic    #32  <Method int Float.floatToIntBits(float)>
		//    3    7:aload_0         
		//    4    8:getfield        #26  <Field float weight>
		//    5   11:invokestatic    #32  <Method int Float.floatToIntBits(float)>
		//    6   14:isub            
		//    7   15:ireturn         
		}

		public volatile int compareTo(Object obj)
		{
			return compareTo((ActivityResolveInfo)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
		//    3    5:invokevirtual   #35  <Method int compareTo(ActivityChooserModel$ActivityResolveInfo)>
		//    4    8:ireturn         
		}

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
		//*  10   14:invokevirtual   #41  <Method Class Object.getClass()>
		//*  11   17:aload_1         
		//*  12   18:invokevirtual   #41  <Method Class Object.getClass()>
		//*  13   21:if_acmpeq       26
					return false;
		//   14   24:iconst_0        
		//   15   25:ireturn         
				obj = ((Object) ((ActivityResolveInfo)obj));
		//   16   26:aload_1         
		//   17   27:checkcast       #2   <Class ActivityChooserModel$ActivityResolveInfo>
		//   18   30:astore_1        
				if(Float.floatToIntBits(weight) != Float.floatToIntBits(((ActivityResolveInfo) (obj)).weight))
		//*  19   31:aload_0         
		//*  20   32:getfield        #26  <Field float weight>
		//*  21   35:invokestatic    #32  <Method int Float.floatToIntBits(float)>
		//*  22   38:aload_1         
		//*  23   39:getfield        #26  <Field float weight>
		//*  24   42:invokestatic    #32  <Method int Float.floatToIntBits(float)>
		//*  25   45:icmpeq          5
					return false;
		//   26   48:iconst_0        
		//   27   49:ireturn         
			}
			return true;
		}

		public int hashCode()
		{
			return Float.floatToIntBits(weight) + 31;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field float weight>
		//    2    4:invokestatic    #32  <Method int Float.floatToIntBits(float)>
		//    3    7:bipush          31
		//    4    9:iadd            
		//    5   10:ireturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #47  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #48  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append("[");
		//    4    8:aload_1         
		//    5    9:ldc1            #50  <String "[">
		//    6   11:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append("resolveInfo:").append(resolveInfo.toString());
		//    8   15:aload_1         
		//    9   16:ldc1            #56  <String "resolveInfo:">
		//   10   18:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   11   21:aload_0         
		//   12   22:getfield        #21  <Field ResolveInfo resolveInfo>
		//   13   25:invokevirtual   #60  <Method String ResolveInfo.toString()>
		//   14   28:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   15   31:pop             
			stringbuilder.append("; weight:").append(((Object) (new BigDecimal(weight))));
		//   16   32:aload_1         
		//   17   33:ldc1            #62  <String "; weight:">
		//   18   35:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   19   38:new             #64  <Class BigDecimal>
		//   20   41:dup             
		//   21   42:aload_0         
		//   22   43:getfield        #26  <Field float weight>
		//   23   46:f2d             
		//   24   47:invokespecial   #67  <Method void BigDecimal(double)>
		//   25   50:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
		//   26   53:pop             
			stringbuilder.append("]");
		//   27   54:aload_1         
		//   28   55:ldc1            #72  <String "]">
		//   29   57:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
		//   30   60:pop             
			return stringbuilder.toString();
		//   31   61:aload_1         
		//   32   62:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   33   65:areturn         
		}

		public final ResolveInfo resolveInfo;
		public float weight;

		public ActivityResolveInfo(ResolveInfo resolveinfo)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			resolveInfo = resolveinfo;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field ResolveInfo resolveInfo>
		//    5    9:return          
		}
	}

	public static interface ActivitySorter
	{

		public abstract void sort(Intent intent, List list, List list1);
	}

	private static final class DefaultSorter
		implements ActivitySorter
	{

		public void sort(Intent intent, List list, List list1)
		{
			intent = ((Intent) (mPackageNameToActivityMap));
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field Map mPackageNameToActivityMap>
		//    2    4:astore_1        
			((Map) (intent)).clear();
		//    3    5:aload_1         
		//    4    6:invokeinterface #32  <Method void Map.clear()>
			int k = list.size();
		//    5   11:aload_2         
		//    6   12:invokeinterface #38  <Method int List.size()>
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
		//   15   32:invokeinterface #42  <Method Object List.get(int)>
		//   16   37:checkcast       #44  <Class ActivityChooserModel$ActivityResolveInfo>
		//   17   40:astore          8
				activityresolveinfo.weight = 0.0F;
		//   18   42:aload           8
		//   19   44:fconst_0        
		//   20   45:putfield        #47  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
				((Map) (intent)).put(((Object) (new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name))), ((Object) (activityresolveinfo)));
		//   21   48:aload_1         
		//   22   49:new             #49  <Class ComponentName>
		//   23   52:dup             
		//   24   53:aload           8
		//   25   55:getfield        #53  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
		//   26   58:getfield        #59  <Field ActivityInfo ResolveInfo.activityInfo>
		//   27   61:getfield        #65  <Field String ActivityInfo.packageName>
		//   28   64:aload           8
		//   29   66:getfield        #53  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
		//   30   69:getfield        #59  <Field ActivityInfo ResolveInfo.activityInfo>
		//   31   72:getfield        #68  <Field String ActivityInfo.name>
		//   32   75:invokespecial   #71  <Method void ComponentName(String, String)>
		//   33   78:aload           8
		//   34   80:invokeinterface #75  <Method Object Map.put(Object, Object)>
		//   35   85:pop             
			}

		//   36   86:iload           6
		//   37   88:iconst_1        
		//   38   89:iadd            
		//   39   90:istore          6
		//*  40   92:goto            22
			int j = list1.size();
		//   41   95:aload_3         
		//   42   96:invokeinterface #38  <Method int List.size()>
		//   43  101:istore          6
			float f = 1.0F;
		//   44  103:fconst_1        
		//   45  104:fstore          4
			for(j--; j >= 0; j--)
		//*  46  106:iload           6
		//*  47  108:iconst_1        
		//*  48  109:isub            
		//*  49  110:istore          6
		//*  50  112:iload           6
		//*  51  114:iflt            190
			{
				HistoricalRecord historicalrecord = (HistoricalRecord)list1.get(j);
		//   52  117:aload_3         
		//   53  118:iload           6
		//   54  120:invokeinterface #42  <Method Object List.get(int)>
		//   55  125:checkcast       #77  <Class ActivityChooserModel$HistoricalRecord>
		//   56  128:astore          8
				ActivityResolveInfo activityresolveinfo1 = (ActivityResolveInfo)((Map) (intent)).get(((Object) (historicalrecord.activity)));
		//   57  130:aload_1         
		//   58  131:aload           8
		//   59  133:getfield        #81  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
		//   60  136:invokeinterface #84  <Method Object Map.get(Object)>
		//   61  141:checkcast       #44  <Class ActivityChooserModel$ActivityResolveInfo>
		//   62  144:astore          9
				if(activityresolveinfo1 != null)
		//*  63  146:aload           9
		//*  64  148:ifnull          195
				{
					float f1 = activityresolveinfo1.weight;
		//   65  151:aload           9
		//   66  153:getfield        #47  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
		//   67  156:fstore          5
					activityresolveinfo1.weight = historicalrecord.weight * f + f1;
		//   68  158:aload           9
		//   69  160:aload           8
		//   70  162:getfield        #85  <Field float ActivityChooserModel$HistoricalRecord.weight>
		//   71  165:fload           4
		//   72  167:fmul            
		//   73  168:fload           5
		//   74  170:fadd            
		//   75  171:putfield        #47  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
					f = 0.95F * f;
		//   76  174:ldc1            #12  <Float 0.95F>
		//   77  176:fload           4
		//   78  178:fmul            
		//   79  179:fstore          4
				}
			}

		//   80  181:iload           6
		//   81  183:iconst_1        
		//   82  184:isub            
		//   83  185:istore          6
		//*  84  187:goto            112
			Collections.sort(list);
		//   85  190:aload_2         
		//   86  191:invokestatic    #90  <Method void Collections.sort(List)>
		//   87  194:return          
		//*  88  195:goto            181
		}

		private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
		private final Map mPackageNameToActivityMap = new HashMap();

		DefaultSorter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #21  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #22  <Method void HashMap()>
		//    6   12:putfield        #24  <Field Map mPackageNameToActivityMap>
		//    7   15:return          
		}
	}

	public static final class HistoricalRecord
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
				if(Float.floatToIntBits(weight) != Float.floatToIntBits(((HistoricalRecord) (obj)).weight))
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

	private final class PersistHistoryAsyncTask extends AsyncTask
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
			int i;
			List list;
			Object obj1;
			i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			list = (List)aobj[0];
		//    2    2:aload_1         
		//    3    3:iconst_0        
		//    4    4:aaload          
		//    5    5:checkcast       #33  <Class List>
		//    6    8:astore          4
			obj1 = ((Object) ((String)aobj[1]));
		//    7   10:aload_1         
		//    8   11:iconst_1        
		//    9   12:aaload          
		//   10   13:checkcast       #35  <Class String>
		//   11   16:astore          5
			aobj = ((Object []) (mContext.openFileOutput(((String) (obj1)), 0)));
		//   12   18:aload_0         
		//   13   19:getfield        #14  <Field ActivityChooserModel this$0>
		//   14   22:getfield        #39  <Field Context ActivityChooserModel.mContext>
		//   15   25:aload           5
		//   16   27:iconst_0        
		//   17   28:invokevirtual   #45  <Method FileOutputStream Context.openFileOutput(String, int)>
		//   18   31:astore_1        
			obj1 = ((Object) (Xml.newSerializer()));
		//   19   32:invokestatic    #51  <Method XmlSerializer Xml.newSerializer()>
		//   20   35:astore          5
			int j;
			((XmlSerializer) (obj1)).setOutput(((java.io.OutputStream) (aobj)), ((String) (null)));
		//   21   37:aload           5
		//   22   39:aload_1         
		//   23   40:aconst_null     
		//   24   41:invokeinterface #57  <Method void XmlSerializer.setOutput(java.io.OutputStream, String)>
			((XmlSerializer) (obj1)).startDocument("UTF-8", Boolean.valueOf(true));
		//   25   46:aload           5
		//   26   48:ldc1            #59  <String "UTF-8">
		//   27   50:iconst_1        
		//   28   51:invokestatic    #65  <Method Boolean Boolean.valueOf(boolean)>
		//   29   54:invokeinterface #69  <Method void XmlSerializer.startDocument(String, Boolean)>
			((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-records");
		//   30   59:aload           5
		//   31   61:aconst_null     
		//   32   62:ldc1            #71  <String "historical-records">
		//   33   64:invokeinterface #75  <Method XmlSerializer XmlSerializer.startTag(String, String)>
		//   34   69:pop             
			j = list.size();
		//   35   70:aload           4
		//   36   72:invokeinterface #79  <Method int List.size()>
		//   37   77:istore_3        
_L2:
			if(i >= j)
				break; /* Loop/switch isn't completed */
		//   38   78:iload_2         
		//   39   79:iload_3         
		//   40   80:icmpge          213
			HistoricalRecord historicalrecord = (HistoricalRecord)list.remove(0);
		//   41   83:aload           4
		//   42   85:iconst_0        
		//   43   86:invokeinterface #83  <Method Object List.remove(int)>
		//   44   91:checkcast       #85  <Class ActivityChooserModel$HistoricalRecord>
		//   45   94:astore          6
			((XmlSerializer) (obj1)).startTag(((String) (null)), "historical-record");
		//   46   96:aload           5
		//   47   98:aconst_null     
		//   48   99:ldc1            #87  <String "historical-record">
		//   49  101:invokeinterface #75  <Method XmlSerializer XmlSerializer.startTag(String, String)>
		//   50  106:pop             
			((XmlSerializer) (obj1)).attribute(((String) (null)), "activity", historicalrecord.activity.flattenToString());
		//   51  107:aload           5
		//   52  109:aconst_null     
		//   53  110:ldc1            #89  <String "activity">
		//   54  112:aload           6
		//   55  114:getfield        #92  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
		//   56  117:invokevirtual   #98  <Method String ComponentName.flattenToString()>
		//   57  120:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//   58  125:pop             
			((XmlSerializer) (obj1)).attribute(((String) (null)), "time", String.valueOf(historicalrecord.time));
		//   59  126:aload           5
		//   60  128:aconst_null     
		//   61  129:ldc1            #104 <String "time">
		//   62  131:aload           6
		//   63  133:getfield        #107 <Field long ActivityChooserModel$HistoricalRecord.time>
		//   64  136:invokestatic    #110 <Method String String.valueOf(long)>
		//   65  139:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//   66  144:pop             
			((XmlSerializer) (obj1)).attribute(((String) (null)), "weight", String.valueOf(historicalrecord.weight));
		//   67  145:aload           5
		//   68  147:aconst_null     
		//   69  148:ldc1            #112 <String "weight">
		//   70  150:aload           6
		//   71  152:getfield        #115 <Field float ActivityChooserModel$HistoricalRecord.weight>
		//   72  155:invokestatic    #118 <Method String String.valueOf(float)>
		//   73  158:invokeinterface #102 <Method XmlSerializer XmlSerializer.attribute(String, String, String)>
		//   74  163:pop             
			((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-record");
		//   75  164:aload           5
		//   76  166:aconst_null     
		//   77  167:ldc1            #87  <String "historical-record">
		//   78  169:invokeinterface #121 <Method XmlSerializer XmlSerializer.endTag(String, String)>
		//   79  174:pop             
			i++;
		//   80  175:iload_2         
		//   81  176:iconst_1        
		//   82  177:iadd            
		//   83  178:istore_2        
			if(true) goto _L2; else goto _L1
		//   84  179:goto            78
			aobj;
		//   85  182:astore_1        
			Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(((String) (obj1))).toString(), ((Throwable) (aobj)));
		//   86  183:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
		//   87  186:new             #127 <Class StringBuilder>
		//   88  189:dup             
		//   89  190:invokespecial   #128 <Method void StringBuilder()>
		//   90  193:ldc1            #130 <String "Error writing historical record file: ">
		//   91  195:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   92  198:aload           5
		//   93  200:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//   94  203:invokevirtual   #137 <Method String StringBuilder.toString()>
		//   95  206:aload_1         
		//   96  207:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
		//   97  210:pop             
_L3:
			return null;
		//   98  211:aconst_null     
		//   99  212:areturn         
_L1:
			((XmlSerializer) (obj1)).endTag(((String) (null)), "historical-records");
		//  100  213:aload           5
		//  101  215:aconst_null     
		//  102  216:ldc1            #71  <String "historical-records">
		//  103  218:invokeinterface #121 <Method XmlSerializer XmlSerializer.endTag(String, String)>
		//  104  223:pop             
			((XmlSerializer) (obj1)).endDocument();
		//  105  224:aload           5
		//  106  226:invokeinterface #146 <Method void XmlSerializer.endDocument()>
			mCanReadHistoricalData = true;
		//  107  231:aload_0         
		//  108  232:getfield        #14  <Field ActivityChooserModel this$0>
		//  109  235:iconst_1        
		//  110  236:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 111  239:aload_1         
		//* 112  240:ifnull          211
			{
				try
				{
					((FileOutputStream) (aobj)).close();
		//  113  243:aload_1         
		//  114  244:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 115  247:aconst_null     
		//* 116  248:areturn         
				// Misplaced declaration of an exception variable
				catch(Object aobj[])
		//* 117  249:astore_1        
				{
					return null;
		//  118  250:aconst_null     
		//  119  251:areturn         
				}
				return null;
			}
			  goto _L3
			Object obj;
			obj;
		//  120  252:astore          4
			Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		//  121  254:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
		//  122  257:new             #127 <Class StringBuilder>
		//  123  260:dup             
		//  124  261:invokespecial   #128 <Method void StringBuilder()>
		//  125  264:ldc1            #130 <String "Error writing historical record file: ">
		//  126  266:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//  127  269:aload_0         
		//  128  270:getfield        #14  <Field ActivityChooserModel this$0>
		//  129  273:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
		//  130  276:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//  131  279:invokevirtual   #137 <Method String StringBuilder.toString()>
		//  132  282:aload           4
		//  133  284:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
		//  134  287:pop             
			mCanReadHistoricalData = true;
		//  135  288:aload_0         
		//  136  289:getfield        #14  <Field ActivityChooserModel this$0>
		//  137  292:iconst_1        
		//  138  293:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 139  296:aload_1         
		//* 140  297:ifnull          211
			{
				try
				{
					((FileOutputStream) (aobj)).close();
		//  141  300:aload_1         
		//  142  301:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 143  304:aconst_null     
		//* 144  305:areturn         
				// Misplaced declaration of an exception variable
				catch(Object aobj[])
		//* 145  306:astore_1        
				{
					return null;
		//  146  307:aconst_null     
		//  147  308:areturn         
				}
				return null;
			}
			  goto _L3
			obj;
		//  148  309:astore          4
			Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		//  149  311:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
		//  150  314:new             #127 <Class StringBuilder>
		//  151  317:dup             
		//  152  318:invokespecial   #128 <Method void StringBuilder()>
		//  153  321:ldc1            #130 <String "Error writing historical record file: ">
		//  154  323:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//  155  326:aload_0         
		//  156  327:getfield        #14  <Field ActivityChooserModel this$0>
		//  157  330:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
		//  158  333:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//  159  336:invokevirtual   #137 <Method String StringBuilder.toString()>
		//  160  339:aload           4
		//  161  341:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
		//  162  344:pop             
			mCanReadHistoricalData = true;
		//  163  345:aload_0         
		//  164  346:getfield        #14  <Field ActivityChooserModel this$0>
		//  165  349:iconst_1        
		//  166  350:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 167  353:aload_1         
		//* 168  354:ifnull          211
			{
				try
				{
					((FileOutputStream) (aobj)).close();
		//  169  357:aload_1         
		//  170  358:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 171  361:aconst_null     
		//* 172  362:areturn         
				// Misplaced declaration of an exception variable
				catch(Object aobj[])
		//* 173  363:astore_1        
				{
					return null;
		//  174  364:aconst_null     
		//  175  365:areturn         
				}
				return null;
			}
			  goto _L3
			obj;
		//  176  366:astore          4
			Log.e(ActivityChooserModel.LOG_TAG, (new StringBuilder()).append("Error writing historical record file: ").append(mHistoryFileName).toString(), ((Throwable) (obj)));
		//  177  368:getstatic       #125 <Field String ActivityChooserModel.LOG_TAG>
		//  178  371:new             #127 <Class StringBuilder>
		//  179  374:dup             
		//  180  375:invokespecial   #128 <Method void StringBuilder()>
		//  181  378:ldc1            #130 <String "Error writing historical record file: ">
		//  182  380:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//  183  383:aload_0         
		//  184  384:getfield        #14  <Field ActivityChooserModel this$0>
		//  185  387:getfield        #158 <Field String ActivityChooserModel.mHistoryFileName>
		//  186  390:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
		//  187  393:invokevirtual   #137 <Method String StringBuilder.toString()>
		//  188  396:aload           4
		//  189  398:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
		//  190  401:pop             
			mCanReadHistoricalData = true;
		//  191  402:aload_0         
		//  192  403:getfield        #14  <Field ActivityChooserModel this$0>
		//  193  406:iconst_1        
		//  194  407:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj == null) goto _L3; else goto _L4
		//  195  410:aload_1         
		//  196  411:ifnull          211
_L4:
			try
			{
				((FileOutputStream) (aobj)).close();
		//  197  414:aload_1         
		//  198  415:invokevirtual   #155 <Method void FileOutputStream.close()>
			}
		//* 199  418:aconst_null     
		//* 200  419:areturn         
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
		//* 201  420:astore_1        
			{
				return null;
		//  202  421:aconst_null     
		//  203  422:areturn         
			}
			return null;
			obj;
		//  204  423:astore          4
			mCanReadHistoricalData = true;
		//  205  425:aload_0         
		//  206  426:getfield        #14  <Field ActivityChooserModel this$0>
		//  207  429:iconst_1        
		//  208  430:putfield        #150 <Field boolean ActivityChooserModel.mCanReadHistoricalData>
			if(aobj != null)
		//* 209  433:aload_1         
		//* 210  434:ifnull          441
				try
				{
					((FileOutputStream) (aobj)).close();
		//  211  437:aload_1         
		//  212  438:invokevirtual   #155 <Method void FileOutputStream.close()>
				}
		//* 213  441:aload           4
		//* 214  443:athrow          
				// Misplaced declaration of an exception variable
				catch(Object aobj[]) { }
		//  215  444:astore_1        
			throw obj;
		//* 216  445:goto            441
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
	//   20   42:invokespecial   #121 <Method void ActivityChooserModel$DefaultSorter()>
	//   21   45:putfield        #123 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
		mHistoryMaxSize = 50;
	//   22   48:aload_0         
	//   23   49:bipush          50
	//   24   51:putfield        #125 <Field int mHistoryMaxSize>
		mCanReadHistoricalData = true;
	//   25   54:aload_0         
	//   26   55:iconst_1        
	//   27   56:putfield        #127 <Field boolean mCanReadHistoricalData>
		mReadShareHistoryCalled = false;
	//   28   59:aload_0         
	//   29   60:iconst_0        
	//   30   61:putfield        #129 <Field boolean mReadShareHistoryCalled>
		mHistoricalRecordsChanged = true;
	//   31   64:aload_0         
	//   32   65:iconst_1        
	//   33   66:putfield        #131 <Field boolean mHistoricalRecordsChanged>
		mReloadActivities = false;
	//   34   69:aload_0         
	//   35   70:iconst_0        
	//   36   71:putfield        #133 <Field boolean mReloadActivities>
		mContext = context.getApplicationContext();
	//   37   74:aload_0         
	//   38   75:aload_1         
	//   39   76:invokevirtual   #139 <Method Context Context.getApplicationContext()>
	//   40   79:putfield        #141 <Field Context mContext>
		if(!TextUtils.isEmpty(((CharSequence) (s))) && !s.endsWith(".xml"))
	//*  41   82:aload_2         
	//*  42   83:invokestatic    #147 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  43   86:ifne            122
	//*  44   89:aload_2         
	//*  45   90:ldc1            #52  <String ".xml">
	//*  46   92:invokevirtual   #153 <Method boolean String.endsWith(String)>
	//*  47   95:ifne            122
		{
			mHistoryFileName = (new StringBuilder()).append(s).append(".xml").toString();
	//   48   98:aload_0         
	//   49   99:new             #155 <Class StringBuilder>
	//   50  102:dup             
	//   51  103:invokespecial   #156 <Method void StringBuilder()>
	//   52  106:aload_2         
	//   53  107:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   54  110:ldc1            #52  <String ".xml">
	//   55  112:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   56  115:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   57  118:putfield        #165 <Field String mHistoryFileName>
			return;
	//   58  121:return          
		} else
		{
			mHistoryFileName = s;
	//   59  122:aload_0         
	//   60  123:aload_2         
	//   61  124:putfield        #165 <Field String mHistoryFileName>
			return;
	//   62  127:return          
		}
	}

	private boolean addHistoricalRecord(HistoricalRecord historicalrecord)
	{
		boolean flag = mHistoricalRecords.add(((Object) (historicalrecord)));
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List mHistoricalRecords>
	//    2    4:aload_1         
	//    3    5:invokeinterface #173 <Method boolean List.add(Object)>
	//    4   10:istore_2        
		if(flag)
	//*   5   11:iload_2         
	//*   6   12:ifeq            37
		{
			mHistoricalRecordsChanged = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #131 <Field boolean mHistoricalRecordsChanged>
			pruneExcessiveHistoricalRecordsIfNeeded();
	//   10   20:aload_0         
	//   11   21:invokespecial   #176 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
			persistHistoricalDataIfNeeded();
	//   12   24:aload_0         
	//   13   25:invokespecial   #179 <Method void persistHistoricalDataIfNeeded()>
			sortActivitiesIfNeeded();
	//   14   28:aload_0         
	//   15   29:invokespecial   #183 <Method boolean sortActivitiesIfNeeded()>
	//   16   32:pop             
			notifyChanged();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #186 <Method void notifyChanged()>
		}
		return flag;
	//   19   37:iload_2         
	//   20   38:ireturn         
	}

	private void ensureConsistentState()
	{
		boolean flag = loadActivitiesIfNeeded();
	//    0    0:aload_0         
	//    1    1:invokespecial   #190 <Method boolean loadActivitiesIfNeeded()>
	//    2    4:istore_1        
		boolean flag1 = readHistoricalDataIfNeeded();
	//    3    5:aload_0         
	//    4    6:invokespecial   #193 <Method boolean readHistoricalDataIfNeeded()>
	//    5    9:istore_2        
		pruneExcessiveHistoricalRecordsIfNeeded();
	//    6   10:aload_0         
	//    7   11:invokespecial   #176 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
		if(flag | flag1)
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:ior             
	//*  11   17:ifeq            29
		{
			sortActivitiesIfNeeded();
	//   12   20:aload_0         
	//   13   21:invokespecial   #183 <Method boolean sortActivitiesIfNeeded()>
	//   14   24:pop             
			notifyChanged();
	//   15   25:aload_0         
	//   16   26:invokevirtual   #186 <Method void notifyChanged()>
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
	//    6   12:invokeinterface #200 <Method Object Map.get(Object)>
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
	//   17   33:invokespecial   #202 <Method void ActivityChooserModel(Context, String)>
	//   18   36:astore_2        
		sDataModelRegistry.put(((Object) (s)), ((Object) (activitychoosermodel)));
	//   19   37:getstatic       #108 <Field Map sDataModelRegistry>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokeinterface #206 <Method Object Map.put(Object, Object)>
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
		obj;
	//   29   54:aload           4
		JVM INSTR monitorexit ;
	//   30   56:monitorexit     
		throw context;
	//   31   57:aload_0         
	//   32   58:athrow          
	}

	private boolean loadActivitiesIfNeeded()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		boolean flag = flag1;
	//    2    3:iload           4
	//    3    5:istore_3        
		if(mReloadActivities)
	//*   4    6:aload_0         
	//*   5    7:getfield        #133 <Field boolean mReloadActivities>
	//*   6   10:ifeq            110
		{
			flag = flag1;
	//    7   13:iload           4
	//    8   15:istore_3        
			if(mIntent != null)
	//*   9   16:aload_0         
	//*  10   17:getfield        #208 <Field Intent mIntent>
	//*  11   20:ifnull          110
			{
				mReloadActivities = false;
	//   12   23:aload_0         
	//   13   24:iconst_0        
	//   14   25:putfield        #133 <Field boolean mReloadActivities>
				mActivities.clear();
	//   15   28:aload_0         
	//   16   29:getfield        #118 <Field List mActivities>
	//   17   32:invokeinterface #211 <Method void List.clear()>
				List list = mContext.getPackageManager().queryIntentActivities(mIntent, 0);
	//   18   37:aload_0         
	//   19   38:getfield        #141 <Field Context mContext>
	//   20   41:invokevirtual   #215 <Method PackageManager Context.getPackageManager()>
	//   21   44:aload_0         
	//   22   45:getfield        #208 <Field Intent mIntent>
	//   23   48:iconst_0        
	//   24   49:invokevirtual   #221 <Method List PackageManager.queryIntentActivities(Intent, int)>
	//   25   52:astore          5
				int j = list.size();
	//   26   54:aload           5
	//   27   56:invokeinterface #225 <Method int List.size()>
	//   28   61:istore_2        
				for(int i = 0; i < j; i++)
	//*  29   62:iconst_0        
	//*  30   63:istore_1        
	//*  31   64:iload_1         
	//*  32   65:iload_2         
	//*  33   66:icmpge          108
				{
					ResolveInfo resolveinfo = (ResolveInfo)list.get(i);
	//   34   69:aload           5
	//   35   71:iload_1         
	//   36   72:invokeinterface #228 <Method Object List.get(int)>
	//   37   77:checkcast       #230 <Class ResolveInfo>
	//   38   80:astore          6
					mActivities.add(((Object) (new ActivityResolveInfo(resolveinfo))));
	//   39   82:aload_0         
	//   40   83:getfield        #118 <Field List mActivities>
	//   41   86:new             #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   42   89:dup             
	//   43   90:aload           6
	//   44   92:invokespecial   #233 <Method void ActivityChooserModel$ActivityResolveInfo(ResolveInfo)>
	//   45   95:invokeinterface #173 <Method boolean List.add(Object)>
	//   46  100:pop             
				}

	//   47  101:iload_1         
	//   48  102:iconst_1        
	//   49  103:iadd            
	//   50  104:istore_1        
	//*  51  105:goto            64
				flag = true;
	//   52  108:iconst_1        
	//   53  109:istore_3        
			}
		}
		return flag;
	//   54  110:iload_3         
	//   55  111:ireturn         
	}

	private void persistHistoricalDataIfNeeded()
	{
		if(!mReadShareHistoryCalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field boolean mReadShareHistoryCalled>
	//*   2    4:ifne            17
			throw new IllegalStateException("No preceding call to #readHistoricalData");
	//    3    7:new             #235 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #237 <String "No preceding call to #readHistoricalData">
	//    6   13:invokespecial   #240 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(mHistoricalRecordsChanged)
	//*   8   17:aload_0         
	//*   9   18:getfield        #131 <Field boolean mHistoricalRecordsChanged>
	//*  10   21:ifne            25
	//*  11   24:return          
		{
			mHistoricalRecordsChanged = false;
	//   12   25:aload_0         
	//   13   26:iconst_0        
	//   14   27:putfield        #131 <Field boolean mHistoricalRecordsChanged>
			if(!TextUtils.isEmpty(((CharSequence) (mHistoryFileName))))
	//*  15   30:aload_0         
	//*  16   31:getfield        #165 <Field String mHistoryFileName>
	//*  17   34:invokestatic    #147 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   37:ifne            24
			{
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
	//   37   72:getfield        #165 <Field String mHistoryFileName>
	//   38   75:aastore         
	//   39   76:invokevirtual   #256 <Method AsyncTask ActivityChooserModel$PersistHistoryAsyncTask.executeOnExecutor(java.util.concurrent.Executor, Object[])>
	//   40   79:pop             
				return;
	//   41   80:return          
			}
		}
	}

	private void pruneExcessiveHistoricalRecordsIfNeeded()
	{
		int j = mHistoricalRecords.size() - mHistoryMaxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field List mHistoricalRecords>
	//    2    4:invokeinterface #225 <Method int List.size()>
	//    3    9:aload_0         
	//    4   10:getfield        #125 <Field int mHistoryMaxSize>
	//    5   13:isub            
	//    6   14:istore_2        
		if(j > 0)
	//*   7   15:iload_2         
	//*   8   16:ifgt            20
	//*   9   19:return          
		{
			mHistoricalRecordsChanged = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #131 <Field boolean mHistoricalRecordsChanged>
			int i = 0;
	//   13   25:iconst_0        
	//   14   26:istore_1        
			while(i < j) 
	//*  15   27:iload_1         
	//*  16   28:iload_2         
	//*  17   29:icmpge          19
			{
				HistoricalRecord historicalrecord = (HistoricalRecord)mHistoricalRecords.remove(0);
	//   18   32:aload_0         
	//   19   33:getfield        #120 <Field List mHistoricalRecords>
	//   20   36:iconst_0        
	//   21   37:invokeinterface #259 <Method Object List.remove(int)>
	//   22   42:checkcast       #18  <Class ActivityChooserModel$HistoricalRecord>
	//   23   45:astore_3        
				i++;
	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_1        
			}
		}
	//*  28   50:goto            27
	}

	private boolean readHistoricalDataIfNeeded()
	{
		if(mCanReadHistoricalData && mHistoricalRecordsChanged && !TextUtils.isEmpty(((CharSequence) (mHistoryFileName))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field boolean mCanReadHistoricalData>
	//*   2    4:ifeq            40
	//*   3    7:aload_0         
	//*   4    8:getfield        #131 <Field boolean mHistoricalRecordsChanged>
	//*   5   11:ifeq            40
	//*   6   14:aload_0         
	//*   7   15:getfield        #165 <Field String mHistoryFileName>
	//*   8   18:invokestatic    #147 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   21:ifne            40
		{
			mCanReadHistoricalData = false;
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:putfield        #127 <Field boolean mCanReadHistoricalData>
			mReadShareHistoryCalled = true;
	//   13   29:aload_0         
	//   14   30:iconst_1        
	//   15   31:putfield        #129 <Field boolean mReadShareHistoryCalled>
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
		int i;
		Object obj;
		Object obj1;
		Exception exception;
		List list;
		try
		{
			obj = ((Object) (mContext.openFileInput(mHistoryFileName)));
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #165 <Field String mHistoryFileName>
	//    4    8:invokevirtual   #272 <Method FileInputStream Context.openFileInput(String)>
	//    5   11:astore_2        
		}
	//*   6   12:invokestatic    #278 <Method XmlPullParser Xml.newPullParser()>
	//*   7   15:astore_3        
	//*   8   16:aload_3         
	//*   9   17:aload_2         
	//*  10   18:ldc2            #280 <String "UTF-8">
	//*  11   21:invokeinterface #286 <Method void XmlPullParser.setInput(java.io.InputStream, String)>
	//*  12   26:iconst_0        
	//*  13   27:istore_1        
	//*  14   28:iload_1         
	//*  15   29:iconst_1        
	//*  16   30:icmpeq          48
	//*  17   33:iload_1         
	//*  18   34:iconst_2        
	//*  19   35:icmpeq          48
	//*  20   38:aload_3         
	//*  21   39:invokeinterface #289 <Method int XmlPullParser.next()>
	//*  22   44:istore_1        
	//*  23   45:goto            28
	//*  24   48:ldc1            #61  <String "historical-records">
	//*  25   50:aload_3         
	//*  26   51:invokeinterface #292 <Method String XmlPullParser.getName()>
	//*  27   56:invokevirtual   #295 <Method boolean String.equals(Object)>
	//*  28   59:ifne            114
	//*  29   62:new             #266 <Class XmlPullParserException>
	//*  30   65:dup             
	//*  31   66:ldc2            #297 <String "Share records file does not start with historical-records tag.">
	//*  32   69:invokespecial   #298 <Method void XmlPullParserException(String)>
	//*  33   72:athrow          
	//*  34   73:astore_3        
	//*  35   74:getstatic       #96  <Field String LOG_TAG>
	//*  36   77:new             #155 <Class StringBuilder>
	//*  37   80:dup             
	//*  38   81:invokespecial   #156 <Method void StringBuilder()>
	//*  39   84:ldc2            #300 <String "Error reading historical recrod file: ">
	//*  40   87:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  41   90:aload_0         
	//*  42   91:getfield        #165 <Field String mHistoryFileName>
	//*  43   94:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  44   97:invokevirtual   #163 <Method String StringBuilder.toString()>
	//*  45  100:aload_3         
	//*  46  101:invokestatic    #306 <Method int Log.e(String, String, Throwable)>
	//*  47  104:pop             
	//*  48  105:aload_2         
	//*  49  106:ifnull          113
	//*  50  109:aload_2         
	//*  51  110:invokevirtual   #311 <Method void FileInputStream.close()>
	//*  52  113:return          
	//*  53  114:aload_0         
	//*  54  115:getfield        #120 <Field List mHistoricalRecords>
	//*  55  118:astore          4
	//*  56  120:aload           4
	//*  57  122:invokeinterface #211 <Method void List.clear()>
	//*  58  127:aload_3         
	//*  59  128:invokeinterface #289 <Method int XmlPullParser.next()>
	//*  60  133:istore_1        
	//*  61  134:iload_1         
	//*  62  135:iconst_1        
	//*  63  136:icmpne          150
	//*  64  139:aload_2         
	//*  65  140:ifnull          113
	//*  66  143:aload_2         
	//*  67  144:invokevirtual   #311 <Method void FileInputStream.close()>
	//*  68  147:return          
	//*  69  148:astore_2        
	//*  70  149:return          
	//*  71  150:iload_1         
	//*  72  151:iconst_3        
	//*  73  152:icmpeq          127
	//*  74  155:iload_1         
	//*  75  156:iconst_4        
	//*  76  157:icmpeq          127
	//*  77  160:ldc1            #58  <String "historical-record">
	//*  78  162:aload_3         
	//*  79  163:invokeinterface #292 <Method String XmlPullParser.getName()>
	//*  80  168:invokevirtual   #295 <Method boolean String.equals(Object)>
	//*  81  171:ifne            228
	//*  82  174:new             #266 <Class XmlPullParserException>
	//*  83  177:dup             
	//*  84  178:ldc2            #313 <String "Share records file not well-formed.">
	//*  85  181:invokespecial   #298 <Method void XmlPullParserException(String)>
	//*  86  184:athrow          
	//*  87  185:astore_3        
	//*  88  186:getstatic       #96  <Field String LOG_TAG>
	//*  89  189:new             #155 <Class StringBuilder>
	//*  90  192:dup             
	//*  91  193:invokespecial   #156 <Method void StringBuilder()>
	//*  92  196:ldc2            #300 <String "Error reading historical recrod file: ">
	//*  93  199:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  94  202:aload_0         
	//*  95  203:getfield        #165 <Field String mHistoryFileName>
	//*  96  206:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  97  209:invokevirtual   #163 <Method String StringBuilder.toString()>
	//*  98  212:aload_3         
	//*  99  213:invokestatic    #306 <Method int Log.e(String, String, Throwable)>
	//* 100  216:pop             
	//* 101  217:aload_2         
	//* 102  218:ifnull          113
	//* 103  221:aload_2         
	//* 104  222:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 105  225:return          
	//* 106  226:astore_2        
	//* 107  227:return          
	//* 108  228:aload           4
	//* 109  230:new             #18  <Class ActivityChooserModel$HistoricalRecord>
	//* 110  233:dup             
	//* 111  234:aload_3         
	//* 112  235:aconst_null     
	//* 113  236:ldc1            #29  <String "activity">
	//* 114  238:invokeinterface #317 <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 115  243:aload_3         
	//* 116  244:aconst_null     
	//* 117  245:ldc1            #32  <String "time">
	//* 118  247:invokeinterface #317 <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 119  252:invokestatic    #323 <Method long Long.parseLong(String)>
	//* 120  255:aload_3         
	//* 121  256:aconst_null     
	//* 122  257:ldc1            #35  <String "weight">
	//* 123  259:invokeinterface #317 <Method String XmlPullParser.getAttributeValue(String, String)>
	//* 124  264:invokestatic    #329 <Method float Float.parseFloat(String)>
	//* 125  267:invokespecial   #332 <Method void ActivityChooserModel$HistoricalRecord(String, long, float)>
	//* 126  270:invokeinterface #173 <Method boolean List.add(Object)>
	//* 127  275:pop             
	//* 128  276:goto            127
	//* 129  279:astore_3        
	//* 130  280:aload_2         
	//* 131  281:ifnull          288
	//* 132  284:aload_2         
	//* 133  285:invokevirtual   #311 <Method void FileInputStream.close()>
	//* 134  288:aload_3         
	//* 135  289:athrow          
	//* 136  290:astore_2        
	//* 137  291:return          
	//* 138  292:astore_2        
	//* 139  293:goto            288
		catch(FileNotFoundException filenotfoundexception)
	//* 140  296:astore_2        
		{
			return;
	//  141  297:return          
		}
		obj1 = ((Object) (Xml.newPullParser()));
		((XmlPullParser) (obj1)).setInput(((java.io.InputStream) (obj)), "UTF-8");
		i = 0;
_L1:
		if(i == 1 || i == 2)
			break MISSING_BLOCK_LABEL_48;
		i = ((XmlPullParser) (obj1)).next();
		  goto _L1
		if(!"historical-records".equals(((Object) (((XmlPullParser) (obj1)).getName()))))
			throw new XmlPullParserException("Share records file does not start with historical-records tag.");
		  goto _L2
		obj1;
		Log.e(LOG_TAG, (new StringBuilder()).append("Error reading historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj1)));
		if(obj == null)
			break MISSING_BLOCK_LABEL_113;
		((FileInputStream) (obj)).close();
_L6:
		return;
_L2:
		list = mHistoricalRecords;
		list.clear();
_L8:
		i = ((XmlPullParser) (obj1)).next();
		if(i != 1) goto _L4; else goto _L3
_L3:
		if(obj == null) goto _L6; else goto _L5
_L5:
		try
		{
			((FileInputStream) (obj)).close();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			return;
		}
_L4:
		if(i == 3 || i == 4) goto _L8; else goto _L7
_L7:
		if(!"historical-record".equals(((Object) (((XmlPullParser) (obj1)).getName()))))
			throw new XmlPullParserException("Share records file not well-formed.");
		break MISSING_BLOCK_LABEL_228;
		obj1;
		Log.e(LOG_TAG, (new StringBuilder()).append("Error reading historical recrod file: ").append(mHistoryFileName).toString(), ((Throwable) (obj1)));
		if(obj == null) goto _L6; else goto _L9
_L9:
		try
		{
			((FileInputStream) (obj)).close();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			return;
		}
		list.add(((Object) (new HistoricalRecord(((XmlPullParser) (obj1)).getAttributeValue(((String) (null)), "activity"), Long.parseLong(((XmlPullParser) (obj1)).getAttributeValue(((String) (null)), "time")), Float.parseFloat(((XmlPullParser) (obj1)).getAttributeValue(((String) (null)), "weight"))))));
		  goto _L8
		exception;
		IOException ioexception;
		if(obj != null)
			try
			{
				((FileInputStream) (obj)).close();
			}
			catch(IOException ioexception1) { }
		throw exception;
		ioexception;
	}

	private boolean sortActivitiesIfNeeded()
	{
		if(mActivitySorter != null && mIntent != null && !mActivities.isEmpty() && !mHistoricalRecords.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #123 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//*   2    4:ifnull          64
	//*   3    7:aload_0         
	//*   4    8:getfield        #208 <Field Intent mIntent>
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
	//   15   39:getfield        #123 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//   16   42:aload_0         
	//   17   43:getfield        #208 <Field Intent mIntent>
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
label0:
		{
			synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mIntent != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #208 <Field Intent mIntent>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		Object obj1;
		Intent intent;
		ensureConsistentState();
	//   12   18:aload_0         
	//   13   19:invokespecial   #348 <Method void ensureConsistentState()>
		obj1 = ((Object) ((ActivityResolveInfo)mActivities.get(i)));
	//   14   22:aload_0         
	//   15   23:getfield        #118 <Field List mActivities>
	//   16   26:iload_1         
	//   17   27:invokeinterface #228 <Method Object List.get(int)>
	//   18   32:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   19   35:astore_3        
		obj1 = ((Object) (new ComponentName(((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.packageName, ((ActivityResolveInfo) (obj1)).resolveInfo.activityInfo.name)));
	//   20   36:new             #350 <Class ComponentName>
	//   21   39:dup             
	//   22   40:aload_3         
	//   23   41:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   24   44:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   25   47:getfield        #363 <Field String ActivityInfo.packageName>
	//   26   50:aload_3         
	//   27   51:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   28   54:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   29   57:getfield        #366 <Field String ActivityInfo.name>
	//   30   60:invokespecial   #369 <Method void ComponentName(String, String)>
	//   31   63:astore_3        
		intent = new Intent(mIntent);
	//   32   64:new             #371 <Class Intent>
	//   33   67:dup             
	//   34   68:aload_0         
	//   35   69:getfield        #208 <Field Intent mIntent>
	//   36   72:invokespecial   #374 <Method void Intent(Intent)>
	//   37   75:astore          4
		intent.setComponent(((ComponentName) (obj1)));
	//   38   77:aload           4
	//   39   79:aload_3         
	//   40   80:invokevirtual   #378 <Method Intent Intent.setComponent(ComponentName)>
	//   41   83:pop             
		if(mActivityChoserModelPolicy == null)
			break MISSING_BLOCK_LABEL_121;
	//   42   84:aload_0         
	//   43   85:getfield        #380 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
	//   44   88:ifnull          121
		Intent intent1 = new Intent(intent);
	//   45   91:new             #371 <Class Intent>
	//   46   94:dup             
	//   47   95:aload           4
	//   48   97:invokespecial   #374 <Method void Intent(Intent)>
	//   49  100:astore          5
		if(!mActivityChoserModelPolicy.onChooseActivity(this, intent1))
			break MISSING_BLOCK_LABEL_121;
	//   50  102:aload_0         
	//   51  103:getfield        #380 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
	//   52  106:aload_0         
	//   53  107:aload           5
	//   54  109:invokeinterface #384 <Method boolean ActivityChooserModel$OnChooseActivityListener.onChooseActivity(ActivityChooserModel, Intent)>
	//   55  114:ifeq            121
		obj;
	//   56  117:aload_2         
		JVM INSTR monitorexit ;
	//   57  118:monitorexit     
		return null;
	//   58  119:aconst_null     
	//   59  120:areturn         
		addHistoricalRecord(new HistoricalRecord(((ComponentName) (obj1)), System.currentTimeMillis(), 1.0F));
	//   60  121:aload_0         
	//   61  122:new             #18  <Class ActivityChooserModel$HistoricalRecord>
	//   62  125:dup             
	//   63  126:aload_3         
	//   64  127:invokestatic    #390 <Method long System.currentTimeMillis()>
	//   65  130:fconst_1        
	//   66  131:invokespecial   #393 <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
	//   67  134:invokespecial   #395 <Method boolean addHistoricalRecord(ActivityChooserModel$HistoricalRecord)>
	//   68  137:pop             
		obj;
	//   69  138:aload_2         
		JVM INSTR monitorexit ;
	//   70  139:monitorexit     
		return intent;
	//   71  140:aload           4
	//   72  142:areturn         
		exception;
	//   73  143:astore_3        
		obj;
	//   74  144:aload_2         
		JVM INSTR monitorexit ;
	//   75  145:monitorexit     
		throw exception;
	//   76  146:aload_3         
	//   77  147:athrow          
	}

	public ResolveInfo getActivity(int i)
	{
		ResolveInfo resolveinfo;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #348 <Method void ensureConsistentState()>
			resolveinfo = ((ActivityResolveInfo)mActivities.get(i)).resolveInfo;
	//    7   11:aload_0         
	//    8   12:getfield        #118 <Field List mActivities>
	//    9   15:iload_1         
	//   10   16:invokeinterface #228 <Method Object List.get(int)>
	//   11   21:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   12   24:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   13   27:astore_3        
		}
	//   14   28:aload_2         
	//   15   29:monitorexit     
		return resolveinfo;
	//   16   30:aload_3         
	//   17   31:areturn         
		exception;
	//   18   32:astore_3        
		obj;
	//   19   33:aload_2         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		throw exception;
	//   21   35:aload_3         
	//   22   36:athrow          
	}

	public int getActivityCount()
	{
		int i;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #348 <Method void ensureConsistentState()>
			i = mActivities.size();
	//    7   11:aload_0         
	//    8   12:getfield        #118 <Field List mActivities>
	//    9   15:invokeinterface #225 <Method int List.size()>
	//   10   20:istore_1        
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
		exception;
	//   15   25:astore_3        
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
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
	//   11   21:invokeinterface #225 <Method int List.size()>
	//   12   26:istore_3        
		int i = 0;
	//   13   27:iconst_0        
	//   14   28:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_57;
	//   15   29:iload_2         
	//   16   30:iload_3         
	//   17   31:icmpge          57
		if(((ActivityResolveInfo)list.get(i)).resolveInfo != resolveinfo)
			break MISSING_BLOCK_LABEL_68;
	//   18   34:aload           5
	//   19   36:iload_2         
	//   20   37:invokeinterface #228 <Method Object List.get(int)>
	//   21   42:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   22   45:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   23   48:aload_1         
	//   24   49:if_acmpne       68
		obj;
	//   25   52:aload           4
		JVM INSTR monitorexit ;
	//   26   54:monitorexit     
		return i;
	//   27   55:iload_2         
	//   28   56:ireturn         
		obj;
	//   29   57:aload           4
		JVM INSTR monitorexit ;
	//   30   59:monitorexit     
		return -1;
	//   31   60:iconst_m1       
	//   32   61:ireturn         
		resolveinfo;
	//   33   62:astore_1        
		obj;
	//   34   63:aload           4
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		throw resolveinfo;
	//   36   66:aload_1         
	//   37   67:athrow          
		i++;
	//   38   68:iload_2         
	//   39   69:iconst_1        
	//   40   70:iadd            
	//   41   71:istore_2        
		if(true) goto _L2; else goto _L1
	//   42   72:goto            29
_L1:
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
	//   14   28:invokeinterface #228 <Method Object List.get(int)>
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
		return null;
	//   24   46:aconst_null     
	//   25   47:areturn         
		Exception exception;
		exception;
	//   26   48:astore_2        
		obj;
	//   27   49:aload_1         
		JVM INSTR monitorexit ;
	//   28   50:monitorexit     
		throw exception;
	//   29   51:aload_2         
	//   30   52:athrow          
	}

	public int getHistoryMaxSize()
	{
		int i;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = mHistoryMaxSize;
	//    5    7:aload_0         
	//    6    8:getfield        #125 <Field int mHistoryMaxSize>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return i;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public int getHistorySize()
	{
		int i;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			ensureConsistentState();
	//    5    7:aload_0         
	//    6    8:invokespecial   #348 <Method void ensureConsistentState()>
			i = mHistoricalRecords.size();
	//    7   11:aload_0         
	//    8   12:getfield        #120 <Field List mHistoricalRecords>
	//    9   15:invokeinterface #225 <Method int List.size()>
	//   10   20:istore_1        
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
		exception;
	//   15   25:astore_3        
		obj;
	//   16   26:aload_2         
		JVM INSTR monitorexit ;
	//   17   27:monitorexit     
		throw exception;
	//   18   28:aload_3         
	//   19   29:athrow          
	}

	public Intent getIntent()
	{
		Intent intent;
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			intent = mIntent;
	//    5    7:aload_0         
	//    6    8:getfield        #208 <Field Intent mIntent>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return intent;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public void setActivitySorter(ActivitySorter activitysorter)
	{
label0:
		{
			synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mActivitySorter != activitysorter)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #123 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
	//    7   11:aload_1         
	//    8   12:if_acmpne       18
			}
	//    9   15:aload_2         
	//   10   16:monitorexit     
			return;
	//   11   17:return          
		}
		mActivitySorter = activitysorter;
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:putfield        #123 <Field ActivityChooserModel$ActivitySorter mActivitySorter>
		if(sortActivitiesIfNeeded())
	//*  15   23:aload_0         
	//*  16   24:invokespecial   #183 <Method boolean sortActivitiesIfNeeded()>
	//*  17   27:ifeq            34
			notifyChanged();
	//   18   30:aload_0         
	//   19   31:invokevirtual   #186 <Method void notifyChanged()>
		obj;
	//   20   34:aload_2         
		JVM INSTR monitorexit ;
	//   21   35:monitorexit     
		return;
	//   22   36:return          
		activitysorter;
	//   23   37:astore_1        
		obj;
	//   24   38:aload_2         
		JVM INSTR monitorexit ;
	//   25   39:monitorexit     
		throw activitysorter;
	//   26   40:aload_1         
	//   27   41:athrow          
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
	//   10   16:invokeinterface #228 <Method Object List.get(int)>
	//   11   21:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   12   24:astore          4
		activityresolveinfo1 = (ActivityResolveInfo)mActivities.get(0);
	//   13   26:aload_0         
	//   14   27:getfield        #118 <Field List mActivities>
	//   15   30:iconst_0        
	//   16   31:invokeinterface #228 <Method Object List.get(int)>
	//   17   36:checkcast       #9   <Class ActivityChooserModel$ActivityResolveInfo>
	//   18   39:astore          5
		if(activityresolveinfo1 == null)
			break MISSING_BLOCK_LABEL_117;
	//   19   41:aload           5
	//   20   43:ifnull          117
		float f = (activityresolveinfo1.weight - activityresolveinfo.weight) + 5F;
	//   21   46:aload           5
	//   22   48:getfield        #412 <Field float ActivityChooserModel$ActivityResolveInfo.weight>
	//   23   51:aload           4
	//   24   53:getfield        #412 <Field float ActivityChooserModel$ActivityResolveInfo.weight>
	//   25   56:fsub            
	//   26   57:ldc2            #413 <Float 5F>
	//   27   60:fadd            
	//   28   61:fstore_2        
_L1:
		addHistoricalRecord(new HistoricalRecord(new ComponentName(activityresolveinfo.resolveInfo.activityInfo.packageName, activityresolveinfo.resolveInfo.activityInfo.name), System.currentTimeMillis(), f));
	//   29   62:aload_0         
	//   30   63:new             #18  <Class ActivityChooserModel$HistoricalRecord>
	//   31   66:dup             
	//   32   67:new             #350 <Class ComponentName>
	//   33   70:dup             
	//   34   71:aload           4
	//   35   73:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   36   76:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   37   79:getfield        #363 <Field String ActivityInfo.packageName>
	//   38   82:aload           4
	//   39   84:getfield        #354 <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   40   87:getfield        #358 <Field ActivityInfo ResolveInfo.activityInfo>
	//   41   90:getfield        #366 <Field String ActivityInfo.name>
	//   42   93:invokespecial   #369 <Method void ComponentName(String, String)>
	//   43   96:invokestatic    #390 <Method long System.currentTimeMillis()>
	//   44   99:fload_2         
	//   45  100:invokespecial   #393 <Method void ActivityChooserModel$HistoricalRecord(ComponentName, long, float)>
	//   46  103:invokespecial   #395 <Method boolean addHistoricalRecord(ActivityChooserModel$HistoricalRecord)>
	//   47  106:pop             
		obj;
	//   48  107:aload_3         
		JVM INSTR monitorexit ;
	//   49  108:monitorexit     
		return;
	//   50  109:return          
		Exception exception;
		exception;
	//   51  110:astore          4
		obj;
	//   52  112:aload_3         
		JVM INSTR monitorexit ;
	//   53  113:monitorexit     
		throw exception;
	//   54  114:aload           4
	//   55  116:athrow          
		f = 1.0F;
	//   56  117:fconst_1        
	//   57  118:fstore_2        
		  goto _L1
	//*  58  119:goto            62
	}

	public void setHistoryMaxSize(int i)
	{
label0:
		{
			synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mHistoryMaxSize != i)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #125 <Field int mHistoryMaxSize>
	//    7   11:iload_1         
	//    8   12:icmpne          18
			}
	//    9   15:aload_2         
	//   10   16:monitorexit     
			return;
	//   11   17:return          
		}
		mHistoryMaxSize = i;
	//   12   18:aload_0         
	//   13   19:iload_1         
	//   14   20:putfield        #125 <Field int mHistoryMaxSize>
		pruneExcessiveHistoricalRecordsIfNeeded();
	//   15   23:aload_0         
	//   16   24:invokespecial   #176 <Method void pruneExcessiveHistoricalRecordsIfNeeded()>
		if(sortActivitiesIfNeeded())
	//*  17   27:aload_0         
	//*  18   28:invokespecial   #183 <Method boolean sortActivitiesIfNeeded()>
	//*  19   31:ifeq            38
			notifyChanged();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #186 <Method void notifyChanged()>
		obj;
	//   22   38:aload_2         
		JVM INSTR monitorexit ;
	//   23   39:monitorexit     
		return;
	//   24   40:return          
		exception;
	//   25   41:astore_3        
		obj;
	//   26   42:aload_2         
		JVM INSTR monitorexit ;
	//   27   43:monitorexit     
		throw exception;
	//   28   44:aload_3         
	//   29   45:athrow          
	}

	public void setIntent(Intent intent)
	{
label0:
		{
			synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(mIntent != intent)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #208 <Field Intent mIntent>
	//    7   11:aload_1         
	//    8   12:if_acmpne       18
			}
	//    9   15:aload_2         
	//   10   16:monitorexit     
			return;
	//   11   17:return          
		}
		mIntent = intent;
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:putfield        #208 <Field Intent mIntent>
		mReloadActivities = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #133 <Field boolean mReloadActivities>
		ensureConsistentState();
	//   18   28:aload_0         
	//   19   29:invokespecial   #348 <Method void ensureConsistentState()>
		obj;
	//   20   32:aload_2         
		JVM INSTR monitorexit ;
	//   21   33:monitorexit     
		return;
	//   22   34:return          
		intent;
	//   23   35:astore_1        
		obj;
	//   24   36:aload_2         
		JVM INSTR monitorexit ;
	//   25   37:monitorexit     
		throw intent;
	//   26   38:aload_1         
	//   27   39:athrow          
	}

	public void setOnChooseActivityListener(OnChooseActivityListener onchooseactivitylistener)
	{
		synchronized(mInstanceLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field Object mInstanceLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			mActivityChoserModelPolicy = onchooseactivitylistener;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:putfield        #380 <Field ActivityChooserModel$OnChooseActivityListener mActivityChoserModelPolicy>
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		onchooseactivitylistener;
	//   11   15:astore_1        
		obj;
	//   12   16:aload_2         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw onchooseactivitylistener;
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
