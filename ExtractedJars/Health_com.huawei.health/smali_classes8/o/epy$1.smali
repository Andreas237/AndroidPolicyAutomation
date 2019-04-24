.class Lo/epy$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epy;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/epy;


# direct methods
.method constructor <init>(Lo/epy;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/epy$1;->a:Lo/epy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 8

    .line 100
    const-string v0, "UIHLH_FunctionSetViewAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStressStatisticsDatas errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 102
    return-void

    .line 104
    :cond_0
    move-object v4, p1

    check-cast v4, Landroid/util/SparseArray;

    .line 105
    invoke-virtual {v4}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 106
    return-void

    .line 110
    :cond_1
    const v0, 0xad12

    invoke-virtual {v4, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 111
    move-object v5, v6

    check-cast v5, Ljava/util/List;

    .line 112
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiHealthData;

    .line 113
    if-eqz v7, :cond_2

    .line 114
    iget-object v0, p0, Lo/epy$1;->a:Lo/epy;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/epy;->e(Lo/epy;Z)Z

    .line 117
    :cond_2
    return-void
.end method
