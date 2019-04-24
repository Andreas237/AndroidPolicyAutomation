.class Lo/dnt$2;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt;->c(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/dnt;


# direct methods
.method constructor <init>(Lo/dnt;Landroid/os/Handler;I)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/dnt$2;->b:Lo/dnt;

    iput p3, p0, Lo/dnt$2;->a:I

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 4

    .line 160
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit end onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    iget-object v0, p0, Lo/dnt$2;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    iget v1, p0, Lo/dnt$2;->a:I

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lo/dnt$d;->e(II)V

    .line 162
    iget-object v0, p0, Lo/dnt$2;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/dnt$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 163
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 4

    .line 167
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processInit end onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    iget-object v0, p0, Lo/dnt$2;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    iget v1, p0, Lo/dnt$2;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/dnt$d;->e(II)V

    .line 169
    iget-object v0, p0, Lo/dnt$2;->b:Lo/dnt;

    invoke-static {v0}, Lo/dnt;->b(Lo/dnt;)Lo/dnt$d;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lo/dnt$d;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 170
    return-void
.end method
