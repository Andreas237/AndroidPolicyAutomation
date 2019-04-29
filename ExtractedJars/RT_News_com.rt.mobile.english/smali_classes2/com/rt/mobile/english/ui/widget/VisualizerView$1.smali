.class Lcom/rt/mobile/english/ui/widget/VisualizerView$1;
.super Ljava/lang/Object;
.source "VisualizerView.java"

# interfaces
.implements Landroid/media/audiofx/Visualizer$OnDataCaptureListener;


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

    .line 79
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/VisualizerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFftDataCapture(Landroid/media/audiofx/Visualizer;[BI)V
    .locals 0

    .line 91
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/VisualizerView;

    invoke-virtual {p1, p2}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->updateVisualizerFFT([B)V

    return-void
.end method

.method public onWaveFormDataCapture(Landroid/media/audiofx/Visualizer;[BI)V
    .locals 0

    .line 84
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/VisualizerView$1;->this$0:Lcom/rt/mobile/english/ui/widget/VisualizerView;

    invoke-virtual {p1, p2}, Lcom/rt/mobile/english/ui/widget/VisualizerView;->updateVisualizer([B)V

    return-void
.end method
