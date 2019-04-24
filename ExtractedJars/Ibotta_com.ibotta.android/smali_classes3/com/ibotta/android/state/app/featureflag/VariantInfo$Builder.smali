.class public abstract Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
.super Ljava/lang/Object;
.source "VariantInfo.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/featureflag/VariantInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/state/app/featureflag/VariantInfo;
.end method

.method public abstract description(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "description"
    .end annotation
.end method

.method public abstract friendlyName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "friendly_name"
    .end annotation
.end method

.method public abstract mvtVariantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/featureflag/VariantInfo$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mvt_variant_name"
    .end annotation
.end method
