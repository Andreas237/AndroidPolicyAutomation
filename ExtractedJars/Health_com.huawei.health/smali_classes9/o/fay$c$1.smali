.class Lo/fay$c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fay$c;->c(JJLo/fbd$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fay$c;

.field final synthetic e:Lo/fbd$e;


# direct methods
.method constructor <init>(Lo/fay$c;Lo/fbd$e;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/fay$c$1;->a:Lo/fay$c;

    iput-object p2, p0, Lo/fay$c$1;->e:Lo/fbd$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/util/SparseArray;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;>;II)V"
        }
    .end annotation

    .line 84
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 85
    iget-object v0, p0, Lo/fay$c$1;->e:Lo/fbd$e;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 86
    return-void

    .line 88
    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 89
    const-string v0, "WarningHRHistoryDataTree"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    iget-object v0, p0, Lo/fay$c$1;->e:Lo/fbd$e;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 91
    return-void

    .line 94
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 96
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 98
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 99
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 101
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 103
    new-instance v0, Lo/fbn;

    invoke-direct {v0, v8, v9}, Lo/fbn;-><init>(J)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 106
    :cond_2
    iget-object v0, p0, Lo/fay$c$1;->e:Lo/fbd$e;

    invoke-interface {v0, v4}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 107
    return-void
.end method
