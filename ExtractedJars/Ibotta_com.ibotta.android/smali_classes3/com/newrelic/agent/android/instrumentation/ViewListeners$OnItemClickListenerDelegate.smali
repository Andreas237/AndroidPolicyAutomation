.class Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;
.super Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate;
.source "ViewListeners.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/instrumentation/ViewListeners;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OnItemClickListenerDelegate"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate<",
        "Landroid/widget/AdapterView$OnItemClickListener;",
        ">;",
        "Landroid/widget/AdapterView$OnItemClickListener;"
    }
.end annotation


# static fields
.field static final ON_ITEM_CLICK:Ljava/lang/String; = "onItemClick"


# direct methods
.method public constructor <init>(Landroid/widget/AdapterView;Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .line 158
    invoke-direct {p0, p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate;-><init>(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method getListenerMethod()Ljava/lang/String;
    .locals 1

    const-string v0, "onItemClick"

    return-object v0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 168
    invoke-virtual {p0}, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;->createListenerAttributes()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/gestures/GestureReporter;->recordOnClick(Landroid/view/View;Ljava/util/Map;)V

    .line 169
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;->listeners:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/widget/AdapterView$OnItemClickListener;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, p4

    .line 170
    invoke-interface/range {v2 .. v7}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    goto :goto_0

    :cond_0
    return-void
.end method
