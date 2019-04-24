.class Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->cancelRequests(Landroid/content/Context;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/leisen/wallet/sdk/http/AsyncHttpClient;

.field final synthetic val$c:Landroid/content/Context;

.field final synthetic val$mayInterruptIfRunningParam:Z


# direct methods
.method constructor <init>(Lcom/leisen/wallet/sdk/http/AsyncHttpClient;Landroid/content/Context;Z)V
    .locals 0

    .line 316
    iput-object p1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;->this$0:Lcom/leisen/wallet/sdk/http/AsyncHttpClient;

    iput-object p2, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;->val$c:Landroid/content/Context;

    iput-boolean p3, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;->val$mayInterruptIfRunningParam:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 320
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;->this$0:Lcom/leisen/wallet/sdk/http/AsyncHttpClient;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->access$000(Lcom/leisen/wallet/sdk/http/AsyncHttpClient;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;->val$c:Landroid/content/Context;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 321
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/leisen/wallet/sdk/http/RequestHandle;

    .line 322
    iget-boolean v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;->val$mayInterruptIfRunningParam:Z

    invoke-virtual {v4, v0}, Lcom/leisen/wallet/sdk/http/RequestHandle;->cancel(Z)Z

    .line 323
    goto :goto_0

    .line 324
    :cond_0
    iget-object v0, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;->this$0:Lcom/leisen/wallet/sdk/http/AsyncHttpClient;

    invoke-static {v0}, Lcom/leisen/wallet/sdk/http/AsyncHttpClient;->access$000(Lcom/leisen/wallet/sdk/http/AsyncHttpClient;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/leisen/wallet/sdk/http/AsyncHttpClient$1;->val$c:Landroid/content/Context;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    return-void
.end method
