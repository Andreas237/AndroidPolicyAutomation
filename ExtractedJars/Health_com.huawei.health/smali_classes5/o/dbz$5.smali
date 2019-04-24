.class Lo/dbz$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dbz;->d(Lo/dca;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dca;

.field final synthetic d:Lo/dbz;


# direct methods
.method constructor <init>(Lo/dbz;Lo/dca;)V
    .locals 0

    .line 494
    iput-object p1, p0, Lo/dbz$5;->d:Lo/dbz;

    iput-object p2, p0, Lo/dbz$5;->b:Lo/dca;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 497
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCoreSleepStatusToHiHealth onResult type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " obj="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    if-nez p1, :cond_0

    .line 499
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCoreSleepStatusToHiHealth success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 500
    iget-object v0, p0, Lo/dbz$5;->b:Lo/dca;

    iget-object v1, p0, Lo/dbz$5;->b:Lo/dca;

    invoke-virtual {v1}, Lo/dca;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/dca;->a(J)V

    goto :goto_0

    .line 502
    :cond_0
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCoreSleepStatusToHiHealth not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 504
    :goto_0
    iget-object v0, p0, Lo/dbz$5;->b:Lo/dca;

    invoke-virtual {v0}, Lo/dca;->b()V

    .line 505
    return-void
.end method
