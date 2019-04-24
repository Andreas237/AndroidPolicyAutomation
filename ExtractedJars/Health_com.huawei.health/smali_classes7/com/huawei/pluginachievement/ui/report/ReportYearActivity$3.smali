.class Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$3;->c:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 133
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$3;->c:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->a(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Lo/dwr;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 134
    return-void

    .line 136
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$3;->c:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->a(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Lo/dwr;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dwj;

    .line 137
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 138
    return-void

    .line 140
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$3;->c:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$3;->c:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 141
    return-void
.end method
