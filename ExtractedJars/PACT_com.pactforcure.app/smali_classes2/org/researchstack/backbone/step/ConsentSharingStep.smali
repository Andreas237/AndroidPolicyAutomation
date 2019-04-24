.class public Lorg/researchstack/backbone/step/ConsentSharingStep;
.super Lorg/researchstack/backbone/step/QuestionStep;
.source "ConsentSharingStep.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 14
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/step/QuestionStep;-><init>(Ljava/lang/String;)V

    .line 15
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/step/ConsentSharingStep;->setOptional(Z)V

    .line 16
    return-void
.end method


# virtual methods
.method public getStepBodyClass()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 21
    const-class v0, Lorg/researchstack/backbone/ui/step/body/SingleChoiceQuestionBody;

    return-object v0
.end method
