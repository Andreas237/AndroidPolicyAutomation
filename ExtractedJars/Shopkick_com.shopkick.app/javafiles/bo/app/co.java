// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import com.appboy.enums.SdkFlavor;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			cp, bt, ce, ch, 
//			cg

public interface co
	extends cp
{

	public abstract void a(long l);

	public abstract void a(bt bt);

	public abstract void a(ce ce);

	public abstract void a(ch ch);

	public abstract void a(SdkFlavor sdkflavor);

	public abstract void a(String s);

	public abstract void a(Map map);

	public abstract void b(String s);

	public abstract ce c();

	public abstract void c(String s);

	public abstract ch d();

	public abstract void d(String s);

	public abstract cg e();

	public abstract bt f();

	public abstract JSONObject g();

	public abstract boolean h();
}
