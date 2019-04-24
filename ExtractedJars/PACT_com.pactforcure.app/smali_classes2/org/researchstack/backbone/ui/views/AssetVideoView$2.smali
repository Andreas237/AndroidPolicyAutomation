.class Lorg/researchstack/backbone/ui/views/AssetVideoView$2;
.super Ljava/lang/Object;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


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
    .line 347
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 6
    .param p1, "mp"    # Landroid/media/MediaPlayer;

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x1

    .line 350
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    const/4 v2, 0x2

    invoke-static {v1, v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$202(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 353
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v3, v4}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$502(Lorg/researchstack/backbone/ui/views/AssetVideoView;Z)Z

    move-result v3

    invoke-static {v2, v3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$402(Lorg/researchstack/backbone/ui/views/AssetVideoView;Z)Z

    move-result v2

    invoke-static {v1, v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$302(Lorg/researchstack/backbone/ui/views/AssetVideoView;Z)Z

    .line 355
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$600(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnPreparedListener;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 357
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$600(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnPreparedListener;

    move-result-object v1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$700(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer;

    move-result-object v2

    invoke-interface {v1, v2}, Landroid/media/MediaPlayer$OnPreparedListener;->onPrepared(Landroid/media/MediaPlayer;)V

    .line 359
    :cond_0
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 361
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/widget/MediaController;->setEnabled(Z)V

    .line 363
    :cond_1
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v2

    invoke-static {v1, v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$002(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 364
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v2

    invoke-static {v1, v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$102(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 366
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$900(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v0

    .line 367
    .local v0, "seekToPosition":I
    if-eqz v0, :cond_2

    .line 369
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v1, v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->seekTo(I)V

    .line 371
    :cond_2
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v1

    if-eqz v1, :cond_6

    .line 374
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v3

    invoke-interface {v1, v2, v3}, Landroid/view/SurfaceHolder;->setFixedSize(II)V

    .line 375
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$000(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v2

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v1

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$100(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v2

    if-ne v1, v2, :cond_3

    .line 380
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1200(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v1

    if-ne v1, v5, :cond_4

    .line 382
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->start()V

    .line 383
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 385
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/MediaController;->show()V

    .line 404
    :cond_3
    :goto_0
    return-void

    .line 388
    :cond_4
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->isPlaying()Z

    move-result v1

    if-nez v1, :cond_3

    if-nez v0, :cond_5

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getCurrentPosition()I

    move-result v1

    if-lez v1, :cond_3

    :cond_5
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 391
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/MediaController;->show(I)V

    goto :goto_0

    .line 399
    :cond_6
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1200(Lorg/researchstack/backbone/ui/views/AssetVideoView;)I

    move-result v1

    if-ne v1, v5, :cond_3

    .line 401
    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$2;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->start()V

    goto :goto_0
.end method
