.class public Lcom/shopkick/app/invite/InvitePromoCodeViewModel;
.super Landroid/arch/lifecycle/AndroidViewModel;
.source "InvitePromoCodeViewModel.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;,
        Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;
    }
.end annotation


# instance fields
.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final dataLoading:Landroid/arch/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/arch/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final dataReady:Landroid/databinding/ObservableBoolean;

.field public final deviceOffline:Landroid/databinding/ObservableBoolean;

.field private final firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

.field public final invitePromoCodeInfoDisplayData:Landroid/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/databinding/ObservableField<",
            "Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;",
            ">;"
        }
    .end annotation
.end field

.field public final invitedFriendDisclaimerText:Landroid/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final invitedFriendsList:Landroid/databinding/ObservableList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/databinding/ObservableList<",
            "Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;",
            ">;"
        }
    .end annotation
.end field

.field public final isInFirstUse:Landroid/databinding/ObservableBoolean;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field public final offlineSectionDetailTextID:Landroid/databinding/ObservableInt;

.field public final offlineSectionHeaderTextID:Landroid/databinding/ObservableInt;

.field public final offlineSectionImageID:Landroid/databinding/ObservableInt;

.field public final serverOffline:Landroid/databinding/ObservableBoolean;

.field public final shareButtonExpGroup:Landroid/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/databinding/ObservableField<",
            "Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final shareEvent:Lcom/shopkick/app/invite/SingleLiveEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/shopkick/app/invite/SingleLiveEvent<",
            "Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;",
            ">;"
        }
    .end annotation
.end field

.field public final shareInitiated:Landroid/databinding/ObservableBoolean;

.field public final shouldShowInvitedFriends:Landroid/databinding/ObservableBoolean;

