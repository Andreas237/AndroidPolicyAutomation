.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GiftCardClickListener"
.end annotation


# instance fields
.field private currentIndex:I

.field private horizontalListPos:I

.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

.field private verticalListPos:I


# direct methods
.method public constructor <init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;III)V
    .locals 0

    .line 326
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 327
    iput p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->currentIndex:I

    .line 328
    iput p3, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->verticalListPos:I

    .line 329
    iput p4, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->horizontalListPos:I

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 338
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Landroid/view/View;

    move-result-object v0

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$200(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$202(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;Z)Z

    .line 344
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$402(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;Landroid/view/View;)Landroid/view/View;

    .line 347
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-static {v0, p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$302(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;Landroid/view/View;)Landroid/view/View;

    .line 348
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    iget v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->currentIndex:I

    invoke-static {p1, v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$502(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;I)I

    .line 351
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x3f

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x1a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 352
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$600(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->currentIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;->rewardId:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedRewardId(Ljava/lang/String;)V

    .line 353
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$600(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->currentIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;

    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;->displayName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setSelectedRewardName(Ljava/lang/String;)V

    .line 354
    iget v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->verticalListPos:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setVerticalListDataPos(Ljava/lang/Integer;)V

    .line 355
    iget v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->horizontalListPos:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setHorizontalListDataPos(Ljava/lang/Integer;)V

    .line 356
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-static {v0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$700(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Lcom/shopkick/app/logging/UserEventLogger;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 359
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-static {p1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->access$800(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method
