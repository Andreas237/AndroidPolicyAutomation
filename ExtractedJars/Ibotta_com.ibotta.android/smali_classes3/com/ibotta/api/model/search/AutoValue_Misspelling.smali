.class final Lcom/ibotta/api/model/search/AutoValue_Misspelling;
.super Lcom/ibotta/api/model/search/Misspelling;
.source "AutoValue_Misspelling.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/search/AutoValue_Misspelling$Builder;
    }
.end annotation


# instance fields
.field private final confidence:Ljava/lang/String;

.field private final original:Ljava/lang/String;

.field private final suggested:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/model/search/Misspelling;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->original:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->suggested:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->confidence:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/search/AutoValue_Misspelling$1;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/api/model/search/AutoValue_Misspelling;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 52
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/search/Misspelling;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 53
    check-cast p1, Lcom/ibotta/api/model/search/Misspelling;

    .line 54
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->original:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/model/search/Misspelling;->getOriginal()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->suggested:Ljava/lang/String;

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/Misspelling;->getSuggested()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->confidence:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/api/model/search/Misspelling;->getConfidence()Ljava/lang/String;

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

.method public getConfidence()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->confidence:Ljava/lang/String;

    return-object v0
.end method

.method public getOriginal()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->original:Ljava/lang/String;

    return-object v0
.end method

.method public getSuggested()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->suggested:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->original:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 67
    iget-object v2, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->suggested:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 69
    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->confidence:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Misspelling{original="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->original:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", suggested="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->suggested:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", confidence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/search/AutoValue_Misspelling;->confidence:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
