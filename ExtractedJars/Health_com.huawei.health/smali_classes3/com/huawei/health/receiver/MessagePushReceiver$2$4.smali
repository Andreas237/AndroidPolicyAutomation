.class Lcom/huawei/health/receiver/MessagePushReceiver$2$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaf;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/receiver/MessagePushReceiver$2;->onCallBackSuccess(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/receiver/MessagePushReceiver$2;


# direct methods
.method constructor <init>(Lcom/huawei/health/receiver/MessagePushReceiver$2;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;->d:Lcom/huawei/health/receiver/MessagePushReceiver$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(I)V
    .locals 4

    .line 76
    const-string v0, "UIDV_MessagePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doSaveToken HttpUtils.doPostReq onFailed ==> resCode ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    return-void
.end method

.method public onSucceed(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 66
    const-string v0, "UIDV_MessagePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doSaveToken onSucceed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    const-string v0, "UIDV_MessagePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doSaveToken HttpUtils.doPostReq onSucceed ==> result ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;->d:Lcom/huawei/health/receiver/MessagePushReceiver$2;

    iget-object v0, v0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;->d:Lcom/huawei/health/receiver/MessagePushReceiver$2;

    iget-object v1, v1, Lcom/huawei/health/receiver/MessagePushReceiver$2;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eah;->p(Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;->d:Lcom/huawei/health/receiver/MessagePushReceiver$2;

    iget-object v0, v0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;->d:Lcom/huawei/health/receiver/MessagePushReceiver$2;

    iget-object v1, v1, Lcom/huawei/health/receiver/MessagePushReceiver$2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eah;->f(Ljava/lang/String;)V

    .line 70
    iget-object v0, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;->d:Lcom/huawei/health/receiver/MessagePushReceiver$2;

    iget-object v0, v0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/eah;->e(Landroid/content/Context;)Lo/eah;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;->d:Lcom/huawei/health/receiver/MessagePushReceiver$2;

    iget-object v1, v1, Lcom/huawei/health/receiver/MessagePushReceiver$2;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/eah;->n(Ljava/lang/String;)V

    .line 71
    iget-object v0, p0, Lcom/huawei/health/receiver/MessagePushReceiver$2$4;->d:Lcom/huawei/health/receiver/MessagePushReceiver$2;

    iget-object v0, v0, Lcom/huawei/health/receiver/MessagePushReceiver$2;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/dcn;->e(Landroid/content/Context;)Lo/dcn;

    move-result-object v0

    const-string v1, "key_push_register_status"

    const-string v2, "1"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lo/dcn;->e(Ljava/lang/String;Ljava/lang/String;Lo/dcx;)V

    .line 72
    return-void
.end method
