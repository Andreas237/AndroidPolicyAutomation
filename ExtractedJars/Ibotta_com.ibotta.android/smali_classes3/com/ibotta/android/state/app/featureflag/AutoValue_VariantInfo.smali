.class final Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;
.super Lcom/ibotta/android/state/app/featureflag/VariantInfo;
.source "AutoValue_VariantInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;
    }
.end annotation


# instance fields
.field private final description:Ljava/lang/String;

.field private final friendlyName:Ljava/lang/String;

.field private final mvtVariantName:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 18
    invoke-direct {p0}, Lcom/ibotta/android/state/app/featureflag/VariantInfo;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->friendlyName:Ljava/lang/String;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->description:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->mvtVariantName:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 59
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/state/app/featureflag/VariantInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 60
    check-cast p1, Lcom/ibotta/android/state/app/featureflag/VariantInfo;

    .line 61
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->friendlyName:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo;->getFriendlyName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo;->getFriendlyName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->description:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->mvtVariantName:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 63
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo;->getMvtVariantName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo;->getMvtVariantName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_5
    return v2
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getFriendlyName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "friendly_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->friendlyName:Ljava/lang/String;

    return-object v0
.end method

.method public getMvtVariantName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mvt_variant_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->mvtVariantName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 72
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->friendlyName:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 74
    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->description:Ljava/lang/String;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 76
    iget-object v2, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->mvtVariantName:Ljava/lang/String;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VariantInfo{friendlyName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->friendlyName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mvtVariantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo;->mvtVariantName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
