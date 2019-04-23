// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import java.net.URI;
import java.util.Map;
import org.json.JSONObject;

public interface d
{

	public abstract JSONObject a(URI uri, Map map);

	public abstract JSONObject a(URI uri, Map map, JSONObject jsonobject);
}
