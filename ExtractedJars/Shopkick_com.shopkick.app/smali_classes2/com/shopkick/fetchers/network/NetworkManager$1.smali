.class Lcom/shopkick/fetchers/network/NetworkManager$1;
.super Lnet/toddm/comm/DefaultRetryPolicyProvider;
.source "NetworkManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/network/NetworkManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/fetchers/network/NetworkManager;


# direct methods
.method constructor <init>(Lcom/shopkick/fetchers/network/NetworkManager;Lnet/toddm/cache/LoggingProvider;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lcom/shopkick/fetchers/network/NetworkManager$1;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-direct {p0, p2}, Lnet/toddm/comm/DefaultRetryPolicyProvider;-><init>(Lnet/toddm/cache/LoggingProvider;)V

    return-void
.end method


# virtual methods
.method public shouldRetry(Lnet/toddm/comm/Work;Lnet/toddm/comm/Response;)Lnet/toddm/comm/RetryProfile;
    .locals 15

    move-object v1, p0

    .line 185
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_3

    .line 187
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 188
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "Checking for retry [id:%1$d responseCode:%2$d retryCount:%3$d hasToken:%4$s] BODY: %5$s"

    const/4 v5, 0x5

    new-array v5, v5, [Ljava/lang/Object;

    .line 190
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v6

    invoke-virtual {v6}, Lnet/toddm/comm/Request;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    .line 191
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v5, v8

    const/4 v6, 0x2

    .line 192
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v9

    invoke-virtual {v9}, Lnet/toddm/comm/Request;->getRetryCountFromResponse()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v5, v6

    const/4 v6, 0x3

    .line 193
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v9

    if-eqz v9, :cond_0

    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v9

    const-string v10, "X-Token"

    invoke-interface {v9, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move v9, v8

    goto :goto_0

    :cond_0
    move v9, v7

    :goto_0
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    aput-object v9, v5, v6

    const/4 v6, 0x4

    .line 194
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getResponseBody()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v5, v6

    .line 188
    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 198
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getResponseCode()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x191

    if-ne v0, v2, :cond_3

    .line 199
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getRetryCountFromResponse()I

    move-result v0

    if-ge v0, v8, :cond_3

    .line 200
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 201
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v2, "X-Auth-Error"

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 202
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v2, "X-Token"

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 203
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 204
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "Retrying request due to 401 auth failure [id:%1$d]"

    new-array v5, v8, [Ljava/lang/Object;

    .line 206
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v6

    invoke-virtual {v6}, Lnet/toddm/comm/Request;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    .line 204
    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->d(JLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v2, 0x0

    .line 211
    invoke-virtual/range {p2 .. p2}, Lnet/toddm/comm/Response;->getHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v3, "X-Token"

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 212
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, v1, Lcom/shopkick/fetchers/network/NetworkManager$1;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {v0}, Lcom/shopkick/fetchers/network/NetworkManager;->access$000(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 216
    :try_start_0
    invoke-static {}, Lcom/shopkick/fetchers/network/NetworkManager;->access$100()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v4

    invoke-virtual {v4}, Lnet/toddm/comm/Request;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 217
    iget-object v4, v1, Lcom/shopkick/fetchers/network/NetworkManager$1;->this$0:Lcom/shopkick/fetchers/network/NetworkManager;

    invoke-static {v4}, Lcom/shopkick/fetchers/network/NetworkManager;->access$000(Lcom/shopkick/fetchers/network/NetworkManager;)Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;

    move-result-object v4

    .line 218
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v5

    invoke-virtual {v5}, Lnet/toddm/comm/Request;->getUri()Ljava/net/URI;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v5

    .line 219
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v6

    invoke-virtual {v6}, Lnet/toddm/comm/Request;->getPostData()[B

    move-result-object v6

    .line 217
    invoke-interface {v4, v3, v5, v6, v0}, Lcom/shopkick/fetchers/network/NetworkManager$ServerTokenListener;->updateServerToken(Ljava/lang/String;Ljava/lang/String;[BI)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v12, v0

    .line 222
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v9

    sget-object v0, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v10

    const-string v13, "[request:%1$d] MAC error"

    new-array v14, v8, [Ljava/lang/Object;

    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v14, v7

    invoke-virtual/range {v9 .. v14}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    :cond_1
    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 227
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v0

    sget-object v2, Lcom/shopkick/logging/Area;->COMM:Lcom/shopkick/logging/Area;

    .line 228
    invoke-virtual {v2}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v2

    const-string v4, "[request:%1$d] Received 401 but failed new MAC generation"

    new-array v5, v8, [Ljava/lang/Object;

    .line 230
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v6

    invoke-virtual {v6}, Lnet/toddm/comm/Request;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v7

    .line 228
    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 234
    :cond_2
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v4, "X-Mac"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    invoke-interface/range {p1 .. p1}, Lnet/toddm/comm/Work;->getRequest()Lnet/toddm/comm/Request;

    move-result-object v0

    invoke-virtual {v0}, Lnet/toddm/comm/Request;->getHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v2, "X-K"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    new-instance v0, Lnet/toddm/comm/RetryProfile;

    const-wide/16 v2, 0x1

    invoke-direct {v0, v8, v2, v3}, Lnet/toddm/comm/RetryProfile;-><init>(ZJ)V

    return-object v0

    .line 242
    :cond_3
    :goto_2
    invoke-super/range {p0 .. p2}, Lnet/toddm/comm/DefaultRetryPolicyProvider;->shouldRetry(Lnet/toddm/comm/Work;Lnet/toddm/comm/Response;)Lnet/toddm/comm/RetryProfile;

    move-result-object v0

    return-object v0
.end method
