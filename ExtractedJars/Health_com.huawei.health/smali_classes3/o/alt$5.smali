.class Lo/alt$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abp$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/alt;->G()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/alt;


# direct methods
.method constructor <init>(Lo/alt;)V
    .locals 0

    .line 1818
    iput-object p1, p0, Lo/alt$5;->e:Lo/alt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/util/SparseArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Lo/amd;>;)V"
        }
    .end annotation

    .line 1822
    iget-object v0, p0, Lo/alt$5;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->e(Lo/alt;)Lo/abo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1823
    iget-object v0, p0, Lo/alt$5;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->e(Lo/alt;)Lo/abo;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/abo;->d(Landroid/util/SparseArray;)V

    .line 1825
    :cond_0
    iget-object v0, p0, Lo/alt$5;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->d(Lo/alt;)Lo/abm;

    move-result-object v0

    check-cast v0, Lo/abp;

    invoke-virtual {v0}, Lo/abp;->e()V

    .line 1826
    iget-object v0, p0, Lo/alt$5;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1827
    iget-object v0, p0, Lo/alt$5;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3f4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1829
    :cond_1
    return-void
.end method

.method public d(Landroid/util/SparseArray;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Lo/amd;>;)V"
        }
    .end annotation

    .line 1833
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "compareMidWareCacheAndLocalCache onFailed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1834
    iget-object v0, p0, Lo/alt$5;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->d(Lo/alt;)Lo/abm;

    move-result-object v0

    check-cast v0, Lo/abp;

    invoke-virtual {v0}, Lo/abp;->e()V

    .line 1835
    iget-object v0, p0, Lo/alt$5;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1836
    iget-object v0, p0, Lo/alt$5;->e:Lo/alt;

    invoke-static {v0}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3f4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1838
    :cond_0
    return-void
.end method
