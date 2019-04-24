.class Lo/bkw$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkw;->c(Lcom/huawei/health/sns/model/user/UserNotify;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bkw;

.field final synthetic c:Lcom/huawei/health/sns/model/user/UserNotify;


# direct methods
.method constructor <init>(Lo/bkw;Lcom/huawei/health/sns/model/user/UserNotify;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lo/bkw$3;->b:Lo/bkw;

    iput-object p2, p0, Lo/bkw$3;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 200
    new-instance v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 202
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lo/bkw$3;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 203
    if-eqz v7, :cond_0

    .line 205
    iget-object v0, p0, Lo/bkw$3;->b:Lo/bkw;

    invoke-static {v0}, Lo/bkw;->e(Lo/bkw;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 209
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-object v1, p0, Lo/bkw$3;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/UserNotify;->getNickName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bkw$3;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/UserNotify;->getRemarkName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/axa;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 210
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 212
    iget-object v0, p0, Lo/bkw$3;->b:Lo/bkw;

    invoke-static {v0}, Lo/bkw;->e(Lo/bkw;)Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_no_nickname:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 215
    :cond_1
    :goto_0
    iget-object v0, p0, Lo/bkw$3;->b:Lo/bkw;

    invoke-static {v0}, Lo/bkw;->e(Lo/bkw;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 216
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 217
    const/16 v0, 0xd

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 218
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 219
    iget-object v0, p0, Lo/bkw$3;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 220
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 221
    iget-object v0, p0, Lo/bkw$3;->c:Lcom/huawei/health/sns/model/user/UserNotify;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 222
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 223
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 224
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 225
    return-void
.end method
