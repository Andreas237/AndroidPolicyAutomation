.class Lo/dkp$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lo/dkp;


# direct methods
.method constructor <init>(Lo/dkp;Landroid/os/Looper;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lo/dkp$a;->c:Lo/dkp;

    .line 138
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 139
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 143
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 144
    const-string v0, "HWEphemerisManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage() msg: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 147
    :sswitch_0
    invoke-static {}, Lo/dkp;->a()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, Lo/dkp$a;->sendEmptyMessageDelayed(IJ)Z

    .line 148
    const-string v0, "HWEphemerisManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleMessage()  \u53d1\u9001\u8d85\u65f6\u5b9a\u65f6\u5668 waitTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dkp;->a()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->d(Lo/dkp;)V

    .line 150
    goto/16 :goto_0

    .line 152
    :sswitch_1
    const-string v0, "HWEphemerisManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "network connected, isDownloading:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v2}, Lo/dkp;->a(Lo/dkp;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ";isNeedDownload:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dkp$a;->c:Lo/dkp;

    .line 153
    invoke-static {v2}, Lo/dkp;->b(Lo/dkp;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ";currentNetworkConnectedRetryTimes:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v2}, Lo/dkp;->c(Lo/dkp;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    .line 152
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->a(Lo/dkp;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/dkp;->a(Lo/dkp;I)I

    .line 156
    return-void

    .line 158
    :cond_0
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->b(Lo/dkp;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 159
    return-void

    .line 161
    :cond_1
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->c(Lo/dkp;)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_2

    .line 162
    invoke-static {}, Lo/dkp;->a()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, Lo/dkp$a;->sendEmptyMessageDelayed(IJ)Z

    .line 163
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dkp;->b(Lo/dkp;Z)Z

    .line 164
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->e(Lo/dkp;)V

    .line 165
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkp;->b(Lo/dkp;Z)Z

    .line 166
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->k(Lo/dkp;)I

    goto :goto_0

    .line 170
    :sswitch_2
    const-string v0, "HWEphemerisManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage()  START_DOWNLOAD_MSG "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->h(Lo/dkp;)V

    .line 172
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    invoke-static {v0}, Lo/dkp;->e(Lo/dkp;)V

    .line 173
    iget-object v0, p0, Lo/dkp$a;->c:Lo/dkp;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkp;->b(Lo/dkp;Z)Z

    .line 174
    .line 178
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_2
        0x64 -> :sswitch_1
    .end sparse-switch
.end method
