.class public Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory;
.super Ljava/lang/Object;
.source "NewRelicTrackingAdviceFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createAdvice(Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;)Lcom/ibotta/android/aop/JoinPointAdvice;
    .locals 1

    .line 13
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingAdviceFactory$1;->$SwitchMap$com$ibotta$android$aop$tracking$newrelic$NewRelicTrackingType:[I

    invoke-virtual {p1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTrackingType;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 25
    new-instance p1, Lcom/ibotta/android/aop/NoOpAdvice;

    invoke-direct {p1}, Lcom/ibotta/android/aop/NoOpAdvice;-><init>()V

    goto :goto_0

    .line 21
    :pswitch_0
    new-instance p1, Lcom/ibotta/android/aop/tracking/newrelic/advice/CashOutOptionDisabledAdvice;

    invoke-direct {p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/CashOutOptionDisabledAdvice;-><init>()V

    goto :goto_0

    .line 18
    :pswitch_1
    new-instance p1, Lcom/ibotta/android/aop/tracking/newrelic/advice/EmptyGalleryAdvice;

    invoke-direct {p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/EmptyGalleryAdvice;-><init>()V

    goto :goto_0

    .line 15
    :pswitch_2
    new-instance p1, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;

    invoke-direct {p1}, Lcom/ibotta/android/aop/tracking/newrelic/advice/DuplicateOfferCategoryAdvice;-><init>()V

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
