.class Lo/ate$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ate;->d(ILcom/huawei/health/sns/model/group/Group;)V
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
.field final synthetic a:I

.field final synthetic b:Lo/ate;

.field final synthetic c:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method constructor <init>(Lo/ate;Lcom/huawei/health/sns/model/group/Group;I)V
    .locals 0

    .line 101
    iput-object p1, p0, Lo/ate$1;->b:Lo/ate;

    iput-object p2, p0, Lo/ate$1;->c:Lcom/huawei/health/sns/model/group/Group;

    iput p3, p0, Lo/ate$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 101
    invoke-virtual {p0, p1}, Lo/ate$1;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 7

    .line 105
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 107
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 110
    :cond_0
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v1

    .line 111
    iget-object v0, p0, Lo/ate$1;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-virtual {v1, v0}, Lo/ath;->d(Lcom/huawei/health/sns/model/group/Group;)Ljava/util/ArrayList;

    move-result-object v2

    .line 113
    invoke-interface {p1}, Lo/bra;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 118
    :cond_1
    const/4 v3, 0x0

    .line 120
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/sns/model/group/GroupMember;

    .line 122
    if-eqz v5, :cond_2

    .line 124
    invoke-virtual {v5}, Lcom/huawei/health/sns/model/group/GroupMember;->getState()I

    move-result v0

    if-nez v0, :cond_2

    .line 126
    add-int/lit8 v3, v3, 0x1

    .line 129
    :cond_2
    goto :goto_0

    .line 130
    :cond_3
    invoke-static {}, Lo/awj;->b()Lo/awj;

    move-result-object v0

    invoke-virtual {v0}, Lo/awj;->d()Ljava/lang/String;

    move-result-object v4

    .line 131
    iget-object v0, p0, Lo/ate$1;->b:Lo/ate;

    invoke-static {v0}, Lo/ate;->b(Lo/ate;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 133
    iget-object v0, p0, Lo/ate$1;->b:Lo/ate;

    invoke-static {v0}, Lo/ate;->b(Lo/ate;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 134
    iget v0, p0, Lo/ate$1;->a:I

    iput v0, v5, Landroid/os/Message;->what:I

    .line 135
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 136
    const-string v0, "bundleKeyGroupMemberList"

    invoke-virtual {v6, v0, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 137
    const-string v0, "bundleKeyNormalMemberCount"

    invoke-virtual {v6, v0, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 138
    const-string v0, "bundleKeySelfNickName"

    invoke-virtual {v6, v0, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 140
    iget-object v0, p0, Lo/ate$1;->b:Lo/ate;

    invoke-static {v0}, Lo/ate;->b(Lo/ate;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 142
    :cond_4
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
