.class public Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "EarnTabTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;,
        Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;
    }
.end annotation


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private onClickTabCallbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;",
            ">;"
        }
    .end annotation
.end field

.field private selectedTab:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    const/4 v0, 0x1

    .line 28
    iput v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->selectedTab:I

    .line 32
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 33
    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->getEarnDefaultTab(Lcom/shopkick/app/application/ClientFlagsManager;)I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->selectedTab:I

    return-void
.end method

.method static synthetic access$002(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;I)I
    .locals 0

    .line 20
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->selectedTab:I

    return p1
.end method

.method static synthetic access$100(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;Landroid/view/View;Z)V
    .locals 0

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->renderTabSelected(Landroid/view/View;Z)V

    return-void
.end method

.method private renderTabSelected(Landroid/view/View;Z)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    .line 98
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f09071a

    .line 99
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const v2, 0x7f09071e

    .line 100
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f090089

    .line 101
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz p2, :cond_1

    .line 104
    invoke-virtual {p1, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 105
    invoke-virtual {p1, v5}, Landroid/view/View;->setClickable(Z)V

    .line 106
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 107
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f060120

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 108
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 111
    :cond_1
    invoke-virtual {p1, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 112
    invoke-virtual {p1, v4}, Landroid/view/View;->setClickable(Z)V

    .line 113
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 114
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0600c8

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x4

    .line 115
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private setupClickLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 137
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x16d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 138
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedTab(Ljava/lang/Integer;)V

    .line 140
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 141
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 142
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 143
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    const/4 p1, 0x1

    .line 144
    iput-boolean p1, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    if-eqz p3, :cond_0

    .line 147
    iget-object p1, p3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 148
    iget-object p1, p3, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object p1, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 151
    :cond_0
    new-instance p1, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$1;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;)V

    .line 155
    check-cast p2, Lcom/shopkick/app/logging/IUserEventView;

    iget-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p2, v0, p3, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 156
    invoke-interface {p2, p1}, Lcom/shopkick/app/logging/IUserEventView;->setRepeatableLogActions(Ljava/util/ArrayList;)V

    return-void
.end method

.method private setupImpressionLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 3

    .line 120
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x16d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 121
    iget v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->selectedTab:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedTab(Ljava/lang/Integer;)V

    .line 123
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 124
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 125
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 126
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    if-eqz p2, :cond_0

    .line 129
    iget-object v2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 130
    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->trackingUrl:Ljava/lang/String;

    iput-object p2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->trackingUrl:Ljava/lang/String;

    .line 133
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast p1, Lcom/shopkick/app/logging/IUserEventView;

    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-interface {p1, v0, p2, v1}, Lcom/shopkick/app/logging/IUserEventView;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c00a7

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 50
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 52
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->updateLayout(Landroid/view/View;)V

    const v0, 0x7f09071c

    .line 54
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09071d

    .line 55
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    .line 57
    new-instance v2, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->onClickTabCallbackRef:Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0, p1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$OnTabClickListener;-><init>(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Ljava/lang/ref/WeakReference;)V

    .line 58
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->setupImpressionLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 62
    invoke-direct {p0, p1, v0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->setupClickLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    .line 63
    invoke-direct {p0, p1, v1, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->setupClickLogging(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Landroid/view/View;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V

    return-void
.end method

.method public selectTab(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->selectedTab:I

    return-void
.end method

.method public setOnClickTabCallback(Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator$IOnClickTabCallback;)V
    .locals 1

    .line 41
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->onClickTabCallbackRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public updateLayout(Landroid/view/View;)V
    .locals 7

    const v0, 0x7f09071c

    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09071d

    .line 69
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz v0, :cond_4

    if-nez p1, :cond_0

    goto :goto_2

    .line 76
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/util/FeatureFlagHelper;->getEarnDefaultTab(Lcom/shopkick/app/application/ClientFlagsManager;)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move-object v6, v0

    move-object v0, p1

    move-object p1, v6

    .line 84
    :cond_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const v3, 0x7f09071e

    .line 86
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f11026f

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    .line 87
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f110270

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(I)V

    const v3, 0x7f09071a

    .line 88
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    const v5, 0x7f080141

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 89
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f080144

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 91
    iget v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->selectedTab:I

    const/4 v4, 0x0

    if-ne v3, v2, :cond_2

    move v3, v2

    goto :goto_0

    :cond_2
    move v3, v4

    :goto_0
    invoke-direct {p0, p1, v3}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->renderTabSelected(Landroid/view/View;Z)V

    .line 92
    iget p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->selectedTab:I

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    move v2, v4

    :goto_1
    invoke-direct {p0, v0, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/EarnTabTileViewHolderConfigurator;->renderTabSelected(Landroid/view/View;Z)V

    return-void

    :cond_4
    :goto_2
    return-void
.end method
