.class Lo/dnu$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnu$3;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnu$3;


# direct methods
.method constructor <init>(Lo/dnu$3;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lo/dnu$3$2;->a:Lo/dnu$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 183
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo write hihealth success:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnu$3$2;->a:Lo/dnu$3;

    iget-object v2, v2, Lo/dnu$3;->d:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    iget-object v0, p0, Lo/dnu$3$2;->a:Lo/dnu$3;

    iget-object v0, v0, Lo/dnu$3;->a:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 185
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 189
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo write hihealth fail:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/dnu$3$2;->a:Lo/dnu$3;

    iget-object v2, v2, Lo/dnu$3;->d:Lcom/huawei/up/model/UserInfomation;

    invoke-virtual {v2}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    iget-object v0, p0, Lo/dnu$3$2;->a:Lo/dnu$3;

    iget-object v0, v0, Lo/dnu$3;->a:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 191
    return-void
.end method
