.class Lo/cxk$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cxk;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cxk;


# direct methods
.method constructor <init>(Lo/cxk;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lo/cxk$4;->c:Lo/cxk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 2

    .line 154
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 157
    :sswitch_0
    iget-object v0, p0, Lo/cxk$4;->c:Lo/cxk;

    move-object v1, p2

    check-cast v1, Landroid/bluetooth/BluetoothHeadset;

    invoke-static {v0, v1}, Lo/cxk;->b(Lo/cxk;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;

    .line 158
    .line 166
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public onServiceDisconnected(I)V
    .locals 2

    .line 170
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 173
    :sswitch_0
    iget-object v0, p0, Lo/cxk$4;->c:Lo/cxk;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cxk;->b(Lo/cxk;Landroid/bluetooth/BluetoothHeadset;)Landroid/bluetooth/BluetoothHeadset;

    .line 174
    .line 182
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
