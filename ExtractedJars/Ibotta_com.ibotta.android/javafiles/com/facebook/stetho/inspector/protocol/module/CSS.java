// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.protocol.module;

import com.facebook.stetho.common.*;
import com.facebook.stetho.inspector.elements.*;
import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeersRegisteredListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.json.ObjectMapper;
import java.util.*;
import org.json.JSONObject;

public class CSS
	implements ChromeDevtoolsDomain
{
	private static class CSSComputedStyleProperty
	{

		public String name;
		public String value;

		private CSSComputedStyleProperty()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class CSSProperty
	{

		public Boolean disabled;
		public Boolean implicit;
		public Boolean important;
		public String name;
		public Boolean parsedOk;
		public SourceRange range;
		public String text;
		public String value;

		private CSSProperty()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class CSSRule
	{

		public Origin origin;
		public SelectorList selectorList;
		public CSSStyle style;
		public String styleSheetId;

		private CSSRule()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class CSSStyle
	{

		public List cssProperties;
		public String cssText;
		public SourceRange range;
		public List shorthandEntries;
		public String styleSheetId;

		private CSSStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class GetComputedStyleForNodeRequest
	{

		public int nodeId;

		private GetComputedStyleForNodeRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class GetComputedStyleForNodeResult
		implements JsonRpcResult
	{

		public List computedStyle;

		private GetComputedStyleForNodeResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class GetMatchedStylesForNodeRequest
		implements JsonRpcResult
	{

		public Boolean excludeInherited;
		public Boolean excludePseudo;
		public int nodeId;

		private GetMatchedStylesForNodeRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class GetMatchedStylesForNodeResult
		implements JsonRpcResult
	{

		public List inherited;
		public List matchedCSSRules;
		public List pseudoElements;

		private GetMatchedStylesForNodeResult()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class InheritedStyleEntry
	{

		public CSSStyle inlineStyle;
		public List matchedCSSRules;

		private InheritedStyleEntry()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	private final class PeerManagerListener extends PeersRegisteredListener
	{

		protected void onFirstPeerRegistered()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			mDocument.addRef();
		//    2    2:aload_0         
		//    3    3:getfield        #13  <Field CSS this$0>
		//    4    6:invokestatic    #25  <Method Document CSS.access$200(CSS)>
		//    5    9:invokevirtual   #30  <Method void Document.addRef()>
			this;
		//    6   12:aload_0         
			JVM INSTR monitorexit ;
		//    7   13:monitorexit     
			return;
		//    8   14:return          
			Exception exception;
			exception;
		//    9   15:astore_1        
		//*  10   16:aload_0         
			throw exception;
		//   11   17:monitorexit     
		//   12   18:aload_1         
		//   13   19:athrow          
		}

		protected void onLastPeerUnregistered()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			mDocument.release();
		//    2    2:aload_0         
		//    3    3:getfield        #13  <Field CSS this$0>
		//    4    6:invokestatic    #25  <Method Document CSS.access$200(CSS)>
		//    5    9:invokevirtual   #34  <Method void Document.release()>
			this;
		//    6   12:aload_0         
			JVM INSTR monitorexit ;
		//    7   13:monitorexit     
			return;
		//    8   14:return          
			Exception exception;
			exception;
		//    9   15:astore_1        
		//*  10   16:aload_0         
			throw exception;
		//   11   17:monitorexit     
		//   12   18:aload_1         
		//   13   19:athrow          
		}

		final CSS this$0;

		private PeerManagerListener()
		{
			this$0 = CSS.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field CSS this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void PeersRegisteredListener()>
		//    5    9:return          
		}

	}

	private static class PseudoIdMatches
	{

		public List matches;
		public int pseudoId;

		public PseudoIdMatches()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			matches = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #21  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #22  <Method void ArrayList()>
		//    6   12:putfield        #24  <Field List matches>
		//    7   15:return          
		}
	}

	private static class RuleMatch
	{

		public List matchingSelectors;
		public CSSRule rule;

		private RuleMatch()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class Selector
	{

		public SourceRange range;
		public String value;

		private Selector()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class SelectorList
	{

		public List selectors;
		public String text;

		private SelectorList()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class ShorthandEntry
	{

		public Boolean imporant;
		public String name;
		public String value;

		private ShorthandEntry()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class SourceRange
	{

		public int endColumn;
		public int endLine;
		public int startColumn;
		public int startLine;

		private SourceRange()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	public CSS(Document document)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void Object()>
		mDocument = (Document)Util.throwIfNull(((Object) (document)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #79  <Method Object Util.throwIfNull(Object)>
	//    5    9:checkcast       #81  <Class Document>
	//    6   12:putfield        #83  <Field Document mDocument>
	//    7   15:aload_0         
	//    8   16:new             #85  <Class ObjectMapper>
	//    9   19:dup             
	//   10   20:invokespecial   #86  <Method void ObjectMapper()>
	//   11   23:putfield        #88  <Field ObjectMapper mObjectMapper>
	//   12   26:aload_0         
	//   13   27:new             #90  <Class ChromePeerManager>
	//   14   30:dup             
	//   15   31:invokespecial   #91  <Method void ChromePeerManager()>
	//   16   34:putfield        #93  <Field ChromePeerManager mPeerManager>
		mPeerManager.setListener(((com.facebook.stetho.inspector.helper.PeerRegistrationListener) (new PeerManagerListener())));
	//   17   37:aload_0         
	//   18   38:getfield        #93  <Field ChromePeerManager mPeerManager>
	//   19   41:new             #43  <Class CSS$PeerManagerListener>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:aconst_null     
	//   23   47:invokespecial   #96  <Method void CSS$PeerManagerListener(CSS, CSS$1)>
	//   24   50:invokevirtual   #100 <Method void ChromePeerManager.setListener(com.facebook.stetho.inspector.helper.PeerRegistrationListener)>
	//   25   53:return          
	}

	public void disable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public void enable(JsonRpcPeer jsonrpcpeer, JSONObject jsonobject)
	{
	//    0    0:return          
	}

	public JsonRpcResult getComputedStyleForNode(final JsonRpcPeer request, final JSONObject result)
	{
		request = ((JsonRpcPeer) ((GetComputedStyleForNodeRequest)mObjectMapper.convertValue(((Object) (result)), com/facebook/stetho/inspector/protocol/module/CSS$GetComputedStyleForNodeRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #28  <Class CSS$GetComputedStyleForNodeRequest>
	//    4    7:invokevirtual   #114 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #28  <Class CSS$GetComputedStyleForNodeRequest>
	//    6   13:astore_1        
		result = ((JSONObject) (new GetComputedStyleForNodeResult()));
	//    7   14:new             #31  <Class CSS$GetComputedStyleForNodeResult>
	//    8   17:dup             
	//    9   18:aconst_null     
	//   10   19:invokespecial   #117 <Method void CSS$GetComputedStyleForNodeResult(CSS$1)>
	//   11   22:astore_2        
		result.computedStyle = ((List) (new ArrayList()));
	//   12   23:aload_2         
	//   13   24:new             #119 <Class ArrayList>
	//   14   27:dup             
	//   15   28:invokespecial   #120 <Method void ArrayList()>
	//   16   31:putfield        #124 <Field List CSS$GetComputedStyleForNodeResult.computedStyle>
		mDocument.postAndWait(new Runnable() {

			public void run()
			{
				Object obj = mDocument.getElementForNodeId(request.nodeId);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CSS this$0>
			//    2    4:invokestatic    #36  <Method Document CSS.access$200(CSS)>
			//    3    7:aload_0         
			//    4    8:getfield        #25  <Field CSS$GetComputedStyleForNodeRequest val$request>
			//    5   11:getfield        #42  <Field int CSS$GetComputedStyleForNodeRequest.nodeId>
			//    6   14:invokevirtual   #48  <Method Object Document.getElementForNodeId(int)>
			//    7   17:astore_1        
				if(obj == null)
			//*   8   18:aload_1         
			//*   9   19:ifnonnull       57
				{
					obj = ((Object) (new StringBuilder()));
			//   10   22:new             #50  <Class StringBuilder>
			//   11   25:dup             
			//   12   26:invokespecial   #51  <Method void StringBuilder()>
			//   13   29:astore_1        
					((StringBuilder) (obj)).append("Tried to get the style of an element that does not exist, using nodeid=");
			//   14   30:aload_1         
			//   15   31:ldc1            #53  <String "Tried to get the style of an element that does not exist, using nodeid=">
			//   16   33:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   17   36:pop             
					((StringBuilder) (obj)).append(request.nodeId);
			//   18   37:aload_1         
			//   19   38:aload_0         
			//   20   39:getfield        #25  <Field CSS$GetComputedStyleForNodeRequest val$request>
			//   21   42:getfield        #42  <Field int CSS$GetComputedStyleForNodeRequest.nodeId>
			//   22   45:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
			//   23   48:pop             
					LogUtil.e(((StringBuilder) (obj)).toString());
			//   24   49:aload_1         
			//   25   50:invokevirtual   #64  <Method String StringBuilder.toString()>
			//   26   53:invokestatic    #70  <Method void LogUtil.e(String)>
					return;
			//   27   56:return          
				} else
				{
					mDocument.getElementStyles(obj, new StyleAccumulator() {

						public void store(String s, String s1, boolean flag)
						{
							if(!flag)
						//*   0    0:iload_3         
						//*   1    1:ifne            44
							{
								CSSComputedStyleProperty csscomputedstyleproperty = new CSSComputedStyleProperty();
						//    2    4:new             #24  <Class CSS$CSSComputedStyleProperty>
						//    3    7:dup             
						//    4    8:aconst_null     
						//    5    9:invokespecial   #26  <Method void CSS$CSSComputedStyleProperty(CSS$1)>
						//    6   12:astore          4
								csscomputedstyleproperty.name = s;
						//    7   14:aload           4
						//    8   16:aload_1         
						//    9   17:putfield        #30  <Field String CSS$CSSComputedStyleProperty.name>
								csscomputedstyleproperty.value = s1;
						//   10   20:aload           4
						//   11   22:aload_2         
						//   12   23:putfield        #33  <Field String CSS$CSSComputedStyleProperty.value>
								result.computedStyle.add(((Object) (csscomputedstyleproperty)));
						//   13   26:aload_0         
						//   14   27:getfield        #17  <Field CSS$1 this$1>
						//   15   30:getfield        #37  <Field CSS$GetComputedStyleForNodeResult CSS$1.val$result>
						//   16   33:getfield        #43  <Field List CSS$GetComputedStyleForNodeResult.computedStyle>
						//   17   36:aload           4
						//   18   38:invokeinterface #49  <Method boolean List.add(Object)>
						//   19   43:pop             
							}
						//   20   44:return          
						}

						final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CSS$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//   28   57:aload_0         
			//   29   58:getfield        #23  <Field CSS this$0>
			//   30   61:invokestatic    #36  <Method Document CSS.access$200(CSS)>
			//   31   64:aload_1         
			//   32   65:new             #13  <Class CSS$1$1>
			//   33   68:dup             
			//   34   69:aload_0         
			//   35   70:invokespecial   #73  <Method void CSS$1$1(CSS$1)>
			//   36   73:invokevirtual   #77  <Method void Document.getElementStyles(Object, StyleAccumulator)>
					return;
			//   37   76:return          
				}
			}

			final CSS this$0;
			final GetComputedStyleForNodeRequest val$request;
			final GetComputedStyleForNodeResult val$result;

			
			{
				this$0 = CSS.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CSS this$0>
				request = getcomputedstylefornoderequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CSS$GetComputedStyleForNodeRequest val$request>
				result = getcomputedstylefornoderesult;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field CSS$GetComputedStyleForNodeResult val$result>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   17   34:aload_0         
	//   18   35:getfield        #83  <Field Document mDocument>
	//   19   38:new             #8   <Class CSS$1>
	//   20   41:dup             
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:aload_2         
	//   24   45:invokespecial   #127 <Method void CSS$1(CSS, CSS$GetComputedStyleForNodeRequest, CSS$GetComputedStyleForNodeResult)>
	//   25   48:invokevirtual   #131 <Method void Document.postAndWait(Runnable)>
		return ((JsonRpcResult) (result));
	//   26   51:aload_2         
	//   27   52:areturn         
	}

	public JsonRpcResult getMatchedStylesForNode(final JsonRpcPeer request, JSONObject jsonobject)
	{
		request = ((JsonRpcPeer) ((GetMatchedStylesForNodeRequest)mObjectMapper.convertValue(((Object) (jsonobject)), com/facebook/stetho/inspector/protocol/module/CSS$GetMatchedStylesForNodeRequest)));
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ObjectMapper mObjectMapper>
	//    2    4:aload_2         
	//    3    5:ldc1            #34  <Class CSS$GetMatchedStylesForNodeRequest>
	//    4    7:invokevirtual   #114 <Method Object ObjectMapper.convertValue(Object, Class)>
	//    5   10:checkcast       #34  <Class CSS$GetMatchedStylesForNodeRequest>
	//    6   13:astore_1        
		jsonobject = ((JSONObject) (new GetMatchedStylesForNodeResult()));
	//    7   14:new             #37  <Class CSS$GetMatchedStylesForNodeResult>
	//    8   17:dup             
	//    9   18:aconst_null     
	//   10   19:invokespecial   #133 <Method void CSS$GetMatchedStylesForNodeResult(CSS$1)>
	//   11   22:astore_2        
		final RuleMatch match = new RuleMatch();
	//   12   23:new             #49  <Class CSS$RuleMatch>
	//   13   26:dup             
	//   14   27:aconst_null     
	//   15   28:invokespecial   #134 <Method void CSS$RuleMatch(CSS$1)>
	//   16   31:astore_3        
		jsonobject.matchedCSSRules = ListUtil.newImmutableList(((Object) (match)));
	//   17   32:aload_2         
	//   18   33:aload_3         
	//   19   34:invokestatic    #140 <Method List ListUtil.newImmutableList(Object)>
	//   20   37:putfield        #143 <Field List CSS$GetMatchedStylesForNodeResult.matchedCSSRules>
		match.matchingSelectors = ListUtil.newImmutableList(((Object) (Integer.valueOf(0))));
	//   21   40:aload_3         
	//   22   41:iconst_0        
	//   23   42:invokestatic    #149 <Method Integer Integer.valueOf(int)>
	//   24   45:invokestatic    #140 <Method List ListUtil.newImmutableList(Object)>
	//   25   48:putfield        #152 <Field List CSS$RuleMatch.matchingSelectors>
		Selector selector = new Selector();
	//   26   51:new             #52  <Class CSS$Selector>
	//   27   54:dup             
	//   28   55:aconst_null     
	//   29   56:invokespecial   #153 <Method void CSS$Selector(CSS$1)>
	//   30   59:astore          4
		selector.value = "<this_element>";
	//   31   61:aload           4
	//   32   63:ldc1            #155 <String "<this_element>">
	//   33   65:putfield        #159 <Field String CSS$Selector.value>
		CSSRule cssrule = new CSSRule();
	//   34   68:new             #22  <Class CSS$CSSRule>
	//   35   71:dup             
	//   36   72:aconst_null     
	//   37   73:invokespecial   #160 <Method void CSS$CSSRule(CSS$1)>
	//   38   76:astore          5
		cssrule.origin = Origin.REGULAR;
	//   39   78:aload           5
	//   40   80:getstatic       #166 <Field Origin Origin.REGULAR>
	//   41   83:putfield        #169 <Field Origin CSS$CSSRule.origin>
		cssrule.selectorList = new SelectorList();
	//   42   86:aload           5
	//   43   88:new             #55  <Class CSS$SelectorList>
	//   44   91:dup             
	//   45   92:aconst_null     
	//   46   93:invokespecial   #170 <Method void CSS$SelectorList(CSS$1)>
	//   47   96:putfield        #174 <Field CSS$SelectorList CSS$CSSRule.selectorList>
		cssrule.selectorList.selectors = ListUtil.newImmutableList(((Object) (selector)));
	//   48   99:aload           5
	//   49  101:getfield        #174 <Field CSS$SelectorList CSS$CSSRule.selectorList>
	//   50  104:aload           4
	//   51  106:invokestatic    #140 <Method List ListUtil.newImmutableList(Object)>
	//   52  109:putfield        #177 <Field List CSS$SelectorList.selectors>
		cssrule.style = new CSSStyle();
	//   53  112:aload           5
	//   54  114:new             #25  <Class CSS$CSSStyle>
	//   55  117:dup             
	//   56  118:aconst_null     
	//   57  119:invokespecial   #178 <Method void CSS$CSSStyle(CSS$1)>
	//   58  122:putfield        #182 <Field CSS$CSSStyle CSS$CSSRule.style>
		cssrule.style.cssProperties = ((List) (new ArrayList()));
	//   59  125:aload           5
	//   60  127:getfield        #182 <Field CSS$CSSStyle CSS$CSSRule.style>
	//   61  130:new             #119 <Class ArrayList>
	//   62  133:dup             
	//   63  134:invokespecial   #120 <Method void ArrayList()>
	//   64  137:putfield        #185 <Field List CSS$CSSStyle.cssProperties>
		match.rule = cssrule;
	//   65  140:aload_3         
	//   66  141:aload           5
	//   67  143:putfield        #189 <Field CSS$CSSRule CSS$RuleMatch.rule>
		cssrule.style.shorthandEntries = Collections.emptyList();
	//   68  146:aload           5
	//   69  148:getfield        #182 <Field CSS$CSSStyle CSS$CSSRule.style>
	//   70  151:invokestatic    #195 <Method List Collections.emptyList()>
	//   71  154:putfield        #198 <Field List CSS$CSSStyle.shorthandEntries>
		mDocument.postAndWait(new Runnable() {

			public void run()
			{
				Object obj = mDocument.getElementForNodeId(request.nodeId);
			//    0    0:aload_0         
			//    1    1:getfield        #23  <Field CSS this$0>
			//    2    4:invokestatic    #36  <Method Document CSS.access$200(CSS)>
			//    3    7:aload_0         
			//    4    8:getfield        #25  <Field CSS$GetMatchedStylesForNodeRequest val$request>
			//    5   11:getfield        #42  <Field int CSS$GetMatchedStylesForNodeRequest.nodeId>
			//    6   14:invokevirtual   #48  <Method Object Document.getElementForNodeId(int)>
			//    7   17:astore_1        
				if(obj == null)
			//*   8   18:aload_1         
			//*   9   19:ifnonnull       57
				{
					obj = ((Object) (new StringBuilder()));
			//   10   22:new             #50  <Class StringBuilder>
			//   11   25:dup             
			//   12   26:invokespecial   #51  <Method void StringBuilder()>
			//   13   29:astore_1        
					((StringBuilder) (obj)).append("Failed to get style of an element that does not exist, nodeid=");
			//   14   30:aload_1         
			//   15   31:ldc1            #53  <String "Failed to get style of an element that does not exist, nodeid=">
			//   16   33:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
			//   17   36:pop             
					((StringBuilder) (obj)).append(request.nodeId);
			//   18   37:aload_1         
			//   19   38:aload_0         
			//   20   39:getfield        #25  <Field CSS$GetMatchedStylesForNodeRequest val$request>
			//   21   42:getfield        #42  <Field int CSS$GetMatchedStylesForNodeRequest.nodeId>
			//   22   45:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
			//   23   48:pop             
					LogUtil.w(((StringBuilder) (obj)).toString());
			//   24   49:aload_1         
			//   25   50:invokevirtual   #64  <Method String StringBuilder.toString()>
			//   26   53:invokestatic    #70  <Method void LogUtil.w(String)>
					return;
			//   27   56:return          
				} else
				{
					mDocument.getElementStyles(obj, new StyleAccumulator() {

						public void store(String s, String s1, boolean flag)
						{
							if(!flag)
						//*   0    0:iload_3         
						//*   1    1:ifne            50
							{
								CSSProperty cssproperty = new CSSProperty();
						//    2    4:new             #24  <Class CSS$CSSProperty>
						//    3    7:dup             
						//    4    8:aconst_null     
						//    5    9:invokespecial   #27  <Method void CSS$CSSProperty(CSS$1)>
						//    6   12:astore          4
								cssproperty.name = s;
						//    7   14:aload           4
						//    8   16:aload_1         
						//    9   17:putfield        #31  <Field String CSS$CSSProperty.name>
								cssproperty.value = s1;
						//   10   20:aload           4
						//   11   22:aload_2         
						//   12   23:putfield        #34  <Field String CSS$CSSProperty.value>
								match.rule.style.cssProperties.add(((Object) (cssproperty)));
						//   13   26:aload_0         
						//   14   27:getfield        #17  <Field CSS$2 this$1>
						//   15   30:getfield        #38  <Field CSS$RuleMatch CSS$2.val$match>
						//   16   33:getfield        #44  <Field CSS$CSSRule CSS$RuleMatch.rule>
						//   17   36:getfield        #50  <Field CSS$CSSStyle CSS$CSSRule.style>
						//   18   39:getfield        #56  <Field List CSS$CSSStyle.cssProperties>
						//   19   42:aload           4
						//   20   44:invokeinterface #62  <Method boolean List.add(Object)>
						//   21   49:pop             
							}
						//   22   50:return          
						}

						final _cls2 this$1;

			
			{
				this$1 = _cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CSS$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//   28   57:aload_0         
			//   29   58:getfield        #23  <Field CSS this$0>
			//   30   61:invokestatic    #36  <Method Document CSS.access$200(CSS)>
			//   31   64:aload_1         
			//   32   65:new             #13  <Class CSS$2$1>
			//   33   68:dup             
			//   34   69:aload_0         
			//   35   70:invokespecial   #73  <Method void CSS$2$1(CSS$2)>
			//   36   73:invokevirtual   #77  <Method void Document.getElementStyles(Object, StyleAccumulator)>
					return;
			//   37   76:return          
				}
			}

			final CSS this$0;
			final RuleMatch val$match;
			final GetMatchedStylesForNodeRequest val$request;

			
			{
				this$0 = CSS.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field CSS this$0>
				request = getmatchedstylesfornoderequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field CSS$GetMatchedStylesForNodeRequest val$request>
				match = rulematch;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field CSS$RuleMatch val$match>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #30  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   72  157:aload_0         
	//   73  158:getfield        #83  <Field Document mDocument>
	//   74  161:new             #12  <Class CSS$2>
	//   75  164:dup             
	//   76  165:aload_0         
	//   77  166:aload_1         
	//   78  167:aload_3         
	//   79  168:invokespecial   #201 <Method void CSS$2(CSS, CSS$GetMatchedStylesForNodeRequest, CSS$RuleMatch)>
	//   80  171:invokevirtual   #131 <Method void Document.postAndWait(Runnable)>
		jsonobject.inherited = Collections.emptyList();
	//   81  174:aload_2         
	//   82  175:invokestatic    #195 <Method List Collections.emptyList()>
	//   83  178:putfield        #204 <Field List CSS$GetMatchedStylesForNodeResult.inherited>
		jsonobject.pseudoElements = Collections.emptyList();
	//   84  181:aload_2         
	//   85  182:invokestatic    #195 <Method List Collections.emptyList()>
	//   86  185:putfield        #207 <Field List CSS$GetMatchedStylesForNodeResult.pseudoElements>
		return ((JsonRpcResult) (jsonobject));
	//   87  188:aload_2         
	//   88  189:areturn         
	}

	private final Document mDocument;
	private final ObjectMapper mObjectMapper = new ObjectMapper();
	private final ChromePeerManager mPeerManager = new ChromePeerManager();


/*
	static Document access$200(CSS css)
	{
		return css.mDocument;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Document mDocument>
	//    2    4:areturn         
	}

*/
}
