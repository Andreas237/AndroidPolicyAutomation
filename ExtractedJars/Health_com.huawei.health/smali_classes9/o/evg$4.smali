.class Lo/evg$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/evg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/evg;


# direct methods
.method constructor <init>(Lo/evg;Landroid/os/Looper;)V
    .locals 0

    .line 181
    iput-object p1, p0, Lo/evg$4;->b:Lo/evg;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 184
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 185
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->c(Lo/evg;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 186
    return-void

    .line 189
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 191
    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 192
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->g(Lo/evg;)J

    move-result-wide v0

    sub-long v7, v5, v0

    .line 193
    const-wide/16 v0, 0x0

    cmp-long v0, v7, v0

    if-ltz v0, :cond_1

    const-wide/16 v0, 0xa

    cmp-long v0, v7, v0

    if-lez v0, :cond_2

    .line 194
    :cond_1
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0, v5, v6}, Lo/evg;->d(Lo/evg;J)J

    .line 195
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->a(Lo/evg;)Lo/evj;

    move-result-object v0

    iget-object v1, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v1}, Lo/evg;->k(Lo/evg;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lo/eva;->c(Ljava/util/List;)J

    move-result-wide v1

    iget-object v3, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v3}, Lo/evg;->f(Lo/evg;)J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/evj;->a(JJ)V

    goto/16 :goto_0

    .line 203
    :pswitch_1
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Lo/evp;

    invoke-static {v0, v1}, Lo/evg;->a(Lo/evg;Lo/evp;)V

    .line 204
    goto/16 :goto_0

    .line 207
    :pswitch_2
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 208
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->a(Lo/evg;)Lo/evj;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/evj;->a(Ljava/lang/Object;)V

    .line 209
    goto :goto_0

    .line 212
    :pswitch_3
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/evg;->e(Lo/evg;Z)Z

    .line 213
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 214
    const-string v0, "Stress_DownloadTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadTask \u53d6\u6d88\u4e0b\u8f7d"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 215
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->a(Lo/evg;)Lo/evj;

    move-result-object v0

    const-string v1, "cancel"

    invoke-virtual {v0, v1}, Lo/evj;->a(Ljava/lang/Object;)V

    .line 216
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/evg;->b(Lo/evg;Lo/evj;)Lo/evj;

    .line 218
    goto :goto_0

    .line 221
    :pswitch_4
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/evg;->e(Lo/evg;Z)Z

    .line 222
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->d(Lo/evg;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lo/evg$4;->b:Lo/evg;

    invoke-static {v0}, Lo/evg;->a(Lo/evg;)Lo/evj;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/evj;->b(ILjava/lang/String;)V

    .line 224
    .line 229
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
