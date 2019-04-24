.class Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/dyx;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V
    .locals 0

    .line 332
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$1;->d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 332
    move-object v0, p1

    check-cast v0, Lo/dyx;

    move-object v1, p2

    check-cast v1, Lo/dyx;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$1;->e(Lo/dyx;Lo/dyx;)I

    move-result v0

    return v0
.end method

.method public e(Lo/dyx;Lo/dyx;)I
    .locals 4

    .line 334
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$1;->d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 335
    invoke-virtual {p2}, Lo/dyx;->c()J

    move-result-wide v0

    invoke-virtual {p1}, Lo/dyx;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 336
    const/4 v0, -0x1

    return v0

    .line 337
    :cond_0
    invoke-virtual {p2}, Lo/dyx;->c()J

    move-result-wide v0

    invoke-virtual {p1}, Lo/dyx;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 338
    const/4 v0, 0x0

    return v0

    .line 340
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 343
    :cond_2
    invoke-virtual {p1}, Lo/dyx;->c()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/dyx;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 344
    const/4 v0, -0x1

    return v0

    .line 345
    :cond_3
    invoke-virtual {p1}, Lo/dyx;->c()J

    move-result-wide v0

    invoke-virtual {p2}, Lo/dyx;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 346
    const/4 v0, 0x0

    return v0

    .line 348
    :cond_4
    const/4 v0, 0x1

    return v0
.end method
