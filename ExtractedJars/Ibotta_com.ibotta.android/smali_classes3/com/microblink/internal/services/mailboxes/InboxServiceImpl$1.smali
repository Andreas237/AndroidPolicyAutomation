.class Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Ljava/util/List<",
        "Lcom/microblink/internal/services/mailboxes/Inbox;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/mailboxes/InboxServiceImpl;

.field final synthetic val$listener:Lcom/microblink/OnCompleteListener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/mailboxes/InboxServiceImpl;Lcom/microblink/OnCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;->this$0:Lcom/microblink/internal/services/mailboxes/InboxServiceImpl;

    iput-object p2, p0, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Lretrofit2/Call;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/Inbox;",
            ">;>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    invoke-interface {p1}, Lretrofit2/Call;->isCanceled()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const-string p1, "InboxServiceImpl"

    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p2}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 2
    .param p1    # Lretrofit2/Call;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lretrofit2/Response;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lretrofit2/Call<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/Inbox;",
            ">;>;",
            "Lretrofit2/Response<",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/mailboxes/Inbox;",
            ">;>;)V"
        }
    .end annotation

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    invoke-static {p2}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1$1;

    invoke-direct {v0, p0}, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1$1;-><init>(Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;)V

    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    iget-object v0, p0, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    if-nez p2, :cond_1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-interface {v0, p2}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_2
    const-string v0, "InboxServiceImpl"

    invoke-virtual {p2}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p2

    invoke-static {p2}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p2

    new-array v1, p1, [Ljava/lang/Object;

    invoke-static {v0, p2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    const-string v0, "InboxServiceImpl"

    invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v0, p2, p1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/internal/services/mailboxes/InboxServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1, p2}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
