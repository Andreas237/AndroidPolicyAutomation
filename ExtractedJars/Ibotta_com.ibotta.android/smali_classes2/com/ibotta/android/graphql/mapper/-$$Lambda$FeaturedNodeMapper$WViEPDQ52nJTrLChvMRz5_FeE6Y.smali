.class public final synthetic Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$WViEPDQ52nJTrLChvMRz5_FeE6Y;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$WViEPDQ52nJTrLChvMRz5_FeE6Y;->f$0:Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

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
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/graphql/mapper/-$$Lambda$FeaturedNodeMapper$WViEPDQ52nJTrLChvMRz5_FeE6Y;->f$0:Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;

    check-cast p1, Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;

    invoke-static {v0, p1}, Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;->lambda$map$3(Lcom/ibotta/android/graphql/mapper/FeaturedNodeMapper;Lcom/ibotta/android/graphql/fragment/RetailerNodeFragment;)Lcom/ibotta/api/model/content/RetailerContent;

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
