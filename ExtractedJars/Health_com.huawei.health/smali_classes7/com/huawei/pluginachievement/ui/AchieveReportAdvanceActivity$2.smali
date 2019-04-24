.class Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;
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

    .line 133
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 136
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 137
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 139
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)V

    .line 140
    goto :goto_0

    .line 142
    :pswitch_1
    const-string v0, "PLGACHIEVE_AchieveReportAdvanceActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mMotionCount is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;I)V

    .line 144
    goto :goto_0

    .line 146
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity$2;->b:Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveReportAdvanceActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dzr;->b(Landroid/content/Context;)V

    .line 147
    .line 151
    :goto_0
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
