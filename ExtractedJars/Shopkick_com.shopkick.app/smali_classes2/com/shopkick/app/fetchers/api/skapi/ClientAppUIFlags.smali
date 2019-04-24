.class public Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ClientAppUIFlags.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public aggregateDealsEnabled:Ljava/lang/Boolean;

.field public allowedInviteMedia:Ljava/lang/String;

.field public defaultTabContextOverride:Ljava/lang/String;

.field public disableActionButtonAndroid:Ljava/lang/Boolean;

.field public disableActionButtonIos:Ljava/lang/Boolean;

.field public disableMicrophonePermission:Ljava/lang/Boolean;

.field public disableUltrasonicWalkins:Ljava/lang/Boolean;

.field public dontUseWalkinButton:Ljava/lang/Boolean;

.field public dontUseWalkinButtonIos:Ljava/lang/Boolean;

.field public maxNumberInvalidEmailLogs:Ljava/lang/Integer;

.field public numberOfRecommendations:Ljava/lang/Integer;

.field public preselectAllRecommendedFriends:Ljava/lang/Boolean;

.field public savingDealsEnabled:Ljava/lang/Boolean;

.field public showKicksCenter:Ljava/lang/Boolean;

.field public showNewCardLinkingScreen:Ljava/lang/Boolean;

.field public tabContextOrderOverride:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public tabContextToTitleMapOverride:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public tabNavigationEnabled:Ljava/lang/Boolean;

.field public useCombinedStoreAndDealsTab:Ljava/lang/Boolean;

.field public useNewBatteryImplementation:Ljava/lang/Boolean;

.field public useNewBatteryImplementationAndroid:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;
    .locals 2

    .line 53
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    if-eqz p1, :cond_0

    .line 54
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;
    .locals 1

    .line 48
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabNavigationEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->tabNavigationEnabled:Ljava/lang/Boolean;

    .line 66
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->preselectAllRecommendedFriends:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->preselectAllRecommendedFriends:Ljava/lang/Boolean;

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->showKicksCenter:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->showKicksCenter:Ljava/lang/Boolean;

    .line 68
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->savingDealsEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->savingDealsEnabled:Ljava/lang/Boolean;

    .line 69
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->maxNumberInvalidEmailLogs:Ljava/lang/Integer;

    if-nez v0, :cond_4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->maxNumberInvalidEmailLogs:Ljava/lang/Integer;

    .line 70
    :cond_4
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->aggregateDealsEnabled:Ljava/lang/Boolean;

    if-nez v0, :cond_5

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->aggregateDealsEnabled:Ljava/lang/Boolean;

    .line 71
    :cond_5
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->useCombinedStoreAndDealsTab:Ljava/lang/Boolean;

    if-nez v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->useCombinedStoreAndDealsTab:Ljava/lang/Boolean;

    .line 72
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->showNewCardLinkingScreen:Ljava/lang/Boolean;

    if-nez v0, :cond_7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->showNewCardLinkingScreen:Ljava/lang/Boolean;

    .line 73
    :cond_7
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->dontUseWalkinButton:Ljava/lang/Boolean;

    if-nez v0, :cond_8

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->dontUseWalkinButton:Ljava/lang/Boolean;

    .line 74
    :cond_8
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->dontUseWalkinButtonIos:Ljava/lang/Boolean;

    if-nez v0, :cond_9

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->dontUseWalkinButtonIos:Ljava/lang/Boolean;

    .line 75
    :cond_9
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableActionButtonAndroid:Ljava/lang/Boolean;

    if-nez v0, :cond_a

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableActionButtonAndroid:Ljava/lang/Boolean;

    .line 76
    :cond_a
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableActionButtonIos:Ljava/lang/Boolean;

    if-nez v0, :cond_b

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableActionButtonIos:Ljava/lang/Boolean;

    .line 77
    :cond_b
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->useNewBatteryImplementation:Ljava/lang/Boolean;

    if-nez v0, :cond_c

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->useNewBatteryImplementation:Ljava/lang/Boolean;

    .line 78
    :cond_c
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->useNewBatteryImplementationAndroid:Ljava/lang/Boolean;

    if-nez v0, :cond_d

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->useNewBatteryImplementationAndroid:Ljava/lang/Boolean;

    .line 79
    :cond_d
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableUltrasonicWalkins:Ljava/lang/Boolean;

    if-nez v0, :cond_e

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableUltrasonicWalkins:Ljava/lang/Boolean;

    .line 80
    :cond_e
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableMicrophonePermission:Ljava/lang/Boolean;

    if-nez v0, :cond_f

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/ClientAppUIFlags;->disableMicrophonePermission:Ljava/lang/Boolean;

    :cond_f
    return-void
.end method
