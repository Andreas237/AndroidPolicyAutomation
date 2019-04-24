.class Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lretrofit2/Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lretrofit2/Callback<",
        "Lcom/microblink/internal/services/license/LicenseServiceResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/license/LicenseeServiceImpl;

.field final synthetic val$listener:Lcom/microblink/OnCompleteListener;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/license/LicenseeServiceImpl;Lcom/microblink/OnCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;->this$0:Lcom/microblink/internal/services/license/LicenseeServiceImpl;

    iput-object p2, p0, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 2
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
            "Lcom/microblink/internal/services/license/LicenseServiceResponse;",
            ">;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p1}, Lretrofit2/Call;->isCanceled()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const-string p1, "LicenseeServiceImpl"

    invoke-virtual {p2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, p2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "LicenseeServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-static {}, Lcom/microblink/internal/services/license/LicenseeServiceImpl;->access$000()Lcom/microblink/internal/services/license/LicenseServiceResponse;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 4
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
            "Lcom/microblink/internal/services/license/LicenseServiceResponse;",
            ">;",
            "Lretrofit2/Response<",
            "Lcom/microblink/internal/services/license/LicenseServiceResponse;",
            ">;)V"
        }
    .end annotation

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "LicenseeServiceImpl"

    invoke-virtual {p2}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object p2

    invoke-static {p2}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object p2

    new-array v1, p1, [Ljava/lang/Object;

    invoke-static {v0, p2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-static {}, Lcom/microblink/internal/services/license/LicenseeServiceImpl;->access$000()Lcom/microblink/internal/services/license/LicenseServiceResponse;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/microblink/internal/services/license/LicenseServiceResponse;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcom/microblink/internal/services/license/LicenseServiceResponse;->success()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lcom/microblink/internal/services/license/LicenseServiceResponse;->token()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string p2, "LicenseeServiceImpl"

    const-string v0, "license api token failure!"

    new-array v1, p1, [Ljava/lang/Object;

    invoke-static {p2, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-static {}, Lcom/microblink/internal/services/license/LicenseeServiceImpl;->access$000()Lcom/microblink/internal/services/license/LicenseServiceResponse;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-static {}, Lcom/microblink/AccessTokenManager;->getInstance()Lcom/microblink/AccessTokenManager;

    move-result-object v1

    new-instance v2, Lcom/microblink/AccessToken;

    invoke-virtual {p2}, Lcom/microblink/internal/services/license/LicenseServiceResponse;->id()I

    move-result v3

    invoke-direct {v2, v3, v0}, Lcom/microblink/AccessToken;-><init>(ILjava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/microblink/AccessTokenManager;->currentAccessToken(Lcom/microblink/AccessToken;)V

    iget-object v0, p0, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-interface {v0, p2}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_3
    :goto_0
    const-string p2, "LicenseeServiceImpl"

    const-string v0, "license response failure!"

    new-array v1, p1, [Ljava/lang/Object;

    invoke-static {p2, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-static {}, Lcom/microblink/internal/services/license/LicenseeServiceImpl;->access$000()Lcom/microblink/internal/services/license/LicenseServiceResponse;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    const-string v0, "LicenseeServiceImpl"

    invoke-virtual {p2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v0, p2, p1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;->val$listener:Lcom/microblink/OnCompleteListener;

    invoke-static {}, Lcom/microblink/internal/services/license/LicenseeServiceImpl;->access$000()Lcom/microblink/internal/services/license/LicenseServiceResponse;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
