.class public Lcom/newrelic/agent/android/util/ExceptionHelper;
.super Ljava/lang/Object;
.source "ExceptionHelper.java"

# interfaces
.implements Lcom/newrelic/agent/android/harvest/type/HarvestErrorCodes;


# static fields
.field private static final apacheDetected:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/util/ExceptionHelper;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 32
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/newrelic/agent/android/util/ExceptionHelper;->apacheDetected:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    const-class v0, Lcom/newrelic/agent/android/util/ExceptionHelper;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    :try_start_0
    const-string v1, "org.apache.http.client.ClientProtocolException"

    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 39
    sget-object v0, Lcom/newrelic/agent/android/util/ExceptionHelper;->apacheDetected:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static exceptionToErrorCode(Ljava/lang/Exception;)I
    .locals 3

    .line 48
    sget-object v0, Lcom/newrelic/agent/android/util/ExceptionHelper;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ExceptionHelper: exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " to error code."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    const/16 v0, -0x3e9

    .line 52
    :try_start_0
    sget-object v1, Lcom/newrelic/agent/android/util/ExceptionHelper;->apacheDetected:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 53
    instance-of v1, p0, Lorg/apache/http/client/ClientProtocolException;

    if-eqz v1, :cond_0

    const/16 p0, -0x3f3

    return p0

    .line 55
    :cond_0
    instance-of v1, p0, Lorg/apache/http/conn/ConnectTimeoutException;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    return v0

    .line 61
    :catch_0
    sget-object v1, Lcom/newrelic/agent/android/util/ExceptionHelper;->apacheDetected:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 64
    :cond_1
    instance-of v1, p0, Ljava/net/UnknownHostException;

    const/16 v2, -0x3eb

    if-eqz v1, :cond_2

    const/16 v0, -0x3ee

    goto :goto_1

    .line 66
    :cond_2
    instance-of v1, p0, Ljava/net/NoRouteToHostException;

    if-eqz v1, :cond_3

    const/16 v0, -0x3eb

    goto :goto_1

    .line 68
    :cond_3
    instance-of v1, p0, Ljava/net/PortUnreachableException;

    if-eqz v1, :cond_4

    const/16 v0, -0x3eb

    goto :goto_1

    .line 70
    :cond_4
    instance-of v1, p0, Ljava/net/SocketTimeoutException;

    if-eqz v1, :cond_5

    goto :goto_1

    .line 72
    :cond_5
    instance-of v0, p0, Ljava/net/ConnectException;

    if-eqz v0, :cond_6

    const/16 v0, -0x3ec

    goto :goto_1

    .line 75
    :cond_6
    instance-of v0, p0, Ljava/net/MalformedURLException;

    if-eqz v0, :cond_7

    const/16 v0, -0x3e8

    goto :goto_1

    .line 77
    :cond_7
    instance-of v0, p0, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_8

    const/16 v0, -0x4b0

    goto :goto_1

    .line 79
    :cond_8
    instance-of v0, p0, Ljava/io/FileNotFoundException;

    if-eqz v0, :cond_9

    const/16 v0, -0x44c

    goto :goto_1

    .line 81
    :cond_9
    instance-of v0, p0, Ljava/io/EOFException;

    if-eqz v0, :cond_a

    const/16 v0, -0x3fd

    goto :goto_1

    .line 83
    :cond_a
    instance-of v0, p0, Ljava/io/IOException;

    if-eqz v0, :cond_b

    const-string v0, "IOException"

    .line 84
    invoke-static {p0, v0}, Lcom/newrelic/agent/android/util/ExceptionHelper;->recordSupportabilityMetric(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_0

    .line 85
    :cond_b
    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_c

    const-string v0, "RuntimeException"

    .line 86
    invoke-static {p0, v0}, Lcom/newrelic/agent/android/util/ExceptionHelper;->recordSupportabilityMetric(Ljava/lang/Exception;Ljava/lang/String;)V

    :cond_c
    :goto_0
    const/4 v0, -0x1

    :goto_1
    return v0
.end method

.method public static recordSupportabilityMetric(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 6

    .line 93
    new-instance v0, Lcom/newrelic/agent/android/harvest/AgentHealthException;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;-><init>(Ljava/lang/Exception;)V

    .line 96
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    const/4 v1, 0x0

    aget-object p0, p0, v1

    .line 97
    sget-object v2, Lcom/newrelic/agent/android/util/ExceptionHelper;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v3, "ExceptionHelper: %s:%s(%s:%s) %s[%s] %s"

    const/4 v4, 0x7

    new-array v4, v4, [Ljava/lang/Object;

    .line 98
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getSourceClass()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getSourceMethod()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x1

    aput-object v1, v4, v5

    .line 99
    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x2

    aput-object v1, v4, v5

    invoke-virtual {p0}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x3

    aput-object p0, v4, v1

    const/4 p0, 0x4

    aput-object p1, v4, p0

    .line 100
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getExceptionClass()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x5

    aput-object p0, v4, v1

    .line 101
    invoke-virtual {v0}, Lcom/newrelic/agent/android/harvest/AgentHealthException;->getMessage()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x6

    aput-object p0, v4, v1

    .line 97
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, p0}, Lcom/newrelic/agent/android/logging/AgentLog;->error(Ljava/lang/String;)V

    .line 102
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/harvest/AgentHealth;->noticeException(Lcom/newrelic/agent/android/harvest/AgentHealthException;Ljava/lang/String;)V

    return-void
.end method
