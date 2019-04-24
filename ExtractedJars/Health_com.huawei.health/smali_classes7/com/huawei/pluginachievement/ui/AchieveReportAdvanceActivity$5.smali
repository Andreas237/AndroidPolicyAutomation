.class Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V
    .locals 0

    .line 259
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 11

    .line 261
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 262
    return-void

    .line 264
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;J)J

    .line 265
    const-wide/16 v6, 0x0

    .line 266
    const-wide/16 v8, 0x0

    .line 267
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v0

    invoke-static {v0}, Lo/dzr;->a(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 269
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dyx;

    .line 270
    invoke-virtual {v10}, Lo/dyx;->e()J

    move-result-wide v6

    .line 271
    invoke-virtual {v10}, Lo/dyx;->a()J

    move-result-wide v8

    .line 272
    goto :goto_0

    .line 273
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v0

    invoke-static {v0}, Lo/dzr;->d(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 274
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 275
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->i(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dyv;

    .line 276
    invoke-virtual {v10}, Lo/dyv;->e()J

    move-result-wide v6

    .line 277
    invoke-virtual {v10}, Lo/dyv;->d()J

    move-result-wide v8

    .line 280
    :cond_2
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-nez v0, :cond_3

    .line 281
    const-wide/16 v0, 0x1

    add-long v6, v8, v0

    .line 283
    :cond_3
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v10

    .line 284
    const/4 v0, 0x0

    if-eq v0, v10, :cond_4

    .line 285
    move-object v0, v10

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/content/Context;

    move-result-object v1

    move-wide v2, v8

    move-wide v4, v6

    invoke-interface/range {v0 .. v5}, Lo/dti;->a(Landroid/content/Context;JJ)V

    goto :goto_1

    .line 287
    :cond_4
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "PluginAchieve.getInstance(mContext).getAdapter() is null"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    :goto_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$5;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;I)V

    .line 291
    return-void
.end method
