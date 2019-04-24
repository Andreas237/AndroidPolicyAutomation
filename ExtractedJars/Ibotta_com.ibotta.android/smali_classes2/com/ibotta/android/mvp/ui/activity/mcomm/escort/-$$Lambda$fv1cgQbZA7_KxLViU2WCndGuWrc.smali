.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$fv1cgQbZA7_KxLViU2WCndGuWrc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Function;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$fv1cgQbZA7_KxLViU2WCndGuWrc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$fv1cgQbZA7_KxLViU2WCndGuWrc;

    invoke-direct {v0}, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$fv1cgQbZA7_KxLViU2WCndGuWrc;-><init>()V

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$fv1cgQbZA7_KxLViU2WCndGuWrc;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/mcomm/escort/-$$Lambda$fv1cgQbZA7_KxLViU2WCndGuWrc;

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

    check-cast p1, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/CustomerRetailerLaunch;->getPercentBackString()Ljava9/util/Optional;

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
