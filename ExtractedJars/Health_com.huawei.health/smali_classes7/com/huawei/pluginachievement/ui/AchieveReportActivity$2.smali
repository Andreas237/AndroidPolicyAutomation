.class Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 240
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwr;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 241
    return-void

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwr;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v2}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v1

    check-cast v1, Lo/dwj;

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;Lo/dwj;)Lo/dwj;

    .line 245
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwr;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x2

    invoke-virtual {v1, v3, v2}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v1

    check-cast v1, Lo/dwm;

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;Lo/dwm;)Lo/dwm;

    .line 247
    new-instance v0, Lo/dwk;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwm;

    move-result-object v4

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Lo/dwj;

    move-result-object v5

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/dwk;-><init>(ILo/dwh;Lo/dwd;Lo/dwm;Lo/dwj;)V

    move-object v6, v0

    .line 248
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v6}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 249
    return-void
.end method
