// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.os.Bundle;

// Referenced classes of package android.support.v7.media:
//			MediaRouteSelector

public final class MediaRouteDiscoveryRequest
{

	private MediaRouteDiscoveryRequest(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		mBundle = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Bundle mBundle>
	//    5    9:return          
	}

	public MediaRouteDiscoveryRequest(MediaRouteSelector mediarouteselector, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		if(mediarouteselector != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          48
		{
			mBundle = new Bundle();
	//    4    8:aload_0         
	//    5    9:new             #26  <Class Bundle>
	//    6   12:dup             
	//    7   13:invokespecial   #27  <Method void Bundle()>
	//    8   16:putfield        #22  <Field Bundle mBundle>
			mSelector = mediarouteselector;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #29  <Field MediaRouteSelector mSelector>
			mBundle.putBundle("selector", mediarouteselector.asBundle());
	//   12   24:aload_0         
	//   13   25:getfield        #22  <Field Bundle mBundle>
	//   14   28:ldc1            #11  <String "selector">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #35  <Method Bundle MediaRouteSelector.asBundle()>
	//   17   34:invokevirtual   #39  <Method void Bundle.putBundle(String, Bundle)>
			mBundle.putBoolean("activeScan", flag);
	//   18   37:aload_0         
	//   19   38:getfield        #22  <Field Bundle mBundle>
	//   20   41:ldc1            #8   <String "activeScan">
	//   21   43:iload_2         
	//   22   44:invokevirtual   #43  <Method void Bundle.putBoolean(String, boolean)>
			return;
	//   23   47:return          
		} else
		{
			throw new IllegalArgumentException("selector must not be null");
	//   24   48:new             #45  <Class IllegalArgumentException>
	//   25   51:dup             
	//   26   52:ldc1            #47  <String "selector must not be null">
	//   27   54:invokespecial   #50  <Method void IllegalArgumentException(String)>
	//   28   57:athrow          
		}
	}

	private void ensureSelector()
	{
		if(mSelector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field MediaRouteSelector mSelector>
	//*   2    4:ifnonnull       37
		{
			mSelector = MediaRouteSelector.fromBundle(mBundle.getBundle("selector"));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field Bundle mBundle>
	//    6   12:ldc1            #11  <String "selector">
	//    7   14:invokevirtual   #55  <Method Bundle Bundle.getBundle(String)>
	//    8   17:invokestatic    #59  <Method MediaRouteSelector MediaRouteSelector.fromBundle(Bundle)>
	//    9   20:putfield        #29  <Field MediaRouteSelector mSelector>
			if(mSelector == null)
	//*  10   23:aload_0         
	//*  11   24:getfield        #29  <Field MediaRouteSelector mSelector>
	//*  12   27:ifnonnull       37
				mSelector = MediaRouteSelector.EMPTY;
	//   13   30:aload_0         
	//   14   31:getstatic       #62  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   15   34:putfield        #29  <Field MediaRouteSelector mSelector>
		}
	//   16   37:return          
	}

	public static MediaRouteDiscoveryRequest fromBundle(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return new MediaRouteDiscoveryRequest(bundle);
	//    2    4:new             #2   <Class MediaRouteDiscoveryRequest>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #65  <Method void MediaRouteDiscoveryRequest(Bundle)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public Bundle asBundle()
	{
		return mBundle;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Bundle mBundle>
	//    2    4:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag = obj instanceof MediaRouteDiscoveryRequest;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class MediaRouteDiscoveryRequest>
	//    2    4:istore_2        
		boolean flag2 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(flag)
	//*   5    7:iload_2         
	//*   6    8:ifeq            49
		{
			obj = ((Object) ((MediaRouteDiscoveryRequest)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class MediaRouteDiscoveryRequest>
	//    9   15:astore_1        
			boolean flag1 = flag2;
	//   10   16:iload_3         
	//   11   17:istore_2        
			if(getSelector().equals(((Object) (((MediaRouteDiscoveryRequest) (obj)).getSelector()))))
	//*  12   18:aload_0         
	//*  13   19:invokevirtual   #71  <Method MediaRouteSelector getSelector()>
	//*  14   22:aload_1         
	//*  15   23:invokevirtual   #71  <Method MediaRouteSelector getSelector()>
	//*  16   26:invokevirtual   #73  <Method boolean MediaRouteSelector.equals(Object)>
	//*  17   29:ifeq            47
			{
				flag1 = flag2;
	//   18   32:iload_3         
	//   19   33:istore_2        
				if(isActiveScan() == ((MediaRouteDiscoveryRequest) (obj)).isActiveScan())
	//*  20   34:aload_0         
	//*  21   35:invokevirtual   #77  <Method boolean isActiveScan()>
	//*  22   38:aload_1         
	//*  23   39:invokevirtual   #77  <Method boolean isActiveScan()>
	//*  24   42:icmpne          47
					flag1 = true;
	//   25   45:iconst_1        
	//   26   46:istore_2        
			}
			return flag1;
	//   27   47:iload_2         
	//   28   48:ireturn         
		} else
		{
			return false;
	//   29   49:iconst_0        
	//   30   50:ireturn         
		}
	}

	public MediaRouteSelector getSelector()
	{
		ensureSelector();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void ensureSelector()>
		return mSelector;
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field MediaRouteSelector mSelector>
	//    4    8:areturn         
	}

	public int hashCode()
	{
		return getSelector().hashCode() ^ isActiveScan();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method MediaRouteSelector getSelector()>
	//    2    4:invokevirtual   #83  <Method int MediaRouteSelector.hashCode()>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #77  <Method boolean isActiveScan()>
	//    5   11:ixor            
	//    6   12:ireturn         
	}

	public boolean isActiveScan()
	{
		return mBundle.getBoolean("activeScan");
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Bundle mBundle>
	//    2    4:ldc1            #8   <String "activeScan">
	//    3    6:invokevirtual   #87  <Method boolean Bundle.getBoolean(String)>
	//    4    9:ireturn         
	}

	public boolean isValid()
	{
		ensureSelector();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void ensureSelector()>
		return mSelector.isValid();
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field MediaRouteSelector mSelector>
	//    4    8:invokevirtual   #90  <Method boolean MediaRouteSelector.isValid()>
	//    5   11:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #94  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DiscoveryRequest{ selector=");
	//    4    8:aload_1         
	//    5    9:ldc1            #97  <String "DiscoveryRequest{ selector=">
	//    6   11:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (getSelector())));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #71  <Method MediaRouteSelector getSelector()>
	//   11   20:invokevirtual   #104 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		stringbuilder.append(", activeScan=");
	//   13   24:aload_1         
	//   14   25:ldc1            #106 <String ", activeScan=">
	//   15   27:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(isActiveScan());
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #77  <Method boolean isActiveScan()>
	//   20   36:invokevirtual   #109 <Method StringBuilder StringBuilder.append(boolean)>
	//   21   39:pop             
		stringbuilder.append(", isValid=");
	//   22   40:aload_1         
	//   23   41:ldc1            #111 <String ", isValid=">
	//   24   43:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(isValid());
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:invokevirtual   #112 <Method boolean isValid()>
	//   29   52:invokevirtual   #109 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   55:pop             
		stringbuilder.append(" }");
	//   31   56:aload_1         
	//   32   57:ldc1            #114 <String " }">
	//   33   59:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		return stringbuilder.toString();
	//   35   63:aload_1         
	//   36   64:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   37   67:areturn         
	}

	private static final String KEY_ACTIVE_SCAN = "activeScan";
	private static final String KEY_SELECTOR = "selector";
	private final Bundle mBundle;
	private MediaRouteSelector mSelector;
}
