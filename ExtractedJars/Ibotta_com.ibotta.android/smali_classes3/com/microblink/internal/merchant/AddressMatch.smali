.class public Lcom/microblink/internal/merchant/AddressMatch;
.super Ljava/lang/Object;


# instance fields
.field private city:Ljava/lang/String;

.field private state:Ljava/lang/String;

.field private street:Ljava/lang/String;

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/merchant/AddressMatch;->street:Ljava/lang/String;

    iput-object p2, p0, Lcom/microblink/internal/merchant/AddressMatch;->city:Ljava/lang/String;

    iput-object p3, p0, Lcom/microblink/internal/merchant/AddressMatch;->state:Ljava/lang/String;

    iget-object p1, p0, Lcom/microblink/internal/merchant/AddressMatch;->zip:Ljava/lang/String;

    iput-object p1, p0, Lcom/microblink/internal/merchant/AddressMatch;->zip:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public city()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressMatch;->city:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_3

    :cond_1
    check-cast p1, Lcom/microblink/internal/merchant/AddressMatch;

    iget-object v2, p0, Lcom/microblink/internal/merchant/AddressMatch;->street:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v3, p1, Lcom/microblink/internal/merchant/AddressMatch;->street:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lcom/microblink/internal/merchant/AddressMatch;->street:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_0
    return v1

    :cond_3
    iget-object v2, p0, Lcom/microblink/internal/merchant/AddressMatch;->city:Ljava/lang/String;

    if-eqz v2, :cond_4

    iget-object v3, p1, Lcom/microblink/internal/merchant/AddressMatch;->city:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_4
    iget-object v2, p1, Lcom/microblink/internal/merchant/AddressMatch;->city:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_1
    return v1

    :cond_5
    iget-object v2, p0, Lcom/microblink/internal/merchant/AddressMatch;->state:Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v3, p1, Lcom/microblink/internal/merchant/AddressMatch;->state:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_6
    iget-object v2, p1, Lcom/microblink/internal/merchant/AddressMatch;->state:Ljava/lang/String;

    if-eqz v2, :cond_7

    :goto_2
    return v1

    :cond_7
    iget-object v2, p0, Lcom/microblink/internal/merchant/AddressMatch;->zip:Ljava/lang/String;

    if-eqz v2, :cond_8

    iget-object p1, p1, Lcom/microblink/internal/merchant/AddressMatch;->zip:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_8
    iget-object p1, p1, Lcom/microblink/internal/merchant/AddressMatch;->zip:Ljava/lang/String;

    if-nez p1, :cond_9

    return v0

    :cond_9
    :goto_3
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressMatch;->street:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/AddressMatch;->city:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/AddressMatch;->state:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/AddressMatch;->zip:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method

.method public state()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressMatch;->state:Ljava/lang/String;

    return-object v0
.end method

.method public street()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressMatch;->street:Ljava/lang/String;

    return-object v0
.end method

.method public zip()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/AddressMatch;->zip:Ljava/lang/String;

    return-object v0
.end method
