.class Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$4;->d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 240
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    const-string v1, "onClick share information"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$4;->d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$4;->d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$4;->d:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    .line 246
    :goto_0
    return-void
.end method
