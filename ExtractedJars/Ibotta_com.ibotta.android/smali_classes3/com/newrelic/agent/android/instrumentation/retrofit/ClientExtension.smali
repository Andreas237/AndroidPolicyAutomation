.class public Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;
.super Ljava/lang/Object;
.source "ClientExtension.java"

# interfaces
.implements Lretrofit/client/Client;


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private impl:Lretrofit/client/Client;

.field private request:Lretrofit/client/Request;

.field private transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Lretrofit/client/Client;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->impl:Lretrofit/client/Client;

    return-void
.end method

.method private checkResponse(Lretrofit/client/Response;)V
    .locals 1

    .line 64
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 65
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/retrofit/RetrofitTransactionStateUtil;->inspectAndInstrumentResponse(Lcom/newrelic/agent/android/instrumentation/TransactionState;Lretrofit/client/Response;)V

    :cond_0
    return-void
.end method

.method private setConnectivityHeaders(Lretrofit/client/Request;)Lretrofit/client/Request;
    .locals 5

    .line 52
    invoke-static {}, Lcom/newrelic/agent/android/Agent;->getCrossProcessId()Ljava/lang/String;

    move-result-object v0

    .line 53
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lretrofit/client/Request;->getHeaders()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 54
    sget-object v2, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v2}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 55
    new-instance v2, Lretrofit/client/Header;

    const-string v3, "newrelic"

    iget-object v4, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {v4}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object v4

    invoke-virtual {v4}, Lcom/newrelic/agent/android/connectivity/CatPayload;->asBase64Json()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz v0, :cond_1

    .line 58
    new-instance v2, Lretrofit/client/Header;

    const-string v3, "X-NewRelic-ID"

    invoke-direct {v2, v3, v0}, Lretrofit/client/Header;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_1
    new-instance v0, Lretrofit/client/Request;

    invoke-virtual {p1}, Lretrofit/client/Request;->getMethod()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lretrofit/client/Request;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lretrofit/client/Request;->getBody()Lretrofit/mime/TypedOutput;

    move-result-object p1

    invoke-direct {v0, v2, v3, v1, p1}, Lretrofit/client/Request;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lretrofit/mime/TypedOutput;)V

    return-object v0
.end method


# virtual methods
.method protected error(Ljava/lang/Exception;)V
    .locals 2

    .line 78
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    .line 79
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setErrorCodeFromException(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 80
    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v1

    if-nez v1, :cond_0

    .line 81
    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->end()Lcom/newrelic/agent/android/api/common/TransactionData;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 85
    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->setResponseBody(Ljava/lang/String;)V

    .line 86
    new-instance p1, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-direct {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    invoke-static {p1}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public execute(Lretrofit/client/Request;)Lretrofit/client/Response;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 36
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->request:Lretrofit/client/Request;

    .line 37
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 38
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->setConnectivityHeaders(Lretrofit/client/Request;)Lretrofit/client/Request;

    move-result-object p1

    .line 41
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->impl:Lretrofit/client/Client;

    invoke-interface {v0, p1}, Lretrofit/client/Client;->execute(Lretrofit/client/Request;)Lretrofit/client/Response;

    move-result-object p1

    .line 42
    new-instance v6, Lretrofit/client/Response;

    invoke-virtual {p1}, Lretrofit/client/Response;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lretrofit/client/Response;->getStatus()I

    move-result v2

    invoke-virtual {p1}, Lretrofit/client/Response;->getReason()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lretrofit/client/Response;->getHeaders()Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/newrelic/agent/android/instrumentation/retrofit/ContentBufferingTypedInput;

    invoke-virtual {p1}, Lretrofit/client/Response;->getBody()Lretrofit/mime/TypedInput;

    move-result-object p1

    invoke-direct {v5, p1}, Lcom/newrelic/agent/android/instrumentation/retrofit/ContentBufferingTypedInput;-><init>(Lretrofit/mime/TypedInput;)V

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lretrofit/client/Response;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lretrofit/mime/TypedInput;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    invoke-direct {p0, v6}, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->checkResponse(Lretrofit/client/Response;)V

    return-object v6

    :catch_0
    move-exception p1

    .line 44
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->error(Ljava/lang/Exception;)V

    .line 45
    throw p1
.end method

.method protected getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    if-nez v0, :cond_0

    .line 71
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->request:Lretrofit/client/Request;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/retrofit/RetrofitTransactionStateUtil;->inspectAndInstrument(Lcom/newrelic/agent/android/instrumentation/TransactionState;Lretrofit/client/Request;)V

    .line 74
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    return-object v0
.end method

.method setRequest(Lretrofit/client/Request;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;->request:Lretrofit/client/Request;

    return-void
.end method
