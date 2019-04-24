.class Lo/fay$c$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fay$c;->e(JJLo/fbd$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/fbd$e;

.field final synthetic c:Lo/fay$c;


# direct methods
.method constructor <init>(Lo/fay$c;Lo/fbd$e;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/fay$c$3;->c:Lo/fay$c;

    iput-object p2, p0, Lo/fay$c$3;->b:Lo/fbd$e;

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

    .line 125
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 126
    iget-object v0, p0, Lo/fay$c$3;->b:Lo/fbd$e;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 127
    return-void

    .line 129
    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 130
    const-string v0, "WarningHRHistoryDataTree"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "triggered but the data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    iget-object v0, p0, Lo/fay$c$3;->b:Lo/fbd$e;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 132
    return-void

    .line 135
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 137
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    .line 139
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 140
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 142
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiHealthData;->getStartTime()J

    move-result-wide v8

    .line 144
    new-instance v0, Lo/fbl;

    invoke-direct {v0, v8, v9}, Lo/fbl;-><init>(J)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 147
    :cond_2
    iget-object v0, p0, Lo/fay$c$3;->b:Lo/fbd$e;

    invoke-interface {v0, v4}, Lo/fbd$e;->b(Ljava/util/List;)V

    .line 148
    return-void
.end method
