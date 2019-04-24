.class Lo/axf$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axf;->c(ILandroid/content/Context;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

.field final synthetic b:I

.field final synthetic d:Lo/axf;

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/axf;Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;ILandroid/content/Context;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/axf$2;->d:Lo/axf;

    iput-object p2, p0, Lo/axf$2;->a:Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;

    iput p3, p0, Lo/axf$2;->b:I

    iput-object p4, p0, Lo/axf$2;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 86
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/axf$2$3;

    invoke-direct {v1, p0}, Lo/axf$2$3;-><init>(Lo/axf$2;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 100
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 105
    iget-object v0, p0, Lo/axf$2;->e:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 106
    return-void
.end method
