.class public final Lcom/newrelic/agent/android/instrumentation/retrofit/RetrofitInstrumentation;
.super Ljava/lang/Object;
.source "RetrofitInstrumentation.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 19
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/retrofit/RetrofitInstrumentation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static setClient(Lretrofit/RestAdapter$Builder;Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;
    .locals 1
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .line 26
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;

    invoke-direct {v0, p0}, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;-><init>(Lretrofit/RestAdapter$Builder;)V

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/instrumentation/retrofit/RestAdapterBuilderExtension;->setClient(Lretrofit/client/Client;)Lretrofit/RestAdapter$Builder;

    move-result-object p0

    return-object p0
.end method
