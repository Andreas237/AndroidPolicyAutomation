.class public Lcom/rt/mobile/english/ui/widget/ChromeCast;
.super Ljava/lang/Object;
.source "ChromeCast.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;
    }
.end annotation


# static fields
.field public static final APP_ID:Ljava/lang/String; = "CC1AD845"

.field public static final NAMESPACE:Ljava/lang/String; = "urn:x-cast:com.rt.mobile.english"


# instance fields
.field public apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

.field public applicationStarted:Z

.field private final castClientListener:Lcom/google/android/gms/cast/Cast$Listener;

.field private final connectionCallback:Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

.field private final connectionFailedListener:Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

.field private final connectionResultCallback:Lcom/google/android/gms/common/api/ResultCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/ResultCallback<",
            "Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;",
            ">;"
        }
    .end annotation
.end field

.field private listener:Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;

.field public mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

.field private mainActivity:Landroid/app/Activity;

.field private mediaRouteSelector:Landroid/support/v7/media/MediaRouteSelector;

.field private mediaRouter:Landroid/support/v7/media/MediaRouter;

.field private final mediaRouterCallback:Landroid/support/v7/media/MediaRouter$Callback;

.field public selectedDevice:Lcom/google/android/gms/cast/CastDevice;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    new-instance v0, Lcom/rt/mobile/english/ui/widget/ChromeCast$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$1;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouterCallback:Landroid/support/v7/media/MediaRouter$Callback;

    .line 148
    new-instance v0, Lcom/rt/mobile/english/ui/widget/ChromeCast$2;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$2;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->connectionFailedListener:Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    .line 155
    new-instance v0, Lcom/rt/mobile/english/ui/widget/ChromeCast$3;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$3;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->connectionCallback:Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    .line 215
    new-instance v0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$4;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->connectionResultCallback:Lcom/google/android/gms/common/api/ResultCallback;

    .line 252
    new-instance v0, Lcom/rt/mobile/english/ui/widget/ChromeCast$5;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$5;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->castClientListener:Lcom/google/android/gms/cast/Cast$Listener;

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/widget/ChromeCast;Lcom/google/android/gms/cast/CastDevice;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->setSelectedDevice(Lcom/google/android/gms/cast/CastDevice;)V

    return-void
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/ui/widget/ChromeCast;)Lcom/google/android/gms/common/api/ResultCallback;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->connectionResultCallback:Lcom/google/android/gms/common/api/ResultCallback;

    return-object p0
.end method

.method static synthetic access$200(Lcom/rt/mobile/english/ui/widget/ChromeCast;)Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->listener:Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;

    return-object p0
.end method

