.class public Lcom/shopkick/app/application/ProfileInfo;
.super Ljava/lang/Object;
.source "ProfileInfo.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/app/fetchers/image/ISKDiskCacheCallback;


# static fields
.field public static final GUEST_USER_NAME:Ljava/lang/String; = "shopkicker"

.field private static final PROFILEINFO_DISKCACHE_KEY:Ljava/lang/String; = "profileinfo_profile"

.field public static final PROFILEINFO_UPDATED_EVENT:Ljava/lang/String; = "ProfileInfoUpdatedEvent"

.field public static final PROFILE_PHOTO_UPDATE_FAILED_EVENT:Ljava/lang/String; = "ProfilePhotoUpdateFailEvent"

.field public static final PROFILE_PHOTO_UPDATE_SUCCESS_EVENT:Ljava/lang/String; = "ProfilePhotoUpdateSuccessEvent"

.field public static final PROFILE_PHOTO_URL:Ljava/lang/String; = "ProfilePhotoUrl"

.field public static final PROFILE_SET_PRIVACY_FAILED_EVENT:Ljava/lang/String; = "ProfileSetPrivacyFailedEvent"

.field public static final PROFILE_SET_PRIVACY_SUCCESS_EVENT:Ljava/lang/String; = "ProfileSetPrivacySuccessEvent"

.field public static final SELECTED_REWARD_ID_UPDATED:Ljava/lang/String; = "SelectedRewardIdUpdated"

.field public static final SQUARE_PHOTO_URL:Ljava/lang/String; = "SquarePhotoUrl"

.field public static final THUMBNAIL_PHOTO_URL:Ljava/lang/String; = "ThumbnailPhotoUrl"


# instance fields
.field private alertFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private cachedThumbnailPhoto:Landroid/graphics/Bitmap;

.field private density:D

.field private diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field public profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

.field private profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

.field private profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

.field private profilesUploadPhotoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;

.field private tempSelectedRewardDenomination:Ljava/lang/Long;

.field private tempSelectedRewardId:Ljava/lang/String;

.field private userAcct:Lcom/shopkick/app/account/UserAccount;

.field private userFirstUse:Z

.field private userSelectRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/fetchers/image/SKDiskCache;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/application/dialog/DialogsManager;DLcom/shopkick/app/application/AppPreferences;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p5, 0x0

    .line 67
    iput-boolean p5, p0, Lcom/shopkick/app/application/ProfileInfo;->userFirstUse:Z

    .line 78
    iput-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 79
    iput-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 80
    iput-object p3, p0, Lcom/shopkick/app/application/ProfileInfo;->diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    .line 81
    iput-object p4, p0, Lcom/shopkick/app/application/ProfileInfo;->userAcct:Lcom/shopkick/app/account/UserAccount;

    .line 82
    iput-wide p6, p0, Lcom/shopkick/app/application/ProfileInfo;->density:D

    .line 83
    iput-object p8, p0, Lcom/shopkick/app/application/ProfileInfo;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const-string p1, "UserAccountIdChangedEvent"

    .line 84
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "UserAccountInfoUpdatedEvent"

    .line 85
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "LogoutRequestSuccess"

    .line 86
    invoke-virtual {p2, p0, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    const-string p1, "profileinfo_profile"

    .line 88
    invoke-virtual {p3, p1, p0}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->getBytesFromCache(Ljava/lang/String;Lcom/shopkick/app/fetchers/image/ISKDiskCacheCallback;)V

    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 2

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_3

    .line 222
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_2

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_2

    .line 223
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iput-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    .line 224
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardId:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 228
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->selectedRewardMallItemId:Ljava/lang/String;

    .line 229
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardId:Ljava/lang/String;

    .line 232
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->cachedThumbnailPhoto:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_1

    .line 233
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 234
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->cachedThumbnailPhoto:Landroid/graphics/Bitmap;

    .line 236
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ProfileInfoUpdatedEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 237
    invoke-virtual {p0}, Lcom/shopkick/app/application/ProfileInfo;->updateProfileInDiskCache()V

    .line 239
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    .line 240
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p2}, Lcom/shopkick/app/account/UserAccount;->getUserId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->setUserIdentifier(Ljava/lang/String;)V

    .line 241
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->crashReportingDisabled:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->recordUserPreference(Z)V

    .line 243
    :cond_2
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    goto/16 :goto_4

    .line 244
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesUploadPhotoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;

    if-ne p1, v0, :cond_5

    .line 245
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_4

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_4

    .line 246
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoResponse;

    .line 248
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoResponse;->profilePhotoUrl:Ljava/lang/String;

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->profilePhotoUrl:Ljava/lang/String;

    .line 249
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoResponse;->squarePhotoUrl:Ljava/lang/String;

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->squarePhotoUrl:Ljava/lang/String;

    .line 250
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoResponse;->thumbnailPhotoUrl:Ljava/lang/String;

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->thumbnailPhotoUrl:Ljava/lang/String;

    .line 251
    invoke-virtual {p0}, Lcom/shopkick/app/application/ProfileInfo;->updateProfileInDiskCache()V

    goto :goto_0

    .line 255
    :cond_4
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ProfilePhotoUpdateFailEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 257
    :goto_0
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesUploadPhotoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;

    goto/16 :goto_4

    .line 258
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    if-ne p1, v0, :cond_9

    .line 259
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_8

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_8

    .line 260
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;->isPrivate:Ljava/lang/Boolean;

    if-eqz p1, :cond_6

    .line 261
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->isPrivate:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->isPrivate:Ljava/lang/Boolean;

    goto :goto_1

    .line 262
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;->crashReportingDisabled:Ljava/lang/Boolean;

    if-eqz p1, :cond_7

    .line 263
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->crashReportingDisabled:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->crashReportingDisabled:Ljava/lang/Boolean;

    .line 264
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->crashReportingDisabled:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/CrashlyticsWrapper;->recordUserPreference(Z)V

    .line 266
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/shopkick/app/application/ProfileInfo;->updateProfileInDiskCache()V

    .line 267
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ProfileSetPrivacySuccessEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_2

    .line 269
    :cond_8
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ProfileSetPrivacyFailedEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 271
    :goto_2
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    goto :goto_4

    .line 272
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->userSelectRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;

    if-ne p1, v0, :cond_c

    .line 273
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_b

    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz p1, :cond_b

    .line 274
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardResponse;

    .line 275
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz p2, :cond_a

    .line 276
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardResponse;->rewardMallItemId:Ljava/lang/String;

    iput-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->selectedRewardMallItemId:Ljava/lang/String;

    .line 277
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardResponse;->selectedRewardDenomination:Ljava/lang/Long;

    iput-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->selectedRewardDenomination:Ljava/lang/Long;

    .line 278
    invoke-virtual {p0}, Lcom/shopkick/app/application/ProfileInfo;->updateProfileInDiskCache()V

    .line 281
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardId:Ljava/lang/String;

    .line 282
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardDenomination:Ljava/lang/Long;

    .line 284
    :cond_a
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "SelectedRewardIdUpdated"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_3

    .line 287
    :cond_b
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardId:Ljava/lang/String;

    .line 288
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardDenomination:Ljava/lang/Long;

    .line 290
    :goto_3
    iput-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->userSelectRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;

    :cond_c
    :goto_4
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 92
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 93
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    if-eqz v0, :cond_0

    .line 94
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    if-eqz v0, :cond_1

    .line 97
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 99
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesUploadPhotoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;

    if-eqz v0, :cond_2

    .line 100
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 102
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->userSelectRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;

    if-eqz v0, :cond_3

    .line 103
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_3
    return-void
