.class public final Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final OPEN_CARD_CHANNEL_BANK_APP_JUMP:Ljava/lang/String; = "1"

.field public static final OPEN_CARD_CHANNEL_BANK_APP_VERIFY:Ljava/lang/String; = "2"

.field public static final OPEN_CARD_CHANNEL_WALLET:Ljava/lang/String; = "3"

.field public static final RESULT_CODE_ACTIVE_CARD_FAILED:Ljava/lang/String; = "3109"

.field public static final RESULT_CODE_ACTIVE_CARD_FAILED_DES:Ljava/lang/String; = "active card failed"

.field public static final RESULT_CODE_APPLY_CARD_FAILED:Ljava/lang/String; = "3105"

.field public static final RESULT_CODE_APPLY_CARD_FAILED_DES:Ljava/lang/String; = "apply_card"

.field public static final RESULT_CODE_APPLY_ISSUE_ORDER_FAIL:Ljava/lang/String; = "1300"

.field public static final RESULT_CODE_APPLY_RECHARGE_ORDER:Ljava/lang/String; = "1501"

.field public static final RESULT_CODE_APPLY_RECHARGE_ORDER_DES:Ljava/lang/String; = "apply_recharge_order"

.field public static final RESULT_CODE_CREATE_AMSD_FAIL:Ljava/lang/String; = "3102"

.field public static final RESULT_CODE_CREATE_AMSD_FAIL_DES:Ljava/lang/String; = "create_amsd_fail"

.field public static final RESULT_CODE_CREATE_SSD_FAIL:Ljava/lang/String; = "1101"

.field public static final RESULT_CODE_DELETE_BANK_CARD_FAILED:Ljava/lang/String; = "3201"

.field public static final RESULT_CODE_DELETE_BANK_CARD_FAILED_DES:Ljava/lang/String; = "delete_bank_card_failed"

.field public static final RESULT_CODE_IDENTIFY_CARD_NUM_FAILED:Ljava/lang/String; = "3104"

.field public static final RESULT_CODE_IDENTIFY_CARD_NUM_FAILED_DES:Ljava/lang/String; = "identify_card_num"

.field public static final RESULT_CODE_INIT_UNIONPAY_ADDON_FAILED:Ljava/lang/String; = "3103"

.field public static final RESULT_CODE_INIT_UNIONPAY_ADDON_FAILED_DES:Ljava/lang/String; = "init_unionpay_addon"

.field public static final RESULT_CODE_ISSUE_CARD_FAIL:Ljava/lang/String; = "1102"

.field public static final RESULT_CODE_LOAD_CAP_FAILED:Ljava/lang/String; = "3107"

.field public static final RESULT_CODE_LOAD_CAP_FAILED_DES:Ljava/lang/String; = "load_cap_failed"

.field public static final RESULT_CODE_OPEN_CARD_SUCCESS:Ljava/lang/String; = "1000"

.field public static final RESULT_CODE_PAY_FAIL:Ljava/lang/String; = "1400"

.field public static final RESULT_CODE_QUERY_ISSUE_MONEY_FAIL:Ljava/lang/String; = "1200"

.field public static final RESULT_CODE_QUERY_ISSUE_ORDER_FAIL:Ljava/lang/String; = "1103"

.field public static final RESULT_CODE_QUERY_RECHARGE_MONEY_FAIL:Ljava/lang/String; = "1503"

.field public static final RESULT_CODE_RECHARGE:Ljava/lang/String; = "1502"

.field public static final RESULT_CODE_RECHARGE_DES:Ljava/lang/String; = "recharge"

.field public static final RESULT_CODE_SET_FINGER_PRINT_PWD_FAILED:Ljava/lang/String; = "3110"

.field public static final RESULT_CODE_SET_FINGER_PRINT_PWD_FAILED_DES:Ljava/lang/String; = "set_finger_print_pwd_failed"

.field public static final RESULT_CODE_TRANSFER_IN_APPLY_ORDER_DES:Ljava/lang/String; = "apply_transfer_in_order"

