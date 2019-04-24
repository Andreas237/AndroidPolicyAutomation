.class public Lorg/researchstack/backbone/step/ConsentSignatureStep;
.super Lorg/researchstack/backbone/step/Step;
.source "ConsentSignatureStep.java"


# instance fields
.field private signatureDateFormat:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1, "identifier"    # Ljava/lang/String;

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lorg/researchstack/backbone/step/Step;-><init>(Ljava/lang/String;)V

    .line 14
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/researchstack/backbone/step/ConsentSignatureStep;->setOptional(Z)V

    .line 15
    return-void
.end method


# virtual methods
.method public getSignatureDateFormat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lorg/researchstack/backbone/step/ConsentSignatureStep;->signatureDateFormat:Ljava/lang/String;

    return-object v0
.end method

.method public setSignatureDateFormat(Ljava/lang/String;)V
    .locals 0
    .param p1, "signatureDateFormat"    # Ljava/lang/String;

    .prologue
    .line 42
    iput-object p1, p0, Lorg/researchstack/backbone/step/ConsentSignatureStep;->signatureDateFormat:Ljava/lang/String;

    .line 43
    return-void
.end method
