.class public Lcom/shopkick/app/invite/InviteDataManager;
.super Ljava/lang/Object;
.source "InviteDataManager.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final INVITE_SCREEN_DATA_READY:Ljava/lang/String; = "INVITE_SCREEN_DATA_READY"

.field public static final INVITE_SCREEN_FRIENDS_LIST_DATA_READY:Ljava/lang/String; = "INVITE_SCREEN_FRIENDS_LIST_DATA_READY"

.field private static volatile Instance:Lcom/shopkick/app/invite/InviteDataManager;

.field private static final InstanceLock:Ljava/lang/Object;


# instance fields
.field private final apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private final appPref:Lcom/shopkick/app/application/AppPreferences;

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private getFriendsActivityRequest:Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityRequest;

.field private getFriendsActivityResponse:Lcom/shopkick/fetchers/DataResponse;

.field private invitePromoCodeInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoRequest;

.field private invitePromoCodeInfoResponse:Lcom/shopkick/fetchers/DataResponse;

.field private isFetchingFriendsActivity:Z

.field private isFetchingInvitePromoCodeInfo:Z

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private final userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 44
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/app/invite/InviteDataManager;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/shopkick/app/invite/InviteDataManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 61
    iput-object p2, p0, Lcom/shopkick/app/invite/InviteDataManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 62
    iput-object p3, p0, Lcom/shopkick/app/invite/InviteDataManager;->appPref:Lcom/shopkick/app/application/AppPreferences;

    .line 63
    iput-object p4, p0, Lcom/shopkick/app/invite/InviteDataManager;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 64
    iput-object p5, p0, Lcom/shopkick/app/invite/InviteDataManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    const/4 p1, 0x0

    .line 66
    iput-boolean p1, p0, Lcom/shopkick/app/invite/InviteDataManager;->isFetchingFriendsActivity:Z

    .line 67
    iput-boolean p1, p0, Lcom/shopkick/app/invite/InviteDataManager;->isFetchingInvitePromoCodeInfo:Z

    const-string p3, "UserAccountIdChangedEvent"

    .line 69
    invoke-virtual {p2, p0, p3, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    const-string p3, "RegistrationRequestSuccess"

    .line 70
    invoke-virtual {p2, p0, p3, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    const-string p3, "DeleteAccountRequestSuccess"

    .line 71
    invoke-virtual {p2, p0, p3, p1}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method private countActionTakenInvites(Ljava/util/List;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;",
            ">;)I"
        }
    .end annotation

    .line 223
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;

    .line 224
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->activityType:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static getInstance()Lcom/shopkick/app/invite/InviteDataManager;
    .locals 2

    .line 95
    sget-object v0, Lcom/shopkick/app/invite/InviteDataManager;->Instance:Lcom/shopkick/app/invite/InviteDataManager;

    const-string v1, "InviteDataManager.initialize() must be called before using the InviteDataManager"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    sget-object v0, Lcom/shopkick/app/invite/InviteDataManager;->Instance:Lcom/shopkick/app/invite/InviteDataManager;

    return-object v0
.end method

.method public static initialize(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V
    .locals 8

    .line 76
    sget-object v0, Lcom/shopkick/app/invite/InviteDataManager;->Instance:Lcom/shopkick/app/invite/InviteDataManager;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "InviteDataManager has already been initialized!"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    const-string v0, "apiManager cannot be null."

    .line 77
    invoke-static {p0, v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v0, Lcom/shopkick/app/invite/InviteDataManager;->Instance:Lcom/shopkick/app/invite/InviteDataManager;

    if-nez v0, :cond_2

    .line 80
    sget-object v0, Lcom/shopkick/app/invite/InviteDataManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 81
    :try_start_0
    sget-object v1, Lcom/shopkick/app/invite/InviteDataManager;->Instance:Lcom/shopkick/app/invite/InviteDataManager;

    if-nez v1, :cond_1

    .line 82
    new-instance v1, Lcom/shopkick/app/invite/InviteDataManager;

    move-object v2, v1

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/shopkick/app/invite/InviteDataManager;-><init>(Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/account/UserAccount;)V

    sput-object v1, Lcom/shopkick/app/invite/InviteDataManager;->Instance:Lcom/shopkick/app/invite/InviteDataManager;

    .line 84
    :cond_1
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_1
    return-void
.end method

.method public static isInitialized()Z
    .locals 2

    .line 89
    sget-object v0, Lcom/shopkick/app/invite/InviteDataManager;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 90
    :try_start_0
    sget-object v1, Lcom/shopkick/app/invite/InviteDataManager;->Instance:Lcom/shopkick/app/invite/InviteDataManager;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 91
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private updateInviteScreenBadgeValue(Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;)V
    .locals 9

    .line 173
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityResponse:Lcom/shopkick/fetchers/DataResponse;

    if-eqz v0, :cond_6

    iget-boolean v0, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 177
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;->friendsActivityList:Ljava/util/List;

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getInvitedFriendSize()I

    move-result v0

    .line 181
    iget-object v1, p0, Lcom/shopkick/app/invite/InviteDataManager;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->getActionTakenFriendsSize()I

    move-result v1

    .line 184
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v0

    const/4 v3, 0x0

    const/4 v4, -0x1

    if-eq v0, v4, :cond_1

    if-gez v2, :cond_1

    .line 187
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    .line 188
    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 189
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    sget-object v2, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v7

    or-long/2addr v5, v7

    const-string/jumbo v2, "users\' invited friends list shrink."

    new-array v7, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v5, v6, v2, v7}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    if-eq v1, v4, :cond_2

    add-int v0, v3, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v3

    .line 195
    :goto_1
    invoke-direct {p0, p1}, Lcom/shopkick/app/invite/InviteDataManager;->countActionTakenInvites(Ljava/util/List;)I

    move-result v2

    sub-int v5, v2, v1

    if-eq v1, v4, :cond_3

    if-gez v5, :cond_3

    .line 199
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v1

    .line 200
    invoke-virtual {v1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v1

    sget-object v4, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    .line 201
    invoke-virtual {v4}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    sget-object v6, Lcom/shopkick/logging/Area;->UI:Lcom/shopkick/logging/Area;

    invoke-virtual {v6}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v6

    or-long/2addr v4, v6

    const-string/jumbo v6, "users\' action taken invites shrink"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v4, v5, v6, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    if-eq v1, v4, :cond_4

    if-lez v5, :cond_4

    add-int/2addr v0, v5

    .line 207
    :cond_4
    :goto_2
    iget-object v1, p0, Lcom/shopkick/app/invite/InviteDataManager;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/application/AppPreferences;->setActionTakenFriendsSize(I)V

    .line 208
    iget-object v1, p0, Lcom/shopkick/app/invite/InviteDataManager;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Lcom/shopkick/app/application/AppPreferences;->setInvitedFriendSize(I)V

    .line 210
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string v1, "paramBadgeContextName"

    const-string v2, "invite"

    .line 211
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-lez v0, :cond_5

    const-string v1, "paramBadgeValue"

    .line 214
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventBadgeShow"

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    goto :goto_3

    .line 217
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "EventBadgeHide"

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    :goto_3
    return-void

    :cond_6
    :goto_4
    return-void
.end method


# virtual methods
.method public clean()V
    .locals 1

    const/4 v0, 0x0

    .line 131
    iput-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityResponse:Lcom/shopkick/fetchers/DataResponse;

    .line 132
    iput-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->invitePromoCodeInfoResponse:Lcom/shopkick/fetchers/DataResponse;

    .line 133
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->deleteActionTakenFriendsSize()V

    .line 134
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->appPref:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->deleteInvitedFriendSize()V

    return-void
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 152
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityRequest:Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityRequest;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    .line 153
    iget-boolean v0, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;

    invoke-direct {p0, v0}, Lcom/shopkick/app/invite/InviteDataManager;->updateInviteScreenBadgeValue(Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;)V

    .line 156
    iput-object p2, p0, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityResponse:Lcom/shopkick/fetchers/DataResponse;

    const/4 v0, 0x0

    .line 157
    iput-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityRequest:Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityRequest;

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "INVITE_SCREEN_FRIENDS_LIST_DATA_READY"

    invoke-virtual {v0, v2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 160
    :cond_0
    iput-boolean v1, p0, Lcom/shopkick/app/invite/InviteDataManager;->isFetchingFriendsActivity:Z

    .line 163
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->invitePromoCodeInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoRequest;

    if-ne p1, v0, :cond_2

    .line 165
    iput-object p2, p0, Lcom/shopkick/app/invite/InviteDataManager;->invitePromoCodeInfoResponse:Lcom/shopkick/fetchers/DataResponse;

    .line 166
    iput-boolean v1, p0, Lcom/shopkick/app/invite/InviteDataManager;->isFetchingInvitePromoCodeInfo:Z

    .line 167
    iget-object p1, p0, Lcom/shopkick/app/invite/InviteDataManager;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "INVITE_SCREEN_DATA_READY"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_2
    return-void
.end method

.method public getFriendsActivityResponse()Lcom/shopkick/fetchers/DataResponse;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityResponse:Lcom/shopkick/fetchers/DataResponse;

    return-object v0
.end method

.method public getInvitePromoCodeInfoResponse()Lcom/shopkick/fetchers/DataResponse;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->invitePromoCodeInfoResponse:Lcom/shopkick/fetchers/DataResponse;

    return-object v0
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

    if-eq p1, p2, :cond_1

    const-string p2, "DeleteAccountRequestSuccess"

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "RegistrationRequestSuccess"

    if-ne p1, p2, :cond_2

    .line 236
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InviteDataManager;->clean()V

    .line 237
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InviteDataManager;->refresh()V

    goto :goto_1

    .line 234
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InviteDataManager;->clean()V

    :cond_2
    :goto_1
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public refresh()V
    .locals 10

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccount;->isRegistered()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 105
    :cond_0
    iget-boolean v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->isFetchingFriendsActivity:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 106
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityRequest:Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityRequest;

    .line 107
    iget-object v2, p0, Lcom/shopkick/app/invite/InviteDataManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v4, p0, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityRequest:Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityRequest;

    const/4 v6, 0x0

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->LOW:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->DO_NOT_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v5, p0

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    .line 114
    iput-boolean v1, p0, Lcom/shopkick/app/invite/InviteDataManager;->isFetchingFriendsActivity:Z

    .line 117
    :cond_1
    iget-boolean v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->isFetchingInvitePromoCodeInfo:Z

    if-nez v0, :cond_2

    .line 118
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/invite/InviteDataManager;->invitePromoCodeInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoRequest;

    .line 119
    iget-object v2, p0, Lcom/shopkick/app/invite/InviteDataManager;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    sget-object v3, Lcom/shopkick/fetchers/api/RequestDomainId;->SHOPKICK_APP:Lcom/shopkick/fetchers/api/RequestDomainId;

    iget-object v4, p0, Lcom/shopkick/app/invite/InviteDataManager;->invitePromoCodeInfoRequest:Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoRequest;

    const/4 v6, 0x0

    sget-object v7, Lnet/toddm/comm/Priority$StartingPriority;->MEDIUM:Lnet/toddm/comm/Priority$StartingPriority;

    sget-object v8, Lnet/toddm/cache/CachePriority;->NORMAL:Lnet/toddm/cache/CachePriority;

    sget-object v9, Lnet/toddm/comm/CacheBehavior;->SERVER_DIRECTED_CACHE:Lnet/toddm/comm/CacheBehavior;

    move-object v5, p0

    invoke-virtual/range {v2 .. v9}, Lcom/shopkick/fetchers/api/APIManager;->fetch(Lcom/shopkick/fetchers/api/RequestDomainId;Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;ZLnet/toddm/comm/Priority$StartingPriority;Lnet/toddm/cache/CachePriority;Lnet/toddm/comm/CacheBehavior;)Lcom/shopkick/fetchers/RequestDetails;

    .line 126
    iput-boolean v1, p0, Lcom/shopkick/app/invite/InviteDataManager;->isFetchingInvitePromoCodeInfo:Z

    :cond_2
    return-void
.end method
