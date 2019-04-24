.class Lo/apv$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/apv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Void;>;"
    }
.end annotation


# instance fields
.field private b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

.field final synthetic e:Lo/apv;


# direct methods
.method constructor <init>(Lo/apv;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lo/apv$e;->e:Lo/apv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    iput-object p2, p0, Lo/apv$e;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    .line 164
    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 157
    invoke-virtual {p0, p1}, Lo/apv$e;->e(Lo/bra;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Void;
    .locals 2

    .line 169
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    const-string v0, "IfGroupChatImpl"

    const-string v1, "JobContext cancel to handle Grp message."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    const/4 v0, 0x0

    return-object v0

    .line 174
    :cond_0
    iget-object v0, p0, Lo/apv$e;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChatType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->groupchat:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_1

    .line 177
    iget-object v0, p0, Lo/apv$e;->e:Lo/apv;

    iget-object v1, p0, Lo/apv$e;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-static {v0, v1}, Lo/apv;->c(Lo/apv;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    goto :goto_0

    .line 179
    :cond_1
    iget-object v0, p0, Lo/apv$e;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;->getChatType()Lorg/jivesoftware/smack/packet/Message$Type;

    move-result-object v0

    sget-object v1, Lorg/jivesoftware/smack/packet/Message$Type;->normal:Lorg/jivesoftware/smack/packet/Message$Type;

    if-ne v0, v1, :cond_2

    .line 182
    iget-object v0, p0, Lo/apv$e;->e:Lo/apv;

    iget-object v1, p0, Lo/apv$e;->b:Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;

    invoke-static {v0, v1}, Lo/apv;->e(Lo/apv;Lcom/huawei/health/sns/server/im/message/base/SNSMessageBase;)V

    goto :goto_0

    .line 188
    :cond_2
    const-string v0, "IfGroupChatImpl"

    const-string v1, "do not handle unKnow Grp message."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
