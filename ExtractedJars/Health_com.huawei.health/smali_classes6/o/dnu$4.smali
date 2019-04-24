.class Lo/dnu$4;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnu;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnu;

.field final synthetic b:I


# direct methods
.method constructor <init>(Lo/dnu;Landroid/os/Handler;I)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/dnu$4;->a:Lo/dnu;

    iput p3, p0, Lo/dnu$4;->b:I

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 65
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit(AccountDataMgrByNAllowLoginArea) end onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lo/dnu$4;->a:Lo/dnu;

    invoke-static {v0}, Lo/dnu;->b(Lo/dnu;)Lo/dnu$b;

    move-result-object v0

    iget v1, p0, Lo/dnu$4;->b:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lo/dnu$b;->e(II)V

    .line 67
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 71
    const-string v0, "AccountDataMgrByNAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit(AccountDataMgrByNAllowLoginArea) end onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    iget-object v0, p0, Lo/dnu$4;->a:Lo/dnu;

    invoke-static {v0}, Lo/dnu;->b(Lo/dnu;)Lo/dnu$b;

    move-result-object v0

    iget v1, p0, Lo/dnu$4;->b:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dnu$b;->e(II)V

    .line 73
    return-void
.end method
