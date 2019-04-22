// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.*;
import android.text.TextUtils;
import android.util.Log;
import android.view.*;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ParameterComponent;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.facebook.appevents.codeless:
//			CodelessLoggingEventListener

public class CodelessMatcher
{
	public static class MatchedView
	{

		public View getView()
		{
			WeakReference weakreference = view;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field WeakReference view>
		//    2    4:astore_1        
			if(weakreference == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return (View)weakreference.get();
		//    7   11:aload_1         
		//    8   12:invokevirtual   #34  <Method Object WeakReference.get()>
		//    9   15:checkcast       #36  <Class View>
		//   10   18:areturn         
		}

		public String getViewMapKey()
		{
			return viewMapKey;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field String viewMapKey>
		//    2    4:areturn         
		}

		private WeakReference view;
		private String viewMapKey;

		public MatchedView(View view1, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			view = new WeakReference(((Object) (view1)));
		//    2    4:aload_0         
		//    3    5:new             #19  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #22  <Method void WeakReference(Object)>
		//    7   13:putfield        #24  <Field WeakReference view>
			viewMapKey = s;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #26  <Field String viewMapKey>
		//   11   21:return          
		}
	}

	protected static class ViewMatcher
		implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, Runnable
	{

		private void attachListener(MatchedView matchedview, View view, EventBinding eventbinding)
		{
			if(eventbinding == null)
		//*   0    0:aload_3         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			View view1 = matchedview.getView();
		//    3    5:aload_1         
		//    4    6:invokevirtual   #66  <Method View CodelessMatcher$MatchedView.getView()>
		//    5    9:astore          4
			if(view1 == null)
		//*   6   11:aload           4
		//*   7   13:ifnonnull       17
				return;
		//    8   16:return          
			android.view.View.AccessibilityDelegate accessibilitydelegate;
			matchedview = ((MatchedView) (matchedview.getViewMapKey()));
		//    9   17:aload_1         
		//   10   18:invokevirtual   #70  <Method String CodelessMatcher$MatchedView.getViewMapKey()>
		//   11   21:astore_1        
			accessibilitydelegate = ViewHierarchy.getExistingDelegate(view1);
		//   12   22:aload           4
		//   13   24:invokestatic    #76  <Method android.view.View$AccessibilityDelegate ViewHierarchy.getExistingDelegate(View)>
		//   14   27:astore          5
			if(delegateMap.containsKey(((Object) (matchedview))))
				break MISSING_BLOCK_LABEL_90;
		//   15   29:aload_0         
		//   16   30:getfield        #43  <Field HashMap delegateMap>
		//   17   33:aload_1         
		//   18   34:invokevirtual   #82  <Method boolean HashMap.containsKey(Object)>
		//   19   37:ifne            90
			if(accessibilitydelegate == null)
				break MISSING_BLOCK_LABEL_53;
		//   20   40:aload           5
		//   21   42:ifnull          53
			if(accessibilitydelegate instanceof CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate)
				break MISSING_BLOCK_LABEL_90;
		//   22   45:aload           5
		//   23   47:instanceof      #84  <Class CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate>
		//   24   50:ifne            90
			view1.setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (CodelessLoggingEventListener.getAccessibilityDelegate(eventbinding, view, view1))));
		//   25   53:aload           4
		//   26   55:aload_3         
		//   27   56:aload_2         
		//   28   57:aload           4
		//   29   59:invokestatic    #90  <Method CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate CodelessLoggingEventListener.getAccessibilityDelegate(EventBinding, View, View)>
		//   30   62:invokevirtual   #96  <Method void View.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
			delegateMap.put(((Object) (matchedview)), ((Object) (eventbinding.getEventName())));
		//   31   65:aload_0         
		//   32   66:getfield        #43  <Field HashMap delegateMap>
		//   33   69:aload_1         
		//   34   70:aload_3         
		//   35   71:invokevirtual   #101 <Method String EventBinding.getEventName()>
		//   36   74:invokevirtual   #105 <Method Object HashMap.put(Object, Object)>
		//   37   77:pop             
			return;
		//   38   78:return          
			matchedview;
		//   39   79:astore_1        
			Log.e(CodelessMatcher.TAG, "Failed to attach auto logging event listener.", ((Throwable) (matchedview)));
		//   40   80:invokestatic    #108 <Method String CodelessMatcher.access$100()>
		//   41   83:ldc1            #110 <String "Failed to attach auto logging event listener.">
		//   42   85:aload_1         
		//   43   86:invokestatic    #116 <Method int Log.e(String, String, Throwable)>
		//   44   89:pop             
		//   45   90:return          
		}

