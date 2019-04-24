.class Lo/cvz$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->e(Landroid/content/Context;JJILo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/duh;

.field final synthetic d:Lo/cvz;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 335
    iput-object p1, p0, Lo/cvz$12;->d:Lo/cvz;

    iput-object p2, p0, Lo/cvz$12;->c:Lo/duh;

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

    .line 338
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 339
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    return-void

    .line 342
    :cond_0
    iget-object v0, p0, Lo/cvz$12;->c:Lo/duh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 343
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 344
    iget-object v0, p0, Lo/cvz$12;->c:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 346
    :cond_1
    return-void
.end method
