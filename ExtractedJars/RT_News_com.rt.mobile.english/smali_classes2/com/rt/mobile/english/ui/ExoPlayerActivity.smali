.class public Lcom/rt/mobile/english/ui/ExoPlayerActivity;
.super Landroid/app/Activity;
.source "ExoPlayerActivity.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nExoPlayerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExoPlayerActivity.kt\ncom/rt/mobile/english/ui/ExoPlayerActivity\n*L\n1#1,177:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0008\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001a2\u0008\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u0008\u0010!\u001a\u00020\u001aH\u0014J\u0008\u0010\"\u001a\u00020\u001aH\u0014J\u0008\u0010#\u001a\u00020\u001aH\u0014J\u0008\u0010$\u001a\u00020\u001aH\u0014J\u0008\u0010%\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/rt/mobile/english/ui/ExoPlayerActivity;",
        "Landroid/app/Activity;",
        "Landroid/view/View$OnClickListener;",
        "()V",
        "backButton",
        "Landroid/widget/ImageView;",
        "currentWindow",
        "",
        "playWhenReady",
        "",
        "playbackPosition",
        "",
        "player",
        "Lcom/google/android/exoplayer2/SimpleExoPlayer;",
        "playerView",
        "Lcom/google/android/exoplayer2/ui/PlayerView;",
        "title",
        "",
        "titleView",
        "Landroid/widget/TextView;",
        "videoURL",
        "buildMediaSource",
        "Lcom/google/android/exoplayer2/source/MediaSource;",
        "uri",
        "Landroid/net/Uri;",
        "initializePlayer",
        "",
        "onClick",
        "v",
        "Landroid/view/View;",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onPause",
        "onResume",
        "onStart",
        "onStop",
        "releasePlayer",
        "Companion",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field private static final BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

.field public static final Companion:Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;

.field private static final EXTRA_TITLE:Ljava/lang/String; = "title"

.field private static final EXTRA_URL:Ljava/lang/String; = "url"


# instance fields
.field private _$_findViewCache:Ljava/util/HashMap;

.field private backButton:Landroid/widget/ImageView;

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
    .locals 2

    new-instance v0, Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->Companion:Lcom/rt/mobile/english/ui/ExoPlayerActivity$Companion;

    .line 35
    new-instance v0, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    invoke-direct {v0}, Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;-><init>()V

    sput-object v0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/4 v0, 0x1

    .line 58
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->playWhenReady:Z

    return-void
.end method

.method private final buildMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/MediaSource;
    .locals 7

    const-string v0, "exoplayer-codelab"

    .line 155
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    .line 157
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "mp3"

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    const-string v6, "mp4"

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v1, v6, v5, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    if-eqz v2, :cond_0

    .line 159
    new-instance v1, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;

    new-instance v2, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    invoke-direct {v2, v0}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;)V

    check-cast v2, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 160
    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/source/ExtractorMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/ExtractorMediaSource;

    move-result-object p1

    const-string v0, "ExtractorMediaSource\n   \u2026  .createMediaSource(uri)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/exoplayer2/source/MediaSource;

    return-object p1

    :cond_0
    const-string v2, "m3u8"

    .line 161
    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2, v5, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 163
    new-instance v1, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;

    new-instance v2, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    invoke-direct {v2, v0}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;)V

    check-cast v2, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 164
    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;

    move-result-object p1

    const-string v0, "HlsMediaSource\n         \u2026  .createMediaSource(uri)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/exoplayer2/source/MediaSource;

    return-object p1

    .line 168
    :cond_1
    new-instance v1, Lcom/google/android/exoplayer2/source/dash/DefaultDashChunkSource$Factory;

    new-instance v2, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    const-string v3, "ua"

    sget-object v4, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->BANDWIDTH_METER:Lcom/google/android/exoplayer2/upstream/DefaultBandwidthMeter;

    check-cast v4, Lcom/google/android/exoplayer2/upstream/TransferListener;

    invoke-direct {v2, v3, v4}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;Lcom/google/android/exoplayer2/upstream/TransferListener;)V

    check-cast v2, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-direct {v1, v2}, Lcom/google/android/exoplayer2/source/dash/DefaultDashChunkSource$Factory;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 169
    new-instance v2, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;

    invoke-direct {v2, v0}, Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSourceFactory;-><init>(Ljava/lang/String;)V

    .line 172
    new-instance v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;

    check-cast v1, Lcom/google/android/exoplayer2/source/dash/DashChunkSource$Factory;

    check-cast v2, Lcom/google/android/exoplayer2/upstream/DataSource$Factory;

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/DashChunkSource$Factory;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V

    .line 173
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->createMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    move-result-object p1

    const-string v0, "DashMediaSource\n        \u2026  .createMediaSource(uri)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/exoplayer2/source/MediaSource;

    return-object p1
.end method

