.class Lorg/researchstack/backbone/ui/views/AssetVideoView$3;
.super Ljava/lang/Object;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


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
    .line 408
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2
    .param p1, "mp"    # Landroid/media/MediaPlayer;

    .prologue
    const/4 v1, 0x5

    .line 411
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0, v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$202(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 412
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0, v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1202(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 413
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    .line 417
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1300(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 419
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1300(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$3;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$700(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 421
    :cond_1
    return-void
.end method
