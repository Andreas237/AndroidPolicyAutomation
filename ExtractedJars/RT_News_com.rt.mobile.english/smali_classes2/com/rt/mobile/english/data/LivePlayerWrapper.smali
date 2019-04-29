.class public Lcom/rt/mobile/english/data/LivePlayerWrapper;
.super Ljava/lang/Object;
.source "LivePlayerWrapper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;,
        Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;,
        Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;
    }
.end annotation


# static fields
.field private static final CC_RENDERER_IDX_NOT_FOUND:Ljava/lang/Integer;

.field private static final LATENCY:Ljava/lang/Integer;


# instance fields
.field private ccRendererIdx:Ljava/lang/Integer;

.field private context:Landroid/content/Context;

.field private dnaClient:Lio/streamroot/dna/core/DnaClient;

.field private exoPlayerBandwidthMeter:Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;

.field private hlsUri:Landroid/net/Uri;

.field private listener:Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

.field private player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

.field private playerListener:Lcom/google/android/exoplayer2/Player$EventListener;

.field private playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

.field private streamrootEnabled:Ljava/lang/Boolean;

.field private trackSelector:Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, -0x1

    .line 54
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->CC_RENDERER_IDX_NOT_FOUND:Ljava/lang/Integer;

    const/16 v0, 0x1e

    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->LATENCY:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/ui/PlayerView;Landroid/content/Context;)V
    .locals 1

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    sget-object v0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->CC_RENDERER_IDX_NOT_FOUND:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->ccRendererIdx:Ljava/lang/Integer;

    const/4 v0, 0x0

    .line 69
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->streamrootEnabled:Ljava/lang/Boolean;

    .line 242
    new-instance v0, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;

    invoke-direct {v0, p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper$1;-><init>(Lcom/rt/mobile/english/data/LivePlayerWrapper;)V

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->playerListener:Lcom/google/android/exoplayer2/Player$EventListener;

    .line 76
    iput-object p2, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->context:Landroid/content/Context;

    .line 77
    iput-object p1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    .line 79
    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->buildPlayer()V

    return-void
.end method

.method static synthetic access$100(Lcom/rt/mobile/english/data/LivePlayerWrapper;)Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->listener:Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    return-object p0
.end method

.method static synthetic access$200(Lcom/rt/mobile/english/data/LivePlayerWrapper;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->updateCCInfo()V

    return-void
.end method

.method private buildLoadControl()Lcom/google/android/exoplayer2/LoadControl;
    .locals 5

    .line 191
    new-instance v0, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;-><init>()V

    new-instance v1, Lcom/google/android/exoplayer2/upstream/DefaultAllocator;

    const/4 v2, 0x1

    const/high16 v3, 0x10000

    invoke-direct {v1, v2, v3}, Lcom/google/android/exoplayer2/upstream/DefaultAllocator;-><init>(ZI)V

    .line 192
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->setAllocator(Lcom/google/android/exoplayer2/upstream/DefaultAllocator;)Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;

    move-result-object v0

    sget-object v1, Lcom/rt/mobile/english/data/LivePlayerWrapper;->LATENCY:Ljava/lang/Integer;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/16 v3, 0x3a98

    const v4, 0xc350

    .line 194
    invoke-static {v3, v4, v1, v2}, Lio/streamroot/dna/core/DnaClient;->generateBufferTarget(IILjava/lang/Integer;Ljava/util/concurrent/TimeUnit;)I

    move-result v1

    const/16 v2, 0x1388

    const/16 v4, 0x9c4

    .line 193
    invoke-virtual {v0, v3, v1, v2, v4}, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->setBufferDurationsMs(IIII)Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;

    move-result-object v0

    .line 201
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/DefaultLoadControl$Builder;->createDefaultLoadControl()Lcom/google/android/exoplayer2/DefaultLoadControl;

    move-result-object v0

    return-object v0
.end method

.method private buildMediaSource()Lcom/google/android/exoplayer2/source/MediaSource;
    .locals 3

    .line 216
    new-instance v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    new-instance v1, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    const-string v2, "exo-player"

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->hlsUri:Landroid/net/Uri;

    .line 218
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object v0

    return-object v0
.end method

.method private buildPlayer()V
    .locals 3

    .line 150
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    .line 151
    new-instance v0, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->trackSelector:Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    goto :goto_0

    .line 153
    :cond_0
    new-instance v0, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;-><init>(Lcom/rt/mobile/english/data/LivePlayerWrapper;Lcom/rt/mobile/english/data/LivePlayerWrapper$1;)V

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->exoPlayerBandwidthMeter:Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;

    .line 154
    new-instance v0, Lcom/google/android/exoplayer2/trackselection/AdaptiveTrackSelection$Factory;

    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->exoPlayerBandwidthMeter:Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerBandwidthMeter;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/trackselection/AdaptiveTrackSelection$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/BandwidthMeter;)V

    .line 156
    new-instance v1, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;-><init>(Lcom/google/android/exoplayer2/trackselection/TrackSelection$Factory;)V

    iput-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->trackSelector:Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    :goto_0
    const/4 v0, 0x0

    .line 159
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 160
    new-instance v1, Lcom/google/android/exoplayer2/DefaultRenderersFactory;

    iget-object v2, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->context:Landroid/content/Context;

    .line 161
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v1, v2, v0}, Lcom/google/android/exoplayer2/DefaultRenderersFactory;-><init>(Landroid/content/Context;I)V

    .line 162
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->trackSelector:Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    .line 163
    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->buildLoadControl()Lcom/google/android/exoplayer2/LoadControl;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/google/android/exoplayer2/ExoPlayerFactory;->newSimpleInstance(Lcom/google/android/exoplayer2/RenderersFactory;Lcom/google/android/exoplayer2/trackselection/TrackSelector;Lcom/google/android/exoplayer2/LoadControl;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 164
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->playerListener:Lcom/google/android/exoplayer2/Player$EventListener;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->addListener(Lcom/google/android/exoplayer2/Player$EventListener;)V

    .line 166
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setPlayer(Lcom/google/android/exoplayer2/Player;)V

    return-void
.end method

.method private initStreamroot()V
    .locals 3

    .line 179
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->streamrootEnabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 183
    :cond_0
    invoke-static {}, Lio/streamroot/dna/core/DnaClient;->newBuilder()Lio/streamroot/dna/core/DnaClientBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->context:Landroid/content/Context;

    .line 184
    invoke-interface {v0, v1}, Lio/streamroot/dna/core/DnaClientBuilder;->context(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/InteractorBuilder;

    new-instance v1, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;

    iget-object v2, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-direct {v1, p0, v2}, Lcom/rt/mobile/english/data/LivePlayerWrapper$ExoPlayerInteractor;-><init>(Lcom/rt/mobile/english/data/LivePlayerWrapper;Lcom/google/android/exoplayer2/SimpleExoPlayer;)V

    .line 185
    invoke-interface {v0, v1}, Lio/streamroot/dna/core/InteractorBuilder;->playerInteractor(Lio/streamroot/dna/core/PlayerInteractor;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/streamroot/dna/core/Configure;

    sget-object v1, Lcom/rt/mobile/english/data/LivePlayerWrapper;->LATENCY:Ljava/lang/Integer;

    .line 186
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Lio/streamroot/dna/core/Configure;->latency(I)Lio/streamroot/dna/core/OptionalConfigBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->hlsUri:Landroid/net/Uri;

    .line 187
    invoke-interface {v0, v1}, Lio/streamroot/dna/core/OptionalConfigBuilder;->start(Landroid/net/Uri;)Lio/streamroot/dna/core/DnaClient;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->dnaClient:Lio/streamroot/dna/core/DnaClient;

    return-void
.end method

.method private prepare()V
    .locals 3

    .line 205
    sget-object v0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->CC_RENDERER_IDX_NOT_FOUND:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->ccRendererIdx:Ljava/lang/Integer;

    .line 207
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->streamrootEnabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 208
    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->initStreamroot()V

    .line 209
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    new-instance v1, Lcom/google/android/exoplayer2/source/LoopingMediaSource;

    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->buildMediaSource()Lcom/google/android/exoplayer2/source/MediaSource;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/LoopingMediaSource;-><init>(Lcom/google/android/exoplayer2/source/MediaSource;)V

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->prepare(Lcom/google/android/exoplayer2/source/MediaSource;)V

    goto :goto_0

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->buildMediaSource()Lcom/google/android/exoplayer2/source/MediaSource;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->prepare(Lcom/google/android/exoplayer2/source/MediaSource;)V

    :goto_0
    return-void
.end method

.method private stopStreamroot()V
    .locals 2

    .line 170
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->dnaClient:Lio/streamroot/dna/core/DnaClient;

    if-nez v0, :cond_0

    goto :goto_0

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->dnaClient:Lio/streamroot/dna/core/DnaClient;

    invoke-virtual {v0}, Lio/streamroot/dna/core/DnaClient;->close()V

    const/4 v0, 0x0

    .line 175
    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->dnaClient:Lio/streamroot/dna/core/DnaClient;

    return-void

    :cond_1
    :goto_0
    return-void
.end method

.method private updateCCInfo()V
    .locals 4

    .line 222
    sget-object v0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->CC_RENDERER_IDX_NOT_FOUND:Ljava/lang/Integer;

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->ccRendererIdx:Ljava/lang/Integer;

    .line 224
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->trackSelector:Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;->getCurrentMappedTrackInfo()Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 227
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;->getRendererCount()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 228
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/trackselection/MappingTrackSelector$MappedTrackInfo;->getTrackGroups(I)Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-result-object v2

    .line 229
    iget v2, v2, Lcom/google/android/exoplayer2/source/TrackGroupArray;->length:I

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getRendererType(I)I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    .line 230
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->ccRendererIdx:Ljava/lang/Integer;

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 236
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->listener:Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    if-eqz v0, :cond_2

    .line 237
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->listener:Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    invoke-virtual {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->hasCC()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;->ccUpdated(Ljava/lang/Boolean;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public getHlsUri()Landroid/net/Uri;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->hlsUri:Landroid/net/Uri;

    return-object v0
.end method

.method public getListener()Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->listener:Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    return-object v0
.end method

.method public hasCC()Ljava/lang/Boolean;
    .locals 2

    .line 111
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->ccRendererIdx:Ljava/lang/Integer;

    sget-object v1, Lcom/rt/mobile/english/data/LivePlayerWrapper;->CC_RENDERER_IDX_NOT_FOUND:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public isPlaying()Ljava/lang/Boolean;
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlayWhenReady()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public isStreamrootEnabled()Ljava/lang/Boolean;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->streamrootEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public pause()V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setPlayWhenReady(Z)V

    return-void
.end method

.method public play()V
    .locals 2

    .line 136
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setPlayWhenReady(Z)V

    return-void
.end method

.method public setHlsUri(Landroid/net/Uri;)V
    .locals 1

    const/4 v0, 0x1

    .line 107
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->setHlsUri(Landroid/net/Uri;Ljava/lang/Boolean;)V

    return-void
.end method

.method public setHlsUri(Landroid/net/Uri;Ljava/lang/Boolean;)V
    .locals 1

    .line 97
    iput-object p1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->hlsUri:Landroid/net/Uri;

    .line 99
    sget p1, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v0, 0x13

    if-lt p1, v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->streamrootEnabled:Ljava/lang/Boolean;

    .line 101
    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->stopStreamroot()V

    .line 102
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->pause()V

    .line 103
    invoke-direct {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->prepare()V

    return-void
.end method

.method public setListener(Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->listener:Lcom/rt/mobile/english/data/LivePlayerWrapper$Listener;

    return-void
.end method

.method public showSelectCCDiag(Ljava/lang/String;Landroid/app/Activity;)V
    .locals 2

    .line 121
    invoke-virtual {p0}, Lcom/rt/mobile/english/data/LivePlayerWrapper;->hasCC()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 124
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->trackSelector:Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->ccRendererIdx:Ljava/lang/Integer;

    .line 125
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p2, p1, v0, v1}, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->getDialog(Landroid/app/Activity;Ljava/lang/CharSequence;Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;I)Landroid/util/Pair;

    move-result-object p1

    .line 126
    iget-object p2, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Lcom/google/android/exoplayer2/ui/TrackSelectionView;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->setShowDisableOption(Z)V

    .line 127
    iget-object p2, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p2, Lcom/google/android/exoplayer2/ui/TrackSelectionView;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/ui/TrackSelectionView;->setAllowAdaptiveSelections(Z)V

    .line 128
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->show()V

    return-void
.end method

.method public toggle()V
    .locals 2

    .line 144
    iget-object v0, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    iget-object v1, p0, Lcom/rt/mobile/english/data/LivePlayerWrapper;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlayWhenReady()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setPlayWhenReady(Z)V

    return-void
.end method
