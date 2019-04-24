.class public interface abstract Lorg/researchstack/backbone/ui/step/body/StepBody;
.super Ljava/lang/Object;
.source "StepBody.java"


# static fields
.field public static final VIEW_TYPE_COMPACT:I = 0x1

.field public static final VIEW_TYPE_DEFAULT:I


# virtual methods
.method public abstract clearViews()V
.end method

.method public abstract getBodyAnswerState(Ljava/util/List;)Lorg/researchstack/backbone/ui/step/body/BodyAnswer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lorg/researchstack/backbone/ui/step/body/StepBody;",
            ">;)",
            "Lorg/researchstack/backbone/ui/step/body/BodyAnswer;"
        }
    .end annotation
.end method

.method public abstract getBodyView(ILandroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public abstract getStepResult(Z)Lorg/researchstack/backbone/result/StepResult;
.end method

.method public abstract setAnswer(Ljava/lang/String;)V
.end method

.method public abstract setOnNextListener(Lorg/researchstack/backbone/ui/step/GoToNextLayout;)V
.end method
