.class Lcom/huawei/pluginachievement/ui/report/ReportFragment$6;
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
.field final synthetic e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V
    .locals 0

    .line 1156
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$6;->e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 1159
    const-string v0, "PLGACHIEVE_ReportFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose open UserInfoActivity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1160
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v4

    .line 1161
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1162
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1163
    const-string v0, "type"

    const-string v1, "2"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1164
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$6;->e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->b(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dae;->ai:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v4, v0, v1, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1165
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$6;->e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->h(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V

    .line 1166
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportFragment$6;->e:Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->f(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 1167
    return-void
.end method
