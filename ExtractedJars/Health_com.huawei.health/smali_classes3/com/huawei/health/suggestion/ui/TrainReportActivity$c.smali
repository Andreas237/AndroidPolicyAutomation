.class Lcom/huawei/health/suggestion/ui/TrainReportActivity$c;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/TrainReportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;>;"
    }
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/TrainReportActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/TrainReportActivity;)V
    .locals 1

    .line 107
    invoke-direct {p0}, Lo/bui;-><init>()V

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity$c;->d:Ljava/lang/ref/WeakReference;

    .line 108
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity$c;->d:Ljava/lang/ref/WeakReference;

    .line 109
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 113
    const-string v0, "TrainReportActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainReportActivity$c;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/suggestion/ui/TrainReportActivity;

    .line 119
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 120
    invoke-static {v1, p1}, Lcom/huawei/health/suggestion/ui/TrainReportActivity;->d(Lcom/huawei/health/suggestion/ui/TrainReportActivity;Ljava/util/List;)Ljava/util/List;

    .line 122
    :cond_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 103
    move-object v0, p1

    check-cast v0, Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/huawei/health/suggestion/ui/TrainReportActivity$c;->c(Ljava/util/List;)V

    return-void
.end method
