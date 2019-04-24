.class public Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;
.super Lcom/shopkick/app/fetchers/api/IAPIResponseObject;
.source "ProfilesInfoV3Response.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public activityCounts:Lcom/shopkick/app/fetchers/api/skapi/UserActivityCounts;

.field public birthdate:Ljava/lang/String;

.field public common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

.field public crashReportingDisabled:Ljava/lang/Boolean;

.field public firstName:Ljava/lang/String;

.field public gender:Ljava/lang/Integer;

.field public invitedFriendsWebviewUrl:Ljava/lang/String;

.field public isPrivate:Ljava/lang/Boolean;

.field public lastName:Ljava/lang/String;

.field public lifetimeKicks:Ljava/lang/Long;

.field public numSkFriends:Ljava/lang/Integer;

.field public numberOfRewards:Ljava/lang/Integer;

.field public profilePhotoUrl:Ljava/lang/String;

.field public rewardPercentCompleted:Ljava/lang/Integer;

.field public selectedRewardDenomination:Ljava/lang/Long;

.field public selectedRewardMallItemId:Ljava/lang/String;

.field public squarePhotoUrl:Ljava/lang/String;

.field public thumbnailPhotoUrl:Ljava/lang/String;

.field public userActionHistoryUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIResponseObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;
    .locals 2

    .line 52
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz p1, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 24
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    move-result-object p1

    return-object p1
.end method

.method public commonResponseData()Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    return-object v0
.end method

.method public postProcess()V
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->common:Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/CommonResponseData;->postProcess()V

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->activityCounts:Lcom/shopkick/app/fetchers/api/skapi/UserActivityCounts;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserActivityCounts;->postProcess()V

    .line 65
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->isPrivate:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->isPrivate:Ljava/lang/Boolean;

    .line 66
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->crashReportingDisabled:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->crashReportingDisabled:Ljava/lang/Boolean;

    :cond_3
    return-void
.end method
