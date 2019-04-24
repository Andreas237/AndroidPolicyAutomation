.class Lo/duc$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/duc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/duc;


# direct methods
.method constructor <init>(Lo/duc;Landroid/os/Looper;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/duc$5;->b:Lo/duc;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 69
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 70
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "SEARCH_URL_FROM_DB"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-static {}, Lo/duc;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "_medalPngStatusDownload"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 72
    iget-object v0, p0, Lo/duc$5;->b:Lo/duc;

    invoke-static {v0, v3}, Lo/duc;->c(Lo/duc;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lo/duc$5;->b:Lo/duc;

    invoke-static {v0}, Lo/duc;->d(Lo/duc;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const-string v0, "PLGACHIEVE_AchieveMedalPngDownload"

    const-string v1, "allMedalTextureIsDownload success"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    return-void

    .line 77
    :cond_0
    move-object v4, p0

    monitor-enter v4

    .line 78
    :try_start_0
    iget-object v0, p0, Lo/duc$5;->b:Lo/duc;

    invoke-static {v0}, Lo/duc;->b(Lo/duc;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 80
    :goto_0
    goto :goto_1

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 81
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 82
    iget-object v0, p0, Lo/duc$5;->b:Lo/duc;

    invoke-static {v0, v3}, Lo/duc;->d(Lo/duc;Ljava/lang/String;)V

    .line 83
    goto :goto_1

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 84
    invoke-static {}, Lo/duc;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "_medalPngStatusDownloadDoing"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    :cond_3
    :goto_1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 87
    return-void
.end method
