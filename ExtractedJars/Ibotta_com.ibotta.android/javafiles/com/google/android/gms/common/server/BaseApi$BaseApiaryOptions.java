// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server;

import android.text.TextUtils;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server:
//			BaseApi

public static class BaseApi$BaseApiaryOptions
{
	public final class Collector
	{

		private final void append(String s)
		{
			if(!zzvx) goto _L2; else goto _L1
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field boolean zzvx>
		//    2    4:ifeq            29
_L1:
			StringBuilder stringbuilder;
			String s1;
			zzvx = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #36  <Field boolean zzvx>
			stringbuilder = zzwa;
		//    6   12:aload_0         
		//    7   13:getfield        #31  <Field StringBuilder zzwa>
		//    8   16:astore_2        
			s1 = ",";
		//    9   17:ldc1            #38  <String ",">
		//   10   19:astore_3        
_L4:
			stringbuilder.append(s1);
		//   11   20:aload_2         
		//   12   21:aload_3         
		//   13   22:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//   14   25:pop             
			break; /* Loop/switch isn't completed */
		//   15   26:goto            52
_L2:
			if(!zzvy)
				break; /* Loop/switch isn't completed */
		//   16   29:aload_0         
		//   17   30:getfield        #43  <Field boolean zzvy>
		//   18   33:ifeq            52
			zzvy = false;
		//   19   36:aload_0         
		//   20   37:iconst_0        
		//   21   38:putfield        #43  <Field boolean zzvy>
			stringbuilder = zzwa;
		//   22   41:aload_0         
		//   23   42:getfield        #31  <Field StringBuilder zzwa>
		//   24   45:astore_2        
			s1 = "/";
		//   25   46:ldc1            #45  <String "/">
		//   26   48:astore_3        
			if(true) goto _L4; else goto _L3
		//   27   49:goto            20
_L3:
			zzwa.append(s);
		//   28   52:aload_0         
		//   29   53:getfield        #31  <Field StringBuilder zzwa>
		//   30   56:aload_1         
		//   31   57:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//   32   60:pop             
			return;
		//   33   61:return          
		}

