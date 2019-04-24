// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.FeatureType;
import com.irobot.core.GigyaConst;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity

class DeveloperActivity$10
	implements android.content.tiChoiceClickListener
{

	public void onClick(DialogInterface dialoginterface, int i, boolean flag)
	{
		dialoginterface = ((DialogInterface) (a[i].toString()));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field CharSequence[] a>
	//    2    4:iload_2         
	//    3    5:aaload          
	//    4    6:invokeinterface #39  <Method String CharSequence.toString()>
	//    5   11:astore_1        
		Iterator iterator = b.iterator();
	//    6   12:aload_0         
	//    7   13:getfield        #26  <Field HashSet b>
	//    8   16:invokevirtual   #45  <Method Iterator HashSet.iterator()>
	//    9   19:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   21:aload           4
	//   11   23:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   12   28:ifeq            85
			FeatureType featuretype = (FeatureType)iterator.next();
	//   13   31:aload           4
	//   14   33:invokeinterface #55  <Method Object Iterator.next()>
	//   15   38:checkcast       #57  <Class FeatureType>
	//   16   41:astore          5
			if(GigyaConst.getKeyForFeatureType(featuretype).equals(((Object) (dialoginterface))))
	//*  17   43:aload           5
	//*  18   45:invokestatic    #63  <Method String GigyaConst.getKeyForFeatureType(FeatureType)>
	//*  19   48:aload_1         
	//*  20   49:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  21   52:ifeq            21
				if(flag)
	//*  22   55:iload_3         
	//*  23   56:ifeq            72
					c.add(((Object) (featuretype)));
	//   24   59:aload_0         
	//   25   60:getfield        #28  <Field HashSet c>
	//   26   63:aload           5
	//   27   65:invokevirtual   #72  <Method boolean HashSet.add(Object)>
	//   28   68:pop             
				else
	//*  29   69:goto            21
					c.remove(((Object) (featuretype)));
	//   30   72:aload_0         
	//   31   73:getfield        #28  <Field HashSet c>
	//   32   76:aload           5
	//   33   78:invokevirtual   #75  <Method boolean HashSet.remove(Object)>
	//   34   81:pop             
		} while(true);
	//   35   82:goto            21
	//   36   85:return          
	}

	final CharSequence a[];
	final HashSet b;
	final HashSet c;
	final DeveloperActivity d;

	DeveloperActivity$10(DeveloperActivity developeractivity, CharSequence acharsequence[], HashSet hashset, HashSet hashset1)
	{
		d = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DeveloperActivity d>
		a = acharsequence;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field CharSequence[] a>
		b = hashset;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field HashSet b>
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
