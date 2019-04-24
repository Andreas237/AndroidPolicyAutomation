.class Lo/amc$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/amc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lo/amc;


# direct methods
.method public constructor <init>(Lo/amc;Landroid/os/Looper;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/amc$a;->e:Lo/amc;

    .line 82
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 83
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 86
    if-eqz p1, :cond_2

    .line 87
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 90
    :sswitch_0
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    invoke-virtual {v0}, Lo/amc;->a()V

    .line 91
    goto/16 :goto_1

    .line 95
    :sswitch_1
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v0}, Lo/amc;->e(Lo/amc;)Lo/amc$a;

    move-result-object v0

    if-nez v0, :cond_0

    .line 96
    return-void

    .line 100
    :cond_0
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v0}, Lo/amc;->c(Lo/amc;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 101
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v0}, Lo/amc;->e(Lo/amc;)Lo/amc$a;

    move-result-object v0

    iget-object v1, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v1}, Lo/amc;->d(Lo/amc;)I

    move-result v1

    add-int/lit16 v1, v1, -0x1f4

    int-to-long v1, v1

    const/16 v3, 0x3e9

    invoke-virtual {v0, v3, v1, v2}, Lo/amc$a;->sendEmptyMessageDelayed(IJ)Z

    .line 103
    :cond_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 104
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    const-string v1, "refresh"

    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    invoke-static {v0, v1}, Lo/amc;->e(Lo/amc;Z)V

    .line 106
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v0}, Lo/amc;->e(Lo/amc;)Lo/amc$a;

    move-result-object v0

    iget-object v1, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v1}, Lo/amc;->d(Lo/amc;)I

    move-result v1

    int-to-long v1, v1

    const/16 v3, 0x3e8

    invoke-virtual {v0, v3, v1, v2}, Lo/amc$a;->sendEmptyMessageDelayed(IJ)Z

    .line 107
    goto :goto_1

    .line 110
    :sswitch_2
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lo/amc;->e(Lo/amc;I)I

    .line 111
    goto :goto_1

    .line 114
    :sswitch_3
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lo/amc;->b(Lo/amc;I)I

    .line 115
    goto :goto_1

    .line 119
    :sswitch_4
    const-string v0, "RealTimeStepDataReportHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "try recovery Motion track "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v2}, Lo/amc;->b(Lo/amc;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v0}, Lo/amc;->b(Lo/amc;)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    .line 122
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    iget-object v1, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v1}, Lo/amc;->a(Lo/amc;)Landroid/content/Context;

    move-result-object v1

    const-string v2, "com.huawei.track.restart"

    invoke-static {v0, v1, v2}, Lo/amc;->c(Lo/amc;Landroid/content/Context;Ljava/lang/String;)V

    .line 123
    iget-object v0, p0, Lo/amc$a;->e:Lo/amc;

    invoke-static {v0}, Lo/amc;->h(Lo/amc;)I

    goto :goto_1

    .line 129
    :goto_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 133
    :cond_2
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_1
        0x3e9 -> :sswitch_0
        0x3ea -> :sswitch_2
        0x3eb -> :sswitch_3
        0x7d0 -> :sswitch_4
    .end sparse-switch
.end method
