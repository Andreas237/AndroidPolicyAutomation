// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.AccountService;
import com.irobot.core.FeatureType;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity

class DeveloperActivity$9
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		FeatureType featuretype;
		for(dialoginterface = ((DialogInterface) (a.iterator())); ((Iterator) (dialoginterface)).hasNext(); b.updateFeatureStatus(featuretype, c.contains(((Object) (featuretype)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field HashSet a>
	//*   2    4:invokevirtual   #39  <Method Iterator HashSet.iterator()>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//*   6   14:ifeq            46
			featuretype = (FeatureType)((Iterator) (dialoginterface)).next();
	//    7   17:aload_1         
	//    8   18:invokeinterface #49  <Method Object Iterator.next()>
	//    9   23:checkcast       #51  <Class FeatureType>
	//   10   26:astore_3        

	//   11   27:aload_0         
	//   12   28:getfield        #26  <Field AccountService b>
	//   13   31:aload_3         
	//   14   32:aload_0         
	//   15   33:getfield        #28  <Field HashSet c>
	//   16   36:aload_3         
	//   17   37:invokevirtual   #55  <Method boolean HashSet.contains(Object)>
	//   18   40:invokevirtual   #61  <Method void AccountService.updateFeatureStatus(FeatureType, boolean)>
	//*  19   43:goto            8
	//   20   46:return          
	}

	final HashSet a;
	final AccountService b;
	final HashSet c;
	final DeveloperActivity d;

	DeveloperActivity$9(DeveloperActivity developeractivity, HashSet hashset, AccountService accountservice, HashSet hashset1)
	{
		d = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DeveloperActivity d>
		a = hashset;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field HashSet a>
		b = accountservice;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field AccountService b>
		c = hashset1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field HashSet c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
