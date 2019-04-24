.class Lo/akh$d;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lo/akh;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/akh;)V
    .locals 0

    .line 128
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 129
    return-void
.end method


# virtual methods
.method public a(Lo/akh;Landroid/os/Message;)V
    .locals 4

    .line 132
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 133
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RegisterHandler object is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void

    .line 136
    :cond_0
    const-string v0, "DeviceRegisterManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RegisterHandler msg is "

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

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 137
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 139
    :sswitch_0
    invoke-static {p1}, Lo/akh;->b(Lo/akh;)Lo/aka;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 140
    invoke-static {p1}, Lo/akh;->b(Lo/akh;)Lo/aka;

    move-result-object v0

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 142
    :cond_1
    invoke-static {p1}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 143
    invoke-static {p1}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/16 v2, 0xc1d

    invoke-interface {v0, v2, v1}, Lo/akh$e;->e(I[Ljava/lang/String;)V

    goto :goto_0

    .line 148
    :sswitch_1
    invoke-static {p1}, Lo/akh;->a(Lo/akh;)Lo/akh$d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akh$d;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 149
    invoke-static {p1}, Lo/akh;->b(Lo/akh;)Lo/aka;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 150
    invoke-static {p1}, Lo/akh;->b(Lo/akh;)Lo/aka;

    move-result-object v0

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 152
    :cond_2
    invoke-static {p1}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 153
    invoke-static {p1}, Lo/akh;->e(Lo/akh;)Lo/akh$e;

    move-result-object v0

    iget-object v1, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lo/akh$e;->a(Ljava/lang/Object;)V

    goto :goto_0

    .line 157
    :sswitch_2
    invoke-static {p1}, Lo/akh;->d(Lo/akh;)I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_3

    .line 158
    invoke-virtual {p1}, Lo/akh;->b()V

    .line 159
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/akh;->c(Lo/akh;I)I

    .line 161
    :cond_3
    invoke-static {p1}, Lo/akh;->c(Lo/akh;)I

    .line 162
    invoke-static {p1}, Lo/akh;->a(Lo/akh;)Lo/akh$d;

    move-result-object v0

    const/16 v1, 0x3ea

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Lo/akh$d;->sendEmptyMessageDelayed(IJ)Z

    .line 163
    .line 167
    :cond_4
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x9 -> :sswitch_0
        0x3ea -> :sswitch_2
    .end sparse-switch
.end method

.method public synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 125
    move-object v0, p1

    check-cast v0, Lo/akh;

    invoke-virtual {p0, v0, p2}, Lo/akh$d;->a(Lo/akh;Landroid/os/Message;)V

    return-void
.end method
