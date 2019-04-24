.class public Lorg/researchstack/backbone/step/Step;
.super Ljava/lang/Object;
.source "Step.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private allowsBackNavigation:Z

.field private identifier:Ljava/lang/String;

.field private optional:Z

.field private resetViews:Z

.field private restorable:Z

.field private shouldTintImages:Z

.field private showsProgress:Z

.field private stepLayoutClass:Ljava/lang/Class;

.field private stepTitle:I

.field private task:Lorg/researchstack/backbone/task/Task;

.field private text:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private useSurveyMode:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-boolean v0, p0, Lorg/researchstack/backbone/step/Step;->optional:Z

    .line 31
    iput-boolean v0, p0, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation:Z

    .line 50
    iput-object p1, p0, Lorg/researchstack/backbone/step/Step;->identifier:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;
    .param p2, "title"    # Ljava/lang/String;

    .prologue
    const/4 v0, 0x1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-boolean v0, p0, Lorg/researchstack/backbone/step/Step;->optional:Z

    .line 31
    iput-boolean v0, p0, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation:Z

    .line 61
    iput-object p1, p0, Lorg/researchstack/backbone/step/Step;->identifier:Ljava/lang/String;

    .line 62
    iput-object p2, p0, Lorg/researchstack/backbone/step/Step;->title:Ljava/lang/String;

    .line 63
    return-void
.end method


# virtual methods
.method public allowsBackNavigation()Z
    .locals 1

    .prologue
    .line 211
    iget-boolean v0, p0, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation:Z

    return v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lorg/researchstack/backbone/step/Step;->identifier:Ljava/lang/String;

    return-object v0
.end method

.method public getStepLayoutClass()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 192
    iget-object v0, p0, Lorg/researchstack/backbone/step/Step;->stepLayoutClass:Ljava/lang/Class;

    return-object v0
.end method

.method public getStepTitle()I
    .locals 1

    .prologue
    .line 164
    iget v0, p0, Lorg/researchstack/backbone/step/Step;->stepTitle:I

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lorg/researchstack/backbone/step/Step;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lorg/researchstack/backbone/step/Step;->title:Ljava/lang/String;

    return-object v0
.end method

.method public isOptional()Z
    .locals 1

    .prologue
    .line 94
    iget-boolean v0, p0, Lorg/researchstack/backbone/step/Step;->optional:Z

    return v0
.end method

.method public mustResetViews()Z
    .locals 1

    .prologue
    .line 236
    iget-boolean v0, p0, Lorg/researchstack/backbone/step/Step;->resetViews:Z

    return v0
.end method

.method public resetToInitialState()V
    .locals 1

    .prologue
    .line 228
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/researchstack/backbone/step/Step;->resetViews:Z

    .line 229
    return-void
.end method

.method public resetToInitialState(Z)V
    .locals 0
    .param p1, "flag"    # Z

    .prologue
    .line 232
    iput-boolean p1, p0, Lorg/researchstack/backbone/step/Step;->resetViews:Z

    .line 233
    return-void
.end method

.method public setAllowsBackNavigation(Z)V
    .locals 0
    .param p1, "allowsBackNavigation"    # Z

    .prologue
    .line 220
    iput-boolean p1, p0, Lorg/researchstack/backbone/step/Step;->allowsBackNavigation:Z

    .line 221
    return-void
.end method

.method public setOptional(Z)V
    .locals 0
    .param p1, "optional"    # Z

    .prologue
    .line 105
    iput-boolean p1, p0, Lorg/researchstack/backbone/step/Step;->optional:Z

    .line 106
    return-void
.end method

.method public setStepLayoutClass(Ljava/lang/Class;)V
    .locals 0
    .param p1, "stepLayoutClass"    # Ljava/lang/Class;

    .prologue
    .line 203
    iput-object p1, p0, Lorg/researchstack/backbone/step/Step;->stepLayoutClass:Ljava/lang/Class;

    .line 204
    return-void
.end method

.method public setStepTitle(I)V
    .locals 0
    .param p1, "stepTitle"    # I

    .prologue
    .line 174
    iput p1, p0, Lorg/researchstack/backbone/step/Step;->stepTitle:I

    .line 175
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 154
    iput-object p1, p0, Lorg/researchstack/backbone/step/Step;->text:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0
    .param p1, "title"    # Ljava/lang/String;

    .prologue
    .line 129
    iput-object p1, p0, Lorg/researchstack/backbone/step/Step;->title:Ljava/lang/String;

    .line 130
    return-void
.end method
