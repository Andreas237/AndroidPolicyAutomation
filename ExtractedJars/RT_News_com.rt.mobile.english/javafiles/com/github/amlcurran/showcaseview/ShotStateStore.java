// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.content.Context;
import android.content.SharedPreferences;

class ShotStateStore
{

	public ShotStateStore(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		shotId = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #21  <Long -1L>
	//    4    8:putfield        #24  <Field long shotId>
		context = context1;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #26  <Field Context context>
	//    8   16:return          
	}

	boolean hasShot()
	{
		boolean flag2 = isSingleShot();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method boolean isSingleShot()>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		boolean flag = flag1;
	//    5    7:iload_2         
	//    6    8:istore_1        
		if(flag2)
	//*   7    9:iload_3         
	//*   8   10:ifeq            72
		{
			SharedPreferences sharedpreferences = context.getSharedPreferences("showcase_internal", 0);
	//    9   13:aload_0         
	//   10   14:getfield        #26  <Field Context context>
	//   11   17:ldc1            #11  <String "showcase_internal">
	//   12   19:iconst_0        
	//   13   20:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   14   23:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   15   25:new             #40  <Class StringBuilder>
	//   16   28:dup             
	//   17   29:invokespecial   #41  <Method void StringBuilder()>
	//   18   32:astore          5
			stringbuilder.append("hasShot");
	//   19   34:aload           5
	//   20   36:ldc1            #42  <String "hasShot">
	//   21   38:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			stringbuilder.append(shotId);
	//   23   42:aload           5
	//   24   44:aload_0         
	//   25   45:getfield        #24  <Field long shotId>
	//   26   48:invokevirtual   #49  <Method StringBuilder StringBuilder.append(long)>
	//   27   51:pop             
			flag = flag1;
	//   28   52:iload_2         
	//   29   53:istore_1        
			if(sharedpreferences.getBoolean(stringbuilder.toString(), false))
	//*  30   54:aload           4
	//*  31   56:aload           5
	//*  32   58:invokevirtual   #53  <Method String StringBuilder.toString()>
	//*  33   61:iconst_0        
	//*  34   62:invokeinterface #59  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  35   67:ifeq            72
				flag = true;
	//   36   70:iconst_1        
	//   37   71:istore_1        
		}
		return flag;
	//   38   72:iload_1         
	//   39   73:ireturn         
	}

	boolean isSingleShot()
	{
		return shotId != -1L;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field long shotId>
	//    2    4:ldc2w           #21  <Long -1L>
	//    3    7:lcmp            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	void setSingleShot(long l)
	{
		shotId = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #24  <Field long shotId>
	//    3    5:return          
	}

	void storeShot()
	{
		if(isSingleShot())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #32  <Method boolean isSingleShot()>
	//*   2    4:ifeq            63
		{
			android.content.SharedPreferences.Editor editor = context.getSharedPreferences("showcase_internal", 0).edit();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Context context>
	//    5   11:ldc1            #11  <String "showcase_internal">
	//    6   13:iconst_0        
	//    7   14:invokevirtual   #38  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    8   17:invokeinterface #66  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   22:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   23:new             #40  <Class StringBuilder>
	//   11   26:dup             
	//   12   27:invokespecial   #41  <Method void StringBuilder()>
	//   13   30:astore_2        
			stringbuilder.append("hasShot");
	//   14   31:aload_2         
	//   15   32:ldc1            #42  <String "hasShot">
	//   16   34:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			stringbuilder.append(shotId);
	//   18   38:aload_2         
	//   19   39:aload_0         
	//   20   40:getfield        #24  <Field long shotId>
	//   21   43:invokevirtual   #49  <Method StringBuilder StringBuilder.append(long)>
	//   22   46:pop             
			editor.putBoolean(stringbuilder.toString(), true).apply();
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   26   52:iconst_1        
	//   27   53:invokeinterface #72  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   28   58:invokeinterface #75  <Method void android.content.SharedPreferences$Editor.apply()>
		}
	//   29   63:return          
	}

	private static final int INVALID_SHOT_ID = -1;
	private static final String PREFS_SHOWCASE_INTERNAL = "showcase_internal";
	private final Context context;
	long shotId;
}
