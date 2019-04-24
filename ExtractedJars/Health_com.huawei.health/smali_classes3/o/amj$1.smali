.class Lo/amj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/amj;


# direct methods
.method constructor <init>(Lo/amj;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lo/amj$1;->d:Lo/amj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 4

    .line 162
    const/4 v0, 0x3

    if-ne v0, p1, :cond_0

    .line 163
    const-string v0, "BloodPressureController"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onServiceConnected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lo/amj$1;->d:Lo/amj;

    move-object v1, p2

    check-cast v1, Landroid/bluetooth/BluetoothHealth;

    invoke-static {v0, v1}, Lo/amj;->c(Lo/amj;Landroid/bluetooth/BluetoothHealth;)Landroid/bluetooth/BluetoothHealth;

    .line 165
    iget-object v0, p0, Lo/amj$1;->d:Lo/amj;

    invoke-static {v0}, Lo/amj;->a(Lo/amj;)Landroid/bluetooth/BluetoothHealth;

    move-result-object v0

    const-string v1, "HDP"

    iget-object v2, p0, Lo/amj$1;->d:Lo/amj;

    invoke-static {v2}, Lo/amj;->c(Lo/amj;)Landroid/bluetooth/BluetoothHealthCallback;

    move-result-object v2

    const/16 v3, 0x1007

    invoke-virtual {v0, v1, v3, v2}, Landroid/bluetooth/BluetoothHealth;->registerSinkAppConfiguration(Ljava/lang/String;ILandroid/bluetooth/BluetoothHealthCallback;)Z

    .line 167
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(I)V
    .locals 2

    .line 170
    const/4 v0, 0x3

    if-ne v0, p1, :cond_0

    .line 171
    iget-object v0, p0, Lo/amj$1;->d:Lo/amj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/amj;->c(Lo/amj;Landroid/bluetooth/BluetoothHealth;)Landroid/bluetooth/BluetoothHealth;

    .line 173
    :cond_0
    return-void
.end method
