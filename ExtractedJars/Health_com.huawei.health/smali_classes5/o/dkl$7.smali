.class Lo/dkl$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkl;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lo/czm;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/dkl;


# direct methods
.method constructor <init>(Lo/dkl;)V
    .locals 0

    .line 1444
    iput-object p1, p0, Lo/dkl$7;->d:Lo/dkl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/czm;Ljava/lang/String;Z)V
    .locals 4

    .line 1447
    if-eqz p3, :cond_0

    .line 1448
    iget-object v0, p0, Lo/dkl$7;->d:Lo/dkl;

    invoke-static {v0, p1}, Lo/dkl;->c(Lo/dkl;Lo/czm;)V

    .line 1449
    iget-object v0, p0, Lo/dkl$7;->d:Lo/dkl;

    invoke-static {v0, p1}, Lo/dkl;->e(Lo/dkl;Lo/czm;)V

    .line 1450
    iget-object v0, p0, Lo/dkl$7;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->q(Lo/dkl;)V

    goto :goto_0

    .line 1452
    :cond_0
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushAtmosphere2Device() AtmosphereInfo ERROR!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1453
    iget-object v0, p0, Lo/dkl$7;->d:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->s(Lo/dkl;)V

    .line 1455
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 1444
    move-object v0, p1

    check-cast v0, Lo/czm;

    invoke-virtual {p0, v0, p2, p3}, Lo/dkl$7;->b(Lo/czm;Ljava/lang/String;Z)V

    return-void
.end method
