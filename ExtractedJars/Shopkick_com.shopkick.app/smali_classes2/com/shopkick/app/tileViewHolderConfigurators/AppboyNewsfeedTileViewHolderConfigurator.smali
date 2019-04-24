.class public Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "AppboyNewsfeedTileViewHolderConfigurator.java"


# static fields
.field public static final PARAM_NEWS_FEED_CARD_OBJECT:Ljava/lang/String; = "paramNewsFeedCardObject"


# instance fields
.field private final EXPIRED_ALPHA:F

.field private final IMAGE_CORNER_RADIUS_DP:I

.field private final IMAGE_DIMENSION_DP:I

.field private final NORMAL_ALPHA:F

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    const/16 v0, 0x48

    .line 23
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->IMAGE_DIMENSION_DP:I

    const/16 v0, 0x8

    .line 24
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->IMAGE_CORNER_RADIUS_DP:I

    const v0, 0x3f19999a    # 0.6f

    .line 25
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->EXPIRED_ALPHA:F

    const/high16 v0, 0x3f800000    # 1.0f

    .line 26
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->NORMAL_ALPHA:F

    .line 31
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method public static synthetic lambda$onBindViewHolder$246(Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;Lcom/appboy/models/cards/ShortNewsCard;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 96
    invoke-virtual {p1}, Lcom/appboy/models/cards/ShortNewsCard;->logClick()Z

    .line 97
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method


# virtual methods
.method public cancelImageLoadingForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V
    .locals 1

    const v0, 0x7f09045d

    .line 126
    invoke-virtual {p0, p1, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->cancelImageLoadingForImageView(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;I)V

    return-void
.end method

.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0025

    return v0
.end method

.method public loadImagesForViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Z)V
    .locals 3

    if-eqz p2, :cond_2

    .line 109
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "paramNewsFeedCardObject"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual {p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object p2

    const-string v0, "paramNewsFeedCardObject"

    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/appboy/models/cards/ShortNewsCard;

    invoke-virtual {p2}, Lcom/appboy/models/cards/ShortNewsCard;->getImageUrl()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    :cond_1
    const v0, 0x7f09045d

    .line 118
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x48

    .line 119
    invoke-static {v1, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v1

    const/16 v2, 0x8

    .line 120
    invoke-static {v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v2

    .line 121
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-static {p1}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/view/View;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/shopkick/app/util/GlideRequest;->onlyRetrieveFromCache(Z)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/GlideRequest;->override(I)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    const/4 p2, 0x2

    new-array p2, p2, [Lcom/bumptech/glide/load/Transformation;

    const/4 p3, 0x0

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/FitCenter;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/FitCenter;-><init>()V

    aput-object v1, p2, p3

    const/4 p3, 0x1

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-direct {v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    aput-object v1, p2, p3

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/GlideRequest;->transforms([Lcom/bumptech/glide/load/Transformation;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void

    :cond_2
    :goto_0
    return-void
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 17

    move-object/from16 v0, p1

    .line 40
    invoke-virtual/range {p0 .. p1}, Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 42
    invoke-virtual/range {p2 .. p2}, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->clientData()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "paramNewsFeedCardObject"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appboy/models/cards/ShortNewsCard;

    if-nez v1, :cond_0

    return-void

    .line 45
    :cond_0
    invoke-virtual {v1}, Lcom/appboy/models/cards/ShortNewsCard;->getDescription()Ljava/lang/String;

    move-result-object v2

    .line 46
    invoke-virtual {v1}, Lcom/appboy/models/cards/ShortNewsCard;->getExpiresAt()J

    move-result-wide v3

    .line 47
    invoke-virtual {v1}, Lcom/appboy/models/cards/ShortNewsCard;->isExpired()Z

    move-result v5

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_1

    cmp-long v5, v3, v6

    if-lez v5, :cond_1

    move v5, v8

    goto :goto_0

    :cond_1
    move v5, v9

    .line 48
    :goto_0
    invoke-virtual {v1}, Lcom/appboy/models/cards/ShortNewsCard;->isRead()Z

    move-result v10

    if-nez v10, :cond_3

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    move v10, v9

    goto :goto_2

    :cond_3
    :goto_1
    move v10, v8

    :goto_2
    const v11, 0x7f09045d

    .line 50
    invoke-virtual {v0, v11}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getImageView(I)Landroid/widget/ImageView;

    move-result-object v11

    const v12, 0x7f0901e6

    .line 51
    invoke-virtual {v0, v12}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v12

    check-cast v12, Lcom/shopkick/app/widget/SKTextView;

    .line 52
    invoke-virtual {v12, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    const v2, 0x7f0901c9

    .line 55
    invoke-virtual {v0, v2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    cmp-long v6, v3, v6

    if-lez v6, :cond_4

    .line 57
    iget-object v6, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const v7, 0x7f11003a

    new-array v13, v8, [Ljava/lang/Object;

    const-string v14, "M/d/yy"

    const-wide/16 v15, 0x3e8

    mul-long/2addr v3, v15

    .line 58
    invoke-static {v14, v3, v4}, Lcom/shopkick/app/util/DateUtils;->timestampToString(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v13, v9

    .line 57
    invoke-virtual {v6, v7, v13}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 60
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    if-eqz v5, :cond_5

    const v3, 0x3f19999a    # 0.6f

    .line 65
    invoke-virtual {v11, v3}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 66
    invoke-virtual {v12, v3}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 67
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setAlpha(F)V

    goto :goto_3

    :cond_5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 69
    invoke-virtual {v11, v3}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 70
    invoke-virtual {v12, v3}, Lcom/shopkick/app/widget/SKTextView;->setAlpha(F)V

    .line 71
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setAlpha(F)V

    :goto_3
    if-eqz v10, :cond_6

    const/4 v2, 0x6

    .line 76
    invoke-virtual {v12, v2}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 77
    iget-object v2, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iget-object v3, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f06015d

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_4

    :cond_6
    const/16 v2, 0x8

    .line 79
    invoke-virtual {v12, v2}, Lcom/shopkick/app/widget/SKTextView;->setDefaultFont(I)Z

    .line 80
    iget-object v2, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iget-object v3, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f06001b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 84
    :goto_4
    invoke-virtual {v1}, Lcom/appboy/models/cards/ShortNewsCard;->getUrl()Ljava/lang/String;

    move-result-object v2

    if-nez v5, :cond_8

    .line 87
    invoke-static {v2}, Lcom/shopkick/app/url/URLDispatcher;->convertDeepLinkToSkUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    move v3, v8

    goto :goto_5

    :cond_7
    move v3, v9

    goto :goto_5

    :cond_8
    move v3, v9

    :goto_5
    if-eqz v3, :cond_9

    .line 94
    iget-object v3, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v3, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 95
    iget-object v0, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v3, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;

    move-object/from16 v4, p0

    invoke-direct {v3, v4, v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/-$$Lambda$AppboyNewsfeedTileViewHolderConfigurator$Ug5HlbPSOlX6O13hJLSmW2UAFWU;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/AppboyNewsfeedTileViewHolderConfigurator;Lcom/appboy/models/cards/ShortNewsCard;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_6

    :cond_9
    move-object/from16 v4, p0

    .line 102
    iget-object v1, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 103
    iget-object v0, v0, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_6
    return-void
.end method
