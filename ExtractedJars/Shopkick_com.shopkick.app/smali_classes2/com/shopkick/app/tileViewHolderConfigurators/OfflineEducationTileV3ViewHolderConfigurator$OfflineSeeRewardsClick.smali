.class Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;
.super Ljava/lang/Object;
.source "OfflineEducationTileV3ViewHolderConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "OfflineSeeRewardsClick"
.end annotation


# instance fields
.field private dataPosition:I

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/url/URLDispatcher;I)V
    .locals 0

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    iput-object p1, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 105
    iput-object p2, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    .line 106
    iput p3, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;->dataPosition:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 112
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x53

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 113
    iget v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;->dataPosition:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 114
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 116
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/DetailsActivity;

    const-class v1, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, v2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 117
    iget-object v0, p0, Lcom/shopkick/app/tileViewHolderConfigurators/OfflineEducationTileV3ViewHolderConfigurator$OfflineSeeRewardsClick;->urlDispatcher:Lcom/shopkick/app/url/URLDispatcher;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->skUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
