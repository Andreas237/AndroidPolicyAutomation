.class Lorg/researchstack/backbone/ui/views/AssetVideoView$1;
.super Ljava/lang/Object;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/researchstack/backbone/ui/views/AssetVideoView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V
    .locals 0
    .param p1, "this$0"    # Lorg/researchstack/backbone/ui/views/AssetVideoView;

    .prologue
    .line 333
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 3
    .param p1, "mp"    # Landroid/media/MediaPlayer;
    .param p2, "width"    # I
    .param p3, "height"    # I

    .prologue
    .line 336
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v1

    invoke-static {v0, v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$002(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 337
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v1

    invoke-static {v0, v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$102(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 338
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 341
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$1;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->requestLayout()V

    .line 343
    :cond_0
    return-void
.end method
