.class Lcom/stripe/android/CustomerSession$2;
.super Ljava/lang/Object;
.source "CustomerSession.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/CustomerSession;->deleteCustomerSource(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/CustomerSession;

.field final synthetic val$contextWeakReference:Ljava/lang/ref/WeakReference;

.field final synthetic val$key:Lcom/stripe/android/EphemeralKey;

.field final synthetic val$productUsageTokens:Ljava/util/List;

.field final synthetic val$sourceId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/stripe/android/CustomerSession;Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;)V
    .locals 0

    .line 369
    iput-object p1, p0, Lcom/stripe/android/CustomerSession$2;->this$0:Lcom/stripe/android/CustomerSession;

    iput-object p2, p0, Lcom/stripe/android/CustomerSession$2;->val$contextWeakReference:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/stripe/android/CustomerSession$2;->val$key:Lcom/stripe/android/EphemeralKey;

    iput-object p4, p0, Lcom/stripe/android/CustomerSession$2;->val$productUsageTokens:Ljava/util/List;

    iput-object p5, p0, Lcom/stripe/android/CustomerSession$2;->val$sourceId:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 373
    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/CustomerSession$2;->val$contextWeakReference:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/stripe/android/CustomerSession$2;->val$key:Lcom/stripe/android/EphemeralKey;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/stripe/android/CustomerSession$2;->val$productUsageTokens:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Lcom/stripe/android/CustomerSession$2;->val$sourceId:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/CustomerSession$2;->this$0:Lcom/stripe/android/CustomerSession;

    .line 378
    invoke-static {v4}, Lcom/stripe/android/CustomerSession;->access$000(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$StripeApiProxy;

    move-result-object v4

    .line 373
    invoke-static {v0, v1, v2, v3, v4}, Lcom/stripe/android/CustomerSession;->deleteCustomerSourceWithKey(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;Lcom/stripe/android/CustomerSession$StripeApiProxy;)Lcom/stripe/android/model/Source;

    move-result-object v0

    .line 379
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$2;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 380
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$2;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Lcom/stripe/android/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 383
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$2;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x11

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 384
    iget-object v2, p0, Lcom/stripe/android/CustomerSession$2;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v2}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 385
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$2;->val$contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-static {v1, v0}, Lcom/stripe/android/CustomerSession;->sendErrorIntent(Ljava/lang/ref/WeakReference;Lcom/stripe/android/exception/StripeException;)V

    :goto_0
    return-void
.end method
