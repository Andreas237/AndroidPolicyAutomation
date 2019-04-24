.class Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Z)V
    .locals 0

    .line 810
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    iput-boolean p2, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 813
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;->a:Z

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Z)V

    .line 814
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    sget-object v1, Lo/dae;->en:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 815
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$8;->d:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->c(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;Z)V

    .line 816
    return-void
.end method
