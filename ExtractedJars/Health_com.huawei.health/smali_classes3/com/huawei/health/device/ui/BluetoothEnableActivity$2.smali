.class Lcom/huawei/health/device/ui/BluetoothEnableActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/BluetoothEnableActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/device/ui/BluetoothEnableActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/BluetoothEnableActivity;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/health/device/ui/BluetoothEnableActivity$2;->d:Lcom/huawei/health/device/ui/BluetoothEnableActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 32
    iget-object v0, p0, Lcom/huawei/health/device/ui/BluetoothEnableActivity$2;->d:Lcom/huawei/health/device/ui/BluetoothEnableActivity;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/BluetoothEnableActivity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    .line 33
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 34
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 35
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 36
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 37
    iget-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 38
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BluetoothEnableActivity sendMessage "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 40
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "message.obj is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    invoke-static {v0, v5}, Lo/ahj;->d(Ljava/lang/String;Landroid/os/Message;)V

    .line 43
    iget-object v0, p0, Lcom/huawei/health/device/ui/BluetoothEnableActivity$2;->d:Lcom/huawei/health/device/ui/BluetoothEnableActivity;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/BluetoothEnableActivity;->finish()V

    .line 45
    :cond_1
    return-void
.end method
