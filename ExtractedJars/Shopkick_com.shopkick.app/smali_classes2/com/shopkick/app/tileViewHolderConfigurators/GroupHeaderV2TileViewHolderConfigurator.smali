.class public Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;
.source "GroupHeaderV2TileViewHolderConfigurator.java"


# instance fields
.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01a5

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 13

    .line 35
    invoke-super {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderGrayViewHolderConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    const v0, 0x7f090654

    .line 38
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 39
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 40
    new-instance v1, Landroid/text/SpannableStringBuilder;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 41
    invoke-static {v5}, Lcom/shopkick/app/util/NumberFormatter;->formatKicks(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    .line 42
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0f0010

    iget-object v7, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    .line 44
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 43
    invoke-virtual {v5, v6, v7}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 48
    :cond_0
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 49
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmountText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    const v0, 0x7f090657

    .line 57
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getSKButton(I)Lcom/shopkick/app/widget/SKButton;

    move-result-object v0

    .line 58
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 59
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    const/16 v5, 0x6e

    if-eqz v4, :cond_3

    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    if-eqz v4, :cond_3

    .line 60
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->buttonTitle:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 61
    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const/4 v2, 0x0

    .line 64
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setWidthToTextWidth(F)V

    .line 67
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 68
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 69
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->tileGroupType:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTileGroupType(Ljava/lang/Integer;)V

    .line 70
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setNumKicks(Ljava/lang/Integer;)V

    .line 71
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 72
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    if-eqz v2, :cond_2

    .line 73
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-static {v2}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWidgetType(Ljava/lang/Integer;)V

    .line 76
    :cond_2
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 77
    invoke-virtual {p0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 78
    iget-object v3, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 79
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    const/4 v3, 0x1

    .line 80
    iput-boolean v3, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 81
    iget-object v4, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object v4, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 83
    iget-object v4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v4, v2}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 86
    new-instance v0, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;

    iget-object v7, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object v8, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->skLink:Ljava/lang/String;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v9, v2, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    const/4 v10, 0x0

    .line 90
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x0

    move-object v6, v0

    invoke-direct/range {v6 .. v12}, Lcom/shopkick/app/util/CommonClickUtils$SKLinkButtonClick;-><init>(Lcom/shopkick/app/url/URLDispatcher;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 92
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    invoke-virtual {v1, v3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setEnabled(Z)V

    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const/4 v0, 0x0

    .line 96
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    invoke-virtual {v1, v3}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setEnabled(Z)V

    .line 101
    :goto_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 102
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 103
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductHierarchyId(Ljava/lang/String;)V

    .line 104
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 105
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    if-eqz v1, :cond_4

    .line 106
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->widgetType:Ljava/lang/Integer;

    invoke-static {p2}, Lcom/shopkick/app/util/TileUtils;->getTileElement(Ljava/lang/Integer;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setWidgetType(Ljava/lang/Integer;)V

    .line 109
    :cond_4
    new-instance p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {p2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 110
    invoke-virtual {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 111
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 112
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 114
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/widget/UserEventRelativeLayout;

    .line 115
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/GroupHeaderV2TileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, v0, v1, p2}, Lcom/shopkick/app/widget/UserEventRelativeLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method
