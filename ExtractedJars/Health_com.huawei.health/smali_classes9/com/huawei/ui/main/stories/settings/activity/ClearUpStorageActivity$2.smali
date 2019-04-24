.class Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 93
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBtnClearOperate onClick !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)I

    move-result v0

    const/16 v1, 0x6f

    if-ne v1, v0, :cond_0

    .line 95
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->finish()V

    goto :goto_0

    .line 97
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$5;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$4;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 117
    :cond_1
    :goto_0
    return-void
.end method
