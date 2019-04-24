.class final Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;
.super Lcom/ibotta/android/state/app/featureflag/FeatureFlag;
.source "AutoValue_FeatureFlag.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;
    }
.end annotation


# instance fields
.field private final controlDescription:Ljava/lang/String;

.field private final controlFriendlyName:Ljava/lang/String;

.field private final description:Ljava/lang/String;

.field private final employeeVariantName:Ljava/lang/String;

.field private final friendlyName:Ljava/lang/String;

.field private final minVersion:Ljava/lang/String;

.field private final mvtTestName:Ljava/lang/String;

.field private final variantFeatureInfoMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/VariantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private final winnerVariantName:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
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
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/VariantInfo;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->friendlyName:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->description:Ljava/lang/String;

    .line 34
    iput-object p3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlFriendlyName:Ljava/lang/String;

    .line 35
    iput-object p4, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlDescription:Ljava/lang/String;

    .line 36
    iput-object p5, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->mvtTestName:Ljava/lang/String;

    .line 37
    iput-object p6, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->minVersion:Ljava/lang/String;

    .line 38
    iput-object p7, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->employeeVariantName:Ljava/lang/String;

    .line 39
    iput-object p8, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->winnerVariantName:Ljava/lang/String;

    .line 40
    iput-object p9, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->variantFeatureInfoMap:Ljava/util/Map;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$1;)V
    .locals 0

    .line 10
    invoke-direct/range {p0 .. p9}, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 126
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    .line 127
    check-cast p1, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    .line 128
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->friendlyName:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getFriendlyName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getFriendlyName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_0
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->description:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 129
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlFriendlyName:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 130
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getControlFriendlyName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getControlFriendlyName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlDescription:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 131
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getControlDescription()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getControlDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->mvtTestName:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 132
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getMvtTestName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getMvtTestName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->minVersion:Ljava/lang/String;

    if-nez v1, :cond_6

    .line 133
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getMinVersion()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getMinVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_5
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->employeeVariantName:Ljava/lang/String;

    if-nez v1, :cond_7

    .line 134
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getEmployeeVariantName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getEmployeeVariantName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_6
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->winnerVariantName:Ljava/lang/String;

    if-nez v1, :cond_8

    .line 135
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getWinnerVariantName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_7

    :cond_8
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getWinnerVariantName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    :goto_7
    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->variantFeatureInfoMap:Ljava/util/Map;

    if-nez v1, :cond_9

    .line 136
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getVariantFeatureInfoMap()Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_8

    :cond_9
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->getVariantFeatureInfoMap()Ljava/util/Map;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    goto :goto_8

    :cond_a
    const/4 v0, 0x0

    :goto_8
    return v0

    :cond_b
    return v2
.end method

.method public getControlDescription()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "control_description"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getControlFriendlyName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "control_friendly_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlFriendlyName:Ljava/lang/String;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getEmployeeVariantName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "employee_variant"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->employeeVariantName:Ljava/lang/String;

    return-object v0
.end method

.method public getFriendlyName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "friendly_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->friendlyName:Ljava/lang/String;

    return-object v0
.end method

.method public getMinVersion()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "min_version"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->minVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getMvtTestName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mvt_test_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->mvtTestName:Ljava/lang/String;

    return-object v0
.end method

.method public getVariantFeatureInfoMap()Ljava/util/Map;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "variants"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/VariantInfo;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->variantFeatureInfoMap:Ljava/util/Map;

    return-object v0
.end method

.method public getWinnerVariantName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "winner_variant"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->winnerVariantName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->friendlyName:Ljava/lang/String;

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

    .line 147
    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->description:Ljava/lang/String;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 149
    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlFriendlyName:Ljava/lang/String;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 151
    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlDescription:Ljava/lang/String;

    if-nez v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 153
    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->mvtTestName:Ljava/lang/String;

    if-nez v3, :cond_4

    const/4 v3, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 155
    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->minVersion:Ljava/lang/String;

    if-nez v3, :cond_5

    const/4 v3, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 157
    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->employeeVariantName:Ljava/lang/String;

    if-nez v3, :cond_6

    const/4 v3, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 159
    iget-object v3, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->winnerVariantName:Ljava/lang/String;

    if-nez v3, :cond_7

    const/4 v3, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 161
    iget-object v2, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->variantFeatureInfoMap:Ljava/util/Map;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-interface {v2}, Ljava/util/Map;->hashCode()I

    move-result v1

    :goto_8
    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FeatureFlag{friendlyName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->friendlyName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", controlFriendlyName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlFriendlyName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", controlDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->controlDescription:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mvtTestName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->mvtTestName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", minVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->minVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", employeeVariantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->employeeVariantName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", winnerVariantName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->winnerVariantName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", variantFeatureInfoMap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag;->variantFeatureInfoMap:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
