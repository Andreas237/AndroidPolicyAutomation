.class Lo/drs$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/drs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lo/drs;


# direct methods
.method constructor <init>(Lo/drs;Landroid/os/Looper;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lo/drs$e;->a:Lo/drs;

    .line 88
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 89
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 93
    invoke-static {}, Lo/drs;->d()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "msg.what = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 94
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 98
    :sswitch_0
    iget-object v0, p0, Lo/drs$e;->a:Lo/drs;

    invoke-static {v0, p1}, Lo/drs;->d(Lo/drs;Landroid/os/Message;)V

    .line 99
    goto :goto_0

    .line 101
    :sswitch_1
    iget-object v0, p0, Lo/drs$e;->a:Lo/drs;

    invoke-static {v0, p1}, Lo/drs;->e(Lo/drs;Landroid/os/Message;)V

    .line 102
    goto :goto_0

    .line 105
    :sswitch_2
    iget-object v0, p0, Lo/drs$e;->a:Lo/drs;

    invoke-static {v0, p1}, Lo/drs;->b(Lo/drs;Landroid/os/Message;)V

    .line 106
    goto :goto_0

    .line 109
    :sswitch_3
    iget-object v0, p0, Lo/drs$e;->a:Lo/drs;

    iget-object v1, p0, Lo/drs$e;->a:Lo/drs;

    invoke-static {v1}, Lo/drs;->b(Lo/drs;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lo/drs;->b(Lo/drs;Landroid/content/Context;Landroid/os/Message;)V

    .line 110
    goto :goto_0

    .line 112
    :sswitch_4
    iget-object v0, p0, Lo/drs$e;->a:Lo/drs;

    invoke-static {v0, p1}, Lo/drs;->b(Lo/drs;Landroid/os/Message;)V

    .line 113
    goto :goto_0

    .line 119
    :sswitch_5
    iget-object v0, p0, Lo/drs$e;->a:Lo/drs;

    invoke-static {v0, p1}, Lo/drs;->b(Lo/drs;Landroid/os/Message;)V

    .line 120
    goto :goto_0

    .line 123
    :sswitch_6
    const/4 v3, 0x0

    .line 124
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    if-eqz v0, :cond_0

    .line 125
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;

    .line 127
    :cond_0
    new-instance v4, Lo/dsd;

    iget-object v0, p0, Lo/drs$e;->a:Lo/drs;

    invoke-static {v0}, Lo/drs;->b(Lo/drs;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Lo/dsd;-><init>(Landroid/content/Context;)V

    .line 128
    invoke-virtual {v4, v3}, Lo/dsd;->d(Lcom/huawei/multisimsdk/multidevicemanager/common/InProgressData;)V

    .line 129
    invoke-virtual {v4}, Lo/dsd;->e()V

    .line 130
    .line 134
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_0
        0x66 -> :sswitch_0
        0x6a -> :sswitch_2
        0x6b -> :sswitch_1
        0x71 -> :sswitch_3
        0x72 -> :sswitch_6
        0x73 -> :sswitch_5
        0x75 -> :sswitch_3
        0x77 -> :sswitch_5
        0x7c -> :sswitch_6
        0x7d -> :sswitch_4
        0x7e -> :sswitch_5
        0x22b8 -> :sswitch_2
        0x22b9 -> :sswitch_5
        0x22ba -> :sswitch_5
    .end sparse-switch
.end method
