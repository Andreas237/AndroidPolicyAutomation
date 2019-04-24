.class Lcom/stripe/android/CustomerSession$5;
.super Ljava/lang/Object;
.source "CustomerSession.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/CustomerSession;->updateCustomer(Lcom/stripe/android/EphemeralKey;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/CustomerSession;

.field final synthetic val$key:Lcom/stripe/android/EphemeralKey;


# direct methods
.method constructor <init>(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/EphemeralKey;)V
    .locals 0

    .line 451
    iput-object p1, p0, Lcom/stripe/android/CustomerSession$5;->this$0:Lcom/stripe/android/CustomerSession;

    iput-object p2, p0, Lcom/stripe/android/CustomerSession$5;->val$key:Lcom/stripe/android/EphemeralKey;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 455
    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/CustomerSession$5;->this$0:Lcom/stripe/android/CustomerSession;

    .line 456
    invoke-static {v0}, Lcom/stripe/android/CustomerSession;->access$200(Lcom/stripe/android/CustomerSession;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/CustomerSession$5;->val$key:Lcom/stripe/android/EphemeralKey;

    iget-object v2, p0, Lcom/stripe/android/CustomerSession$5;->this$0:Lcom/stripe/android/CustomerSession;

    .line 458
    invoke-static {v2}, Lcom/stripe/android/CustomerSession;->access$000(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$StripeApiProxy;

    move-result-object v2

    .line 455
    invoke-static {v0, v1, v2}, Lcom/stripe/android/CustomerSession;->retrieveCustomerWithKey(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/CustomerSession$StripeApiProxy;)Lcom/stripe/android/model/Customer;

    move-result-object v0

    .line 459
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$5;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 460
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$5;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Lcom/stripe/android/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 462
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$5;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 463
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$5;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :goto_0
    return-void
.end method
