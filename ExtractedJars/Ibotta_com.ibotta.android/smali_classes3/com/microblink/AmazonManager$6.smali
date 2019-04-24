.class Lcom/microblink/AmazonManager$6;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/AmazonManager;

.field final synthetic val$page:Lcom/microblink/internal/amazon/AmazonPage;

.field final synthetic val$view:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(Lcom/microblink/AmazonManager;Lcom/microblink/internal/amazon/AmazonPage;Landroid/webkit/WebView;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    iput-object p2, p0, Lcom/microblink/AmazonManager$6;->val$page:Lcom/microblink/internal/amazon/AmazonPage;

    iput-object p3, p0, Lcom/microblink/AmazonManager$6;->val$view:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/microblink/AmazonManager$6;->onReceiveValue(Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveValue(Ljava/lang/String;)V
    .locals 10

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_14

    const-string v1, "null"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p1, "AmazonManager"

    const-string v1, "function returned a null response"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {p1}, Lcom/microblink/internal/services/amazon/AmazonUtils;->unescaped(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v1}, Lcom/microblink/AmazonManager;->access$600(Lcom/microblink/AmazonManager;)Lcom/google/gson/Gson;

    move-result-object v1

    const-class v2, Lcom/microblink/internal/amazon/AmazonResults;

    instance-of v3, v1, Lcom/google/gson/Gson;

    if-nez v3, :cond_1

    invoke-virtual {v1, p1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_1
    check-cast v1, Lcom/google/gson/Gson;

    invoke-static {v1, p1, v2}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->fromJson(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Lcom/microblink/internal/amazon/AmazonResults;

    invoke-virtual {p1}, Lcom/microblink/internal/amazon/AmazonResults;->error()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v1}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lcom/microblink/internal/amazon/AmazonResults;->error()Ljava/lang/String;

    move-result-object p1

    const-string v1, "invalid_email"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object p1

    sget-object v1, Lcom/microblink/AmazonException;->INVALID_EMAIL:Lcom/microblink/AmazonException;

    invoke-interface {p1, v1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    return-void

    :cond_2
    const-string v1, "invalid_password"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object p1

    sget-object v1, Lcom/microblink/AmazonException;->INVALID_PASSWORD:Lcom/microblink/AmazonException;

    invoke-interface {p1, v1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    return-void

    :cond_3
    const-string v1, "invalid_cookie"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object p1

    sget-object v1, Lcom/microblink/AmazonException;->INVALID_PASSWORD:Lcom/microblink/AmazonException;

    invoke-interface {p1, v1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    return-void

    :cond_4
    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object p1

    sget-object v1, Lcom/microblink/AmazonException;->PARSING:Lcom/microblink/AmazonException;

    invoke-interface {p1, v1}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    :cond_5
    return-void

    :cond_6
    iget-object v1, p0, Lcom/microblink/AmazonManager$6;->val$page:Lcom/microblink/internal/amazon/AmazonPage;

    sget-object v2, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_HISTORY:Lcom/microblink/internal/amazon/AmazonPage;

    if-ne v1, v2, :cond_11

    invoke-virtual {p1}, Lcom/microblink/internal/amazon/AmazonResults;->orders()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_e

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/microblink/internal/services/amazon/AmazonOrder;

    invoke-virtual {v2}, Lcom/microblink/internal/services/amazon/AmazonOrder;->orderNumber()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    const-string v2, "AmazonManager"

    const-string v3, "order number can\'t be found for a given order."

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v7

    if-nez v7, :cond_b

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/microblink/internal/services/amazon/AmazonShipment;

    invoke-virtual {v7}, Lcom/microblink/internal/services/amazon/AmazonShipment;->status()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_a

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {v7}, Lcom/microblink/internal/services/amazon/AmazonShipment;->seeAllLink()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_9

    move-object v6, v7

    goto :goto_2

    :cond_b
    const-string v5, ","

    invoke-static {v5, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v5}, Lcom/microblink/AmazonManager;->access$100(Lcom/microblink/AmazonManager;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v5, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v5}, Lcom/microblink/AmazonManager;->access$100(Lcom/microblink/AmazonManager;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_c

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_c
    iget-object v5, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v5}, Lcom/microblink/AmazonManager;->access$700(Lcom/microblink/AmazonManager;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_d

    iget-object v5, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v5}, Lcom/microblink/AmazonManager;->access$800(Lcom/microblink/AmazonManager;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_d
    iget-object v2, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v2}, Lcom/microblink/AmazonManager;->access$100(Lcom/microblink/AmazonManager;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_e
    invoke-virtual {p1}, Lcom/microblink/internal/amazon/AmazonResults;->aborted()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {p1}, Lcom/microblink/internal/amazon/AmazonResults;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_f

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$000(Lcom/microblink/AmazonManager;)Ljava/lang/String;

    move-result-object p1

    const-string v1, " goToNext();"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/microblink/AmazonManager$6;->val$view:Landroid/webkit/WebView;

    new-instance v2, Lcom/microblink/AmazonManager$6$1;

    invoke-direct {v2, p0}, Lcom/microblink/AmazonManager$6$1;-><init>(Lcom/microblink/AmazonManager$6;)V

    invoke-virtual {v1, p1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void

    :cond_f
    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$800(Lcom/microblink/AmazonManager;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_10

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$900(Lcom/microblink/AmazonManager;)V

    return-void

    :cond_10
    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$1000(Lcom/microblink/AmazonManager;)V

    return-void

    :cond_11
    iget-object v1, p0, Lcom/microblink/AmazonManager$6;->val$page:Lcom/microblink/internal/amazon/AmazonPage;

    sget-object v2, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_DETAILS:Lcom/microblink/internal/amazon/AmazonPage;

    if-ne v1, v2, :cond_13

    iget-object v1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {v1}, Lcom/microblink/AmazonManager;->access$800(Lcom/microblink/AmazonManager;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/Utility;->getFirst(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/amazon/AmazonOrder;

    if-eqz v1, :cond_12

    invoke-virtual {p1}, Lcom/microblink/internal/amazon/AmazonResults;->shipments()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/microblink/internal/services/amazon/AmazonOrder;->shipments(Ljava/util/List;)V

    invoke-virtual {p1}, Lcom/microblink/internal/amazon/AmazonResults;->rawHtml()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/microblink/internal/services/amazon/AmazonOrder;->rawHtml(Ljava/lang/String;)V

    :cond_12
    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$800(Lcom/microblink/AmazonManager;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$900(Lcom/microblink/AmazonManager;)V

    return-void

    :cond_13
    sget-object p1, Lcom/microblink/internal/amazon/AmazonPage;->PRODUCT:Lcom/microblink/internal/amazon/AmazonPage;

    return-void

    :cond_14
    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->val$page:Lcom/microblink/internal/amazon/AmazonPage;

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->ORDER_HISTORY:Lcom/microblink/internal/amazon/AmazonPage;

    if-eq p1, v1, :cond_15

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->val$page:Lcom/microblink/internal/amazon/AmazonPage;

    sget-object v1, Lcom/microblink/internal/amazon/AmazonPage;->PRODUCT:Lcom/microblink/internal/amazon/AmazonPage;

    if-ne p1, v1, :cond_16

    :cond_15
    const-string p1, "AmazonManager"

    const-string v1, "Return val nil when results expected"

    new-array v2, v0, [Ljava/lang/Object;

    invoke-static {p1, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_16
    return-void

    :catch_0
    move-exception p1

    const-string v1, "AmazonManager"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object p1

    if-eqz p1, :cond_17

    iget-object p1, p0, Lcom/microblink/AmazonManager$6;->this$0:Lcom/microblink/AmazonManager;

    invoke-static {p1}, Lcom/microblink/AmazonManager;->access$400(Lcom/microblink/AmazonManager;)Lcom/microblink/AmazonCallback;

    move-result-object p1

    sget-object v0, Lcom/microblink/AmazonException;->PARSING:Lcom/microblink/AmazonException;

    invoke-interface {p1, v0}, Lcom/microblink/AmazonCallback;->onException(Lcom/microblink/AmazonException;)V

    :cond_17
    return-void
.end method
