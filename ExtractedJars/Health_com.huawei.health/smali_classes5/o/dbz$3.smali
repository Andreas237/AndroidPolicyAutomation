.class Lo/dbz$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dbz;->e(Lo/dca;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dbz;


# direct methods
.method constructor <init>(Lo/dbz;)V
    .locals 0

    .line 514
    iput-object p1, p0, Lo/dbz$3;->e:Lo/dbz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 517
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCoreSleepCalcToHiHealth onResult type="

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

    .line 518
    if-nez p1, :cond_0

    .line 519
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCoreSleepCalcToHiHealth success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 521
    :cond_0
    const-string v0, "CoreSleepMgrStorage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertCoreSleepCalcToHiHealth not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 525
    :goto_0
    return-void
.end method
