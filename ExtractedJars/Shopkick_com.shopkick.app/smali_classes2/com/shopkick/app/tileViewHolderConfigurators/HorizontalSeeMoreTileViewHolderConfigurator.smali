.class public Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSeeMoreTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "HorizontalSeeMoreTileViewHolderConfigurator.java"


# instance fields
.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSeeMoreTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00e4

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 9

    const v0, 0x7f09076e

    .line 31
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f090709

    .line 32
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v2

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    .line 35
    invoke-static {v2}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 36
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->subtitle:Ljava/lang/String;

    .line 37
    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 40
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x3b

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 41
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWidgetType(Ljava/lang/Integer;)V

    .line 42
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 44
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 45
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSeeMoreTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 46
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 47
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 48
    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 50
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v3, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 51
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSeeMoreTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v3, v0, v4, v2}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 54
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSeeMoreTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/HorizontalSeeMoreTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v5, p2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    const/4 v6, 0x0

    .line 58
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
