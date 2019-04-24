// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouter, MediaRouteDescriptor

public static class MediaRouter$RouteGroup extends MediaRouter.RouteInfo
{

	public MediaRouter.RouteInfo getRouteAt(int i)
	{
		return (MediaRouter.RouteInfo)mRoutes.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List mRoutes>
	//    2    4:iload_1         
	//    3    5:invokeinterface #34  <Method Object List.get(int)>
	//    4   10:checkcast       #4   <Class MediaRouter$RouteInfo>
	//    5   13:areturn         
	}

	public int getRouteCount()
	{
		return mRoutes.size();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List mRoutes>
	//    2    4:invokeinterface #39  <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getRoutes()
	{
		return mRoutes;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field List mRoutes>
	//    2    4:areturn         
	}

	int maybeUpdateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
	{
		MediaRouteDescriptor mediaroutedescriptor1 = mDescriptor;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field MediaRouteDescriptor mDescriptor>
	//    2    4:astore          5
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore          4
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		boolean flag1 = flag2;
	//    7   11:iload           4
	//    8   13:istore_3        
		if(mediaroutedescriptor1 != mediaroutedescriptor)
	//*   9   14:aload           5
	//*  10   16:aload_1         
	//*  11   17:if_acmpeq       175
		{
			mDescriptor = mediaroutedescriptor;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #49  <Field MediaRouteDescriptor mDescriptor>
			flag1 = flag2;
	//   15   25:iload           4
	//   16   27:istore_3        
			if(mediaroutedescriptor != null)
	//*  17   28:aload_1         
	//*  18   29:ifnull          175
			{
				Object obj = ((Object) (mediaroutedescriptor.getGroupMemberIds()));
	//   19   32:aload_1         
	//   20   33:invokevirtual   #54  <Method List MediaRouteDescriptor.getGroupMemberIds()>
	//   21   36:astore          6
				ArrayList arraylist = new ArrayList();
	//   22   38:new             #20  <Class ArrayList>
	//   23   41:dup             
	//   24   42:invokespecial   #23  <Method void ArrayList()>
	//   25   45:astore          5
				if(((List) (obj)).size() != mRoutes.size())
	//*  26   47:aload           6
	//*  27   49:invokeinterface #39  <Method int List.size()>
	//*  28   54:aload_0         
	//*  29   55:getfield        #25  <Field List mRoutes>
	//*  30   58:invokeinterface #39  <Method int List.size()>
	//*  31   63:icmpeq          68
					flag = true;
	//   32   66:iconst_1        
	//   33   67:istore_2        
				obj = ((Object) (((List) (obj)).iterator()));
	//   34   68:aload           6
	//   35   70:invokeinterface #58  <Method Iterator List.iterator()>
	//   36   75:astore          6
				do
				{
					if(!((Iterator) (obj)).hasNext())
						break;
	//   37   77:aload           6
	//   38   79:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   39   84:ifeq            161
					Object obj1 = ((Object) ((String)((Iterator) (obj)).next()));
	//   40   87:aload           6
	//   41   89:invokeinterface #68  <Method Object Iterator.next()>
	//   42   94:checkcast       #70  <Class String>
	//   43   97:astore          7
					obj1 = ((Object) (Router.access._mth000(MediaRouter.sGlobal, getProvider(), ((String) (obj1)))));
	//   44   99:getstatic       #74  <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//   45  102:aload_0         
	//   46  103:invokevirtual   #78  <Method MediaRouter$ProviderInfo getProvider()>
	//   47  106:aload           7
	//   48  108:invokestatic    #84  <Method String MediaRouter$GlobalMediaRouter.access$000(MediaRouter$GlobalMediaRouter, MediaRouter$ProviderInfo, String)>
	//   49  111:astore          7
					obj1 = ((Object) (MediaRouter.sGlobal.getRoute(((String) (obj1)))));
	//   50  113:getstatic       #74  <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//   51  116:aload           7
	//   52  118:invokevirtual   #88  <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getRoute(String)>
	//   53  121:astore          7
					if(obj1 != null)
	//*  54  123:aload           7
	//*  55  125:ifnull          77
					{
						((List) (arraylist)).add(obj1);
	//   56  128:aload           5
	//   57  130:aload           7
	//   58  132:invokeinterface #92  <Method boolean List.add(Object)>
	//   59  137:pop             
						if(!flag && !mRoutes.contains(obj1))
	//*  60  138:iload_2         
	//*  61  139:ifne            77
	//*  62  142:aload_0         
	//*  63  143:getfield        #25  <Field List mRoutes>
	//*  64  146:aload           7
	//*  65  148:invokeinterface #95  <Method boolean List.contains(Object)>
	//*  66  153:ifne            77
							flag = true;
	//   67  156:iconst_1        
	//   68  157:istore_2        
					}
				} while(true);
	//   69  158:goto            77
				flag1 = flag;
	//   70  161:iload_2         
	//   71  162:istore_3        
				if(flag)
	//*  72  163:iload_2         
	//*  73  164:ifeq            175
				{
					mRoutes = ((List) (arraylist));
	//   74  167:aload_0         
	//   75  168:aload           5
	//   76  170:putfield        #25  <Field List mRoutes>
					flag1 = flag;
	//   77  173:iload_2         
	//   78  174:istore_3        
				}
			}
		}
		return super.updateDescriptor(mediaroutedescriptor) | flag1;
	//   79  175:aload_0         
	//   80  176:aload_1         
	//   81  177:invokespecial   #98  <Method int MediaRouter$RouteInfo.updateDescriptor(MediaRouteDescriptor)>
	//   82  180:iload_3         
	//   83  181:ior             
	//   84  182:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(super.toString());
	//    0    0:new             #102 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #104 <Method String MediaRouter$RouteInfo.toString()>
	//    4    8:invokespecial   #107 <Method void StringBuilder(String)>
	//    5   11:astore_3        
		stringbuilder.append('[');
	//    6   12:aload_3         
	//    7   13:bipush          91
	//    8   15:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
	//    9   18:pop             
		int j = mRoutes.size();
	//   10   19:aload_0         
	//   11   20:getfield        #25  <Field List mRoutes>
	//   12   23:invokeinterface #39  <Method int List.size()>
	//   13   28:istore_2        
		for(int i = 0; i < j; i++)
	//*  14   29:iconst_0        
	//*  15   30:istore_1        
	//*  16   31:iload_1         
	//*  17   32:iload_2         
	//*  18   33:icmpge          69
		{
			if(i > 0)
	//*  19   36:iload_1         
	//*  20   37:ifle            47
				stringbuilder.append(", ");
	//   21   40:aload_3         
	//   22   41:ldc1            #113 <String ", ">
	//   23   43:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(mRoutes.get(i));
	//   25   47:aload_3         
	//   26   48:aload_0         
	//   27   49:getfield        #25  <Field List mRoutes>
	//   28   52:iload_1         
	//   29   53:invokeinterface #34  <Method Object List.get(int)>
	//   30   58:invokevirtual   #119 <Method StringBuilder StringBuilder.append(Object)>
	//   31   61:pop             
		}

	//   32   62:iload_1         
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:istore_1        
	//*  36   66:goto            31
		stringbuilder.append(']');
	//   37   69:aload_3         
	//   38   70:bipush          93
	//   39   72:invokevirtual   #111 <Method StringBuilder StringBuilder.append(char)>
	//   40   75:pop             
		return stringbuilder.toString();
	//   41   76:aload_3         
	//   42   77:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   43   80:areturn         
	}

	private List mRoutes;

	MediaRouter$RouteGroup(o o, String s, String s1)
	{
		super(o, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #18  <Method void MediaRouter$RouteInfo(MediaRouter$ProviderInfo, String, String)>
		mRoutes = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #20  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #23  <Method void ArrayList()>
	//    9   15:putfield        #25  <Field List mRoutes>
	//   10   18:return          
	}
}
