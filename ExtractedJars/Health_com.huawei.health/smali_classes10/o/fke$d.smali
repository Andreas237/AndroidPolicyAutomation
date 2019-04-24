.class Lo/fke$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fke;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lo/fke;


# direct methods
.method public constructor <init>(Lo/fke;Landroid/os/Looper;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lo/fke$d;->d:Lo/fke;

    .line 130
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 131
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 134
    if-eqz p1, :cond_0

    .line 135
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 136
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 139
    :sswitch_0
    iget-object v0, p0, Lo/fke$d;->d:Lo/fke;

    invoke-static {v0}, Lo/fke;->c(Lo/fke;)V

    .line 140
    iget-object v0, p0, Lo/fke$d;->d:Lo/fke;

    invoke-static {v0}, Lo/fke;->a(Lo/fke;)I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x3e8

    invoke-virtual {p0, v2, v0, v1}, Lo/fke$d;->sendEmptyMessageDelayed(IJ)Z

    .line 141
    goto :goto_1

    .line 144
    :sswitch_1
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 145
    const-string v0, "Track_TreadmillManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_REPORT_TREADMILL_STYLE treadmill newStyle is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    iget-object v0, p0, Lo/fke$d;->d:Lo/fke;

    invoke-static {v0, v4}, Lo/fke;->b(Lo/fke;I)V

    .line 147
    goto :goto_1

    .line 150
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 154
    :cond_0
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
        0x3e9 -> :sswitch_1
    .end sparse-switch
.end method
