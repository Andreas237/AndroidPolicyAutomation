.class Lo/afw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


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

    .line 142
    iput-object p1, p0, Lo/afw$1;->c:Lo/afw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 4

    .line 144
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 145
    iget-object v0, p0, Lo/afw$1;->c:Lo/afw;

    move-object v1, p2

    check-cast v1, Landroid/bluetooth/BluetoothHealth;

    invoke-static {v0, v1}, Lo/afw;->b(Lo/afw;Landroid/bluetooth/BluetoothHealth;)Landroid/bluetooth/BluetoothHealth;

    .line 146
    iget-object v0, p0, Lo/afw$1;->c:Lo/afw;

    invoke-static {v0}, Lo/afw;->d(Lo/afw;)Landroid/bluetooth/BluetoothHealth;

    move-result-object v0

    const-string v1, "HDP"

    iget-object v2, p0, Lo/afw$1;->c:Lo/afw;

    invoke-virtual {v2}, Lo/afw;->a()I

    move-result v2

    iget-object v3, p0, Lo/afw$1;->c:Lo/afw;

    invoke-static {v3}, Lo/afw;->e(Lo/afw;)Landroid/bluetooth/BluetoothHealthCallback;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/BluetoothHealth;->registerSinkAppConfiguration(Ljava/lang/String;ILandroid/bluetooth/BluetoothHealthCallback;)Z

    .line 148
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(I)V
    .locals 2

    .line 151
    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    .line 152
    iget-object v0, p0, Lo/afw$1;->c:Lo/afw;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/afw;->b(Lo/afw;Landroid/bluetooth/BluetoothHealth;)Landroid/bluetooth/BluetoothHealth;

    .line 154
    :cond_0
    return-void
.end method
