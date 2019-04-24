.class Lo/arn$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/arn;->e(Lcom/huawei/health/sns/model/chat/MessageItem;)V
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
.field final synthetic b:J

.field final synthetic c:Lo/arn;


# direct methods
.method constructor <init>(Lo/arn;J)V
    .locals 0

    .line 667
    iput-object p1, p0, Lo/arn$4;->c:Lo/arn;

    iput-wide p2, p0, Lo/arn$4;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 667
    invoke-virtual {p0, p1}, Lo/arn$4;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 671
    iget-wide v0, p0, Lo/arn$4;->b:J

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/axb;->d(JLandroid/os/Handler;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 673
    if-nez v3, :cond_0

    .line 675
    new-instance v3, Lcom/huawei/health/sns/model/user/User;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/user/User;-><init>()V

    .line 676
    iget-wide v0, p0, Lo/arn$4;->b:J

    invoke-virtual {v3, v0, v1}, Lcom/huawei/health/sns/model/user/User;->setUserId(J)V

    .line 678
    :cond_0
    iget-object v0, p0, Lo/arn$4;->c:Lo/arn;

    iget-wide v1, p0, Lo/arn$4;->b:J

    invoke-static {v0, v1, v2, v3}, Lo/arn;->e(Lo/arn;JLcom/huawei/health/sns/model/user/User;)V

    .line 679
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
