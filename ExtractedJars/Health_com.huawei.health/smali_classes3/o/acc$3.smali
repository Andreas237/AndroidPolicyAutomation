.class Lo/acc$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/acc;->c()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/acc;


# direct methods
.method constructor <init>(Lo/acc;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lo/acc$3;->d:Lo/acc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 157
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v1

    .line 159
    if-eqz v1, :cond_2

    .line 160
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 161
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 162
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/bluetooth/BluetoothDevice;

    .line 164
    if-eqz v3, :cond_1

    .line 165
    iget-object v0, p0, Lo/acc$3;->d:Lo/acc;

    invoke-static {v0}, Lo/acc;->e(Lo/acc;)Lo/ace;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/acc$3;->d:Lo/acc;

    invoke-static {v0}, Lo/acc;->e(Lo/acc;)Lo/ace;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/ace;->d(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    :cond_0
    invoke-static {v3}, Lo/acj;->e(Landroid/bluetooth/BluetoothDevice;)Lo/acj;

    move-result-object v4

    .line 167
    iget-object v0, p0, Lo/acc$3;->d:Lo/acc;

    invoke-static {v0, v4}, Lo/acc;->a(Lo/acc;Lo/acl;)V

    .line 171
    :cond_1
    goto :goto_0

    .line 174
    :cond_2
    return-void
.end method
