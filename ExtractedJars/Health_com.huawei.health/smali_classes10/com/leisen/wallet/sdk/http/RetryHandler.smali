.class Lcom/leisen/wallet/sdk/http/RetryHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/apache/http/client/HttpRequestRetryHandler;


# static fields
.field private static final TAG:Ljava/lang/String; = "RetryHandler"

.field private static final exceptionBlacklist:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<Ljava/lang/Class<*>;>;"
        }
    .end annotation
.end field

.field private static final exceptionWhitelist:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<Ljava/lang/Class<*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private final maxRetries:I

.field private final retrySleepTimeMS:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionBlacklist:Ljava/util/HashSet;

    .line 39
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    sput-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionWhitelist:Ljava/util/HashSet;

    .line 44
    const-string v0, "RetryHandler"

    const-string v1, "staic"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionBlacklist:Ljava/util/HashSet;

    const-class v1, Ljavax/net/ssl/SSLException;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 47
    const-string v0, "RetryHandler"

    const-string v1, "staic"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionBlacklist:Ljava/util/HashSet;

    const-class v1, Ljava/io/InterruptedIOException;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 50
    const-string v0, "RetryHandler"

    const-string v1, "staic"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionWhitelist:Ljava/util/HashSet;

    const-class v1, Lorg/apache/http/NoHttpResponseException;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 53
    const-string v0, "RetryHandler"

    const-string v1, "staic"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 54
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionWhitelist:Ljava/util/HashSet;

    const-class v1, Ljava/net/SocketException;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 55
    const-string v0, "RetryHandler"

    const-string v1, "staic"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    const-string v0, "RetryHandler"

    const-string v1, "staic"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 58
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionWhitelist:Ljava/util/HashSet;

    const-class v1, Ljava/net/UnknownHostException;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 60
    const-string v0, "RetryHandler"

    const-string v1, "staic"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    const-string v0, "RetryHandler"

    const-string v1, "enter RetryHandler"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    iput p1, p0, Lcom/leisen/wallet/sdk/http/RetryHandler;->maxRetries:I

    .line 69
    iput p2, p0, Lcom/leisen/wallet/sdk/http/RetryHandler;->retrySleepTimeMS:I

    .line 70
    return-void
.end method

.method static addClassToBlacklist(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 131
    const-string v0, "RetryHandler"

    const-string v1, "enter addClassToBlacklist"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionBlacklist:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 133
    const-string v0, "RetryHandler"

    const-string v1, "exit addClassToBlacklist"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 134
    return-void
.end method

.method static addClassToWhitelist(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;)V"
        }
    .end annotation

    .line 125
    const-string v0, "RetryHandler"

    const-string v1, "enter addClassToWhitelist"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionWhitelist:Ljava/util/HashSet;

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 127
    const-string v0, "RetryHandler"

    const-string v1, "exit addClassToWhitelist"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    return-void
.end method


# virtual methods
.method protected isInList(Ljava/util/HashSet;Ljava/lang/Throwable;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/HashSet<Ljava/lang/Class<*>;>;Ljava/lang/Throwable;)Z"
        }
    .end annotation

    .line 137
    const-string v0, "RetryHandler"

    const-string v1, "enter isInList"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Class;

    .line 139
    invoke-virtual {v3, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    const/4 v0, 0x1

    return v0

    .line 142
    :cond_0
    goto :goto_0

    .line 143
    :cond_1
    const-string v0, "RetryHandler"

    const-string v1, "exit isInList"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 144
    const/4 v0, 0x0

    return v0
.end method

.method public retryRequest(Ljava/io/IOException;ILorg/apache/http/protocol/HttpContext;)Z
    .locals 6

    .line 75
    const-string v0, "RetryHandler"

    const-string v1, "enter retryRequest"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    const/4 v2, 0x1

    .line 78
    const-string v0, "http.request_sent"

    invoke-interface {p3, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Boolean;

    .line 79
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 81
    :goto_0
    iget v0, p0, Lcom/leisen/wallet/sdk/http/RetryHandler;->maxRetries:I

    if-le p2, v0, :cond_1

    .line 82
    const-string v0, "RetryHandler"

    const-string v1, "judge executionCount"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    const/4 v2, 0x0

    goto :goto_1

    .line 86
    :cond_1
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionWhitelist:Ljava/util/HashSet;

    invoke-virtual {p0, v0, p1}, Lcom/leisen/wallet/sdk/http/RetryHandler;->isInList(Ljava/util/HashSet;Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 87
    const-string v0, "RetryHandler"

    const-string v1, "judge executionCount"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    const/4 v2, 0x1

    goto :goto_1

    .line 91
    :cond_2
    sget-object v0, Lcom/leisen/wallet/sdk/http/RetryHandler;->exceptionBlacklist:Ljava/util/HashSet;

    invoke-virtual {p0, v0, p1}, Lcom/leisen/wallet/sdk/http/RetryHandler;->isInList(Ljava/util/HashSet;Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 92
    const-string v0, "RetryHandler"

    const-string v1, "judge executionCount"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    const/4 v2, 0x0

    goto :goto_1

    .line 97
    :cond_3
    if-nez v4, :cond_4

    .line 98
    const-string v0, "RetryHandler"

    const-string v1, "judge executionCount"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    const/4 v2, 0x1

    .line 104
    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    .line 105
    const-string v0, "RetryHandler"

    const-string v1, "judge retry"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    const-string v0, "http.request"

    invoke-interface {p3, v0}, Lorg/apache/http/protocol/HttpContext;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lorg/apache/http/client/methods/HttpUriRequest;

    .line 108
    if-nez v5, :cond_5

    .line 109
    const-string v0, "RetryHandler"

    const-string v1, "judge currentReq is null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 110
    const/4 v0, 0x0

    return v0

    .line 114
    :cond_5
    if-eqz v2, :cond_6

    .line 115
    const-string v0, "RetryHandler"

    const-string v1, "judge retry"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    iget v0, p0, Lcom/leisen/wallet/sdk/http/RetryHandler;->retrySleepTimeMS:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_2

    .line 118
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exception ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Z)V

    .line 120
    :goto_2
    const-string v0, "RetryHandler"

    const-string v1, "exit retryRequest"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    return v2
.end method
