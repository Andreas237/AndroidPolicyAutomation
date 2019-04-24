.class final Lo/axc$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axc;->a(Lo/axc;IJLjava/lang/String;)Lo/brd;
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

.field final synthetic b:I

.field final synthetic d:Lo/axc;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(JLo/axc;ILjava/lang/String;)V
    .locals 0

    .line 319
    iput-wide p1, p0, Lo/axc$4;->a:J

    iput-object p3, p0, Lo/axc$4;->d:Lo/axc;

    iput p4, p0, Lo/axc$4;->b:I

    iput-object p5, p0, Lo/axc$4;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 319
    invoke-virtual {p0, p1}, Lo/axc$4;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 9

    .line 323
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    iget-wide v1, p0, Lo/axc$4;->a:J

    invoke-virtual {v0, v1, v2}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v6

    .line 324
    if-nez v6, :cond_0

    .line 326
    const-string v0, "UserFriendSettingsTask"

    const-string v1, "UserFriendSettingsTask  updateUserFrdSetFlagsSettings error, query user from  DB is null"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    iget-object v0, p0, Lo/axc$4;->d:Lo/axc;

    iget v1, p0, Lo/axc$4;->b:I

    const/16 v2, 0x6b

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lo/axc;->e(Lo/axc;IIIILjava/lang/Object;)V

    .line 328
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 331
    :cond_0
    new-instance v7, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;

    invoke-direct {v7}, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;-><init>()V

    .line 332
    iget-wide v0, p0, Lo/axc$4;->a:J

    iput-wide v0, v7, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;->frdUID_:J

    .line 333
    iget-object v0, p0, Lo/axc$4;->e:Ljava/lang/String;

    iput-object v0, v7, Lcom/huawei/health/sns/server/user/UpdateUserFrdSetFlagsRequest;->setFlags_:Ljava/lang/String;

    .line 334
    invoke-static {v7}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v8

    .line 335
    iget-object v0, p0, Lo/axc$4;->d:Lo/axc;

    iget v1, p0, Lo/axc$4;->b:I

    iget-wide v2, p0, Lo/axc$4;->a:J

    move-object v4, v8

    iget-object v5, p0, Lo/axc$4;->e:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lo/axc;->b(Lo/axc;IJLcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Ljava/lang/String;)V

    .line 336
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
