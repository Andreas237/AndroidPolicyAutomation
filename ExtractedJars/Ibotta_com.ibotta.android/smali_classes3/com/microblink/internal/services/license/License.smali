.class public Lcom/microblink/internal/services/license/License;
.super Ljava/lang/Object;


# instance fields
.field private licensee:Lcom/microblink/internal/services/license/Licensee;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "licensee"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/microblink/internal/services/license/Licensee;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/license/License;->licensee:Lcom/microblink/internal/services/license/Licensee;

    return-void
.end method

.method public static create()Lcom/microblink/internal/services/license/License;
    .locals 2

    :try_start_0
    new-instance v0, Lcom/microblink/internal/services/license/License;

    invoke-static {}, Lcom/microblink/internal/services/license/Licensee;->create()Lcom/microblink/internal/services/license/Licensee;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/license/License;-><init>(Lcom/microblink/internal/services/license/Licensee;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
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
    check-cast p1, Lcom/microblink/internal/services/license/License;

    iget-object v2, p0, Lcom/microblink/internal/services/license/License;->licensee:Lcom/microblink/internal/services/license/Licensee;

    if-eqz v2, :cond_2

    iget-object p1, p1, Lcom/microblink/internal/services/license/License;->licensee:Lcom/microblink/internal/services/license/Licensee;

    invoke-virtual {v2, p1}, Lcom/microblink/internal/services/license/Licensee;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p1, Lcom/microblink/internal/services/license/License;->licensee:Lcom/microblink/internal/services/license/Licensee;

    if-nez p1, :cond_3

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/license/License;->licensee:Lcom/microblink/internal/services/license/Licensee;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/microblink/internal/services/license/Licensee;->hashCode()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "License{licensee="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/license/License;->licensee:Lcom/microblink/internal/services/license/Licensee;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
