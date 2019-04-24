.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)V
    .locals 1

    .line 216
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 217
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;->d:Ljava/lang/ref/WeakReference;

    .line 218
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 222
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete message = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;

    .line 224
    if-nez v4, :cond_0

    .line 225
    return-void

    .line 227
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 228
    const/4 v0, 0x2

    iput v0, v5, Landroid/os/Message;->what:I

    .line 229
    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodsugarActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 230
    if-nez p1, :cond_1

    .line 231
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete successful"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 233
    :cond_1
    const-string v0, "UIHLH_InputBloodsugarActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delete failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    :goto_0
    return-void
.end method
