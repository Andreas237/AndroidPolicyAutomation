.class Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V
    .locals 1

    .line 1137
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 1138
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e;->d:Ljava/lang/ref/WeakReference;

    .line 1139
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 8

    .line 1143
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1144
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e;->d:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    .line 1145
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "weakReference\u5df2\u88ab\u9500\u6bc1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1146
    return-void

    .line 1148
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;

    .line 1149
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1150
    :cond_1
    const-string v0, "Group_HealthCreateEventActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HealthCreateEventActivity\u5df2\u88ab\u9500\u6bc1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1151
    return-void

    .line 1153
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 1156
    :pswitch_0
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    .line 1157
    goto/16 :goto_0

    .line 1160
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->b(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;Ljava/lang/String;)V

    .line 1161
    goto/16 :goto_0

    .line 1164
    :pswitch_2
    new-instance v5, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {v5, v4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1165
    const-string v0, "group"

    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1166
    const-string v0, "activityId"

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1167
    invoke-virtual {v4, v5}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 1168
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    .line 1169
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->setResult(I)V

    .line 1170
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->finish()V

    .line 1171
    goto/16 :goto_0

    .line 1175
    :pswitch_3
    new-instance v6, Lo/egv$b;

    invoke-direct {v6, v4}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 1176
    sget v0, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_info_examine_fail:I

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/egv$b;->e(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_hwh_home_create_group_event_info_examine_fail_remind_new:I

    .line 1177
    invoke-virtual {v4, v1}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egv$b;->b(Ljava/lang/String;)Lo/egv$b;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->IDS_settings_button_ok:I

    new-instance v2, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e$4;

    invoke-direct {v2, p0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e$4;-><init>(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity$e;)V

    .line 1178
    invoke-virtual {v0, v1, v2}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 1184
    invoke-virtual {v6}, Lo/egv$b;->b()Lo/egv;

    move-result-object v5

    .line 1185
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/egv;->setCancelable(Z)V

    .line 1186
    invoke-virtual {v5}, Lo/egv;->show()V

    .line 1188
    goto :goto_0

    .line 1190
    :pswitch_4
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-static {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->d(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;I)V

    .line 1191
    goto :goto_0

    .line 1194
    :pswitch_5
    new-instance v7, Landroid/content/Intent;

    const-class v0, Lcom/huawei/health/sns/ui/group/HealthEventDetailActivity;

    invoke-direct {v7, v4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1195
    const-string v0, "group"

    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->n(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)Lcom/huawei/health/sns/model/group/Group;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1196
    const-string v0, "activityId"

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1197
    invoke-virtual {v4, v7}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->startActivity(Landroid/content/Intent;)V

    .line 1198
    invoke-static {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->l(Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;)V

    .line 1199
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->setResult(I)V

    .line 1200
    invoke-virtual {v4}, Lcom/huawei/health/sns/ui/group/HealthCreateEventActivity;->finish()V

    .line 1201
    .line 1206
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x58
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
