.class Lcom/twitter/sdk/android/core/internal/SessionMonitor$1;
.super Lio/fabric/sdk/android/ActivityLifecycleManager$Callbacks;
.source "SessionMonitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/twitter/sdk/android/core/internal/SessionMonitor;->monitorActivityLifecycle(Lio/fabric/sdk/android/ActivityLifecycleManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/twitter/sdk/android/core/internal/SessionMonitor;


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/internal/SessionMonitor;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$1;->this$0:Lcom/twitter/sdk/android/core/internal/SessionMonitor;

    invoke-direct {p0}, Lio/fabric/sdk/android/ActivityLifecycleManager$Callbacks;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 73
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$1;->this$0:Lcom/twitter/sdk/android/core/internal/SessionMonitor;

    invoke-virtual {p1}, Lcom/twitter/sdk/android/core/internal/SessionMonitor;->triggerVerificationIfNecessary()V

    return-void
.end method
