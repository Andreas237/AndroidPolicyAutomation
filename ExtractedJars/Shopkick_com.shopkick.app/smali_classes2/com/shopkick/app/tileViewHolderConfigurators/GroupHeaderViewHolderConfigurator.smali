.class public Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;
.source "GroupHeaderViewHolderConfigurator.java"


# instance fields
.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method

.method private setupHeaderRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 13

    const v0, 0x7f090657

    .line 68
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 69
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v1, Lcom/shopkick/app/widget/UserEventFrameLayout;

    .line 70
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v3

    :goto_1
    const/16 v5, 0x8

    if-eqz v2, :cond_2

    .line 72
    invoke-virtual {v0, v5}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const/4 v0, 0x0

    .line 73
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    invoke-virtual {v1, v4}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setClickable(Z)V

    goto :goto_2

    .line 76
    :cond_2
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 77
    invoke-virtual {v0, v4}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const/4 v2, 0x0

    .line 80
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setWidthToTextWidth(F)V

    .line 83
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v8, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v9, v2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    const/4 v10, 0x0

    const/16 v2, 0x6e

    .line 87
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x0

    move-object v6, v0

    invoke-direct/range {v6 .. v12}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 89
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    invoke-virtual {v1, v3}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setClickable(Z)V

    :goto_2
    const v0, 0x7f090654

    .line 94
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 95
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v1, :cond_3

    .line 96
    new-instance v1, Landroid/text/SpannableStringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 97
    invoke-static {v5}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 98
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v5, 0x7f0f0010

    iget-object v6, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual {p1, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 100
    new-instance p1, Landroid/text/style/StyleSpan;

    invoke-direct {p1, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-static {p2}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    invoke-virtual {v1, p1, v4, p2, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 102
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_3

    .line 105
    :cond_3
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_3
    return-void
.end method


# virtual methods
.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 35
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 37
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->verticalPadding:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    iget-object v3, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->verticalPadding:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v3

    float-to-int v2, v2

    .line 38
    invoke-virtual {v0, v1, v2, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    .line 43
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 47
    :goto_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x6e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 48
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->locationId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setLocationId(Ljava/lang/String;)V

    .line 49
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumKicks(Ljava/lang/Integer;)V

    .line 50
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 51
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    .line 52
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-static {v1}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWidgetType(Ljava/lang/Integer;)V

    .line 55
    :cond_1
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 56
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 57
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 58
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 60
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v2, Lcom/shopkick/app/widget/UserEventFrameLayout;

    .line 61
    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0, v3, v1}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 63
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderViewHolderConfigurator;->setupHeaderRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method
