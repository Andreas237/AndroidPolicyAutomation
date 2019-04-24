.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;

.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;)V
    .locals 1

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;->d:Ljava/lang/ref/WeakReference;

    .line 154
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;

    .line 155
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 5

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 159
    const-string v0, "UIHLH_InputWeightActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "InsertWeightResponseCallback,insert successful "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    .line 161
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$b;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;

    invoke-virtual {v0, v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputWeightActivity$e;->sendMessage(Landroid/os/Message;)Z

    .line 163
    :cond_0
    return-void
.end method
