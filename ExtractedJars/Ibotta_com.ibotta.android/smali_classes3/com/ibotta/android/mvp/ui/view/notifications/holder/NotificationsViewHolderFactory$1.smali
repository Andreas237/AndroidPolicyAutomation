.class synthetic Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory$1;
.super Ljava/lang/Object;
.source "NotificationsViewHolderFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$ibotta$android$mvp$ui$view$notifications$NotificationsRowType:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 18
    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->values()[Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$notifications$NotificationsRowType:[I

    :try_start_0
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$notifications$NotificationsRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->NOTIFICATION:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$notifications$NotificationsRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->EMPTY_MINE:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$notifications$NotificationsRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->EMPTY_TEAMMATES:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$notifications$NotificationsRowType:[I

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->LOADING_SPINNER:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    invoke-virtual {v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method