.method private connectApiClient()V
    .locals 3

    .line 139
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->selectedDevice:Lcom/google/android/gms/cast/CastDevice;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->castClientListener:Lcom/google/android/gms/cast/Cast$Listener;

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/Cast$CastOptions;->builder(Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/cast/Cast$Listener;)Lcom/google/android/gms/cast/Cast$CastOptions$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/Cast$CastOptions$Builder;->build()Lcom/google/android/gms/cast/Cast$CastOptions;

    move-result-object v0

    .line 140
    new-instance v1, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mainActivity:Landroid/app/Activity;

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;-><init>(Landroid/content/Context;)V

    sget-object v2, Lcom/google/android/gms/cast/Cast;->API:Lcom/google/android/gms/common/api/Api;

    .line 141
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addApi(Lcom/google/android/gms/common/api/Api;Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->connectionCallback:Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;

    .line 142
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addConnectionCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->connectionFailedListener:Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;

    .line 143
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->addOnConnectionFailedListener(Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;)Lcom/google/android/gms/common/api/GoogleApiClient$Builder;

    move-result-object v0

    .line 144
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient$Builder;->build()Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 145
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->connect()V

    return-void
.end method

.method private disconnectApiClient()V
    .locals 1

    .line 346
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 348
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->disconnect()V

    const/4 v0, 0x0

    .line 349
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v0, 0x0

    .line 350
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->applicationStarted:Z

    .line 351
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->listener:Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;->onChromecastDisconnect()V

    :cond_0
    return-void
.end method

.method private setSelectedDevice(Lcom/google/android/gms/cast/CastDevice;)V
    .locals 1

    .line 110
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->selectedDevice:Lcom/google/android/gms/cast/CastDevice;

    .line 112
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->selectedDevice:Lcom/google/android/gms/cast/CastDevice;

    if-eqz p1, :cond_0

    .line 116
    :try_start_0
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->stopApplication()V

    .line 117
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->disconnectApiClient()V

    .line 118
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->connectApiClient()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 122
    :catch_0
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->disconnectApiClient()V

    goto :goto_0

    .line 127
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz p1, :cond_1

    .line 129
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->disconnectApiClient()V

    .line 133
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouter:Landroid/support/v7/media/MediaRouter;

    invoke-virtual {v0}, Landroid/support/v7/media/MediaRouter;->getDefaultRoute()Landroid/support/v7/media/MediaRouter$RouteInfo;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/support/v7/media/MediaRouter;->selectRoute(Landroid/support/v7/media/MediaRouter$RouteInfo;)V

    :goto_0
    return-void
.end method

.method private stopApplication()V
    .locals 2

    .line 357
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-nez v0, :cond_0

    return-void

    .line 359
    :cond_0
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->applicationStarted:Z

    if-eqz v0, :cond_1

    .line 361
    sget-object v0, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0, v1}, Lcom/google/android/gms/cast/Cast$CastApi;->stopApplication(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    const/4 v0, 0x0

    .line 362
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->applicationStarted:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public ChromecastListener(Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->listener:Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;

    return-void
.end method

.method public Initialize(Landroid/app/Activity;Landroid/support/v7/widget/Toolbar;Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;)V
    .locals 2

    .line 65
    iput-object p3, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->listener:Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;

    .line 67
    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mainActivity:Landroid/app/Activity;

    if-nez p3, :cond_0

    .line 68
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mainActivity:Landroid/app/Activity;

    .line 71
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/support/v7/media/MediaRouter;->getInstance(Landroid/content/Context;)Landroid/support/v7/media/MediaRouter;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouter:Landroid/support/v7/media/MediaRouter;

    .line 72
    new-instance p1, Landroid/support/v7/media/MediaRouteSelector$Builder;

    invoke-direct {p1}, Landroid/support/v7/media/MediaRouteSelector$Builder;-><init>()V

    const-string p3, "CC1AD845"

    invoke-static {p3}, Lcom/google/android/gms/cast/CastMediaControlIntent;->categoryForCast(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/support/v7/media/MediaRouteSelector$Builder;->addControlCategory(Ljava/lang/String;)Landroid/support/v7/media/MediaRouteSelector$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/support/v7/media/MediaRouteSelector$Builder;->build()Landroid/support/v7/media/MediaRouteSelector;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouteSelector:Landroid/support/v7/media/MediaRouteSelector;

    .line 74
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouter:Landroid/support/v7/media/MediaRouter;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouteSelector:Landroid/support/v7/media/MediaRouteSelector;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouterCallback:Landroid/support/v7/media/MediaRouter$Callback;

    const/4 v1, 0x1

    invoke-virtual {p1, p3, v0, v1}, Landroid/support/v7/media/MediaRouter;->addCallback(Landroid/support/v7/media/MediaRouteSelector;Landroid/support/v7/media/MediaRouter$Callback;I)V

    const p1, 0x7f0d0001

    .line 76
    invoke-virtual {p2, p1}, Landroid/support/v7/widget/Toolbar;->inflateMenu(I)V

    .line 77
    invoke-virtual {p2}, Landroid/support/v7/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p1

    const p2, 0x7f0900dc

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 78
    invoke-static {p1}, Landroid/support/v4/view/MenuItemCompat;->getActionProvider(Landroid/view/MenuItem;)Landroid/support/v4/view/ActionProvider;

    move-result-object p1

    check-cast p1, Landroid/support/v7/app/MediaRouteActionProvider;

    .line 79
    iget-object p2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouteSelector:Landroid/support/v7/media/MediaRouteSelector;

    invoke-virtual {p1, p2}, Landroid/support/v7/app/MediaRouteActionProvider;->setRouteSelector(Landroid/support/v7/media/MediaRouteSelector;)V

    return-void
.end method

.method public isPlaying()Z
    .locals 2

    .line 180
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 181
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->getMediaStatus()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->getPlayerState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onStop()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouter:Landroid/support/v7/media/MediaRouter;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mediaRouterCallback:Landroid/support/v7/media/MediaRouter$Callback;

    invoke-virtual {v0, v1}, Landroid/support/v7/media/MediaRouter;->removeCallback(Landroid/support/v7/media/MediaRouter$Callback;)V

    return-void
.end method

.method public pause()V
    .locals 2

    .line 189
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 191
    :try_start_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->pause(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 193
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v0, 0x0

    .line 194
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->applicationStarted:Z

    .line 195
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->listener:Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;->onChromecastDisconnect()V

    :cond_0
    :goto_0
    return-void
.end method

.method public play()V
    .locals 2

    .line 202
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    if-eqz v0, :cond_0

    .line 204
    :try_start_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->play(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 206
    iput-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    const/4 v0, 0x0

    .line 207
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->applicationStarted:Z

    .line 208
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->listener:Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;

    invoke-interface {v0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$Listener;->onChromecastDisconnect()V

    :cond_0
    :goto_0
    return-void
.end method

.method public playVideo(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 4

    .line 279
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->applicationStarted:Z

    if-eqz v0, :cond_1

    .line 280
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    if-eqz v0, :cond_0

    .line 281
    new-instance v0, Lcom/google/android/gms/cast/MediaMetadata;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/MediaMetadata;-><init>(I)V

    const-string v2, "com.google.android.gms.cast.metadata.TITLE"

    .line 282
    invoke-virtual {v0, v2, p2}, Lcom/google/android/gms/cast/MediaMetadata;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 283
    new-instance v2, Lcom/google/android/gms/cast/MediaInfo$Builder;

    invoke-direct {v2, p1}, Lcom/google/android/gms/cast/MediaInfo$Builder;-><init>(Ljava/lang/String;)V

    const-string v3, "video/mp4"

    .line 284
    invoke-virtual {v2, v3}, Lcom/google/android/gms/cast/MediaInfo$Builder;->setContentType(Ljava/lang/String;)Lcom/google/android/gms/cast/MediaInfo$Builder;

    move-result-object v2

    .line 285
    invoke-virtual {v2, p3}, Lcom/google/android/gms/cast/MediaInfo$Builder;->setStreamType(I)Lcom/google/android/gms/cast/MediaInfo$Builder;

    move-result-object v2

    .line 286
    invoke-virtual {v2, v0}, Lcom/google/android/gms/cast/MediaInfo$Builder;->setMetadata(Lcom/google/android/gms/cast/MediaMetadata;)Lcom/google/android/gms/cast/MediaInfo$Builder;

    move-result-object v0

    .line 287
    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaInfo$Builder;->build()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    .line 288
    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    iget-object v3, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v2, v3, v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->load(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/cast/MediaInfo;Z)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/rt/mobile/english/ui/widget/ChromeCast$6;

    invoke-direct {v1, p0}, Lcom/rt/mobile/english/ui/widget/ChromeCast$6;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V

    .line 289
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    .line 301
    :cond_0
    :try_start_0
    sget-object v0, Lcom/google/android/gms/cast/Cast;->CastApi:Lcom/google/android/gms/cast/Cast$CastApi;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->getNamespace()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    invoke-interface {v0, v1, v2, v3}, Lcom/google/android/gms/cast/Cast$CastApi;->setMessageReceivedCallbacks(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lcom/google/android/gms/cast/Cast$MessageReceivedCallback;)V

    .line 302
    iget-object v0, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->mRemoteMediaPlayer:Lcom/google/android/gms/cast/RemoteMediaPlayer;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast;->apiClient:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 303
    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/RemoteMediaPlayer;->requestStatus(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v0

    new-instance v1, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/rt/mobile/english/ui/widget/ChromeCast$7;-><init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;Ljava/lang/String;Ljava/lang/String;I)V

    .line 304
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 339
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Exception while creating channel"

    invoke-static {p2, p3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    return-void
.end method
