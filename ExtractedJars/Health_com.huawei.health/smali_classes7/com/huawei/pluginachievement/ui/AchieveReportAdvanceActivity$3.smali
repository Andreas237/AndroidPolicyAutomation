.class Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$3;
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
        "Ljava/lang/Object;Ljava/util/Comparator<Lo/dyv;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V
    .locals 0

    .line 354
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$3;->d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lo/dyv;Lo/dyv;)I
    .locals 4

    .line 356
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$3;->d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 357
    invoke-virtual {p1}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-virtual {p2}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dzr;->e(DD)I

    move-result v0

    return v0

    .line 359
    :cond_0
    invoke-virtual {p2}, Lo/dyv;->c()D

    move-result-wide v0

    invoke-virtual {p1}, Lo/dyv;->c()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lo/dzr;->e(DD)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 354
    move-object v0, p1

    check-cast v0, Lo/dyv;

    move-object v1, p2

    check-cast v1, Lo/dyv;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$3;->b(Lo/dyv;Lo/dyv;)I

    move-result v0

    return v0
.end method
