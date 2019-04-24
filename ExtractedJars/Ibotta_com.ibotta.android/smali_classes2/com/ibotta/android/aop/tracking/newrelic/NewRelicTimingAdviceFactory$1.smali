.class synthetic Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory$1;
.super Ljava/lang/Object;
.source "NewRelicTimingAdviceFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$aop$tracking$newrelic$NewRelicTimingType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 22
    invoke-static {}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->values()[Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory$1;->$SwitchMap$com$ibotta$android$aop$tracking$newrelic$NewRelicTimingType:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory$1;->$SwitchMap$com$ibotta$android$aop$tracking$newrelic$NewRelicTimingType:[I

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->FIRST_CONTENT:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    invoke-virtual {v1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory$1;->$SwitchMap$com$ibotta$android$aop$tracking$newrelic$NewRelicTimingType:[I

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->PWI_BARCODE_LOAD:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    invoke-virtual {v1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingAdviceFactory$1;->$SwitchMap$com$ibotta$android$aop$tracking$newrelic$NewRelicTimingType:[I

    sget-object v1, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->NO_OP:Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;

    invoke-virtual {v1}, Lcom/ibotta/android/aop/tracking/newrelic/NewRelicTimingType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void
.end method
