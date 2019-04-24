.class Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)V
    .locals 0

    .line 298
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 299
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;Landroid/os/Message;)V
    .locals 4

    .line 303
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 306
    :pswitch_0
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lcom/huawei/up/model/UserInfomation;

    if-eqz v0, :cond_0

    .line 307
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/up/model/UserInfomation;

    invoke-static {p1, v0}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->a(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;Lcom/huawei/up/model/UserInfomation;)V

    goto :goto_0

    .line 311
    :pswitch_1
    const-string v0, "PLGACHIEVE_AchieveReportDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_GET_USERINFO_FAIL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    goto :goto_0

    .line 314
    :pswitch_2
    invoke-static {p1}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;->c(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;)V

    .line 315
    .line 319
    :cond_0
    :goto_0
    :pswitch_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 296
    move-object v0, p1

    check-cast v0, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog$d;->b(Lcom/huawei/pluginachievement/ui/report/AchieveReportDialog;Landroid/os/Message;)V

    return-void
.end method
