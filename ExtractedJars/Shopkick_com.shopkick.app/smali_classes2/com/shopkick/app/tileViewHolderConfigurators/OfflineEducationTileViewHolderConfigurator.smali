.class public Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "OfflineEducationTileViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator$OfflineRewardsEducationClick;
    }
.end annotation


# static fields
.field private static final EXPLANATION_TEXT_FONT_SIZE_SMALL:I = 0xe

.field private static final EXPLANATION_TEXT_LENGTH_THRESHOLD:I = 0x6e


# instance fields
.field private awardsManager:Lcom/shopkick/app/awards/AwardsManager;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/url/URLDispatcher;Lcom/shopkick/app/awards/AwardsManager;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 30
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c013f

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 4

    .line 40
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f0904ca

    .line 43
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;->awardsManager:Lcom/shopkick/app/awards/AwardsManager;

    invoke-virtual {v1}, Lcom/shopkick/app/awards/AwardsManager;->getVisibleLocationRequests()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f110467

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const/16 v1, 0x30

    goto :goto_0

    :cond_0
    const v1, 0x7f110464

    .line 49
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const/16 v1, 0x52

    .line 53
    :goto_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/16 v3, 0x6e

    if-le v2, v3, :cond_1

    const/high16 v2, 0x41600000    # 14.0f

    .line 54
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 58
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setElement(Ljava/lang/Integer;)V

    .line 60
    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 61
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 62
    invoke-virtual {p0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;->setOptionalSetupParamsCoordinators(Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 63
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->cellView:Landroid/view/View;

    .line 64
    invoke-virtual {p1}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getLayoutPosition()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->displayPos:Ljava/lang/Integer;

    .line 65
    iget-object v2, p1, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->itemView:Landroid/view/View;

    check-cast v2, Lcom/shopkick/app/widget/UserEventFrameLayout;

    iget-object v3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0, v3, v1}, Lcom/shopkick/app/widget/UserEventFrameLayout;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    const v0, 0x7f0905e7

    .line 67
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    .line 68
    new-instance v0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator$OfflineRewardsEducationClick;

    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    iget-object v2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->dataPos:Ljava/lang/Integer;

    .line 70
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, v1, v2, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileViewHolderConfigurator$OfflineRewardsEducationClick;-><init>(Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/url/URLDispatcher;I)V

    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
