.class Lcom/huawei/pluginachievement/ui/AchieveReportActivity$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$5;->c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 162
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 163
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 165
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lo/dwk;

    .line 166
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$5;->c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;Lo/dwk;)V

    .line 167
    goto :goto_0

    .line 170
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportActivity$5;->c:Lcom/huawei/pluginachievement/ui/AchieveReportActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveReportActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->b(Landroid/content/Context;)V

    .line 171
    .line 175
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
