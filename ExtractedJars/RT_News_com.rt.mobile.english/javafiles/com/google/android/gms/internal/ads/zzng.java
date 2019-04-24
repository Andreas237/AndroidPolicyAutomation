// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzna, zzkb, zzni

public final class zzng
{

	public zzng()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field Collection zzats>
	//    7   15:aload_0         
	//    8   16:new             #17  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void ArrayList()>
	//   11   23:putfield        #22  <Field Collection zzatt>
	//   12   26:aload_0         
	//   13   27:new             #17  <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #18  <Method void ArrayList()>
	//   16   34:putfield        #24  <Field Collection zzatu>
	//   17   37:return          
	}

	public final void zza(android.content.SharedPreferences.Editor editor, int i, JSONObject jsonobject)
	{
		Iterator iterator = zzats.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Collection zzats>
	//    2    4:invokeinterface #33  <Method Iterator Collection.iterator()>
	//    3    9:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    4   11:aload           4
	//    5   13:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            57
			zzna zzna1 = (zzna)iterator.next();
	//    7   21:aload           4
	//    8   23:invokeinterface #43  <Method Object Iterator.next()>
	//    9   28:checkcast       #45  <Class zzna>
	//   10   31:astore          5
			if(zzna1.getSource() == 1)
	//*  11   33:aload           5
	//*  12   35:invokevirtual   #49  <Method int zzna.getSource()>
	//*  13   38:iconst_1        
	//*  14   39:icmpne          11
				zzna1.zza(editor, zzna1.zzb(jsonobject));
	//   15   42:aload           5
	//   16   44:aload_1         
	//   17   45:aload           5
	//   18   47:aload_3         
	//   19   48:invokevirtual   #53  <Method Object zzna.zzb(JSONObject)>
	//   20   51:invokevirtual   #56  <Method void zzna.zza(android.content.SharedPreferences$Editor, Object)>
		} while(true);
	//   21   54:goto            11
	//   22   57:return          
	}

	public final void zza(zzna zzna1)
	{
		zzats.add(((Object) (zzna1)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Collection zzats>
	//    2    4:aload_1         
	//    3    5:invokeinterface #61  <Method boolean Collection.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zzb(zzna zzna1)
	{
		zzatt.add(((Object) (zzna1)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Collection zzatt>
	//    2    4:aload_1         
	//    3    5:invokeinterface #61  <Method boolean Collection.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final void zzc(zzna zzna1)
	{
		zzatu.add(((Object) (zzna1)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Collection zzatu>
	//    2    4:aload_1         
	//    3    5:invokeinterface #61  <Method boolean Collection.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public final List zzjb()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #17  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ArrayList()>
	//    3    7:astore_1        
		Iterator iterator = zzatt.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field Collection zzatt>
	//    6   12:invokeinterface #33  <Method Iterator Collection.iterator()>
	//    7   17:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_2         
	//    9   19:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            63
			Object obj = ((Object) ((zzna)iterator.next()));
	//   11   27:aload_2         
	//   12   28:invokeinterface #43  <Method Object Iterator.next()>
	//   13   33:checkcast       #45  <Class zzna>
	//   14   36:astore_3        
			obj = ((Object) ((String)zzkb.zzik().zzd(((zzna) (obj)))));
	//   15   37:invokestatic    #72  <Method zzni zzkb.zzik()>
	//   16   40:aload_3         
	//   17   41:invokevirtual   #78  <Method Object zzni.zzd(zzna)>
	//   18   44:checkcast       #80  <Class String>
	//   19   47:astore_3        
			if(obj != null)
	//*  20   48:aload_3         
	//*  21   49:ifnull          18
				((List) (arraylist)).add(obj);
	//   22   52:aload_1         
	//   23   53:aload_3         
	//   24   54:invokeinterface #83  <Method boolean List.add(Object)>
	//   25   59:pop             
		} while(true);
	//   26   60:goto            18
		return ((List) (arraylist));
	//   27   63:aload_1         
	//   28   64:areturn         
	}

	public final List zzjc()
	{
		List list = zzjb();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #87  <Method List zzjb()>
	//    2    4:astore_1        
		Iterator iterator = zzatu.iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field Collection zzatu>
	//    5    9:invokeinterface #33  <Method Iterator Collection.iterator()>
	//    6   14:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   15:aload_2         
	//    8   16:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            60
			Object obj = ((Object) ((zzna)iterator.next()));
	//   10   24:aload_2         
	//   11   25:invokeinterface #43  <Method Object Iterator.next()>
	//   12   30:checkcast       #45  <Class zzna>
	//   13   33:astore_3        
			obj = ((Object) ((String)zzkb.zzik().zzd(((zzna) (obj)))));
	//   14   34:invokestatic    #72  <Method zzni zzkb.zzik()>
	//   15   37:aload_3         
	//   16   38:invokevirtual   #78  <Method Object zzni.zzd(zzna)>
	//   17   41:checkcast       #80  <Class String>
	//   18   44:astore_3        
			if(obj != null)
	//*  19   45:aload_3         
	//*  20   46:ifnull          15
				list.add(obj);
	//   21   49:aload_1         
	//   22   50:aload_3         
	//   23   51:invokeinterface #83  <Method boolean List.add(Object)>
	//   24   56:pop             
		} while(true);
	//   25   57:goto            15
		return list;
	//   26   60:aload_1         
	//   27   61:areturn         
	}

	private final Collection zzats = new ArrayList();
	private final Collection zzatt = new ArrayList();
	private final Collection zzatu = new ArrayList();
}
