.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->t()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 1523
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1526
    const-string v0, "UIME_AppSettingActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "positive settingMapType : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v3}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->u(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1527
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$6;->c:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->u(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->c(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;I)V

    .line 1529
    return-void
.end method
