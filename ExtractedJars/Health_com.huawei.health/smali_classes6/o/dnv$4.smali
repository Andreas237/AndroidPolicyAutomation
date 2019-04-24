.class Lo/dnv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic b:Lo/dnv;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dnv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 328
    iput-object p1, p0, Lo/dnv$4;->b:Lo/dnv;

    iput-object p2, p0, Lo/dnv$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileRsp;Ljava/lang/String;Z)V
    .locals 4

    .line 332
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteAllUserProfile result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    if-eqz p3, :cond_0

    .line 336
    iget-object v0, p0, Lo/dnv$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_1

    .line 338
    iget-object v0, p0, Lo/dnv$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 344
    :cond_0
    iget-object v0, p0, Lo/dnv$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_1

    .line 346
    iget-object v0, p0, Lo/dnv$4;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x49443

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 349
    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 328
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/dnv$4;->d(Lcom/huawei/hwcloudmodel/model/userprofile/DeleteAllUserProfileRsp;Ljava/lang/String;Z)V

    return-void
.end method
