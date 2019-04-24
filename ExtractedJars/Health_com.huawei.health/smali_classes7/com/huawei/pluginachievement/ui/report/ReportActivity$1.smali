.class Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportFragment;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic e:Lcom/huawei/pluginachievement/ui/report/ReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;J)V
    .locals 0

    .line 333
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->e:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    iput-wide p2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 336
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->e:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->e:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v1

    iget-wide v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->b:J

    iget-object v4, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->e:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v4}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)I

    move-result v4

    iget-object v5, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->e:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v5}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->i(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Z

    move-result v5

    invoke-virtual {v1, v2, v3, v4, v5}, Lo/dwo;->b(JIZ)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Ljava/util/Map;)Ljava/util/Map;

    .line 337
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->e:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 338
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$1;->e:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 340
    :cond_0
    return-void
.end method
