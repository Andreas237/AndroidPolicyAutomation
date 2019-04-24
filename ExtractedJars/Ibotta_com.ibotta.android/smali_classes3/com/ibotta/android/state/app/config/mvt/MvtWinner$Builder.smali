.class public abstract Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
.super Ljava/lang/Object;
.source "MvtWinner.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/mvt/MvtWinner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .line 22
    new-instance v0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinner$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/state/app/config/mvt/MvtWinner;
.end method

.method public abstract testName(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "test_name"
    .end annotation
.end method

.method public abstract variantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "variant_name"
    .end annotation
.end method