.field public static final RESULT_CODE_TRANSFER_IN_APPLY_ORDER_FAIL:Ljava/lang/String; = "2202"

.field public static final RESULT_CODE_TRANSFER_IN_CREATE_DMSD_DES:Ljava/lang/String; = "transfer_in_create_dmsd"

.field public static final RESULT_CODE_TRANSFER_IN_CREATE_DMSD_FAIL:Ljava/lang/String; = "2201"

.field public static final RESULT_CODE_TRANSFER_IN_DES:Ljava/lang/String; = "do_transfer_in"

.field public static final RESULT_CODE_TRANSFER_IN_FAIL:Ljava/lang/String; = "2203"

.field public static final RESULT_CODE_TRANSFER_IN_QUERY_MOVE_CODE_DES:Ljava/lang/String; = "transfer_in_query_move_code"

.field public static final RESULT_CODE_TRANSFER_IN_QUERY_MOVE_CODE_FAIL:Ljava/lang/String; = "2207"

.field public static final RESULT_CODE_TRANSFER_IN_RECHARGE_APPLY_ORDER_DES:Ljava/lang/String; = "transfer_in_recharge_apply_order"

.field public static final RESULT_CODE_TRANSFER_IN_RECHARGE_APPLY_ORDER_FAIL:Ljava/lang/String; = "2205"

.field public static final RESULT_CODE_TRANSFER_IN_RECHARGE_DES:Ljava/lang/String; = "transfer_in_recharge"

.field public static final RESULT_CODE_TRANSFER_IN_RECHARGE_FAIL:Ljava/lang/String; = "2206"

.field public static final RESULT_CODE_TRANSFER_IN_REPORT_STATUS_DES:Ljava/lang/String; = "report_transfer_in_status"

.field public static final RESULT_CODE_TRANSFER_IN_REPORT_STATUS_FAIL:Ljava/lang/String; = "2204"

.field public static final RESULT_CODE_TRANSFER_IN_SUCCESS:Ljava/lang/String; = "2200"

.field public static final RESULT_CODE_TRANSFER_IN_SUCCESS_DES:Ljava/lang/String; = "transfer_in_success"

.field public static final RESULT_CODE_TRANSFER_OUT_APPLY_ORDER_DES:Ljava/lang/String; = "transfer_out_apply_order"

.field public static final RESULT_CODE_TRANSFER_OUT_APPLY_ORDER_FAIL:Ljava/lang/String; = "2101"

.field public static final RESULT_CODE_TRANSFER_OUT_DELETE_SSD_DES:Ljava/lang/String; = "transfer_out_delete_ssd"

.field public static final RESULT_CODE_TRANSFER_OUT_DELETE_SSD_FAIL:Ljava/lang/String; = "2105"

.field public static final RESULT_CODE_TRANSFER_OUT_DES:Ljava/lang/String; = "do_transfer_out"

.field public static final RESULT_CODE_TRANSFER_OUT_FAIL:Ljava/lang/String; = "2102"

.field public static final RESULT_CODE_TRANSFER_OUT_GET_BALANCE_STATUS_DES:Ljava/lang/String; = "transfer_out_get_balance"

.field public static final RESULT_CODE_TRANSFER_OUT_GET_BALANCE_STATUS_FAIL:Ljava/lang/String; = "2106"

.field public static final RESULT_CODE_TRANSFER_OUT_REPORT_STATUS_DES:Ljava/lang/String; = "report_transfer_out_status"

.field public static final RESULT_CODE_TRANSFER_OUT_REPORT_STATUS_FAIL:Ljava/lang/String; = "2103"

.field public static final RESULT_CODE_TRANSFER_OUT_SUCCESS:Ljava/lang/String; = "2100"

.field public static final RESULT_CODE_TRANSFER_OUT_SUCCESS_DES:Ljava/lang/String; = "transfer_out_success"

.field public static final RESULT_CODE_TRANSFER_OUT_SYNC_ESE_INFO_DES:Ljava/lang/String; = "transfer_out_sync_ese_info"

