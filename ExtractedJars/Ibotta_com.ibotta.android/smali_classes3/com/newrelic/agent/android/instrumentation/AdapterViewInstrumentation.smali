.class public Lcom/newrelic/agent/android/instrumentation/AdapterViewInstrumentation;
.super Ljava/lang/Object;
.source "AdapterViewInstrumentation.java"


# static fields
.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/AdapterViewInstrumentation;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final setOnItemClickListener(Landroid/widget/AdapterView;Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 2
    .annotation build Lcom/newrelic/agent/android/instrumentation/ReplaceCallSite;
    .end annotation

    .line 19
    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 21
    invoke-virtual {p0}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object v0

    if-nez v0, :cond_0

    .line 24
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;

    invoke-direct {v0, p0, p1}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;-><init>(Landroid/widget/AdapterView;Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 25
    invoke-virtual {p0, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    .line 27
    :cond_0
    instance-of v1, v0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;

    if-eqz v1, :cond_1

    .line 28
    check-cast v0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;

    .line 29
    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;->addListener(Ljava/lang/Object;)V

    goto :goto_0

    .line 32
    :cond_1
    new-instance v1, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;

    invoke-direct {v1, p0, v0}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;-><init>(Landroid/widget/AdapterView;Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 33
    invoke-virtual {v1, p1}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;->addListener(Ljava/lang/Object;)V

    .line 34
    invoke-virtual {p0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    .line 38
    :cond_2
    invoke-virtual {p0, p1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 41
    :catch_0
    invoke-virtual {p0, p1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :goto_0
    return-void
.end method
