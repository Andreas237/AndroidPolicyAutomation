// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.multidex;

import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package android.support.multidex:
//			MultiDex

private static interface MultiDex$V14$ElementConstructor
{

	public abstract Object newInstance(File file, DexFile dexfile)
		throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
}
