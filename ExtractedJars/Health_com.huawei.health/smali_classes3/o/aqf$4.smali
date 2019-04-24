.class final Lo/aqf$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aqf;->e(Ljava/lang/String;Lcom/huawei/health/sns/model/chat/ShareMessageParams;)Lo/brd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/chat/ShareMessageParams;Ljava/lang/String;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    iput-object p2, p0, Lo/aqf$4;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 209
    invoke-virtual {p0, p1}, Lo/aqf$4;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 213
    iget-object v0, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->createLinkMessage()Lcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;

    move-result-object v6

    .line 214
    if-eqz v6, :cond_0

    .line 217
    invoke-static {}, Lo/apz;->d()Lo/apz;

    move-result-object v0

    iget-object v1, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getUserId()J

    move-result-wide v1

    move-object v3, v6

    iget-object v4, p0, Lo/aqf$4;->c:Ljava/lang/String;

    iget-object v5, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    .line 218
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getChatType()I

    move-result v5

    .line 217
    invoke-virtual/range {v0 .. v5}, Lo/apz;->c(JLcom/huawei/health/sns/server/im/message/base/SNSLinkMessage;Ljava/lang/String;I)V

    goto :goto_0

    .line 223
    :cond_0
    iget-object v0, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareType()Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    move-result-object v7

    .line 224
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->e:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    if-ne v7, v0, :cond_1

    .line 226
    iget-object v0, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/aqf$4;->c:Ljava/lang/String;

    iget-object v3, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getShareText()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getChatType()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/aqf;->d(JLjava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 228
    :cond_1
    sget-object v0, Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;->c:Lcom/huawei/health/sns/model/chat/ShareMessageParams$b;

    if-ne v7, v0, :cond_2

    .line 230
    iget-object v0, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getUserId()J

    move-result-wide v0

    iget-object v2, p0, Lo/aqf$4;->c:Ljava/lang/String;

    iget-object v3, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getSharePicList()Ljava/util/ArrayList;

    move-result-object v3

    iget-object v4, p0, Lo/aqf$4;->d:Lcom/huawei/health/sns/model/chat/ShareMessageParams;

    invoke-virtual {v4}, Lcom/huawei/health/sns/model/chat/ShareMessageParams;->getChatType()I

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/aqf;->e(JLjava/lang/String;Ljava/util/List;I)V

    .line 233
    :cond_2
    :goto_0
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
