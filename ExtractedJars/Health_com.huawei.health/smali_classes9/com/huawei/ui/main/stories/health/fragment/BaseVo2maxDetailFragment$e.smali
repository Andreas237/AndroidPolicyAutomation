.class Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;)V
    .locals 1

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$e;->b:Ljava/lang/ref/WeakReference;

    .line 210
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 6

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment$e;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;

    .line 214
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->O:Landroid/os/Handler;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 216
    :cond_0
    const-string v0, "Track_BaseVo2maxDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == baseVo2maxDetailFragment"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void

    .line 219
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 220
    if-nez p1, :cond_2

    .line 221
    const-string v0, "Track_BaseVo2maxDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 223
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 224
    iput-object p2, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 225
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->O:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 227
    :cond_2
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->O:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 229
    :cond_3
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->d(Z)V

    .line 230
    if-nez p1, :cond_4

    .line 231
    const-string v0, "Track_BaseVo2maxDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLastVo2max success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 233
    const/4 v0, 0x1

    iput v0, v5, Landroid/os/Message;->what:I

    .line 234
    iput-object p2, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 235
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/BaseVo2maxDetailFragment;->O:Landroid/os/Handler;

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 238
    :cond_4
    :goto_0
    return-void
.end method