		public static List findViewByPath(EventBinding eventbinding, View view, List list, int i, int j, String s)
		{
			Object obj = ((Object) (new StringBuilder()));
		//    0    0:new             #120 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #121 <Method void StringBuilder()>
		//    3    7:astore          7
			((StringBuilder) (obj)).append(s);
		//    4    9:aload           7
		//    5   11:aload           5
		//    6   13:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			((StringBuilder) (obj)).append(".");
		//    8   17:aload           7
		//    9   19:ldc1            #127 <String ".">
		//   10   21:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
			((StringBuilder) (obj)).append(String.valueOf(j));
		//   12   25:aload           7
		//   13   27:iload           4
		//   14   29:invokestatic    #133 <Method String String.valueOf(int)>
		//   15   32:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
		//   16   35:pop             
			s = ((StringBuilder) (obj)).toString();
		//   17   36:aload           7
		//   18   38:invokevirtual   #136 <Method String StringBuilder.toString()>
		//   19   41:astore          5
			obj = ((Object) (new ArrayList()));
		//   20   43:new             #138 <Class ArrayList>
		//   21   46:dup             
		//   22   47:invokespecial   #139 <Method void ArrayList()>
		//   23   50:astore          7
			if(view == null)
		//*  24   52:aload_1         
		//*  25   53:ifnonnull       59
				return ((List) (obj));
		//   26   56:aload           7
		//   27   58:areturn         
			if(i >= list.size())
		//*  28   59:iload_3         
		//*  29   60:aload_2         
		//*  30   61:invokeinterface #145 <Method int List.size()>
		//*  31   66:icmplt          90
			{
				((List) (obj)).add(((Object) (new MatchedView(view, s))));
		//   32   69:aload           7
		//   33   71:new             #62  <Class CodelessMatcher$MatchedView>
		//   34   74:dup             
		//   35   75:aload_1         
		//   36   76:aload           5
		//   37   78:invokespecial   #148 <Method void CodelessMatcher$MatchedView(View, String)>
		//   38   81:invokeinterface #151 <Method boolean List.add(Object)>
		//   39   86:pop             
			} else
		//*  40   87:goto            274
			{
				PathComponent pathcomponent = (PathComponent)list.get(i);
		//   41   90:aload_2         
		//   42   91:iload_3         
		//   43   92:invokeinterface #155 <Method Object List.get(int)>
		//   44   97:checkcast       #157 <Class PathComponent>
		//   45  100:astore          8
				if(pathcomponent.className.equals(".."))
		//*  46  102:aload           8
		//*  47  104:getfield        #160 <Field String PathComponent.className>
		//*  48  107:ldc1            #162 <String "..">
		//*  49  109:invokevirtual   #165 <Method boolean String.equals(Object)>
		//*  50  112:ifeq            196
				{
					view = ((View) (view.getParent()));
		//   51  115:aload_1         
		//   52  116:invokevirtual   #169 <Method android.view.ViewParent View.getParent()>
		//   53  119:astore_1        
					if(view instanceof ViewGroup)
		//*  54  120:aload_1         
		//*  55  121:instanceof      #171 <Class ViewGroup>
		//*  56  124:ifeq            193
					{
						view = ((View) (findVisibleChildren((ViewGroup)view)));
		//   57  127:aload_1         
		//   58  128:checkcast       #171 <Class ViewGroup>
		//   59  131:invokestatic    #175 <Method List findVisibleChildren(ViewGroup)>
		//   60  134:astore_1        
						int k = ((List) (view)).size();
		//   61  135:aload_1         
		//   62  136:invokeinterface #145 <Method int List.size()>
		//   63  141:istore          6
						for(j = 0; j < k; j++)
		//*  64  143:iconst_0        
		//*  65  144:istore          4
		//*  66  146:iload           4
		//*  67  148:iload           6
		//*  68  150:icmpge          193
							((List) (obj)).addAll(((java.util.Collection) (findViewByPath(eventbinding, (View)((List) (view)).get(j), list, i + 1, j, s))));
		//   69  153:aload           7
		//   70  155:aload_0         
		//   71  156:aload_1         
		//   72  157:iload           4
		//   73  159:invokeinterface #155 <Method Object List.get(int)>
		//   74  164:checkcast       #92  <Class View>
		//   75  167:aload_2         
		//   76  168:iload_3         
		//   77  169:iconst_1        
		//   78  170:iadd            
		//   79  171:iload           4
		//   80  173:aload           5
		//   81  175:invokestatic    #177 <Method List findViewByPath(EventBinding, View, List, int, int, String)>
		//   82  178:invokeinterface #181 <Method boolean List.addAll(java.util.Collection)>
		//   83  183:pop             

		//   84  184:iload           4
		//   85  186:iconst_1        
		//   86  187:iadd            
		//   87  188:istore          4
					}
		//*  88  190:goto            146
					return ((List) (obj));
		//   89  193:aload           7
		//   90  195:areturn         
				}
				if(pathcomponent.className.equals("."))
		//*  91  196:aload           8
		//*  92  198:getfield        #160 <Field String PathComponent.className>
		//*  93  201:ldc1            #127 <String ".">
		//*  94  203:invokevirtual   #165 <Method boolean String.equals(Object)>
		//*  95  206:ifeq            230
				{
					((List) (obj)).add(((Object) (new MatchedView(view, s))));
		//   96  209:aload           7
		//   97  211:new             #62  <Class CodelessMatcher$MatchedView>
		//   98  214:dup             
		//   99  215:aload_1         
		//  100  216:aload           5
		//  101  218:invokespecial   #148 <Method void CodelessMatcher$MatchedView(View, String)>
		//  102  221:invokeinterface #151 <Method boolean List.add(Object)>
		//  103  226:pop             
					return ((List) (obj));
		//  104  227:aload           7
		//  105  229:areturn         
				}
				if(!isTheSameView(view, pathcomponent, j))
		//* 106  230:aload_1         
		//* 107  231:aload           8
		//* 108  233:iload           4
		//* 109  235:invokestatic    #185 <Method boolean isTheSameView(View, PathComponent, int)>
		//* 110  238:ifne            244
					return ((List) (obj));
		//  111  241:aload           7
		//  112  243:areturn         
				if(i == list.size() - 1)
		//* 113  244:iload_3         
		//* 114  245:aload_2         
		//* 115  246:invokeinterface #145 <Method int List.size()>
		//* 116  251:iconst_1        
		//* 117  252:isub            
		//* 118  253:icmpne          274
					((List) (obj)).add(((Object) (new MatchedView(view, s))));
		//  119  256:aload           7
		//  120  258:new             #62  <Class CodelessMatcher$MatchedView>
		//  121  261:dup             
		//  122  262:aload_1         
		//  123  263:aload           5
		//  124  265:invokespecial   #148 <Method void CodelessMatcher$MatchedView(View, String)>
		//  125  268:invokeinterface #151 <Method boolean List.add(Object)>
		//  126  273:pop             
			}
			if(view instanceof ViewGroup)
		//* 127  274:aload_1         
		//* 128  275:instanceof      #171 <Class ViewGroup>
		//* 129  278:ifeq            347
			{
				view = ((View) (findVisibleChildren((ViewGroup)view)));
		//  130  281:aload_1         
		//  131  282:checkcast       #171 <Class ViewGroup>
		//  132  285:invokestatic    #175 <Method List findVisibleChildren(ViewGroup)>
		//  133  288:astore_1        
				int l = ((List) (view)).size();
		//  134  289:aload_1         
		//  135  290:invokeinterface #145 <Method int List.size()>
		//  136  295:istore          6
				for(j = 0; j < l; j++)
		//* 137  297:iconst_0        
		//* 138  298:istore          4
		//* 139  300:iload           4
		//* 140  302:iload           6
		//* 141  304:icmpge          347
					((List) (obj)).addAll(((java.util.Collection) (findViewByPath(eventbinding, (View)((List) (view)).get(j), list, i + 1, j, s))));
		//  142  307:aload           7
		//  143  309:aload_0         
		//  144  310:aload_1         
		//  145  311:iload           4
		//  146  313:invokeinterface #155 <Method Object List.get(int)>
		//  147  318:checkcast       #92  <Class View>
		//  148  321:aload_2         
		//  149  322:iload_3         
		//  150  323:iconst_1        
		//  151  324:iadd            
		//  152  325:iload           4
		//  153  327:aload           5
		//  154  329:invokestatic    #177 <Method List findViewByPath(EventBinding, View, List, int, int, String)>
		//  155  332:invokeinterface #181 <Method boolean List.addAll(java.util.Collection)>
		//  156  337:pop             

		//  157  338:iload           4
		//  158  340:iconst_1        
		//  159  341:iadd            
		//  160  342:istore          4
			}
		//* 161  344:goto            300
			return ((List) (obj));
		//  162  347:aload           7
		//  163  349:areturn         
		}

