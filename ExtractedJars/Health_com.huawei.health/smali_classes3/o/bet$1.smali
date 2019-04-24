.class Lo/bet$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bet;->e(ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V
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
.field final synthetic a:Lo/bet;

.field final synthetic c:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/bet;Lcom/huawei/health/sns/model/chat/GrpInviteMessage;I)V
    .locals 0

    .line 269
    iput-object p1, p0, Lo/bet$1;->a:Lo/bet;

    iput-object p2, p0, Lo/bet$1;->c:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    iput p3, p0, Lo/bet$1;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 269
    invoke-virtual {p0, p1}, Lo/bet$1;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 9

    .line 274
    iget-object v0, p0, Lo/bet$1;->c:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/chat/GrpInviteMessage;->getGroupId()J

    move-result-wide v3

    .line 275
    invoke-static {}, Lo/aoq;->e()Lo/aoq;

    move-result-object v0

    invoke-virtual {v0}, Lo/aoq;->a()J

    move-result-wide v5

    .line 276
    invoke-static {}, Lo/atc;->d()Lo/atc;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lo/atc;->d(J)Z

    move-result v7

    .line 277
    invoke-static {}, Lo/ath;->a()Lo/ath;

    move-result-object v0

    invoke-virtual {v0, v3, v4, v5, v6}, Lo/ath;->e(JJ)Z

    move-result v8

    .line 280
    if-eqz v7, :cond_0

    if-eqz v8, :cond_0

    .line 282
    iget-object v0, p0, Lo/bet$1;->a:Lo/bet;

    invoke-static {v0, v3, v4}, Lo/bet;->d(Lo/bet;J)V

    goto :goto_0

    .line 286
    :cond_0
    iget-object v0, p0, Lo/bet$1;->a:Lo/bet;

    iget v1, p0, Lo/bet$1;->e:I

    iget-object v2, p0, Lo/bet$1;->c:Lcom/huawei/health/sns/model/chat/GrpInviteMessage;

    invoke-static {v0, v1, v2}, Lo/bet;->b(Lo/bet;ILcom/huawei/health/sns/model/chat/GrpInviteMessage;)V

    .line 288
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
