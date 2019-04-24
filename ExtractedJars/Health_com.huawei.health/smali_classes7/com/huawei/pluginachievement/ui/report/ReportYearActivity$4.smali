.class Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$4;->d:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 110
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 111
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 113
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lo/dwj;

    .line 114
    invoke-virtual {v3}, Lo/dwj;->a()J

    move-result-wide v4

    .line 115
    const-string v0, "PLGACHIEVE_ReportYearActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "startDate "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const/16 v0, 0x7e2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dxk;->d(IZ)J

    move-result-wide v6

    .line 117
    const-string v0, "PLGACHIEVE_ReportYearActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "nowDate "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    cmp-long v0, v4, v6

    if-gez v0, :cond_0

    .line 119
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$4;->d:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity$4;->d:Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;->c(Lcom/huawei/pluginachievement/ui/report/ReportYearActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 123
    .line 128
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
    .end sparse-switch
.end method