		private static List findVisibleChildren(ViewGroup viewgroup)
		{
			ArrayList arraylist = new ArrayList();
		//    0    0:new             #138 <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #139 <Method void ArrayList()>
		//    3    7:astore_3        
			int j = viewgroup.getChildCount();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #189 <Method int ViewGroup.getChildCount()>
		//    6   12:istore_2        
			for(int i = 0; i < j; i++)
		//*   7   13:iconst_0        
		//*   8   14:istore_1        
		//*   9   15:iload_1         
		//*  10   16:iload_2         
		//*  11   17:icmpge          51
			{
				View view = viewgroup.getChildAt(i);
		//   12   20:aload_0         
		//   13   21:iload_1         
		//   14   22:invokevirtual   #193 <Method View ViewGroup.getChildAt(int)>
		//   15   25:astore          4
				if(view.getVisibility() == 0)
		//*  16   27:aload           4
		//*  17   29:invokevirtual   #196 <Method int View.getVisibility()>
		//*  18   32:ifne            44
					((List) (arraylist)).add(((Object) (view)));
		//   19   35:aload_3         
		//   20   36:aload           4
		//   21   38:invokeinterface #151 <Method boolean List.add(Object)>
		//   22   43:pop             
			}

		//   23   44:iload_1         
		//   24   45:iconst_1        
		//   25   46:iadd            
		//   26   47:istore_1        
		//*  27   48:goto            15
			return ((List) (arraylist));
		//   28   51:aload_3         
		//   29   52:areturn         
		}

