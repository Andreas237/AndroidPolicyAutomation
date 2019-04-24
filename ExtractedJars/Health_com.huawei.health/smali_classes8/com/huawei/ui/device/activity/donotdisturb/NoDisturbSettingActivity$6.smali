.class Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fey$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)V
    .locals 0

    .line 717
    iput-object p1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    iput p2, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/app/Dialog;III)V
    .locals 4

    .line 721
    const-string v0, "zhoali=="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hour="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", minute="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0, p3}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->e(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0, p4}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->d(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I

    .line 725
    iget v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->e:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 726
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->t(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    add-int/2addr v1, p4

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->c(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I

    goto :goto_0

    .line 728
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->t(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)I

    move-result v1

    mul-int/lit8 v1, v1, 0x64

    add-int/2addr v1, p4

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->b(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;I)I

    .line 730
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->p(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)V

    .line 731
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->u(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->q(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 732
    iget-object v0, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->y(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity$6;->b:Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;->r(Lcom/huawei/ui/device/activity/donotdisturb/NoDisturbSettingActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 733
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 734
    return-void
.end method
