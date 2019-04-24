.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 9

    .line 139
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 140
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment mProHandler handleMessage:null == msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 142
    :cond_0
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 143
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 145
    :pswitch_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment REFRESH"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v6

    .line 147
    if-eqz v6, :cond_4

    .line 148
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0, v6}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$002(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Lo/afj;)Lo/afj;

    .line 149
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 150
    iget-object v0, v6, Lo/afj;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 151
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "productInfo.descriptions.size()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    return-void

    .line 155
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v1, v6, Lo/afj;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move-object v2, v7

    iget-object v3, v6, Lo/afj;->b:Ljava/lang/String;

    move-object v4, v6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;ILjava/util/ArrayList;Ljava/lang/String;Lo/afj;Z)V

    .line 158
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 159
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Landroid/widget/TextView;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;ILandroid/widget/TextView;)V

    .line 161
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    .line 162
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->viewPager:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setVisibility(I)V

    .line 163
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/ags;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/ags;->b(Ljava/util/ArrayList;)V

    .line 164
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/ags;

    move-result-object v0

    invoke-virtual {v0}, Lo/ags;->notifyDataSetChanged()V

    .line 165
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    .line 166
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 168
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v6}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/lang/String;Lo/afj;)V

    .line 169
    goto/16 :goto_0

    .line 172
    :pswitch_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment FAILED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 176
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/afj;

    move-result-object v2

    invoke-virtual {v2}, Lo/afj;->d()Ljava/util/ArrayList;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    invoke-virtual {v2}, Lo/afj$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 177
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 180
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 183
    :cond_3
    goto :goto_0

    .line 187
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    .line 188
    goto :goto_0

    .line 190
    :pswitch_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " PRO_TO_REFRESH_GROUP startDialog "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 192
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V

    goto :goto_0

    .line 196
    :pswitch_4
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ahd;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 197
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/lang/String;)V

    .line 204
    :cond_4
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
