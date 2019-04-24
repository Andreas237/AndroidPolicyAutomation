.class Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

.field final synthetic d:Landroid/content/Intent;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;Landroid/content/Intent;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$1;->d:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 169
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 170
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 171
    const/4 v0, 0x0

    iput v0, v1, Landroid/os/Message;->what:I

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$1;->d:Landroid/content/Intent;

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity$1;->b:Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/AddOrEditWeightUserActivity;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 175
    :cond_0
    return-void
.end method
