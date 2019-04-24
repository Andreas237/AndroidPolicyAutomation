.class Lo/afw$2;
.super Landroid/bluetooth/BluetoothHealthCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/afw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/afw;


# direct methods
.method constructor <init>(Lo/afw;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/afw$2;->c:Lo/afw;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothHealthCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onHealthAppConfigurationStatusChange(Landroid/bluetooth/BluetoothHealthAppConfiguration;I)V
    .locals 4

    .line 118
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onHealthAppConfigurationStatusChange status is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 120
    iget-object v0, p0, Lo/afw$2;->c:Lo/afw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/afw;->b(Lo/afw;Landroid/bluetooth/BluetoothHealthAppConfiguration;)Landroid/bluetooth/BluetoothHealthAppConfiguration;

    goto :goto_0

    .line 122
    :cond_0
    if-nez p2, :cond_1

    .line 123
    iget-object v0, p0, Lo/afw$2;->c:Lo/afw;

    invoke-static {v0, p1}, Lo/afw;->b(Lo/afw;Landroid/bluetooth/BluetoothHealthAppConfiguration;)Landroid/bluetooth/BluetoothHealthAppConfiguration;

    .line 125
    :cond_1
    :goto_0
    return-void
.end method

.method public onHealthChannelStateChange(Landroid/bluetooth/BluetoothHealthAppConfiguration;Landroid/bluetooth/BluetoothDevice;IILandroid/os/ParcelFileDescriptor;I)V
    .locals 6

    .line 131
    if-nez p3, :cond_0

    const/4 v0, 0x2

    if-ne p4, v0, :cond_0

    .line 133
    iget-object v0, p0, Lo/afw$2;->c:Lo/afw;

    invoke-static {v0}, Lo/afw;->b(Lo/afw;)Landroid/bluetooth/BluetoothHealthAppConfiguration;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/bluetooth/BluetoothHealthAppConfiguration;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 134
    iget-object v0, p0, Lo/afw$2;->c:Lo/afw;

    invoke-static {v0, p6}, Lo/afw;->b(Lo/afw;I)I

    .line 136
    new-instance v0, Lo/afw$d;

    iget-object v1, p0, Lo/afw$2;->c:Lo/afw;

    move v2, p3

    move v3, p4

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lo/afw$d;-><init>(Lo/afw;IILandroid/os/ParcelFileDescriptor;I)V

    invoke-static {v0}, Lo/ahj;->c(Ljava/lang/Runnable;)V

    .line 139
    :cond_0
    return-void
.end method
