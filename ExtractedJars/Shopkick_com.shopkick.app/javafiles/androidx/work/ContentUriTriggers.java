// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class ContentUriTriggers
{
	public static final class Trigger
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
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          58
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #29  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #29  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((Trigger)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class ContentUriTriggers$Trigger>
		//   16   28:astore_1        
				return mTriggerForDescendants == ((Trigger) (obj)).mTriggerForDescendants && mUri.equals(((Object) (((Trigger) (obj)).mUri)));
		//   17   29:aload_0         
		//   18   30:getfield        #21  <Field boolean mTriggerForDescendants>
		//   19   33:aload_1         
		//   20   34:getfield        #21  <Field boolean mTriggerForDescendants>
		//   21   37:icmpne          56
		//   22   40:aload_0         
		//   23   41:getfield        #19  <Field Uri mUri>
		//   24   44:aload_1         
		//   25   45:getfield        #19  <Field Uri mUri>
		//   26   48:invokevirtual   #33  <Method boolean Uri.equals(Object)>
		//   27   51:ifeq            56
		//   28   54:iconst_1        
		//   29   55:ireturn         
		//   30   56:iconst_0        
		//   31   57:ireturn         
			} else
			{
				return false;
		//   32   58:iconst_0        
		//   33   59:ireturn         
			}
		}

		public Uri getUri()
		{
			return mUri;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field Uri mUri>
		//    2    4:areturn         
		}

		public int hashCode()
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #40  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #42  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #47  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public boolean shouldTriggerForDescendants()
		{
			return mTriggerForDescendants;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field boolean mTriggerForDescendants>
		//    2    4:ireturn         
		}

		private final boolean mTriggerForDescendants;
		private final Uri mUri;

		Trigger(Uri uri, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mUri = uri;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Uri mUri>
			mTriggerForDescendants = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field boolean mTriggerForDescendants>
		//    8   14:return          
		}
	}


	public ContentUriTriggers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void HashSet()>
	//    6   12:putfield        #23  <Field Set mTriggers>
	//    7   15:return          
	}

	public void add(Uri uri, boolean flag)
	{
		uri = ((Uri) (new Trigger(uri, flag)));
	//    0    0:new             #6   <Class ContentUriTriggers$Trigger>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #29  <Method void ContentUriTriggers$Trigger(Uri, boolean)>
	//    5    9:astore_1        
		mTriggers.add(((Object) (uri)));
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field Set mTriggers>
	//    8   14:aload_1         
	//    9   15:invokeinterface #34  <Method boolean Set.add(Object)>
	//   10   20:pop             
	//   11   21:return          
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
		if(obj != null && ((Object)this).getClass() == obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          44
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #40  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #40  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       25
	//*  12   22:goto            44
		{
			obj = ((Object) ((ContentUriTriggers)obj));
	//   13   25:aload_1         
	//   14   26:checkcast       #2   <Class ContentUriTriggers>
	//   15   29:astore_1        
			return mTriggers.equals(((Object) (((ContentUriTriggers) (obj)).mTriggers)));
	//   16   30:aload_0         
	//   17   31:getfield        #23  <Field Set mTriggers>
	//   18   34:aload_1         
	//   19   35:getfield        #23  <Field Set mTriggers>
	//   20   38:invokeinterface #42  <Method boolean Set.equals(Object)>
	//   21   43:ireturn         
		} else
		{
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
		}
	}

	public Set getTriggers()
	{
		return mTriggers;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Set mTriggers>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return mTriggers.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Set mTriggers>
	//    2    4:invokeinterface #51  <Method int Set.hashCode()>
	//    3    9:ireturn         
	}

	public int size()
	{
		return mTriggers.size();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Set mTriggers>
	//    2    4:invokeinterface #54  <Method int Set.size()>
	//    3    9:ireturn         
	}

	private final Set mTriggers = new HashSet();
}
