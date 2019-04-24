.class public Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;
.super Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;
.source "SectionHeaderScanMissionViewHolderConfigurator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;
    }
.end annotation


# instance fields
.field private adapter:Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;

.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/shopkick/app/tileViewHolderConfigurators/ViewHolderConfigurator;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;->context:Landroid/content/Context;

    .line 18
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;->adapter:Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;

    return-void
.end method

.method private scanMissionSubtitle(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/lang/String;
    .locals 6

    .line 44
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->missionBonusKicks:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 45
    iget-object v1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;->adapter:Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;

    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;->numUnscannedScansInScanMission(Ljava/lang/String;)I

    move-result v1

    .line 46
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->totalNumMissionItems:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-ne p1, v1, :cond_0

    .line 47
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;->context:Landroid/content/Context;

    const v5, 0x7f110636

    new-array v4, v4, [Ljava/lang/Object;

    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v3

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v2

    .line 47
    invoke-virtual {p1, v5, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 51
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;->context:Landroid/content/Context;

    const v5, 0x7f110637

    new-array v4, v4, [Ljava/lang/Object;

    .line 52
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v3

    .line 53
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v4, v2

    .line 51
    invoke-virtual {p1, v5, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    const v0, 0x7f0c01a4

    return v0
.end method

.method public onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    .line 29
    :cond_0
    invoke-virtual {p0, p1}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;->fillRow(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;)V

    const v0, 0x7f090659

    .line 31
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09060e

    .line 33
    invoke-virtual {p1, v0}, Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;->getTextView(I)Landroid/widget/TextView;

    move-result-object p1

    .line 34
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->totalNumMissionItems:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->missionBonusKicks:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;->adapter:Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;

    iget-object v1, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanMissionId:Ljava/lang/String;

    .line 35
    invoke-interface {v0, v1}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator$IScanMissionTileAdapter;->numUnscannedScansInScanMission(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    .line 36
    invoke-direct {p0, p2}, Lcom/shopkick/app/tileViewHolderConfigurators/SectionHeaderScanMissionViewHolderConfigurator;->scanMissionSubtitle(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p2, 0x0

    .line 37
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_1
    const/16 p2, 0x8

    .line 39
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
