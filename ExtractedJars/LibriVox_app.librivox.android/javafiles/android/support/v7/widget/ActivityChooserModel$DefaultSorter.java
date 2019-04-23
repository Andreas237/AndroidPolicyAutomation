// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.*;

final class ActivityChooserModel$DefaultSorter
	implements 
{

	public void sort(Intent intent, List list, List list1)
	{
		intent = ((Intent) (mPackageNameToActivityMap));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Map mPackageNameToActivityMap>
	//    2    4:astore_1        
		((Map) (intent)).clear();
	//    3    5:aload_1         
	//    4    6:invokeinterface #28  <Method void Map.clear()>
		int k = list.size();
	//    5   11:aload_2         
	//    6   12:invokeinterface #34  <Method int List.size()>
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
	//   15   32:invokeinterface #38  <Method Object List.get(int)>
	//   16   37:checkcast       #40  <Class ActivityChooserModel$ActivityResolveInfo>
	//   17   40:astore          8
			einfo.weight = 0.0F;
	//   18   42:aload           8
	//   19   44:fconst_0        
	//   20   45:putfield        #43  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
			((Map) (intent)).put(((Object) (new ComponentName(einfo.resolveInfo.activityInfo.packageName, einfo.resolveInfo.activityInfo.name))), ((Object) (einfo)));
	//   21   48:aload_1         
	//   22   49:new             #45  <Class ComponentName>
	//   23   52:dup             
	//   24   53:aload           8
	//   25   55:getfield        #49  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   26   58:getfield        #55  <Field ActivityInfo ResolveInfo.activityInfo>
	//   27   61:getfield        #61  <Field String ActivityInfo.packageName>
	//   28   64:aload           8
	//   29   66:getfield        #49  <Field ResolveInfo ActivityChooserModel$ActivityResolveInfo.resolveInfo>
	//   30   69:getfield        #55  <Field ActivityInfo ResolveInfo.activityInfo>
	//   31   72:getfield        #64  <Field String ActivityInfo.name>
	//   32   75:invokespecial   #67  <Method void ComponentName(String, String)>
	//   33   78:aload           8
	//   34   80:invokeinterface #71  <Method Object Map.put(Object, Object)>
	//   35   85:pop             
		}

	//   36   86:iload           6
	//   37   88:iconst_1        
	//   38   89:iadd            
	//   39   90:istore          6
	//*  40   92:goto            22
		int j = list1.size() - 1;
	//   41   95:aload_3         
	//   42   96:invokeinterface #34  <Method int List.size()>
	//   43  101:iconst_1        
	//   44  102:isub            
	//   45  103:istore          6
		float f1;
		for(float f = 1.0F; j >= 0; f = f1)
	//*  46  105:fconst_1        
	//*  47  106:fstore          4
	//*  48  108:iload           6
	//*  49  110:iflt            190
		{
			rd rd = (rd)list1.get(j);
	//   50  113:aload_3         
	//   51  114:iload           6
	//   52  116:invokeinterface #38  <Method Object List.get(int)>
	//   53  121:checkcast       #73  <Class ActivityChooserModel$HistoricalRecord>
	//   54  124:astore          8
			eInfo einfo1 = (eInfo)((Map) (intent)).get(((Object) (rd.activity)));
	//   55  126:aload_1         
	//   56  127:aload           8
	//   57  129:getfield        #77  <Field ComponentName ActivityChooserModel$HistoricalRecord.activity>
	//   58  132:invokeinterface #80  <Method Object Map.get(Object)>
	//   59  137:checkcast       #40  <Class ActivityChooserModel$ActivityResolveInfo>
	//   60  140:astore          9
			f1 = f;
	//   61  142:fload           4
	//   62  144:fstore          5
			if(einfo1 != null)
	//*  63  146:aload           9
	//*  64  148:ifnull          177
			{
				einfo1.weight = einfo1.weight + rd.weight * f;
	//   65  151:aload           9
	//   66  153:aload           9
	//   67  155:getfield        #43  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
	//   68  158:aload           8
	//   69  160:getfield        #81  <Field float ActivityChooserModel$HistoricalRecord.weight>
	//   70  163:fload           4
	//   71  165:fmul            
	//   72  166:fadd            
	//   73  167:putfield        #43  <Field float ActivityChooserModel$ActivityResolveInfo.weight>
				f1 = f * 0.95F;
	//   74  170:fload           4
	//   75  172:ldc1            #9   <Float 0.95F>
	//   76  174:fmul            
	//   77  175:fstore          5
			}
			j--;
	//   78  177:iload           6
	//   79  179:iconst_1        
	//   80  180:isub            
	//   81  181:istore          6
		}

	//   82  183:fload           5
	//   83  185:fstore          4
	//*  84  187:goto            108
		Collections.sort(list);
	//   85  190:aload_2         
	//   86  191:invokestatic    #86  <Method void Collections.sort(List)>
	//   87  194:return          
	}

	private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
	private final Map mPackageNameToActivityMap = new HashMap();

	ActivityChooserModel$DefaultSorter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field Map mPackageNameToActivityMap>
	//    7   15:return          
	}
}
