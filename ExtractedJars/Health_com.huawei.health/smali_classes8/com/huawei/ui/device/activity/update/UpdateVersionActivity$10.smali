.class Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)V
    .locals 0

    .line 1042
    iput-object p1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1046
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start showExitUpdateDialog, user click Negative button! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1047
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1048
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;

    move-result-object v0

    iget v0, v0, Lo/enu;->c:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 1049
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;

    move-result-object v0

    invoke-virtual {v0}, Lo/enu;->o()V

    .line 1050
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;

    const/4 v1, 0x0

    iput v1, v0, Lo/enu;->c:I

    .line 1051
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start showExitUpdateDialog,cancle downloading  file!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1054
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;

    move-result-object v0

    iget v0, v0, Lo/eob;->o:I

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 1055
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->i()V

    .line 1056
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;

    const/4 v1, 0x0

    iput v1, v0, Lo/eob;->o:I

    .line 1057
    const-string v0, "UpdateVersionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start showExitUpdateDialog,cancle downloading  file!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1061
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->p(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1062
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->m(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1063
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/enu;

    move-result-object v1

    iget-object v1, v1, Lo/enu;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Ljava/lang/String;)V

    goto :goto_1

    .line 1065
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->n(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/eob;

    move-result-object v1

    iget-object v1, v1, Lo/eob;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->d(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Ljava/lang/String;)V

    .line 1068
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->k(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 1069
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->e(Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;Lo/egv;)Lo/egv;

    .line 1070
    iget-object v0, p0, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity$10;->c:Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/update/UpdateVersionActivity;->finish()V

    .line 1071
    return-void
.end method
