.class final Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$Builder;
.super Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;
.source "AutoValue_MvtWinnersConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private mvtWinners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinner;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig;
    .locals 4

    const-string v0, ""

    .line 66
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$Builder;->mvtWinners:Ljava/util/List;

    if-nez v1, :cond_0

    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " mvtWinners"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 69
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 72
    new-instance v0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$Builder;->mvtWinners:Ljava/util/List;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig;-><init>(Ljava/util/List;Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$1;)V

    return-object v0

    .line 70
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public mvtWinners(Ljava/util/List;)Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinner;",
            ">;)",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinnersConfig$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/mvt/AutoValue_MvtWinnersConfig$Builder;->mvtWinners:Ljava/util/List;

    return-object p0

    .line 58
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null mvtWinners"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
