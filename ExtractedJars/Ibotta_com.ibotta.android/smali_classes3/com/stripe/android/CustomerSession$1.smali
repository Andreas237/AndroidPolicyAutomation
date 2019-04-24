.class Lcom/stripe/android/CustomerSession$1;
.super Ljava/lang/Object;
.source "CustomerSession.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/CustomerSession;->addCustomerSource(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
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

.field final synthetic val$sourceType:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/stripe/android/CustomerSession;Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 333
    iput-object p1, p0, Lcom/stripe/android/CustomerSession$1;->this$0:Lcom/stripe/android/CustomerSession;

    iput-object p2, p0, Lcom/stripe/android/CustomerSession$1;->val$contextWeakReference:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/stripe/android/CustomerSession$1;->val$key:Lcom/stripe/android/EphemeralKey;

    iput-object p4, p0, Lcom/stripe/android/CustomerSession$1;->val$productUsageTokens:Ljava/util/List;

    iput-object p5, p0, Lcom/stripe/android/CustomerSession$1;->val$sourceId:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/CustomerSession$1;->val$sourceType:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 337
    :try_start_0
    iget-object v0, p0, Lcom/stripe/android/CustomerSession$1;->val$contextWeakReference:Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/stripe/android/CustomerSession$1;->val$key:Lcom/stripe/android/EphemeralKey;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/stripe/android/CustomerSession$1;->val$productUsageTokens:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v3, p0, Lcom/stripe/android/CustomerSession$1;->val$sourceId:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/CustomerSession$1;->val$sourceType:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/CustomerSession$1;->this$0:Lcom/stripe/android/CustomerSession;

    .line 343
    invoke-static {v5}, Lcom/stripe/android/CustomerSession;->access$000(Lcom/stripe/android/CustomerSession;)Lcom/stripe/android/CustomerSession$StripeApiProxy;

    move-result-object v5

    .line 337
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/CustomerSession;->addCustomerSourceWithKey(Ljava/lang/ref/WeakReference;Lcom/stripe/android/EphemeralKey;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/CustomerSession$StripeApiProxy;)Lcom/stripe/android/model/Source;

    move-result-object v0

    .line 344
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$1;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    .line 345
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$1;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Lcom/stripe/android/exception/StripeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 348
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$1;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v1}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v1

    const/16 v2, 0x11

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 349
    iget-object v2, p0, Lcom/stripe/android/CustomerSession$1;->this$0:Lcom/stripe/android/CustomerSession;

    invoke-static {v2}, Lcom/stripe/android/CustomerSession;->access$100(Lcom/stripe/android/CustomerSession;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 350
    iget-object v1, p0, Lcom/stripe/android/CustomerSession$1;->val$contextWeakReference:Ljava/lang/ref/WeakReference;

    invoke-static {v1, v0}, Lcom/stripe/android/CustomerSession;->sendErrorIntent(Ljava/lang/ref/WeakReference;Lcom/stripe/android/exception/StripeException;)V

    :goto_0
    return-void
.end method
