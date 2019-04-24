.class Lo/dnv$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnv;->d(I)V
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
.field final synthetic a:Lo/dnv;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/dnv;I)V
    .locals 0

    .line 580
    iput-object p1, p0, Lo/dnv$7;->a:Lo/dnv;

    iput p2, p0, Lo/dnv$7;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordRsp;Ljava/lang/String;Z)V
    .locals 4

    .line 585
    if-eqz p3, :cond_0

    .line 588
    iget-object v0, p0, Lo/dnv$7;->a:Lo/dnv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cloud_user_privacy_reupload"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dnv$7;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/dnv;->a(Lo/dnv;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 589
    iget-object v0, p0, Lo/dnv$7;->a:Lo/dnv;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cloud_user_privacy_reupload_desp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dnv$7;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/dnv;->a(Lo/dnv;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)V

    .line 596
    :cond_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 580
    move-object v0, p1

    check-cast v0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordRsp;

    invoke-virtual {p0, v0, p2, p3}, Lo/dnv$7;->a(Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordRsp;Ljava/lang/String;Z)V

    return-void
.end method
