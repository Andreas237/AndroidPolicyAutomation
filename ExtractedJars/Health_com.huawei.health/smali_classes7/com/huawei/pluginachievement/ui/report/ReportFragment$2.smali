.class Lcom/huawei/pluginachievement/ui/report/ReportFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportFragment;->b(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V
    .locals 0

    .line 1112
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$2;->e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 1115
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v3

    .line 1116
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1117
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1118
    const-string v0, "type"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1119
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$2;->e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->b(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dae;->ai:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v3, v0, v1, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1120
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$2;->e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->i(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V

    .line 1121
    return-void
.end method
