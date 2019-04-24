.class public abstract Lcom/ibotta/android/state/app/featureflag/FeatureFlag;
.super Ljava/lang/Object;
.source "FeatureFlag.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/android/state/app/featureflag/FeatureFlag;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/ibotta/android/state/app/featureflag/FeatureFlag;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    invoke-static {}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->builder()Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->build()Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/state/app/featureflag/FeatureFlag;->EMPTY:Lcom/ibotta/android/state/app/featureflag/FeatureFlag;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .locals 2

    .line 30
    new-instance v0, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;-><init>()V

    const-string v1, ""

    .line 31
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/AutoValue_FeatureFlag$Builder;->friendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    const-string v1, ""

    .line 32
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->description(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    const-string v1, ""

    .line 33
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->controlFriendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    const-string v1, ""

    .line 34
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->controlDescription(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    const-string v1, ""

    .line 35
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->mvtTestName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    const-string v1, ""

    .line 36
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->minVersion(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    const-string v1, ""

    .line 37
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->employeeVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    const-string v1, ""

    .line 38
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->winnerVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    .line 39
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;->variantFeatureInfoMap(Ljava/util/Map;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getControlDescription()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "control_description"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getControlFriendlyName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "control_friendly_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getDescription()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getEmployeeVariantName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "employee_variant"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getFriendlyName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "friendly_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getMinVersion()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "min_version"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getMvtTestName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mvt_test_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getVariantFeatureInfoMap()Ljava/util/Map;
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
.end method

.method public abstract getWinnerVariantName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "winner_variant"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
