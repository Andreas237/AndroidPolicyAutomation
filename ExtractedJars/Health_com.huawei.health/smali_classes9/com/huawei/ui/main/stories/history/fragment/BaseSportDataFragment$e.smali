.class Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:I

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;I)V
    .locals 1

    .line 810
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 808
    const/4 v0, 0x7

    iput v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;->b:I

    .line 811
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;->e:Ljava/lang/ref/WeakReference;

    .line 812
    iput p2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;->b:I

    .line 813
    return-void
.end method

.method private a(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 842
    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 843
    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    iput-object v0, p1, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    .line 845
    :cond_0
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 817
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    .line 818
    if-nez v4, :cond_0

    .line 819
    return-void

    .line 821
    :cond_0
    const/4 v0, 0x0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->Z:Lcom/huawei/hihealth/HiHealthData;

    .line 823
    if-eqz p2, :cond_1

    instance-of v0, p2, Landroid/util/SparseArray;

    if-nez v0, :cond_2

    .line 824
    :cond_1
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->N:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 825
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong data : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 826
    return-void

    .line 829
    :cond_2
    move-object v5, p2

    :try_start_0
    check-cast v5, Landroid/util/SparseArray;

    .line 830
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 831
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    iget v2, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "\nsum "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 832
    invoke-direct {p0, v4, v6}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$e;->a(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 837
    goto :goto_0

    .line 833
    :catch_0
    move-exception v5

    .line 834
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 837
    goto :goto_0

    .line 835
    :catch_1
    move-exception v5

    .line 836
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 838
    :goto_0
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->N:Landroid/os/Handler;

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 839
    return-void
.end method
