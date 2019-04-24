.class Lo/axd$6$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd$6;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/axd$6;


# direct methods
.method constructor <init>(Lo/axd$6;)V
    .locals 0

    .line 541
    iput-object p1, p0, Lo/axd$6$2;->d:Lo/axd$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 541
    invoke-virtual {p0, p1}, Lo/axd$6$2;->b(Lo/bra;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 2

    .line 545
    iget-object v0, p0, Lo/axd$6$2;->d:Lo/axd$6;

    iget-object v0, v0, Lo/axd$6;->a:Lcom/huawei/health/sns/server/user/DeleteFriendRequest;

    invoke-static {v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->b(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v1

    .line 546
    return-object v1
.end method
