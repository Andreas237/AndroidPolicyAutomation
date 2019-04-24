.class Lo/dnt$12$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt$12;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dnt$12;


# direct methods
.method constructor <init>(Lo/dnt$12;)V
    .locals 0

    .line 275
    iput-object p1, p0, Lo/dnt$12$1;->e:Lo/dnt$12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/up/model/UserInfomation;)V
    .locals 5

    .line 278
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSync AccountReader read:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 280
    const-string v0, "userInfo"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    iget-object v0, p0, Lo/dnt$12$1;->e:Lo/dnt$12;

    iget-object v0, v0, Lo/dnt$12;->b:Lo/doi;

    invoke-virtual {v0, v4}, Lo/doi;->e(Ljava/util/Map;)V

    .line 282
    return-void
.end method

.method public d(I)V
    .locals 4

    .line 286
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processSync AccountReader read onFail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    iget-object v0, p0, Lo/dnt$12$1;->e:Lo/dnt$12;

    iget-object v0, v0, Lo/dnt$12;->b:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 288
    return-void
.end method
