.class public abstract Lcom/ibotta/android/state/app/featureflag/VariantInfo;
.super Ljava/lang/Object;
.source "VariantInfo.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/android/state/app/featureflag/VariantInfo;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
    .locals 2

    .line 19
    new-instance v0, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;-><init>()V

    const-string v1, ""

    .line 20
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/AutoValue_VariantInfo$Builder;->friendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;

    move-result-object v0

    const-string v1, ""

    .line 21
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;->description(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;

    move-result-object v0

    const-string v1, ""

    .line 22
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;->mvtVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getDescription()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description"
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

.method public abstract getMvtVariantName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mvt_variant_name"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method
