.class public abstract Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
.super Ljava/lang/Object;
.source "FeatureFlag.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/featureflag/FeatureFlag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/state/app/featureflag/FeatureFlag;
.end method

.method public abstract controlDescription(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "control_description"
    .end annotation
.end method

.method public abstract controlFriendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "control_friendly_name"
    .end annotation
.end method

.method public abstract description(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description"
    .end annotation
.end method

.method public abstract employeeVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "employee_variant"
    .end annotation
.end method

.method public abstract friendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "friendly_name"
    .end annotation
.end method

.method public abstract minVersion(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "min_version"
    .end annotation
.end method

.method public abstract mvtTestName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mvt_test_name"
    .end annotation
.end method

.method public abstract variantFeatureInfoMap(Ljava/util/Map;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/util/Map;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "variants"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/state/app/featureflag/VariantInfo;",
            ">;)",
            "Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;"
        }
    .end annotation
.end method

.method public abstract winnerVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/FeatureFlag$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "winner_variant"
    .end annotation
.end method
