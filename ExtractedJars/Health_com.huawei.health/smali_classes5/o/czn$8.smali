.class Lo/czn$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/up/callback/CommonCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/czn;->d(Landroid/content/Context;Lcom/huawei/up/model/UserInfomation;Lo/cyx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/czn;

.field final synthetic e:Lo/cyx;


# direct methods
.method constructor <init>(Lo/czn;Lo/cyx;)V
    .locals 0

    .line 768
    iput-object p1, p0, Lo/czn$8;->c:Lo/czn;

    iput-object p2, p0, Lo/czn$8;->e:Lo/cyx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(I)V
    .locals 4

    .line 778
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateUserInfo onFail "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 779
    iget-object v0, p0, Lo/czn$8;->e:Lo/cyx;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateUserInfo onFail "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v1, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 780
    return-void
.end method

.method public onSuccess(Landroid/os/Bundle;)V
    .locals 4

    .line 771
    const-string v0, "HWCloudUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfo onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 772
    iget-object v0, p0, Lo/czn$8;->e:Lo/cyx;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v0, v1, v2, v3}, Lo/cyx;->operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 773
    return-void
.end method
