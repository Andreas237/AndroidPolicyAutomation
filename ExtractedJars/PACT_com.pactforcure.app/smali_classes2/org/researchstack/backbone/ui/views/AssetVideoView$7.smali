.class Lorg/researchstack/backbone/ui/views/AssetVideoView$7;
.super Ljava/lang/Object;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;


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
    .line 548
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 6
    .param p1, "holder"    # Landroid/view/SurfaceHolder;
    .param p2, "format"    # I
    .param p3, "w"    # I
    .param p4, "h"    # I

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 551
    iget-object v4, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v4, p3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1002(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 552
    iget-object v4, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v4, p4}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1102(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 553
    iget-object v4, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v4}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1200(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v4

    const/4 v5, 0x3

    if-ne v4, v5, :cond_2

    move v1, v2

    .line 554
    .local v1, "isValidState":Z
    :goto_0
    iget-object v4, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v4}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v4

    if-ne v4, p3, :cond_3

    iget-object v4, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v4}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v4

    if-ne v4, p4, :cond_3

    move v0, v2

    .line 555
    .local v0, "hasValidSize":Z
    :goto_1
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$700(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer;

    move-result-object v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 557
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$900(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v2

    if-eqz v2, :cond_0

    .line 559
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$900(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v3

    invoke-virtual {v2, v3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->seekTo(I)V

    .line 561
    :cond_0
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->start()V

    .line 563
    :cond_1
    return-void

    .end local v0    # "hasValidSize":Z
    .end local v1    # "isValidState":Z
    :cond_2
    move v1, v3

    .line 553
    goto :goto_0

    .restart local v1    # "isValidState":Z
    :cond_3
    move v0, v3

    .line 554
    goto :goto_1
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 1
    .param p1, "holder"    # Landroid/view/SurfaceHolder;

    .prologue
    .line 567
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1802(Lorg/researchstack/backbone/ui/views/AssetVideoView;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;

    .line 568
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1900(Lorg/researchstack/backbone/ui/views/AssetVideoView;)V

    .line 569
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 2
    .param p1, "holder"    # Landroid/view/SurfaceHolder;

    .prologue
    .line 574
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1802(Lorg/researchstack/backbone/ui/views/AssetVideoView;Landroid/view/SurfaceHolder;)Landroid/view/SurfaceHolder;

    .line 575
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 577
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/MediaController;->hide()V

    .line 579
    :cond_0
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$7;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$2000(Lorg/researchstack/backbone/ui/views/AssetVideoView;Z)V

    .line 580
    return-void
.end method