.method private final initializePlayer()V
    .locals 4

    .line 128
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_3

    .line 130
    new-instance v0, Lcom/google/android/exoplayer2/DefaultRenderersFactory;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/DefaultRenderersFactory;-><init>(Landroid/content/Context;)V

    check-cast v0, Lcom/google/android/exoplayer2/RenderersFactory;

    .line 131
    new-instance v1, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/trackselection/DefaultTrackSelector;-><init>()V

    check-cast v1, Lcom/google/android/exoplayer2/trackselection/TrackSelector;

    .line 132
    new-instance v2, Lcom/google/android/exoplayer2/DefaultLoadControl;

    invoke-direct {v2}, Lcom/google/android/exoplayer2/DefaultLoadControl;-><init>()V

    check-cast v2, Lcom/google/android/exoplayer2/LoadControl;

    .line 129
    invoke-static {v0, v1, v2}, Lcom/google/android/exoplayer2/ExoPlayerFactory;->newSimpleInstance(Lcom/google/android/exoplayer2/RenderersFactory;Lcom/google/android/exoplayer2/trackselection/TrackSelector;Lcom/google/android/exoplayer2/LoadControl;)Lcom/google/android/exoplayer2/SimpleExoPlayer;

    move-result-object v0

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    .line 133
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    iget-boolean v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->playWhenReady:Z

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->setPlayWhenReady(Z)V

    .line 134
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    if-nez v0, :cond_1

    const-string v1, "playerView"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    check-cast v1, Lcom/google/android/exoplayer2/Player;

    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/ui/PlayerView;->setPlayer(Lcom/google/android/exoplayer2/Player;)V

    .line 135
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    iget v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->currentWindow:I

    iget-wide v2, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->playbackPosition:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->seekTo(IJ)V

    .line 137
    :cond_3
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->videoURL:Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v1, "videoURL"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_4
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "Uri.parse(videoURL)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->buildMediaSource(Landroid/net/Uri;)Lcom/google/android/exoplayer2/source/MediaSource;

    move-result-object v0

    .line 138
    iget-object v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v1, :cond_5

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_5
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->prepare(Lcom/google/android/exoplayer2/source/MediaSource;ZZ)V

    return-void
.end method

.method private final releasePlayer()V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_0

    return-void

    .line 145
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentPosition()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->playbackPosition:J

    .line 146
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getCurrentWindowIndex()I

    move-result v0

    iput v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->currentWindow:I

    .line 147
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_3

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->getPlayWhenReady()Z

    move-result v0

    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->playWhenReady:Z

    .line 149
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v0, :cond_4

    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_4
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->release()V

    const/4 v0, 0x0

    .line 150
    check-cast v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->_$_findViewCache:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-nez p1, :cond_0

    .line 120
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v0, 0x7f09002c

    if-eq p1, v0, :cond_1

    goto :goto_0

    .line 121
    :cond_1
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->finish()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 64
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    .line 66
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->requestWindowFeature(I)Z

    .line 67
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x400

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    const/4 p1, 0x0

    .line 69
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->setRequestedOrientation(I)V

    .line 70
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const-string v0, "window"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const-string v0, "window.decorView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1002

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    const p1, 0x7f0c001f

    .line 73
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->setContentView(I)V

    .line 75
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "title"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->title:Ljava/lang/String;

    .line 76
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "url"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "intent.getStringExtra(EXTRA_URL)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->videoURL:Ljava/lang/String;

    const p1, 0x7f09002c

    .line 78
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(R.id.back)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->backButton:Landroid/widget/ImageView;

    .line 79
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->backButton:Landroid/widget/ImageView;

    if-nez p1, :cond_0

    const-string v0, "backButton"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    move-object v0, p0

    check-cast v0, Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f090124

    .line 80
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(R.id.player_view)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/google/android/exoplayer2/ui/PlayerView;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->playerView:Lcom/google/android/exoplayer2/ui/PlayerView;

    const p1, 0x7f090191

    .line 81
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string v0, "findViewById(R.id.title)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->titleView:Landroid/widget/TextView;

    .line 82
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->title:Ljava/lang/String;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->titleView:Landroid/widget/TextView;

    if-nez v0, :cond_1

    const-string v1, "titleView"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 102
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 104
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    .line 105
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->releasePlayer()V

    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 4

    .line 94
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 96
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x17

    if-gt v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->player:Lcom/google/android/exoplayer2/SimpleExoPlayer;

    if-nez v3, :cond_1

    move v1, v2

    :cond_1
    or-int/2addr v0, v1

    if-eqz v0, :cond_2

    .line 97
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->initializePlayer()V

    :cond_2
    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 86
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 88
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 89
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->initializePlayer()V

    :cond_0
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 110
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 112
    sget v0, Lcom/google/android/exoplayer2/util/Util;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 113
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/ExoPlayerActivity;->releasePlayer()V

    :cond_0
    return-void
.end method
