.class Lo/amj$3;
.super Landroid/bluetooth/BluetoothHealthCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/amj;


# direct methods
.method constructor <init>(Lo/amj;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lo/amj$3;->e:Lo/amj;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothHealthCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onHealthAppConfigurationStatusChange(Landroid/bluetooth/BluetoothHealthAppConfiguration;I)V
    .locals 4

    .line 179
    const/4 v0, 0x1

    if-ne v0, p2, :cond_0

    .line 180
    iget-object v0, p0, Lo/amj$3;->e:Lo/amj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/amj;->c(Lo/amj;Landroid/bluetooth/BluetoothHealthAppConfiguration;)Landroid/bluetooth/BluetoothHealthAppConfiguration;

    goto :goto_0

    .line 181
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 182
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHealthAppConfigurationStatusChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    iget-object v0, p0, Lo/amj$3;->e:Lo/amj;

    invoke-static {v0, p1}, Lo/amj;->c(Lo/amj;Landroid/bluetooth/BluetoothHealthAppConfiguration;)Landroid/bluetooth/BluetoothHealthAppConfiguration;

    .line 185
    :cond_1
    :goto_0
    return-void
.end method

.method public onHealthChannelStateChange(Landroid/bluetooth/BluetoothHealthAppConfiguration;Landroid/bluetooth/BluetoothDevice;IILandroid/os/ParcelFileDescriptor;I)V
    .locals 4

    .line 191
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    const/4 v0, 0x2

    if-ne v0, p4, :cond_0

    .line 192
    iget-object v0, p0, Lo/amj$3;->e:Lo/amj;

    invoke-static {v0}, Lo/amj;->e(Lo/amj;)Landroid/bluetooth/BluetoothHealthAppConfiguration;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothHealthAppConfiguration;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lo/amj$3;->e:Lo/amj;

    invoke-static {v0, p6}, Lo/amj;->b(Lo/amj;I)I

    .line 194
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onHealthChannelStateChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    iget-object v0, p0, Lo/amj$3;->e:Lo/amj;

    invoke-static {v0, p5}, Lo/amj;->d(Lo/amj;Landroid/os/ParcelFileDescriptor;)V

    .line 198
    :cond_0
    return-void
.end method
