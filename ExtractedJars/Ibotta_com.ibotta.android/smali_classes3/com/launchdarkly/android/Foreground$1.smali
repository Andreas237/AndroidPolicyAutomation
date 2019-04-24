.class Lcom/launchdarkly/android/Foreground$1;
.super Ljava/lang/Object;
.source "Foreground.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/Foreground;->onActivityPaused(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/Foreground;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/Foreground;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/launchdarkly/android/Foreground$1;->this$0:Lcom/launchdarkly/android/Foreground;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 163
    iget-object v0, p0, Lcom/launchdarkly/android/Foreground$1;->this$0:Lcom/launchdarkly/android/Foreground;

    invoke-static {v0}, Lcom/launchdarkly/android/Foreground;->access$000(Lcom/launchdarkly/android/Foreground;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/launchdarkly/android/Foreground$1;->this$0:Lcom/launchdarkly/android/Foreground;

    invoke-static {v0}, Lcom/launchdarkly/android/Foreground;->access$100(Lcom/launchdarkly/android/Foreground;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/launchdarkly/android/Foreground$1;->this$0:Lcom/launchdarkly/android/Foreground;

    invoke-static {v0, v1}, Lcom/launchdarkly/android/Foreground;->access$002(Lcom/launchdarkly/android/Foreground;Z)Z

    const-string v0, "went background"

    .line 165
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget-object v0, p0, Lcom/launchdarkly/android/Foreground$1;->this$0:Lcom/launchdarkly/android/Foreground;

    invoke-static {v0}, Lcom/launchdarkly/android/Foreground;->access$200(Lcom/launchdarkly/android/Foreground;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/launchdarkly/android/Foreground$Listener;

    .line 168
    :try_start_0
    invoke-interface {v2}, Lcom/launchdarkly/android/Foreground$Listener;->onBecameBackground()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Listener threw exception!"

    .line 170
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v0, "still foreground"

    .line 174
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
