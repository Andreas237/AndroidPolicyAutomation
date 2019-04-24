.class Lorg/researchstack/backbone/ui/views/AssetVideoView$4;
.super Ljava/lang/Object;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnInfoListener;


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
    .line 425
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$4;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 1
    .param p1, "mp"    # Landroid/media/MediaPlayer;
    .param p2, "arg1"    # I
    .param p3, "arg2"    # I

    .prologue
    .line 428
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$4;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1400(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnInfoListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 430
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$4;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1400(Lorg/researchstack/backbone/ui/views/AssetVideoView;)Landroid/media/MediaPlayer$OnInfoListener;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/media/MediaPlayer$OnInfoListener;->onInfo(Landroid/media/MediaPlayer;II)Z

    .line 432
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
