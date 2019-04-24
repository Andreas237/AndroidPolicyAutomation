.class Lo/dqs$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dqs;


# direct methods
.method constructor <init>(Lo/dqs;)V
    .locals 0

    .line 853
    iput-object p1, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    .line 856
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Service is connected"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 857
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v0, p1}, Lo/dqs;->c(Lo/dqs;Landroid/content/ComponentName;)Z

    move-result v3

    .line 858
    if-nez v3, :cond_0

    .line 859
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Check service identity failed, unbind service."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 862
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-virtual {v0}, Lo/dqs;->e()I

    .line 863
    return-void

    .line 865
    :cond_0
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {p2}, Lo/dsu$d;->e(Landroid/os/IBinder;)Lo/dsu;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dqs;->a(Lo/dqs;Lo/dsu;)Lo/dsu;

    .line 868
    :try_start_0
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->e(Lo/dqs;)Landroid/os/IBinder$DeathRecipient;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    .line 869
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->h(Lo/dqs;)Lo/dsu;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 870
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    iget-object v1, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v1}, Lo/dqs;->h(Lo/dqs;)Lo/dsu;

    move-result-object v1

    const-string v2, "com.huawei.hwmultisim"

    invoke-interface {v1, v2}, Lo/dsu;->e(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Lo/dsr$c;->c(Landroid/os/IBinder;)Lo/dsr;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dqs;->a(Lo/dqs;Lo/dsr;)Lo/dsr;

    .line 872
    :cond_1
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 873
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    iget-object v1, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v1}, Lo/dqs;->b(Lo/dqs;)Lo/dsw$d;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dsr;->a(Lo/dsw;)V

    .line 874
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dqs;->e(I)I

    goto :goto_0

    .line 876
    :cond_2
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Service is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 881
    :goto_0
    goto :goto_1

    .line 878
    :catch_0
    move-exception v4

    .line 879
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dqs;->e(I)I

    .line 880
    const-string v0, "AttachedDeviceManager"

    const-string v1, "ServiceConnected RemoteException occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 882
    :goto_1
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {}, Lo/dqs;->g()I

    move-result v1

    invoke-static {v0, v1}, Lo/dqs;->b(Lo/dqs;I)V

    .line 883
    const-string v0, "AttachedDeviceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "MultiSimService connected status is: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lo/dqs;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 884
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    .line 888
    const-string v0, "AttachedDeviceManager"

    const-string v1, "MultiSim Service disconnected."

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 889
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 891
    :try_start_0
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v0}, Lo/dqs;->d(Lo/dqs;)Lo/dsr;

    move-result-object v0

    iget-object v1, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {v1}, Lo/dqs;->b(Lo/dqs;)Lo/dsw$d;

    move-result-object v1

    invoke-interface {v0, v1}, Lo/dsr;->c(Lo/dsw;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 894
    goto :goto_0

    .line 892
    :catch_0
    move-exception v2

    .line 893
    const-string v0, "AttachedDeviceManager"

    const-string v1, "UnRegisterCallback failed, remote exception occurred."

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 894
    goto :goto_0

    .line 896
    :cond_0
    const-string v0, "AttachedDeviceManager"

    const-string v1, "Service is null"

    invoke-static {v0, v1}, Lo/dsc;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 898
    :goto_0
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dqs;->a(Lo/dqs;Lo/dsr;)Lo/dsr;

    .line 899
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dqs;->e(I)I

    .line 900
    iget-object v0, p0, Lo/dqs$2;->d:Lo/dqs;

    invoke-static {}, Lo/dqs;->g()I

    move-result v1

    invoke-static {v0, v1}, Lo/dqs;->b(Lo/dqs;I)V

    .line 901
    return-void
.end method
