.class Lo/acc$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothAdapter$LeScanCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/acc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/acc;


# direct methods
.method constructor <init>(Lo/acc;)V
    .locals 0

    .line 211
    iput-object p1, p0, Lo/acc$4;->a:Lo/acc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLeScan(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 3

    .line 217
    if-eqz p1, :cond_3

    .line 218
    iget-object v0, p0, Lo/acc$4;->a:Lo/acc;

    invoke-static {v0}, Lo/acc;->e(Lo/acc;)Lo/ace;

    move-result-object v0

    if-nez v0, :cond_1

    .line 219
    invoke-static {p1}, Lo/acg;->c(Landroid/bluetooth/BluetoothDevice;)Lo/acg;

    move-result-object v2

    .line 220
    invoke-virtual {v2}, Lo/acg;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 221
    iget-object v0, p0, Lo/acc$4;->a:Lo/acc;

    invoke-static {v0, v2}, Lo/acc;->a(Lo/acc;Lo/acl;)V

    .line 223
    :cond_0
    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo/acc$4;->a:Lo/acc;

    invoke-static {v0}, Lo/acc;->e(Lo/acc;)Lo/ace;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/ace;->c([B)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/acc$4;->a:Lo/acc;

    invoke-static {v0}, Lo/acc;->e(Lo/acc;)Lo/ace;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/ace;->d(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 224
    :cond_2
    invoke-static {p1}, Lo/acg;->c(Landroid/bluetooth/BluetoothDevice;)Lo/acg;

    move-result-object v2

    .line 225
    invoke-virtual {v2}, Lo/acg;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 226
    iget-object v0, p0, Lo/acc$4;->a:Lo/acc;

    invoke-static {v0, v2}, Lo/acc;->a(Lo/acc;Lo/acl;)V

    .line 230
    :cond_3
    :goto_0
    return-void
.end method
