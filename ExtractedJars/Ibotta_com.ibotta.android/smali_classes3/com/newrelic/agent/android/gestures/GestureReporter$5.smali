.class final Lcom/newrelic/agent/android/gestures/GestureReporter$5;
.super Ljava/lang/Object;
.source "GestureReporter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/gestures/GestureReporter;->recordOnLongClick(Landroid/view/View;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$attributes:Ljava/util/Map;

.field final synthetic val$gestureReporter:Lcom/newrelic/agent/android/gestures/GestureReporter;

.field final synthetic val$v:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/view/View;Lcom/newrelic/agent/android/gestures/GestureReporter;Ljava/util/Map;)V
    .locals 0

    .line 440
    iput-object p1, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$5;->val$v:Landroid/view/View;

    iput-object p2, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$5;->val$gestureReporter:Lcom/newrelic/agent/android/gestures/GestureReporter;

    iput-object p3, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$5;->val$attributes:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 443
    invoke-static {}, Lcom/newrelic/agent/android/gestures/GestureReporter;->access$000()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Gesture] onLongClick ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$5;->val$v:Landroid/view/View;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->audit(Ljava/lang/String;)V

    .line 444
    iget-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$5;->val$gestureReporter:Lcom/newrelic/agent/android/gestures/GestureReporter;

    iget-object v1, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$5;->val$v:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->createGestureViewAttributes(Landroid/view/View;)Ljava/util/Map;

    move-result-object v0

    .line 445
    iget-object v1, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$5;->val$attributes:Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 446
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 448
    :cond_0
    invoke-static {}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->getInstance()Lcom/newrelic/agent/android/connectivity/UserActionFacade;

    move-result-object v1

    sget-object v2, Lcom/newrelic/agent/android/connectivity/UserActionType;->DoubleTap:Lcom/newrelic/agent/android/connectivity/UserActionType;

    invoke-virtual {v1, v2, v0}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->recordUserAction(Lcom/newrelic/agent/android/connectivity/UserActionType;Ljava/util/Map;)V

    return-void
.end method
