.class public Lcom/microblink/internal/phone/PhoneMatch;
.super Ljava/lang/Object;


# instance fields
.field private phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/phone/PhoneNumber;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/phone/PhoneMatch;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcom/microblink/internal/phone/PhoneMatch;

    iget-object v2, p0, Lcom/microblink/internal/phone/PhoneMatch;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    if-eqz v2, :cond_2

    iget-object p1, p1, Lcom/microblink/internal/phone/PhoneMatch;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    invoke-virtual {v2, p1}, Lcom/microblink/internal/phone/PhoneNumber;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p1, Lcom/microblink/internal/phone/PhoneMatch;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    if-nez p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/phone/PhoneMatch;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/phone/PhoneNumber;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public phoneNumber()Lcom/microblink/internal/phone/PhoneNumber;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/phone/PhoneMatch;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PhoneMatch{number="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/phone/PhoneMatch;->phoneNumber:Lcom/microblink/internal/phone/PhoneNumber;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
