// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzato, 
//			zzane, zzatn

public final class zzaan
{

	public zzaan()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	private final void zzj(Context context)
	{
		Object obj = sLock;
	//    0    0:getstatic       #23  <Field Object sLock>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		zzna zzna = zznk.zzbet;
	//    4    6:getstatic       #34  <Field zzna zznk.zzbet>
	//    5    9:astore          4
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
			break MISSING_BLOCK_LABEL_71;
	//    6   11:invokestatic    #40  <Method zzni zzkb.zzik()>
	//    7   14:aload           4
	//    8   16:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//    9   19:checkcast       #48  <Class Boolean>
	//   10   22:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   11   25:ifeq            71
		flag = zzbxg;
	//   12   28:getstatic       #54  <Field boolean zzbxg>
	//   13   31:istore_2        
		if(flag)
			break MISSING_BLOCK_LABEL_71;
	//   14   32:iload_2         
	//   15   33:ifne            71
		try
		{
			zzbxg = true;
	//   16   36:iconst_1        
	//   17   37:putstatic       #54  <Field boolean zzbxg>
			zzbxh = zzato.zzab(DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite").instantiate("com.google.android.gms.ads.omid.DynamiteOmid"));
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:getstatic       #60  <Field com.google.android.gms.dynamite.DynamiteModule$VersionPolicy DynamiteModule.PREFER_REMOTE>
	//   21   45:ldc1            #62  <String "com.google.android.gms.ads.dynamite">
	//   22   47:invokestatic    #66  <Method DynamiteModule DynamiteModule.load(Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, String)>
	//   23   50:ldc1            #68  <String "com.google.android.gms.ads.omid.DynamiteOmid">
	//   24   52:invokevirtual   #72  <Method android.os.IBinder DynamiteModule.instantiate(String)>
	//   25   55:invokestatic    #78  <Method zzatn zzato.zzab(android.os.IBinder)>
	//   26   58:putfield        #80  <Field zzatn zzbxh>
			break MISSING_BLOCK_LABEL_71;
	//   27   61:goto            71
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   28   64:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (context)));
	//   29   65:ldc1            #82  <String "#007 Could not call remote method.">
	//   30   67:aload_1         
	//   31   68:invokestatic    #87  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   32   71:aload_3         
		JVM INSTR monitorexit ;
	//   33   72:monitorexit     
		return;
	//   34   73:return          
		context;
	//   35   74:astore_1        
		obj;
	//   36   75:aload_3         
		JVM INSTR monitorexit ;
	//   37   76:monitorexit     
		throw context;
	//   38   77:aload_1         
	//   39   78:athrow          
	}

