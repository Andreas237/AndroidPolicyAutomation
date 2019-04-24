.class Lcom/newrelic/agent/android/gestures/GestureReporter$2;
.super Ljava/lang/Object;
.source "GestureReporter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/gestures/GestureReporter;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/gestures/GestureReporter;

.field final synthetic val$event:Landroid/view/MotionEvent;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/gestures/GestureReporter;Landroid/view/MotionEvent;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$2;->this$0:Lcom/newrelic/agent/android/gestures/GestureReporter;

    iput-object p2, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$2;->val$event:Landroid/view/MotionEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 123
    invoke-static {}, Lcom/newrelic/agent/android/gestures/GestureReporter;->access$000()Lcom/newrelic/agent/android/logging/AgentLog;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Gesture] onSingleTapConfirmed: MotionEvent["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$2;->val$event:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/newrelic/agent/android/logging/AgentLog;->audit(Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$2;->this$0:Lcom/newrelic/agent/android/gestures/GestureReporter;

    iget-object v1, p0, Lcom/newrelic/agent/android/gestures/GestureReporter$2;->val$event:Landroid/view/MotionEvent;

    invoke-virtual {v0, v1}, Lcom/newrelic/agent/android/gestures/GestureReporter;->createGestureMotionEventAttributes(Landroid/view/MotionEvent;)Ljava/util/Map;

    move-result-object v0

    .line 125
    invoke-static {}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->getInstance()Lcom/newrelic/agent/android/connectivity/UserActionFacade;

    move-result-object v1

    sget-object v2, Lcom/newrelic/agent/android/connectivity/UserActionType;->Tap:Lcom/newrelic/agent/android/connectivity/UserActionType;

    invoke-virtual {v1, v2, v0}, Lcom/newrelic/agent/android/connectivity/UserActionFacade;->recordUserAction(Lcom/newrelic/agent/android/connectivity/UserActionType;Ljava/util/Map;)V

    return-void
.end method
