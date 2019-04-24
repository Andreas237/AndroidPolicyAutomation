.class final Lo/awu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awu;->a(IIILandroid/os/Handler;Ljava/lang/String;)Lo/brd;
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
.field final synthetic a:I

.field final synthetic b:Landroid/os/Handler;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;IIILandroid/os/Handler;)V
    .locals 0

    .line 326
    iput-object p1, p0, Lo/awu$2;->e:Ljava/lang/String;

    iput p2, p0, Lo/awu$2;->d:I

    iput p3, p0, Lo/awu$2;->a:I

    iput p4, p0, Lo/awu$2;->c:I

    iput-object p5, p0, Lo/awu$2;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 326
    invoke-virtual {p0, p1}, Lo/awu$2;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 6

    .line 331
    new-instance v3, Lcom/huawei/health/sns/server/user/FindAssistantRequest;

    invoke-direct {v3}, Lcom/huawei/health/sns/server/user/FindAssistantRequest;-><init>()V

    .line 332
    iget-object v4, p0, Lo/awu$2;->e:Ljava/lang/String;

    .line 333
    const/4 v5, 0x0

    .line 334
    iget v0, p0, Lo/awu$2;->d:I

    iget v1, p0, Lo/awu$2;->a:I

    invoke-virtual {v3, v4, v0, v1}, Lcom/huawei/health/sns/server/user/FindAssistantRequest;->setData(Ljava/lang/String;II)V

    .line 335
    invoke-static {v3}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;)Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    move-result-object v5

    .line 336
    iget-object v0, p0, Lo/awu$2;->e:Ljava/lang/String;

    iget v1, p0, Lo/awu$2;->c:I

    iget-object v2, p0, Lo/awu$2;->b:Landroid/os/Handler;

    invoke-static {v0, v1, v5, v2}, Lo/awu;->e(Ljava/lang/String;ILcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Landroid/os/Handler;)V

    .line 338
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
