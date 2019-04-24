.class Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)V
    .locals 1

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 143
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;->b:Ljava/lang/ref/WeakReference;

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    .line 145
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 149
    if-nez p1, :cond_0

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->o(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I

    .line 151
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->l(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->s(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 152
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->u(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity$d;->a:Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;->u(Lcom/huawei/ui/main/stories/me/activity/DeveloperDataInsertionActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 156
    :cond_0
    return-void
.end method
