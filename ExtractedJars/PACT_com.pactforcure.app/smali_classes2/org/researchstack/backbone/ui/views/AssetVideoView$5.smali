.class Lorg/researchstack/backbone/ui/views/AssetVideoView$5;
.super Ljava/lang/Object;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


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
    .line 437
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaPlayer;II)Z
    .locals 7
    .param p1, "mp"    # Landroid/media/MediaPlayer;
    .param p2, "framework_err"    # I
    .param p3, "impl_err"    # I

    .prologue
    const/4 v6, 0x1

    const/4 v5, -0x1

    .line 440
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1500(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ","

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 441
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2, v5}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$202(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 442
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2, v5}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1202(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 443
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 445
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$800(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/widget/MediaController;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/MediaController;->hide()V

    .line 449
    :cond_0
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1600(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnErrorListener;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1600(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnErrorListener;

    move-result-object v2

    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$700(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer;

    move-result-object v3

    invoke-interface {v2, v3, p2, p3}, Landroid/media/MediaPlayer$OnErrorListener;->onError(Landroid/media/MediaPlayer;II)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 491
    :cond_1
    :goto_0
    return v6

    .line 459
    :cond_2
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 461
    iget-object v2, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 464
    .local v1, "r":Landroid/content/res/Resources;
    const/16 v2, 0xc8

    if-ne p2, v2, :cond_3

    .line 466
    sget v0, Lorg/researchstack/backbone/R$string;->rsb_error_assetvideoview_invalid_progressive_playback:I

    .line 473
    .local v0, "messageId":I
    :goto_1
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-virtual {v3}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    sget v3, Lorg/researchstack/backbone/R$string;->rsb_error_assetvideoview_button:I

    new-instance v4, Lorg/researchstack/backbone/ui/views/AssetVideoView$5$1;

    invoke-direct {v4, p0}, Lorg/researchstack/backbone/ui/views/AssetVideoView$5$1;-><init>(Lorg/researchstack/backbone/ui/views/AssetVideoView$5;)V

    .line 474
    invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    const/4 v3, 0x0

    .line 488
    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    .line 489
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    .line 470
    .end local v0    # "messageId":I
    :cond_3
    sget v0, Lorg/researchstack/backbone/R$string;->rsb_error_assetvideoview_unknown:I

    .restart local v0    # "messageId":I
    goto :goto_1
.end method
