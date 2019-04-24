.class public abstract Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;
.super Ljava/lang/Object;
.source "MvtWinnersConfig.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .line 24
    new-instance v0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;
.end method

.method public abstract mvtWinners(Ljava/util/List;)Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "mvt_winners"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinner;",
            ">;)",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;"
        }
    .end annotation
.end method
