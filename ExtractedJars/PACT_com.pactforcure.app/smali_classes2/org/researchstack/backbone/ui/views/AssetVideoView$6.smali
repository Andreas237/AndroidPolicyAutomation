.class Lorg/researchstack/backbone/ui/views/AssetVideoView$6;
.super Ljava/lang/Object;
.source "AssetVideoView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnBufferingUpdateListener;


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
    .line 496
    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$6;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBufferingUpdate(Landroid/media/MediaPlayer;I)V
    .locals 1
    .param p1, "mp"    # Landroid/media/MediaPlayer;
    .param p2, "percent"    # I

    .prologue
    .line 499
    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/AssetVideoView$6;->this$0:Lorg/researchstack/backbone/ui/views/AssetVideoView;

    invoke-static {v0, p2}, Lorg/researchstack/backbone/ui/views/AssetVideoView;->access$1702(Lorg/researchstack/backbone/ui/views/AssetVideoView;I)I

    .line 500
    return-void
.end method
