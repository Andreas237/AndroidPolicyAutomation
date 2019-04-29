.class public Lcom/rt/mobile/english/ui/ArticlesAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "ArticlesAdapter.java"

# interfaces
.implements Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;,
        Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Landroid/support/v7/widget/RecyclerView$ViewHolder;",
        ">;",
        "Lcom/rt/mobile/english/ui/RateAppViewHolder$Listener;"
    }
.end annotation


# instance fields
.field private AD_TYPE:I

.field private ARTICLE_TYPE:I

.field private BN_TYPE:I

.field private final activity:Landroid/app/Activity;

.field appEventCounter:Lcom/rt/mobile/english/data/AppEventCounter;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private bn:Ljava/lang/Boolean;

.field private breakingNews:Lcom/rt/mobile/english/data/Message;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/articles/Breaking;",
            ">;"
        }
    .end annotation
.end field

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;"
        }
    .end annotation
.end field

.field private final listener:Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

.field picasso:Lcom/squareup/picasso/Picasso;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private position:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/util/List;Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/rt/mobile/english/data/Message;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;",
            "Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            "Lcom/rt/mobile/english/data/Message<",
            "Lcom/rt/mobile/english/data/articles/Breaking;",
            ">;)V"
        }
    .end annotation

    .line 73
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    const/4 v0, 0x0

    .line 61
    iput v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->ARTICLE_TYPE:I

    const/16 v1, 0x38f

    .line 62
    iput v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->BN_TYPE:I

    const/16 v1, 0x70

    .line 63
    iput v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->AD_TYPE:I

    .line 68
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->bn:Ljava/lang/Boolean;

    .line 74
    iput-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    .line 75
    iput-object p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    .line 76
    iput-object p3, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->listener:Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    .line 77
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->position:I

    .line 78
    iput-object p5, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->bn:Ljava/lang/Boolean;

    .line 79
    iput-object p6, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->breakingNews:Lcom/rt/mobile/english/data/Message;

    .line 81
    invoke-static {p1}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Ljava/lang/Boolean;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->bn:Ljava/lang/Boolean;

    return-object p0
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Landroid/app/Activity;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$200(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Lcom/rt/mobile/english/data/Message;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->breakingNews:Lcom/rt/mobile/english/data/Message;

    return-object p0
.end method

.method static synthetic access$300(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->listener:Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    return-object p0
.end method

.method static synthetic access$400(Lcom/rt/mobile/english/ui/ArticlesAdapter;)Ljava/util/List;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public getItemCount()I
    .locals 3

    .line 238
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    const v2, 0x7f10011d

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 239
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->bn:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->position:I

    if-nez v0, :cond_0

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 240
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    return v0

    .line 242
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 245
    :cond_1
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 3

    const v0, 0x7f10011d

    if-nez p1, :cond_0

    .line 86
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->bn:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->position:I

    if-nez v1, :cond_0

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 87
    iget p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->BN_TYPE:I

    return p1

    :cond_0
    const/4 v1, 0x5

    if-ne p1, v1, :cond_1

    .line 90
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p1

    invoke-virtual {p1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 91
    iget p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->AD_TYPE:I

    return p1

    .line 93
    :cond_1
    iget p1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->ARTICLE_TYPE:I

    return p1
.end method

.method public onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 5

    const v0, 0x7f10011d

    if-nez p2, :cond_0

    .line 149
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->bn:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->position:I

    if-nez v1, :cond_0

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 150
    check-cast p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    .line 151
    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->textView:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->breakingNews:Lcom/rt/mobile/english/data/Message;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/Message;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/articles/Breaking;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Breaking;->getTitle()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const/4 v1, 0x5

    if-ne p2, v1, :cond_1

    .line 155
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v3, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    return-void

    .line 159
    :cond_1
    check-cast p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    .line 161
    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->bn:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    iget v2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->position:I

    if-nez v2, :cond_3

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v2

    invoke-virtual {v2}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v3, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    if-lt p2, v1, :cond_2

    .line 162
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 163
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    add-int/lit8 p2, p2, -0x2

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/articles/Article;

    goto :goto_0

    .line 165
    :cond_2
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    add-int/lit8 p2, p2, -0x1

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/articles/Article;

    goto :goto_0

    :cond_3
    if-lt p2, v1, :cond_4

    .line 168
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 169
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    add-int/lit8 p2, p2, -0x1

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/articles/Article;

    goto :goto_0

    .line 171
    :cond_4
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->items:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/articles/Article;

    .line 176
    :goto_0
    iget-object v1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    iget v1, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->position:I

    const/4 v2, 0x0

    if-nez v1, :cond_5

    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object v1

    sget-object v3, Lcom/rt/mobile/english/Utils$EditionEnum;->EN:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne v1, v3, :cond_5

    .line 180
    iget-object v1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->pipeView:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 181
    iget-object v1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->titleView:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 182
    iget-object v1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->titleView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getSectionTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 194
    :cond_5
    iget-object v1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->summaryView:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 199
    iget-object v1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->timeView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getTime()Lorg/joda/time/DateTime;

    move-result-object v4

    invoke-static {v4}, Lcom/rt/mobile/english/Utils;->getStringTime(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getImage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    .line 202
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v4, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 203
    iget-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->summaryView:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 205
    :cond_6
    iget-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->pictureFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 207
    invoke-static {}, Lcom/rt/mobile/english/Utils;->imageLoader()Lcom/nostra13/universalimageloader/core/ImageLoader;

    move-result-object v0

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getImage()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, v4}, Lcom/nostra13/universalimageloader/core/ImageLoader;->displayImage(Ljava/lang/String;Landroid/widget/ImageView;)V

    goto :goto_1

    .line 222
    :cond_7
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {v4, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 223
    iget-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->summaryView:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 225
    :cond_8
    iget-object v0, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->pictureFrame:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 229
    :goto_1
    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v0, ""

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article$Video;->getUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    .line 230
    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->PlayIcon:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 232
    :cond_9
    iget-object p1, p1, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;->PlayIcon:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 3

    .line 102
    iget v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->AD_TYPE:I

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    .line 104
    new-instance p1, Lcom/google/android/gms/ads/AdView;

    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-direct {p1, p2}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    .line 105
    sget-object p2, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    const-string p2, "ca-app-pub-4864726558025864/8071401032"

    .line 108
    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AdView;->setAdUnitId(Ljava/lang/String;)V

    .line 110
    iget-object p2, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    invoke-virtual {p2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    .line 111
    sget-object v0, Lcom/google/android/gms/ads/AdSize;->BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdSize;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    const/high16 p2, 0x42c80000    # 100.0f

    add-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p2

    .line 112
    new-instance v0, Landroid/widget/AbsListView$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v0, v2, p2}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 113
    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/AdView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    new-instance p2, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {p2}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    const-string v0, "0CA9F4116DEA440EA8FFB33F49B10B4A"

    invoke-virtual {p2, v0}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object p2

    .line 118
    invoke-virtual {p1, p2}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    const/16 p2, 0x32

    .line 122
    invoke-virtual {p1, v1, p2, v1, p2}, Lcom/google/android/gms/ads/AdView;->setPadding(IIII)V

    .line 124
    new-instance p2, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;-><init>(Lcom/rt/mobile/english/ui/ArticlesAdapter;Landroid/view/View;)V

    return-object p2

    .line 128
    :cond_0
    iget v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->BN_TYPE:I

    if-ne p2, v0, :cond_1

    .line 129
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c002e

    .line 130
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    .line 132
    :cond_1
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->activity:Landroid/app/Activity;

    const v2, 0x7f10011d

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 133
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c002a

    .line 134
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    .line 136
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c002d

    .line 137
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 143
    :goto_0
    new-instance p2, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/ArticlesAdapter$ArticleViewHolder;-><init>(Lcom/rt/mobile/english/ui/ArticlesAdapter;Landroid/view/View;)V

    return-object p2
.end method

.method public onRateAppFinished()V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->listener:Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ArticlesAdapter;->listener:Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/ArticlesAdapter$Listener;->onRateAppFinished()V

    :cond_0
    return-void
.end method
