// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.contentcards.handlers;

import android.content.Context;
import android.view.ViewGroup;
import com.appboy.enums.CardType;
import com.appboy.models.cards.Card;
import com.appboy.ui.contentcards.view.*;
import java.util.*;

// Referenced classes of package com.appboy.ui.contentcards.handlers:
//			IContentCardsViewBindingHandler

public class DefaultContentCardsViewBindingHandler
	implements IContentCardsViewBindingHandler
{

	public DefaultContentCardsViewBindingHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field Map mContentCardViewCache>
	//    7   15:return          
	}

	BaseContentCardView getContentCardsViewFromCache(Context context, CardType cardtype)
	{
		if(!mContentCardViewCache.containsKey(((Object) (cardtype))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field Map mContentCardViewCache>
	//*   2    4:aload_2         
	//*   3    5:invokeinterface #30  <Method boolean Map.containsKey(Object)>
	//*   4   10:ifne            121
		{
			static class _cls1
			{

				static final int $SwitchMap$com$appboy$enums$CardType[];

				static 
				{
					$SwitchMap$com$appboy$enums$CardType = new int[CardType.values().length];
				//    0    0:invokestatic    #18  <Method CardType[] CardType.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$CardType>
					try
					{
						$SwitchMap$com$appboy$enums$CardType[CardType.BANNER.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$CardType>
				//    5   12:getstatic       #24  <Field CardType CardType.BANNER>
				//    6   15:invokevirtual   #28  <Method int CardType.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$CardType>
				//*  10   23:getstatic       #31  <Field CardType CardType.CAPTIONED_IMAGE>
				//*  11   26:invokevirtual   #28  <Method int CardType.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$CardType>
				//*  15   34:getstatic       #34  <Field CardType CardType.SHORT_NEWS>
				//*  16   37:invokevirtual   #28  <Method int CardType.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$appboy$enums$CardType>
				//*  20   45:getstatic       #37  <Field CardType CardType.TEXT_ANNOUNCEMENT>
				//*  21   48:invokevirtual   #28  <Method int CardType.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   25   54:astore_0        
					try
					{
						$SwitchMap$com$appboy$enums$CardType[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
					}
				//*  26   55:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   27   58:astore_0        
					try
					{
						$SwitchMap$com$appboy$enums$CardType[CardType.SHORT_NEWS.ordinal()] = 3;
					}
				//*  28   59:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   29   62:astore_0        
					try
					{
						$SwitchMap$com$appboy$enums$CardType[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
					}
				//*  30   63:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   31   66:astore_0        
				//*  32   67:return          
				}
			}

			switch(_cls1..SwitchMap.com.appboy.enums.CardType[cardtype.ordinal()])
	//*   5   13:getstatic       #34  <Field int[] DefaultContentCardsViewBindingHandler$1.$SwitchMap$com$appboy$enums$CardType>
	//*   6   16:aload_2         
	//*   7   17:invokevirtual   #40  <Method int CardType.ordinal()>
	//*   8   20:iaload          
			{
	//*   9   21:tableswitch     1 4: default 52
	//	               1 100
	//	               2 88
	//	               3 76
	//	               4 64
			default:
				context = ((Context) (new DefaultContentCardView(context)));
	//   10   52:new             #42  <Class DefaultContentCardView>
	//   11   55:dup             
	//   12   56:aload_1         
	//   13   57:invokespecial   #45  <Method void DefaultContentCardView(Context)>
	//   14   60:astore_1        
				break;

	//*  15   61:goto            109
			case 4: // '\004'
				context = ((Context) (new TextAnnouncementContentCardView(context)));
	//   16   64:new             #47  <Class TextAnnouncementContentCardView>
	//   17   67:dup             
	//   18   68:aload_1         
	//   19   69:invokespecial   #48  <Method void TextAnnouncementContentCardView(Context)>
	//   20   72:astore_1        
				break;

	//*  21   73:goto            109
			case 3: // '\003'
				context = ((Context) (new ShortNewsContentCardView(context)));
	//   22   76:new             #50  <Class ShortNewsContentCardView>
	//   23   79:dup             
	//   24   80:aload_1         
	//   25   81:invokespecial   #51  <Method void ShortNewsContentCardView(Context)>
	//   26   84:astore_1        
				break;

	//*  27   85:goto            109
			case 2: // '\002'
				context = ((Context) (new CaptionedImageContentCardView(context)));
	//   28   88:new             #53  <Class CaptionedImageContentCardView>
	//   29   91:dup             
	//   30   92:aload_1         
	//   31   93:invokespecial   #54  <Method void CaptionedImageContentCardView(Context)>
	//   32   96:astore_1        
				break;

	//*  33   97:goto            109
			case 1: // '\001'
				context = ((Context) (new BannerImageContentCardView(context)));
	//   34  100:new             #56  <Class BannerImageContentCardView>
	//   35  103:dup             
	//   36  104:aload_1         
	//   37  105:invokespecial   #57  <Method void BannerImageContentCardView(Context)>
	//   38  108:astore_1        
				break;
			}
			mContentCardViewCache.put(((Object) (cardtype)), ((Object) (context)));
	//   39  109:aload_0         
	//   40  110:getfield        #20  <Field Map mContentCardViewCache>
	//   41  113:aload_2         
	//   42  114:aload_1         
	//   43  115:invokeinterface #61  <Method Object Map.put(Object, Object)>
	//   44  120:pop             
		}
		return (BaseContentCardView)mContentCardViewCache.get(((Object) (cardtype)));
	//   45  121:aload_0         
	//   46  122:getfield        #20  <Field Map mContentCardViewCache>
	//   47  125:aload_2         
	//   48  126:invokeinterface #65  <Method Object Map.get(Object)>
	//   49  131:checkcast       #67  <Class BaseContentCardView>
	//   50  134:areturn         
	}

	public int getItemViewType(Context context, List list, int i)
	{
		return ((Card)list.get(i)).getCardType().getValue();
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #75  <Method Object List.get(int)>
	//    3    7:checkcast       #77  <Class Card>
	//    4   10:invokevirtual   #81  <Method CardType Card.getCardType()>
	//    5   13:invokevirtual   #84  <Method int CardType.getValue()>
	//    6   16:ireturn         
	}

	public void onBindViewHolder(Context context, List list, ContentCardViewHolder contentcardviewholder, int i)
	{
		list = ((List) ((Card)list.get(i)));
	//    0    0:aload_2         
	//    1    1:iload           4
	//    2    3:invokeinterface #75  <Method Object List.get(int)>
	//    3    8:checkcast       #77  <Class Card>
	//    4   11:astore_2        
		getContentCardsViewFromCache(context, ((Card) (list)).getCardType()).bindViewHolder(contentcardviewholder, ((Card) (list)));
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #81  <Method CardType Card.getCardType()>
	//    9   18:invokevirtual   #90  <Method BaseContentCardView getContentCardsViewFromCache(Context, CardType)>
	//   10   21:aload_3         
	//   11   22:aload_2         
	//   12   23:invokevirtual   #94  <Method void BaseContentCardView.bindViewHolder(ContentCardViewHolder, Card)>
	//   13   26:return          
	}

	public ContentCardViewHolder onCreateViewHolder(Context context, List list, ViewGroup viewgroup, int i)
	{
		return getContentCardsViewFromCache(context, CardType.fromValue(i)).createViewHolder(viewgroup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload           4
	//    3    4:invokestatic    #101 <Method CardType CardType.fromValue(int)>
	//    4    7:invokevirtual   #90  <Method BaseContentCardView getContentCardsViewFromCache(Context, CardType)>
	//    5   10:aload_3         
	//    6   11:invokevirtual   #105 <Method ContentCardViewHolder BaseContentCardView.createViewHolder(ViewGroup)>
	//    7   14:areturn         
	}

	private final Map mContentCardViewCache = new HashMap();
}
