.class public Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;
.super Ljavax/net/ssl/HttpsURLConnection;
.source "HttpsURLConnectionExtension.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

.field private impl:Ljavax/net/ssl/HttpsURLConnection;

.field private transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 2

    .line 50
    invoke-virtual {p1}, Ljavax/net/ssl/HttpsURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    invoke-direct {p0, v0}, Ljavax/net/ssl/HttpsURLConnection;-><init>(Ljava/net/URL;)V

    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    .line 51
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    .line 52
    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCrossProcessHeader(Ljava/net/HttpURLConnection;)V

    .line 53
    sget-object p1, Lcom/newrelic/agent/android/FeatureFlag;->DistributedTracing:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {p1}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 54
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object p1

    invoke-static {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setCatPayload(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 56
    :try_start_0
    iget-object p1, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    const-string v0, "newrelic"

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->getCatPayload()Lcom/newrelic/agent/android/connectivity/CatPayload;

    move-result-object v1

    invoke-virtual {v1}, Lcom/newrelic/agent/android/connectivity/CatPayload;->asBase64Json()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 60
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Connection already opened, unable to add Connectivity header"

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 58
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "Distributed trace payload is null"

    invoke-interface {v0, v1, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method static synthetic access$000(Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;Ljava/lang/Exception;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    return-void
.end method

.method static synthetic access$100(Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;)Ljavax/net/ssl/HttpsURLConnection;
    .locals 0

    .line 42
    iget-object p0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    return-object p0
.end method

.method static synthetic access$200()Lcom/newrelic/agent/android/logging/AgentLog;
    .locals 1

    .line 42
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-object v0
.end method

.method static synthetic access$300(Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->addTransactionAndErrorData(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    return-void
.end method

.method private addTransactionAndErrorData(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V
    .locals 7

    .line 609
    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->end()Lcom/newrelic/agent/android/api/common/TransactionData;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 616
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isErrorOrFailure()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ""

    .line 620
    :try_start_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getErrorStream()Ljava/io/InputStream;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 621
    instance-of v3, v2, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    if-eqz v3, :cond_1

    .line 622
    check-cast v2, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->getBufferAsString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 625
    sget-object v3, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HttpsURLConnectionExtension.addTransactionAndErrorData: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 629
    :cond_1
    :goto_0
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 630
    iget-object v3, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v3}, Ljavax/net/ssl/HttpsURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v4, ""

    .line 632
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "content_type"

    .line 633
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    const-string v3, "content_length"

    .line 639
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

    .line 641
    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/api/common/TransactionData;->setResponseBody(Ljava/lang/String;)V

    .line 642
    invoke-virtual {v0, v2}, Lcom/newrelic/agent/android/api/common/TransactionData;->setParams(Ljava/util/Map;)V

    .line 644
    invoke-static {v0}, Lcom/newrelic/agent/android/Measurements;->addHttpError(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    .line 647
    :cond_3
    new-instance p1, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-direct {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    invoke-static {p1}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    return-void
.end method

.method private checkResponse()V
    .locals 2

    .line 570
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 571
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrumentResponse(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/net/HttpURLConnection;)V

    :cond_0
    return-void
.end method

.method private error(Ljava/lang/Exception;)V
    .locals 5

    .line 584
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    .line 585
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->setErrorCodeFromException(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/lang/Exception;)V

    .line 586
    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v1

    if-nez v1, :cond_1

    .line 587
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrumentResponse(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/net/HttpURLConnection;)V

    .line 588
    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->end()Lcom/newrelic/agent/android/api/common/TransactionData;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 592
    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    .line 594
    :try_start_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 595
    instance-of v2, v1, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    if-eqz v2, :cond_0

    .line 596
    check-cast v1, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->getBufferAsString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 599
    sget-object v2, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

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

    .line 602
    :cond_0
    :goto_0
    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->setResponseBody(Ljava/lang/String;)V

    .line 603
    new-instance p1, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;

    invoke-direct {p1, v0}, Lcom/newrelic/agent/android/measurement/http/HttpTransactionMeasurement;-><init>(Lcom/newrelic/agent/android/api/common/TransactionData;)V

    invoke-static {p1}, Lcom/newrelic/agent/android/TaskQueue;->queue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;
    .locals 2

    .line 576
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    if-nez v0, :cond_0

    .line 577
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;-><init>()V

    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 578
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrument(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/net/HttpURLConnection;)V

    .line 580
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    return-object v0
.end method


# virtual methods
.method public addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/HttpsURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public connect()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 114
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 117
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->connect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 119
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 120
    throw v0
.end method

.method public disconnect()V
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->addTransactionAndErrorData(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->disconnect()V

    return-void
.end method

.method public getAllowUserInteraction()Z
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getAllowUserInteraction()Z

    move-result v0

    return v0
.end method

.method public getCipherSuite()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getConnectTimeout()I
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getConnectTimeout()I

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

    .line 139
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 142
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getContent()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->getContentLength()I

    move-result v1

    if-ltz v1, :cond_0

    .line 149
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v2

    .line 150
    invoke-virtual {v2}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v3

    if-nez v3, :cond_0

    int-to-long v3, v1

    .line 151
    invoke-virtual {v2, v3, v4}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->setBytesReceived(J)V

    .line 152
    invoke-direct {p0, v2}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->addTransactionAndErrorData(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    .line 144
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 145
    throw v0
.end method

.method public getContent([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 163
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 166
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-object p1

    :catch_0
    move-exception p1

    .line 168
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 169
    throw p1
.end method

.method public getContentEncoding()Ljava/lang/String;
    .locals 1

    .line 177
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 178
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getContentEncoding()Ljava/lang/String;

    move-result-object v0

    .line 179
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-object v0
.end method

.method public getContentLength()I
    .locals 1

    .line 185
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 186
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getContentLength()I

    move-result v0

    .line 187
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return v0
.end method

.method public getContentType()Ljava/lang/String;
    .locals 1

    .line 193
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 194
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getContentType()Ljava/lang/String;

    move-result-object v0

    .line 195
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-object v0
.end method

.method public getDate()J
    .locals 2

    .line 201
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 202
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getDate()J

    move-result-wide v0

    .line 203
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-wide v0
.end method

.method public getDefaultUseCaches()Z
    .locals 1

    .line 299
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getDefaultUseCaches()Z

    move-result v0

    return v0
.end method

.method public getDoInput()Z
    .locals 1

    .line 304
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getDoInput()Z

    move-result v0

    return v0
.end method

.method public getDoOutput()Z
    .locals 1

    .line 309
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getDoOutput()Z

    move-result v0

    return v0
.end method

.method public getErrorStream()Ljava/io/InputStream;
    .locals 4

    .line 209
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 211
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->available()I

    move-result v0

    if-nez v0, :cond_1

    .line 212
    :cond_0
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v1}, Ljavax/net/ssl/HttpsURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;-><init>(Ljava/io/InputStream;Z)V

    iput-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 218
    :cond_1
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->errorStream:Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    return-object v0

    :catch_0
    move-exception v0

    .line 215
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

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

    .line 216
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public getExpiration()J
    .locals 2

    .line 314
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 315
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getExpiration()J

    move-result-wide v0

    .line 316
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-wide v0
.end method

.method public getHeaderField(I)Ljava/lang/String;
    .locals 1

    .line 322
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 323
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderField(I)Ljava/lang/String;

    move-result-object p1

    .line 324
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-object p1
.end method

.method public getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 330
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 331
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 332
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-object p1
.end method

.method public getHeaderFieldDate(Ljava/lang/String;J)J
    .locals 1

    .line 223
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 224
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1, p2, p3}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    move-result-wide p1

    .line 225
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-wide p1
.end method

.method public getHeaderFieldInt(Ljava/lang/String;I)I
    .locals 1

    .line 338
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 339
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    move-result p1

    .line 340
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return p1
.end method

.method public getHeaderFieldKey(I)Ljava/lang/String;
    .locals 1

    .line 346
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 347
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    move-result-object p1

    .line 348
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

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

    .line 354
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 355
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getHeaderFields()Ljava/util/Map;

    move-result-object v0

    .line 356
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-object v0
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 556
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    return-object v0
.end method

.method public getIfModifiedSince()J
    .locals 2

    .line 362
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 363
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getIfModifiedSince()J

    move-result-wide v0

    .line 364
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-wide v0
.end method

.method public getInputStream()Ljava/io/InputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 370
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    .line 373
    :try_start_0
    new-instance v1, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;

    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v2}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;-><init>(Ljava/io/InputStream;)V

    .line 374
    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-static {v0, v2}, Lcom/newrelic/agent/android/instrumentation/TransactionStateUtil;->inspectAndInstrumentResponse(Lcom/newrelic/agent/android/instrumentation/TransactionState;Ljava/net/HttpURLConnection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 379
    new-instance v2, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension$1;

    invoke-direct {v2, p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension$1;-><init>(Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingInputStream;->addStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V

    return-object v1

    :catch_0
    move-exception v0

    .line 376
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 377
    throw v0
.end method

.method public getInstanceFollowRedirects()Z
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getInstanceFollowRedirects()Z

    move-result v0

    return v0
.end method

.method public getLastModified()J
    .locals 2

    .line 411
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 412
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLastModified()J

    move-result-wide v0

    .line 413
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-wide v0
.end method

.method public getLocalCertificates()[Ljava/security/cert/Certificate;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0

    return-object v0
.end method

.method public getLocalPrincipal()Ljava/security/Principal;
    .locals 1

    .line 546
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getLocalPrincipal()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public getOutputStream()Ljava/io/OutputStream;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 419
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    move-result-object v0

    .line 422
    :try_start_0
    new-instance v1, Lcom/newrelic/agent/android/instrumentation/io/CountingOutputStream;

    iget-object v2, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v2}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 427
    new-instance v2, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension$2;

    invoke-direct {v2, p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension$2;-><init>(Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    invoke-virtual {v1, v2}, Lcom/newrelic/agent/android/instrumentation/io/CountingOutputStream;->addStreamCompleteListener(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;)V

    return-object v1

    :catch_0
    move-exception v0

    .line 424
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 425
    throw v0
.end method

.method public getPeerPrincipal()Ljava/security/Principal;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 541
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getPeerPrincipal()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public getPermission()Ljava/security/Permission;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 236
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getPermission()Ljava/security/Permission;

    move-result-object v0

    return-object v0
.end method

.method public getReadTimeout()I
    .locals 1

    .line 466
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getReadTimeout()I

    move-result v0

    return v0
.end method

.method public getRequestMethod()Ljava/lang/String;
    .locals 1

    .line 241
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getRequestMethod()Ljava/lang/String;

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

    .line 471
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getRequestProperties()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getRequestProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 476
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

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

    .line 246
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 249
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 254
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return v0

    :catch_0
    move-exception v0

    .line 251
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 252
    throw v0
.end method

.method public getResponseMessage()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 260
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->getTransactionState()Lcom/newrelic/agent/android/instrumentation/TransactionState;

    .line 263
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 268
    invoke-direct {p0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->checkResponse()V

    return-object v0

    :catch_0
    move-exception v0

    .line 265
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 266
    throw v0
.end method

.method public getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 566
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    return-object v0
.end method

.method public getServerCertificates()[Ljava/security/cert/Certificate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/net/ssl/SSLPeerUnverifiedException;
        }
    .end annotation

    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getServerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v0
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 80
    invoke-direct {p0, v0}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 81
    throw v0
.end method

.method public getURL()Ljava/net/URL;
    .locals 1

    .line 481
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getURL()Ljava/net/URL;

    move-result-object v0

    return-object v0
.end method

.method public getUseCaches()Z
    .locals 1

    .line 486
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->getUseCaches()Z

    move-result v0

    return v0
.end method

.method public setAllowUserInteraction(Z)V
    .locals 1

    .line 491
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setAllowUserInteraction(Z)V

    return-void
.end method

.method public setChunkedStreamingMode(I)V
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setChunkedStreamingMode(I)V

    return-void
.end method

.method public setConnectTimeout(I)V
    .locals 1

    .line 496
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    return-void
.end method

.method public setDefaultUseCaches(Z)V
    .locals 1

    .line 501
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultUseCaches(Z)V

    return-void
.end method

.method public setDoInput(Z)V
    .locals 1

    .line 506
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    return-void
.end method

.method public setDoOutput(Z)V
    .locals 1

    .line 511
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    return-void
.end method

.method public setFixedLengthStreamingMode(I)V
    .locals 1

    .line 279
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setFixedLengthStreamingMode(I)V

    return-void
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 1

    .line 551
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    return-void
.end method

.method public setIfModifiedSince(J)V
    .locals 1

    .line 516
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/HttpsURLConnection;->setIfModifiedSince(J)V

    return-void
.end method

.method public setInstanceFollowRedirects(Z)V
    .locals 1

    .line 284
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setInstanceFollowRedirects(Z)V

    return-void
.end method

.method public setReadTimeout(I)V
    .locals 1

    .line 521
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    return-void
.end method

.method public setRequestMethod(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/ProtocolException;
        }
    .end annotation

    .line 290
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 292
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->error(Ljava/lang/Exception;)V

    .line 293
    throw p1
.end method

.method public setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 526
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1, p2}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 1

    .line 561
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    return-void
.end method

.method public setUseCaches(Z)V
    .locals 1

    .line 531
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0, p1}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 536
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public usingProxy()Z
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpsURLConnectionExtension;->impl:Ljavax/net/ssl/HttpsURLConnection;

    invoke-virtual {v0}, Ljavax/net/ssl/HttpsURLConnection;->usingProxy()Z

    move-result v0

    return v0
.end method
