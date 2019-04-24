.class Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnTouchListenerDelegate;
.super Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate;
.source "ViewListeners.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/instrumentation/ViewListeners;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OnTouchListenerDelegate"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate<",
        "Landroid/view/View$OnTouchListener;",
        ">;",
        "Landroid/view/View$OnTouchListener;"
    }
.end annotation


# static fields
.field static final ON_TOUCH:Ljava/lang/String; = "onTouch"


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View$OnTouchListener;)V
    .locals 0

    .line 112
    invoke-direct {p0, p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate;-><init>(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method getListenerMethod()Ljava/lang/String;
    .locals 1

    const-string v0, "onTouch"

    return-object v0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 118
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnTouchListenerDelegate;->createListenerAttributes()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->recordOnTouch(Landroid/view/View;Landroid/view/MotionEvent;Ljava/util/Map;)V

    .line 119
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnTouchListenerDelegate;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View$OnTouchListener;

    .line 120
    invoke-interface {v2, p1, p2}, Landroid/view/View$OnTouchListener;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v2

    or-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method
