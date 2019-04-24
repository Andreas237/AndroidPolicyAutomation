.class Lo/bed$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bed;->c()V
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
.field final synthetic d:Lo/bed;


# direct methods
.method constructor <init>(Lo/bed;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lo/bed$5;->d:Lo/bed;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 147
    invoke-virtual {p0, p1}, Lo/bed$5;->e(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public e(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 153
    iget-object v0, p0, Lo/bed$5;->d:Lo/bed;

    iget-object v0, v0, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aqx;->d(Ljava/lang/String;)V

    .line 154
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    iget-object v1, p0, Lo/bed$5;->d:Lo/bed;

    iget-object v1, v1, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    .line 155
    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    .line 154
    invoke-virtual {v0, v1, v2}, Lo/ast;->a(J)Lo/axv;

    move-result-object v4

    .line 156
    invoke-static {}, Lo/apm;->a()Lo/apm;

    move-result-object v0

    iget-object v1, p0, Lo/bed$5;->d:Lo/bed;

    iget-object v1, v1, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/apm;->e(J)Z

    move-result v5

    .line 158
    if-eqz v4, :cond_0

    .line 160
    invoke-static {}, Lo/ast;->b()Lo/ast;

    move-result-object v0

    iget-object v1, p0, Lo/bed$5;->d:Lo/bed;

    iget-object v1, v1, Lo/bed;->b:Lcom/huawei/health/sns/model/user/User;

    invoke-virtual {v1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v1

    .line 161
    invoke-virtual {v4}, Lo/axv;->k()Ljava/lang/String;

    move-result-object v3

    .line 160
    invoke-virtual {v0, v1, v2, v3}, Lo/ast;->b(JLjava/lang/String;)Z

    .line 163
    :cond_0
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
