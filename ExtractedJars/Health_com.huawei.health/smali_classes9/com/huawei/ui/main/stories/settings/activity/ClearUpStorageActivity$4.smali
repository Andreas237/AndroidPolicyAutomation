.class Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b()V
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

    .line 124
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 127
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->d(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v1

    invoke-virtual {v1}, Lo/vu;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    const-string v0, "ClearUpStorageActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "findRubbishSpaceSize mRubbishStorageSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;->c:Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4$2;-><init>(Lcom/huawei/ui/main/stories/settings/activity/ClearUpStorageActivity$4;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 137
    :cond_0
    return-void
.end method
