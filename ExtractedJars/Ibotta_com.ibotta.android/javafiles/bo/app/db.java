// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.enums.SdkFlavor;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			dc, ca, ck, cn, 
//			cm

public interface db
	extends dc
{

	public abstract void a(long l);

	public abstract void a(ca ca);

	public abstract void a(ck ck);

	public abstract void a(cn cn);

	public abstract void a(SdkFlavor sdkflavor);

	public abstract void a(String s);

	public abstract void a(Map map);

	public abstract void b(String s);

	public abstract ck c();

	public abstract void c(String s);

	public abstract cn d();

	public abstract void d(String s);

	public abstract cm e();

	public abstract ca f();

	public abstract JSONObject g();

	public abstract boolean h();
}