	public final String getVersion(Context context)
	{
		zzna zzna = zznk.zzbet;
	//    0    0:getstatic       #34  <Field zzna zznk.zzbet>
	//    1    3:astore_2        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #40  <Method zzni zzkb.zzik()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #48  <Class Boolean>
	//*   6   14:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*   7   17:ifne            22
			return null;
	//    8   20:aconst_null     
	//    9   21:areturn         
		try
		{
			zzj(context);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #97  <Method void zzj(Context)>
			context = ((Context) (String.valueOf(((Object) (zzbxh.getVersion())))));
	//   13   27:aload_0         
	//   14   28:getfield        #80  <Field zzatn zzbxh>
	//   15   31:invokeinterface #102 <Method String zzatn.getVersion()>
	//   16   36:invokestatic    #108 <Method String String.valueOf(Object)>
	//   17   39:astore_1        
			if(((String) (context)).length() != 0)
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #112 <Method int String.length()>
	//*  20   44:ifeq            54
				return "a.".concat(((String) (context)));
	//   21   47:ldc1            #114 <String "a.">
	//   22   49:aload_1         
	//   23   50:invokevirtual   #118 <Method String String.concat(String)>
	//   24   53:areturn         
			context = ((Context) (new String("a.")));
	//   25   54:new             #104 <Class String>
	//   26   57:dup             
	//   27   58:ldc1            #114 <String "a.">
	//   28   60:invokespecial   #121 <Method void String(String)>
	//   29   63:astore_1        
		}
	//*  30   64:aload_1         
	//*  31   65:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  32   66:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (context)));
	//   33   67:ldc1            #82  <String "#007 Could not call remote method.">
	//   34   69:aload_1         
	//   35   70:invokestatic    #87  <Method void zzane.zzd(String, Throwable)>
			return null;
	//   36   73:aconst_null     
	//   37   74:areturn         
		}
		return ((String) (context));
	}

	public final IObjectWrapper zza(String s, WebView webview, String s1, String s2, String s3)
	{
		Object obj = sLock;
	//    0    0:getstatic       #23  <Field Object sLock>
	//    1    3:astore          6
		obj;
	//    2    5:aload           6
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
		zzna zzna = zznk.zzbet;
	//    4    8:getstatic       #34  <Field zzna zznk.zzbet>
	//    5   11:astore          7
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() || !zzsh)
	//*   6   13:invokestatic    #40  <Method zzni zzkb.zzik()>
	//*   7   16:aload           7
	//*   8   18:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//*   9   21:checkcast       #48  <Class Boolean>
	//*  10   24:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*  11   27:ifeq            73
	//*  12   30:getstatic       #125 <Field boolean zzsh>
	//*  13   33:ifne            39
			break MISSING_BLOCK_LABEL_73;
	//   14   36:goto            73
		obj;
	//   15   39:aload           6
		JVM INSTR monitorexit ;
	//   16   41:monitorexit     
		try
		{
			s = ((String) (zzbxh.zza(s, ObjectWrapper.wrap(((Object) (webview))), s1, s2, s3)));
	//   17   42:aload_0         
	//   18   43:getfield        #80  <Field zzatn zzbxh>
	//   19   46:aload_1         
	//   20   47:aload_2         
	//   21   48:invokestatic    #131 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   22   51:aload_3         
	//   23   52:aload           4
	//   24   54:aload           5
	//   25   56:invokeinterface #134 <Method IObjectWrapper zzatn.zza(String, IObjectWrapper, String, String, String)>
	//   26   61:astore_1        
		}
	//*  27   62:aload_1         
	//*  28   63:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  29   64:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (s)));
	//   30   65:ldc1            #82  <String "#007 Could not call remote method.">
	//   31   67:aload_1         
	//   32   68:invokestatic    #87  <Method void zzane.zzd(String, Throwable)>
			return null;
	//   33   71:aconst_null     
	//   34   72:areturn         
		}
		return ((IObjectWrapper) (s));
		obj;
	//   35   73:aload           6
		JVM INSTR monitorexit ;
	//   36   75:monitorexit     
		return null;
	//   37   76:aconst_null     
	//   38   77:areturn         
		s;
	//   39   78:astore_1        
		obj;
	//   40   79:aload           6
		JVM INSTR monitorexit ;
	//   41   81:monitorexit     
		throw s;
	//   42   82:aload_1         
	//   43   83:athrow          
	}

	public final void zza(IObjectWrapper iobjectwrapper, View view)
	{
		Object obj = sLock;
	//    0    0:getstatic       #23  <Field Object sLock>
	//    1    3:astore_3        
		obj;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		zzna zzna = zznk.zzbet;
	//    4    6:getstatic       #34  <Field zzna zznk.zzbet>
	//    5    9:astore          4
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() || !zzsh)
	//*   6   11:invokestatic    #40  <Method zzni zzkb.zzik()>
	//*   7   14:aload           4
	//*   8   16:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//*   9   19:checkcast       #48  <Class Boolean>
	//*  10   22:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*  11   25:ifeq            62
	//*  12   28:getstatic       #125 <Field boolean zzsh>
	//*  13   31:ifne            37
			break MISSING_BLOCK_LABEL_62;
	//   14   34:goto            62
		obj;
	//   15   37:aload_3         
		JVM INSTR monitorexit ;
	//   16   38:monitorexit     
		try
		{
			zzbxh.zza(iobjectwrapper, ObjectWrapper.wrap(((Object) (view))));
	//   17   39:aload_0         
	//   18   40:getfield        #80  <Field zzatn zzbxh>
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokestatic    #131 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   22   48:invokeinterface #138 <Method void zzatn.zza(IObjectWrapper, IObjectWrapper)>
			return;
	//   23   53:return          
		}
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//*  24   54:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (iobjectwrapper)));
	//   25   55:ldc1            #82  <String "#007 Could not call remote method.">
	//   26   57:aload_1         
	//   27   58:invokestatic    #87  <Method void zzane.zzd(String, Throwable)>
		}
		return;
	//   28   61:return          
		obj;
	//   29   62:aload_3         
		JVM INSTR monitorexit ;
	//   30   63:monitorexit     
		return;
	//   31   64:return          
		iobjectwrapper;
	//   32   65:astore_1        
		obj;
	//   33   66:aload_3         
		JVM INSTR monitorexit ;
	//   34   67:monitorexit     
		throw iobjectwrapper;
	//   35   68:aload_1         
	//   36   69:athrow          
	}

	public final boolean zzi(Context context)
	{
label0:
		{
			synchronized(sLock)
	//*   0    0:getstatic       #23  <Field Object sLock>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
			{
				zzna zzna = zznk.zzbet;
	//    4    6:getstatic       #34  <Field zzna zznk.zzbet>
	//    5    9:astore          4
				if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
					break label0;
	//    6   11:invokestatic    #40  <Method zzni zzkb.zzik()>
	//    7   14:aload           4
	//    8   16:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//    9   19:checkcast       #48  <Class Boolean>
	//   10   22:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//   11   25:ifne            32
			}
	//   12   28:aload_3         
	//   13   29:monitorexit     
			return false;
	//   14   30:iconst_0        
	//   15   31:ireturn         
		}
		if(!zzsh)
			break MISSING_BLOCK_LABEL_42;
	//   16   32:getstatic       #125 <Field boolean zzsh>
	//   17   35:ifeq            42
		obj;
	//   18   38:aload_3         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		return true;
	//   20   40:iconst_1        
	//   21   41:ireturn         
		boolean flag;
		zzj(context);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokespecial   #97  <Method void zzj(Context)>
		flag = zzbxh.zzy(ObjectWrapper.wrap(((Object) (context))));
	//   25   47:aload_0         
	//   26   48:getfield        #80  <Field zzatn zzbxh>
	//   27   51:aload_1         
	//   28   52:invokestatic    #131 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//   29   55:invokeinterface #144 <Method boolean zzatn.zzy(IObjectWrapper)>
	//   30   60:istore_2        
		zzsh = flag;
	//   31   61:iload_2         
	//   32   62:putstatic       #125 <Field boolean zzsh>
		obj;
	//   33   65:aload_3         
		JVM INSTR monitorexit ;
	//   34   66:monitorexit     
		return flag;
	//   35   67:iload_2         
	//   36   68:ireturn         
		context;
	//   37   69:astore_1        
		zzane.zzd("#007 Could not call remote method.", ((Throwable) (context)));
	//   38   70:ldc1            #82  <String "#007 Could not call remote method.">
	//   39   72:aload_1         
	//   40   73:invokestatic    #87  <Method void zzane.zzd(String, Throwable)>
		obj;
	//   41   76:aload_3         
		JVM INSTR monitorexit ;
	//   42   77:monitorexit     
		return false;
	//   43   78:iconst_0        
	//   44   79:ireturn         
		context;
	//   45   80:astore_1        
		obj;
	//   46   81:aload_3         
		JVM INSTR monitorexit ;
	//   47   82:monitorexit     
		throw context;
	//   48   83:aload_1         
	//   49   84:athrow          
	}

	public final void zzm(IObjectWrapper iobjectwrapper)
	{
		Object obj = sLock;
	//    0    0:getstatic       #23  <Field Object sLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		zzna zzna = zznk.zzbet;
	//    4    6:getstatic       #34  <Field zzna zznk.zzbet>
	//    5    9:astore_3        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() || !zzsh)
	//*   6   10:invokestatic    #40  <Method zzni zzkb.zzik()>
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//*   9   17:checkcast       #48  <Class Boolean>
	//*  10   20:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*  11   23:ifeq            56
	//*  12   26:getstatic       #125 <Field boolean zzsh>
	//*  13   29:ifne            35
			break MISSING_BLOCK_LABEL_56;
	//   14   32:goto            56
		obj;
	//   15   35:aload_2         
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		try
		{
			zzbxh.zzm(iobjectwrapper);
	//   17   37:aload_0         
	//   18   38:getfield        #80  <Field zzatn zzbxh>
	//   19   41:aload_1         
	//   20   42:invokeinterface #148 <Method void zzatn.zzm(IObjectWrapper)>
			return;
	//   21   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//*  22   48:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (iobjectwrapper)));
	//   23   49:ldc1            #82  <String "#007 Could not call remote method.">
	//   24   51:aload_1         
	//   25   52:invokestatic    #87  <Method void zzane.zzd(String, Throwable)>
		}
		return;
	//   26   55:return          
		obj;
	//   27   56:aload_2         
		JVM INSTR monitorexit ;
	//   28   57:monitorexit     
		return;
	//   29   58:return          
		iobjectwrapper;
	//   30   59:astore_1        
		obj;
	//   31   60:aload_2         
		JVM INSTR monitorexit ;
	//   32   61:monitorexit     
		throw iobjectwrapper;
	//   33   62:aload_1         
	//   34   63:athrow          
	}

	public final void zzn(IObjectWrapper iobjectwrapper)
	{
		Object obj = sLock;
	//    0    0:getstatic       #23  <Field Object sLock>
	//    1    3:astore_2        
		obj;
	//    2    4:aload_2         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		zzna zzna = zznk.zzbet;
	//    4    6:getstatic       #34  <Field zzna zznk.zzbet>
	//    5    9:astore_3        
		if(!((Boolean)zzkb.zzik().zzd(zzna)).booleanValue() || !zzsh)
	//*   6   10:invokestatic    #40  <Method zzni zzkb.zzik()>
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #46  <Method Object zzni.zzd(zzna)>
	//*   9   17:checkcast       #48  <Class Boolean>
	//*  10   20:invokevirtual   #52  <Method boolean Boolean.booleanValue()>
	//*  11   23:ifeq            56
	//*  12   26:getstatic       #125 <Field boolean zzsh>
	//*  13   29:ifne            35
			break MISSING_BLOCK_LABEL_56;
	//   14   32:goto            56
		obj;
	//   15   35:aload_2         
		JVM INSTR monitorexit ;
	//   16   36:monitorexit     
		try
		{
			zzbxh.zzn(iobjectwrapper);
	//   17   37:aload_0         
	//   18   38:getfield        #80  <Field zzatn zzbxh>
	//   19   41:aload_1         
	//   20   42:invokeinterface #151 <Method void zzatn.zzn(IObjectWrapper)>
			return;
	//   21   47:return          
		}
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//*  22   48:astore_1        
		{
			zzane.zzd("#007 Could not call remote method.", ((Throwable) (iobjectwrapper)));
	//   23   49:ldc1            #82  <String "#007 Could not call remote method.">
	//   24   51:aload_1         
	//   25   52:invokestatic    #87  <Method void zzane.zzd(String, Throwable)>
		}
		return;
	//   26   55:return          
		obj;
	//   27   56:aload_2         
		JVM INSTR monitorexit ;
	//   28   57:monitorexit     
		return;
	//   29   58:return          
		iobjectwrapper;
	//   30   59:astore_1        
		obj;
	//   31   60:aload_2         
		JVM INSTR monitorexit ;
	//   32   61:monitorexit     
		throw iobjectwrapper;
	//   33   62:aload_1         
	//   34   63:athrow          
	}

	private static final Object sLock = new Object();
	private static boolean zzbxg = false;
	private static boolean zzsh = false;
	private zzatn zzbxh;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object sLock>
	//*   4   10:return          
	}
}
