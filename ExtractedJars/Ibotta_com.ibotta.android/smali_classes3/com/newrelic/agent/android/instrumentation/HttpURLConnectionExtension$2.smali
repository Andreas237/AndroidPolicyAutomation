.class Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;
.super Ljava/lang/Object;
.source "HttpURLConnectionExtension.java"

# interfaces
.implements Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->getOutputStream()Ljava/io/OutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

.field final synthetic val$transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;Lcom/newrelic/agent/android/instrumentation/TransactionState;)V
    .locals 0

    .line 405
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->this$0:Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    iput-object p2, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->val$transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public streamComplete(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V
    .locals 3

    .line 416
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->val$transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_1

    .line 418
    :try_start_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->val$transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    iget-object v1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->this$0:Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->access$000(Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;)Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->setStatusCode(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 420
    :catch_0
    invoke-static {}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->access$100()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HttpURLConnectionExtension.getOutputStream.streamComplete: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 422
    :goto_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->this$0:Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->access$000(Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;)Ljava/net/HttpURLConnection;

    move-result-object v0

    const-string v1, "Content-length"

    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 423
    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;->getBytes()J

    move-result-wide v1

    if-eqz v0, :cond_0

    .line 426
    :try_start_1
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 433
    :catch_1
    :cond_0
    iget-object p1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->val$transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {p1, v1, v2}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->setBytesSent(J)V

    .line 434
    iget-object p1, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->this$0:Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->val$transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {p1, v0}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->addTransactionAndErrorData(Lcom/newrelic/agent/android/instrumentation/TransactionState;)V

    :cond_1
    return-void
.end method

.method public streamError(Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;)V
    .locals 3

    .line 408
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->val$transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {v0}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->isComplete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 409
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->val$transactionState:Lcom/newrelic/agent/android/instrumentation/TransactionState;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;->getBytes()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/agent/android/instrumentation/TransactionState;->setBytesSent(J)V

    .line 411
    :cond_0
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension$2;->this$0:Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;

    invoke-virtual {p1}, Lcom/newrelic/agent/android/instrumentation/io/StreamCompleteEvent;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/instrumentation/HttpURLConnectionExtension;->error(Ljava/lang/Exception;)V

    return-void
.end method
