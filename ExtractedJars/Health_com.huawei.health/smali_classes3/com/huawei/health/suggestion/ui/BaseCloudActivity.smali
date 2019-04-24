.class public abstract Lcom/huawei/health/suggestion/ui/BaseCloudActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;
    }
.end annotation


# instance fields
.field private b:I

.field private c:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Lo/bui;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->c:Landroid/util/SparseArray;

    return-void
.end method

.method static synthetic c(Lcom/huawei/health/suggestion/ui/BaseCloudActivity;I)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->d(I)V

    return-void
.end method

.method private d(I)V
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v1

    .line 106
    if-nez v1, :cond_0

    .line 107
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->e()V

    .line 109
    :cond_0
    return-void
.end method

.method private f()V
    .locals 5

    .line 94
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "HealthTheme"

    const-string v2, "style"

    const-string v3, "com.huawei.health"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 95
    if-nez v4, :cond_0

    .line 96
    const-string v0, "BaseCloudActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate if (themeId == 0)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 98
    :cond_0
    const-string v0, "BaseCloudActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onCreate if (themeId == 0) ELSE themeId="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    invoke-virtual {p0, v4}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->setTheme(I)V

    .line 102
    :goto_0
    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected abstract b()V
.end method

.method protected abstract c()V
.end method

.method protected d()V
    .locals 0

    .line 58
    return-void
.end method

.method protected e(I)Lo/bui;
    .locals 2

    .line 85
    iget v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->b:I

    .line 86
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->c:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bui;

    return-object v0
.end method

.method protected e()V
    .locals 1

    .line 41
    new-instance v0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$5;

    invoke-direct {v0, p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$5;-><init>(Lcom/huawei/health/suggestion/ui/BaseCloudActivity;)V

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 49
    return-void
.end method

.method protected e(ILo/bui;)V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->c:Landroid/util/SparseArray;

    new-instance v1, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;

    invoke-direct {v1, p0, p2}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity$a;-><init>(Lcom/huawei/health/suggestion/ui/BaseCloudActivity;Lo/bui;)V

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 82
    return-void
.end method

.method protected abstract g()V
.end method

.method protected abstract h()V
.end method

.method protected abstract i()V
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 30
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lo/bxd;->a(Ljava/lang/ref/WeakReference;)V

    .line 32
    invoke-direct {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->f()V

    .line 33
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->c()V

    .line 34
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->d()V

    .line 35
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->b()V

    .line 36
    invoke-virtual {p0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->a()V

    .line 37
    iget v0, p0, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->b:I

    invoke-direct {p0, v0}, Lcom/huawei/health/suggestion/ui/BaseCloudActivity;->d(I)V

    .line 38
    return-void
.end method
