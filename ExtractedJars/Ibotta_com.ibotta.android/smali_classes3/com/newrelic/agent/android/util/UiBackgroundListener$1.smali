.class Lcom/newrelic/agent/android/util/UiBackgroundListener$1;
.super Ljava/lang/Object;
.source "UiBackgroundListener.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/util/UiBackgroundListener;->onTrimMemory(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/util/UiBackgroundListener;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/util/UiBackgroundListener;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/newrelic/agent/android/util/UiBackgroundListener$1;->this$0:Lcom/newrelic/agent/android/util/UiBackgroundListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 33
    invoke-static {}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->getInstance()Lcom/newrelic/agent/android/background/ApplicationStateMonitor;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/agent/android/background/ApplicationStateMonitor;->uiHidden()V

    return-void
.end method
