.class Lo/dnv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnv;->c(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IZLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/dnv;

.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/dnv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;IZLjava/lang/String;)V
    .locals 0

    .line 504
    iput-object p1, p0, Lo/dnv$1;->b:Lo/dnv;

    iput-object p2, p0, Lo/dnv$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput p3, p0, Lo/dnv$1;->a:I

    iput-boolean p4, p0, Lo/dnv$1;->e:Z

    iput-object p5, p0, Lo/dnv$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordRsp;Ljava/lang/String;Z)V
    .locals 4

    .line 508
    if-eqz p3, :cond_1

    .line 510
    iget-object v0, p0, Lo/dnv$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_0

    .line 512
    iget-object v0, p0, Lo/dnv$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 517
    :cond_0
    iget-object v0, p0, Lo/dnv$1;->b:Lo/dnv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cloud_user_privacy_reupload"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dnv$1;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/dnv;->a(Lo/dnv;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 518
    iget-object v0, p0, Lo/dnv$1;->b:Lo/dnv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cloud_user_privacy_reupload_desp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dnv$1;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/dnv;->a(Lo/dnv;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    goto :goto_0

    .line 522
    :cond_1
    iget-object v0, p0, Lo/dnv$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_2

    .line 524
    iget-object v0, p0, Lo/dnv$1;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x49443

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 529
    :cond_2
    iget-object v0, p0, Lo/dnv$1;->b:Lo/dnv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cloud_user_privacy_reupload"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dnv$1;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lo/dnv$1;->e:Z

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/dnv;->a(Lo/dnv;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 530
    iget-object v0, p0, Lo/dnv$1;->b:Lo/dnv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cloud_user_privacy_reupload_desp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dnv$1;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dnv$1;->d:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/dnv;->a(Lo/dnv;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 533
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 504
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/dnv$1;->c(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordRsp;Ljava/lang/String;Z)V

    return-void
.end method
