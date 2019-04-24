.class public abstract Lorg/researchstack/backbone/task/Task;
.super Ljava/lang/Object;
.source "Task.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/researchstack/backbone/task/Task$ViewChangeType;,
        Lorg/researchstack/backbone/task/Task$InvalidTaskException;,
        Lorg/researchstack/backbone/task/Task$TaskProgress;
    }
.end annotation


# instance fields
.field private identifier:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lorg/researchstack/backbone/task/Task;->identifier:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public abstract getAnswerForStep(Lorg/researchstack/backbone/step/Step;)Ljava/lang/String;
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lorg/researchstack/backbone/task/Task;->identifier:Ljava/lang/String;

    return-object v0
.end method

.method public abstract getProgressOfCurrentStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/task/Task$TaskProgress;
.end method

.method public abstract getStepAfterStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/step/Step;
.end method

.method public abstract getStepBeforeStep(Lorg/researchstack/backbone/step/Step;Lorg/researchstack/backbone/result/TaskResult;)Lorg/researchstack/backbone/step/Step;
.end method

.method public abstract getStepById(Ljava/lang/String;)Lorg/researchstack/backbone/step/Step;
.end method

.method public getTitleForStep(Landroid/content/Context;Lorg/researchstack/backbone/step/Step;)Ljava/lang/String;
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "step"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 77
    invoke-virtual {p2}, Lorg/researchstack/backbone/step/Step;->getStepTitle()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lorg/researchstack/backbone/step/Step;->getStepTitle()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public onViewChange(Lorg/researchstack/backbone/task/Task$ViewChangeType;Lorg/researchstack/backbone/ui/ViewTaskActivity;Lorg/researchstack/backbone/step/Step;)V
    .locals 0
    .param p1, "type"    # Lorg/researchstack/backbone/task/Task$ViewChangeType;
    .param p2, "activity"    # Lorg/researchstack/backbone/ui/ViewTaskActivity;
    .param p3, "currentStep"    # Lorg/researchstack/backbone/step/Step;

    .prologue
    .line 270
    return-void
.end method

.method public abstract stepShown(Lorg/researchstack/backbone/step/Step;)V
.end method

.method public taskClosedByTheUser()V
    .locals 0

    .prologue
    .line 175
    return-void
.end method

.method public abstract validateParameters()V
.end method

.method public willStop(Z)V
    .locals 0
    .param p1, "questionnaireEnded"    # Z

    .prologue
    .line 169
    return-void
.end method
