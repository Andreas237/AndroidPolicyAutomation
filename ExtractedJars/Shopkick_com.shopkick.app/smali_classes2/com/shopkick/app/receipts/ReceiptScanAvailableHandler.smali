.class public Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;
.super Ljava/lang/Object;
.source "ReceiptScanAvailableHandler.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# static fields
.field public static final KICKBATE_ITEMS_AVAILABLE_KEY:Ljava/lang/String; = "kickbateItemsPresent"

.field private static final NOTIFICATION_DELAY_DEFAULT_IN_SECONDS:I = 0x1c20

.field public static final NOTIFICATION_ID:Ljava/lang/String; = "receipt_scan_reminder"

.field public static final RECEIPT_SCAN_AVAILABLE_EVENT_ARGS_KEY:Ljava/lang/String; = "receiptScanAvailable"

.field public static final RECEIPT_SCAN_AVAILABLE_LOCATION_NAME:Ljava/lang/String; = "receiptScanAvailableLocationName"

.field public static final RETAILER_RECEIPT_KICKS_KEY:Ljava/lang/String; = "retailerReceiptPresent"


# instance fields
.field private final alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

.field private final clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/util/AlarmScheduler;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->context:Landroid/content/Context;

    .line 49
    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 50
    iput-object p3, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    return-void
.end method


# virtual methods
.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ScanBCSucceeded"

    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1}, Lcom/shopkick/app/util/FeatureFlagHelper;->isPostScanReminderEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 59
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string p2, "receipt_scan_reminder"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/AlarmScheduler;->cancel(Ljava/lang/String;)V

    return-void

    .line 66
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->context:Landroid/content/Context;

    const v0, 0x7f110036

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 67
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->context:Landroid/content/Context;

    const v0, 0x7f110547

    .line 68
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 69
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->context:Landroid/content/Context;

    const v0, 0x7f110544

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x1

    const/16 p1, 0x78

    .line 74
    invoke-static {}, Lcom/shopkick/app/util/FeatureFlagHelper;->enableDayNotifications()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p1, 0x9

    const/16 v0, 0x12

    const/16 v1, 0x1c20

    .line 75
    iget-object v2, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {p1, v0, v1, v2}, Lcom/shopkick/app/util/DateUtils;->getNextTimeToNotify(IIILcom/shopkick/app/application/ClientFlagsManager;)I

    move-result p1

    move v3, p1

    goto :goto_0

    :cond_1
    move v3, p1

    :goto_0
    const-string p1, "receiptScanAvailableLocationName"

    .line 81
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v0, "kickbateItemsPresent"

    .line 85
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "kickbateItemsPresent"

    .line 86
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v2, "receipt_scan_reminder"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v9}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    goto :goto_1

    :cond_2
    const-string v0, "retailerReceiptPresent"

    .line 96
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "retailerReceiptPresent"

    .line 97
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 99
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    iget-object p2, p2, Lcom/shopkick/app/application/ClientFlagsManager;->clientFlags:Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;->disableKicksForRetailerReceipts:Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x1

    xor-int/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/TypeUtils;->isTrue(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    if-eqz p1, :cond_3

    .line 101
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->context:Landroid/content/Context;

    const v1, 0x7f110545

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v0, v2

    .line 102
    invoke-virtual {p2, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    move-object v6, p1

    :cond_3
    const/4 v9, 0x1

    .line 106
    iget-object v1, p0, Lcom/shopkick/app/receipts/ReceiptScanAvailableHandler;->alarmScheduler:Lcom/shopkick/app/util/AlarmScheduler;

    const-string v2, "receipt_scan_reminder"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v9}, Lcom/shopkick/app/util/AlarmScheduler;->scheduleAfterMins(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    :cond_4
    :goto_1
    return-void
.end method