		public final void addPiece(String s)
		{
			append(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method void append(String)>
			zzvy = true;
		//    3    5:aload_0         
		//    4    6:iconst_1        
		//    5    7:putfield        #43  <Field boolean zzvy>
		//    6   10:return          
		}

		public final void beginSubCollection(String s)
		{
			append(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method void append(String)>
			zzwa.append("(");
		//    3    5:aload_0         
		//    4    6:getfield        #31  <Field StringBuilder zzwa>
		//    5    9:ldc1            #51  <String "(">
		//    6   11:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			zzvz = zzvz + 1;
		//    8   15:aload_0         
		//    9   16:aload_0         
		//   10   17:getfield        #53  <Field int zzvz>
		//   11   20:iconst_1        
		//   12   21:iadd            
		//   13   22:putfield        #53  <Field int zzvz>
		//   14   25:return          
		}

		public final void endSubCollection()
		{
			zzwa.append(")");
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field StringBuilder zzwa>
		//    2    4:ldc1            #56  <String ")">
		//    3    6:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
		//    4    9:pop             
			zzvz = zzvz - 1;
		//    5   10:aload_0         
		//    6   11:aload_0         
		//    7   12:getfield        #53  <Field int zzvz>
		//    8   15:iconst_1        
		//    9   16:isub            
		//   10   17:putfield        #53  <Field int zzvz>
			if(zzvz == 0)
		//*  11   20:aload_0         
		//*  12   21:getfield        #53  <Field int zzvz>
		//*  13   24:ifne            61
			{
				zzwb.addField(zzwa.toString());
		//   14   27:aload_0         
		//   15   28:getfield        #23  <Field BaseApi$BaseApiaryOptions zzwb>
		//   16   31:aload_0         
		//   17   32:getfield        #31  <Field StringBuilder zzwa>
		//   18   35:invokevirtual   #60  <Method String StringBuilder.toString()>
		//   19   38:invokevirtual   #64  <Method BaseApi$BaseApiaryOptions BaseApi$BaseApiaryOptions.addField(String)>
		//   20   41:pop             
				zzwa.setLength(0);
		//   21   42:aload_0         
		//   22   43:getfield        #31  <Field StringBuilder zzwa>
		//   23   46:iconst_0        
		//   24   47:invokevirtual   #68  <Method void StringBuilder.setLength(int)>
				zzvx = false;
		//   25   50:aload_0         
		//   26   51:iconst_0        
		//   27   52:putfield        #36  <Field boolean zzvx>
				zzvy = false;
		//   28   55:aload_0         
		//   29   56:iconst_0        
		//   30   57:putfield        #43  <Field boolean zzvy>
				return;
		//   31   60:return          
			} else
			{
				zzvx = true;
		//   32   61:aload_0         
		//   33   62:iconst_1        
		//   34   63:putfield        #36  <Field boolean zzvx>
				return;
		//   35   66:return          
			}
		}

		public final void finishPiece(String s)
		{
			append(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method void append(String)>
			if(zzvz == 0)
		//*   3    5:aload_0         
		//*   4    6:getfield        #53  <Field int zzvz>
		//*   5    9:ifne            36
			{
				zzwb.addField(zzwa.toString());
		//    6   12:aload_0         
		//    7   13:getfield        #23  <Field BaseApi$BaseApiaryOptions zzwb>
		//    8   16:aload_0         
		//    9   17:getfield        #31  <Field StringBuilder zzwa>
		//   10   20:invokevirtual   #60  <Method String StringBuilder.toString()>
		//   11   23:invokevirtual   #64  <Method BaseApi$BaseApiaryOptions BaseApi$BaseApiaryOptions.addField(String)>
		//   12   26:pop             
				zzwa.setLength(0);
		//   13   27:aload_0         
		//   14   28:getfield        #31  <Field StringBuilder zzwa>
		//   15   31:iconst_0        
		//   16   32:invokevirtual   #68  <Method void StringBuilder.setLength(int)>
				return;
		//   17   35:return          
			} else
			{
				zzvx = true;
		//   18   36:aload_0         
		//   19   37:iconst_1        
		//   20   38:putfield        #36  <Field boolean zzvx>
				return;
		//   21   41:return          
			}
		}

		private boolean zzvx;
		private boolean zzvy;
		private int zzvz;
		private StringBuilder zzwa;
		private final BaseApi.BaseApiaryOptions zzwb;

		public Collector()
		{
			zzwb = BaseApi.BaseApiaryOptions.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field BaseApi$BaseApiaryOptions zzwb>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #26  <Method void Object()>
			zzwa = new StringBuilder();
		//    5    9:aload_0         
		//    6   10:new             #28  <Class StringBuilder>
		//    7   13:dup             
		//    8   14:invokespecial   #29  <Method void StringBuilder()>
		//    9   17:putfield        #31  <Field StringBuilder zzwa>
		//   10   20:return          
		}
	}


	private static String zzcy()
	{
		return String.valueOf(DeviceProperties.isUserBuild() ^ true);
	//    0    0:invokestatic    #50  <Method boolean DeviceProperties.isUserBuild()>
	//    1    3:iconst_1        
	//    2    4:ixor            
	//    3    5:invokestatic    #56  <Method String String.valueOf(boolean)>
	//    4    8:areturn         
	}

	public final BaseApi$BaseApiaryOptions addField(String s)
	{
		zzvt.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayList zzvt>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public final String appendParametersToUrl(String s)
	{
		String s1 = BaseApi.append(s, "prettyPrint", zzcy());
	//    0    0:aload_1         
	//    1    1:ldc1            #69  <String "prettyPrint">
	//    2    3:invokestatic    #71  <Method String zzcy()>
	//    3    6:invokestatic    #75  <Method String BaseApi.append(String, String, String)>
	//    4    9:astore_2        
		s = s1;
	//    5   10:aload_2         
	//    6   11:astore_1        
		if(zzvv != null)
	//*   7   12:aload_0         
	//*   8   13:getfield        #77  <Field String zzvv>
	//*   9   16:ifnull          30
			s = BaseApi.append(s1, "trace", getTrace());
	//   10   19:aload_2         
	//   11   20:ldc1            #79  <String "trace">
	//   12   22:aload_0         
	//   13   23:invokevirtual   #82  <Method String getTrace()>
	//   14   26:invokestatic    #75  <Method String BaseApi.append(String, String, String)>
	//   15   29:astore_1        
		s1 = s;
	//   16   30:aload_1         
	//   17   31:astore_2        
		if(!zzvt.isEmpty())
	//*  18   32:aload_0         
	//*  19   33:getfield        #31  <Field ArrayList zzvt>
	//*  20   36:invokevirtual   #85  <Method boolean ArrayList.isEmpty()>
	//*  21   39:ifne            63
			s1 = BaseApi.append(s, "fields", TextUtils.join(",", getFields().toArray()));
	//   22   42:aload_1         
	//   23   43:ldc1            #87  <String "fields">
	//   24   45:ldc1            #89  <String ",">
	//   25   47:aload_0         
	//   26   48:invokevirtual   #93  <Method List getFields()>
	//   27   51:invokeinterface #99  <Method Object[] List.toArray()>
	//   28   56:invokestatic    #105 <Method String TextUtils.join(CharSequence, Object[])>
	//   29   59:invokestatic    #75  <Method String BaseApi.append(String, String, String)>
	//   30   62:astore_2        
		return s1;
	//   31   63:aload_2         
	//   32   64:areturn         
	}

	public void appendParametersToUrl(StringBuilder stringbuilder)
	{
		BaseApi.append(stringbuilder, "prettyPrint", zzcy());
	//    0    0:aload_1         
	//    1    1:ldc1            #69  <String "prettyPrint">
	//    2    3:invokestatic    #71  <Method String zzcy()>
	//    3    6:invokestatic    #110 <Method void BaseApi.append(StringBuilder, String, String)>
		if(zzvv != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #77  <Field String zzvv>
	//*   6   13:ifnull          26
			BaseApi.append(stringbuilder, "trace", getTrace());
	//    7   16:aload_1         
	//    8   17:ldc1            #79  <String "trace">
	//    9   19:aload_0         
	//   10   20:invokevirtual   #82  <Method String getTrace()>
	//   11   23:invokestatic    #110 <Method void BaseApi.append(StringBuilder, String, String)>
		if(!zzvt.isEmpty())
	//*  12   26:aload_0         
	//*  13   27:getfield        #31  <Field ArrayList zzvt>
	//*  14   30:invokevirtual   #85  <Method boolean ArrayList.isEmpty()>
	//*  15   33:ifne            56
			BaseApi.append(stringbuilder, "fields", TextUtils.join(",", getFields().toArray()));
	//   16   36:aload_1         
	//   17   37:ldc1            #87  <String "fields">
	//   18   39:ldc1            #89  <String ",">
	//   19   41:aload_0         
	//   20   42:invokevirtual   #93  <Method List getFields()>
	//   21   45:invokeinterface #99  <Method Object[] List.toArray()>
	//   22   50:invokestatic    #105 <Method String TextUtils.join(CharSequence, Object[])>
	//   23   53:invokestatic    #110 <Method void BaseApi.append(StringBuilder, String, String)>
	//   24   56:return          
	}

	public final BaseApi$BaseApiaryOptions buildFrom(BaseApi$BaseApiaryOptions baseapi$baseapiaryoptions)
	{
		String s = baseapi$baseapiaryoptions.zzvv;
	//    0    0:aload_1         
	//    1    1:getfield        #77  <Field String zzvv>
	//    2    4:astore_2        
		if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			zzvv = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #77  <Field String zzvv>
		if(!baseapi$baseapiaryoptions.zzvt.isEmpty())
	//*   8   14:aload_1         
	//*   9   15:getfield        #31  <Field ArrayList zzvt>
	//*  10   18:invokevirtual   #85  <Method boolean ArrayList.isEmpty()>
	//*  11   21:ifne            43
		{
			zzvt.clear();
	//   12   24:aload_0         
	//   13   25:getfield        #31  <Field ArrayList zzvt>
	//   14   28:invokevirtual   #115 <Method void ArrayList.clear()>
			zzvt.addAll(((java.util.Collection) (baseapi$baseapiaryoptions.zzvt)));
	//   15   31:aload_0         
	//   16   32:getfield        #31  <Field ArrayList zzvt>
	//   17   35:aload_1         
	//   18   36:getfield        #31  <Field ArrayList zzvt>
	//   19   39:invokevirtual   #119 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   20   42:pop             
		}
		return this;
	//   21   43:aload_0         
	//   22   44:areturn         
	}

	protected final Collector getCollector()
	{
		return zzvw;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BaseApi$BaseApiaryOptions$Collector zzvw>
	//    2    4:areturn         
	}

	public final List getFields()
	{
		return ((List) (zzvt));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ArrayList zzvt>
	//    2    4:areturn         
	}

	public final Map getHeaders()
	{
		return ((Map) (zzvu));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field HashMap zzvu>
	//    2    4:areturn         
	}

	public final String getTrace()
	{
		return zzvv;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String zzvv>
	//    2    4:areturn         
	}

	public final BaseApi$BaseApiaryOptions setEtag(String s)
	{
		return setHeader("ETag", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #130 <String "ETag">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #134 <Method BaseApi$BaseApiaryOptions setHeader(String, String)>
	//    4    7:areturn         
	}

	public final BaseApi$BaseApiaryOptions setHeader(String s, String s1)
	{
		zzvu.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field HashMap zzvu>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #138 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public final BaseApi$BaseApiaryOptions setTraceByLdap(String s)
	{
		String s1 = String.valueOf("email:");
	//    0    0:ldc1            #142 <String "email:">
	//    1    2:invokestatic    #145 <Method String String.valueOf(Object)>
	//    2    5:astore_2        
		s = String.valueOf(((Object) (s)));
	//    3    6:aload_1         
	//    4    7:invokestatic    #145 <Method String String.valueOf(Object)>
	//    5   10:astore_1        
		if(s.length() != 0)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #149 <Method int String.length()>
	//*   8   15:ifeq            27
			s = s1.concat(s);
	//    9   18:aload_2         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #152 <Method String String.concat(String)>
	//   12   23:astore_1        
		else
	//*  13   24:goto            36
			s = new String(s1);
	//   14   27:new             #52  <Class String>
	//   15   30:dup             
	//   16   31:aload_2         
	//   17   32:invokespecial   #155 <Method void String(String)>
	//   18   35:astore_1        
		zzvv = s;
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:putfield        #77  <Field String zzvv>
		return this;
	//   22   41:aload_0         
	//   23   42:areturn         
	}

	public final BaseApi$BaseApiaryOptions setTraceByToken(String s)
	{
		String s1 = String.valueOf("token:");
	//    0    0:ldc1            #158 <String "token:">
	//    1    2:invokestatic    #145 <Method String String.valueOf(Object)>
	//    2    5:astore_2        
		s = String.valueOf(((Object) (s)));
	//    3    6:aload_1         
	//    4    7:invokestatic    #145 <Method String String.valueOf(Object)>
	//    5   10:astore_1        
		if(s.length() != 0)
	//*   6   11:aload_1         
	//*   7   12:invokevirtual   #149 <Method int String.length()>
	//*   8   15:ifeq            27
			s = s1.concat(s);
	//    9   18:aload_2         
	//   10   19:aload_1         
	//   11   20:invokevirtual   #152 <Method String String.concat(String)>
	//   12   23:astore_1        
		else
	//*  13   24:goto            36
			s = new String(s1);
	//   14   27:new             #52  <Class String>
	//   15   30:dup             
	//   16   31:aload_2         
	//   17   32:invokespecial   #155 <Method void String(String)>
	//   18   35:astore_1        
		zzvv = s;
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:putfield        #77  <Field String zzvv>
		return this;
	//   22   41:aload_0         
	//   23   42:areturn         
	}

	private final ArrayList zzvt = new ArrayList();
	private final HashMap zzvu = new HashMap();
	private String zzvv;
	private final Collector zzvw = new Collector();

	public BaseApi$BaseApiaryOptions()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field ArrayList zzvt>
	//    7   15:aload_0         
	//    8   16:new             #33  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void HashMap()>
	//   11   23:putfield        #36  <Field HashMap zzvu>
	//   12   26:aload_0         
	//   13   27:new             #10  <Class BaseApi$BaseApiaryOptions$Collector>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #39  <Method void BaseApi$BaseApiaryOptions$Collector(BaseApi$BaseApiaryOptions)>
	//   17   35:putfield        #41  <Field BaseApi$BaseApiaryOptions$Collector zzvw>
	//   18   38:return          
	}
}
