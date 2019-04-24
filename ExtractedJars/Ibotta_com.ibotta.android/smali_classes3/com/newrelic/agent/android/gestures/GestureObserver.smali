.class public Lcom/newrelic/agent/android/gestures/GestureObserver;
.super Ljava/lang/Object;
.source "GestureObserver.java"


# static fields
.field private static instance:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/newrelic/agent/android/gestures/GestureObserver;",
            ">;"
        }
    .end annotation
.end field

.field private static final log:Lcom/newrelic/agent/android/logging/AgentLog;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 21
    invoke-static {}, Lcom/newrelic/agent/android/logging/AgentLogManager;->getAgentLog()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    .line 22
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getInstance()Lcom/newrelic/agent/android/gestures/GestureObserver;
    .locals 3

    .line 28
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/newrelic/agent/android/gestures/GestureObserver;

    invoke-direct {v1}, Lcom/newrelic/agent/android/gestures/GestureObserver;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    const-string v1, "GestureObserver: instance created"

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    .line 31
    :cond_0
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->instance:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/newrelic/agent/android/gestures/GestureObserver;

    return-object v0
.end method

.method static isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z
    .locals 0

    .line 215
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    return p0
.end method

.method private popContext(Landroid/app/Fragment;)V
    .locals 3

    .line 207
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Gesture] Fragment stopped ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Fragment;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    return-void
.end method

