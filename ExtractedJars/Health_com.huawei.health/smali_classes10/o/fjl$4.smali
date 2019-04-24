.class Lo/fjl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fjl;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/fjl;


# direct methods
.method constructor <init>(Lo/fjl;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/fjl$4;->c:Lo/fjl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentRsp;Ljava/lang/String;Z)V
    .locals 6

    .line 69
    if-eqz p3, :cond_0

    .line 70
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentRsp;->getRemainder()I

    move-result v5

    .line 71
    const-string v0, "MarketCommentMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MarketCommentCloud_download_remainder "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lo/fjl$4;->c:Lo/fjl;

    invoke-static {v0}, Lo/fjl;->b(Lo/fjl;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "market_comment_status"

    .line 73
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 72
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 75
    :cond_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 66
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/fjl$4;->e(Lcom/huawei/hwcloudmodel/model/userprofile/GetCommentRsp;Ljava/lang/String;Z)V

    return-void
.end method
