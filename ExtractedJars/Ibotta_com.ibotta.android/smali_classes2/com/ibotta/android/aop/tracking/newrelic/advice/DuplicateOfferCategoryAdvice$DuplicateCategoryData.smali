.class Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;
.super Ljava/lang/Object;
.source "DuplicateOfferCategoryAdvice.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DuplicateCategoryData"
.end annotation


# instance fields
.field private count:I

.field private name:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 83
    iput-object v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->name:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$1;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;)I
    .locals 0

    .line 82
    iget p0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->count:I

    return p0
.end method

.method static synthetic access$002(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;I)I
    .locals 0

    .line 82
    iput p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->count:I

    return p1
.end method

.method static synthetic access$008(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;)I
    .locals 2

    .line 82
    iget v0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->count:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->count:I

    return v0
.end method

.method static synthetic access$100(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;)Ljava/lang/String;
    .locals 0

    .line 82
    iget-object p0, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->name:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice$DuplicateCategoryData;->name:Ljava/lang/String;

    return-object p1
.end method
