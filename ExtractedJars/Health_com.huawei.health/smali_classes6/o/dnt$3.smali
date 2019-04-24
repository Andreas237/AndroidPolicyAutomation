.class Lo/dnt$3;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->e(Landroid/os/Message;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lo/dnt;

.field final synthetic d:Lo/dod$b$d;


# direct methods
.method constructor <init>(Lo/dnt;Landroid/os/Handler;ILo/dod$b$d;)V
    .locals 0

    .line 558
    iput-object p1, p0, Lo/dnt$3;->c:Lo/dnt;

    iput p3, p0, Lo/dnt$3;->a:I

    iput-object p4, p0, Lo/dnt$3;->d:Lo/dod$b$d;

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 561
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo onFailed (AccountDataMgrByAllowLoginArea)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 562
    iget-object v0, p0, Lo/dnt$3;->c:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    iget v1, p0, Lo/dnt$3;->a:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lo/dnt$d;->e(II)V

    .line 563
    iget-object v0, p0, Lo/dnt$3;->d:Lo/dod$b$d;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/doe;->a(Lo/dod$b$d;I)V

    .line 564
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 568
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 569
    iget-object v0, p0, Lo/dnt$3;->c:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    iget v1, p0, Lo/dnt$3;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dnt$d;->e(II)V

    .line 570
    iget-object v0, p0, Lo/dnt$3;->d:Lo/dod$b$d;

    invoke-static {v0}, Lo/doe;->e(Lo/dod$b$d;)V

    .line 571
    return-void
.end method
