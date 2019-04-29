.class Lcom/rt/mobile/english/ui/widget/VisualizerView$2;
.super Ljava/lang/Object;
.source "VisualizerView.java"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/widget/VisualizerView;->link(Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/VisualizerView;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/VisualizerView;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView$2;->this$0:Lcom/rt/mobile/english/ui/widget/VisualizerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 105
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView$2;->this$0:Lcom/rt/mobile/english/ui/widget/VisualizerView;

    invoke-static {p1}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->access$000(Lcom/rt/mobile/english/ui/widget/VisualizerView;)Landroid/media/audiofx/Visualizer;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/media/audiofx/Visualizer;->setEnabled(Z)I

    return-void
.end method
