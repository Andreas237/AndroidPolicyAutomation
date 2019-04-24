.class public abstract Lcom/huawei/android/quickaction/QuickActionService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/android/quickaction/QuickActionService$c;
    }
.end annotation


# instance fields
.field private b:Lcom/huawei/android/quickaction/QuickActionService$c;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 29
    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    const-class v1, Lcom/huawei/android/quickaction/QuickActionService;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/android/quickaction/QuickActionService;->d:Ljava/lang/String;

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/android/quickaction/QuickActionService;->b:Lcom/huawei/android/quickaction/QuickActionService$c;

    .line 28
    return-void
.end method


# virtual methods
.method public abstract b(Landroid/content/ComponentName;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/ComponentName;)Ljava/util/List<Lcom/huawei/android/quickaction/QuickAction;>;"
        }
    .end annotation
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 72
    const-string v0, "com.huawei.android.quickaction.QuickActionService"

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/huawei/android/quickaction/QuickActionService;->b:Lcom/huawei/android/quickaction/QuickActionService$c;

    if-nez v0, :cond_1

    .line 80
    new-instance v0, Lcom/huawei/android/quickaction/QuickActionService$c;

    invoke-direct {v0, p0}, Lcom/huawei/android/quickaction/QuickActionService$c;-><init>(Lcom/huawei/android/quickaction/QuickActionService;)V

    iput-object v0, p0, Lcom/huawei/android/quickaction/QuickActionService;->b:Lcom/huawei/android/quickaction/QuickActionService$c;

    .line 82
    :cond_1
    iget-object v0, p0, Lcom/huawei/android/quickaction/QuickActionService;->b:Lcom/huawei/android/quickaction/QuickActionService$c;

    return-object v0
.end method
