.class Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

.field final synthetic d:I

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;II)V
    .locals 0

    .line 831
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    iput p2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->e:I

    iput p3, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .annotation build Landroid/annotation/TargetApi;
        value = 0x5
    .end annotation

    .line 834
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    iget v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->e:I

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;I)I

    move-result v2

    .line 836
    iget v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->d:I

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwm;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzr;->e(ILo/dwm;)Ljava/lang/String;

    move-result-object v3

    .line 837
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 838
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.AchieveReportAdvanceActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 839
    const-string v0, "dialogType"

    invoke-virtual {v4, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 840
    const-string v0, "value"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 841
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$1;->c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 842
    return-void
.end method
