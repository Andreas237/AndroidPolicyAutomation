.class Lcom/huawei/pluginachievement/ui/report/ReportFragment$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportFragment;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/report/ReportFragment;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V
    .locals 0

    .line 1169
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$9;->c:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1172
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$9;->c:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->f(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1173
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$9;->c:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->f(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 1174
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$9;->c:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->b(Lcom/huawei/pluginachievement/ui/report/ReportFragment;Lo/egy;)Lo/egy;

    .line 1176
    :cond_0
    return-void
.end method
