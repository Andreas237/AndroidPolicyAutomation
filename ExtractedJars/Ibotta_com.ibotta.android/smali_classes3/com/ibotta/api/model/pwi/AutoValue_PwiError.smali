.class final Lcom/ibotta/api/model/pwi/AutoValue_PwiError;
.super Lcom/ibotta/api/model/pwi/PwiError;
.source "AutoValue_PwiError.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;
    }
.end annotation


# instance fields
.field private final body:Ljava/lang/String;

.field private final code:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/PwiError;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->title:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->body:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->code:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/pwi/AutoValue_PwiError$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 56
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/pwi/PwiError;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 57
    check-cast p1, Lcom/ibotta/api/model/pwi/PwiError;

    .line 58
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->title:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiError;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->body:Ljava/lang/String;

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiError;->getBody()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->code:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiError;->getCode()Ljava/lang/String;

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

.method public getBody()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "body"
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getCode()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "code"
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->code:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 69
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 71
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->body:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 73
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->code:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PwiError{title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->body:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError;->code:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
