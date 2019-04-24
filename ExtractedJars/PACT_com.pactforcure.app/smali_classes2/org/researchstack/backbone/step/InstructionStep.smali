.class public Lorg/researchstack/backbone/step/InstructionStep;
.super Lorg/researchstack/backbone/step/Step;
.source "InstructionStep.java"


# instance fields
.field private positiveButtonTitleResId:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "detailText"    # Ljava/lang/String;

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Lorg/researchstack/backbone/step/Step;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0, p3}, Lorg/researchstack/backbone/step/InstructionStep;->setText(Ljava/lang/String;)V

    .line 22
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/step/InstructionStep;->setOptional(Z)V

    .line 23
    return-void
.end method


# virtual methods
.method public getPositiveButtonTitleResId()I
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lorg/researchstack/backbone/step/InstructionStep;->positiveButtonTitleResId:I

    return v0
.end method

.method public getStepLayoutClass()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 28
    const-class v0, Lorg/researchstack/backbone/ui/step/layout/InstructionStepLayout;

    return-object v0
.end method

.method public setPositiveButtonTitleResId(I)V
    .locals 0
    .param p1, "stringId"    # I
        .annotation build Landroid/support/annotation/StringRes;
        .end annotation
    .end param

    .prologue
    .line 32
    iput p1, p0, Lorg/researchstack/backbone/step/InstructionStep;->positiveButtonTitleResId:I

    .line 33
    return-void
.end method
