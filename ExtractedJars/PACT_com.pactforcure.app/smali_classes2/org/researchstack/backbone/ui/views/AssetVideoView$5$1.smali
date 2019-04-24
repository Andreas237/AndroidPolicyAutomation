.class Lorg/researchstack/backbone/ui/views/AssetVideoView$5$1;
.super Ljava/lang/Object;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->onError(Landroid/media/MediaPlayer;II)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/researchstack/backbone/ui/views/AssetVideoView$5;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/views/AssetVideoView$5;)V
    .locals 0
    .param p1, "this$1"    # Lorg/researchstack/backbone/ui/views/AssetVideoView$5;

    .prologue
    .line 476
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5$1;->this$1:Lorg/researchstack/backbone/ui/views/AssetVideoView$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "whichButton"    # I

    .prologue
    .line 482
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5$1;->this$1:Lorg/researchstack/backbone/ui/views/AssetVideoView$5;

    iget-object v0, v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1300(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 484
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5$1;->this$1:Lorg/researchstack/backbone/ui/views/AssetVideoView$5;

    iget-object v0, v0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1300(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnCompletionListener;

    move-result-object v0

    iget-object v1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$5$1;->this$1:Lorg/researchstack/backbone/ui/views/AssetVideoView$5;

    iget-object v1, v1, Lorg/researchstack/backbone/ui/views/AssetVideoView$5;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v1}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$700(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/media/MediaPlayer$OnCompletionListener;->onCompletion(Landroid/media/MediaPlayer;)V

    .line 486
    :cond_0
    return-void
.end method
