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
import com.facebook.internal.*;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.facebook.appevents.codeless:
//			CodelessLoggingEventListener, RCTCodelessLoggingEventListener

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
		//    5    9:astore          7
			if(view1 == null)
		//*   6   11:aload           7
		//*   7   13:ifnonnull       17
				return;
		//    8   16:return          
			Object obj = ((Object) (ViewHierarchy.findRCTRootView(view1)));
		//    9   17:aload           7
		//   10   19:invokestatic    #72  <Method View ViewHierarchy.findRCTRootView(View)>
		//   11   22:astore          8
			if(obj == null)
				break MISSING_BLOCK_LABEL_49;
		//   12   24:aload           8
		//   13   26:ifnull          49
			if(ViewHierarchy.isRCTButton(view1, ((View) (obj))))
		//*  14   29:aload           7
		//*  15   31:aload           8
		//*  16   33:invokestatic    #76  <Method boolean ViewHierarchy.isRCTButton(View, View)>
		//*  17   36:ifeq            49
			{
				attachRCTListener(matchedview, view, ((View) (obj)), eventbinding);
		//   18   39:aload_0         
		//   19   40:aload_1         
		//   20   41:aload_2         
		//   21   42:aload           8
		//   22   44:aload_3         
		//   23   45:invokespecial   #80  <Method void attachRCTListener(CodelessMatcher$MatchedView, View, View, EventBinding)>
				return;
		//   24   48:return          
			}
			if(((Object) (view1)).getClass().getName().startsWith("com.facebook.react"))
		//*  25   49:aload           7
		//*  26   51:invokevirtual   #84  <Method Class Object.getClass()>
		//*  27   54:invokevirtual   #90  <Method String Class.getName()>
		//*  28   57:ldc1            #92  <String "com.facebook.react">
		//*  29   59:invokevirtual   #98  <Method boolean String.startsWith(String)>
		//*  30   62:ifeq            66
				return;
		//   31   65:return          
			matchedview = ((MatchedView) (matchedview.getViewMapKey()));
		//   32   66:aload_1         
		//   33   67:invokevirtual   #101 <Method String CodelessMatcher$MatchedView.getViewMapKey()>
		//   34   70:astore_1        
			obj = ((Object) (ViewHierarchy.getExistingDelegate(view1)));
		//   35   71:aload           7
		//   36   73:invokestatic    #105 <Method android.view.View$AccessibilityDelegate ViewHierarchy.getExistingDelegate(View)>
		//   37   76:astore          8
			boolean flag1;
			boolean flag2;
			flag2 = true;
		//   38   78:iconst_1        
		//   39   79:istore          6
			boolean flag;
			if(obj != null)
		//*  40   81:aload           8
		//*  41   83:ifnull          194
				flag = true;
		//   42   86:iconst_1        
		//   43   87:istore          4
			else
		//*  44   89:goto            92
		//*  45   92:iload           4
		//*  46   94:ifeq            200
		//*  47   97:aload           8
		//*  48   99:instanceof      #107 <Class CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate>
		//*  49  102:ifeq            200
		//*  50  105:iconst_1        
		//*  51  106:istore          5
		//*  52  108:goto            111
		//*  53  111:iload           5
		//*  54  113:ifeq            206
		//*  55  116:aload           8
		//*  56  118:checkcast       #107 <Class CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate>
		//*  57  121:invokevirtual   #111 <Method boolean CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate.getSupportCodelessLogging()>
		//*  58  124:ifeq            206
		//*  59  127:goto            130
		//*  60  130:aload_0         
		//*  61  131:getfield        #43  <Field HashMap delegateMap>
		//*  62  134:aload_1         
		//*  63  135:invokevirtual   #117 <Method boolean HashMap.containsKey(Object)>
		//*  64  138:ifne            193
		//*  65  141:iload           4
		//*  66  143:ifeq            156
		//*  67  146:iload           5
		//*  68  148:ifeq            156
		//*  69  151:iload           6
		//*  70  153:ifne            193
		//*  71  156:aload           7
		//*  72  158:aload_3         
		//*  73  159:aload_2         
		//*  74  160:aload           7
		//*  75  162:invokestatic    #123 <Method CodelessLoggingEventListener$AutoLoggingAccessibilityDelegate CodelessLoggingEventListener.getAccessibilityDelegate(EventBinding, View, View)>
		//*  76  165:invokevirtual   #129 <Method void View.setAccessibilityDelegate(android.view.View$AccessibilityDelegate)>
		//*  77  168:aload_0         
		//*  78  169:getfield        #43  <Field HashMap delegateMap>
		//*  79  172:aload_1         
		//*  80  173:aload_3         
		//*  81  174:invokevirtual   #134 <Method String EventBinding.getEventName()>
		//*  82  177:invokevirtual   #138 <Method Object HashMap.put(Object, Object)>
		//*  83  180:pop             
		//*  84  181:return          
		//*  85  182:astore_1        
		//*  86  183:invokestatic    #141 <Method String CodelessMatcher.access$100()>
		//*  87  186:ldc1            #143 <String "Failed to attach auto logging event listener.">
		//*  88  188:aload_1         
		//*  89  189:invokestatic    #149 <Method int Log.e(String, String, Throwable)>
		//*  90  192:pop             
		//*  91  193:return          
				flag = false;
		//   92  194:iconst_0        
		//   93  195:istore          4
			if(!flag) goto _L2; else goto _L1
_L1:
			if(!(obj instanceof CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate)) goto _L2; else goto _L3
_L3:
			flag1 = true;
_L4:
			if(!flag1)
				break MISSING_BLOCK_LABEL_206;
			if(!((CodelessLoggingEventListener.AutoLoggingAccessibilityDelegate)obj).getSupportCodelessLogging())
				break MISSING_BLOCK_LABEL_206;
