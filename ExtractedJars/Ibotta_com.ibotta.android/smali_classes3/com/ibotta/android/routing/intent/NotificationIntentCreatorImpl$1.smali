.class synthetic Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;
.super Ljava/lang/Object;
.source "NotificationIntentCreatorImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 73
    invoke-static {}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->values()[Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->BONUS:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->OFFER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->RECEIPT:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER_BUYABLE_GIFT_CARD:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->BUYABLE_GIFT_CARD:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x6

    aput v2, v0, v1
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    return-void
.end method
