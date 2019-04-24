.class Lcom/launchdarkly/android/LDClient$2;
.super Ljava/lang/Object;
.source "LDClient.java"

# interfaces
.implements Lcom/launchdarkly/android/Foreground$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/launchdarkly/android/LDClient;-><init>(Landroid/app/Application;Lcom/launchdarkly/android/LDConfig;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/launchdarkly/android/LDClient;

.field final synthetic val$application:Landroid/app/Application;

.field final synthetic val$environmentName:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/LDClient;Landroid/app/Application;Ljava/lang/String;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/launchdarkly/android/LDClient$2;->this$0:Lcom/launchdarkly/android/LDClient;

    iput-object p2, p0, Lcom/launchdarkly/android/LDClient$2;->val$application:Landroid/app/Application;

    iput-object p3, p0, Lcom/launchdarkly/android/LDClient$2;->val$environmentName:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBecameBackground()V
    .locals 2

    .line 283
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient$2;->this$0:Lcom/launchdarkly/android/LDClient;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDClient;->stopForegroundUpdating()V

    .line 284
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient$2;->this$0:Lcom/launchdarkly/android/LDClient;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/launchdarkly/android/LDClient;->access$102(Lcom/launchdarkly/android/LDClient;Z)Z

    .line 285
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient$2;->this$0:Lcom/launchdarkly/android/LDClient;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDClient;->startBackgroundPolling()V

    return-void
.end method

.method public onBecameForeground()V
    .locals 2

    .line 274
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient$2;->val$application:Landroid/app/Application;

    invoke-static {v0}, Lcom/launchdarkly/android/PollingUpdater;->stop(Landroid/content/Context;)V

    .line 275
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient$2;->this$0:Lcom/launchdarkly/android/LDClient;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/launchdarkly/android/LDClient;->access$102(Lcom/launchdarkly/android/LDClient;Z)Z

    .line 276
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient$2;->val$application:Landroid/app/Application;

    iget-object v1, p0, Lcom/launchdarkly/android/LDClient$2;->val$environmentName:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/launchdarkly/android/Util;->isClientConnected(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 277
    iget-object v0, p0, Lcom/launchdarkly/android/LDClient$2;->this$0:Lcom/launchdarkly/android/LDClient;

    invoke-virtual {v0}, Lcom/launchdarkly/android/LDClient;->startForegroundUpdating()V

    :cond_0
    return-void
.end method
