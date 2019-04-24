.class Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a(Lcom/huawei/pluginachievement/ui/report/ReportFragment;JJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

.field final synthetic b:J

.field final synthetic e:J


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportActivity;JJ)V
    .locals 0

    .line 256
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    iput-wide p2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->b:J

    iput-wide p4, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 259
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 260
    const-string v0, "startTimestamp"

    iget-wide v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->b:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    const-string v0, "endTimeStamp"

    iget-wide v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->e:J

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    const-string v0, "dataSource"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->a(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)I

    move-result v0

    if-nez v0, :cond_0

    .line 264
    const-string v0, "recentType"

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 266
    :cond_0
    const-string v0, "recentType"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    :goto_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dwr;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Lo/dwr;

    move-result-object v1

    const/16 v2, 0x14

    invoke-virtual {v1, v2, v7}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportActivity;Ljava/util/List;)Ljava/util/List;

    .line 270
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 271
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lineDataShow_listData size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    const/4 v8, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_1

    .line 273
    const-string v0, "PLGACHIEVE_ReportActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "lineDataShow_listData value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->d(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/dvf;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 275
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->h(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 277
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->a:Lcom/huawei/pluginachievement/ui/report/ReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportActivity;->e(Lcom/huawei/pluginachievement/ui/report/ReportActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dxb;->a(Landroid/content/Context;)Lo/dxb;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->b:J

    const/4 v3, -0x1

    const/4 v4, 0x1

    invoke-static {v3, v1, v2, v4}, Lo/dzk;->c(IJI)J

    move-result-wide v1

    iget-wide v3, p0, Lcom/huawei/pluginachievement/ui/report/ReportActivity$4;->b:J

    .line 278
    const/4 v5, -0x1

    const/4 v6, 0x2

    invoke-static {v5, v3, v4, v6}, Lo/dzk;->c(IJI)J

    move-result-wide v3

    .line 277
    const/16 v5, 0xb

    const/4 v6, 0x0

    invoke-virtual/range {v0 .. v6}, Lo/dxb;->b(JJILo/duh;)V

    .line 280
    :cond_3
    return-void
.end method
