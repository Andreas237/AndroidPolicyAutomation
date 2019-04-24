.class Lo/agm$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/agm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lo/agm;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lo/agm;)V
    .locals 0

    .line 94
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 95
    return-void
.end method


# virtual methods
.method protected d(Lo/agm;Landroid/os/Message;)V
    .locals 4

    .line 99
    iget v0, p2, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 102
    :pswitch_0
    invoke-static {p1}, Lo/agm;->b(Lo/agm;)V

    .line 103
    goto/16 :goto_0

    .line 106
    :pswitch_1
    invoke-static {p1}, Lo/agm;->a(Lo/agm;)V

    .line 107
    goto/16 :goto_0

    .line 110
    :pswitch_2
    invoke-static {p1}, Lo/agm;->c(Lo/agm;)Lo/egw;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lo/agm;->c(Lo/agm;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 111
    invoke-static {p1}, Lo/agm;->d(Lo/agm;)Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_weight_device_clear_success:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 112
    invoke-static {p1}, Lo/agm;->c(Lo/agm;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 114
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/agm;->e(Lo/agm;Z)V

    .line 115
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clear user data success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    goto :goto_0

    .line 119
    :pswitch_3
    invoke-static {p1}, Lo/agm;->c(Lo/agm;)Lo/egw;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lo/agm;->c(Lo/agm;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    invoke-static {p1}, Lo/agm;->d(Lo/agm;)Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_weight_device_clear_fail:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 121
    invoke-static {p1}, Lo/agm;->c(Lo/agm;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 123
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clear user data fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    goto :goto_0

    .line 126
    :pswitch_4
    invoke-static {p1}, Lo/agm;->e(Lo/agm;)I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_2

    invoke-static {p1}, Lo/agm;->f(Lo/agm;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 128
    :cond_2
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/agm;->d(Lo/agm;Z)V

    goto :goto_0

    .line 130
    :cond_3
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bluetooth on open..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    .line 136
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method protected synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 91
    move-object v0, p1

    check-cast v0, Lo/agm;

    invoke-virtual {p0, v0, p2}, Lo/agm$d;->d(Lo/agm;Landroid/os/Message;)V

    return-void
.end method
