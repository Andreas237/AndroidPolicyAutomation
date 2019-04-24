.class Lo/dnw$2;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw;->e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnw;

.field final synthetic c:Lo/dod$b$d;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lo/dnw;Landroid/os/Handler;ILo/dod$b$d;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lo/dnw$2;->a:Lo/dnw;

    iput p3, p0, Lo/dnw$2;->d:I

    iput-object p4, p0, Lo/dnw$2;->c:Lo/dod$b$d;

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 263
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo onFailed (AccountDataExtMgr)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    iget-object v0, p0, Lo/dnw$2;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->d(Lo/dnw;)Lo/dnw$d;

    move-result-object v0

    iget v1, p0, Lo/dnw$2;->d:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lo/dnw$d;->e(II)V

    .line 265
    iget-object v0, p0, Lo/dnw$2;->c:Lo/dod$b$d;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/doe;->a(Lo/dod$b$d;I)V

    .line 266
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 270
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    iget-object v0, p0, Lo/dnw$2;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->d(Lo/dnw;)Lo/dnw$d;

    move-result-object v0

    iget v1, p0, Lo/dnw$2;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dnw$d;->e(II)V

    .line 272
    iget-object v0, p0, Lo/dnw$2;->c:Lo/dod$b$d;

    invoke-static {v0}, Lo/doe;->e(Lo/dod$b$d;)V

    .line 273
    return-void
.end method
