.class public final Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;
.super Landroid/app/Activity;
.source "ExoPlayerActivityJava.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

.field private static final EXTRA_TITLE:Ljava/lang/String; = "title"

.field private static final EXTRA_URL:Ljava/lang/String; = "url"


# instance fields
.field private backImageView:Landroid/widget/ImageView;

.field private currentWindow:I

.field private playWhenReady:Z

.field private playbackPosition:J

.field private player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

.field private playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

.field private title:Ljava/lang/String;

.field private titleView:Landroid/widget/TextView;

.field private videoURL:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    new-instance v0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;-><init>()V

    sput-object v0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x1

    .line 60
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->playWhenReady:Z

    return-void
.end method

.method private buildMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/MediaSource;
    .locals 5

    const-string v0, "exoplayer-codelab"

    .line 160
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mp3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mp4"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 166
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    const-string v2, "m3u8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 168
    new-instance v1, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    new-instance v2, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    invoke-direct {v2, v0}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 170
    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object p1

    return-object p1

    .line 174
    :cond_1
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/DefaultDashChunkSource$Factory;

    new-instance v2, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    const-string v3, "ua"

    sget-object v4, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    invoke-direct {v2, v3, v4}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/TransferListener;)V

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/dash/DefaultDashChunkSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 176
    new-instance v2, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    invoke-direct {v2, v0}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;)V

    .line 178
    new-instance v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/DashChunkSource$Factory;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 180
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    move-result-object p1

    return-object p1

    .line 162
    :cond_2
    :goto_0
    new-instance v1, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;

    new-instance v2, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    invoke-direct {v2, v0}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 164
    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/ExtractorMediaSource;

    move-result-object p1

    return-object p1
.end method

.method private initializePlayer()V
    .locals 4

    .line 134
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_0

    .line 135
    new-instance v0, Lcom/google/android/exoplayer2/DefaultRenderersFactory;

    invoke-direct {v0, p0}, Lcom/google/android/exoplayer2/DefaultRenderersFactory;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;-><init>()V

    new-instance v2, Lcom/google/android/exoplayer2/DefaultLoadControl;

    invoke-direct {v2}, Lcom/google/android/exoplayer2/DefaultLoadControl;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/ExoPlayerFactory;->newSimpleInstance(Lcom/google/android/exoplayer2/RenderersFactory;Lcom/google/android/exoplayer2/trackselection/TrackSelector;Lcom/google/android/exoplayer2/LoadControl;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 139
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setPlayer(Lcom/google/android/exoplayer2/Player;)V

    .line 140
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    iget-boolean v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->playWhenReady:Z

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setPlayWhenReady(Z)V

    .line 141
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    iget v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->currentWindow:I

    iget-wide v2, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->playbackPosition:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->seekTo(IJ)V

    .line 143
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->videoURL:Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->buildMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/MediaSource;

    move-result-object v0

    .line 144
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->prepare(Lcom/google/android/exoplayer2/source/MediaSource;ZZ)V

    return-void
.end method

.method private releasePlayer()V
    .locals 2

    .line 148
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentPosition()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->playbackPosition:J

    .line 150
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentWindowIndex()I

    move-result v0

    iput v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->currentWindow:I

    .line 151
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlayWhenReady()Z

    move-result v0

    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->playWhenReady:Z

    .line 152
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->release()V

    const/4 v0, 0x0

    .line 153
    iput-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    :cond_0
    return-void
.end method

.method public static run(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 41
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "url"

    .line 42
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    if-eqz p2, :cond_0

    const-string p1, "title"

    .line 44
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 45
    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 125
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f09002c

    if-ne p1, v0, :cond_0

    .line 126
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->finish()V

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 69
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 71
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->requestWindowFeature(I)Z

    .line 72
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    const/4 p1, 0x0

    .line 73
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->setRequestedOrientation(I)V

    .line 74
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x1002

    .line 75
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    const p1, 0x7f0c001f

    .line 77
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->setContentView(I)V

    .line 79
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "url"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->videoURL:Ljava/lang/String;

    .line 80
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "title"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->title:Ljava/lang/String;

    const p1, 0x7f09002c

    .line 82
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->backImageView:Landroid/widget/ImageView;

    .line 83
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->backImageView:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f090124

    .line 84
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/exoplayer2/ui/PlayerView;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    const p1, 0x7f090191

    .line 85
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->titleView:Landroid/widget/TextView;

    .line 86
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->titleView:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    .line 107
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 108
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    .line 109
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->releasePlayer()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 99
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 100
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_1

    .line 101
    :cond_0
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->initializePlayer()V

    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 91
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 92
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 93
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->initializePlayer()V

    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 115
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 116
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 117
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivityJava;->releasePlayer()V

    :cond_0
    return-void
.end method
