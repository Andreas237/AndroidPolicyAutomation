.class Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$1;->c:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 106
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$1;->c:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;

    const-string v1, "2"

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->d(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;Ljava/lang/String;)V

    .line 107
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 108
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$1;->c:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->e(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.report.ReportYearActivity"

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 109
    const/high16 v0, 0x10800000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 110
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity$1;->c:Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;->e(Lcom/huawei/pluginachievement/ui/report/WeekAndMonthActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 111
    return-void
.end method
