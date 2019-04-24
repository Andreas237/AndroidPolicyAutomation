.class Lo/awz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awz;->e(J)V
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
.field final synthetic a:J

.field final synthetic d:Lo/awz;


# direct methods
.method constructor <init>(Lo/awz;J)V
    .locals 0

    .line 41
    iput-object p1, p0, Lo/awz$1;->d:Lo/awz;

    iput-wide p2, p0, Lo/awz$1;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 41
    invoke-virtual {p0, p1}, Lo/awz$1;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 45
    iget-object v0, p0, Lo/awz$1;->d:Lo/awz;

    iget-wide v1, p0, Lo/awz$1;->a:J

    invoke-virtual {v0, v1, v2}, Lo/awz;->a(J)V

    .line 46
    new-instance v3, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 47
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_greeting_msg:I

    .line 48
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 50
    const/16 v0, 0xd

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 51
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 52
    iget-wide v0, p0, Lo/awz$1;->a:J

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 53
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 54
    iget-wide v0, p0, Lo/awz$1;->a:J

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 55
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 56
    const/16 v0, 0xa

    invoke-virtual {v3, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 57
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 58
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
