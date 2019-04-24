.class Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;
.super Ljava/lang/Object;
.source "AgeVerificationController.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/account/AgeVerificationController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DatePickerDialogClickListener"
.end annotation


# instance fields
.field private datePicker:Landroid/widget/DatePicker;

.field private failureAlertOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

.field private itemView:Landroid/view/View;

.field final synthetic this$0:Lcom/shopkick/app/account/AgeVerificationController;

.field private tileClickListener:Landroid/view/View$OnClickListener;

.field private tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/account/AgeVerificationController;Landroid/widget/DatePicker;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    .line 397
    iput-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 398
    iput-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->datePicker:Landroid/widget/DatePicker;

    .line 399
    iput-object p3, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    .line 400
    iput-object p4, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->itemView:Landroid/view/View;

    .line 401
    iput-object p5, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileClickListener:Landroid/view/View$OnClickListener;

    .line 402
    iput-object p6, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->failureAlertOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    const/16 p1, 0xcc

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_1

    .line 409
    :pswitch_0
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {p2}, Landroid/widget/DatePicker;->getYear()I

    move-result p2

    .line 410
    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v0}, Landroid/widget/DatePicker;->getMonth()I

    move-result v0

    .line 411
    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->datePicker:Landroid/widget/DatePicker;

    invoke-virtual {v1}, Landroid/widget/DatePicker;->getDayOfMonth()I

    move-result v1

    .line 414
    iget-object v2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/shopkick/app/account/AgeVerificationController;->access$002(Lcom/shopkick/app/account/AgeVerificationController;Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 415
    iget-object v2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {v2}, Lcom/shopkick/app/account/AgeVerificationController;->access$000(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/util/Calendar;

    move-result-object v2

    invoke-virtual {v2, p2, v0, v1}, Ljava/util/Calendar;->set(III)V

    .line 416
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p2}, Lcom/shopkick/app/account/AgeVerificationController;->access$000(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/util/Calendar;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p2

    invoke-static {p2}, Lcom/shopkick/app/util/DateUtils;->dateToString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    .line 417
    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {v0}, Lcom/shopkick/app/account/AgeVerificationController;->access$100(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;

    move-result-object v0

    iput-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;->birthdate:Ljava/lang/String;

    .line 418
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p2}, Lcom/shopkick/app/account/AgeVerificationController;->access$200(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/fetchers/api/APIManager;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {v0}, Lcom/shopkick/app/account/AgeVerificationController;->access$100(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/app/fetchers/api/skapi/UserUpdateRequest;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    .line 419
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p2}, Lcom/shopkick/app/account/AgeVerificationController;->access$300(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object p2

    const-string/jumbo v0, "user_birthday"

    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {v1}, Lcom/shopkick/app/account/AgeVerificationController;->access$000(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lcom/shopkick/app/util/DateUtils;->dateToString(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p2}, Lcom/shopkick/app/account/AgeVerificationController;->access$300(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object p2

    const-string/jumbo v0, "user_bithday_last_updated_timestamp_ms"

    .line 421
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    .line 420
    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/application/AppPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p2}, Lcom/shopkick/app/account/AgeVerificationController;->access$000(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/util/Calendar;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p2

    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    .line 424
    invoke-static {v1}, Lcom/shopkick/app/account/AgeVerificationController;->access$000(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v1

    iget-object v2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    .line 425
    invoke-static {v2}, Lcom/shopkick/app/account/AgeVerificationController;->access$000(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/util/Calendar;

    move-result-object v2

    const/4 v3, 0x5

    invoke-virtual {v2, v3}, Ljava/util/Calendar;->get(I)I

    move-result v2

    .line 423
    invoke-static {p2, v1, v2}, Lcom/shopkick/app/account/AgeVerificationController;->access$400(III)I

    move-result p2

    .line 426
    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->minimumAgeForKicks:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt p2, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 428
    :goto_0
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p2}, Lcom/shopkick/app/account/AgeVerificationController;->access$500(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 429
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/16 v1, 0x37

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p2, p1, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 430
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 431
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 432
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p1}, Lcom/shopkick/app/account/AgeVerificationController;->access$000(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setUserSpecifiedBirthdateMs(Ljava/lang/Long;)V

    .line 433
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p1}, Lcom/shopkick/app/account/AgeVerificationController;->access$500(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_1
    if-eqz v0, :cond_2

    .line 437
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileClickListener:Landroid/view/View$OnClickListener;

    if-eqz p1, :cond_2

    .line 438
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->itemView:Landroid/view/View;

    invoke-interface {p1, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    return-void

    .line 442
    :cond_2
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object v0, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->itemView:Landroid/view/View;

    iget-object v1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileClickListener:Landroid/view/View$OnClickListener;

    iget-object v2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->failureAlertOnDismissListener:Landroid/content/DialogInterface$OnDismissListener;

    invoke-static {p1, p2, v0, v1, v2}, Lcom/shopkick/app/account/AgeVerificationController;->access$600(Lcom/shopkick/app/account/AgeVerificationController;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Landroid/view/View;Landroid/view/View$OnClickListener;Landroid/content/DialogInterface$OnDismissListener;)V

    goto :goto_1

    .line 448
    :pswitch_1
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p2}, Lcom/shopkick/app/account/AgeVerificationController;->access$700(Lcom/shopkick/app/account/AgeVerificationController;)Lcom/shopkick/app/util/NotificationCenter;

    move-result-object p2

    const-string v0, "ageVerificationCanceledEvent"

    invoke-virtual {p2, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 449
    iget-object p2, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p2}, Lcom/shopkick/app/account/AgeVerificationController;->access$500(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/lang/ref/WeakReference;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 450
    new-instance p2, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/16 v0, 0x38

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p2, p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 451
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->productFamilyId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setProductFamilyId(Ljava/lang/String;)V

    .line 452
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->tileInfo:Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->videoId:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVideoId(Ljava/lang/String;)V

    .line 453
    iget-object p1, p0, Lcom/shopkick/app/account/AgeVerificationController$DatePickerDialogClickListener;->this$0:Lcom/shopkick/app/account/AgeVerificationController;

    invoke-static {p1}, Lcom/shopkick/app/account/AgeVerificationController;->access$500(Lcom/shopkick/app/account/AgeVerificationController;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/screens/AppScreen;

    iget-object p1, p1, Lcom/shopkick/app/screens/AppScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    :cond_3
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
