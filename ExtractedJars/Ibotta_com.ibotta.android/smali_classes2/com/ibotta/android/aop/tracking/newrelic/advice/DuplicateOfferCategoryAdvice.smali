.class public Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;
.super Ljava/lang/Object;
.source "DuplicateOfferCategoryAdvice.java"

# interfaces
.implements Lcom/ibotta/android/aop/JoinPointAdvice;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;
    }
.end annotation


# instance fields
.field private final dupCatMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->dupCatMap:Ljava/util/Map;

    return-void
.end method

.method public static synthetic lambda$onExecute$0(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;Lcom/ibotta/api/model/OfferCategoryModel;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->recordDuplicateCategoryData(Lcom/ibotta/api/model/OfferCategoryModel;)V

    return-void
.end method

.method public static synthetic lambda$recordDuplicateCategoryData$1(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;
    .locals 2

    .line 55
    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$1;)V

    .line 56
    invoke-static {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->access$102(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;Ljava/lang/String;)Ljava/lang/String;

    const/4 p1, 0x0

    .line 57
    invoke-static {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->access$002(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;I)I

    .line 59
    iget-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->dupCatMap:Ljava/util/Map;

    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic lambda$trackDuplicateCategoryData$2(Ljava/util/Map$Entry;)Z
    .locals 1

    .line 68
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;

    invoke-static {p0}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->access$000(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;)I

    move-result p0

    const/4 v0, 0x1

    if-le p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static synthetic lambda$trackDuplicateCategoryData$3(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;Ljava/util/Map$Entry;)V
    .locals 4

    .line 70
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;

    const-string v0, "Found duplicate Offer category: %1$s"

    const/4 v1, 0x1

    .line 72
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->access$100(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-static {p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->access$100(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->access$000(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->trackException(Ljava/lang/String;I)V

    return-void
.end method

.method private recordDuplicateCategoryData(Lcom/ibotta/api/model/OfferCategoryModel;)V
    .locals 3

    .line 51
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferCategoryModel;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->dupCatMap:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;

    invoke-static {v1}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v1

    new-instance v2, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;

    invoke-direct {v2, p0, p1, v0}, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava9/util/Optional;->orElseGet(Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;

    .line 63
    invoke-static {p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->access$008(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;)I

    return-void
.end method

.method private trackDuplicateCategoryData()V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->dupCatMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$X-rsFF0KuJ9P_zVbLf--ghW6yUw;->INSTANCE:Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$X-rsFF0KuJ9P_zVbLf--ghW6yUw;

    .line 68
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->filter(Ljava9/util/function/Predicate;)Ljava9/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$LSUo4Yos1-H_yTk938TB0P_6XcU;

    invoke-direct {v1, p0}, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$LSUo4Yos1-H_yTk938TB0P_6XcU;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;)V

    .line 69
    invoke-interface {v0, v1}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    return-void
.end method


# virtual methods
.method public onExecute(Lorg/aspectj/lang/JoinPoint;)V
    .locals 3

    const-string v0, "Looking for duplicate offer categories to track in NewRelic..."

    const/4 v1, 0x0

    .line 33
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->dupCatMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 37
    invoke-interface {p1}, Lorg/aspectj/lang/JoinPoint;->getArgs()[Ljava/lang/Object;

    move-result-object p1

    aget-object p1, p1, v1

    check-cast p1, Ljava/util/List;

    .line 38
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    new-instance v0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$HXRinsk2W0c3ARsajSqqAIy4FB4;

    invoke-direct {v0, p0}, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$HXRinsk2W0c3ARsajSqqAIy4FB4;-><init>(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;)V

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->forEach(Ljava9/util/function/Consumer;)V

    .line 41
    invoke-direct {p0}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->trackDuplicateCategoryData()V

    return-void
.end method

.method public onExecuteProceedingJoinPoint(Lorg/aspectj/lang/ProceedingJoinPoint;)Ljava/lang/Object;
    .locals 0
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method protected trackException(Ljava/lang/String;I)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 79
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Lcom/ibotta/android/view/offer/gallery/DuplicateOfferCategoryException;

    invoke-direct {v1, p1, p2}, Lcom/ibotta/android/view/offer/gallery/DuplicateOfferCategoryException;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method
