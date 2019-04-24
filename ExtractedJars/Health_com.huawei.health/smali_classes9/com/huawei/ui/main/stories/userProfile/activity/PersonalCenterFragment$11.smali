.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/up/callback/CommonCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V
    .locals 0

    .line 3718
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$11;->d:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(I)V
    .locals 4

    .line 3727
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get new headImg and name from cloud failure."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3728
    return-void
.end method

.method public onSuccess(Landroid/os/Bundle;)V
    .locals 4

    .line 3721
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get new headImg and name from cloud success."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3722
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$11;->d:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->c(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 3723
    return-void
.end method
