.class public Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;
.super Ljava/lang/Object;
.source "JSONArrayInstrumentation.java"


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

    .line 16
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

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->categoryParams:Ljava/util/ArrayList;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static init(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/TraceConstructor;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p0, :cond_0

    :try_start_0
    const-string v0, "JSONArray#<init>"

    .line 28
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 29
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 30
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 32
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    .line 33
    throw p0

    .line 23
    :cond_0
    new-instance p0, Lorg/json/JSONException;

    const-string v0, "Failed to initialize JSONArray: json string is null."

    invoke-direct {p0, v0}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static toString(Lorg/json/JSONArray;)Ljava/lang/String;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        scope = "org.json.JSONArray"
    .end annotation

    const-string v0, "JSONArray#toString"

    .line 41
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 42
    invoke-virtual {p0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p0

    .line 43
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-object p0
.end method

.method public static toString(Lorg/json/JSONArray;I)Ljava/lang/String;
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
        scope = "org.json.JSONArray"
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    :try_start_0
    const-string v0, "JSONArray#toString"

    .line 53
    sget-object v1, Lcom/newrelic/agent/android/instrumentation/JSONArrayInstrumentation;->categoryParams:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 54
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->toString(I)Ljava/lang/String;

    move-result-object p0

    .line 55
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 57
    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    .line 58
    throw p0
.end method
