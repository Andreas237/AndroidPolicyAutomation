.class public Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;
.super Ljava/lang/Object;
.source "ViewDialogChangeSize.java"


# instance fields
.field private seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

.field private show:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->show:Z

    return-void
.end method

.method static synthetic access$000(Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;)Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    return-object p0
.end method


# virtual methods
.method public isShow()Z
    .locals 1

    .line 128
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->show:Z

    return v0
.end method

.method public showDialog(Landroid/app/Activity;Landroid/webkit/WebSettings;Lcom/rt/mobile/english/Utils;)V
    .locals 3

    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->show:Z

    .line 25
    new-instance v1, Landroid/app/Dialog;

    invoke-direct {v1, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 26
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    .line 27
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    const p1, 0x7f0c0044

    .line 28
    invoke-virtual {v1, p1}, Landroid/app/Dialog;->setContentView(I)V

    const p1, 0x7f090151

    .line 30
    invoke-virtual {v1, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    .line 32
    invoke-virtual {p3}, Lcom/rt/mobile/english/Utils;->getWebViewTextZoom()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v2, 0x3c

    if-eq p1, v2, :cond_9

    const/16 v0, 0x46

    if-eq p1, v0, :cond_8

    const/16 v0, 0x50

    if-eq p1, v0, :cond_7

    const/16 v0, 0x5a

    if-eq p1, v0, :cond_6

    const/16 v0, 0x64

    const/4 v2, 0x5

    if-eq p1, v0, :cond_5

    const/16 v0, 0x6e

    if-eq p1, v0, :cond_4

    const/16 v0, 0x78

    if-eq p1, v0, :cond_3

    const/16 v0, 0x82

    if-eq p1, v0, :cond_2

    const/16 v0, 0x8c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x96

    if-eq p1, v0, :cond_0

    .line 64
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    invoke-virtual {p1, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 61
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 55
    :cond_2
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 52
    :cond_3
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 49
    :cond_4
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    const/4 v0, 0x6

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 46
    :cond_5
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    invoke-virtual {p1, v2}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 43
    :cond_6
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 40
    :cond_7
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 37
    :cond_8
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    goto :goto_0

    .line 34
    :cond_9
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;->seekBar:Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;

    invoke-virtual {p1, v0}, Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;->setProgress(I)V

    :goto_0
    const p1, 0x7f090044

    .line 69
    invoke-virtual {v1, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 70
    new-instance v0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$1;

    invoke-direct {v0, p0, v1}, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$1;-><init>(Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;Landroid/app/Dialog;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f090006

    .line 78
    invoke-virtual {v1, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 79
    new-instance v0, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;

    invoke-direct {v0, p0, p3, p2, v1}, Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize$2;-><init>(Lcom/rt/mobile/english/ui/widget/ViewDialogChangeSize;Lcom/rt/mobile/english/Utils;Landroid/webkit/WebSettings;Landroid/app/Dialog;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 123
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    return-void
.end method
