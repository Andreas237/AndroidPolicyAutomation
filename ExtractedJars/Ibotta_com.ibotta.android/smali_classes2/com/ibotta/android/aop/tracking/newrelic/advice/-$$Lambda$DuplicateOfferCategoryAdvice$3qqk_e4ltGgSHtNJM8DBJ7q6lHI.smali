.class public final synthetic Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;

.field private final synthetic f$1:Ljava/lang/String;

.field private final synthetic f$2:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;->f$0:Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;

    iput-object p2, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;->f$2:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;->f$0:Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;

    iget-object v1, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;->f$1:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/-$$Lambda$DuplicateOfferCategoryAdvice$3qqk_e4ltGgSHtNJM8DBJ7q6lHI;->f$2:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;->lambda$recordDuplicateCategoryData$1(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;Ljava/lang/String;Ljava/lang/String;)Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;

    move-result-object v0

    return-object v0
.end method
