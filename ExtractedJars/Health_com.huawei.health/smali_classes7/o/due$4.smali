.class Lo/due$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/due;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/due;


# direct methods
.method constructor <init>(Lo/due;Landroid/os/Looper;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/due$4;->c:Lo/due;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 103
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 104
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "TYPE_UPDATE_FROM_DB"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    invoke-static {}, Lo/due;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "_medalTextureDownload"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 106
    const-string v0, ""

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 107
    :cond_0
    iget-object v0, p0, Lo/due$4;->c:Lo/due;

    invoke-static {v0}, Lo/due;->d(Lo/due;)V

    goto :goto_0

    .line 109
    :cond_1
    iget-object v0, p0, Lo/due$4;->c:Lo/due;

    invoke-static {v0, v3}, Lo/due;->d(Lo/due;Ljava/lang/String;)V

    .line 110
    iget-object v0, p0, Lo/due$4;->c:Lo/due;

    invoke-static {v0}, Lo/due;->b(Lo/due;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 111
    iget-object v0, p0, Lo/due$4;->c:Lo/due;

    invoke-static {v0}, Lo/due;->e(Lo/due;)V

    .line 112
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "allMedalTexture is Download!"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    return-void

    .line 116
    :cond_2
    :goto_0
    move-object v4, p0

    monitor-enter v4

    .line 117
    :try_start_0
    iget-object v0, p0, Lo/due$4;->c:Lo/due;

    invoke-static {v0}, Lo/due;->c(Lo/due;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 119
    :goto_1
    goto :goto_2

    :cond_3
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_5

    .line 121
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 122
    iget-object v0, p0, Lo/due$4;->c:Lo/due;

    invoke-static {v0}, Lo/due;->a(Lo/due;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 123
    const-string v0, "PLGACHIEVE_AchieveMedalDownload"

    const-string v1, "medalName download success!"

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lo/due$4;->c:Lo/due;

    invoke-static {v0, v3}, Lo/due;->c(Lo/due;Ljava/lang/String;)V

    .line 126
    :cond_4
    goto :goto_2

    :cond_5
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_6

    .line 127
    invoke-static {}, Lo/due;->c()Landroid/content/Context;

    move-result-object v0

    const-string v1, "_medalTextureStatusDownloadDoing"

    const-string v2, "done"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    :cond_6
    :goto_2
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 130
    return-void
.end method
