.class Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;


# direct methods
.method private constructor <init>(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$4;)V
    .locals 0

    .line 160
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;-><init>(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 163
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 164
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handle msg : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x7d6

    if-ne v0, v1, :cond_1

    .line 169
    :try_start_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 170
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    invoke-virtual {v0}, Lo/cgh;->b()V

    .line 173
    :cond_0
    new-instance v4, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-direct {v4, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 174
    const-string v0, "action_stop_sport_music_interator_service"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    goto :goto_0

    .line 176
    :catch_0
    move-exception v4

    .line 177
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handler "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    :goto_0
    return-void

    .line 182
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    if-nez v0, :cond_2

    .line 183
    const-string v0, "Track_SportMusicInteratorService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mController is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 186
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 188
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/cgh;->b(I)V

    .line 189
    goto :goto_1

    .line 191
    :pswitch_1
    iget v0, p1, Landroid/os/Message;->arg1:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 192
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cgh;->b(Landroid/os/Bundle;)V

    goto :goto_1

    .line 194
    :cond_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cgh;->b(Landroid/os/Bundle;)V

    .line 196
    goto :goto_1

    .line 198
    :pswitch_2
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 199
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/cgh;->d(I)V

    .line 200
    goto :goto_1

    .line 202
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/cgh;->b(I)V

    .line 203
    goto :goto_1

    .line 205
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService$d;->a:Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;->d(Lcom/huawei/healthcloud/plugintrack/sportmusic/SportMusicInteratorService;)Lo/cgh;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/cgh;->b(I)V

    .line 206
    .line 210
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x7d1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
