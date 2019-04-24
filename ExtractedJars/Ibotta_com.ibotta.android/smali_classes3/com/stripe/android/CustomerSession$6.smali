.class Lcom/stripe/android/CustomerSession$6;
.super Landroid/os/Handler;
.source "CustomerSession.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/CustomerSession;->createMainThreadHandler()Landroid/os/Handler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/CustomerSession;


# direct methods
.method constructor <init>(Lcom/stripe/android/CustomerSession;Landroid/os/Looper;)V
    .locals 0

    .line 556
    iput-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 559
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 560
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 562
    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x7

    const/4 v2, 0x0

    if-eq p1, v1, :cond_8

    const/16 v1, 0xb

    const/16 v3, 0x190

    if-eq p1, v1, :cond_5

    const/16 v1, 0xd

    if-eq p1, v1, :cond_3

    const/16 v1, 0x11

    if-eq p1, v1, :cond_1

    const/16 v1, 0x13

    if-eq p1, v1, :cond_0

    goto/16 :goto_2

    .line 585
    :cond_0
    instance-of p1, v0, Lcom/stripe/android/model/Customer;

    if-eqz p1, :cond_9

    .line 586
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    check-cast v0, Lcom/stripe/android/model/Customer;

    invoke-static {p1, v0}, Lcom/stripe/android/CustomerSession;->access$302(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/model/Customer;)Lcom/stripe/android/model/Customer;

    .line 587
    new-instance p1, Landroid/content/Intent;

    const-string v0, "shipping_info_saved"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 588
    iget-object v0, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v0}, Lcom/stripe/android/CustomerSession;->access$200(Lcom/stripe/android/CustomerSession;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    .line 589
    invoke-virtual {v0, p1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    goto/16 :goto_2

    .line 608
    :cond_1
    check-cast v0, Lcom/stripe/android/exception/StripeException;

    .line 609
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$700(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 610
    invoke-virtual {v0}, Lcom/stripe/android/exception/StripeException;->getStatusCode()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    .line 612
    :cond_2
    invoke-virtual {v0}, Lcom/stripe/android/exception/StripeException;->getStatusCode()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 613
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$700(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    move-result-object p1

    .line 615
    invoke-virtual {v0}, Lcom/stripe/android/exception/StripeException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    .line 613
    invoke-interface {p1, v3, v0}, Lcom/stripe/android/CustomerSession$SourceRetrievalListener;->onError(ILjava/lang/String;)V

    .line 616
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1, v2}, Lcom/stripe/android/CustomerSession;->access$702(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    .line 617
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-virtual {p1}, Lcom/stripe/android/CustomerSession;->resetUsageTokens()V

    goto/16 :goto_2

    .line 575
    :cond_3
    instance-of p1, v0, Lcom/stripe/android/model/Source;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$700(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 576
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$700(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    move-result-object p1

    check-cast v0, Lcom/stripe/android/model/Source;

    invoke-interface {p1, v0}, Lcom/stripe/android/CustomerSession$SourceRetrievalListener;->onSourceRetrieved(Lcom/stripe/android/model/Source;)V

    .line 580
    :cond_4
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1, v2}, Lcom/stripe/android/CustomerSession;->access$702(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/CustomerSession$SourceRetrievalListener;)Lcom/stripe/android/CustomerSession$SourceRetrievalListener;

    .line 582
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1, v2}, Lcom/stripe/android/CustomerSession;->access$202(Lcom/stripe/android/CustomerSession;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    goto :goto_2

    .line 593
    :cond_5
    instance-of p1, v0, Lcom/stripe/android/exception/StripeException;

    if-eqz p1, :cond_9

    .line 594
    check-cast v0, Lcom/stripe/android/exception/StripeException;

    .line 595
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$600(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 596
    invoke-virtual {v0}, Lcom/stripe/android/exception/StripeException;->getStatusCode()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_1

    .line 598
    :cond_6
    invoke-virtual {v0}, Lcom/stripe/android/exception/StripeException;->getStatusCode()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 599
    :goto_1
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$600(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    move-result-object p1

    .line 601
    invoke-virtual {v0}, Lcom/stripe/android/exception/StripeException;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    .line 599
    invoke-interface {p1, v3, v0}, Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;->onError(ILjava/lang/String;)V

    .line 602
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1, v2}, Lcom/stripe/android/CustomerSession;->access$602(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    .line 604
    :cond_7
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-virtual {p1}, Lcom/stripe/android/CustomerSession;->resetUsageTokens()V

    goto :goto_2

    .line 564
    :cond_8
    instance-of p1, v0, Lcom/stripe/android/model/Customer;

    if-eqz p1, :cond_9

    .line 565
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    check-cast v0, Lcom/stripe/android/model/Customer;

    invoke-static {p1, v0}, Lcom/stripe/android/CustomerSession;->access$302(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/model/Customer;)Lcom/stripe/android/model/Customer;

    .line 566
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$500(Lcom/stripe/android/CustomerSession;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lcom/stripe/android/CustomerSession;->access$402(Lcom/stripe/android/CustomerSession;J)J

    .line 567
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$600(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 568
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1}, Lcom/stripe/android/CustomerSession;->access$600(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v0}, Lcom/stripe/android/CustomerSession;->access$300(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/model/Customer;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;->onCustomerRetrieved(Lcom/stripe/android/model/Customer;)V

    .line 570
    iget-object p1, p0, Lcom/stripe/android/CustomerSession$6;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {p1, v2}, Lcom/stripe/android/CustomerSession;->access$602(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;

    :cond_9
    :goto_2
    return-void
.end method
