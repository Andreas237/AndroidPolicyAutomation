.class Lo/bsq$16;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->k(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic c:Lo/bui;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Lcom/huawei/health/suggestion/model/AccountInfo;Ljava/lang/String;)V
    .locals 0

    .line 2360
    iput-object p1, p0, Lo/bsq$16;->e:Lo/bsq;

    iput-object p2, p0, Lo/bsq$16;->c:Lo/bui;

    iput-object p3, p0, Lo/bsq$16;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p4, p0, Lo/bsq$16;->d:Ljava/lang/String;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 3

    .line 2370
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/data/DBFactory;->t()Lo/bss;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$16;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/bsq$16;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lo/bss;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2371
    iget-object v0, p0, Lo/bsq$16;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$16;->e:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2372
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 2363
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "postBestRecordFit:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2364
    iget-object v0, p0, Lo/bsq$16;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$16;->e:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2365
    return-void
.end method