.field public static final RESULT_CODE_TRANSFER_OUT_SYNC_ESE_INFO_FAIL:Ljava/lang/String; = "2104"

.field public static final RESULT_CODE_UNIONPAY_ADDON_DOWNLOAD_DES:Ljava/lang/String; = "unionpay_addon_download"

.field public static final RESULT_CODE_UNIONPAY_ADDON_DOWNLOAD_FAIL:Ljava/lang/String; = "3101"

.field public static final RESULT_CODE_UPDATE_APPLET_FAIL:Ljava/lang/String; = "1104"

.field public static final RESULT_CODE_UPDATE_PERSONALIZED_INFO_INTO_TA_FAILED:Ljava/lang/String; = "3108"

.field public static final RESULT_CODE_UPDATE_PERSONALIZED_INFO_INTO_TA_FAILED_DES:Ljava/lang/String; = "update_personalized_info_into_ta_failed"

.field public static final RESULT_CODE_WAITING_LOAD_CAP_STARTTIMEOUT_DES:Ljava/lang/String; = "waiting_load_cap_start_timeout"

.field public static final RESULT_CODE_WAITING_LOAD_CAP_START_TIMEOUT:Ljava/lang/String; = "3106"

.field public static final RESULT_DESC_APPLY_ISSUE_ORDER:Ljava/lang/String; = "apply issue order"

.field public static final RESULT_DESC_CREATE_SSD:Ljava/lang/String; = "create ssd"

.field public static final RESULT_DESC_ISSUE_CARD:Ljava/lang/String; = "issue card"

.field public static final RESULT_DESC_OPEN_CARD:Ljava/lang/String; = "open card success"

.field public static final RESULT_DESC_PAY:Ljava/lang/String; = "pay issue card money"

.field public static final RESULT_DESC_QUERY_ISSUE_MONEY:Ljava/lang/String; = "query issue money"

.field public static final RESULT_DESC_QUERY_ISSUE_ORDER:Ljava/lang/String; = "query issue order"

.field public static final RESULT_DESC_QUERY_RECHARGE_MONEY_FAIL:Ljava/lang/String; = "query recharge money failed"

.field public static final RESULT_DESC_UPDATE_APPLET:Ljava/lang/String; = "update applet"

.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "LogUploadOperator"

.field private static volatile instance:Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator; = null


# instance fields
.field private final context:Landroid/content/Context;

.field private final taskHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 376
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 377
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 379
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->context:Landroid/content/Context;

    goto :goto_0

    .line 383
    :cond_0
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->context:Landroid/content/Context;

    .line 386
    :goto_0
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "LogUploadOperator"

    const/16 v1, 0xa

    invoke-direct {v2, v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 387
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 389
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    .line 390
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->taskHandler:Landroid/os/Handler;

    .line 391
    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;
    .locals 4

    .line 359
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 361
    sget-object v2, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->SYNC_LOCK:[B

    monitor-enter v2

    .line 363
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 365
    new-instance v0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 367
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 369
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->instance:Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    return-object v0
.end method


# virtual methods
.method public init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .line 403
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;-><init>()V

    .line 405
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v3

    .line 406
    invoke-virtual {v2, v3}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->setUid(Ljava/lang/String;)V

    .line 407
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->setCardIssuerid(Ljava/lang/String;)V

    .line 408
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-static {v0}, Lcom/huawei/wallet/utils/TimeUtil;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->setTime(Ljava/lang/String;)V

    .line 409
    invoke-virtual {v2, p4}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->setCardType(I)V

    .line 410
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->setTerminal(Ljava/lang/String;)V

    .line 411
    invoke-virtual {v2, p2}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->setResult(Ljava/lang/String;)V

    .line 412
    invoke-virtual {v2, p3}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->setErrorDesc(Ljava/lang/String;)V

    .line 413
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;->setRequestNum(Ljava/lang/String;)V

    .line 414
    new-instance v4, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->context:Landroid/content/Context;

    invoke-direct {v4, v0, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadTask;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)V

    .line 415
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->taskHandler:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 416
    return-void
.end method
