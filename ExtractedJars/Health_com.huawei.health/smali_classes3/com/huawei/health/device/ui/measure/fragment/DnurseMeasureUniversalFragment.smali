.class public Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;
.source "SourceFile"


# static fields
.field public static final MY_REQUSET_PERMISSION_RECORD_AUDIO:I = 0x0


# instance fields
.field private isMeseare:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->isMeseare:Z

    return-void
.end method

.method private changeIsMeasure(I)V
    .locals 1

    .line 282
    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    .line 283
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->isMeseare:Z

    .line 285
    :cond_0
    return-void
.end method

.method private showDeviceMeasuringProgressView()V
    .locals 5

    .line 288
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->isMeseare:Z

    if-nez v0, :cond_0

    .line 289
    new-instance v3, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;

    invoke-direct {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;-><init>()V

    .line 290
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 291
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    const-string v0, "content"

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_measuring:I

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 293
    invoke-virtual {v3, v4}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 294
    invoke-virtual {p0, v3}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 295
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->isMeseare:Z

    .line 297
    :cond_0
    return-void
.end method

.method private updateGuideImg(I)V
    .locals 6

    .line 154
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_guide_img_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    .line 155
    const/4 v5, 0x0

    .line 156
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 158
    :pswitch_0
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_device_dnurse_glucose_measure_guide_insert_device:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 159
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/AnimationDrawable;

    .line 160
    invoke-virtual {v5}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 161
    goto :goto_1

    .line 165
    :pswitch_1
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_device_dnurse_glucose_measure_guide_insert_testpaper:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 166
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/AnimationDrawable;

    .line 167
    invoke-virtual {v5}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 168
    goto :goto_1

    .line 170
    :pswitch_2
    sget v0, Lcom/huawei/plugindevice/R$drawable;->hw_device_dnurse_glucose_measure_guide_drop_blood:I

    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 171
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/graphics/drawable/AnimationDrawable;

    .line 172
    invoke-virtual {v5}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 173
    goto :goto_1

    .line 176
    :pswitch_3
    goto :goto_1

    .line 188
    :pswitch_4
    goto :goto_1

    .line 190
    :goto_0
    :pswitch_5
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment updateGuideImg, unsupport type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
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

    .line 196
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_guide_tv_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 198
    invoke-direct {p0, v2, p1}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->updateGuideMsgCaseOne(Landroid/widget/TextView;I)V

    .line 200
    invoke-direct {p0, v2, p1}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->updateGuideMsgCaseTwo(Landroid/widget/TextView;I)V

    .line 202
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->changeIsMeasure(I)V

    .line 203
    return-void
.end method

.method private updateGuideMsgCaseOne(Landroid/widget/TextView;I)V
    .locals 4

    .line 243
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 247
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_not_insert_device_insert:I

    .line 248
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 247
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 249
    goto :goto_1

    .line 252
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_recognized_paper_insert:I

    .line 253
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 252
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    goto :goto_1

    .line 256
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_insert_old_paper_change:I

    .line 257
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 256
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    goto :goto_1

    .line 260
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_insert_paper_blood:I

    .line 261
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 260
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 262
    goto :goto_1

    .line 264
    :pswitch_4
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_voltage_low:I

    .line 265
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 264
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 266
    goto :goto_1

    .line 268
    :pswitch_5
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_temperature_low:I

    .line 269
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 268
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    goto :goto_1

    .line 272
    :pswitch_6
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_temperature_high:I

    .line 273
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 272
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    goto :goto_1

    .line 276
    :goto_0
    :pswitch_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment updateGuideMsg, unsupport type in CaseOne"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 279
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

    .line 206
    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 208
    :pswitch_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_measuring:I

    .line 209
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 208
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 210
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->showDeviceMeasuringProgressView()V

    .line 211
    goto :goto_1

    .line 213
    :pswitch_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_device_sleep:I

    .line 214
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 213
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 215
    goto :goto_1

    .line 217
    :pswitch_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_cannot_broadcast:I

    .line 218
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 217
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    goto :goto_1

    .line 221
    :pswitch_3
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_cannot_record:I

    .line 222
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 221
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    goto :goto_1

    .line 225
    :pswitch_4
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_device_misstated:I

    .line 226
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 225
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 227
    goto :goto_1

    .line 229
    :pswitch_5
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_time_out:I

    .line 230
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    goto :goto_1

    .line 233
    :pswitch_6
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_sugar_readyfor_measure_msg_err_recognize:I

    .line 234
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 233
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 235
    goto :goto_1

    .line 237
    :goto_0
    :pswitch_7
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment updateGuideMsg, unsupport type in CaseTwo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
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

    .line 39
    new-instance v2, Lo/aha;

    invoke-direct {v2}, Lo/aha;-><init>()V

    .line 40
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/aha;->b(I)V

    .line 41
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/aha;->d(Z)V

    .line 42
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_device_name_dnurse:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->setTitle(Ljava/lang/String;)V

    .line 43
    return-object v2
.end method

.method protected handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V
    .locals 7

    .line 83
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

    .line 84
    if-eqz p2, :cond_2

    .line 85
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

    .line 87
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "bloodSugarMeasureType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p2, v0, v1}, Lo/afz;->e(J)V

    .line 88
    const-string v0, "dnurse"

    invoke-virtual {p2, v0}, Lo/afz;->d(Ljava/lang/String;)V

    .line 89
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureFragment bloodSugarMeasureType is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

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

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->mKind:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->a(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v5

    .line 93
    if-nez v5, :cond_1

    .line 94
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment fragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void

    .line 98
    :cond_1
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 99
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    const-string v0, "HealthData"

    invoke-virtual {v6, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 102
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 103
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 105
    :cond_2
    return-void
.end method

.method protected handleDataChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;Z)V
    .locals 7

    .line 109
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

    .line 110
    if-eqz p2, :cond_2

    .line 111
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

    .line 115
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureFragment bloodSugarMeasureType is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->mKind:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->a(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v5

    .line 119
    if-nez v5, :cond_1

    .line 120
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment fragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    return-void

    .line 124
    :cond_1
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 125
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v0, "HealthDataUniversal"

    move-object v1, p2

    check-cast v1, Landroid/os/Parcelable;

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 129
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 130
    invoke-virtual {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 132
    :cond_2
    return-void
.end method

.method protected handleFailedEventInUiThread(Lo/acl;I)V
    .locals 4

    .line 150
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

    .line 151
    return-void
.end method

.method protected handleStatusChangedInUiThread(Lo/acl;I)V
    .locals 4

    .line 136
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

    .line 137
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->updateGuideImg(I)V

    .line 138
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->updateGuideMsg(I)V

    .line 139
    return-void
.end method

.method protected handleStatusChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 4

    .line 143
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DnurseMeasureFragment handleStatusChangedInUiThreadUniversal, status= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->updateGuideImg(I)V

    .line 145
    invoke-direct {p0, p2}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->updateGuideMsg(I)V

    .line 146
    return-void
.end method

.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 7

    .line 60
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DnurseMeasureFragment onActivityCreated"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v4

    .line 63
    if-nez v4, :cond_0

    .line 64
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->startMeasure()V

    goto :goto_0

    .line 67
    :cond_0
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agc;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v5

    .line 68
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agc;->d(Ljava/lang/String;)Lo/afz;

    move-result-object v6

    .line 69
    const/4 v0, 0x1

    invoke-virtual {p0, v5, v6, v0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V

    .line 72
    :goto_0
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 74
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 48
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->onCreate(Landroid/os/Bundle;)V

    .line 49
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->mProductId:Ljava/lang/String;

    .line 51
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "android.permission.RECORD_AUDIO"

    invoke-static {v0, v1}, Landroid/support/v4/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DnurseMeasureUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "android.permission.RECORD_AUDIO"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 56
    :cond_0
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 78
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->onStop()V

    .line 79
    return-void
.end method
