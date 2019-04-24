.class Lo/dez$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "i"
.end annotation


# instance fields
.field a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field b:Z

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dez;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 5

    .line 1663
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1664
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, " syncFitnessDetailDataRunable:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1665
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dez$i;->e:Ljava/lang/ref/WeakReference;

    .line 1666
    iput-object p2, p0, Lo/dez$i;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1667
    iput-boolean p3, p0, Lo/dez$i;->b:Z

    .line 1668
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1672
    iget-object v0, p0, Lo/dez$i;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/dez;

    .line 1673
    if-eqz v2, :cond_0

    .line 1674
    iget-object v0, p0, Lo/dez$i;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iget-boolean v1, p0, Lo/dez$i;->b:Z

    invoke-static {v2, v0, v1}, Lo/dez;->a(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    .line 1676
    :cond_0
    return-void
.end method
