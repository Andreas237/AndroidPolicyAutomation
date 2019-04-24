.class Lo/dnt$13$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt$13;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnt$13;

.field final synthetic c:Lcom/huawei/up/model/UserInfomation;


# direct methods
.method constructor <init>(Lo/dnt$13;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 345
    iput-object p1, p0, Lo/dnt$13$2;->a:Lo/dnt$13;

    iput-object p2, p0, Lo/dnt$13$2;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    .line 348
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSync write hihealth success:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt$13$2;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 349
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 350
    const-string v0, "userInfo"

    iget-object v1, p0, Lo/dnt$13$2;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    iget-object v0, p0, Lo/dnt$13$2;->a:Lo/dnt$13;

    iget-object v0, v0, Lo/dnt$13;->d:Lo/doi;

    invoke-virtual {v0, v4}, Lo/doi;->e(Ljava/util/Map;)V

    .line 352
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 356
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSync write hihealth fail:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnt$13$2;->c:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 357
    iget-object v0, p0, Lo/dnt$13$2;->a:Lo/dnt$13;

    iget-object v0, v0, Lo/dnt$13;->d:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 358
    return-void
.end method
