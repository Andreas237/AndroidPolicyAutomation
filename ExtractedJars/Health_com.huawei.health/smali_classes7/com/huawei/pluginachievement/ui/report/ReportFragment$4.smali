.class Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportFragment;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V
    .locals 0

    .line 1067
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;->b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1070
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;->b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1071
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;->b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d(Z)V

    .line 1072
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;->b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->e(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;->b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->c(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 1073
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;->b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    move-result-object v0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d:Lo/dzg;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;->b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->e(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$4;->b:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->c(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)I

    move-result v2

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lo/dzg;->setCurrentItem(I)V

    .line 1076
    :cond_0
    return-void
.end method
