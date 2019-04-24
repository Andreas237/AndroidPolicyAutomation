.class Lo/akg$a;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lo/akg;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/akg;Landroid/os/Looper;)V
    .locals 0

    .line 93
    invoke-direct {p0, p1, p2}, Lo/aju;-><init>(Ljava/lang/Object;Landroid/os/Looper;)V

    .line 94
    return-void
.end method


# virtual methods
.method public c(Lo/akg;Landroid/os/Message;)V
    .locals 4

    .line 99
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 100
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceHandler object is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 101
    return-void

    .line 103
    :cond_0
    const-string v0, "AddDeviceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessage msg is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p2, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 104
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    .line 105
    invoke-static {p1, p2}, Lo/akg;->c(Lo/akg;Landroid/os/Message;)V

    goto :goto_0

    .line 106
    :cond_1
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0xa

    if-le v0, v1, :cond_2

    .line 107
    invoke-static {p1, p2}, Lo/akg;->b(Lo/akg;Landroid/os/Message;)V

    .line 109
    :cond_2
    :goto_0
    return-void
.end method

.method public synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 90
    move-object v0, p1

    check-cast v0, Lo/akg;

    invoke-virtual {p0, v0, p2}, Lo/akg$a;->c(Lo/akg;Landroid/os/Message;)V

    return-void
.end method
