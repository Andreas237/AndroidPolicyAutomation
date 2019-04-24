.class Lo/apd$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/apd;->d(JILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/apd;

.field final synthetic b:I

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J


# direct methods
.method constructor <init>(Lo/apd;Ljava/lang/String;JI)V
    .locals 0

    .line 136
    iput-object p1, p0, Lo/apd$5;->a:Lo/apd;

    iput-object p2, p0, Lo/apd$5;->c:Ljava/lang/String;

    iput-wide p3, p0, Lo/apd$5;->d:J

    iput p5, p0, Lo/apd$5;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 136
    invoke-virtual {p0, p1}, Lo/apd$5;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 142
    iget-object v3, p0, Lo/apd$5;->c:Ljava/lang/String;

    .line 143
    iget-object v0, p0, Lo/apd$5;->a:Lo/apd;

    iget-wide v1, p0, Lo/apd$5;->d:J

    invoke-static {v0, v1, v2}, Lo/apd;->c(Lo/apd;J)Lcom/huawei/health/sns/model/chat/MessageItem;

    move-result-object v4

    .line 144
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lo/bqz;->a(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 147
    if-eqz v4, :cond_0

    .line 149
    iget-object v0, p0, Lo/apd$5;->a:Lo/apd;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/apd;->a(Lo/apd;Ljava/lang/String;)V

    .line 151
    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 155
    :cond_1
    if-eqz v4, :cond_3

    .line 157
    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 160
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 165
    :cond_2
    iget-object v0, p0, Lo/apd$5;->a:Lo/apd;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/MessageItem;->getMsgId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/apd;->a(Lo/apd;Ljava/lang/String;)V

    .line 168
    :cond_3
    new-instance v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 169
    invoke-virtual {v5, v3}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 170
    iget-wide v0, p0, Lo/apd$5;->d:J

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 171
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 172
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 173
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 174
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 175
    iget-wide v0, p0, Lo/apd$5;->d:J

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 176
    iget v0, p0, Lo/apd$5;->b:I

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 177
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 178
    iget-object v0, p0, Lo/apd$5;->a:Lo/apd;

    invoke-static {v0, v5}, Lo/apd;->e(Lo/apd;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 180
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
