.class public Lorg/researchstack/backbone/model/ConsentSignature;
.super Ljava/lang/Object;
.source "ConsentSignature.java"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# instance fields
.field private fullName:Ljava/lang/String;

.field private identifier:Ljava/lang/String;

.field private requiresBirthDate:Z

.field private requiresName:Z

.field private requiresSignatureImage:Z

.field private signatureDate:Ljava/lang/String;

.field private signatureDateFormatString:Ljava/lang/String;

.field private signatureImage:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-boolean v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->requiresName:Z

    .line 74
    iput-boolean v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->requiresSignatureImage:Z

    .line 75
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->identifier:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1, "identifier"    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "dateFormat"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 104
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, v4

    move-object v6, v4

    invoke-direct/range {v0 .. v6}, Lorg/researchstack/backbone/model/ConsentSignature;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "dateFormat"    # Ljava/lang/String;
    .param p4, "fullName"    # Ljava/lang/String;
    .param p5, "signatureImage"    # Ljava/lang/String;
    .param p6, "signatureDate"    # Ljava/lang/String;

    .prologue
    .line 88
    invoke-direct {p0}, Lorg/researchstack/backbone/model/ConsentSignature;-><init>()V

    .line 89
    iput-object p1, p0, Lorg/researchstack/backbone/model/ConsentSignature;->identifier:Ljava/lang/String;

    .line 90
    iput-object p2, p0, Lorg/researchstack/backbone/model/ConsentSignature;->title:Ljava/lang/String;

    .line 91
    iput-object p3, p0, Lorg/researchstack/backbone/model/ConsentSignature;->signatureDateFormatString:Ljava/lang/String;

    .line 92
    iput-object p4, p0, Lorg/researchstack/backbone/model/ConsentSignature;->fullName:Ljava/lang/String;

    .line 93
    iput-object p5, p0, Lorg/researchstack/backbone/model/ConsentSignature;->signatureImage:Ljava/lang/String;

    .line 94
    iput-object p6, p0, Lorg/researchstack/backbone/model/ConsentSignature;->signatureDate:Ljava/lang/String;

    .line 95
    return-void
.end method


# virtual methods
.method public getFullName()Ljava/lang/String;
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->fullName:Ljava/lang/String;

    return-object v0
.end method

.method public getIdentifier()Ljava/lang/String;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->identifier:Ljava/lang/String;

    return-object v0
.end method

.method public getSignatureDate()Ljava/lang/String;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->signatureDate:Ljava/lang/String;

    return-object v0
.end method

.method public getSignatureDateFormatString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->signatureDateFormatString:Ljava/lang/String;

    return-object v0
.end method

.method public getSignatureImage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->signatureImage:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->title:Ljava/lang/String;

    return-object v0
.end method

.method public requiresBirthDate()Z
    .locals 1

    .prologue
    .line 139
    iget-boolean v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->requiresBirthDate:Z

    return v0
.end method

.method public requiresName()Z
    .locals 1

    .prologue
    .line 119
    iget-boolean v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->requiresName:Z

    return v0
.end method

.method public requiresSignatureImage()Z
    .locals 1

    .prologue
    .line 129
    iget-boolean v0, p0, Lorg/researchstack/backbone/model/ConsentSignature;->requiresSignatureImage:Z

    return v0
.end method

.method public setFullName(Ljava/lang/String;)V
    .locals 0
    .param p1, "fullName"    # Ljava/lang/String;

    .prologue
    .line 159
    iput-object p1, p0, Lorg/researchstack/backbone/model/ConsentSignature;->fullName:Ljava/lang/String;

    .line 160
    return-void
.end method

.method public setIdentifier(Ljava/lang/String;)V
    .locals 0
    .param p1, "identifier"    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .prologue
    .line 114
    iput-object p1, p0, Lorg/researchstack/backbone/model/ConsentSignature;->identifier:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public setRequiresBirthDate(Z)V
    .locals 0
    .param p1, "requiresBirthDate"    # Z

    .prologue
    .line 144
    iput-boolean p1, p0, Lorg/researchstack/backbone/model/ConsentSignature;->requiresBirthDate:Z

    .line 145
    return-void
.end method

.method public setRequiresName(Z)V
    .locals 0
    .param p1, "requiresName"    # Z

    .prologue
    .line 124
    iput-boolean p1, p0, Lorg/researchstack/backbone/model/ConsentSignature;->requiresName:Z

    .line 125
    return-void
.end method

.method public setRequiresSignatureImage(Z)V
    .locals 0
    .param p1, "requiresSignatureImage"    # Z

    .prologue
    .line 134
    iput-boolean p1, p0, Lorg/researchstack/backbone/model/ConsentSignature;->requiresSignatureImage:Z

    .line 135
    return-void
.end method

.method public setSignatureImage(Ljava/lang/String;)V
    .locals 0
    .param p1, "signatureImage"    # Ljava/lang/String;

    .prologue
    .line 169
    iput-object p1, p0, Lorg/researchstack/backbone/model/ConsentSignature;->signatureImage:Ljava/lang/String;

    .line 170
    return-void
.end method
