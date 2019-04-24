.class Lo/ale$d;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ale;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic b:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;)V
    .locals 0

    .line 2859
    iput-object p1, p0, Lo/ale$d;->b:Lo/ale;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 2862
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SyncBroadcastReceiver onReceive()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2863
    if-nez p2, :cond_0

    .line 2864
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onReceive mReceiver intent null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2865
    return-void

    .line 2867
    :cond_0
    const/4 v4, 0x0

    .line 2869
    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 2872
    goto :goto_0

    .line 2870
    :catch_0
    move-exception v5

    .line 2871
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SyncBroadcastReceiver getAction exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2874
    :goto_0
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->n(Lo/ale;)Landroid/os/Handler;

    move-result-object v5

    .line 2875
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 2876
    return-void

    .line 2879
    :cond_1
    const-string v0, "com.huawei.hihealth.action_sync"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2880
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SyncBroadcastReceiver action = ACTION_SYNC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2881
    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v5, v0, v1, v2, p2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 2882
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2884
    const-string v0, "com.huawei.hihealth.action_sync_status"

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 2885
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HiBroadcastAction ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2886
    const/16 v0, 0x3e8

    if-ne v0, v7, :cond_2

    .line 2887
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->D(Lo/ale;)V

    .line 2890
    :cond_2
    const-string v0, "com.huawei.hihealth.action_sqlite_upgrade_done"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "com.huawei.hihealth.action_sqlite_upgrade_exception"

    .line 2891
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2892
    :cond_3
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: SyncBroadcastReceiver action = ACTION_SQLITE_UPGRADE_DONE oldhuidhistory = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v2}, Lo/ale;->u(Lo/ale;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2893
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->u(Lo/ale;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    .line 2894
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: SyncBroadcastReceiver action = ACTION_SQLITE_UPGRADE_DONE oldhuidhistory not 1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2895
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ale;->d(Lo/ale;I)V

    .line 2899
    :cond_4
    const-string v0, "com.huawei.plugin.account.logout"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2900
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "LocalBroadcast.ACTION_LOGOUT_SUCCESSFUL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2901
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 2902
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->F(Lo/ale;)J

    move-result-wide v0

    sub-long v0, v6, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    if-gez v0, :cond_5

    .line 2903
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentTime - mLastAccessTime  < INTERVAL_TIME_VALUE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2904
    return-void

    .line 2906
    :cond_5
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v0, v6, v7}, Lo/ale;->b(Lo/ale;J)J

    .line 2907
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    const-string v1, "logoutNotExit"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v0, v1}, Lo/ale;->d(Lo/ale;Z)Z

    .line 2908
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "accountmigrate: relogin SyncBroadcastReceiver action = ACTION_LOGOUT_SUCCESSFUL loginnotexit 111 invalidST = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "invalidst"

    invoke-virtual {p2, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2909
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->G(Lo/ale;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->I(Lo/ale;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 2910
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: relogin SyncBroadcastReceiver action = ACTION_LOGOUT_SUCCESSFUL loginnotexit"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 2912
    :cond_6
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: relogin: SyncBroadcastReceiver action = ACTION_LOGOUT_SUCCESSFUL loginnotexit = false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2920
    new-instance v8, Lo/dcy;

    const/4 v0, 0x0

    invoke-direct {v8, v0}, Lo/dcy;-><init>(I)V

    .line 2921
    iget-object v0, p0, Lo/ale$d;->b:Lo/ale;

    invoke-static {v0}, Lo/ale;->e(Lo/ale;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_app_third_login"

    const-string v3, "0"

    invoke-static {v0, v1, v2, v3, v8}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2924
    :cond_7
    :goto_1
    return-void
.end method
