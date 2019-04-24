.class public final Lcom/microblink/internal/phone/PhoneNumber;
.super Ljava/lang/Object;


# instance fields
.field private countryCode:I

.field private number:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/microblink/internal/phone/PhoneNumber;->countryCode:I

    return-void
.end method


# virtual methods
.method public final countryCode()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/phone/PhoneNumber;->countryCode:I

    return v0
.end method

.method public final countryCode(I)Lcom/microblink/internal/phone/PhoneNumber;
    .locals 0

    iput p1, p0, Lcom/microblink/internal/phone/PhoneNumber;->countryCode:I

    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/microblink/internal/phone/PhoneNumber;

    iget v2, p0, Lcom/microblink/internal/phone/PhoneNumber;->countryCode:I

    iget v3, p1, Lcom/microblink/internal/phone/PhoneNumber;->countryCode:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/microblink/internal/phone/PhoneNumber;->number:Ljava/lang/String;

    if-eqz v2, :cond_3

    iget-object p1, p1, Lcom/microblink/internal/phone/PhoneNumber;->number:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    iget-object p1, p1, Lcom/microblink/internal/phone/PhoneNumber;->number:Ljava/lang/String;

    if-nez p1, :cond_4

    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lcom/microblink/internal/phone/PhoneNumber;->countryCode:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/microblink/internal/phone/PhoneNumber;->number:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final number(Ljava/lang/String;)Lcom/microblink/internal/phone/PhoneNumber;
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/phone/PhoneNumber;->number:Ljava/lang/String;

    return-object p0
.end method

.method public final number()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/phone/PhoneNumber;->number:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PhoneNumber{countryCode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/internal/phone/PhoneNumber;->countryCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", number=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/phone/PhoneNumber;->number:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
