.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OfflineEducationTileV3ViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

.field private scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;Landroid/content/Context;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 37
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    .line 38
    iput-object p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    .line 39
    iput-object p4, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c0140

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 53
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    .line 56
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 57
    iget-object v1, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iget v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v1, v2, v0}, Lcom/shopkick/app/util/FrameConfigurator;->setLayoutParamsWithEqualDimensionScaling(Landroid/view/View;II)V

    .line 61
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 v1, 0x52

    .line 62
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 63
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 64
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 65
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 66
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 67
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 68
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v2, Lcom/shopkick/app/widget/UserEventFrameLayout;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0, v3, v1}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->redeemedRewardsDatasource:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->getUnusedRewards(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const v1, 0x7f09065e

    if-lez v0, :cond_0

    .line 71
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 72
    iget-object v0, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 74
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v1, v2, v3, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;-><init>(Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/url/URLDispatcher;I)V

    .line 72
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p1, v1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    const p2, 0x7f0904cb

    .line 80
    invoke-virtual {p1, p2}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p2

    const v0, 0x7f0904d2

    .line 81
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, v0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v0, v0, Lcom/shopkick/app/logging/UserEventLogger;->screenEnum:Ljava/lang/Integer;

    .line 84
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x98

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->context:Landroid/content/Context;

    const v1, 0x7f11046b

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->scanDataSource:Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;

    invoke-virtual {p2}, Lcom/shopkick/app/products/scanning/datasources/ScanBCDataSource;->hasScanInfos()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 91
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->context:Landroid/content/Context;

    const v0, 0x7f11046d

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 93
    :cond_2
    iget-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->context:Landroid/content/Context;

    const v0, 0x7f11046e

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 85
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;->context:Landroid/content/Context;

    const v1, 0x7f11046c

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p2, 0x8

    .line 86
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_2
    return-void
.end method
