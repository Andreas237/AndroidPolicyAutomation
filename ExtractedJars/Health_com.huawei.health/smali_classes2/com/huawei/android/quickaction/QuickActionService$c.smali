.class Lcom/huawei/android/quickaction/QuickActionService$c;
.super Lo/vt$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/android/quickaction/QuickActionService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/android/quickaction/QuickActionService;


# direct methods
.method constructor <init>(Lcom/huawei/android/quickaction/QuickActionService;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/android/quickaction/QuickActionService$c;->c:Lcom/huawei/android/quickaction/QuickActionService;

    invoke-direct {p0}, Lo/vt$d;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Landroid/content/ComponentName;Lo/vw;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 89
    const/4 v1, 0x0

    .line 94
    :try_start_0
    iget-object v0, p0, Lcom/huawei/android/quickaction/QuickActionService$c;->c:Lcom/huawei/android/quickaction/QuickActionService;

    invoke-virtual {v0, p1}, Lcom/huawei/android/quickaction/QuickActionService;->b(Landroid/content/ComponentName;)Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v1, v0

    .line 95
    goto :goto_0

    :catchall_0
    move-exception v2

    .line 96
    invoke-interface {p2, v1}, Lo/vw;->b(Ljava/util/List;)V

    .line 100
    throw v2

    .line 96
    :goto_0
    invoke-interface {p2, v1}, Lo/vw;->b(Ljava/util/List;)V

    .line 101
    return-void
.end method
