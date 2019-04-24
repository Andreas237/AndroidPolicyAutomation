.class Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)V
    .locals 0

    .line 1375
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$3;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1378
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity$3;->d:Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;->r(Lcom/huawei/ui/main/stories/me/activity/AppSettingActivity;)Lo/emu;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/emu;->setChecked(Z)V

    .line 1379
    return-void
.end method
