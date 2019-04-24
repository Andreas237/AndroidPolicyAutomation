.class Lo/dlw$a;
.super Lo/dmd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dlw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
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

    .line 253
    iput-object p1, p0, Lo/dlw$a;->c:Lo/dlw;

    invoke-direct {p0}, Lo/dmd;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dlw;Lo/dlw$5;)V
    .locals 0

    .line 253
    invoke-direct {p0, p1}, Lo/dlw$a;-><init>(Lo/dlw;)V

    return-void
.end method


# virtual methods
.method protected a(ILjava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;)Z"
        }
    .end annotation

    .line 257
    iget-object v0, p0, Lo/dlw$a;->c:Lo/dlw;

    invoke-static {v0, p1, p2}, Lo/dlw;->a(Lo/dlw;ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected b(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;)V"
        }
    .end annotation

    .line 267
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RequestJoinActivityCallback, goTiggger, activities.size()="

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

    .line 268
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 269
    iget-object v0, p0, Lo/dlw$a;->c:Lo/dlw;

    iget-object v0, v0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2711

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 270
    return-void

    .line 273
    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 274
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;

    .line 275
    invoke-virtual {v5}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityStatus()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 276
    move-object v6, v5

    .line 277
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not completed activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 278
    iget-object v0, p0, Lo/dlw$a;->c:Lo/dlw;

    invoke-static {v0}, Lo/dlw;->a(Lo/dlw;)Lo/dlo;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/dlo;->c(Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;)V

    .line 279
    return-void

    .line 273
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 283
    :cond_2
    const-string v0, "SMART_HealthcareSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no uncompleted activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    iget-object v0, p0, Lo/dlw$a;->c:Lo/dlw;

    iget-object v0, v0, Lo/dlw;->b:Landroid/content/Context;

    const/16 v1, 0x2711

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Lo/dmn;->b(Landroid/content/Context;II)V

    .line 285
    return-void
.end method

.method protected synthetic d(ILjava/lang/Object;)Z
    .locals 1

    .line 253
    move-object v0, p2

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, p1, v0}, Lo/dlw$a;->a(ILjava/util/List;)Z

    move-result v0

    return v0
.end method

.method protected bridge synthetic d(Ljava/lang/Object;)Z
    .locals 1

    .line 253
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/dlw$a;->d(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method protected d(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;>;)Z"
        }
    .end annotation

    .line 262
    const/4 v0, 0x1

    return v0
.end method

.method protected synthetic e(Ljava/lang/Object;)V
    .locals 1

    .line 253
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lo/dlw$a;->b(Ljava/util/List;)V

    return-void
.end method
