.class public Lcom/newrelic/agent/android/instrumentation/ViewListeners;
.super Ljava/lang/Object;
.source "ViewListeners.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;,
        Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnItemClickListenerDelegate;,
        Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnLongClickListenerDelegate;,
        Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnTouchListenerDelegate;,
        Lcom/newrelic/agent/android/instrumentation/ViewListeners$OnClickListenerDelegate;,
        Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerDelegate;
    }
.end annotation


# static fields
.field static final AGENT_PACKAGE_NAME:Ljava/lang/String; = "com.newrelic.agent.android"

.field static final GESTURES_PACKAGE_NAME:Ljava/lang/String; = "com.newrelic.agent.android.gestures"

.field static final SET_ON_CLICK_LISTENER:Ljava/lang/String; = "setOnClickListener"

.field static final SET_ON_LONG_CLICK_LISTENER:Ljava/lang/String; = "setOnLongClickListener"

.field static final SET_ON_TOUCH_LISTENER:Ljava/lang/String; = "setOnTouchListener"

.field static listenerCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 177
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/ViewListeners;->listenerCache:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getListenerElement(I)Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;
    .locals 1

    .line 180
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/ViewListeners;->listenerCache:Ljava/util/Map;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/instrumentation/ViewListeners$ListenerElement;

    return-object p0
.end method

.method public static resetCaches()V
    .locals 0

    .line 188
    invoke-static {}, Lcom/newrelic/agent/android/instrumentation/ViewListeners;->resetTouchCache()V

    return-void
.end method

.method public static resetTouchCache()V
    .locals 1

    .line 184
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/ViewListeners;->listenerCache:Ljava/util/Map;

    return-void
.end method
