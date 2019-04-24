.class Lo/dnw$9$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw$9;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dnw$9;


# direct methods
.method constructor <init>(Lo/dnw$9;)V
    .locals 0

    .line 302
    iput-object p1, p0, Lo/dnw$9$4;->c:Lo/dnw$9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 4

    .line 334
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo fetchUserData onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    iget-object v0, p0, Lo/dnw$9$4;->c:Lo/dnw$9;

    iget-object v0, v0, Lo/dnw$9;->a:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 336
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 6

    .line 305
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo fetchUserData onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    if-nez p2, :cond_0

    .line 307
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-object v0, p0, Lo/dnw$9$4;->c:Lo/dnw$9;

    iget-object v0, v0, Lo/dnw$9;->a:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 309
    return-void

    .line 312
    :cond_0
    const/4 v4, 0x0

    .line 314
    move-object v4, p2

    :try_start_0
    check-cast v4, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    goto :goto_0

    .line 315
    :catch_0
    move-exception v5

    .line 316
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo fetchUserData data ClassCastException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 317
    iget-object v0, p0, Lo/dnw$9$4;->c:Lo/dnw$9;

    iget-object v0, v0, Lo/dnw$9;->a:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 318
    return-void

    .line 320
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 321
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo userInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget-object v0, p0, Lo/dnw$9$4;->c:Lo/dnw$9;

    iget-object v0, v0, Lo/dnw$9;->a:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 323
    return-void

    .line 326
    :cond_1
    const/4 v0, 0x0

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/HiUserInfo;

    .line 327
    iget-object v0, p0, Lo/dnw$9$4;->c:Lo/dnw$9;

    iget-object v0, v0, Lo/dnw$9;->b:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserInfo;->getCreateTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/huawei/up/model/UserInfomation;->setSetTime(J)V

    .line 328
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo setTime=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserInfo;->getCreateTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    iget-object v0, p0, Lo/dnw$9$4;->c:Lo/dnw$9;

    iget-object v0, v0, Lo/dnw$9;->a:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 330
    return-void
.end method
