.class final Lo/dkt$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 7

    .line 145
    const-string v0, "PhoneServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServiceConnection callback -"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-static {p2}, Lo/dbx$a;->c(Landroid/os/IBinder;)Lo/dbx;

    move-result-object v4

    .line 148
    const-string v0, "com.huawei.health"

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v4, v0, v1}, Lo/dbx;->a(Ljava/lang/String;I)Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/djz$d;->b(Landroid/os/IBinder;)Lo/djz;

    move-result-object v0

    invoke-static {v0}, Lo/dkt;->a(Lo/djz;)V

    .line 150
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 151
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 152
    invoke-static {}, Lo/dkt;->c()Lo/djz;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 154
    :try_start_1
    invoke-static {}, Lo/dkt;->c()Lo/djz;

    move-result-object v0

    invoke-static {}, Lo/dkt;->b()Lo/djr;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/djz;->d(Lo/djr;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    .line 158
    goto :goto_0

    .line 155
    :catch_0
    move-exception v6

    .line 157
    const-string v0, "PhoneServiceManager"

    const/4 v1, 0x2

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remote exception -:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1

    .line 162
    :cond_0
    :goto_0
    goto :goto_1

    .line 160
    :catch_1
    move-exception v5

    .line 161
    const-string v0, "PhoneServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remote1 exception -:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_1
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 5

    .line 166
    const-string v0, "PhoneServiceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remote onServiceDisconnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    invoke-static {}, Lo/dkt;->e()Lo/djp;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 169
    :try_start_0
    invoke-static {}, Lo/dkt;->e()Lo/djp;

    move-result-object v0

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lo/djp;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    goto :goto_0

    .line 170
    :catch_0
    move-exception v4

    .line 172
    const-string v0, "PhoneServiceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remote exception -:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    :cond_0
    :goto_0
    return-void
.end method
