.class Lo/dnw$3;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnw;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dnw;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/dnw;Landroid/os/Handler;I)V
    .locals 0

    .line 73
    iput-object p1, p0, Lo/dnw$3;->a:Lo/dnw;

    iput p3, p0, Lo/dnw$3;->e:I

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 76
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit(AccountDataExtMgr) end onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    iget-object v0, p0, Lo/dnw$3;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->d(Lo/dnw;)Lo/dnw$d;

    move-result-object v0

    iget v1, p0, Lo/dnw$3;->e:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lo/dnw$d;->e(II)V

    .line 78
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 82
    const-string v0, "AccountDataExtMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit(AccountDataExtMgr) end onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    iget-object v0, p0, Lo/dnw$3;->a:Lo/dnw;

    invoke-static {v0}, Lo/dnw;->d(Lo/dnw;)Lo/dnw$d;

    move-result-object v0

    iget v1, p0, Lo/dnw$3;->e:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dnw$d;->e(II)V

    .line 84
    return-void
.end method
