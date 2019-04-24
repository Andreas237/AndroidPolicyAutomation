.class Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;
.super Ljava/lang/Object;
.source "LaunchActivity.java"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->loadVideo()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    .line 269
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)V

    .line 271
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    const/high16 p3, 0x7f100000

    invoke-static {p2, p3}, Landroid/media/MediaPlayer;->create(Landroid/content/Context;I)Landroid/media/MediaPlayer;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->access$102(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;Landroid/media/MediaPlayer;)Landroid/media/MediaPlayer;

    .line 272
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)Landroid/media/MediaPlayer;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 273
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)Landroid/media/MediaPlayer;

    move-result-object p2

    new-instance p3, Landroid/view/Surface;

    invoke-direct {p3, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {p2, p3}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    .line 274
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)Landroid/media/MediaPlayer;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setLooping(Z)V

    .line 275
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)Landroid/media/MediaPlayer;

    move-result-object p1

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setVideoScalingMode(I)V

    .line 276
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;

    invoke-static {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;->access$100(Lcom/ibotta/android/mvp/ui/activity/launch/LaunchActivity;)Landroid/media/MediaPlayer;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$jX_tASEdjv03obJy5rjdfXVUzvw;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/launch/-$$Lambda$jX_tASEdjv03obJy5rjdfXVUzvw;

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    goto :goto_0

    :cond_0
    const-string p1, "MediaPlayer.create() returned null. Could not initialize MediaPlayer!"

    const/4 p2, 0x0

    .line 278
    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ltimber/log/Timber;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method
