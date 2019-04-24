.class Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dyp$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V
    .locals 0

    .line 505
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$10;->e:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(I)V
    .locals 3

    .line 508
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$10;->e:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v0

    if-eq v0, p1, :cond_0

    .line 509
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "position="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$10;->e:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0, p1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;I)I

    .line 511
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$10;->e:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    .line 513
    :cond_0
    return-void
.end method
