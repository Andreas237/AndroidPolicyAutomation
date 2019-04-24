.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$-6Fz7lvu4n6c7PqDb5krtt3265Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;

.field private final synthetic f$1:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$-6Fz7lvu4n6c7PqDb5krtt3265Y;->f$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$-6Fz7lvu4n6c7PqDb5krtt3265Y;->f$1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TR;+TV;>;)",
            "Ljava9/util/function/Function<",
            "TT;TV;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$andThen(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$-6Fz7lvu4n6c7PqDb5krtt3265Y;->f$0:Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/-$$Lambda$SpotlightPresenterHelperImpl$-6Fz7lvu4n6c7PqDb5krtt3265Y;->f$1:Ljava/util/List;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;->lambda$getRelatedBonuses$0(Lcom/ibotta/android/mvp/ui/activity/spotlight/helper/SpotlightPresenterHelperImpl;Ljava/util/List;Ljava/lang/Integer;)Lcom/ibotta/api/model/BonusModel;

    move-result-object p1

    return-object p1
.end method

.method public synthetic compose(Ljava9/util/function/Function;)Ljava9/util/function/Function;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Function<",
            "-TV;+TT;>;)",
            "Ljava9/util/function/Function<",
            "TV;TR;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Function$-CC;->$default$compose(Ljava9/util/function/Function;Ljava9/util/function/Function;)Ljava9/util/function/Function;

    move-result-object p1

    return-object p1
.end method
