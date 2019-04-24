.class Lo/axd$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd;->c(ILandroid/app/Activity;Lcom/huawei/health/sns/model/user/User;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/health/sns/model/user/User;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:Lo/axd;


# direct methods
.method constructor <init>(Lo/axd;Lcom/huawei/health/sns/model/user/User;Ljava/lang/String;ILandroid/app/Activity;)V
    .locals 0

    .line 396
    iput-object p1, p0, Lo/axd$8;->e:Lo/axd;

    iput-object p2, p0, Lo/axd$8;->b:Lcom/huawei/health/sns/model/user/User;

    iput-object p3, p0, Lo/axd$8;->c:Ljava/lang/String;

    iput p4, p0, Lo/axd$8;->a:I

    iput-object p5, p0, Lo/axd$8;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 400
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/axd$8$1;

    invoke-direct {v1, p0}, Lo/axd$8$1;-><init>(Lo/axd$8;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 435
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 440
    iget-object v0, p0, Lo/axd$8;->d:Landroid/app/Activity;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 441
    return-void
.end method
