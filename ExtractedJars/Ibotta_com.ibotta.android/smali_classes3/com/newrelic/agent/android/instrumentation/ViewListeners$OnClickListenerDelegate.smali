.class Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnClickListenerDelegate;
.super Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate;
.source "ViewListeners.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/instrumentation/ViewListeners;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OnClickListenerDelegate"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate<",
        "Landroid/view/View$OnClickListener;",
        ">;",
        "Landroid/view/View$OnClickListener;"
    }
.end annotation


# static fields
.field static final ON_CLICK:Ljava/lang/String; = "onClick"


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 89
    invoke-direct {p0, p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate;-><init>(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method getListenerMethod()Ljava/lang/String;
    .locals 1

    const-string v0, "onClick"

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 94
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnClickListenerDelegate;->createListenerAttributes()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->recordOnClick(Landroid/view/View;Ljava/util/Map;)V

    .line 95
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnClickListenerDelegate;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View$OnClickListener;

    if-eqz v1, :cond_0

    .line 97
    invoke-interface {v1, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    return-void
.end method
