.class public Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/alt;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/alt;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 22
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;->a:Ljava/lang/ref/WeakReference;

    .line 23
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/huawei/health/manager/receiver/DaemonDynamicBroadcastReceiver;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/alt;

    .line 32
    if-eqz v1, :cond_0

    if-eqz p2, :cond_0

    .line 33
    invoke-virtual {v1, p2}, Lo/alt;->c(Landroid/content/Intent;)V

    .line 37
    :cond_0
    return-void
.end method
