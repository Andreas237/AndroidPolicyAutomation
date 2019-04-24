.class final Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;
.super Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;
.source "AutoValue_MvtWinnersConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$Builder;
    }
.end annotation


# instance fields
.field private final mvtWinners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinner;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinner;",
            ">;)V"
        }
    .end annotation

    .line 14
    invoke-direct {p0}, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;->mvtWinners:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/List;Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 36
    :cond_0
    instance-of v0, p1, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;

    if-eqz v0, :cond_1

    .line 37
    check-cast p1, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;->mvtWinners:Ljava/util/List;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;->getMvtWinners()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getMvtWinners()Ljava/util/List;
    .locals 1
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

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;->mvtWinners:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;->mvtWinners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MvtWinnersConfig{mvtWinners="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;->mvtWinners:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
