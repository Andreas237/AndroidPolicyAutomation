.class Lcom/huawei/health/MainActivity$18;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/MainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/MainActivity;)V
    .locals 0

    .line 3654
    iput-object p1, p0, Lcom/huawei/health/MainActivity$18;->a:Lcom/huawei/health/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .line 3657
    const-string v0, "Login_MainActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BindDeviceBroadcastReceiver enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3658
    const-string v0, "devicinfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiDeviceInfo;

    .line 3659
    iget-object v0, p0, Lcom/huawei/health/MainActivity$18;->a:Lcom/huawei/health/MainActivity;

    iget-object v1, p0, Lcom/huawei/health/MainActivity$18;->a:Lcom/huawei/health/MainActivity;

    invoke-static {v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x2710

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "SAVE_BIND_TO_ODMF"

    invoke-static {v1, v2, v3}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 3660
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceTypeMapping()I

    move-result v5

    .line 3663
    iget-object v0, p0, Lcom/huawei/health/MainActivity$18;->a:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->L(Lcom/huawei/health/MainActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "TRUE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    if-ne v5, v0, :cond_1

    .line 3664
    :cond_0
    return-void

    .line 3666
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiDeviceInfo;->getDeviceInfoToODMF()Ljava/lang/String;

    move-result-object v6

    .line 3667
    iget-object v0, p0, Lcom/huawei/health/MainActivity$18;->a:Lcom/huawei/health/MainActivity;

    invoke-static {v0}, Lcom/huawei/health/MainActivity;->b(Lcom/huawei/health/MainActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lo/dnn;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 3668
    return-void
.end method
