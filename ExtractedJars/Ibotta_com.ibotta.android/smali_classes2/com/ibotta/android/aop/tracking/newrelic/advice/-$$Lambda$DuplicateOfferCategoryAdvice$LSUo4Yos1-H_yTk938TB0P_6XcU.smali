.class public final synthetic Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$LSUo4Yos1-H_yTk938TB0P_6XcU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$LSUo4Yos1-H_yTk938TB0P_6XcU;->f$0:Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$LSUo4Yos1-H_yTk938TB0P_6XcU;->f$0:Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {v0, p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->lambda$trackDuplicateCategoryData$3(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;Ljava/util/Map$Entry;)V

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
