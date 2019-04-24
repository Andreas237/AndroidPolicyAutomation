.class public Lo/etx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private c:Lo/dnm;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lo/etx;->a:Landroid/content/Context;

    .line 32
    iget-object v0, p0, Lo/etx;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 33
    iget-object v0, p0, Lo/etx;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    iput-object v0, p0, Lo/etx;->c:Lo/dnm;

    .line 35
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 65
    const-string v0, "CloudServiceInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setCloudServiceStatusToCloud status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    iget-object v0, p0, Lo/etx;->c:Lo/dnm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 68
    iget-object v0, p0, Lo/etx;->c:Lo/dnm;

    const-string v1, "cloud_switch"

    new-instance v2, Lo/etx$3;

    invoke-direct {v2, p0}, Lo/etx$3;-><init>(Lo/etx;)V

    invoke-virtual {v0, v1, p1, v2}, Lo/dnm;->e(Ljava/lang/String;Ljava/lang/String;Lo/cyx;)V

    .line 82
    :cond_0
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 5

    .line 42
    const/4 v4, 0x0

    .line 43
    iget-object v0, p0, Lo/etx;->c:Lo/dnm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 44
    iget-object v0, p0, Lo/etx;->c:Lo/dnm;

    const-string v1, "cloud_switch"

    invoke-virtual {v0, v1}, Lo/dnm;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 46
    :cond_0
    const-string v0, "CloudServiceInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCloudServiceStatus status = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    return-object v4
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 59
    return-void
.end method
