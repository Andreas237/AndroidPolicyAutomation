.class Lo/cxk$d;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cxk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lo/cxk;

.field private d:Z

.field private e:I


# direct methods
.method private constructor <init>(Lo/cxk;)V
    .locals 1

    .line 768
    iput-object p1, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 769
    const/4 v0, 0x0

    iput v0, p0, Lo/cxk$d;->e:I

    .line 770
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cxk$d;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lo/cxk;Lo/cxk$4;)V
    .locals 0

    .line 768
    invoke-direct {p0, p1}, Lo/cxk$d;-><init>(Lo/cxk;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 776
    const/4 v0, 0x0

    iput v0, p0, Lo/cxk$d;->e:I

    .line 777
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 780
    iput-boolean p1, p0, Lo/cxk$d;->d:Z

    .line 781
    return-void
.end method

.method public d(I)V
    .locals 8

    .line 809
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cxk;->b(Lo/cxk;Z)Z

    .line 811
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cxk$d;->d:Z

    .line 812
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->g(Lo/cxk;)Lo/cxk$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 813
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->g(Lo/cxk;)Lo/cxk$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/cxk$d;->b()V

    .line 814
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->g(Lo/cxk;)Lo/cxk$d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cxk$d;->b(Z)V

    .line 816
    :cond_0
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cxk;->c(Lo/cxk;Lo/cxk$d;)Lo/cxk$d;

    .line 819
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->h(Lo/cxk;)Lo/cxl;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 820
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    new-instance v1, Lo/cxl;

    iget-object v2, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v2}, Lo/cxk;->i(Lo/cxk;)Lo/cya;

    move-result-object v2

    invoke-direct {v1, v2}, Lo/cxl;-><init>(Lo/cya;)V

    invoke-static {v0, v1}, Lo/cxk;->b(Lo/cxk;Lo/cxl;)Lo/cxl;

    .line 823
    :cond_1
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->k(Lo/cxk;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 824
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v1

    invoke-static {v0, v1}, Lo/cxk;->b(Lo/cxk;Landroid/bluetooth/BluetoothAdapter;)Landroid/bluetooth/BluetoothAdapter;

    .line 827
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to stopLeScan."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 828
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->k(Lo/cxk;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 830
    :try_start_0
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->k(Lo/cxk;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iget-object v1, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v1}, Lo/cxk;->h(Lo/cxk;)Lo/cxl;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/bluetooth/BluetoothAdapter;->stopLeScan(Landroid/bluetooth/BluetoothAdapter$LeScanCallback;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 833
    goto :goto_0

    .line 831
    :catch_0
    move-exception v6

    .line 832
    const-string v0, "BTDeviceMgrUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IllegalStateException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    :cond_3
    :goto_0
    invoke-static {}, Lo/cxk;->i()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 838
    :try_start_1
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->a(Lo/cxk;)Lo/cya;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 839
    const/4 v0, 0x1

    if-ne v0, p1, :cond_4

    .line 841
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to report ble discover cancel."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 842
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->a(Lo/cxk;)Lo/cya;

    move-result-object v0

    invoke-interface {v0}, Lo/cya;->e()V

    goto :goto_1

    .line 843
    :cond_4
    const/4 v0, 0x2

    if-ne v0, p1, :cond_5

    .line 845
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to report ble discover finish."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 846
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    invoke-static {v0}, Lo/cxk;->a(Lo/cxk;)Lo/cya;

    move-result-object v0

    invoke-interface {v0}, Lo/cya;->a()V

    goto :goto_1

    .line 848
    :cond_5
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "BLE scan handle type is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 852
    :goto_1
    iget-object v0, p0, Lo/cxk$d;->c:Lo/cxk;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cxk;->b(Lo/cxk;Lo/cya;)Lo/cya;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 854
    :cond_6
    monitor-exit v6

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 855
    :goto_2
    return-void
.end method

.method public e()Z
    .locals 1

    .line 784
    iget-boolean v0, p0, Lo/cxk$d;->d:Z

    return v0
.end method

.method public run()V
    .locals 7

    .line 789
    const/4 v0, 0x0

    iput v0, p0, Lo/cxk$d;->e:I

    .line 790
    :goto_0
    invoke-virtual {p0}, Lo/cxk$d;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 792
    iget v0, p0, Lo/cxk$d;->e:I

    const/16 v1, 0xf

    if-le v1, v0, :cond_0

    .line 794
    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 795
    iget v0, p0, Lo/cxk$d;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cxk$d;->e:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 798
    goto :goto_0

    .line 796
    :catch_0
    move-exception v6

    .line 797
    const-string v0, "0xA0200006"

    const-string v1, "01"

    const-string v2, "BTDeviceMgrUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "stop ble discover with sleep occur exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 798
    goto :goto_0

    .line 802
    :cond_0
    const-string v0, "01"

    const-string v1, "BTDeviceMgrUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to stop ble discover for time arrive."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 803
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/cxk$d;->d(I)V

    goto :goto_0

    .line 806
    :cond_1
    return-void
.end method
