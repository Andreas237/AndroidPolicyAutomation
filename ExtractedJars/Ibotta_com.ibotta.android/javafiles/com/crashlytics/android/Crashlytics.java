// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android;

import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.core.CrashlyticsCore;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitGroup;
import java.util.*;

public class Crashlytics extends Kit
	implements KitGroup
{

	public Crashlytics()
	{
		this(new Answers(), new Beta(), new CrashlyticsCore());
	//    0    0:aload_0         
	//    1    1:new             #20  <Class Answers>
	//    2    4:dup             
	//    3    5:invokespecial   #22  <Method void Answers()>
	//    4    8:new             #24  <Class Beta>
	//    5   11:dup             
	//    6   12:invokespecial   #25  <Method void Beta()>
	//    7   15:new             #27  <Class CrashlyticsCore>
	//    8   18:dup             
	//    9   19:invokespecial   #28  <Method void CrashlyticsCore()>
	//   10   22:invokespecial   #31  <Method void Crashlytics(Answers, Beta, CrashlyticsCore)>
	//   11   25:return          
	}

	Crashlytics(Answers answers1, Beta beta1, CrashlyticsCore crashlyticscore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Kit()>
		answers = answers1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Answers answers>
		beta = beta1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field Beta beta>
		core = crashlyticscore;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #39  <Field CrashlyticsCore core>
		kits = Collections.unmodifiableCollection(((Collection) (Arrays.asList(((Object []) (new Kit[] {
			answers1, beta1, crashlyticscore
		}))))));
	//   11   19:aload_0         
	//   12   20:iconst_3        
	//   13   21:anewarray       Kit[]
	//   14   24:dup             
	//   15   25:iconst_0        
	//   16   26:aload_1         
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_1        
	//   20   30:aload_2         
	//   21   31:aastore         
	//   22   32:dup             
	//   23   33:iconst_2        
	//   24   34:aload_3         
	//   25   35:aastore         
	//   26   36:invokestatic    #45  <Method java.util.List Arrays.asList(Object[])>
	//   27   39:invokestatic    #51  <Method Collection Collections.unmodifiableCollection(Collection)>
	//   28   42:putfield        #53  <Field Collection kits>
	//   29   45:return          
	}

	protected volatile Object doInBackground()
	{
		return ((Object) (doInBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method Void doInBackground()>
	//    2    4:areturn         
	}

	protected Void doInBackground()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getIdentifier()
	{
		return "com.crashlytics.sdk.android:crashlytics";
	//    0    0:ldc1            #62  <String "com.crashlytics.sdk.android:crashlytics">
	//    1    2:areturn         
	}

	public Collection getKits()
	{
		return kits;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Collection kits>
	//    2    4:areturn         
	}

	public String getVersion()
	{
		return "2.6.8.dev";
	//    0    0:ldc1            #69  <String "2.6.8.dev">
	//    1    2:areturn         
	}

	public final Answers answers;
	public final Beta beta;
	public final CrashlyticsCore core;
	public final Collection kits;
}
