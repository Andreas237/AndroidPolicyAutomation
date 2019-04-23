// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import com.appboy.models.IPutIntoJson;

// Referenced classes of package bo.app:
//			aa, fb, ev, fr

public interface eb
	extends IPutIntoJson
{

	public abstract void a(Context context, aa aa, fb fb, long l);

	public abstract void a(String s);

	public abstract boolean a();

	public abstract boolean a(fb fb);

	public abstract String b();

	public abstract ev c();

	public abstract fr d();
}
