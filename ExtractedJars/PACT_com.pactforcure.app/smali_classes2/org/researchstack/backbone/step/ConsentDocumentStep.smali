.class public Lorg/researchstack/backbone/step/ConsentDocumentStep;
.super Lorg/researchstack/backbone/step/Step;
.source "ConsentDocumentStep.java"


# instance fields
.field private confirmMessage:Ljava/lang/String;

.field private html:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/step/Step;-><init>(Ljava/lang/String;)V

    .line 18
    return-void
.end method


# virtual methods
.method public getConfirmMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lorg/researchstack/backbone/step/ConsentDocumentStep;->confirmMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getConsentHTML()Ljava/lang/String;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lorg/researchstack/backbone/step/ConsentDocumentStep;->html:Ljava/lang/String;

    return-object v0
.end method

.method public getStepLayoutClass()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 30
    const-class v0, Lorg/researchstack/backbone/ui/step/layout/ConsentDocumentStepLayout;

    return-object v0
.end method

.method public getStepTitle()I
    .locals 1

    .prologue
    .line 23
    invoke-super {p0}, Lorg/researchstack/backbone/step/Step;->getStepTitle()I

    move-result v0

    if-nez v0, :cond_0

    sget v0, Lorg/researchstack/backbone/R$string;->rsb_consent:I

    .line 24
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Lorg/researchstack/backbone/step/Step;->getStepTitle()I

    move-result v0

    goto :goto_0
.end method

.method public setConfirmMessage(Ljava/lang/String;)V
    .locals 0
    .param p1, "confirmMessage"    # Ljava/lang/String;

    .prologue
    .line 70
    iput-object p1, p0, Lorg/researchstack/backbone/step/ConsentDocumentStep;->confirmMessage:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setConsentHTML(Ljava/lang/String;)V
    .locals 0
    .param p1, "html"    # Ljava/lang/String;

    .prologue
    .line 50
    iput-object p1, p0, Lorg/researchstack/backbone/step/ConsentDocumentStep;->html:Ljava/lang/String;

    .line 51
    return-void
.end method
