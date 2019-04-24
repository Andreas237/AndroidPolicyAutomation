.class abstract Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;
.super Lcom/ibotta/android/apiandroid/content/ContentId;
.source "$AutoValue_ContentId.java"


# instance fields
.field private final idType:I

.field private final internalIntId:I

.field private final internalStringId:Ljava/lang/String;


# direct methods
.method constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/apiandroid/content/ContentId;-><init>()V

    .line 16
    iput p1, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->idType:I

    .line 17
    iput p2, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalIntId:I

    if-eqz p3, :cond_0

    .line 21
    iput-object p3, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalStringId:Ljava/lang/String;

    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Null internalStringId"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 54
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/apiandroid/content/ContentId;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 55
    check-cast p1, Lcom/ibotta/android/apiandroid/content/ContentId;

    .line 56
    iget v1, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->idType:I

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIdType()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalIntId:I

    .line 57
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getInternalIntId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalStringId:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getInternalStringId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getIdType()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->idType:I

    return v0
.end method

.method protected getInternalIntId()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalIntId:I

    return v0
.end method

.method protected getInternalStringId()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalStringId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 67
    iget v0, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->idType:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 69
    iget v2, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalIntId:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 71
    iget-object v1, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalStringId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentId{idType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->idType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", internalIntId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalIntId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", internalStringId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/apiandroid/content/$AutoValue_ContentId;->internalStringId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
