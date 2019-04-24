.class Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 157
    const-string v0, "Login_PersonalPrivacySettingsActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "out the page"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity$3;->a:Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/settings/activity/PersonalPrivacySettingsActivity;->finish()V

    .line 159
    return-void
.end method
