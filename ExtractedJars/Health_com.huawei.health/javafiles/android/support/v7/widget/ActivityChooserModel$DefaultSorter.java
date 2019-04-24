// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			ActivityChooserModel

final class ActivityChooserModel$DefaultSorter
	implements 
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
			eInfo einfo = (eInfo)list.get(i);
	//   13   29:aload_2         
	//   14   30:iload           6
	//   15   32:invokeinterface #47  <Method Object List.get(int)>
	//   16   37:checkcast       #49  <Class ActivityChooserModel$ActivityResolveInfo>
	//   17   40:astore          8
			einfo.weight = 0.0F;
	//   18   42:aload           8
	//   19   44:fconst_0        
	//   20   45:putfield        #52  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
			((Map) (intent)).put(((Object) (new ComponentName(einfo.resolveInfo.activityInfo.packageName, einfo.resolveInfo.activityInfo.name))), ((Object) (einfo)));
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
			rd rd = (rd)list1.get(j);
	//   52  117:aload_3         
	//   53  118:iload           6
	//   54  120:invokeinterface #47  <Method Object List.get(int)>
	//   55  125:checkcast       #82  <Class ActivityChooserModel$HistoricalRecord>
	//   56  128:astore          8
			eInfo einfo1 = (eInfo)((Map) (intent)).get(((Object) (rd.activity)));
	//   57  130:aload_1         
	//   58  131:aload           8
	//   59  133:getfield        #86  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
	//   60  136:invokeinterface #89  <Method Object Map.get(Object)>
	//   61  141:checkcast       #49  <Class ActivityChooserModel$ActivityResolveInfo>
	//   62  144:astore          9
			float f1 = f;
	//   63  146:fload           4
	//   64  148:fstore          5
			if(einfo1 != null)
	//*  65  150:aload           9
	//*  66  152:ifnull          181
			{
				einfo1.weight = einfo1.weight + rd.weight * f;
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

	ActivityChooserModel$DefaultSorter()
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
