.class public final synthetic Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$X-rsFF0KuJ9P_zVbLf--ghW6yUw;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Predicate;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$X-rsFF0KuJ9P_zVbLf--ghW6yUw;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$X-rsFF0KuJ9P_zVbLf--ghW6yUw;

    invoke-direct {v0}, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$X-rsFF0KuJ9P_zVbLf--ghW6yUw;-><init>()V

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$X-rsFF0KuJ9P_zVbLf--ghW6yUw;->INSTANCE:Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$X-rsFF0KuJ9P_zVbLf--ghW6yUw;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic and(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Predicate$-CC;->$default$and(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava9/util/function/Predicate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0}, Ljava9/util/function/Predicate$-CC;->$default$negate(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Predicate<",
            "-TT;>;)",
            "Ljava9/util/function/Predicate<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Predicate$-CC;->$default$or(Ljava9/util/function/Predicate;Ljava9/util/function/Predicate;)Ljava9/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->lambda$trackDuplicateCategoryData$2(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method
