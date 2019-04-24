.class public abstract Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;
.super Ljava/lang/Object;
.source "MvtWinnersConfig.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 16
    invoke-static {}, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;->builder()Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;

    move-result-object v0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;->mvtWinners(Ljava/util/List;)Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;->build()Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getMvtWinners()Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mvt_winners"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinner;",
            ">;"
        }
    .end annotation
.end method
