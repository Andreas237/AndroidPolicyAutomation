.class synthetic Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking$1;
.super Ljava/lang/Object;
.source "NotificationTracking.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking;
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

    .line 48
    invoke-static {}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->values()[Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->BONUS:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationTracking$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->OFFER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method
