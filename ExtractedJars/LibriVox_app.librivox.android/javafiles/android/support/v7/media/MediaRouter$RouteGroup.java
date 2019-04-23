// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.util.Log;
import java.util.*;

// Referenced classes of package android.support.v7.media:
//			MediaRouteDescriptor, MediaRouter

public class MediaRouter$RouteGroup extends MediaRouter.RouteInfo
{

	public MediaRouter.RouteInfo getRouteAt(int i)
	{
		return (MediaRouter.RouteInfo)mRoutes.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List mRoutes>
	//    2    4:iload_1         
	//    3    5:invokeinterface #26  <Method Object List.get(int)>
	//    4   10:checkcast       #4   <Class MediaRouter$RouteInfo>
	//    5   13:areturn         
	}

	public int getRouteCount()
	{
		return mRoutes.size();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List mRoutes>
	//    2    4:invokeinterface #31  <Method int List.size()>
	//    3    9:ireturn         
	}

	public List getRoutes()
	{
		return mRoutes;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field List mRoutes>
	//    2    4:areturn         
	}

	int maybeUpdateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
	{
		MediaRouteDescriptor mediaroutedescriptor1 = mDescriptor;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field MediaRouteDescriptor mDescriptor>
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
	//*  11   17:if_acmpeq       197
		{
			mDescriptor = mediaroutedescriptor;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #39  <Field MediaRouteDescriptor mDescriptor>
			flag1 = flag2;
	//   15   25:iload           4
	//   16   27:istore_3        
			if(mediaroutedescriptor != null)
	//*  17   28:aload_1         
	//*  18   29:ifnull          197
			{
				Object obj = ((Object) (mediaroutedescriptor.getGroupMemberIds()));
	//   19   32:aload_1         
	//   20   33:invokevirtual   #44  <Method List MediaRouteDescriptor.getGroupMemberIds()>
	//   21   36:astore          6
				ArrayList arraylist = new ArrayList();
	//   22   38:new             #12  <Class ArrayList>
	//   23   41:dup             
	//   24   42:invokespecial   #15  <Method void ArrayList()>
	//   25   45:astore          5
				if(obj == null)
	//*  26   47:aload           6
	//*  27   49:ifnonnull       65
				{
					Log.w("MediaRouter", "groupMemberIds shouldn't be null.");
	//   28   52:ldc1            #46  <String "MediaRouter">
	//   29   54:ldc1            #48  <String "groupMemberIds shouldn't be null.">
	//   30   56:invokestatic    #54  <Method int Log.w(String, String)>
	//   31   59:pop             
					flag = true;
	//   32   60:iconst_1        
	//   33   61:istore_2        
				} else
	//*  34   62:goto            183
				{
					flag1 = flag;
	//   35   65:iload_2         
	//   36   66:istore_3        
					if(((List) (obj)).size() != mRoutes.size())
	//*  37   67:aload           6
	//*  38   69:invokeinterface #31  <Method int List.size()>
	//*  39   74:aload_0         
	//*  40   75:getfield        #17  <Field List mRoutes>
	//*  41   78:invokeinterface #31  <Method int List.size()>
	//*  42   83:icmpeq          88
						flag1 = true;
	//   43   86:iconst_1        
	//   44   87:istore_3        
					obj = ((Object) (((List) (obj)).iterator()));
	//   45   88:aload           6
	//   46   90:invokeinterface #58  <Method Iterator List.iterator()>
	//   47   95:astore          6
					do
					{
						flag = flag1;
	//   48   97:iload_3         
	//   49   98:istore_2        
						if(!((Iterator) (obj)).hasNext())
							break;
	//   50   99:aload           6
	//   51  101:invokeinterface #64  <Method boolean Iterator.hasNext()>
	//   52  106:ifeq            183
						Object obj1 = ((Object) ((String)((Iterator) (obj)).next()));
	//   53  109:aload           6
	//   54  111:invokeinterface #68  <Method Object Iterator.next()>
	//   55  116:checkcast       #70  <Class String>
	//   56  119:astore          7
						obj1 = ((Object) (MediaRouter.sGlobal.getUniqueId(getProvider(), ((String) (obj1)))));
	//   57  121:getstatic       #76  <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//   58  124:aload_0         
	//   59  125:invokevirtual   #80  <Method MediaRouter$ProviderInfo getProvider()>
	//   60  128:aload           7
	//   61  130:invokevirtual   #86  <Method String MediaRouter$GlobalMediaRouter.getUniqueId(MediaRouter$ProviderInfo, String)>
	//   62  133:astore          7
						obj1 = ((Object) (MediaRouter.sGlobal.getRoute(((String) (obj1)))));
	//   63  135:getstatic       #76  <Field MediaRouter$GlobalMediaRouter MediaRouter.sGlobal>
	//   64  138:aload           7
	//   65  140:invokevirtual   #90  <Method MediaRouter$RouteInfo MediaRouter$GlobalMediaRouter.getRoute(String)>
	//   66  143:astore          7
						if(obj1 != null)
	//*  67  145:aload           7
	//*  68  147:ifnull          97
						{
							((List) (arraylist)).add(obj1);
	//   69  150:aload           5
	//   70  152:aload           7
	//   71  154:invokeinterface #94  <Method boolean List.add(Object)>
	//   72  159:pop             
							if(!flag1 && !mRoutes.contains(obj1))
	//*  73  160:iload_3         
	//*  74  161:ifne            97
	//*  75  164:aload_0         
	//*  76  165:getfield        #17  <Field List mRoutes>
	//*  77  168:aload           7
	//*  78  170:invokeinterface #97  <Method boolean List.contains(Object)>
	//*  79  175:ifne            97
								flag1 = true;
	//   80  178:iconst_1        
	//   81  179:istore_3        
						}
					} while(true);
	//   82  180:goto            97
				}
				flag1 = flag;
	//   83  183:iload_2         
	//   84  184:istore_3        
				if(flag)
	//*  85  185:iload_2         
	//*  86  186:ifeq            197
				{
					mRoutes = ((List) (arraylist));
	//   87  189:aload_0         
	//   88  190:aload           5
	//   89  192:putfield        #17  <Field List mRoutes>
					flag1 = flag;
	//   90  195:iload_2         
	//   91  196:istore_3        
				}
			}
		}
		return super.updateDescriptor(mediaroutedescriptor) | flag1;
	//   92  197:aload_0         
	//   93  198:aload_1         
	//   94  199:invokespecial   #100 <Method int MediaRouter$RouteInfo.updateDescriptor(MediaRouteDescriptor)>
	//   95  202:iload_3         
	//   96  203:ior             
	//   97  204:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(super.toString());
	//    0    0:new             #104 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #106 <Method String MediaRouter$RouteInfo.toString()>
	//    4    8:invokespecial   #109 <Method void StringBuilder(String)>
	//    5   11:astore_3        
		stringbuilder.append('[');
	//    6   12:aload_3         
	//    7   13:bipush          91
	//    8   15:invokevirtual   #113 <Method StringBuilder StringBuilder.append(char)>
	//    9   18:pop             
		int j = mRoutes.size();
	//   10   19:aload_0         
	//   11   20:getfield        #17  <Field List mRoutes>
	//   12   23:invokeinterface #31  <Method int List.size()>
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
	//   22   41:ldc1            #115 <String ", ">
	//   23   43:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(mRoutes.get(i));
	//   25   47:aload_3         
	//   26   48:aload_0         
	//   27   49:getfield        #17  <Field List mRoutes>
	//   28   52:iload_1         
	//   29   53:invokeinterface #26  <Method Object List.get(int)>
	//   30   58:invokevirtual   #121 <Method StringBuilder StringBuilder.append(Object)>
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
	//   39   72:invokevirtual   #113 <Method StringBuilder StringBuilder.append(char)>
	//   40   75:pop             
		return stringbuilder.toString();
	//   41   76:aload_3         
	//   42   77:invokevirtual   #122 <Method String StringBuilder.toString()>
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
	//    4    4:invokespecial   #10  <Method void MediaRouter$RouteInfo(MediaRouter$ProviderInfo, String, String)>
		mRoutes = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #12  <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #15  <Method void ArrayList()>
	//    9   15:putfield        #17  <Field List mRoutes>
	//   10   18:return          
	}
}
