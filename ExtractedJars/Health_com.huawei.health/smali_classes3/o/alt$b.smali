.class Lo/alt$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/alt;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/alt;)V
    .locals 1

    .line 748
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 746
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt$b;->e:Ljava/lang/ref/WeakReference;

    .line 749
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/alt$b;->e:Ljava/lang/ref/WeakReference;

    .line 750
    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 754
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 755
    :cond_0
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ReadStaticDealCallback onResult data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 756
    return-void

    .line 761
    :cond_1
    iget-object v0, p0, Lo/alt$b;->e:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    .line 762
    iget-object v0, p0, Lo/alt$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/alt;

    .line 764
    if-eqz v4, :cond_2

    invoke-static {v4}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 765
    invoke-static {v4}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3f9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v5

    .line 766
    iput-object p1, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 767
    invoke-static {v4}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 769
    :cond_2
    goto :goto_0

    .line 770
    :cond_3
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLogicalStepCounterRef == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 772
    :goto_0
    return-void
.end method
