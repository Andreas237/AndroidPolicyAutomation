.class Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;
.super Ljava/lang/Object;
.source "ApplicationHooks.java"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/core/ApplicationHooks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field public mLastIntent:Landroid/content/Intent;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field final synthetic this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    .line 143
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->access$300(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-static {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->access$300(Lcom/usebutton/sdk/internal/core/ApplicationHooks;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 144
    iget-object p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->access$302(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ApplicationHooks"

    const-string v1, "Exception while handling onActivityDestroyed."

    .line 147
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 126
    :try_start_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->handleBackground()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ApplicationHooks"

    const-string v1, "Exception while handling onActivityPaused."

    .line 128
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    .line 116
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->handleForeground()V

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->access$302(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ApplicationHooks"

    const-string v1, "Exception while handling onActivityResumed."

    .line 119
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    .line 103
    :try_start_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    .line 104
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->mLastIntent:Landroid/content/Intent;

    if-eq p1, v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->this$0:Lcom/usebutton/sdk/internal/core/ApplicationHooks;

    invoke-static {v0, p1}, Lcom/usebutton/sdk/internal/core/ApplicationHooks;->access$200(Lcom/usebutton/sdk/internal/core/ApplicationHooks;Landroid/content/Intent;)V

    .line 107
    :cond_0
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/ApplicationHooks$2;->mLastIntent:Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ApplicationHooks"

    const-string v1, "Exception while handling onActivityStarted."

    .line 109
    invoke-static {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
