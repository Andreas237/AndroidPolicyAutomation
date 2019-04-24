.class Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)V
    .locals 1

    .line 993
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 994
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;->d:Ljava/lang/ref/WeakReference;

    .line 995
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 999
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment$d;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;

    .line 1000
    if-nez v4, :cond_0

    .line 1001
    return-void

    .line 1004
    :cond_0
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->f(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    if-eqz p2, :cond_1

    instance-of v0, p2, Landroid/util/SparseArray;

    if-nez v0, :cond_2

    .line 1008
    :cond_1
    const-string v0, "Track_SportTargetFragment"

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

    .line 1009
    return-void

    .line 1012
    :cond_2
    move-object v5, p2

    :try_start_0
    check-cast v5, Landroid/util/SparseArray;

    .line 1013
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 1015
    if-eqz v6, :cond_3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1016
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-static {v4, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Lcom/huawei/hihealth/HiHealthData;)V

    goto :goto_0

    .line 1019
    :cond_3
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;->c(Lcom/huawei/ui/homehealth/runCard/trackFragments/SportTargetFragment;Lcom/huawei/hihealth/HiHealthData;)V

    .line 1022
    :goto_0
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1027
    goto :goto_1

    .line 1023
    :catch_0
    move-exception v5

    .line 1024
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/ClassCastException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1027
    goto :goto_1

    .line 1025
    :catch_1
    move-exception v5

    .line 1026
    const-string v0, "Track_SportTargetFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1028
    :goto_1
    return-void
.end method
