.class Lcom/mopub/nativeads/NativeVideoController$ExoPlayerFactory;
.super Ljava/lang/Object;
.source "NativeVideoController.java"


# annotations
.annotation build Lcom/mopub/common/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/NativeVideoController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ExoPlayerFactory"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 467
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newInstance(III)Lcom/google/android/exoplayer/ExoPlayer;
    .locals 0

    .line 469
    invoke-static {p1, p2, p3}, Lcom/google/android/exoplayer/ExoPlayer$Factory;->newInstance(III)Lcom/google/android/exoplayer/ExoPlayer;

    move-result-object p1

    return-object p1
.end method
