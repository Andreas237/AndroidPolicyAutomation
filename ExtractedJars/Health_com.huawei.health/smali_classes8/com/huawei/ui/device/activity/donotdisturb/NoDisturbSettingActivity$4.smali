.class Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V
    .locals 0

    .line 441
    iput-object p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$4;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 445
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$4;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->n(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Lo/env;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$4;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->f(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/env;->b(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 446
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$4;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->l(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    goto :goto_0

    .line 448
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$4;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->s(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    .line 450
    :goto_0
    return-void
.end method
