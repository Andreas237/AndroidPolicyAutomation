.class Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportFragment;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)V
    .locals 0

    .line 289
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 294
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 295
    const-string v0, "reportNo"

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    .line 296
    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 295
    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)I

    move-result v0

    if-nez v0, :cond_0

    .line 299
    const/4 v3, 0x4

    .line 300
    const/4 v4, 0x3

    goto :goto_0

    .line 302
    :cond_0
    const/4 v3, 0x3

    .line 303
    const/4 v4, 0x2

    .line 305
    :goto_0
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onShow(): |dataType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", contentType = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dwr;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 307
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->k(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->b(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->d()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 308
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dwr;

    move-result-object v1

    invoke-virtual {v1, v3, v5}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Lo/dvf;)Lo/dvf;

    goto :goto_1

    .line 310
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Lo/dvf;)Lo/dvf;

    .line 313
    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dvf;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 314
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_2

    .line 316
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Z)Z

    .line 317
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mReportDataFromDB is null ---else "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0, v4, v5}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 322
    :cond_3
    :goto_2
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onShow in thread --> mReportDataFromDB:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    .line 323
    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dvf;

    move-result-object v2

    if-nez v2, :cond_4

    const-string v2, "null"

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$3;->d:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->g(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dvf;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 322
    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 324
    return-void
.end method
