.class public Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;
.super Lretrofit/RestAdapter$Builder;
.source "RestAdapterBuilderExtension.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# instance fields
.field private impl:Lretrofit/RestAdapter$Builder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method public constructor <init>(Lretrofit/RestAdapter$Builder;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lretrofit/RestAdapter$Builder;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    return-void
.end method


# virtual methods
.method public build()Lretrofit/RestAdapter;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0}, Lretrofit/RestAdapter$Builder;->build()Lretrofit/RestAdapter;

    move-result-object v0

    return-object v0
.end method

.method public setClient(Lretrofit/client/Client$Provider;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client$Provider;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;
    .locals 3

    .line 35
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RestAdapterBuilderExtension.setClient() wrapping client "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with new ClientExtension."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    new-instance v1, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;

    invoke-direct {v1, p1}, Lcom/newrelic/agent/android/instrumentation/retrofit/ClientExtension;-><init>(Lretrofit/client/Client;)V

    invoke-virtual {v0, v1}, Lretrofit/RestAdapter$Builder;->setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setConverter(Lretrofit/converter/Converter;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setConverter(Lretrofit/converter/Converter;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setEndpoint(Ljava/lang/String;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setEndpoint(Lretrofit/Endpoint;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setEndpoint(Lretrofit/Endpoint;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setErrorHandler(Lretrofit/ErrorHandler;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setErrorHandler(Lretrofit/ErrorHandler;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setExecutors(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1, p2}, Lretrofit/RestAdapter$Builder;->setExecutors(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setLog(Lretrofit/RestAdapter$Log;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setLog(Lretrofit/RestAdapter$Log;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setLogLevel(Lretrofit/RestAdapter$LogLevel;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setLogLevel(Lretrofit/RestAdapter$LogLevel;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setProfiler(Lretrofit/Profiler;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setProfiler(Lretrofit/Profiler;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRequestInterceptor(Lretrofit/RequestInterceptor;)Lretrofit/RestAdapter$Builder;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->impl:Lretrofit/RestAdapter$Builder;

    invoke-virtual {v0, p1}, Lretrofit/RestAdapter$Builder;->setRequestInterceptor(Lretrofit/RequestInterceptor;)Lretrofit/RestAdapter$Builder;

    move-result-object p1

    return-object p1
.end method
