.class Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 102
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBtnClearOperate onClick deleteImageFileOrDirectory"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    invoke-virtual {v0}, Lo/vu;->d()V

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$2;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    const/16 v1, 0x6e

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;I)V

    .line 105
    return-void
.end method
