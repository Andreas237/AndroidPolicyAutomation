.class public abstract Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;
.super Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "BusBaseActivity"

.field private static final T_FDW_LINGNANTONG_NOTICE:Ljava/lang/String; = "wt_fdw_lingnt"

.field private static final T_HG_BEIJING_MOT_NOTICE:Ljava/lang/String; = "wt_hg_bj_mot"


# instance fields
.field public cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

.field public cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

.field protected isVisible:Z

.field protected progressDialog:Lo/yw;

.field public progressDialog21:Lo/egn;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public dismissProgress(Lo/egn;)V
    .locals 0

    .line 163
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->destroyLoadingDialog()V

    .line 164
    return-void
.end method

.method protected dismissProgress(Lo/yw;)V
    .locals 1

    .line 125
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    const-string v0, "dismissProgress, activity is finishing"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 128
    return-void

    .line 131
    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Lo/yw;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    invoke-interface {p1}, Lo/yw;->dismiss()V

    .line 135
    :cond_1
    return-void
.end method

.method protected getCommonErrorMessage(I)Ljava/lang/String;
    .locals 1

    .line 240
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 245
    :sswitch_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_no_network_connection:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 248
    :sswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_nfc_not_open:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 252
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x2 -> :sswitch_0
        0xb -> :sswitch_0
        0xc -> :sswitch_1
    .end sparse-switch
.end method

.method protected getNoticeIssueId(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 295
    const-string v0, "t_fdw_lingnantong"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 296
    const-string v0, "wt_fdw_lingnt"

    return-object v0

    .line 297
    :cond_0
    const-string v0, "t_hg_beijing_mot"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 298
    const-string v0, "wt_hg_bj_mot"

    return-object v0

    .line 300
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "w"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected handleCommonErrorCode(I)Z
    .locals 4

    .line 195
    const-string v0, "BusBaseActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleCommonErrorCode  errorCode : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    packed-switch p1, :pswitch_data_0

    goto/16 :goto_0

    .line 199
    :pswitch_0
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_no_network_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 200
    const/4 v0, 0x1

    return v0

    .line 202
    :pswitch_1
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bindcard_error_connection_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 203
    const/4 v0, 0x1

    return v0

    .line 205
    :pswitch_2
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_read_card_failed:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 206
    const/4 v0, 0x1

    return v0

    .line 208
    :pswitch_3
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_disabled:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 209
    const/4 v0, 0x1

    return v0

    .line 211
    :pswitch_4
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_in_blacklist:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 212
    const/4 v0, 0x1

    return v0

    .line 214
    :pswitch_5
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_balance_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 215
    const/4 v0, 0x1

    return v0

    .line 217
    :pswitch_6
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_balance_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 218
    const/4 v0, 0x1

    return v0

    .line 220
    :pswitch_7
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_date_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 221
    const/4 v0, 0x1

    return v0

    .line 223
    :pswitch_8
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_after_expire_date_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 224
    const/4 v0, 0x1

    return v0

    .line 226
    :pswitch_9
    sget v0, Lcom/huawei/wallet/R$string;->nfc_bus_offline_card_date_error:I

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showToast(I)V

    .line 227
    const/4 v0, 0x1

    return v0

    .line 231
    :goto_0
    :pswitch_a
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_1
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method protected init()V
    .locals 2

    .line 91
    invoke-static {p0}, Lo/yk;->c(Landroid/content/Context;)Lo/yw;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->progressDialog:Lo/yw;

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->progressDialog:Lo/yw;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/yw;->setCanceledOnTouchOutside(Z)V

    .line 94
    new-instance v0, Lo/egn;

    sget v1, Lcom/huawei/wallet/R$style;->app_update_dialogActivity:I

    invoke-direct {v0, p0, v1}, Lo/egn;-><init>(Landroid/content/Context;I)V

    invoke-static {p0}, Lo/egn;->a(Landroid/content/Context;)Lo/egn;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->progressDialog21:Lo/egn;

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->progressDialog21:Lo/egn;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egn;->setCanceledOnTouchOutside(Z)V

    .line 96
    return-void
.end method

.method protected jump2ResultActivity(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZZ)V
    .locals 3

    .line 257
    new-instance v1, Landroid/content/Intent;

    const-class v0, Lcom/huawei/nfc/carrera/ui/bus/exception/ShowBindBusResultActivity;

    invoke-direct {v1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 258
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 259
    const-string v0, "fail_desc"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    const-string v0, "fail_reason"

    invoke-virtual {v2, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    const-string v0, "opr_type"

    invoke-virtual {v2, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 262
    const-string v0, "issuerId"

    invoke-virtual {v2, v0, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    const-string v0, "card_aid"

    invoke-virtual {v2, v0, p5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    const-string v0, "key_enterance"

    invoke-virtual {v2, v0, p6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 265
    const-string v0, "need_retry"

    invoke-virtual {v2, v0, p7}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 266
    const-string v0, "open_card"

    invoke-virtual {v2, v0, p8}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 267
    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 268
    invoke-virtual {p0, v1}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->startActivity(Landroid/content/Intent;)V

    .line 269
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 271
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->setResult(I)V

    .line 272
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->finish()V

    .line 274
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 79
    invoke-super {p0, p1}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 80
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/CardOperateLogic;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->cardOperateLogicManager:Lcom/huawei/nfc/carrera/logic/CardOperateLogicApi;

    .line 81
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/LogicApiFactory;->createCardManager(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->cardInfoManager:Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    .line 82
    return-void
.end method

.method public onPause()V
    .locals 1

    .line 108
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onPause()V

    .line 109
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->isVisible:Z

    .line 110
    return-void
.end method

.method public onResume()V
    .locals 1

    .line 101
    invoke-super {p0}, Lcom/huawei/nfc/carrera/ui/NFCBaseActivity;->onResume()V

    .line 102
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->isVisible:Z

    .line 103
    return-void
.end method

.method protected openCardLogUpload(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 284
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 285
    return-void
.end method

.method protected setCardImageSize(Landroid/widget/ImageView;)V
    .locals 10

    .line 174
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 175
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 176
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/wallet/R$dimen;->bus_card_image_margin_left_or_right:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    mul-int/lit8 v6, v0, 0x2

    .line 177
    sub-int v7, v5, v6

    .line 178
    int-to-double v0, v7

    const-wide v2, 0x3ff999999999999aL    # 1.6

    div-double/2addr v0, v2

    double-to-int v8, v0

    .line 180
    invoke-virtual {p1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    .line 181
    iput v7, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 182
    iput v8, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 183
    invoke-virtual {p1, v9}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 184
    return-void
.end method

.method public showProgress(Lo/egn;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0

    .line 147
    invoke-virtual {p0, p2, p3, p4}, Lcom/huawei/nfc/carrera/ui/bus/BusBaseActivity;->showLoadingDialog(Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 148
    return-void
.end method

.method protected showProgress(Lo/yw;Ljava/lang/String;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 1

    .line 114
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/yw;->isShowing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 116
    invoke-interface {p1, p2}, Lo/yw;->a(Ljava/lang/CharSequence;)V

    .line 117
    invoke-interface {p1, p3}, Lo/yw;->setCancelable(Z)V

    .line 118
    invoke-interface {p1, p4}, Lo/yw;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 119
    invoke-interface {p1}, Lo/yw;->show()V

    .line 121
    :cond_0
    return-void
.end method
