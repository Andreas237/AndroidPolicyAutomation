.class public final synthetic Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$oYVWAcI6VFRMbwEwD9RJx_1vLrQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;

.field private final synthetic f$1:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$oYVWAcI6VFRMbwEwD9RJx_1vLrQ;->f$0:Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;

    iput-object p2, p0, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$oYVWAcI6VFRMbwEwD9RJx_1vLrQ;->f$1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$oYVWAcI6VFRMbwEwD9RJx_1vLrQ;->f$0:Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;

    iget-object v1, p0, Lcom/ibotta/android/graphql/cache/-$$Lambda$IbottaApolloCacheImpl$oYVWAcI6VFRMbwEwD9RJx_1vLrQ;->f$1:Ljava/util/List;

    check-cast p1, Lcom/ibotta/api/model/base/BaseModule;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;->lambda$updateRecentlyViewedModuleOffers$2(Lcom/ibotta/android/graphql/cache/IbottaApolloCacheImpl;Ljava/util/List;Lcom/ibotta/api/model/base/BaseModule;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
