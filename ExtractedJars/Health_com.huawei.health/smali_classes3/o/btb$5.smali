.class Lo/btb$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/btb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/btb;


# direct methods
.method constructor <init>(Lo/btb;Landroid/os/Looper;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lo/btb$5;->d:Lo/btb;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 164
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 165
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0}, Lo/btb;->d(Lo/btb;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    return-void

    .line 169
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 171
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 172
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0}, Lo/btb;->c(Lo/btb;)J

    move-result-wide v0

    sub-long v7, v5, v0

    .line 173
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-ltz v0, :cond_1

    const-wide/16 v0, 0xa

    cmp-long v0, v7, v0

    if-lez v0, :cond_2

    .line 174
    :cond_1
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0, v5, v6}, Lo/btb;->c(Lo/btb;J)J

    .line 175
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0}, Lo/btb;->i(Lo/btb;)Lo/bui;

    move-result-object v0

    iget-object v1, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v1}, Lo/btb;->h(Lo/btb;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lo/bsu;->e(Ljava/util/List;)J

    move-result-wide v1

    iget-object v3, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v3}, Lo/btb;->g(Lo/btb;)J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/bui;->c(JJ)V

    goto :goto_0

    .line 183
    :pswitch_1
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/huawei/health/suggestion/model/Media;

    invoke-static {v0, v1}, Lo/btb;->e(Lo/btb;Lcom/huawei/health/suggestion/model/Media;)V

    .line 184
    goto :goto_0

    .line 187
    :pswitch_2
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 188
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0}, Lo/btb;->i(Lo/btb;)Lo/bui;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 189
    goto :goto_0

    .line 192
    :pswitch_3
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/btb;->d(Lo/btb;Z)Z

    .line 193
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 195
    goto :goto_0

    .line 198
    :pswitch_4
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/btb;->d(Lo/btb;Z)Z

    .line 199
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0}, Lo/btb;->b(Lo/btb;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 200
    iget-object v0, p0, Lo/btb$5;->d:Lo/btb;

    invoke-static {v0}, Lo/btb;->i(Lo/btb;)Lo/bui;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 201
    .line 206
    :cond_2
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method
