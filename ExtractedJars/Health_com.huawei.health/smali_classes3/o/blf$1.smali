.class final Lo/blf$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/blf;->b(Landroid/app/Activity;Lcom/huawei/health/sns/model/user/User;)Lo/brd;
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
.field final synthetic a:Lcom/huawei/health/sns/model/user/User;

.field final synthetic d:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/model/user/User;Landroid/app/Activity;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/blf$1;->a:Lcom/huawei/health/sns/model/user/User;

    iput-object p2, p0, Lo/blf$1;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 79
    invoke-virtual {p0, p1}, Lo/blf$1;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 84
    new-instance v5, Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {v5}, Lcom/huawei/health/sns/model/chat/MessageItem;-><init>()V

    .line 85
    iget-object v0, p0, Lo/blf$1;->a:Lcom/huawei/health/sns/model/user/User;

    iget-object v1, p0, Lo/blf$1;->d:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/model/user/User;->getUIDisplayName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 86
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_add_friend_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 87
    invoke-static {v6}, Lo/bny;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 86
    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContent(Ljava/lang/String;)V

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgDate(J)V

    .line 89
    const/16 v0, 0xd

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgContentType(I)V

    .line 90
    invoke-static {}, Lo/bak;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgId(Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lo/blf$1;->a:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setUserId(J)V

    .line 92
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setSenderId(J)V

    .line 93
    iget-object v0, p0, Lo/blf$1;->a:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/sns/model/chat/MessageItem;->setReceiverId(J)V

    .line 94
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setChatType(I)V

    .line 95
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lcom/huawei/health/sns/model/chat/MessageItem;->setMsgStatus(I)V

    .line 96
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/apm;->a(Lcom/huawei/health/sns/model/chat/MessageItem;)I

    .line 97
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
