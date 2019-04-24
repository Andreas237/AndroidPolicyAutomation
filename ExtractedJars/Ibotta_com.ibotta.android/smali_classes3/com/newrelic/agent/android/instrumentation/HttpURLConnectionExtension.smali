.class public Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;
.super Ljava/net/HttpURLConnection;
.source "HttpURLConnectionExtension.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

.field private impl:Ljava/net/HttpURLConnection;

.field private transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;)V
    .locals 2

    .line 46
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/net/HttpURLConnection;-><init>(Ljava/net/URL;)V

    const/4 v0, 0x0

    .line 41
    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    .line 47
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    .line 48
    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCrossProcessHeader(Ljava/net/HttpURLConnection;)V

    .line 50
    sget-object p1, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {p1}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object p1

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 53
    :try_start_0
    iget-object p1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    const-string v0, "newrelic"

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/connectivity/CatPayload;->asBase64Json()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 57
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Connection already opened, unable to add Connectivity header"

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 55
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Distributed trace payload is null"

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method static synthetic access$000(Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;)Ljava/net/HttpURLConnection;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    return-object p0
.end method

.method static synthetic access$100()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 38
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method private checkResponse()V
    .locals 2

    .line 517
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 518
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrumentResponse(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/net/HttpURLConnection;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method addTransactionAndErrorData(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V
    .locals 7

    .line 556
    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->end()Lcom/newrelic/agent/android/api/common/TransactionData;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 563
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isErrorOrFailure()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ""

    .line 567
    :try_start_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getErrorStream()Ljava/io/InputStream;

    move-result-object v2

    .line 568
    instance-of v3, v2, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    if-eqz v3, :cond_1

    .line 569
    check-cast v2, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->getBufferAsString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 572
    sget-object v3, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HttpURLConnectionExtension.addTransactionAndErrorData: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 577
    :cond_1
    :goto_0
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 578
    iget-object v3, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v4, ""

    .line 580
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "content_type"

    .line 581
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v3, "content_length"

    .line 588
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->getBytesReceived()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v3, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/api/common/TransactionData;->setResponseBody(Ljava/lang/String;)V

    .line 591
    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/api/common/TransactionData;->setParams(Ljava/util/Map;)V

    .line 593
    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addHttpError(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    .line 596
    :cond_3
    new-instance p1, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-direct {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    invoke-static {p1}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    return-void
.end method

.method public connect()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 91
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 94
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 96
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 97
    throw v0
.end method

.method public disconnect()V
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 73
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->addTransactionAndErrorData(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void
.end method

.method error(Ljava/lang/Exception;)V
    .locals 5

    .line 531
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    .line 532
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setErrorCodeFromException(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 533
    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v1

    if-nez v1, :cond_1

    .line 534
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrumentResponse(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/net/HttpURLConnection;)V

    .line 535
    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->end()Lcom/newrelic/agent/android/api/common/TransactionData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 539
    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    .line 541
    :try_start_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 542
    instance-of v2, v1, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    if-eqz v2, :cond_0

    .line 543
    check-cast v1, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->getBufferAsString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 546
    sget-object v2, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HttpsURLConnectionExtension.error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 549
    :cond_0
    :goto_0
    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->setResponseBody(Ljava/lang/String;)V

    .line 550
    new-instance p1, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-direct {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    invoke-static {p1}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public getAllowUserInteraction()Z
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getAllowUserInteraction()Z

    move-result v0

    return v0
.end method

.method public getConnectTimeout()I
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getConnectTimeout()I

    move-result v0

    return v0
.end method

.method public getContent()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 116
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 119
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContent()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v1

    if-ltz v1, :cond_0

    .line 126
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v2

    .line 127
    invoke-virtual {v2}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v3

    if-nez v3, :cond_0

    int-to-long v3, v1

    .line 128
    invoke-virtual {v2, v3, v4}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->setBytesReceived(J)V

    .line 129
    invoke-virtual {p0, v2}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->addTransactionAndErrorData(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    .line 121
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 122
    throw v0
.end method

.method public getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 140
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 143
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-object p1

    :catch_0
    move-exception p1

    .line 145
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 146
    throw p1
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .line 154
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 155
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v0

    .line 156
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-object v0
.end method

.method public getContentLength()I
    .locals 1

    .line 162
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 163
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    .line 164
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 170
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 171
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    .line 172
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-object v0
.end method

.method public getDate()J
    .locals 2

    .line 178
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 179
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDate()J

    move-result-wide v0

    .line 180
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-wide v0
.end method

.method public getDefaultUseCaches()Z
    .locals 1

    .line 277
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDefaultUseCaches()Z

    move-result v0

    return v0
.end method

.method public getDoInput()Z
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDoInput()Z

    move-result v0

    return v0
.end method

.method public getDoOutput()Z
    .locals 1

    .line 287
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getDoOutput()Z

    move-result v0

    return v0
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 4

    .line 186
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 188
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->available()I

    move-result v0

    if-nez v0, :cond_1

    .line 189
    :cond_0
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;-><init>(Ljava/io/InputStream;Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    :cond_1
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    return-object v0

    :catch_0
    move-exception v0

    .line 192
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HttpsURLConnectionExtension: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 193
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getExpiration()J
    .locals 2

    .line 292
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 293
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getExpiration()J

    move-result-wide v0

    .line 294
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-wide v0
.end method

.method public getHeaderField(I)Ljava/lang/String;
    .locals 1

    .line 300
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 301
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object p1

    .line 302
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-object p1
.end method

.method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 308
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 309
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 310
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-object p1
.end method

.method public getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 1

    .line 200
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 201
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2, p3}, Ljava/net/HttpURLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    move-result-wide p1

    .line 202
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-wide p1
.end method

.method public getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1

    .line 316
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 317
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result p1

    .line 318
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return p1
.end method

.method public getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1

    .line 324
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 325
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object p1

    .line 326
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-object p1
.end method

.method public getHeaderFields()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 332
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 333
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    .line 334
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-object v0
.end method

.method public getIfModifiedSince()J
    .locals 2

    .line 340
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 341
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getIfModifiedSince()J

    move-result-wide v0

    .line 342
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-wide v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 348
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    .line 351
    :try_start_0
    new-instance v1, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;-><init>(Ljava/io/InputStream;)V

    .line 352
    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-static {v0, v2}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrumentResponse(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/net/HttpURLConnection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 357
    new-instance v2, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$1;

    invoke-direct {v2, p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$1;-><init>(Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->addStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V

    return-object v1

    :catch_0
    move-exception v0

    .line 354
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 355
    throw v0
.end method

.method public getInstanceFollowRedirects()Z
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInstanceFollowRedirects()Z

    move-result v0

    return v0
.end method

.method public getLastModified()J
    .locals 2

    .line 389
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 390
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getLastModified()J

    move-result-wide v0

    .line 391
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-wide v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 397
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    .line 400
    :try_start_0
    new-instance v1, Lcom/newrelic/agent/android/instrumentation/io/CountingOutputStream;

    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 405
    new-instance v2, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;

    invoke-direct {v2, p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;-><init>(Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingOutputStream;->addStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V

    return-object v1

    :catch_0
    move-exception v0

    .line 402
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 403
    throw v0
.end method

.method public getPermission()Ljava/security/Permission;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 213
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getPermission()Ljava/security/Permission;

    move-result-object v0

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .line 443
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public getRequestMethod()Ljava/lang/String;
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperties()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 448
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 453
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getResponseCode()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 223
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 226
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 231
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return v0

    :catch_0
    move-exception v0

    .line 228
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 229
    throw v0
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 237
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 240
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 245
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->checkResponse()V

    return-object v0

    :catch_0
    move-exception v0

    .line 242
    invoke-virtual {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 243
    throw v0
.end method

.method getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;
    .locals 2

    .line 523
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    if-nez v0, :cond_0

    .line 524
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 525
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrument(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/net/HttpURLConnection;)V

    .line 527
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    return-object v0
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    .line 458
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    .line 463
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getUseCaches()Z

    move-result v0

    return v0
.end method

.method public setAllowUserInteraction(Z)V
    .locals 1

    .line 468
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setAllowUserInteraction(Z)V

    return-void
.end method

.method public setChunkedStreamingMode(I)V
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 1

    .line 473
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    return-void
.end method

.method public setDefaultUseCaches(Z)V
    .locals 1

    .line 478
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setDefaultUseCaches(Z)V

    return-void
.end method

.method public setDoInput(Z)V
    .locals 1

    .line 483
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    return-void
.end method

.method public setDoOutput(Z)V
    .locals 1

    .line 488
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    return-void
.end method

.method public setIfModifiedSince(J)V
    .locals 1

    .line 493
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setIfModifiedSince(J)V

    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1

    .line 261
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    return-void
.end method

.method public setReadTimeout(I)V
    .locals 1

    .line 498
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/ProtocolException;
        }
    .end annotation

    .line 266
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 268
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 270
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 271
    throw p1
.end method

.method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 503
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setUseCaches(Z)V
    .locals 1

    .line 508
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 513
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public usingProxy()Z
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->impl:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->usingProxy()Z

    move-result v0

    return v0
.end method
