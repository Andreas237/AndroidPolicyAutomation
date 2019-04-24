.class public Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "RewardMallElementV2.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public denominations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;",
            ">;"
        }
    .end annotation
.end field

.field public detailImageUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

.field public disableNewThumbnailSubgroupCreation:Ljava/lang/Boolean;

.field public disableQuantity:Ljava/lang/Boolean;

.field public elementType:Ljava/lang/Integer;

.field public featuredDetails:Lcom/shopkick/app/fetchers/api/skapi/FeaturedDetails;

.field public groupDetails:Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;

.field public isShownInFirstUse:Ljava/lang/Boolean;

.field public mustBeFacebookConnected:Ljava/lang/Boolean;

.field public navBarIconUrl:Ljava/lang/String;

.field public rewardElementHash:Ljava/lang/String;

.field public rewardMallItemId:Ljava/lang/String;

.field public rewardRedeemAction:Ljava/lang/Integer;

.field public rewardStatus:Ljava/lang/Integer;

.field public spacerTileDetails:Lcom/shopkick/app/fetchers/api/skapi/SpacerTileDetails;

.field public thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;
    .locals 2

    .line 49
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    if-eqz p1, :cond_0

    .line 50
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->thumbnailDetails:Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/ThumbnailDetails;->postProcess()V

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->detailScreenDetails:Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/DetailScreenDetails;->postProcess()V

    .line 64
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->denominations:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/DenominationV2;->postProcess()V

    goto :goto_0

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->spacerTileDetails:Lcom/shopkick/app/fetchers/api/skapi/SpacerTileDetails;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/SpacerTileDetails;->postProcess()V

    .line 66
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->featuredDetails:Lcom/shopkick/app/fetchers/api/skapi/FeaturedDetails;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/FeaturedDetails;->postProcess()V

    .line 67
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->groupDetails:Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/GroupDetails;->postProcess()V

    .line 68
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->mustBeFacebookConnected:Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->mustBeFacebookConnected:Ljava/lang/Boolean;

    .line 69
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->isShownInFirstUse:Ljava/lang/Boolean;

    if-nez v0, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->isShownInFirstUse:Ljava/lang/Boolean;

    .line 70
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->disableQuantity:Ljava/lang/Boolean;

    if-nez v0, :cond_8

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->disableQuantity:Ljava/lang/Boolean;

    .line 71
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->disableNewThumbnailSubgroupCreation:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/RewardMallElementV2;->disableNewThumbnailSubgroupCreation:Ljava/lang/Boolean;

    :cond_9
    return-void
.end method