		private static boolean isTheSameView(View view, PathComponent pathcomponent, int i)
		{
			if(pathcomponent.index != -1 && i != pathcomponent.index)
		//*   0    0:aload_1         
		//*   1    1:getfield        #201 <Field int PathComponent.index>
		//*   2    4:iconst_m1       
		//*   3    5:icmpeq          18
		//*   4    8:iload_2         
		//*   5    9:aload_1         
		//*   6   10:getfield        #201 <Field int PathComponent.index>
		//*   7   13:icmpeq          18
				return false;
		//    8   16:iconst_0        
		//    9   17:ireturn         
			if(!((Object) (view)).getClass().getCanonicalName().equals(((Object) (pathcomponent.className))))
		//*  10   18:aload_0         
		//*  11   19:invokevirtual   #205 <Method Class Object.getClass()>
		//*  12   22:invokevirtual   #210 <Method String Class.getCanonicalName()>
		//*  13   25:aload_1         
		//*  14   26:getfield        #160 <Field String PathComponent.className>
		//*  15   29:invokevirtual   #165 <Method boolean String.equals(Object)>
		//*  16   32:ifne            89
				if(pathcomponent.className.matches(".*android\\..*"))
		//*  17   35:aload_1         
		//*  18   36:getfield        #160 <Field String PathComponent.className>
		//*  19   39:ldc1            #212 <String ".*android\\..*">
		//*  20   41:invokevirtual   #216 <Method boolean String.matches(String)>
		//*  21   44:ifeq            87
				{
					String as[] = pathcomponent.className.split("\\.");
		//   22   47:aload_1         
		//   23   48:getfield        #160 <Field String PathComponent.className>
		//   24   51:ldc1            #218 <String "\\.">
		//   25   53:invokevirtual   #222 <Method String[] String.split(String)>
		//   26   56:astore_3        
					if(as.length > 0)
		//*  27   57:aload_3         
		//*  28   58:arraylength     
		//*  29   59:ifle            85
					{
						String s = as[as.length - 1];
		//   30   62:aload_3         
		//   31   63:aload_3         
		//   32   64:arraylength     
		//   33   65:iconst_1        
		//   34   66:isub            
		//   35   67:aaload          
		//   36   68:astore_3        
						if(!((Object) (view)).getClass().getSimpleName().equals(((Object) (s))))
		//*  37   69:aload_0         
		//*  38   70:invokevirtual   #205 <Method Class Object.getClass()>
		//*  39   73:invokevirtual   #225 <Method String Class.getSimpleName()>
		//*  40   76:aload_3         
		//*  41   77:invokevirtual   #165 <Method boolean String.equals(Object)>
		//*  42   80:ifne            89
							return false;
		//   43   83:iconst_0        
		//   44   84:ireturn         
					} else
					{
						return false;
		//   45   85:iconst_0        
		//   46   86:ireturn         
					}
				} else
				{
					return false;
		//   47   87:iconst_0        
		//   48   88:ireturn         
				}
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.ID.getValue()) > 0 && pathcomponent.id != view.getId())
		//*  49   89:aload_1         
		//*  50   90:getfield        #228 <Field int PathComponent.matchBitmask>
		//*  51   93:getstatic       #234 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.ID>
		//*  52   96:invokevirtual   #237 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//*  53   99:iand            
		//*  54  100:ifle            116
		//*  55  103:aload_1         
		//*  56  104:getfield        #240 <Field int PathComponent.id>
		//*  57  107:aload_0         
		//*  58  108:invokevirtual   #243 <Method int View.getId()>
		//*  59  111:icmpeq          116
				return false;
		//   60  114:iconst_0        
		//   61  115:ireturn         
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TEXT.getValue()) > 0 && !pathcomponent.text.equals(((Object) (ViewHierarchy.getTextOfView(view)))))
		//*  62  116:aload_1         
		//*  63  117:getfield        #228 <Field int PathComponent.matchBitmask>
		//*  64  120:getstatic       #246 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.TEXT>
		//*  65  123:invokevirtual   #237 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//*  66  126:iand            
		//*  67  127:ifle            146
		//*  68  130:aload_1         
		//*  69  131:getfield        #249 <Field String PathComponent.text>
		//*  70  134:aload_0         
		//*  71  135:invokestatic    #253 <Method String ViewHierarchy.getTextOfView(View)>
		//*  72  138:invokevirtual   #165 <Method boolean String.equals(Object)>
		//*  73  141:ifne            146
				return false;
		//   74  144:iconst_0        
		//   75  145:ireturn         
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0)
		//*  76  146:aload_1         
		//*  77  147:getfield        #228 <Field int PathComponent.matchBitmask>
		//*  78  150:getstatic       #256 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.DESCRIPTION>
		//*  79  153:invokevirtual   #237 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//*  80  156:iand            
		//*  81  157:ifle            199
			{
				String s2 = pathcomponent.description;
		//   82  160:aload_1         
		//   83  161:getfield        #259 <Field String PathComponent.description>
		//   84  164:astore          4
				String s1;
				if(view.getContentDescription() == null)
		//*  85  166:aload_0         
		//*  86  167:invokevirtual   #263 <Method CharSequence View.getContentDescription()>
		//*  87  170:ifnonnull       180
					s1 = "";
		//   88  173:ldc2            #265 <String "">
		//   89  176:astore_3        
				else
		//*  90  177:goto            188
					s1 = String.valueOf(((Object) (view.getContentDescription())));
		//   91  180:aload_0         
		//   92  181:invokevirtual   #263 <Method CharSequence View.getContentDescription()>
		//   93  184:invokestatic    #268 <Method String String.valueOf(Object)>
		//   94  187:astore_3        
				if(!s2.equals(((Object) (s1))))
		//*  95  188:aload           4
		//*  96  190:aload_3         
		//*  97  191:invokevirtual   #165 <Method boolean String.equals(Object)>
		//*  98  194:ifne            199
					return false;
		//   99  197:iconst_0        
		//  100  198:ireturn         
			}
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.HINT.getValue()) > 0 && !pathcomponent.hint.equals(((Object) (ViewHierarchy.getHintOfView(view)))))
		//* 101  199:aload_1         
		//* 102  200:getfield        #228 <Field int PathComponent.matchBitmask>
		//* 103  203:getstatic       #271 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.HINT>
		//* 104  206:invokevirtual   #237 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//* 105  209:iand            
		//* 106  210:ifle            229
		//* 107  213:aload_1         
		//* 108  214:getfield        #274 <Field String PathComponent.hint>
		//* 109  217:aload_0         
		//* 110  218:invokestatic    #277 <Method String ViewHierarchy.getHintOfView(View)>
		//* 111  221:invokevirtual   #165 <Method boolean String.equals(Object)>
		//* 112  224:ifne            229
				return false;
		//  113  227:iconst_0        
		//  114  228:ireturn         
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TAG.getValue()) > 0)
		//* 115  229:aload_1         
		//* 116  230:getfield        #228 <Field int PathComponent.matchBitmask>
		//* 117  233:getstatic       #280 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.TAG>
		//* 118  236:invokevirtual   #237 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//* 119  239:iand            
		//* 120  240:ifle            280
			{
				pathcomponent = ((PathComponent) (pathcomponent.tag));
		//  121  243:aload_1         
		//  122  244:getfield        #283 <Field String PathComponent.tag>
		//  123  247:astore_1        
				if(view.getTag() == null)
		//* 124  248:aload_0         
		//* 125  249:invokevirtual   #287 <Method Object View.getTag()>
		//* 126  252:ifnonnull       262
					view = "";
		//  127  255:ldc2            #265 <String "">
		//  128  258:astore_0        
				else
		//* 129  259:goto            270
					view = ((View) (String.valueOf(view.getTag())));
		//  130  262:aload_0         
		//  131  263:invokevirtual   #287 <Method Object View.getTag()>
		//  132  266:invokestatic    #268 <Method String String.valueOf(Object)>
		//  133  269:astore_0        
				if(!((String) (pathcomponent)).equals(((Object) (view))))
		//* 134  270:aload_1         
		//* 135  271:aload_0         
		//* 136  272:invokevirtual   #165 <Method boolean String.equals(Object)>
		//* 137  275:ifne            280
					return false;
		//  138  278:iconst_0        
		//  139  279:ireturn         
			}
			return true;
		//  140  280:iconst_1        
		//  141  281:ireturn         
		}

		private void startMatch()
		{
			if(eventBindings != null && rootView.get() != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #290 <Field List eventBindings>
		//*   2    4:ifnull          66
		//*   3    7:aload_0         
		//*   4    8:getfield        #39  <Field WeakReference rootView>
		//*   5   11:invokevirtual   #292 <Method Object WeakReference.get()>
		//*   6   14:ifnull          66
			{
				for(int i = 0; i < eventBindings.size(); i++)
		//*   7   17:iconst_0        
		//*   8   18:istore_1        
		//*   9   19:iload_1         
		//*  10   20:aload_0         
		//*  11   21:getfield        #290 <Field List eventBindings>
		//*  12   24:invokeinterface #145 <Method int List.size()>
		//*  13   29:icmpge          66
					findView((EventBinding)eventBindings.get(i), (View)rootView.get());
		//   14   32:aload_0         
		//   15   33:aload_0         
		//   16   34:getfield        #290 <Field List eventBindings>
		//   17   37:iload_1         
		//   18   38:invokeinterface #155 <Method Object List.get(int)>
		//   19   43:checkcast       #98  <Class EventBinding>
		//   20   46:aload_0         
		//   21   47:getfield        #39  <Field WeakReference rootView>
		//   22   50:invokevirtual   #292 <Method Object WeakReference.get()>
		//   23   53:checkcast       #92  <Class View>
		//   24   56:invokevirtual   #296 <Method void findView(EventBinding, View)>

		//   25   59:iload_1         
		//   26   60:iconst_1        
		//   27   61:iadd            
		//   28   62:istore_1        
			}
		//*  29   63:goto            19
		//   30   66:return          
		}

		public void findView(EventBinding eventbinding, View view)
		{
			if(eventbinding != null)
		//*   0    0:aload_1         
		//*   1    1:ifnull          97
			{
				if(view == null)
		//*   2    4:aload_2         
		//*   3    5:ifnonnull       9
					return;
		//    4    8:return          
				if(!TextUtils.isEmpty(((CharSequence) (eventbinding.getActivityName()))) && !eventbinding.getActivityName().equals(((Object) (activityName))))
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #299 <Method String EventBinding.getActivityName()>
		//*   7   13:invokestatic    #305 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   8   16:ifne            34
		//*   9   19:aload_1         
		//*  10   20:invokevirtual   #299 <Method String EventBinding.getActivityName()>
		//*  11   23:aload_0         
		//*  12   24:getfield        #45  <Field String activityName>
		//*  13   27:invokevirtual   #165 <Method boolean String.equals(Object)>
		//*  14   30:ifne            34
					return;
		//   15   33:return          
				Object obj = ((Object) (eventbinding.getViewPath()));
		//   16   34:aload_1         
		//   17   35:invokevirtual   #309 <Method List EventBinding.getViewPath()>
		//   18   38:astore_3        
				if(((List) (obj)).size() > 25)
		//*  19   39:aload_3         
		//*  20   40:invokeinterface #145 <Method int List.size()>
		//*  21   45:bipush          25
		//*  22   47:icmple          51
					return;
		//   23   50:return          
				for(obj = ((Object) (findViewByPath(eventbinding, view, ((List) (obj)), 0, -1, activityName).iterator())); ((Iterator) (obj)).hasNext(); attachListener((MatchedView)((Iterator) (obj)).next(), view, eventbinding));
		//   24   51:aload_1         
		//   25   52:aload_2         
		//   26   53:aload_3         
		//   27   54:iconst_0        
		//   28   55:iconst_m1       
		//   29   56:aload_0         
		//   30   57:getfield        #45  <Field String activityName>
		//   31   60:invokestatic    #177 <Method List findViewByPath(EventBinding, View, List, int, int, String)>
		//   32   63:invokeinterface #313 <Method Iterator List.iterator()>
		//   33   68:astore_3        
		//   34   69:aload_3         
		//   35   70:invokeinterface #319 <Method boolean Iterator.hasNext()>
		//   36   75:ifeq            96
		//   37   78:aload_0         
		//   38   79:aload_3         
		//   39   80:invokeinterface #322 <Method Object Iterator.next()>
		//   40   85:checkcast       #62  <Class CodelessMatcher$MatchedView>
		//   41   88:aload_2         
		//   42   89:aload_1         
		//   43   90:invokespecial   #324 <Method void attachListener(CodelessMatcher$MatchedView, View, EventBinding)>
		//*  44   93:goto            69
				return;
		//   45   96:return          
			} else
			{
				return;
		//   46   97:return          
			}
		}

		public void onGlobalLayout()
		{
			startMatch();
		//    0    0:aload_0         
		//    1    1:invokespecial   #327 <Method void startMatch()>
		//    2    4:return          
		}

		public void onScrollChanged()
		{
			startMatch();
		//    0    0:aload_0         
		//    1    1:invokespecial   #327 <Method void startMatch()>
		//    2    4:return          
		}

		public void run()
		{
			FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
		//    0    0:invokestatic    #334 <Method String FacebookSdk.getApplicationId()>
		//    1    3:invokestatic    #340 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
		//    2    6:astore_1        
			if(fetchedappsettings != null)
		//*   3    7:aload_1         
		//*   4    8:ifnull          80
			{
				if(!fetchedappsettings.getCodelessEventsEnabled())
		//*   5   11:aload_1         
		//*   6   12:invokevirtual   #345 <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
		//*   7   15:ifne            19
					return;
		//    8   18:return          
				eventBindings = EventBinding.parseArray(fetchedappsettings.getEventBindings());
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:invokevirtual   #349 <Method org.json.JSONArray FetchedAppSettings.getEventBindings()>
		//   12   24:invokestatic    #353 <Method List EventBinding.parseArray(org.json.JSONArray)>
		//   13   27:putfield        #290 <Field List eventBindings>
				if(eventBindings != null)
		//*  14   30:aload_0         
		//*  15   31:getfield        #290 <Field List eventBindings>
		//*  16   34:ifnull          79
				{
					Object obj = ((Object) ((View)rootView.get()));
		//   17   37:aload_0         
		//   18   38:getfield        #39  <Field WeakReference rootView>
		//   19   41:invokevirtual   #292 <Method Object WeakReference.get()>
		//   20   44:checkcast       #92  <Class View>
		//   21   47:astore_1        
					if(obj == null)
		//*  22   48:aload_1         
		//*  23   49:ifnonnull       53
						return;
		//   24   52:return          
					obj = ((Object) (((View) (obj)).getViewTreeObserver()));
		//   25   53:aload_1         
		//   26   54:invokevirtual   #357 <Method ViewTreeObserver View.getViewTreeObserver()>
		//   27   57:astore_1        
					if(((ViewTreeObserver) (obj)).isAlive())
		//*  28   58:aload_1         
		//*  29   59:invokevirtual   #362 <Method boolean ViewTreeObserver.isAlive()>
		//*  30   62:ifeq            75
					{
						((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
		//   31   65:aload_1         
		//   32   66:aload_0         
		//   33   67:invokevirtual   #366 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
						((ViewTreeObserver) (obj)).addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
		//   34   70:aload_1         
		//   35   71:aload_0         
		//   36   72:invokevirtual   #370 <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
					}
					startMatch();
		//   37   75:aload_0         
		//   38   76:invokespecial   #327 <Method void startMatch()>
				}
				return;
		//   39   79:return          
			} else
			{
				return;
		//   40   80:return          
			}
		}

		private final String activityName;
		private HashMap delegateMap;
		private List eventBindings;
		private final Handler handler;
		private WeakReference rootView;

		public ViewMatcher(View view, Handler handler1, HashMap hashmap, String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
			rootView = new WeakReference(((Object) (view)));
		//    2    4:aload_0         
		//    3    5:new             #34  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #37  <Method void WeakReference(Object)>
		//    7   13:putfield        #39  <Field WeakReference rootView>
			handler = handler1;
		//    8   16:aload_0         
		//    9   17:aload_2         
		//   10   18:putfield        #41  <Field Handler handler>
			delegateMap = hashmap;
		//   11   21:aload_0         
		//   12   22:aload_3         
		//   13   23:putfield        #43  <Field HashMap delegateMap>
			activityName = s;
		//   14   26:aload_0         
		//   15   27:aload           4
		//   16   29:putfield        #45  <Field String activityName>
			handler.postDelayed(((Runnable) (this)), 200L);
		//   17   32:aload_0         
		//   18   33:getfield        #41  <Field Handler handler>
		//   19   36:aload_0         
		//   20   37:ldc2w           #46  <Long 200L>
		//   21   40:invokevirtual   #53  <Method boolean Handler.postDelayed(Runnable, long)>
		//   22   43:pop             
		//   23   44:return          
		}
	}


	public CodelessMatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #40  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #46  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #49  <Method void Handler(Looper)>
	//    7   15:putfield        #51  <Field Handler uiThreadHandler>
		activitiesSet = ((Set) (new HashSet()));
	//    8   18:aload_0         
	//    9   19:new             #53  <Class HashSet>
	//   10   22:dup             
	//   11   23:invokespecial   #54  <Method void HashSet()>
	//   12   26:putfield        #56  <Field Set activitiesSet>
		viewMatchers = ((Set) (new HashSet()));
	//   13   29:aload_0         
	//   14   30:new             #53  <Class HashSet>
	//   15   33:dup             
	//   16   34:invokespecial   #54  <Method void HashSet()>
	//   17   37:putfield        #58  <Field Set viewMatchers>
		delegateMap = new HashMap();
	//   18   40:aload_0         
	//   19   41:new             #60  <Class HashMap>
	//   20   44:dup             
	//   21   45:invokespecial   #61  <Method void HashMap()>
	//   22   48:putfield        #63  <Field HashMap delegateMap>
	//   23   51:return          
	}

	public static Bundle getParameters(EventBinding eventbinding, View view, View view1)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #73  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void Bundle()>
	//    3    7:astore          4
		if(eventbinding == null)
	//*   4    9:aload_0         
	//*   5   10:ifnonnull       16
			return bundle;
	//    6   13:aload           4
	//    7   15:areturn         
		List list = eventbinding.getViewParameters();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #80  <Method List EventBinding.getViewParameters()>
	//   10   20:astore_3        
		if(list != null)
	//*  11   21:aload_3         
	//*  12   22:ifnull          232
		{
			Iterator iterator = list.iterator();
	//   13   25:aload_3         
	//   14   26:invokeinterface #86  <Method Iterator List.iterator()>
	//   15   31:astore          5
label0:
			do
			{
				if(!iterator.hasNext())
					break;
	//   16   33:aload           5
	//   17   35:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            232
				ParameterComponent parametercomponent = (ParameterComponent)iterator.next();
	//   19   43:aload           5
	//   20   45:invokeinterface #96  <Method Object Iterator.next()>
	//   21   50:checkcast       #98  <Class ParameterComponent>
	//   22   53:astore          6
				if(parametercomponent.value != null && parametercomponent.value.length() > 0)
	//*  23   55:aload           6
	//*  24   57:getfield        #101 <Field String ParameterComponent.value>
	//*  25   60:ifnull          92
	//*  26   63:aload           6
	//*  27   65:getfield        #101 <Field String ParameterComponent.value>
	//*  28   68:invokevirtual   #107 <Method int String.length()>
	//*  29   71:ifle            92
				{
					bundle.putString(parametercomponent.name, parametercomponent.value);
	//   30   74:aload           4
	//   31   76:aload           6
	//   32   78:getfield        #110 <Field String ParameterComponent.name>
	//   33   81:aload           6
	//   34   83:getfield        #101 <Field String ParameterComponent.value>
	//   35   86:invokevirtual   #114 <Method void Bundle.putString(String, String)>
					continue;
	//   36   89:goto            33
				}
				if(parametercomponent.path.size() <= 0)
					continue;
	//   37   92:aload           6
	//   38   94:getfield        #118 <Field List ParameterComponent.path>
	//   39   97:invokeinterface #121 <Method int List.size()>
	//   40  102:ifle            33
				Object obj;
				if(parametercomponent.pathType.equals("relative"))
	//*  41  105:aload           6
	//*  42  107:getfield        #124 <Field String ParameterComponent.pathType>
	//*  43  110:ldc1            #126 <String "relative">
	//*  44  112:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  45  115:ifeq            141
					obj = ((Object) (ViewMatcher.findViewByPath(eventbinding, view1, parametercomponent.path, 0, -1, ((Object) (view1)).getClass().getSimpleName())));
	//   46  118:aload_0         
	//   47  119:aload_2         
	//   48  120:aload           6
	//   49  122:getfield        #118 <Field List ParameterComponent.path>
	//   50  125:iconst_0        
	//   51  126:iconst_m1       
	//   52  127:aload_2         
	//   53  128:invokevirtual   #134 <Method Class Object.getClass()>
	//   54  131:invokevirtual   #137 <Method String Class.getSimpleName()>
	//   55  134:invokestatic    #141 <Method List CodelessMatcher$ViewMatcher.findViewByPath(EventBinding, View, List, int, int, String)>
	//   56  137:astore_3        
				else
	//*  57  138:goto            161
					obj = ((Object) (ViewMatcher.findViewByPath(eventbinding, view, parametercomponent.path, 0, -1, ((Object) (view)).getClass().getSimpleName())));
	//   58  141:aload_0         
	//   59  142:aload_1         
	//   60  143:aload           6
	//   61  145:getfield        #118 <Field List ParameterComponent.path>
	//   62  148:iconst_0        
	//   63  149:iconst_m1       
	//   64  150:aload_1         
	//   65  151:invokevirtual   #134 <Method Class Object.getClass()>
	//   66  154:invokevirtual   #137 <Method String Class.getSimpleName()>
	//   67  157:invokestatic    #141 <Method List CodelessMatcher$ViewMatcher.findViewByPath(EventBinding, View, List, int, int, String)>
	//   68  160:astore_3        
				obj = ((Object) (((List) (obj)).iterator()));
	//   69  161:aload_3         
	//   70  162:invokeinterface #86  <Method Iterator List.iterator()>
	//   71  167:astore_3        
				Object obj1;
				do
				{
					do
					{
						if(!((Iterator) (obj)).hasNext())
							continue label0;
	//   72  168:aload_3         
	//   73  169:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//   74  174:ifeq            33
						obj1 = ((Object) ((MatchedView)((Iterator) (obj)).next()));
	//   75  177:aload_3         
	//   76  178:invokeinterface #96  <Method Object Iterator.next()>
	//   77  183:checkcast       #8   <Class CodelessMatcher$MatchedView>
	//   78  186:astore          7
					} while(((MatchedView) (obj1)).getView() == null);
	//   79  188:aload           7
	//   80  190:invokevirtual   #145 <Method View CodelessMatcher$MatchedView.getView()>
	//   81  193:ifnonnull       199
	//*  82  196:goto            168
					obj1 = ((Object) (ViewHierarchy.getTextOfView(((MatchedView) (obj1)).getView())));
	//   83  199:aload           7
	//   84  201:invokevirtual   #145 <Method View CodelessMatcher$MatchedView.getView()>
	//   85  204:invokestatic    #151 <Method String ViewHierarchy.getTextOfView(View)>
	//   86  207:astore          7
				} while(((String) (obj1)).length() <= 0);
	//   87  209:aload           7
	//   88  211:invokevirtual   #107 <Method int String.length()>
	//   89  214:ifle            168
				bundle.putString(parametercomponent.name, ((String) (obj1)));
	//   90  217:aload           4
	//   91  219:aload           6
	//   92  221:getfield        #110 <Field String ParameterComponent.name>
	//   93  224:aload           7
	//   94  226:invokevirtual   #114 <Method void Bundle.putString(String, String)>
			} while(true);
	//   95  229:goto            33
		}
		return bundle;
	//   96  232:aload           4
	//   97  234:areturn         
	}

	private void matchViews()
	{
		Object obj;
		for(Iterator iterator = activitiesSet.iterator(); iterator.hasNext(); viewMatchers.add(obj))
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field Set activitiesSet>
	//*   2    4:invokeinterface #154 <Method Iterator Set.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #92  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            80
		{
			Object obj1 = ((Object) ((Activity)iterator.next()));
	//    7   19:aload_1         
	//    8   20:invokeinterface #96  <Method Object Iterator.next()>
	//    9   25:checkcast       #156 <Class Activity>
	//   10   28:astore_3        
			obj = ((Object) (((Activity) (obj1)).getWindow().getDecorView().getRootView()));
	//   11   29:aload_3         
	//   12   30:invokevirtual   #160 <Method Window Activity.getWindow()>
	//   13   33:invokevirtual   #165 <Method View Window.getDecorView()>
	//   14   36:invokevirtual   #170 <Method View View.getRootView()>
	//   15   39:astore_2        
			obj1 = ((Object) (obj1.getClass().getSimpleName()));
	//   16   40:aload_3         
	//   17   41:invokevirtual   #134 <Method Class Object.getClass()>
	//   18   44:invokevirtual   #137 <Method String Class.getSimpleName()>
	//   19   47:astore_3        
			obj = ((Object) (new ViewMatcher(((View) (obj)), uiThreadHandler, delegateMap, ((String) (obj1)))));
	//   20   48:new             #11  <Class CodelessMatcher$ViewMatcher>
	//   21   51:dup             
	//   22   52:aload_2         
	//   23   53:aload_0         
	//   24   54:getfield        #51  <Field Handler uiThreadHandler>
	//   25   57:aload_0         
	//   26   58:getfield        #63  <Field HashMap delegateMap>
	//   27   61:aload_3         
	//   28   62:invokespecial   #173 <Method void CodelessMatcher$ViewMatcher(View, Handler, HashMap, String)>
	//   29   65:astore_2        
		}

	//   30   66:aload_0         
	//   31   67:getfield        #58  <Field Set viewMatchers>
	//   32   70:aload_2         
	//   33   71:invokeinterface #176 <Method boolean Set.add(Object)>
	//   34   76:pop             
	//*  35   77:goto            10
	//   36   80:return          
	}

	private void startTracking()
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #183 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #46  <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #186 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       17
		{
			matchViews();
	//    4   12:aload_0         
	//    5   13:invokespecial   #68  <Method void matchViews()>
			return;
	//    6   16:return          
		} else
		{
			uiThreadHandler.post(new Runnable() {

				public void run()
				{
					matchViews();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field CodelessMatcher this$0>
				//    2    4:invokestatic    #24  <Method void CodelessMatcher.access$000(CodelessMatcher)>
				//    3    7:return          
				}

				final CodelessMatcher this$0;

			
			{
				this$0 = CodelessMatcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CodelessMatcher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    7   17:aload_0         
	//    8   18:getfield        #51  <Field Handler uiThreadHandler>
	//    9   21:new             #6   <Class CodelessMatcher$1>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokespecial   #188 <Method void CodelessMatcher$1(CodelessMatcher)>
	//   13   29:invokevirtual   #192 <Method boolean Handler.post(Runnable)>
	//   14   32:pop             
			return;
	//   15   33:return          
		}
	}

	public void add(Activity activity)
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #183 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #46  <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #186 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       35
		{
			activitiesSet.add(((Object) (activity)));
	//    4   12:aload_0         
	//    5   13:getfield        #56  <Field Set activitiesSet>
	//    6   16:aload_1         
	//    7   17:invokeinterface #176 <Method boolean Set.add(Object)>
	//    8   22:pop             
			delegateMap.clear();
	//    9   23:aload_0         
	//   10   24:getfield        #63  <Field HashMap delegateMap>
	//   11   27:invokevirtual   #196 <Method void HashMap.clear()>
			startTracking();
	//   12   30:aload_0         
	//   13   31:invokespecial   #198 <Method void startTracking()>
			return;
	//   14   34:return          
		} else
		{
			throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
	//   15   35:new             #200 <Class FacebookException>
	//   16   38:dup             
	//   17   39:ldc1            #202 <String "Can't add activity to CodelessMatcher on non-UI thread">
	//   18   41:invokespecial   #205 <Method void FacebookException(String)>
	//   19   44:athrow          
		}
	}

	public void remove(Activity activity)
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #183 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #46  <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #186 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       40
		{
			activitiesSet.remove(((Object) (activity)));
	//    4   12:aload_0         
	//    5   13:getfield        #56  <Field Set activitiesSet>
	//    6   16:aload_1         
	//    7   17:invokeinterface #208 <Method boolean Set.remove(Object)>
	//    8   22:pop             
			viewMatchers.clear();
	//    9   23:aload_0         
	//   10   24:getfield        #58  <Field Set viewMatchers>
	//   11   27:invokeinterface #209 <Method void Set.clear()>
			delegateMap.clear();
	//   12   32:aload_0         
	//   13   33:getfield        #63  <Field HashMap delegateMap>
	//   14   36:invokevirtual   #196 <Method void HashMap.clear()>
			return;
	//   15   39:return          
		} else
		{
			throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
	//   16   40:new             #200 <Class FacebookException>
	//   17   43:dup             
	//   18   44:ldc1            #211 <String "Can't remove activity from CodelessMatcher on non-UI thread">
	//   19   46:invokespecial   #205 <Method void FacebookException(String)>
	//   20   49:athrow          
		}
	}

	private static final String TAG = ((Class) (com/facebook/appevents/codeless/CodelessMatcher)).getCanonicalName();
	private Set activitiesSet;
	private HashMap delegateMap;
	private final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
	private Set viewMatchers;

	static 
	{
	//    0    0:ldc1            #2   <Class CodelessMatcher>
	//    1    2:invokevirtual   #32  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #34  <Field String TAG>
	//*   3    8:return          
	}


/*
	static void access$000(CodelessMatcher codelessmatcher)
	{
		codelessmatcher.matchViews();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void matchViews()>
		return;
	//    2    4:return          
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #34  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