_L5:
			if(!delegateMap.containsKey(((Object) (matchedview))) && (!flag || !flag1 || !flag2))
				try
				{
					view1.setAccessibilityDelegate(((android.view.View.AccessibilityDelegate) (CodelessLoggingEventListener.getAccessibilityDelegate(eventbinding, view, view1))));
					delegateMap.put(((Object) (matchedview)), ((Object) (eventbinding.getEventName())));
					return;
				}
				// Misplaced declaration of an exception variable
				catch(MatchedView matchedview)
				{
					Log.e(CodelessMatcher.TAG, "Failed to attach auto logging event listener.", ((Throwable) (matchedview)));
				}
			return;
		//*  94  197:goto            92
_L2:
			flag1 = false;
		//   95  200:iconst_0        
		//   96  201:istore          5
			  goto _L4
		//*  97  203:goto            111
			flag2 = false;
		//   98  206:iconst_0        
		//   99  207:istore          6
			  goto _L5
		//* 100  209:goto            130
		}

		private void attachRCTListener(MatchedView matchedview, View view, View view1, EventBinding eventbinding)
		{
			if(eventbinding == null)
		//*   0    0:aload           4
		//*   1    2:ifnonnull       6
				return;
		//    2    5:return          
			View view2 = matchedview.getView();
		//    3    6:aload_1         
		//    4    7:invokevirtual   #66  <Method View CodelessMatcher$MatchedView.getView()>
		//    5   10:astore          8
			if(view2 != null)
		//*   6   12:aload           8
		//*   7   14:ifnull          150
			{
				if(!ViewHierarchy.isRCTButton(view2, view1))
		//*   8   17:aload           8
		//*   9   19:aload_3         
		//*  10   20:invokestatic    #76  <Method boolean ViewHierarchy.isRCTButton(View, View)>
		//*  11   23:ifne            27
					return;
		//   12   26:return          
				matchedview = ((MatchedView) (matchedview.getViewMapKey()));
		//   13   27:aload_1         
		//   14   28:invokevirtual   #101 <Method String CodelessMatcher$MatchedView.getViewMapKey()>
		//   15   31:astore_1        
				view1 = ((View) (ViewHierarchy.getExistingOnTouchListener(view2)));
		//   16   32:aload           8
		//   17   34:invokestatic    #153 <Method android.view.View$OnTouchListener ViewHierarchy.getExistingOnTouchListener(View)>
		//   18   37:astore_3        
				boolean flag2 = true;
		//   19   38:iconst_1        
		//   20   39:istore          7
				boolean flag;
				if(view1 != null)
		//*  21   41:aload_3         
		//*  22   42:ifnull          51
					flag = true;
		//   23   45:iconst_1        
		//   24   46:istore          5
				else
		//*  25   48:goto            54
					flag = false;
		//   26   51:iconst_0        
		//   27   52:istore          5
				boolean flag1;
				if(flag && (view1 instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener))
		//*  28   54:iload           5
		//*  29   56:ifeq            72
		//*  30   59:aload_3         
		//*  31   60:instanceof      #155 <Class RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener>
		//*  32   63:ifeq            72
					flag1 = true;
		//   33   66:iconst_1        
		//   34   67:istore          6
				else
		//*  35   69:goto            75
					flag1 = false;
		//   36   72:iconst_0        
		//   37   73:istore          6
				if(!flag1 || !((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener)view1).getSupportCodelessLogging())
		//*  38   75:iload           6
		//*  39   77:ifeq            93
		//*  40   80:aload_3         
		//*  41   81:checkcast       #155 <Class RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener>
		//*  42   84:invokevirtual   #156 <Method boolean RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener.getSupportCodelessLogging()>
		//*  43   87:ifeq            93
		//*  44   90:goto            96
					flag2 = false;
		//   45   93:iconst_0        
		//   46   94:istore          7
				if(!delegateMap.containsKey(((Object) (matchedview))) && (!flag || !flag1 || !flag2))
		//*  47   96:aload_0         
		//*  48   97:getfield        #43  <Field HashMap delegateMap>
		//*  49  100:aload_1         
		//*  50  101:invokevirtual   #117 <Method boolean HashMap.containsKey(Object)>
		//*  51  104:ifne            149
		//*  52  107:iload           5
		//*  53  109:ifeq            122
		//*  54  112:iload           6
		//*  55  114:ifeq            122
		//*  56  117:iload           7
		//*  57  119:ifne            149
				{
					view2.setOnTouchListener(((android.view.View.OnTouchListener) (RCTCodelessLoggingEventListener.getOnTouchListener(eventbinding, view, view2))));
		//   58  122:aload           8
		//   59  124:aload           4
		//   60  126:aload_2         
		//   61  127:aload           8
		//   62  129:invokestatic    #162 <Method RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener RCTCodelessLoggingEventListener.getOnTouchListener(EventBinding, View, View)>
		//   63  132:invokevirtual   #166 <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
					delegateMap.put(((Object) (matchedview)), ((Object) (eventbinding.getEventName())));
		//   64  135:aload_0         
		//   65  136:getfield        #43  <Field HashMap delegateMap>
		//   66  139:aload_1         
		//   67  140:aload           4
		//   68  142:invokevirtual   #134 <Method String EventBinding.getEventName()>
		//   69  145:invokevirtual   #138 <Method Object HashMap.put(Object, Object)>
		//   70  148:pop             
				}
				return;
		//   71  149:return          
			} else
			{
				return;
		//   72  150:return          
			}
		}

		public static List findViewByPath(EventBinding eventbinding, View view, List list, int i, int j, String s)
		{
			Object obj = ((Object) (new StringBuilder()));
		//    0    0:new             #170 <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #171 <Method void StringBuilder()>
		//    3    7:astore          7
			((StringBuilder) (obj)).append(s);
		//    4    9:aload           7
		//    5   11:aload           5
		//    6   13:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//    7   16:pop             
			((StringBuilder) (obj)).append(".");
		//    8   17:aload           7
		//    9   19:ldc1            #177 <String ".">
		//   10   21:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   11   24:pop             
			((StringBuilder) (obj)).append(String.valueOf(j));
		//   12   25:aload           7
		//   13   27:iload           4
		//   14   29:invokestatic    #181 <Method String String.valueOf(int)>
		//   15   32:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   16   35:pop             
			s = ((StringBuilder) (obj)).toString();
		//   17   36:aload           7
		//   18   38:invokevirtual   #184 <Method String StringBuilder.toString()>
		//   19   41:astore          5
			obj = ((Object) (new ArrayList()));
		//   20   43:new             #186 <Class ArrayList>
		//   21   46:dup             
		//   22   47:invokespecial   #187 <Method void ArrayList()>
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
		//*  30   61:invokeinterface #193 <Method int List.size()>
		//*  31   66:icmplt          90
			{
				((List) (obj)).add(((Object) (new MatchedView(view, s))));
		//   32   69:aload           7
		//   33   71:new             #62  <Class CodelessMatcher$MatchedView>
		//   34   74:dup             
		//   35   75:aload_1         
		//   36   76:aload           5
		//   37   78:invokespecial   #196 <Method void CodelessMatcher$MatchedView(View, String)>
		//   38   81:invokeinterface #199 <Method boolean List.add(Object)>
		//   39   86:pop             
			} else
		//*  40   87:goto            274
			{
				PathComponent pathcomponent = (PathComponent)list.get(i);
		//   41   90:aload_2         
		//   42   91:iload_3         
		//   43   92:invokeinterface #203 <Method Object List.get(int)>
		//   44   97:checkcast       #205 <Class PathComponent>
		//   45  100:astore          8
				if(pathcomponent.className.equals(".."))
		//*  46  102:aload           8
		//*  47  104:getfield        #208 <Field String PathComponent.className>
		//*  48  107:ldc1            #210 <String "..">
		//*  49  109:invokevirtual   #213 <Method boolean String.equals(Object)>
		//*  50  112:ifeq            196
				{
					view = ((View) (view.getParent()));
		//   51  115:aload_1         
		//   52  116:invokevirtual   #217 <Method android.view.ViewParent View.getParent()>
		//   53  119:astore_1        
					if(view instanceof ViewGroup)
		//*  54  120:aload_1         
		//*  55  121:instanceof      #219 <Class ViewGroup>
		//*  56  124:ifeq            193
					{
						view = ((View) (findVisibleChildren((ViewGroup)view)));
		//   57  127:aload_1         
		//   58  128:checkcast       #219 <Class ViewGroup>
		//   59  131:invokestatic    #223 <Method List findVisibleChildren(ViewGroup)>
		//   60  134:astore_1        
						int k = ((List) (view)).size();
		//   61  135:aload_1         
		//   62  136:invokeinterface #193 <Method int List.size()>
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
		//   73  159:invokeinterface #203 <Method Object List.get(int)>
		//   74  164:checkcast       #125 <Class View>
		//   75  167:aload_2         
		//   76  168:iload_3         
		//   77  169:iconst_1        
		//   78  170:iadd            
		//   79  171:iload           4
		//   80  173:aload           5
		//   81  175:invokestatic    #225 <Method List findViewByPath(EventBinding, View, List, int, int, String)>
		//   82  178:invokeinterface #229 <Method boolean List.addAll(java.util.Collection)>
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
		//*  92  198:getfield        #208 <Field String PathComponent.className>
		//*  93  201:ldc1            #177 <String ".">
		//*  94  203:invokevirtual   #213 <Method boolean String.equals(Object)>
		//*  95  206:ifeq            230
				{
					((List) (obj)).add(((Object) (new MatchedView(view, s))));
		//   96  209:aload           7
		//   97  211:new             #62  <Class CodelessMatcher$MatchedView>
		//   98  214:dup             
		//   99  215:aload_1         
		//  100  216:aload           5
		//  101  218:invokespecial   #196 <Method void CodelessMatcher$MatchedView(View, String)>
		//  102  221:invokeinterface #199 <Method boolean List.add(Object)>
		//  103  226:pop             
					return ((List) (obj));
		//  104  227:aload           7
		//  105  229:areturn         
				}
				if(!isTheSameView(view, pathcomponent, j))
		//* 106  230:aload_1         
		//* 107  231:aload           8
		//* 108  233:iload           4
		//* 109  235:invokestatic    #233 <Method boolean isTheSameView(View, PathComponent, int)>
		//* 110  238:ifne            244
					return ((List) (obj));
		//  111  241:aload           7
		//  112  243:areturn         
				if(i == list.size() - 1)
		//* 113  244:iload_3         
		//* 114  245:aload_2         
		//* 115  246:invokeinterface #193 <Method int List.size()>
		//* 116  251:iconst_1        
		//* 117  252:isub            
		//* 118  253:icmpne          274
					((List) (obj)).add(((Object) (new MatchedView(view, s))));
		//  119  256:aload           7
		//  120  258:new             #62  <Class CodelessMatcher$MatchedView>
		//  121  261:dup             
		//  122  262:aload_1         
		//  123  263:aload           5
		//  124  265:invokespecial   #196 <Method void CodelessMatcher$MatchedView(View, String)>
		//  125  268:invokeinterface #199 <Method boolean List.add(Object)>
		//  126  273:pop             
			}
			if(view instanceof ViewGroup)
		//* 127  274:aload_1         
		//* 128  275:instanceof      #219 <Class ViewGroup>
		//* 129  278:ifeq            347
			{
				view = ((View) (findVisibleChildren((ViewGroup)view)));
		//  130  281:aload_1         
		//  131  282:checkcast       #219 <Class ViewGroup>
		//  132  285:invokestatic    #223 <Method List findVisibleChildren(ViewGroup)>
		//  133  288:astore_1        
				int l = ((List) (view)).size();
		//  134  289:aload_1         
		//  135  290:invokeinterface #193 <Method int List.size()>
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
		//  146  313:invokeinterface #203 <Method Object List.get(int)>
		//  147  318:checkcast       #125 <Class View>
		//  148  321:aload_2         
		//  149  322:iload_3         
		//  150  323:iconst_1        
		//  151  324:iadd            
		//  152  325:iload           4
		//  153  327:aload           5
		//  154  329:invokestatic    #225 <Method List findViewByPath(EventBinding, View, List, int, int, String)>
		//  155  332:invokeinterface #229 <Method boolean List.addAll(java.util.Collection)>
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
		//    0    0:new             #186 <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #187 <Method void ArrayList()>
		//    3    7:astore_3        
			int j = viewgroup.getChildCount();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #237 <Method int ViewGroup.getChildCount()>
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
		//   14   22:invokevirtual   #241 <Method View ViewGroup.getChildAt(int)>
		//   15   25:astore          4
				if(view.getVisibility() == 0)
		//*  16   27:aload           4
		//*  17   29:invokevirtual   #244 <Method int View.getVisibility()>
		//*  18   32:ifne            44
					((List) (arraylist)).add(((Object) (view)));
		//   19   35:aload_3         
		//   20   36:aload           4
		//   21   38:invokeinterface #199 <Method boolean List.add(Object)>
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
		//*   1    1:getfield        #249 <Field int PathComponent.index>
		//*   2    4:iconst_m1       
		//*   3    5:icmpeq          18
		//*   4    8:iload_2         
		//*   5    9:aload_1         
		//*   6   10:getfield        #249 <Field int PathComponent.index>
		//*   7   13:icmpeq          18
				return false;
		//    8   16:iconst_0        
		//    9   17:ireturn         
			if(!((Object) (view)).getClass().getCanonicalName().equals(((Object) (pathcomponent.className))))
		//*  10   18:aload_0         
		//*  11   19:invokevirtual   #84  <Method Class Object.getClass()>
		//*  12   22:invokevirtual   #252 <Method String Class.getCanonicalName()>
		//*  13   25:aload_1         
		//*  14   26:getfield        #208 <Field String PathComponent.className>
		//*  15   29:invokevirtual   #213 <Method boolean String.equals(Object)>
		//*  16   32:ifne            90
				if(pathcomponent.className.matches(".*android\\..*"))
		//*  17   35:aload_1         
		//*  18   36:getfield        #208 <Field String PathComponent.className>
		//*  19   39:ldc1            #254 <String ".*android\\..*">
		//*  20   41:invokevirtual   #257 <Method boolean String.matches(String)>
		//*  21   44:ifeq            88
				{
					String as[] = pathcomponent.className.split("\\.");
		//   22   47:aload_1         
		//   23   48:getfield        #208 <Field String PathComponent.className>
		//   24   51:ldc2            #259 <String "\\.">
		//   25   54:invokevirtual   #263 <Method String[] String.split(String)>
		//   26   57:astore_3        
					if(as.length > 0)
		//*  27   58:aload_3         
		//*  28   59:arraylength     
		//*  29   60:ifle            86
					{
						String s = as[as.length - 1];
		//   30   63:aload_3         
		//   31   64:aload_3         
		//   32   65:arraylength     
		//   33   66:iconst_1        
		//   34   67:isub            
		//   35   68:aaload          
		//   36   69:astore_3        
						if(!((Object) (view)).getClass().getSimpleName().equals(((Object) (s))))
		//*  37   70:aload_0         
		//*  38   71:invokevirtual   #84  <Method Class Object.getClass()>
		//*  39   74:invokevirtual   #266 <Method String Class.getSimpleName()>
		//*  40   77:aload_3         
		//*  41   78:invokevirtual   #213 <Method boolean String.equals(Object)>
		//*  42   81:ifne            90
							return false;
		//   43   84:iconst_0        
		//   44   85:ireturn         
					} else
					{
						return false;
		//   45   86:iconst_0        
		//   46   87:ireturn         
					}
				} else
				{
					return false;
		//   47   88:iconst_0        
		//   48   89:ireturn         
				}
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.ID.getValue()) > 0 && pathcomponent.id != view.getId())
		//*  49   90:aload_1         
		//*  50   91:getfield        #269 <Field int PathComponent.matchBitmask>
		//*  51   94:getstatic       #275 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.ID>
		//*  52   97:invokevirtual   #278 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//*  53  100:iand            
		//*  54  101:ifle            117
		//*  55  104:aload_1         
		//*  56  105:getfield        #281 <Field int PathComponent.id>
		//*  57  108:aload_0         
		//*  58  109:invokevirtual   #284 <Method int View.getId()>
		//*  59  112:icmpeq          117
				return false;
		//   60  115:iconst_0        
		//   61  116:ireturn         
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TEXT.getValue()) > 0 && !pathcomponent.text.equals(((Object) (ViewHierarchy.getTextOfView(view)))))
		//*  62  117:aload_1         
		//*  63  118:getfield        #269 <Field int PathComponent.matchBitmask>
		//*  64  121:getstatic       #287 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.TEXT>
		//*  65  124:invokevirtual   #278 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//*  66  127:iand            
		//*  67  128:ifle            147
		//*  68  131:aload_1         
		//*  69  132:getfield        #290 <Field String PathComponent.text>
		//*  70  135:aload_0         
		//*  71  136:invokestatic    #294 <Method String ViewHierarchy.getTextOfView(View)>
		//*  72  139:invokevirtual   #213 <Method boolean String.equals(Object)>
		//*  73  142:ifne            147
				return false;
		//   74  145:iconst_0        
		//   75  146:ireturn         
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0)
		//*  76  147:aload_1         
		//*  77  148:getfield        #269 <Field int PathComponent.matchBitmask>
		//*  78  151:getstatic       #297 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.DESCRIPTION>
		//*  79  154:invokevirtual   #278 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//*  80  157:iand            
		//*  81  158:ifle            200
			{
				String s2 = pathcomponent.description;
		//   82  161:aload_1         
		//   83  162:getfield        #300 <Field String PathComponent.description>
		//   84  165:astore          4
				String s1;
				if(view.getContentDescription() == null)
		//*  85  167:aload_0         
		//*  86  168:invokevirtual   #304 <Method CharSequence View.getContentDescription()>
		//*  87  171:ifnonnull       181
					s1 = "";
		//   88  174:ldc2            #306 <String "">
		//   89  177:astore_3        
				else
		//*  90  178:goto            189
					s1 = String.valueOf(((Object) (view.getContentDescription())));
		//   91  181:aload_0         
		//   92  182:invokevirtual   #304 <Method CharSequence View.getContentDescription()>
		//   93  185:invokestatic    #309 <Method String String.valueOf(Object)>
		//   94  188:astore_3        
				if(!s2.equals(((Object) (s1))))
		//*  95  189:aload           4
		//*  96  191:aload_3         
		//*  97  192:invokevirtual   #213 <Method boolean String.equals(Object)>
		//*  98  195:ifne            200
					return false;
		//   99  198:iconst_0        
		//  100  199:ireturn         
			}
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.HINT.getValue()) > 0 && !pathcomponent.hint.equals(((Object) (ViewHierarchy.getHintOfView(view)))))
		//* 101  200:aload_1         
		//* 102  201:getfield        #269 <Field int PathComponent.matchBitmask>
		//* 103  204:getstatic       #312 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.HINT>
		//* 104  207:invokevirtual   #278 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//* 105  210:iand            
		//* 106  211:ifle            230
		//* 107  214:aload_1         
		//* 108  215:getfield        #315 <Field String PathComponent.hint>
		//* 109  218:aload_0         
		//* 110  219:invokestatic    #318 <Method String ViewHierarchy.getHintOfView(View)>
		//* 111  222:invokevirtual   #213 <Method boolean String.equals(Object)>
		//* 112  225:ifne            230
				return false;
		//  113  228:iconst_0        
		//  114  229:ireturn         
			if((pathcomponent.matchBitmask & com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType.TAG.getValue()) > 0)
		//* 115  230:aload_1         
		//* 116  231:getfield        #269 <Field int PathComponent.matchBitmask>
		//* 117  234:getstatic       #321 <Field com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.TAG>
		//* 118  237:invokevirtual   #278 <Method int com.facebook.appevents.codeless.internal.PathComponent$MatchBitmaskType.getValue()>
		//* 119  240:iand            
		//* 120  241:ifle            281
			{
				pathcomponent = ((PathComponent) (pathcomponent.tag));
		//  121  244:aload_1         
		//  122  245:getfield        #324 <Field String PathComponent.tag>
		//  123  248:astore_1        
				if(view.getTag() == null)
		//* 124  249:aload_0         
		//* 125  250:invokevirtual   #328 <Method Object View.getTag()>
		//* 126  253:ifnonnull       263
					view = "";
		//  127  256:ldc2            #306 <String "">
		//  128  259:astore_0        
				else
		//* 129  260:goto            271
					view = ((View) (String.valueOf(view.getTag())));
		//  130  263:aload_0         
		//  131  264:invokevirtual   #328 <Method Object View.getTag()>
		//  132  267:invokestatic    #309 <Method String String.valueOf(Object)>
		//  133  270:astore_0        
				if(!((String) (pathcomponent)).equals(((Object) (view))))
		//* 134  271:aload_1         
		//* 135  272:aload_0         
		//* 136  273:invokevirtual   #213 <Method boolean String.equals(Object)>
		//* 137  276:ifne            281
					return false;
		//  138  279:iconst_0        
		//  139  280:ireturn         
			}
			return true;
		//  140  281:iconst_1        
		//  141  282:ireturn         
		}

		private void startMatch()
		{
			if(eventBindings != null && rootView.get() != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #331 <Field List eventBindings>
		//*   2    4:ifnull          66
		//*   3    7:aload_0         
		//*   4    8:getfield        #39  <Field WeakReference rootView>
		//*   5   11:invokevirtual   #333 <Method Object WeakReference.get()>
		//*   6   14:ifnull          66
			{
				for(int i = 0; i < eventBindings.size(); i++)
		//*   7   17:iconst_0        
		//*   8   18:istore_1        
		//*   9   19:iload_1         
		//*  10   20:aload_0         
		//*  11   21:getfield        #331 <Field List eventBindings>
		//*  12   24:invokeinterface #193 <Method int List.size()>
		//*  13   29:icmpge          66
					findView((EventBinding)eventBindings.get(i), (View)rootView.get());
		//   14   32:aload_0         
		//   15   33:aload_0         
		//   16   34:getfield        #331 <Field List eventBindings>
		//   17   37:iload_1         
		//   18   38:invokeinterface #203 <Method Object List.get(int)>
		//   19   43:checkcast       #131 <Class EventBinding>
		//   20   46:aload_0         
		//   21   47:getfield        #39  <Field WeakReference rootView>
		//   22   50:invokevirtual   #333 <Method Object WeakReference.get()>
		//   23   53:checkcast       #125 <Class View>
		//   24   56:invokevirtual   #337 <Method void findView(EventBinding, View)>

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
		//*   6   10:invokevirtual   #340 <Method String EventBinding.getActivityName()>
		//*   7   13:invokestatic    #346 <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   8   16:ifne            34
		//*   9   19:aload_1         
		//*  10   20:invokevirtual   #340 <Method String EventBinding.getActivityName()>
		//*  11   23:aload_0         
		//*  12   24:getfield        #45  <Field String activityName>
		//*  13   27:invokevirtual   #213 <Method boolean String.equals(Object)>
		//*  14   30:ifne            34
					return;
		//   15   33:return          
				Object obj = ((Object) (eventbinding.getViewPath()));
		//   16   34:aload_1         
		//   17   35:invokevirtual   #350 <Method List EventBinding.getViewPath()>
		//   18   38:astore_3        
				if(((List) (obj)).size() > 25)
		//*  19   39:aload_3         
		//*  20   40:invokeinterface #193 <Method int List.size()>
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
		//   31   60:invokestatic    #225 <Method List findViewByPath(EventBinding, View, List, int, int, String)>
		//   32   63:invokeinterface #354 <Method Iterator List.iterator()>
		//   33   68:astore_3        
		//   34   69:aload_3         
		//   35   70:invokeinterface #359 <Method boolean Iterator.hasNext()>
		//   36   75:ifeq            96
		//   37   78:aload_0         
		//   38   79:aload_3         
		//   39   80:invokeinterface #362 <Method Object Iterator.next()>
		//   40   85:checkcast       #62  <Class CodelessMatcher$MatchedView>
		//   41   88:aload_2         
		//   42   89:aload_1         
		//   43   90:invokespecial   #364 <Method void attachListener(CodelessMatcher$MatchedView, View, EventBinding)>
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
		//    1    1:invokespecial   #367 <Method void startMatch()>
		//    2    4:return          
		}

		public void onScrollChanged()
		{
			startMatch();
		//    0    0:aload_0         
		//    1    1:invokespecial   #367 <Method void startMatch()>
		//    2    4:return          
		}

		public void run()
		{
			FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
		//    0    0:invokestatic    #374 <Method String FacebookSdk.getApplicationId()>
		//    1    3:invokestatic    #380 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
		//    2    6:astore_1        
			if(fetchedappsettings != null)
		//*   3    7:aload_1         
		//*   4    8:ifnull          80
			{
				if(!fetchedappsettings.getCodelessEventsEnabled())
		//*   5   11:aload_1         
		//*   6   12:invokevirtual   #385 <Method boolean FetchedAppSettings.getCodelessEventsEnabled()>
		//*   7   15:ifne            19
					return;
		//    8   18:return          
				eventBindings = EventBinding.parseArray(fetchedappsettings.getEventBindings());
		//    9   19:aload_0         
		//   10   20:aload_1         
		//   11   21:invokevirtual   #389 <Method org.json.JSONArray FetchedAppSettings.getEventBindings()>
		//   12   24:invokestatic    #393 <Method List EventBinding.parseArray(org.json.JSONArray)>
		//   13   27:putfield        #331 <Field List eventBindings>
				if(eventBindings != null)
		//*  14   30:aload_0         
		//*  15   31:getfield        #331 <Field List eventBindings>
		//*  16   34:ifnull          79
				{
					Object obj = ((Object) ((View)rootView.get()));
		//   17   37:aload_0         
		//   18   38:getfield        #39  <Field WeakReference rootView>
		//   19   41:invokevirtual   #333 <Method Object WeakReference.get()>
		//   20   44:checkcast       #125 <Class View>
		//   21   47:astore_1        
					if(obj == null)
		//*  22   48:aload_1         
		//*  23   49:ifnonnull       53
						return;
		//   24   52:return          
					obj = ((Object) (((View) (obj)).getViewTreeObserver()));
		//   25   53:aload_1         
		//   26   54:invokevirtual   #397 <Method ViewTreeObserver View.getViewTreeObserver()>
		//   27   57:astore_1        
					if(((ViewTreeObserver) (obj)).isAlive())
		//*  28   58:aload_1         
		//*  29   59:invokevirtual   #402 <Method boolean ViewTreeObserver.isAlive()>
		//*  30   62:ifeq            75
					{
						((ViewTreeObserver) (obj)).addOnGlobalLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
		//   31   65:aload_1         
		//   32   66:aload_0         
		//   33   67:invokevirtual   #406 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
						((ViewTreeObserver) (obj)).addOnScrollChangedListener(((android.view.ViewTreeObserver.OnScrollChangedListener) (this)));
		//   34   70:aload_1         
		//   35   71:aload_0         
		//   36   72:invokevirtual   #410 <Method void ViewTreeObserver.addOnScrollChangedListener(android.view.ViewTreeObserver$OnScrollChangedListener)>
					}
					startMatch();
		//   37   75:aload_0         
		//   38   76:invokespecial   #367 <Method void startMatch()>
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
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #46  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #52  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #55  <Method void Handler(Looper)>
	//    7   15:putfield        #57  <Field Handler uiThreadHandler>
		activitiesSet = ((Set) (new HashSet()));
	//    8   18:aload_0         
	//    9   19:new             #59  <Class HashSet>
	//   10   22:dup             
	//   11   23:invokespecial   #60  <Method void HashSet()>
	//   12   26:putfield        #62  <Field Set activitiesSet>
		viewMatchers = ((Set) (new HashSet()));
	//   13   29:aload_0         
	//   14   30:new             #59  <Class HashSet>
	//   15   33:dup             
	//   16   34:invokespecial   #60  <Method void HashSet()>
	//   17   37:putfield        #64  <Field Set viewMatchers>
		delegateMap = new HashMap();
	//   18   40:aload_0         
	//   19   41:new             #66  <Class HashMap>
	//   20   44:dup             
	//   21   45:invokespecial   #67  <Method void HashMap()>
	//   22   48:putfield        #69  <Field HashMap delegateMap>
	//   23   51:return          
	}

	public static Bundle getParameters(EventBinding eventbinding, View view, View view1)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #79  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void Bundle()>
	//    3    7:astore          4
		if(eventbinding == null)
	//*   4    9:aload_0         
	//*   5   10:ifnonnull       16
			return bundle;
	//    6   13:aload           4
	//    7   15:areturn         
		List list = eventbinding.getViewParameters();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #86  <Method List EventBinding.getViewParameters()>
	//   10   20:astore_3        
		if(list != null)
	//*  11   21:aload_3         
	//*  12   22:ifnull          232
		{
			Iterator iterator = list.iterator();
	//   13   25:aload_3         
	//   14   26:invokeinterface #92  <Method Iterator List.iterator()>
	//   15   31:astore          5
label0:
			do
			{
				if(!iterator.hasNext())
					break;
	//   16   33:aload           5
	//   17   35:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            232
				ParameterComponent parametercomponent = (ParameterComponent)iterator.next();
	//   19   43:aload           5
	//   20   45:invokeinterface #102 <Method Object Iterator.next()>
	//   21   50:checkcast       #104 <Class ParameterComponent>
	//   22   53:astore          6
				if(parametercomponent.value != null && parametercomponent.value.length() > 0)
	//*  23   55:aload           6
	//*  24   57:getfield        #107 <Field String ParameterComponent.value>
	//*  25   60:ifnull          92
	//*  26   63:aload           6
	//*  27   65:getfield        #107 <Field String ParameterComponent.value>
	//*  28   68:invokevirtual   #113 <Method int String.length()>
	//*  29   71:ifle            92
				{
					bundle.putString(parametercomponent.name, parametercomponent.value);
	//   30   74:aload           4
	//   31   76:aload           6
	//   32   78:getfield        #116 <Field String ParameterComponent.name>
	//   33   81:aload           6
	//   34   83:getfield        #107 <Field String ParameterComponent.value>
	//   35   86:invokevirtual   #120 <Method void Bundle.putString(String, String)>
					continue;
	//   36   89:goto            33
				}
				if(parametercomponent.path.size() <= 0)
					continue;
	//   37   92:aload           6
	//   38   94:getfield        #124 <Field List ParameterComponent.path>
	//   39   97:invokeinterface #127 <Method int List.size()>
	//   40  102:ifle            33
				Object obj;
				if(parametercomponent.pathType.equals("relative"))
	//*  41  105:aload           6
	//*  42  107:getfield        #130 <Field String ParameterComponent.pathType>
	//*  43  110:ldc1            #132 <String "relative">
	//*  44  112:invokevirtual   #136 <Method boolean String.equals(Object)>
	//*  45  115:ifeq            141
					obj = ((Object) (ViewMatcher.findViewByPath(eventbinding, view1, parametercomponent.path, 0, -1, ((Object) (view1)).getClass().getSimpleName())));
	//   46  118:aload_0         
	//   47  119:aload_2         
	//   48  120:aload           6
	//   49  122:getfield        #124 <Field List ParameterComponent.path>
	//   50  125:iconst_0        
	//   51  126:iconst_m1       
	//   52  127:aload_2         
	//   53  128:invokevirtual   #140 <Method Class Object.getClass()>
	//   54  131:invokevirtual   #143 <Method String Class.getSimpleName()>
	//   55  134:invokestatic    #147 <Method List CodelessMatcher$ViewMatcher.findViewByPath(EventBinding, View, List, int, int, String)>
	//   56  137:astore_3        
				else
	//*  57  138:goto            161
					obj = ((Object) (ViewMatcher.findViewByPath(eventbinding, view, parametercomponent.path, 0, -1, ((Object) (view)).getClass().getSimpleName())));
	//   58  141:aload_0         
	//   59  142:aload_1         
	//   60  143:aload           6
	//   61  145:getfield        #124 <Field List ParameterComponent.path>
	//   62  148:iconst_0        
	//   63  149:iconst_m1       
	//   64  150:aload_1         
	//   65  151:invokevirtual   #140 <Method Class Object.getClass()>
	//   66  154:invokevirtual   #143 <Method String Class.getSimpleName()>
	//   67  157:invokestatic    #147 <Method List CodelessMatcher$ViewMatcher.findViewByPath(EventBinding, View, List, int, int, String)>
	//   68  160:astore_3        
				obj = ((Object) (((List) (obj)).iterator()));
	//   69  161:aload_3         
	//   70  162:invokeinterface #92  <Method Iterator List.iterator()>
	//   71  167:astore_3        
				Object obj1;
				do
				{
					do
					{
						if(!((Iterator) (obj)).hasNext())
							continue label0;
	//   72  168:aload_3         
	//   73  169:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//   74  174:ifeq            33
						obj1 = ((Object) ((MatchedView)((Iterator) (obj)).next()));
	//   75  177:aload_3         
	//   76  178:invokeinterface #102 <Method Object Iterator.next()>
	//   77  183:checkcast       #8   <Class CodelessMatcher$MatchedView>
	//   78  186:astore          7
					} while(((MatchedView) (obj1)).getView() == null);
	//   79  188:aload           7
	//   80  190:invokevirtual   #151 <Method View CodelessMatcher$MatchedView.getView()>
	//   81  193:ifnonnull       199
	//*  82  196:goto            168
					obj1 = ((Object) (ViewHierarchy.getTextOfView(((MatchedView) (obj1)).getView())));
	//   83  199:aload           7
	//   84  201:invokevirtual   #151 <Method View CodelessMatcher$MatchedView.getView()>
	//   85  204:invokestatic    #157 <Method String ViewHierarchy.getTextOfView(View)>
	//   86  207:astore          7
				} while(((String) (obj1)).length() <= 0);
	//   87  209:aload           7
	//   88  211:invokevirtual   #113 <Method int String.length()>
	//   89  214:ifle            168
				bundle.putString(parametercomponent.name, ((String) (obj1)));
	//   90  217:aload           4
	//   91  219:aload           6
	//   92  221:getfield        #116 <Field String ParameterComponent.name>
	//   93  224:aload           7
	//   94  226:invokevirtual   #120 <Method void Bundle.putString(String, String)>
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
	//*   1    1:getfield        #62  <Field Set activitiesSet>
	//*   2    4:invokeinterface #160 <Method Iterator Set.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #98  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            80
		{
			Object obj1 = ((Object) ((Activity)iterator.next()));
	//    7   19:aload_1         
	//    8   20:invokeinterface #102 <Method Object Iterator.next()>
	//    9   25:checkcast       #162 <Class Activity>
	//   10   28:astore_3        
			obj = ((Object) (((Activity) (obj1)).getWindow().getDecorView().getRootView()));
	//   11   29:aload_3         
	//   12   30:invokevirtual   #166 <Method Window Activity.getWindow()>
	//   13   33:invokevirtual   #171 <Method View Window.getDecorView()>
	//   14   36:invokevirtual   #176 <Method View View.getRootView()>
	//   15   39:astore_2        
			obj1 = ((Object) (obj1.getClass().getSimpleName()));
	//   16   40:aload_3         
	//   17   41:invokevirtual   #140 <Method Class Object.getClass()>
	//   18   44:invokevirtual   #143 <Method String Class.getSimpleName()>
	//   19   47:astore_3        
			obj = ((Object) (new ViewMatcher(((View) (obj)), uiThreadHandler, delegateMap, ((String) (obj1)))));
	//   20   48:new             #11  <Class CodelessMatcher$ViewMatcher>
	//   21   51:dup             
	//   22   52:aload_2         
	//   23   53:aload_0         
	//   24   54:getfield        #57  <Field Handler uiThreadHandler>
	//   25   57:aload_0         
	//   26   58:getfield        #69  <Field HashMap delegateMap>
	//   27   61:aload_3         
	//   28   62:invokespecial   #179 <Method void CodelessMatcher$ViewMatcher(View, Handler, HashMap, String)>
	//   29   65:astore_2        
		}

	//   30   66:aload_0         
	//   31   67:getfield        #64  <Field Set viewMatchers>
	//   32   70:aload_2         
	//   33   71:invokeinterface #182 <Method boolean Set.add(Object)>
	//   34   76:pop             
	//*  35   77:goto            10
	//   36   80:return          
	}

	private void startTracking()
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #189 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #52  <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #192 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       17
		{
			matchViews();
	//    4   12:aload_0         
	//    5   13:invokespecial   #74  <Method void matchViews()>
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
	//    8   18:getfield        #57  <Field Handler uiThreadHandler>
	//    9   21:new             #6   <Class CodelessMatcher$1>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokespecial   #194 <Method void CodelessMatcher$1(CodelessMatcher)>
	//   13   29:invokevirtual   #198 <Method boolean Handler.post(Runnable)>
	//   14   32:pop             
			return;
	//   15   33:return          
		}
	}

	public void add(Activity activity)
	{
		if(InternalSettings.isUnityApp())
	//*   0    0:invokestatic    #204 <Method boolean InternalSettings.isUnityApp()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   3    7:invokestatic    #189 <Method Thread Thread.currentThread()>
	//*   4   10:invokestatic    #52  <Method Looper Looper.getMainLooper()>
	//*   5   13:invokevirtual   #192 <Method Thread Looper.getThread()>
	//*   6   16:if_acmpne       42
		{
			activitiesSet.add(((Object) (activity)));
	//    7   19:aload_0         
	//    8   20:getfield        #62  <Field Set activitiesSet>
	//    9   23:aload_1         
	//   10   24:invokeinterface #182 <Method boolean Set.add(Object)>
	//   11   29:pop             
			delegateMap.clear();
	//   12   30:aload_0         
	//   13   31:getfield        #69  <Field HashMap delegateMap>
	//   14   34:invokevirtual   #207 <Method void HashMap.clear()>
			startTracking();
	//   15   37:aload_0         
	//   16   38:invokespecial   #209 <Method void startTracking()>
			return;
	//   17   41:return          
		} else
		{
			throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
	//   18   42:new             #211 <Class FacebookException>
	//   19   45:dup             
	//   20   46:ldc1            #213 <String "Can't add activity to CodelessMatcher on non-UI thread">
	//   21   48:invokespecial   #216 <Method void FacebookException(String)>
	//   22   51:athrow          
		}
	}

	public void remove(Activity activity)
	{
		if(InternalSettings.isUnityApp())
	//*   0    0:invokestatic    #204 <Method boolean InternalSettings.isUnityApp()>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   3    7:invokestatic    #189 <Method Thread Thread.currentThread()>
	//*   4   10:invokestatic    #52  <Method Looper Looper.getMainLooper()>
	//*   5   13:invokevirtual   #192 <Method Thread Looper.getThread()>
	//*   6   16:if_acmpne       47
		{
			activitiesSet.remove(((Object) (activity)));
	//    7   19:aload_0         
	//    8   20:getfield        #62  <Field Set activitiesSet>
	//    9   23:aload_1         
	//   10   24:invokeinterface #219 <Method boolean Set.remove(Object)>
	//   11   29:pop             
			viewMatchers.clear();
	//   12   30:aload_0         
	//   13   31:getfield        #64  <Field Set viewMatchers>
	//   14   34:invokeinterface #220 <Method void Set.clear()>
			delegateMap.clear();
	//   15   39:aload_0         
	//   16   40:getfield        #69  <Field HashMap delegateMap>
	//   17   43:invokevirtual   #207 <Method void HashMap.clear()>
			return;
	//   18   46:return          
		} else
		{
			throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
	//   19   47:new             #211 <Class FacebookException>
	//   20   50:dup             
	//   21   51:ldc1            #222 <String "Can't remove activity from CodelessMatcher on non-UI thread">
	//   22   53:invokespecial   #216 <Method void FacebookException(String)>
	//   23   56:athrow          
		}
	}

	private static final String CURRENT_CLASS_NAME = ".";
	private static final String PARENT_CLASS_NAME = "..";
	private static final String TAG = ((Class) (com/facebook/appevents/codeless/CodelessMatcher)).getCanonicalName();
	private Set activitiesSet;
	private HashMap delegateMap;
	private final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
	private Set viewMatchers;

	static 
	{
	//    0    0:ldc1            #2   <Class CodelessMatcher>
	//    1    2:invokevirtual   #38  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #40  <Field String TAG>
	//*   3    8:return          
	}


/*
	static void access$000(CodelessMatcher codelessmatcher)
	{
		codelessmatcher.matchViews();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void matchViews()>
		return;
	//    2    4:return          
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #40  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