.end method

.method public firstName()Ljava/lang/String;
    .locals 1

    .line 317
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string/jumbo v0, "shopkicker"

    :goto_0
    return-object v0
.end method

.method public getCachedThumbnailPhoto()Landroid/graphics/Bitmap;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->cachedThumbnailPhoto:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getDisplayName()Ljava/lang/String;
    .locals 2

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 323
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->firstName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->lastName:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " "

    .line 325
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->lastName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string/jumbo v1, "shopkicker"

    .line 328
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getSelectedRewardDenominationInKicks()Ljava/lang/Long;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardDenomination:Ljava/lang/Long;

    if-eqz v0, :cond_0

    return-object v0

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_1

    .line 210
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->selectedRewardDenomination:Ljava/lang/Long;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSelectedRewardId()Ljava/lang/String;
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardId:Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 196
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-eqz v0, :cond_1

    .line 197
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->selectedRewardMallItemId:Ljava/lang/String;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getThumbnailPhotoUrl()Ljava/lang/String;
    .locals 1

    .line 334
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 337
    :cond_0
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->thumbnailPhotoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getUserFirstUse()Z
    .locals 1

    .line 365
    iget-boolean v0, p0, Lcom/shopkick/app/application/ProfileInfo;->userFirstUse:Z

    return v0
.end method

