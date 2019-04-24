.class public abstract Lo/dpp;
.super Landroid/os/Handler;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract c(I)V
.end method

.method public abstract c(Lo/doq;)V
.end method

.method public abstract e(Lo/doq;)V
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 24
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 25
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 27
    :pswitch_0
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_IN_PROGRESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 28
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/doq;

    .line 29
    invoke-virtual {p0, v4}, Lo/dpp;->c(Lo/doq;)V

    .line 30
    goto/16 :goto_1

    .line 32
    :pswitch_1
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_FAILED_VERIFY_MD5_FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lo/dpp;->c(I)V

    .line 34
    goto/16 :goto_1

    .line 36
    :pswitch_2
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_FAILED_URL_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lo/dpp;->c(I)V

    .line 38
    goto/16 :goto_1

    .line 40
    :pswitch_3
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_FAILED_CONNECT_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lo/dpp;->c(I)V

    .line 42
    goto/16 :goto_1

    .line 44
    :pswitch_4
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_FAILED_FILESYSTEM_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lo/dpp;->c(I)V

    .line 46
    goto/16 :goto_1

    .line 48
    :pswitch_5
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_FAILED_IO_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lo/dpp;->c(I)V

    .line 50
    goto :goto_1

    .line 52
    :pswitch_6
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_FAILED_UNKNOWN_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lo/dpp;->c(I)V

    .line 54
    goto :goto_1

    .line 56
    :pswitch_7
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_SUCCESS"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lo/doq;

    .line 58
    invoke-virtual {p0, v5}, Lo/dpp;->e(Lo/doq;)V

    .line 59
    goto :goto_1

    .line 61
    :pswitch_8
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_CANCEL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lo/dpp;->c(I)V

    .line 63
    goto :goto_1

    .line 65
    :pswitch_9
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DOWNLOAD_FAILED_NETWORK_RECONNECITION"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget v0, p1, Landroid/os/Message;->what:I

    invoke-virtual {p0, v0}, Lo/dpp;->c(I)V

    .line 67
    goto :goto_1

    .line 69
    :goto_0
    :pswitch_a
    const-string v0, "AppDownloadHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "default"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_0
        :pswitch_7
        :pswitch_8
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method
