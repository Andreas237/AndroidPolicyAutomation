.class Lo/alt$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/alt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/alt;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/alt;)V
    .locals 1

    .line 783
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 781
    const/4 v0, 0x0

    iput-object v0, p0, Lo/alt$e;->d:Ljava/lang/ref/WeakReference;

    .line 784
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/alt$e;->d:Ljava/lang/ref/WeakReference;

    .line 785
    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 5

    .line 793
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SportIntensityCallback "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 794
    const/4 v0, 0x4

    if-eq v0, p1, :cond_0

    .line 795
    return-void

    .line 797
    :cond_0
    iget-object v0, p0, Lo/alt$e;->d:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    .line 798
    iget-object v0, p0, Lo/alt$e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/alt;

    .line 800
    if-eqz v4, :cond_1

    invoke-static {v4}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 801
    invoke-static {v4}, Lo/alt;->c(Lo/alt;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3fb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 803
    :cond_1
    goto :goto_0

    .line 804
    :cond_2
    const-string v0, "Step_LSC"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mLogicalStepCounterRef == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 808
    :goto_0
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 789
    return-void
.end method
