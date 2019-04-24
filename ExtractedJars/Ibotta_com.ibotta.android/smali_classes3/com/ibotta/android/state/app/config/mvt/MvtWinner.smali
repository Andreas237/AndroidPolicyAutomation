.class public abstract Lcom/ibotta/android/state/app/config/mvt/MvtWinner;
.super Ljava/lang/Object;
.source "MvtWinner.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/android/state/app/config/mvt/MvtWinner;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;
    }
.end annotation


# static fields
.field public static final NONE:Lcom/ibotta/android/state/app/config/mvt/MvtWinner;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 13
    invoke-static {}, Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;->builder()Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;->testName(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;->variantName(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/mvt/MvtWinner$Builder;->build()Lcom/ibotta/android/state/app/config/mvt/MvtWinner;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/state/app/config/mvt/MvtWinner;->NONE:Lcom/ibotta/android/state/app/config/mvt/MvtWinner;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getTestName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "test_name"
    .end annotation
.end method

.method public abstract getVariantName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "variant_name"
    .end annotation
.end method
