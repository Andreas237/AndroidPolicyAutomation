.class final Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;
.super Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
.source "AutoValue_PwiPaymentMethod.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private cardBrand:Ljava/lang/String;

.field private cardType:Ljava/lang/String;

.field private defaultSource:Ljava/lang/Boolean;

.field private expiryMonth:Ljava/lang/Integer;

.field private expiryYear:Ljava/lang/Integer;

.field private name:Ljava/lang/String;

.field private sourceId:Ljava/lang/String;

.field private sourceType:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 142
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
    .locals 12

    const-string v0, ""

    .line 202
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->name:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 203
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " name"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 205
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->cardBrand:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " cardBrand"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 208
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->expiryMonth:Ljava/lang/Integer;

    if-nez v1, :cond_2

    .line 209
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expiryMonth"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 211
    :cond_2
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->expiryYear:Ljava/lang/Integer;

    if-nez v1, :cond_3

    .line 212
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " expiryYear"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 214
    :cond_3
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->cardType:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 215
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " cardType"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 217
    :cond_4
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->sourceId:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 218
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " sourceId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 220
    :cond_5
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->sourceType:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 221
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " sourceType"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 223
    :cond_6
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->defaultSource:Ljava/lang/Boolean;

    if-nez v1, :cond_7

    .line 224
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " defaultSource"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 226
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 229
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;

    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->name:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->cardBrand:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->expiryMonth:Ljava/lang/Integer;

    .line 232
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->expiryYear:Ljava/lang/Integer;

    .line 233
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v7, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->cardType:Ljava/lang/String;

    iget-object v8, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->sourceId:Ljava/lang/String;

    iget-object v9, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->sourceType:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->defaultSource:Ljava/lang/Boolean;

    .line 237
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$1;)V

    return-object v0

    .line 227
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public cardBrand(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 157
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->cardBrand:Ljava/lang/String;

    return-object p0

    .line 155
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null cardBrand"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public cardType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 175
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->cardType:Ljava/lang/String;

    return-object p0

    .line 173
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null cardType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public defaultSource(Z)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 0

    .line 196
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->defaultSource:Ljava/lang/Boolean;

    return-object p0
.end method

.method public expiryMonth(I)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 0

    .line 162
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->expiryMonth:Ljava/lang/Integer;

    return-object p0
.end method

.method public expiryYear(I)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 0

    .line 167
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->expiryYear:Ljava/lang/Integer;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 149
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->name:Ljava/lang/String;

    return-object p0

    .line 147
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null name"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public sourceId(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 183
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->sourceId:Ljava/lang/String;

    return-object p0

    .line 181
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null sourceId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public sourceType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 191
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;->sourceType:Ljava/lang/String;

    return-object p0

    .line 189
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null sourceType"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
