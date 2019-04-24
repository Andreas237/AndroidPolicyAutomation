.class Lo/dlw$e;
.super Lo/dmd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dmd<Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/dlw;


# direct methods
.method private constructor <init>(Lo/dlw;)V
    .locals 0

    .line 224
    iput-object p1, p0, Lo/dlw$e;->c:Lo/dlw;

    invoke-direct {p0}, Lo/dmd;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dlw;Lo/dlw$5;)V
    .locals 0

    .line 224
    invoke-direct {p0, p1}, Lo/dlw$e;-><init>(Lo/dlw;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;)Z"
        }
    .end annotation

    .line 233
    const/4 v0, 0x1

    return v0
.end method

.method protected c(ILjava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;)Z"
        }
    .end annotation

    .line 228
    iget-object v0, p0, Lo/dlw$e;->c:Lo/dlw;

    invoke-static {v0, p1, p2}, Lo/dlw;->a(Lo/dlw;ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected synthetic d(ILjava/lang/Object;)Z
    .locals 1

    .line 224
    move-object v0, p2

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, p1, v0}, Lo/dlw$e;->c(ILjava/util/List;)Z

    move-result v0

    return v0
.end method

.method protected synthetic d(Ljava/lang/Object;)Z
    .locals 1

    .line 224
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/dlw$e;->a(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method protected bridge synthetic e(Ljava/lang/Object;)V
    .locals 1

    .line 224
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/dlw$e;->e(Ljava/util/List;)V

    return-void
.end method

.method protected e(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;)V"
        }
    .end annotation

    .line 239
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RequestStepsGoalActivityCallback.goTiggger, activities.size()="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 241
    iget-object v0, p0, Lo/dlw$e;->c:Lo/dlw;

    iget-object v0, v0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2710

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    goto :goto_0

    .line 243
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;

    .line 244
    iget-object v0, p0, Lo/dlw$e;->c:Lo/dlw;

    invoke-static {v0}, Lo/dlw;->a(Lo/dlw;)Lo/dlo;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/dlo;->a(Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;)V

    .line 246
    :goto_0
    return-void
.end method
