.class Lo/cvz$19;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->b(Landroid/content/Context;JJILo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/cvz;

.field final synthetic e:Lo/duh;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 595
    iput-object p1, p0, Lo/cvz$19;->d:Lo/cvz;

    iput-object p2, p0, Lo/cvz$19;->e:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 597
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 598
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSumYearData data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 599
    return-void

    .line 601
    :cond_0
    iget-object v0, p0, Lo/cvz$19;->e:Lo/duh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 602
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSumYearData success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 603
    iget-object v0, p0, Lo/cvz$19;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 605
    :cond_1
    return-void
.end method
