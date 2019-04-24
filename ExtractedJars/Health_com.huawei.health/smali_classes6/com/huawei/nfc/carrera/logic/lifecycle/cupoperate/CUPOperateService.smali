.class public Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPOperateResultCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;
.implements Lcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;


# static fields
.field static final SERVICE_ACTION_CUP_OPERATE:Ljava/lang/String; = "com.huawei.wallet.nfc.CARD_OPERATE_SERVICE"

.field static final SERVICE_ACTION_PERSONALIZED_RESULT:Ljava/lang/String; = "com.huawei.wallet.nfc.PERSONAL_RESULT_HANDLE_SERVICE"

.field static final SERVICE_INTENT_KEY_AID:Ljava/lang/String; = "aid"

.field static final SERVICE_INTENT_KEY_CPLC:Ljava/lang/String; = "cplc"

.field static final SERVICE_INTENT_KEY_EVENT:Ljava/lang/String; = "event"

.field static final SERVICE_INTENT_KEY_REFID:Ljava/lang/String; = "ref_id"

.field static final SERVICE_INTENT_KEY_REFIDS:Ljava/lang/String; = "ref_ids"

.field static final SERVICE_INTENT_KEY_SIGN:Ljava/lang/String; = "sign"

.field static final SERVICE_INTENT_KEY_SSID:Ljava/lang/String; = "ssid"


# instance fields
.field private serviceStartedTimes:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->serviceStartedTimes:I

    return-void
.end method

.method private addOneServiceTask()V
    .locals 2

    .line 163
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->serviceStartedTimes:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->serviceStartedTimes:I

    .line 164
    return-void
.end method

.method private finishOneServiceTask()V
    .locals 2

    .line 171
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->serviceStartedTimes:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->serviceStartedTimes:I

    .line 174
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->serviceStartedTimes:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 176
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->stopSelf()V

    .line 178
    invoke-static {}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateServiceManager;->releaseCUPOperateWakeLock()V

    .line 180
    :cond_0
    return-void
.end method


# virtual methods
.method public checkFinished()V
    .locals 1

    .line 199
    const-string v0, "check cup card finished."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 200
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->finishOneServiceTask()V

    .line 201
    return-void
.end method

.method public handleResultCallback(I)V
    .locals 2

    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handle personalized result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 193
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->finishOneServiceTask()V

    .line 194
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .line 92
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .line 102
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 103
    const-string v0, "CUPOperateService onCreate"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 104
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 154
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 155
    const-string v0, "CUPOperateService onDestroy"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 156
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 11

    .line 109
    const-string v0, "CUPOperateService onStartCommand"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 110
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->addOneServiceTask()V

    .line 112
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 114
    const-string v0, "cup operate service restarted."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 115
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v6

    .line 117
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;->initCUPCardOperator(Lcom/huawei/nfc/carrera/logic/cardoperate/response/InitCUPCardOperatorCallback;)V

    .line 118
    const/4 v0, 0x1

    invoke-interface {v6, v0, p0}, Lcom/huawei/nfc/carrera/logic/BankCardOperateLogicApi;->checkCUPInterruptedCard(ZLcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;)V

    .line 119
    const/4 v0, 0x1

    return v0

    .line 122
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v6

    .line 123
    const-string v0, "com.huawei.wallet.nfc.CARD_OPERATE_SERVICE"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 125
    const-string v0, "event"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 126
    const-string v0, "ssid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 127
    const-string v0, "sign"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 128
    const-string v0, "ref_ids"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v10

    .line 130
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    move-object v1, v7

    move-object v2, v8

    move-object v3, v9

    move-object v4, v10

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->notifyCUPCardOperation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPOperateResultCallback;)V

    .line 132
    goto :goto_0

    .line 133
    :cond_1
    const-string v0, "com.huawei.wallet.nfc.PERSONAL_RESULT_HANDLE_SERVICE"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 135
    const-string v0, "cplc"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 136
    const-string v0, "ref_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 137
    const-string v0, "aid"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 139
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    invoke-virtual {v0, v7, v8, v9, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->notifyCUPCardPersonalized(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/HandleCUPPersonalizedResultCallback;)V

    .line 141
    goto :goto_0

    .line 144
    :cond_2
    const-string v0, "action error."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 145
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->finishOneServiceTask()V

    .line 148
    :goto_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result v0

    return v0
.end method

.method public operateResultCallback(I)V
    .locals 2

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "card operate result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 186
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lifecycle/cupoperate/CUPOperateService;->finishOneServiceTask()V

    .line 187
    return-void
.end method
