.class Lo/dkl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cyx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dkl;->b(DD)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/cyx<Lo/czo;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/dkl;


# direct methods
.method constructor <init>(Lo/dkl;)V
    .locals 0

    .line 697
    iput-object p1, p0, Lo/dkl$1;->c:Lo/dkl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/czo;Ljava/lang/String;Z)V
    .locals 4

    .line 700
    if-eqz p3, :cond_0

    .line 702
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "pushWeather2Device() hwCloudMgr.getWeatherInfo Success, dataWeather="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 703
    iget-object v0, p0, Lo/dkl$1;->c:Lo/dkl;

    invoke-static {v0, p1}, Lo/dkl;->a(Lo/dkl;Lo/czo;)V

    .line 704
    iget-object v0, p0, Lo/dkl$1;->c:Lo/dkl;

    invoke-static {v0, p1}, Lo/dkl;->e(Lo/dkl;Lo/czo;)Lo/czo;

    .line 706
    iget-object v0, p0, Lo/dkl$1;->c:Lo/dkl;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dkl;->a(Lo/dkl;I)I

    goto :goto_0

    .line 708
    :cond_0
    const-string v0, "HWWeatherMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pushWeather2Device() hwCloudMgr.getWeatherInfo ERROR!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    iget-object v0, p0, Lo/dkl$1;->c:Lo/dkl;

    iget-object v1, p0, Lo/dkl$1;->c:Lo/dkl;

    invoke-static {v1}, Lo/dkl;->o(Lo/dkl;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lo/dkl;->a(Lo/dkl;I)I

    .line 710
    iget-object v0, p0, Lo/dkl$1;->c:Lo/dkl;

    invoke-static {v0}, Lo/dkl;->a(Lo/dkl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x190

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 712
    :goto_0
    return-void
.end method

.method public synthetic operationResult(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    .line 697
    move-object v0, p1

    check-cast v0, Lo/czo;

    invoke-virtual {p0, v0, p2, p3}, Lo/dkl$1;->a(Lo/czo;Ljava/lang/String;Z)V

    return-void
.end method