.method private popContext(Landroid/support/v4/app/Fragment;)V
    .locals 3

    .line 211
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Gesture] Fragment stopped ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onActivityBackPressed(Ljava/lang/Object;)V
    .locals 3

    .line 137
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    const-class v0, Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    check-cast p1, Landroid/app/Activity;

    .line 140
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "backPressed"

    .line 141
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    invoke-virtual {p1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->recordOnClick(Landroid/view/View;Ljava/util/Map;)V

    .line 143
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Gesture] onBackPressed on activity ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onActivityOrFragmentStarted(Ljava/lang/Object;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 81
    const-class v0, Landroid/app/Fragment;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 82
    check-cast p1, Landroid/app/Fragment;

    .line 83
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onFragmentStarted(Landroid/app/Fragment;)V

    goto :goto_0

    .line 85
    :cond_0
    const-class v0, Landroid/support/v4/app/Fragment;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    check-cast p1, Landroid/support/v4/app/Fragment;

    .line 87
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onFragmentStarted(Landroid/support/v4/app/Fragment;)V

    goto :goto_0

    .line 89
    :cond_1
    const-class v0, Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 90
    check-cast p1, Landroid/app/Activity;

    .line 91
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onActivityStarted(Landroid/app/Activity;)V

    goto :goto_0

    .line 94
    :cond_2
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Gesture] Received a class we didn\'t expect ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onActivityOrFragmentStopped(Ljava/lang/Object;)V
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 103
    const-class v0, Landroid/app/Fragment;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    check-cast p1, Landroid/app/Fragment;

    .line 105
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onFragmentStopped(Landroid/app/Fragment;)V

    goto :goto_0

    .line 107
    :cond_0
    const-class v0, Landroid/support/v4/app/Fragment;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    check-cast p1, Landroid/support/v4/app/Fragment;

    .line 109
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onFragmentStopped(Landroid/support/v4/app/Fragment;)V

    goto :goto_0

    .line 111
    :cond_1
    const-class v0, Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 112
    check-cast p1, Landroid/app/Activity;

    .line 113
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->onActivityStopped(Landroid/app/Activity;)V

    goto :goto_0

    .line 116
    :cond_2
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Gesture] Received a class we didn\'t expect ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onActivityOrFragmentTouched(Landroid/view/MotionEvent;Ljava/lang/Object;)Z
    .locals 1

    .line 123
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 124
    const-class v0, Landroid/app/Activity;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    check-cast p2, Landroid/app/Activity;

    .line 126
    invoke-static {p2}, Lcom/newrelic/agent/android/gestures/GestureReporter;->getGestureReporter(Landroid/app/Activity;)Lcom/newrelic/agent/android/gestures/GestureReporter;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 128
    iget-object p2, p2, Lcom/newrelic/agent/android/gestures/GestureReporter;->detector:Landroid/support/v4/view/GestureDetectorCompat;

    invoke-virtual {p2, p1}, Landroid/support/v4/view/GestureDetectorCompat;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 35
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->pushContext(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method protected onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 41
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->popContext(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method protected onFragmentStarted(Landroid/app/Fragment;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 60
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->pushContext(Landroid/app/Fragment;)V

    :cond_0
    return-void
.end method

.method protected onFragmentStarted(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .line 47
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->pushContext(Landroid/support/v4/app/Fragment;)V

    :cond_0
    return-void
.end method

.method protected onFragmentStopped(Landroid/app/Fragment;)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 67
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->popContext(Landroid/app/Fragment;)V

    :cond_0
    return-void
.end method

.method protected onFragmentStopped(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .line 53
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-static {v0}, Lcom/newrelic/agent/android/FeatureFlag;->featureEnabled(Lcom/newrelic/agent/android/FeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    invoke-direct {p0, p1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->popContext(Landroid/support/v4/app/Fragment;)V

    :cond_0
    return-void
.end method

.method popContext(Landroid/app/Activity;)V
    .locals 3

    .line 199
    invoke-static {p1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->invalidate(Landroid/app/Activity;)Lcom/newrelic/agent/android/gestures/GestureReporter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 201
    invoke-virtual {v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->shutdown()V

    .line 202
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Gesture] Activity stopped ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method pushContext(Landroid/app/Activity;)V
    .locals 4

    .line 154
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 155
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 156
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 157
    const-class v1, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 158
    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v1

    .line 159
    invoke-static {p1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->getGestureReporter(Landroid/app/Activity;)Lcom/newrelic/agent/android/gestures/GestureReporter;

    move-result-object v2

    if-nez v2, :cond_0

    .line 161
    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->provideGestureReporter(Landroid/app/Activity;Landroid/view/View;)Lcom/newrelic/agent/android/gestures/GestureReporter;

    .line 162
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[Gesture] Activity started ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method pushContext(Landroid/app/Fragment;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 185
    invoke-virtual {p1}, Landroid/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 186
    const-class v1, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 188
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/gestures/GestureReporter;->getGestureReporter(Landroid/app/Activity;)Lcom/newrelic/agent/android/gestures/GestureReporter;

    move-result-object v2

    if-nez v2, :cond_0

    .line 190
    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->provideGestureReporter(Landroid/app/Activity;Landroid/view/View;)Lcom/newrelic/agent/android/gestures/GestureReporter;

    .line 191
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[Gesture] Fragment started ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Fragment;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_0

    .line 193
    :cond_0
    invoke-virtual {v2, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->addView(Landroid/view/View;)Ljava/util/Set;

    :cond_1
    :goto_0
    return-void
.end method

.method pushContext(Landroid/support/v4/app/Fragment;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .line 170
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 171
    const-class v1, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/gestures/GestureObserver;->isSubClassOf(Ljava/lang/Object;Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    .line 173
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/gestures/GestureReporter;->getGestureReporter(Landroid/app/Activity;)Lcom/newrelic/agent/android/gestures/GestureReporter;

    move-result-object v2

    if-nez v2, :cond_0

    .line 175
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->provideGestureReporter(Landroid/app/Activity;Landroid/view/View;)Lcom/newrelic/agent/android/gestures/GestureReporter;

    .line 176
    sget-object v0, Lcom/newrelic/agent/android/gestures/GestureObserver;->log:Lcom/newrelic/agent/android/logging/AgentLog;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "[Gesture] Fragment started ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/newrelic/agent/android/logging/AgentLog;->debug(Ljava/lang/String;)V

    goto :goto_0

    .line 178
    :cond_0
    invoke-virtual {v2, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->addView(Landroid/view/View;)Ljava/util/Set;

    :cond_1
    :goto_0
    return-void
.end method
