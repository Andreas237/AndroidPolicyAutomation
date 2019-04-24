.class Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody$1;
.super Ljava/lang/Object;
.source "ScaleQuestionBody.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->setFilters(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;


# direct methods
.method constructor <init>(Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;)V
    .locals 0
    .param p1, "this$0"    # Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;

    .prologue
    .line 108
    iput-object p1, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody$1;->this$0:Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2
    .param p1, "seekBar"    # Landroid/widget/SeekBar;
    .param p2, "progress"    # I
    .param p3, "fromUser"    # Z

    .prologue
    .line 111
    iget-object v0, p0, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody$1;->this$0:Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;

    invoke-static {v0}, Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;->access$000(Lorg/researchstack/backbone/ui/step/body/ScaleQuestionBody;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 112
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0
    .param p1, "seekBar"    # Landroid/widget/SeekBar;

    .prologue
    .line 117
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0
    .param p1, "seekBar"    # Landroid/widget/SeekBar;

    .prologue
    .line 122
    return-void
.end method
