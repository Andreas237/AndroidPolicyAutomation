.class Lo/dnv$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnv;->c(Lcom/huawei/up/callback/CommonCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/up/callback/CommonCallback;

.field final synthetic d:Lo/dnv;


# direct methods
.method constructor <init>(Lo/dnv;Lcom/huawei/up/callback/CommonCallback;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lo/dnv$3;->d:Lo/dnv;

    iput-object p2, p0, Lo/dnv$3;->a:Lcom/huawei/up/callback/CommonCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;Ljava/lang/String;Z)V
    .locals 4

    .line 214
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadUserPrivacy result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    if-eqz p3, :cond_0

    .line 219
    iget-object v0, p0, Lo/dnv$3;->d:Lo/dnv;

    iget-object v1, p0, Lo/dnv$3;->a:Lcom/huawei/up/callback/CommonCallback;

    invoke-static {v0, p1, v1}, Lo/dnv;->e(Lo/dnv;Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;Lcom/huawei/up/callback/CommonCallback;)V

    goto :goto_0

    .line 223
    :cond_0
    const-string v0, "HWUserProfileMgrUserPrivacy"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPrivacyRecord fail "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    iget-object v0, p0, Lo/dnv$3;->a:Lcom/huawei/up/callback/CommonCallback;

    if-eqz v0, :cond_1

    .line 226
    iget-object v0, p0, Lo/dnv$3;->a:Lcom/huawei/up/callback/CommonCallback;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Lcom/huawei/up/callback/CommonCallback;->onFail(I)V

    .line 229
    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 210
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/dnv$3;->c(Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordRsp;Ljava/lang/String;Z)V

    return-void
.end method
