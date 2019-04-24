.class Lo/cvm$1$5;
.super Lo/cvk$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvm$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cvm$1;


# direct methods
.method constructor <init>(Lo/cvm$1;)V
    .locals 0

    iput-object p1, p0, Lo/cvm$1$5;->c:Lo/cvm$1;

    invoke-direct {p0}, Lo/cvk$b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;I)V
    .locals 5

    const-string v0, "HsfPackageInstaller"

    const-string v1, "packageInstalled %s code: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Lo/cvm$1$5;->c:Lo/cvm$1;

    iget-object v0, v0, Lo/cvm$1;->a:Lo/cvm;

    iget-object v1, p0, Lo/cvm$1$5;->c:Lo/cvm$1;

    iget-object v1, v1, Lo/cvm$1;->b:Lo/cvm$b;

    invoke-static {v0, v1}, Lo/cvm;->d(Lo/cvm;Lo/cvm$b;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lo/cvm$1$5;->c:Lo/cvm$1;

    iget-object v0, v0, Lo/cvm$1;->a:Lo/cvm;

    iget-object v1, p0, Lo/cvm$1$5;->c:Lo/cvm$1;

    iget-object v1, v1, Lo/cvm$1;->b:Lo/cvm$b;

    invoke-static {v0, v1}, Lo/cvm;->b(Lo/cvm;Lo/cvm$b;)V

    :goto_0
    return-void
.end method
