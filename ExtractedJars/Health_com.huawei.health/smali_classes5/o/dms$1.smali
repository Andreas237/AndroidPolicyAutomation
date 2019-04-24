.class Lo/dms$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dms;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dms;


# direct methods
.method constructor <init>(Lo/dms;)V
    .locals 0

    .line 531
    iput-object p1, p0, Lo/dms$1;->e:Lo/dms;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 534
    const-string v0, "HWStressMgr"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertStressDetailsListToHiHealth onResult type="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", obj = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    if-nez p1, :cond_0

    .line 536
    const-string v0, "HWStressMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertStressDetailsListToHiHealth success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 537
    iget-object v0, p0, Lo/dms$1;->e:Lo/dms;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dms;->b(Lo/dms;Z)Z

    goto :goto_0

    .line 539
    :cond_0
    const-string v0, "HWStressMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCoreSleepStatusToHiHealth not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    iget-object v0, p0, Lo/dms$1;->e:Lo/dms;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dms;->b(Lo/dms;Z)Z

    .line 542
    :goto_0
    iget-object v0, p0, Lo/dms$1;->e:Lo/dms;

    invoke-static {v0}, Lo/dms;->a(Lo/dms;)Lo/dms$e;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dms$e;->sendEmptyMessage(I)Z

    .line 543
    return-void
.end method
