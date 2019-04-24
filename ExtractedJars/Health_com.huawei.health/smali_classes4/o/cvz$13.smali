.class Lo/cvz$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->d(Landroid/content/Context;JJILo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cvz;

.field final synthetic d:Lo/duh;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 367
    iput-object p1, p0, Lo/cvz$13;->c:Lo/cvz;

    iput-object p2, p0, Lo/cvz$13;->d:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 370
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 371
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    return-void

    .line 374
    :cond_0
    iget-object v0, p0, Lo/cvz$13;->d:Lo/duh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 375
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 376
    iget-object v0, p0, Lo/cvz$13;->d:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 378
    :cond_1
    return-void
.end method
