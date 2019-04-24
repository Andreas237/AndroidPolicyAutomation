.class final Lo/ber$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ber;->e(JJ)Lo/brd;
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
.field final synthetic a:J

.field final synthetic b:J


# direct methods
.method constructor <init>(JJ)V
    .locals 0

    .line 77
    iput-wide p1, p0, Lo/ber$4;->b:J

    iput-wide p3, p0, Lo/ber$4;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 77
    invoke-virtual {p0, p1}, Lo/ber$4;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 8

    .line 82
    const/4 v5, 0x0

    .line 83
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    iget-wide v1, p0, Lo/ber$4;->b:J

    iget-wide v3, p0, Lo/ber$4;->a:J

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/ath;->a(JJ)Lcom/huawei/health/sns/model/group/GroupMember;

    move-result-object v6

    .line 84
    if-eqz v6, :cond_1

    .line 86
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 87
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserGroupNickname()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Lcom/huawei/health/sns/model/group/GroupMember;->getUserNickname()Ljava/lang/String;

    move-result-object v5

    :goto_0
    goto :goto_1

    .line 91
    :cond_1
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/ber$4;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v7

    .line 92
    if-eqz v7, :cond_2

    .line 95
    invoke-virtual {v7}, Lcom/huawei/health/sns/model/user/User;->getNickName()Ljava/lang/String;

    move-result-object v5

    .line 98
    :cond_2
    :goto_1
    const/4 v0, 0x2

    const/16 v1, 0x153

    invoke-static {v0, v1, v5}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 100
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
