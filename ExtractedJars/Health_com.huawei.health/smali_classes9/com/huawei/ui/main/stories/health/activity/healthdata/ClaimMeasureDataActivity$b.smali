.class Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;
.super Lo/aju;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/aju<Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V
    .locals 0

    .line 161
    invoke-direct {p0, p1}, Lo/aju;-><init>(Ljava/lang/Object;)V

    .line 162
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Landroid/os/Message;)V
    .locals 5

    .line 166
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 167
    :cond_0
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ClaimMeasureDataActivity is Destroyed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-void

    .line 170
    :cond_1
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 172
    :pswitch_0
    invoke-virtual {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c()V

    .line 173
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 174
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/fcg;

    move-result-object v0

    invoke-virtual {v0}, Lo/fcg;->e()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Ljava/util/List;)Ljava/util/List;

    .line 175
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/fcg;

    move-result-object v0

    invoke-virtual {v0}, Lo/fcg;->notifyDataSetChanged()V

    .line 176
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_claim_data_add_data:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->b(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1, v0, v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 177
    invoke-static {p1, v4}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 178
    goto :goto_1

    .line 179
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$string;->IDS_update_server_bussy:I

    invoke-static {p1, v0}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 181
    goto :goto_1

    .line 183
    :pswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 184
    goto :goto_1

    .line 186
    :pswitch_2
    sget-object v0, Lo/ahw;->e:Lo/ahw;

    invoke-virtual {v0}, Lo/ahw;->b()V

    .line 187
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/fcg;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 188
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)Lo/fcg;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fcg;->d(I)V

    .line 190
    :cond_3
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 191
    goto :goto_1

    .line 193
    :pswitch_3
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->e(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 194
    goto :goto_1

    .line 196
    :pswitch_4
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v0, v0, Lo/acu;

    if-eqz v0, :cond_4

    .line 197
    iget-object v0, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lo/acu;

    invoke-static {p1, v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->d(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Lo/acu;)V

    goto :goto_1

    .line 200
    :pswitch_5
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->f(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 201
    goto :goto_1

    .line 203
    :pswitch_6
    invoke-static {p1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;->i(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;)V

    .line 204
    goto :goto_1

    .line 206
    :goto_0
    const-string v0, "PluginDevice_ClaimMeasureDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "other"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    :cond_4
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public synthetic handleMessage(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 158
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity$b;->c(Lcom/huawei/ui/main/stories/health/activity/healthdata/ClaimMeasureDataActivity;Landroid/os/Message;)V

    return-void
.end method
