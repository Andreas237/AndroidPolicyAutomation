.class public Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;
.super Ljava/lang/Object;
.source "JSONObjectInstrumentation.java"


# static fields
.field private static final categoryParams:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "category"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "JSON"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->categoryParams:Ljava/util/ArrayList;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static init(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3
    .annotation build Lcom/newrelic/agent/android/instrumentation/TraceConstructor;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "JSONObject#<init>"

    .line 25
    sget-object v2, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1, v2}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 26
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 27
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 29
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    .line 30
    throw p0

    .line 19
    :cond_0
    new-instance p0, Lorg/json/JSONException;

    const-string v0, "Failed to initialize JSONObject: json string is null."

    invoke-direct {p0, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static toString(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 3
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        scope = "org.json.JSONObject"
    .end annotation

    const-string v0, "JSONObject#toString"

    .line 38
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->categoryParams:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 39
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    .line 40
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static toString(Lorg/json/JSONObject;I)Ljava/lang/String;
    .locals 3
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        scope = "org.json.JSONObject"
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "JSONObject#toString"

    .line 49
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->categoryParams:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 52
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object p0

    .line 53
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 55
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    .line 56
    throw p0
.end method