.field public final totalKicksEarnedString:Landroid/databinding/ObservableField;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/databinding/ObservableField<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final viewAllInvitedFriendsEvent:Lcom/shopkick/app/invite/SingleLiveEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/shopkick/app/invite/SingleLiveEvent<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/app/Application;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/launch/FirstUseControllerV2;)V
    .locals 2
    .param p1    # Landroid/app/Application;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/shopkick/app/util/NotificationCenter;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/shopkick/app/application/ClientFlagsManager;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/shopkick/app/launch/FirstUseControllerV2;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 105
    invoke-direct {p0, p1}, Landroid/arch/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 53
    new-instance p1, Landroid/databinding/ObservableBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Landroid/databinding/ObservableBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataReady:Landroid/databinding/ObservableBoolean;

    .line 56
    new-instance p1, Landroid/databinding/ObservableBoolean;

    invoke-direct {p1, v0}, Landroid/databinding/ObservableBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->deviceOffline:Landroid/databinding/ObservableBoolean;

    .line 59
    new-instance p1, Landroid/databinding/ObservableBoolean;

    invoke-direct {p1, v0}, Landroid/databinding/ObservableBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->serverOffline:Landroid/databinding/ObservableBoolean;

    .line 62
    new-instance p1, Landroid/databinding/ObservableBoolean;

    invoke-direct {p1, v0}, Landroid/databinding/ObservableBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->isInFirstUse:Landroid/databinding/ObservableBoolean;

    .line 64
    new-instance p1, Landroid/databinding/ObservableBoolean;

    invoke-direct {p1, v0}, Landroid/databinding/ObservableBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareInitiated:Landroid/databinding/ObservableBoolean;

    .line 67
    new-instance p1, Landroid/databinding/ObservableField;

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STATIC_ON_SCREEN:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    invoke-direct {p1, v1}, Landroid/databinding/ObservableField;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareButtonExpGroup:Landroid/databinding/ObservableField;

    .line 71
    new-instance p1, Landroid/databinding/ObservableBoolean;

    invoke-direct {p1, v0}, Landroid/databinding/ObservableBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shouldShowInvitedFriends:Landroid/databinding/ObservableBoolean;

    .line 74
    new-instance p1, Landroid/arch/lifecycle/MutableLiveData;

    invoke-direct {p1}, Landroid/arch/lifecycle/MutableLiveData;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataLoading:Landroid/arch/lifecycle/MutableLiveData;

    .line 78
    new-instance p1, Lcom/shopkick/app/invite/SingleLiveEvent;

    invoke-direct {p1}, Lcom/shopkick/app/invite/SingleLiveEvent;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareEvent:Lcom/shopkick/app/invite/SingleLiveEvent;

    .line 81
    new-instance p1, Lcom/shopkick/app/invite/SingleLiveEvent;

    invoke-direct {p1}, Lcom/shopkick/app/invite/SingleLiveEvent;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->viewAllInvitedFriendsEvent:Lcom/shopkick/app/invite/SingleLiveEvent;

    .line 86
    new-instance p1, Landroid/databinding/ObservableInt;

    const v1, 0x7f110358

    invoke-direct {p1, v1}, Landroid/databinding/ObservableInt;-><init>(I)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionHeaderTextID:Landroid/databinding/ObservableInt;

    .line 88
    new-instance p1, Landroid/databinding/ObservableInt;

    const v1, 0x7f110357

    invoke-direct {p1, v1}, Landroid/databinding/ObservableInt;-><init>(I)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionDetailTextID:Landroid/databinding/ObservableInt;

    .line 90
    new-instance p1, Landroid/databinding/ObservableInt;

    const v1, 0x7f0802b9

    invoke-direct {p1, v1}, Landroid/databinding/ObservableInt;-><init>(I)V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionImageID:Landroid/databinding/ObservableInt;

    .line 93
    new-instance p1, Landroid/databinding/ObservableField;

    invoke-direct {p1}, Landroid/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitePromoCodeInfoDisplayData:Landroid/databinding/ObservableField;

    .line 95
    new-instance p1, Landroid/databinding/ObservableField;

    invoke-direct {p1}, Landroid/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->totalKicksEarnedString:Landroid/databinding/ObservableField;

    .line 96
    new-instance p1, Landroid/databinding/ObservableField;

    invoke-direct {p1}, Landroid/databinding/ObservableField;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendDisclaimerText:Landroid/databinding/ObservableField;

    .line 97
    new-instance p1, Landroid/databinding/ObservableArrayList;

    invoke-direct {p1}, Landroid/databinding/ObservableArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendsList:Landroid/databinding/ObservableList;

    .line 106
    iput-object p2, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 107
    iput-object p3, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 108
    iput-object p4, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    .line 111
    new-instance p1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$1;-><init>(Lcom/shopkick/app/invite/InvitePromoCodeViewModel;)V

    .line 119
    iget-object p3, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->isInFirstUse:Landroid/databinding/ObservableBoolean;

    invoke-virtual {p3, p1}, Landroid/databinding/ObservableBoolean;->addOnPropertyChangedCallback(Landroid/databinding/Observable$OnPropertyChangedCallback;)V

    .line 120
    iget-object p3, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataReady:Landroid/databinding/ObservableBoolean;

    invoke-virtual {p3, p1}, Landroid/databinding/ObservableBoolean;->addOnPropertyChangedCallback(Landroid/databinding/Observable$OnPropertyChangedCallback;)V

    .line 121
    iget-object p3, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendDisclaimerText:Landroid/databinding/ObservableField;

    invoke-virtual {p3, p1}, Landroid/databinding/ObservableField;->addOnPropertyChangedCallback(Landroid/databinding/Observable$OnPropertyChangedCallback;)V

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->isInFirstUse:Landroid/databinding/ObservableBoolean;

    invoke-virtual {p4}, Lcom/shopkick/app/launch/FirstUseControllerV2;->isInFirstUse()Z

    move-result p3

    invoke-virtual {p1, p3}, Landroid/databinding/ObservableBoolean;->set(Z)V

    const-string p1, "INVITE_SCREEN_DATA_READY"

    .line 124
    invoke-virtual {p2, p0, p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    const-string p1, "INVITE_SCREEN_FRIENDS_LIST_DATA_READY"

    .line 125
    invoke-virtual {p2, p0, p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method

.method private onReceiveFriendsActivityListInfo()V
    .locals 7

    .line 235
    invoke-static {}, Lcom/shopkick/app/invite/InviteDataManager;->getInstance()Lcom/shopkick/app/invite/InviteDataManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/invite/InviteDataManager;->getFriendsActivityResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 239
    :cond_0
    iget-boolean v1, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_3

    .line 240
    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;

    .line 244
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;->friendsActivityList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;

    .line 246
    iget-object v6, v4, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->activityType:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eq v6, v5, :cond_1

    .line 247
    iget-object v4, v4, Lcom/shopkick/app/fetchers/api/skapi/FriendActivity;->kicksAward:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    add-int/2addr v3, v4

    goto :goto_0

    .line 250
    :cond_2
    invoke-virtual {p0}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->getApplication()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0f0012

    new-array v5, v5, [Ljava/lang/Object;

    .line 253
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    .line 251
    invoke-virtual {v1, v4, v3, v5}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 254
    iget-object v2, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->totalKicksEarnedString:Landroid/databinding/ObservableField;

    invoke-virtual {v2, v1}, Landroid/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 256
    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendsList:Landroid/databinding/ObservableList;

    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;->friendsActivityList:Ljava/util/List;

    invoke-interface {v1, v2}, Landroid/databinding/ObservableList;->addAll(Ljava/util/Collection;)Z

    .line 257
    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitedFriendDisclaimerText:Landroid/databinding/ObservableField;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/GetFriendsActivityResponse;->message:Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/databinding/ObservableField;->set(Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method private onReceiveInvitePromoCodeInfo()V
    .locals 4

    .line 205
    invoke-static {}, Lcom/shopkick/app/invite/InviteDataManager;->getInstance()Lcom/shopkick/app/invite/InviteDataManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/invite/InviteDataManager;->getInvitePromoCodeInfoResponse()Lcom/shopkick/fetchers/DataResponse;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 209
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataLoading:Landroid/arch/lifecycle/MutableLiveData;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/arch/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 211
    iget-boolean v1, v0, Lcom/shopkick/fetchers/DataResponse;->success:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 212
    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitePromoCodeInfoDisplayData:Landroid/databinding/ObservableField;

    iget-object v0, v0, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;

    invoke-virtual {v1, v0}, Landroid/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 213
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->deviceOffline:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0, v2}, Landroid/databinding/ObservableBoolean;->set(Z)V

    .line 214
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->serverOffline:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0, v2}, Landroid/databinding/ObservableBoolean;->set(Z)V

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataReady:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0, v3}, Landroid/databinding/ObservableBoolean;->set(Z)V

    goto :goto_0

    .line 218
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataReady:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v1, v2}, Landroid/databinding/ObservableBoolean;->set(Z)V

    .line 220
    iget v0, v0, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 221
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->deviceOffline:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0, v3}, Landroid/databinding/ObservableBoolean;->set(Z)V

    .line 222
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionHeaderTextID:Landroid/databinding/ObservableInt;

    const v1, 0x7f110358

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableInt;->set(I)V

    .line 223
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionDetailTextID:Landroid/databinding/ObservableInt;

    const v1, 0x7f110357

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableInt;->set(I)V

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionImageID:Landroid/databinding/ObservableInt;

    const v1, 0x7f080331

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableInt;->set(I)V

    goto :goto_0

    .line 226
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->serverOffline:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0, v3}, Landroid/databinding/ObservableBoolean;->set(Z)V

    .line 227
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionHeaderTextID:Landroid/databinding/ObservableInt;

    const v1, 0x7f11035a

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableInt;->set(I)V

    .line 228
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionDetailTextID:Landroid/databinding/ObservableInt;

    const v1, 0x7f110359

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableInt;->set(I)V

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->offlineSectionImageID:Landroid/databinding/ObservableInt;

    const v1, 0x7f0802b9

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableInt;->set(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method getDataLoading()Landroid/arch/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/arch/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 140
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataLoading:Landroid/arch/lifecycle/MutableLiveData;

    return-object v0
.end method

.method getInvitePromoCodeInfoDisplayData()Landroid/databinding/ObservableField;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/databinding/ObservableField<",
            "Lcom/shopkick/app/fetchers/api/skapi/InvitePromoCodeInfoResponse;",
            ">;"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->invitePromoCodeInfoDisplayData:Landroid/databinding/ObservableField;

    return-object v0
.end method

.method getShareEvent()Lcom/shopkick/app/invite/SingleLiveEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/shopkick/app/invite/SingleLiveEvent<",
            "Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;",
            ">;"
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareEvent:Lcom/shopkick/app/invite/SingleLiveEvent;

    return-object v0
.end method

.method public loadData()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->dataLoading:Landroid/arch/lifecycle/MutableLiveData;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 170
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->inviteShareButtonType:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object v0, v0, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->inviteShareButtonType:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareButtonExpGroup:Landroid/databinding/ObservableField;

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STATIC_ON_SCREEN:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 179
    :pswitch_0
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareButtonExpGroup:Landroid/databinding/ObservableField;

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->SHARE_ICONS:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 176
    :pswitch_1
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareButtonExpGroup:Landroid/databinding/ObservableField;

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STICKY_TO_BOTTOM:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableField;->set(Ljava/lang/Object;)V

    goto :goto_0

    .line 173
    :pswitch_2
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareButtonExpGroup:Landroid/databinding/ObservableField;

    sget-object v1, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;->STATIC_ON_SCREEN:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareButtonExpGroup;

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableField;->set(Ljava/lang/Object;)V

    .line 188
    :cond_0
    :goto_0
    invoke-static {}, Lcom/shopkick/app/invite/InviteDataManager;->getInstance()Lcom/shopkick/app/invite/InviteDataManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/invite/InviteDataManager;->refresh()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public nativeShare(Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;)V
    .locals 2

    .line 156
    sget-object v0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;->COPY_TO_CLIPBOARD:Lcom/shopkick/app/invite/InvitePromoCodeViewModel$ShareChannel;

    if-eq p1, v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareInitiated:Landroid/databinding/ObservableBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/databinding/ObservableBoolean;->set(Z)V

    .line 158
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->isInFirstUse:Landroid/databinding/ObservableBoolean;

    invoke-virtual {v0}, Landroid/databinding/ObservableBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->firstUseController:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->setHasUserTriedToInvite(Z)V

    .line 162
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->shareEvent:Lcom/shopkick/app/invite/SingleLiveEvent;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/invite/SingleLiveEvent;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method protected onCleared()V
    .locals 1

    .line 130
    invoke-super {p0}, Landroid/arch/lifecycle/AndroidViewModel;->onCleared()V

    .line 131
    iget-object v0, p0, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
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

    .line 194
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const v0, -0x4bc31ab8

    if-eq p2, v0, :cond_1

    const v0, 0x11dbe6ab

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "INVITE_SCREEN_DATA_READY"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const-string p2, "INVITE_SCREEN_FRIENDS_LIST_DATA_READY"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, -0x1

    :goto_1
    packed-switch p1, :pswitch_data_0

    goto :goto_2

    .line 199
    :pswitch_0
    invoke-direct {p0}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->onReceiveFriendsActivityListInfo()V

    goto :goto_2

    .line 196
    :pswitch_1
    invoke-direct {p0}, Lcom/shopkick/app/invite/InvitePromoCodeViewModel;->onReceiveInvitePromoCodeInfo()V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
