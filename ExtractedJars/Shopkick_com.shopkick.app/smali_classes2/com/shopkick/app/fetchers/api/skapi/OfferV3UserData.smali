.class public Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "OfferV3UserData.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public buyButtonText:Ljava/lang/String;

.field public buyUrl:Ljava/lang/String;

.field public completedUsageInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfoV2;

.field public completedUsageInfoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;",
            ">;"
        }
    .end annotation
.end field

.field public configDataCacheKey:Ljava/lang/String;

.field public emailShareBody:Ljava/lang/String;

.field public emailShareSubject:Ljava/lang/String;

.field public expiredText:Ljava/lang/String;

.field public instantBonusAwarded:Ljava/lang/Boolean;

.field public isSaved:Ljava/lang/Boolean;

.field public shareUrl:Ljava/lang/String;

.field public showCompletedState:Ljava/lang/Boolean;

.field public showExpiredState:Ljava/lang/Boolean;

.field public smsShareText:Ljava/lang/String;

.field public usageInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfoV2;

.field public usageInfoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;",
            ">;"
        }
    .end annotation
.end field

.field public userListCacheKey:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;
    .locals 2

    .line 49
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;

    if-eqz p1, :cond_0

    .line 50
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->postProcess()V
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
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;
    .locals 1

    .line 44
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->isSaved:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->isSaved:Ljava/lang/Boolean;

    .line 61
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->instantBonusAwarded:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->instantBonusAwarded:Ljava/lang/Boolean;

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->showCompletedState:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->showCompletedState:Ljava/lang/Boolean;

    .line 63
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->showExpiredState:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->showExpiredState:Ljava/lang/Boolean;

    .line 65
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->usageInfoList:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->postProcess()V

    goto :goto_0

    .line 67
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->completedUsageInfoList:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfo;->postProcess()V

    goto :goto_1

    .line 68
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->usageInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfoV2;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfoV2;->postProcess()V

    .line 69
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/OfferV3UserData;->completedUsageInfo:Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfoV2;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/OfferUsageInfoV2;->postProcess()V

    :cond_7
    return-void
.end method
