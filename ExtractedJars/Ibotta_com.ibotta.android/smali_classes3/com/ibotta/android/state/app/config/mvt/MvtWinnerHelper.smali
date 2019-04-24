.class public Lcom/ibotta/android/state/app/config/mvt/MvtWinnerHelper;
.super Ljava/lang/Object;
.source "MvtWinnerHelper.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic lambda$findMvtWinner$0(Ljava/lang/String;Lcom/ibotta/android/state/app/config/mvt/MvtWinner;)Z
    .locals 0

    .line 11
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/mvt/MvtWinner;->getTestName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public findMvtWinner(Ljava/lang/String;Ljava/util/List;)Lcom/ibotta/android/state/app/config/mvt/MvtWinner;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinner;",
            ">;)",
            "Lcom/ibotta/android/state/app/config/mvt/MvtWinner;"
        }
    .end annotation

    .line 10
    invoke-static {p2}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p2

    new-instance v0, Lcom/ibotta/android/state/app/config/mvt/-$$Lambda$MvtWinnerHelper$VZY-623H6D_Hsg10O-BVOy8DUkY;

    invoke-direct {v0, p1}, Lcom/ibotta/android/state/app/config/mvt/-$$Lambda$MvtWinnerHelper$VZY-623H6D_Hsg10O-BVOy8DUkY;-><init>(Ljava/lang/String;)V

    .line 11
    invoke-interface {p2, v0}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava9/util/stream/Stream;->findFirst()Ljava9/util/Optional;

    move-result-object p1

    sget-object p2, Lcom/ibotta/android/state/app/config/mvt/MvtWinner;->NONE:Lcom/ibotta/android/state/app/config/mvt/MvtWinner;

    .line 13
    invoke-virtual {p1, p2}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/state/app/config/mvt/MvtWinner;

    return-object p1
.end method
