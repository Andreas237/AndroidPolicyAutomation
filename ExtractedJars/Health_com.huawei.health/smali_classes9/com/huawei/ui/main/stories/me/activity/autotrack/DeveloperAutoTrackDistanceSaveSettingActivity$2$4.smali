.class Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 264
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->m(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cbz;->a(I)V

    .line 265
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->o(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cbz;->e(I)V

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->l(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Lo/cbz;->d(F)V

    .line 267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cbz;->e(Landroid/content/Context;)V

    .line 268
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v1

    invoke-virtual {v1}, Lo/cbz;->c()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->e(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;Z)V

    .line 269
    const-string v0, "Track_DeveloperAutoTrackDistanceSaveSettingActivity"

    const/16 v1, 0x9

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mAutoTrackConfigChange "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "startDelay "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v2

    invoke-virtual {v2}, Lo/cbz;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, " stopDelay "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    .line 270
    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v2

    invoke-virtual {v2}, Lo/cbz;->e()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, " state "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v2

    invoke-virtual {v2}, Lo/cbz;->c()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const-string v2, " minSave Distance "

    const/4 v3, 0x7

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2$4;->e:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;

    iget-object v2, v2, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity$2;->c:Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;

    .line 271
    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;->k(Lcom/huawei/ui/main/stories/me/activity/autotrack/DeveloperAutoTrackDistanceSaveSettingActivity;)Lo/cbz;

    move-result-object v2

    invoke-virtual {v2}, Lo/cbz;->h()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/16 v3, 0x8

    aput-object v2, v1, v3

    .line 269
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    return-void
.end method