.method public onBytesReadFromDiskCache(Ljava/lang/String;[B)V
    .locals 2

    if-eqz p2, :cond_1

    const/4 p1, 0x0

    .line 348
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, p2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 349
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-nez p2, :cond_0

    const/4 p2, 0x1

    .line 350
    invoke-static {v0, p2}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    move-result-object p2

    iput-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    goto :goto_0

    .line 352
    :cond_0
    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    invoke-static {p2, v0}, Lcom/shopkick/app/util/GsonUtils;->merge(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    iput-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/shopkick/app/util/GsonUtils$JsonObjectExtensionConflictException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 359
    :catch_0
    iput-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    goto :goto_0

    .line 356
    :catch_1
    iput-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    :cond_1
    :goto_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "UserAccountIdChangedEvent"

    if-ne p1, p2, :cond_0

    .line 307
    invoke-virtual {p0}, Lcom/shopkick/app/application/ProfileInfo;->reset()V

    .line 308
    invoke-virtual {p0}, Lcom/shopkick/app/application/ProfileInfo;->refresh()V

    goto :goto_0

    :cond_0
    const-string p2, "UserAccountInfoUpdatedEvent"

    if-ne p1, p2, :cond_1

    .line 310
    invoke-virtual {p0}, Lcom/shopkick/app/application/ProfileInfo;->refresh()V

    goto :goto_0

    :cond_1
    const-string p2, "LogoutRequestSuccess"

    if-ne p1, p2, :cond_2

    .line 312
    invoke-virtual {p0}, Lcom/shopkick/app/application/ProfileInfo;->reset()V

    :cond_2
    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public refresh()V
    .locals 10

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->userAcct:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    iget-wide v1, p0, Lcom/shopkick/app/application/ProfileInfo;->density:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;->scale:Ljava/lang/Double;

    .line 111
    iget-object v2, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v4, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    const/4 v6, 0x0

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->NORMAL:Lnet/toddm/comm/CacheBehavior;

    move-object v5, p0

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetchInBackground(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_0
    return-void
.end method

.method public reset()V
    .locals 3

    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    .line 119
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->cachedThumbnailPhoto:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    .line 120
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 121
    iput-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->cachedThumbnailPhoto:Landroid/graphics/Bitmap;

    .line 123
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object v2, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    invoke-virtual {v1, v2, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 124
    iput-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoRequestV3;

    .line 125
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    const-string v1, "profileinfo_profile"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->removeBytesFromCache(Ljava/lang/String;)V

    return-void
.end method

.method public setCrashReportingAndPromotionalEmailSubscription(ZZ)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    if-eqz v0, :cond_0

    return-void

    .line 165
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    if-nez v0, :cond_1

    .line 166
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "ProfileSetPrivacyFailedEvent"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void

    .line 169
    :cond_1
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;->crashReportingDisabled:Ljava/lang/Boolean;

    .line 171
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;->deEmailSubscriptionEnabled:Ljava/lang/Boolean;

    .line 172
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    iget-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesSetPrivacyRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesSetPrivacyRequest;

    invoke-virtual {p1, p2, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method

.method public setSelectedRewardId(Ljava/lang/String;Ljava/lang/Long;)V
    .locals 2

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->userSelectRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;

    if-eqz v0, :cond_0

    .line 177
    iget-object v1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 180
    :cond_0
    iput-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardId:Ljava/lang/String;

    .line 181
    iput-object p2, p0, Lcom/shopkick/app/application/ProfileInfo;->tempSelectedRewardDenomination:Ljava/lang/Long;

    .line 182
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->userSelectRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->userSelectRewardRequest:Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;->rewardMallItemId:Ljava/lang/String;

    .line 184
    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/UserSelectRewardRequest;->selectedRewardDenomination:Ljava/lang/Long;

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/application/AppPreferences;->setShownKicksCenterToast(Z)V

    return-void
.end method

.method public setUserFirstUse(Z)V
    .locals 0

    .line 369
    iput-boolean p1, p0, Lcom/shopkick/app/application/ProfileInfo;->userFirstUse:Z

    return-void
.end method

.method public updateProfileInDiskCache()V
    .locals 3

    .line 129
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->diskCache:Lcom/shopkick/app/fetchers/image/SKDiskCache;

    const-string v1, "profileinfo_profile"

    iget-object v2, p0, Lcom/shopkick/app/application/ProfileInfo;->profile:Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;

    invoke-virtual {v2}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesInfoV3Response;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/fetchers/image/SKDiskCache;->addBytesToCache(Ljava/lang/String;[B)V

    return-void
.end method

.method public uploadPhoto([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesUploadPhotoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;

    if-eqz v0, :cond_0

    return-void

    .line 137
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-static {p1}, Lorg/bouncycastle/util/encoders/Base64;->encode([B)[B

    move-result-object v1

    const-string v2, "ASCII"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    const/4 v1, 0x0

    .line 140
    array-length v2, p1

    .line 141
    invoke-static {p1, v1, v2}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 v1, 0x2

    const/16 v2, 0x64

    .line 140
    invoke-static {p1, v2, v2, v1}, Landroid/media/ThumbnailUtils;->extractThumbnail(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->cachedThumbnailPhoto:Landroid/graphics/Bitmap;

    .line 147
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "ProfilePhotoUpdateSuccessEvent"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 150
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesUploadPhotoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;

    .line 151
    iget-object p1, p0, Lcom/shopkick/app/application/ProfileInfo;->profilesUploadPhotoRequest:Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;

    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;->photo:Ljava/lang/String;

    const-string v0, "image/jpeg"

    .line 152
    iput-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/ProfilesUploadPhotoRequest;->contentType:Ljava/lang/String;

    .line 153
    iget-object v0, p0, Lcom/shopkick/app/application/ProfileInfo;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v0, p1, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    return-void
.end method
