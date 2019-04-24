.class public Lcom/ibotta/android/receiver/work/ScheduledWorkReceiver;
.super Landroid/content/BroadcastReceiver;
.source "ScheduledWorkReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    const-string v0, "onReceive"

    const/4 v1, 0x0

    .line 18
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    invoke-static {p1, p2}, Lcom/ibotta/android/service/work/ScheduledWorkService;->doWork(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
