// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.flags.impl:
//			SharedPreferencesFactory

public class FlagProviderImpl extends com.google.android.gms.flags.IFlagProvider.Stub
{

	public FlagProviderImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void com.google.android.gms.flags.IFlagProvider$Stub()>
		zzacf = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field boolean zzacf>
	//    5    9:return          
	}

	public boolean getBooleanFlagValue(String s, boolean flag, int i)
	{
		if(!zzacf)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean zzacf>
	//*   2    4:ifne            9
			return flag;
	//    3    7:iload_2         
	//    4    8:ireturn         
		else
			return DataUtils.BooleanUtils.getFromSharedPreferencesNoStrict(zzacu, s, Boolean.valueOf(flag)).booleanValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences zzacu>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokestatic    #26  <Method Boolean Boolean.valueOf(boolean)>
	//   10   18:invokestatic    #32  <Method Boolean DataUtils$BooleanUtils.getFromSharedPreferencesNoStrict(SharedPreferences, String, Boolean)>
	//   11   21:invokevirtual   #36  <Method boolean Boolean.booleanValue()>
	//   12   24:ireturn         
	}

	public int getIntFlagValue(String s, int i, int j)
	{
		if(!zzacf)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean zzacf>
	//*   2    4:ifne            9
			return i;
	//    3    7:iload_2         
	//    4    8:ireturn         
		else
			return DataUtils.IntegerUtils.getFromSharedPreferencesNoStrict(zzacu, s, Integer.valueOf(i)).intValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences zzacu>
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokestatic    #43  <Method Integer Integer.valueOf(int)>
	//   10   18:invokestatic    #48  <Method Integer DataUtils$IntegerUtils.getFromSharedPreferencesNoStrict(SharedPreferences, String, Integer)>
	//   11   21:invokevirtual   #52  <Method int Integer.intValue()>
	//   12   24:ireturn         
	}

	public long getLongFlagValue(String s, long l, int i)
	{
		if(!zzacf)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean zzacf>
	//*   2    4:ifne            9
			return l;
	//    3    7:lload_2         
	//    4    8:lreturn         
		else
			return DataUtils.LongUtils.getFromSharedPreferencesNoStrict(zzacu, s, Long.valueOf(l)).longValue();
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences zzacu>
	//    7   13:aload_1         
	//    8   14:lload_2         
	//    9   15:invokestatic    #59  <Method Long Long.valueOf(long)>
	//   10   18:invokestatic    #64  <Method Long DataUtils$LongUtils.getFromSharedPreferencesNoStrict(SharedPreferences, String, Long)>
	//   11   21:invokevirtual   #68  <Method long Long.longValue()>
	//   12   24:lreturn         
	}

	public String getStringFlagValue(String s, String s1, int i)
	{
		if(!zzacf)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field boolean zzacf>
	//*   2    4:ifne            9
			return s1;
	//    3    7:aload_2         
	//    4    8:areturn         
		else
			return DataUtils.StringUtils.getFromSharedPreferencesNoStrict(zzacu, s, s1);
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field SharedPreferences zzacu>
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokestatic    #75  <Method String DataUtils$StringUtils.getFromSharedPreferencesNoStrict(SharedPreferences, String, String)>
	//   10   18:areturn         
	}

	public void init(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #87  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #89  <Class Context>
	//    3    7:astore_1        
		if(zzacf)
	//*   4    8:aload_0         
	//*   5    9:getfield        #15  <Field boolean zzacf>
	//*   6   12:ifeq            16
			return;
	//    7   15:return          
		try
		{
			zzacu = SharedPreferencesFactory.getSharedPreferences(((Context) (iobjectwrapper)).createPackageContext("com.google.android.gms", 0));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #91  <String "com.google.android.gms">
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #95  <Method Context Context.createPackageContext(String, int)>
	//   13   24:invokestatic    #101 <Method SharedPreferences SharedPreferencesFactory.getSharedPreferences(Context)>
	//   14   27:putfield        #20  <Field SharedPreferences zzacu>
			zzacf = true;
	//   15   30:aload_0         
	//   16   31:iconst_1        
	//   17   32:putfield        #15  <Field boolean zzacf>
			return;
	//   18   35:return          
		}
	//*  19   36:astore_1        
	//*  20   37:aload_1         
	//*  21   38:invokevirtual   #105 <Method String Exception.getMessage()>
	//*  22   41:invokestatic    #110 <Method String String.valueOf(Object)>
	//*  23   44:astore_1        
	//*  24   45:aload_1         
	//*  25   46:invokevirtual   #113 <Method int String.length()>
	//*  26   49:ifeq            62
	//*  27   52:ldc1            #115 <String "Could not retrieve sdk flags, continuing with defaults: ">
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #119 <Method String String.concat(String)>
	//*  30   58:astore_1        
	//*  31   59:goto            72
	//*  32   62:new             #107 <Class String>
	//*  33   65:dup             
	//*  34   66:ldc1            #115 <String "Could not retrieve sdk flags, continuing with defaults: ">
	//*  35   68:invokespecial   #122 <Method void String(String)>
	//*  36   71:astore_1        
	//*  37   72:ldc1            #124 <String "FlagProviderImpl">
	//*  38   74:aload_1         
	//*  39   75:invokestatic    #130 <Method int Log.w(String, String)>
	//*  40   78:pop             
	//*  41   79:return          
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
	//*  42   80:astore_1        
		{
			return;
	//   43   81:return          
		}
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper)
		{
			iobjectwrapper = ((IObjectWrapper) (String.valueOf(((Object) (((Exception) (iobjectwrapper)).getMessage())))));
		}
		if(((String) (iobjectwrapper)).length() != 0)
			iobjectwrapper = ((IObjectWrapper) ("Could not retrieve sdk flags, continuing with defaults: ".concat(((String) (iobjectwrapper)))));
		else
			iobjectwrapper = ((IObjectWrapper) (new String("Could not retrieve sdk flags, continuing with defaults: ")));
		Log.w("FlagProviderImpl", ((String) (iobjectwrapper)));
	}

	private boolean zzacf;
	private SharedPreferences zzacu;
}
