.class public final synthetic Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;

    invoke-direct {v0}, Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;-><init>()V

    sput-object v0, Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;->INSTANCE:Lcom/ibotta/android/graphql/search/-$$Lambda$Jd-xH6Y1Lxox6i6odVz0hH-TDKk;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .locals 0

    check-cast p1, Lcom/ibotta/android/graphql/SearchQuery$Data;

    invoke-virtual {p1}, Lcom/ibotta/android/graphql/SearchQuery$Data;->search()Lcom/ibotta/android/graphql/SearchQuery$Search;

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
