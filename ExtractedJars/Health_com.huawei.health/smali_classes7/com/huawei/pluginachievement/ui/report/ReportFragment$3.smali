.class Lcom/huawei/pluginachievement/ui/report/ReportFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/report/ReportFragment;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V
    .locals 0

    .line 997
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$3;->a:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1000
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$3;->a:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->b(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$3;->a:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->b(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dth;->k(Landroid/content/Context;)V

    .line 1001
    return-void
.end method
