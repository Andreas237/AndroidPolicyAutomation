// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.getkeepsafe.relinker;

import android.content.Context;
import java.io.File;

// Referenced classes of package com.getkeepsafe.relinker:
//			ReLinker, ReLinkerInstance

public static interface ReLinker$LibraryInstaller
{

	public abstract void installLibrary(Context context, String as[], String s, File file, ReLinkerInstance relinkerinstance);
}
