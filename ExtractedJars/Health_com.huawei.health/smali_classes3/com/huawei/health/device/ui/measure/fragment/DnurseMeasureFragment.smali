.class public Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;
.source "SourceFile"


# static fields
.field public static final MY_REQUSET_PERMISSION_RECORD_AUDIO:I = 0x0


# instance fields
.field private isMeseare:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->isMeseare:Z

    return-void
.end method

.method private changeIsMeasure(I)V
    .locals 1

    .line 252
    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    .line 253
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->isMeseare:Z

    .line 255
    :cond_0
    return-void
.end method

.method private showDeviceMeasuringProgressView()V
    .locals 5

    .line 258
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->isMeseare:Z

    if-nez v0, :cond_0

    .line 259
    new-instance v3, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;

    invoke-direct {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;-><init>()V

    .line 260
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 261
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    const-string v0, "content"

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_measuring:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 263
    invoke-virtual {v3, v4}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 264
    invoke-virtual {p0, v3}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 265
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->isMeseare:Z

    .line 267
    :cond_0
    return-void
.end method

.method private updateGuideImg(I)V
    .locals 6

    .line 124
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_guide_img_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 125
    const/4 v5, 0x0

    .line 126
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 128
    :pswitch_0
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_device_dnurse_glucose_measure_guide_insert_device:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 129
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/AnimationDrawable;

    .line 130
    invoke-virtual {v5}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 131
    goto :goto_1

    .line 135
    :pswitch_1
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_device_dnurse_glucose_measure_guide_insert_testpaper:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 136
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/AnimationDrawable;

    .line 137
    invoke-virtual {v5}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 138
    goto :goto_1

    .line 140
    :pswitch_2
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_device_dnurse_glucose_measure_guide_drop_blood:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 141
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/AnimationDrawable;

    .line 142
    invoke-virtual {v5}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 143
    goto :goto_1

    .line 146
    :pswitch_3
    goto :goto_1

    .line 158
    :pswitch_4
    goto :goto_1

    .line 160
    :goto_0
    :pswitch_5
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment updateGuideImg, unsupport type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method private updateGuideMsg(I)V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_guide_tv_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 168
    invoke-direct {p0, v2, p1}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->updateGuideMsgCaseOne(Landroid/widget/TextView;I)V

    .line 170
    invoke-direct {p0, v2, p1}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->updateGuideMsgCaseTwo(Landroid/widget/TextView;I)V

    .line 172
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->changeIsMeasure(I)V

    .line 173
    return-void
.end method

.method private updateGuideMsgCaseOne(Landroid/widget/TextView;I)V
    .locals 4

    .line 213
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 217
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_not_insert_device_insert:I

    .line 218
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 217
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    goto :goto_1

    .line 222
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_recognized_paper_insert:I

    .line 223
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 222
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 224
    goto :goto_1

    .line 226
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_insert_old_paper_change:I

    .line 227
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 226
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    goto :goto_1

    .line 230
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_insert_paper_blood:I

    .line 231
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 230
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 232
    goto :goto_1

    .line 234
    :pswitch_4
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_voltage_low:I

    .line 235
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 234
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 236
    goto :goto_1

    .line 238
    :pswitch_5
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_temperature_low:I

    .line 239
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 238
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    goto :goto_1

    .line 242
    :pswitch_6
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_temperature_high:I

    .line 243
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 242
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    goto :goto_1

    .line 246
    :goto_0
    :pswitch_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment updateGuideMsg, unsupport type in CaseOne"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 249
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private updateGuideMsgCaseTwo(Landroid/widget/TextView;I)V
    .locals 4

    .line 176
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 178
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_measuring:I

    .line 179
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 178
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->showDeviceMeasuringProgressView()V

    .line 181
    goto :goto_1

    .line 183
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_device_sleep:I

    .line 184
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 183
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 185
    goto :goto_1

    .line 187
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_cannot_broadcast:I

    .line 188
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 187
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    goto :goto_1

    .line 191
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_cannot_record:I

    .line 192
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 191
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 193
    goto :goto_1

    .line 195
    :pswitch_4
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_device_misstated:I

    .line 196
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 195
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 197
    goto :goto_1

    .line 199
    :pswitch_5
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_time_out:I

    .line 200
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 199
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    goto :goto_1

    .line 203
    :pswitch_6
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_recognize:I

    .line 204
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 203
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    goto :goto_1

    .line 207
    :goto_0
    :pswitch_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment updateGuideMsg, unsupport type in CaseTwo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_7
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method


# virtual methods
.method protected getMode()Lo/aha;
    .locals 3

    .line 36
    new-instance v2, Lo/aha;

    invoke-direct {v2}, Lo/aha;-><init>()V

    .line 37
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/aha;->b(I)V

    .line 38
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/aha;->d(Z)V

    .line 39
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_device_name_dnurse:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->setTitle(Ljava/lang/String;)V

    .line 40
    return-object v2
.end method

.method protected handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V
    .locals 7

    .line 80
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureFragment handleDataChangedInUiThread, (data != null) ? "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    if-eqz p2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    if-eqz p2, :cond_2

    .line 82
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureFragment data="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "bloodSugarMeasureType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p2, v0, v1}, Lo/afz;->e(J)V

    .line 85
    const-string v0, "dnurse"

    invoke-virtual {p2, v0}, Lo/afz;->d(Ljava/lang/String;)V

    .line 86
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureFragment bloodSugarMeasureType is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v3

    const-string v4, "bloodSugarMeasureType"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->a(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v5

    .line 90
    if-nez v5, :cond_1

    .line 91
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment fragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    return-void

    .line 95
    :cond_1
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 96
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string v0, "HealthData"

    invoke-virtual {v6, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 99
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 100
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 102
    :cond_2
    return-void
.end method

.method protected handleDataChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;Z)V
    .locals 0

    .line 105
    return-void
.end method

.method protected handleFailedEventInUiThread(Lo/acl;I)V
    .locals 4

    .line 120
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureFragment handleFailedEventInUiThread, code="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    return-void
.end method

.method protected handleStatusChangedInUiThread(Lo/acl;I)V
    .locals 4

    .line 109
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureFragment handleStatusChangedInUiThread, status= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 110
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->updateGuideImg(I)V

    .line 111
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->updateGuideMsg(I)V

    .line 112
    return-void
.end method

.method protected handleStatusChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 0

    .line 116
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 7

    .line 57
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment onActivityCreated"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v4

    .line 60
    if-nez v4, :cond_0

    .line 61
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->startMeasure()V

    goto :goto_0

    .line 64
    :cond_0
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agc;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v5

    .line 65
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agc;->d(Ljava/lang/String;)Lo/afz;

    move-result-object v6

    .line 66
    const/4 v0, 0x1

    invoke-virtual {p0, v5, v6, v0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V

    .line 69
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 71
    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    .line 271
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->popupFragment(Ljava/lang/Class;)V

    .line 272
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 45
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->onCreate(Landroid/os/Bundle;)V

    .line 46
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->mProductId:Ljava/lang/String;

    .line 48
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "android.permission.RECORD_AUDIO"

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.RECORD_AUDIO"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 53
    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 75
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->onStop()V

    .line 76
    return-void
.end method
