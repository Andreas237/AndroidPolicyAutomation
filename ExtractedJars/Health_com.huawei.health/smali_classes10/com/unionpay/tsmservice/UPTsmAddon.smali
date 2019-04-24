.class public Lcom/unionpay/tsmservice/UPTsmAddon;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;,
        Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;,
        Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;
    }
.end annotation


# static fields
.field private static final ACTION_TSM_SERVICE:Ljava/lang/String; = "com.unionpay.tsmservice.UPTsmBleUniteService"

.field private static final MSG_TSM_SERVICE_CONNECTED:I = 0x0

.field private static final MSG_TSM_SERVICE_DISCONNECTED:I = 0x1

.field private static final PACKAGE_NAME_TSM_SERVICE:Ljava/lang/String; = "com.unionpay.tsmbleuniteservice"

.field private static final TAG:Ljava/lang/String; = "UPTsmAddon"

.field private static sInstance:Lcom/unionpay/tsmservice/UPTsmAddon; = null

.field private static sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;>;"
        }
    .end annotation
.end field


# instance fields
.field private final CALL_INTERFACE_LONG_OVERTIME:I

.field private final CALL_INTERFACE_MID_OVERTIME:I

.field private final CALL_INTERFACE_SHORT_OVERTIME:I

.field private final CALL_INTERFACE_SUPER_LONG_OVERTIME:I

.field private final callInterfaceOvertimehandler:Landroid/os/Handler;

.field private isConnected:Z

.field private mActivityApplyDeleteListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mActivityUniteApplyListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mAppDataUpdateListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mAppDownloadApplyListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mAppECashTopupListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mAppGetAccountBalanceListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mAppGetAccountInfoListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mAppGetActiveCodeListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mAppGetSMSAuthCodeListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mAppGetTransRecordListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mApplyActivityLsteners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmActivityCallback;>;"
        }
    .end annotation
.end field

.field private mApplyUniteActivityLsteners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmActivityCallback;>;"
        }
    .end annotation
.end field

.field private mBleKeyExchangeListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private final mCallback:Landroid/os/Handler$Callback;

.field private mCheckBinCodeListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mCloseChannelListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mDetailActivityLsteners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmActivityCallback;>;"
        }
    .end annotation
.end field

.field private mEncryptDataListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetAppDetailListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetAppListListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetAppStatusListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetAssoAppListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetCardInfoListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetDefaultCardListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetEncryptDataListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetSEAppListListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetSeIdListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetSupportedCardTypeListListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetTransElementsListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mGetUniteAppListListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private final mHandler:Landroid/os/Handler;

.field private mITsmService:Lcom/unionpay/tsmservice/ITsmService;

.field private mInitListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mOpenChannelListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mSendApduListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mServiceConnection:Landroid/content/ServiceConnection;

.field private mSetDefaultCardListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field

.field private mShowSaftyboardActivityListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmActivityCallback;>;"
        }
    .end annotation
.end field

.field private mUniteAppActiveListeners:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 74
    const-string v0, "uptsmaddon"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    goto :goto_0

    .line 75
    :catch_0
    move-exception v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/UnsatisfiedLinkError;->printStackTrace()V

    .line 87
    :goto_0
    const/4 v0, 0x0

    sput-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sInstance:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 88
    const/4 v0, 0x0

    sput-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 180
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mServiceConnection:Landroid/content/ServiceConnection;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected:Z

    .line 95
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mInitListeners:Ljava/util/HashMap;

    .line 96
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetSupportedCardTypeListListeners:Ljava/util/HashMap;

    .line 97
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mCheckBinCodeListeners:Ljava/util/HashMap;

    .line 98
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetAssoAppListeners:Ljava/util/HashMap;

    .line 99
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetSEAppListListeners:Ljava/util/HashMap;

    .line 100
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetAppListListeners:Ljava/util/HashMap;

    .line 101
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetUniteAppListListeners:Ljava/util/HashMap;

    .line 102
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetAppStatusListeners:Ljava/util/HashMap;

    .line 103
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetAppDetailListeners:Ljava/util/HashMap;

    .line 104
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetTransElementsListeners:Ljava/util/HashMap;

    .line 105
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppDownloadApplyListeners:Ljava/util/HashMap;

    .line 106
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppDataUpdateListeners:Ljava/util/HashMap;

    .line 107
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetSMSAuthCodeListeners:Ljava/util/HashMap;

    .line 108
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetActiveCodeListeners:Ljava/util/HashMap;

    .line 109
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mUniteAppActiveListeners:Ljava/util/HashMap;

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppECashTopupListeners:Ljava/util/HashMap;

    .line 111
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetTransRecordListeners:Ljava/util/HashMap;

    .line 112
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetAccountInfoListeners:Ljava/util/HashMap;

    .line 113
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetAccountBalanceListeners:Ljava/util/HashMap;

    .line 114
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mOpenChannelListeners:Ljava/util/HashMap;

    .line 115
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mSendApduListeners:Ljava/util/HashMap;

    .line 116
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mCloseChannelListeners:Ljava/util/HashMap;

    .line 117
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mSetDefaultCardListeners:Ljava/util/HashMap;

    .line 118
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetDefaultCardListeners:Ljava/util/HashMap;

    .line 119
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetSeIdListeners:Ljava/util/HashMap;

    .line 120
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetCardInfoListeners:Ljava/util/HashMap;

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mEncryptDataListeners:Ljava/util/HashMap;

    .line 122
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mBleKeyExchangeListeners:Ljava/util/HashMap;

    .line 123
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mActivityApplyDeleteListeners:Ljava/util/HashMap;

    .line 124
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mActivityUniteApplyListeners:Ljava/util/HashMap;

    .line 125
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetEncryptDataListeners:Ljava/util/HashMap;

    .line 126
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mShowSaftyboardActivityListeners:Ljava/util/HashMap;

    .line 127
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mApplyUniteActivityLsteners:Ljava/util/HashMap;

    .line 128
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mApplyActivityLsteners:Ljava/util/HashMap;

    .line 129
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mDetailActivityLsteners:Ljava/util/HashMap;

    .line 130
    const/16 v0, 0x5a

    iput v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->CALL_INTERFACE_SUPER_LONG_OVERTIME:I

    .line 131
    const/16 v0, 0x41

    iput v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->CALL_INTERFACE_LONG_OVERTIME:I

    .line 132
    const/16 v0, 0x32

    iput v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->CALL_INTERFACE_MID_OVERTIME:I

    .line 133
    const/16 v0, 0x23

    iput v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->CALL_INTERFACE_SHORT_OVERTIME:I

    .line 142
    new-instance v0, Lcom/unionpay/tsmservice/UPTsmAddon$1;

    invoke-direct {v0, p0}, Lcom/unionpay/tsmservice/UPTsmAddon$1;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;)V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mCallback:Landroid/os/Handler$Callback;

    .line 159
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v2, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mCallback:Landroid/os/Handler$Callback;

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mHandler:Landroid/os/Handler;

    .line 161
    new-instance v0, Lcom/unionpay/tsmservice/UPTsmAddon$2;

    invoke-direct {v0, p0}, Lcom/unionpay/tsmservice/UPTsmAddon$2;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;)V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    .line 181
    iput-object p1, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    .line 182
    invoke-static {p1}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aiJNIE(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 183
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 185
    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/unionpay/tsmservice/UPTsmAddon;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->onTsmServiceConnected()V

    return-void
.end method

.method static synthetic access$100(Lcom/unionpay/tsmservice/UPTsmAddon;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->onTsmServiceDisconnected()V

    return-void
.end method

.method static synthetic access$1000(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmActivityCallback;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/unionpay/tsmservice/UPTsmAddon;->onActivityCallBack(Lcom/unionpay/tsmservice/ITsmActivityCallback;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$200(Lcom/unionpay/tsmservice/UPTsmAddon;)Ljava/lang/String;
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$300(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;
    .locals 1

    .line 70
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getCallbackMap(I)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400(Lcom/unionpay/tsmservice/UPTsmAddon;)Landroid/os/Bundle;
    .locals 1

    .line 70
    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->buildOvertimeResult()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$500(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmCallback;Landroid/os/Bundle;)V
    .locals 0

    .line 70
    invoke-direct {p0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onCallbackResult(Lcom/unionpay/tsmservice/ITsmCallback;Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic access$602(Lcom/unionpay/tsmservice/UPTsmAddon;Z)Z
    .locals 0

    .line 70
    iput-boolean p1, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected:Z

    return p1
.end method

.method static synthetic access$702(Lcom/unionpay/tsmservice/UPTsmAddon;Lcom/unionpay/tsmservice/ITsmService;)Lcom/unionpay/tsmservice/ITsmService;
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    return-object p1
.end method

.method static synthetic access$800(Lcom/unionpay/tsmservice/UPTsmAddon;)Landroid/os/Handler;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$900(Lcom/unionpay/tsmservice/UPTsmAddon;I)Ljava/util/HashMap;
    .locals 1

    .line 70
    invoke-direct {p0, p1}, Lcom/unionpay/tsmservice/UPTsmAddon;->getActivityCallbackMap(I)Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method private bindUPTsmService()Z
    .locals 4

    .line 1246
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mServiceConnection:Landroid/content/ServiceConnection;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1247
    new-instance v0, Lcom/unionpay/tsmservice/UPTsmAddon$3;

    invoke-direct {v0, p0}, Lcom/unionpay/tsmservice/UPTsmAddon$3;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;)V

    iput-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mServiceConnection:Landroid/content/ServiceConnection;

    .line 1266
    :cond_0
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected:Z

    if-nez v0, :cond_1

    .line 1267
    new-instance v3, Landroid/content/Intent;

    const-string v0, "com.unionpay.tsmservice.UPTsmBleUniteService"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1268
    const-string v0, "com.unionpay.tsmbleuniteservice"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1269
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mServiceConnection:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {v0, v3, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    return v0

    .line 1272
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private buildOvertimeResult()Landroid/os/Bundle;
    .locals 3

    .line 1392
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1393
    const-string v0, "errorCode"

    const-string v1, "10099"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1395
    const-string v0, "errorDesc"

    const-string v1, "\u8c03\u7528\u8d85\u65f6\uff0c\u8bf7\u786e\u8ba4\u7f51\u7edc\u6216\u8005\u84dd\u7259\u72b6\u6001"

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1396
    return-object v2
.end method

.method private getActivityCallbackMap(I)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmActivityCallback;>;"
        }
    .end annotation

    .line 1311
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 1313
    :sswitch_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mApplyActivityLsteners:Ljava/util/HashMap;

    return-object v0

    .line 1315
    :sswitch_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mDetailActivityLsteners:Ljava/util/HashMap;

    return-object v0

    .line 1317
    :sswitch_2
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mApplyUniteActivityLsteners:Ljava/util/HashMap;

    return-object v0

    .line 1319
    :sswitch_3
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mShowSaftyboardActivityListeners:Ljava/util/HashMap;

    return-object v0

    .line 1321
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x404 -> :sswitch_0
        0x405 -> :sswitch_1
        0x407 -> :sswitch_2
        0x40f -> :sswitch_3
    .end sparse-switch
.end method

.method private getCallbackMap(I)Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/HashMap<Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;>;"
        }
    .end annotation

    .line 1326
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_0

    .line 1328
    :sswitch_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mInitListeners:Ljava/util/HashMap;

    return-object v0

    .line 1330
    :sswitch_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mCheckBinCodeListeners:Ljava/util/HashMap;

    return-object v0

    .line 1332
    :sswitch_2
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetSupportedCardTypeListListeners:Ljava/util/HashMap;

    return-object v0

    .line 1334
    :sswitch_3
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetAssoAppListeners:Ljava/util/HashMap;

    return-object v0

    .line 1336
    :sswitch_4
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetSEAppListListeners:Ljava/util/HashMap;

    return-object v0

    .line 1338
    :sswitch_5
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetAppListListeners:Ljava/util/HashMap;

    return-object v0

    .line 1340
    :sswitch_6
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetUniteAppListListeners:Ljava/util/HashMap;

    return-object v0

    .line 1342
    :sswitch_7
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetAppStatusListeners:Ljava/util/HashMap;

    return-object v0

    .line 1344
    :sswitch_8
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetAppDetailListeners:Ljava/util/HashMap;

    return-object v0

    .line 1346
    :sswitch_9
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetTransElementsListeners:Ljava/util/HashMap;

    return-object v0

    .line 1348
    :sswitch_a
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppDownloadApplyListeners:Ljava/util/HashMap;

    return-object v0

    .line 1350
    :sswitch_b
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppDataUpdateListeners:Ljava/util/HashMap;

    return-object v0

    .line 1352
    :sswitch_c
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetSMSAuthCodeListeners:Ljava/util/HashMap;

    return-object v0

    .line 1354
    :sswitch_d
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetActiveCodeListeners:Ljava/util/HashMap;

    return-object v0

    .line 1356
    :sswitch_e
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mUniteAppActiveListeners:Ljava/util/HashMap;

    return-object v0

    .line 1358
    :sswitch_f
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppECashTopupListeners:Ljava/util/HashMap;

    return-object v0

    .line 1360
    :sswitch_10
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetTransRecordListeners:Ljava/util/HashMap;

    return-object v0

    .line 1362
    :sswitch_11
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetAccountInfoListeners:Ljava/util/HashMap;

    return-object v0

    .line 1364
    :sswitch_12
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetAccountBalanceListeners:Ljava/util/HashMap;

    return-object v0

    .line 1366
    :sswitch_13
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mOpenChannelListeners:Ljava/util/HashMap;

    return-object v0

    .line 1368
    :sswitch_14
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mSendApduListeners:Ljava/util/HashMap;

    return-object v0

    .line 1370
    :sswitch_15
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mSetDefaultCardListeners:Ljava/util/HashMap;

    return-object v0

    .line 1372
    :sswitch_16
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetDefaultCardListeners:Ljava/util/HashMap;

    return-object v0

    .line 1374
    :sswitch_17
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetSeIdListeners:Ljava/util/HashMap;

    return-object v0

    .line 1376
    :sswitch_18
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetCardInfoListeners:Ljava/util/HashMap;

    return-object v0

    .line 1378
    :sswitch_19
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mEncryptDataListeners:Ljava/util/HashMap;

    return-object v0

    .line 1380
    :sswitch_1a
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mBleKeyExchangeListeners:Ljava/util/HashMap;

    return-object v0

    .line 1382
    :sswitch_1b
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mActivityApplyDeleteListeners:Ljava/util/HashMap;

    return-object v0

    .line 1384
    :sswitch_1c
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mActivityUniteApplyListeners:Ljava/util/HashMap;

    return-object v0

    .line 1386
    :sswitch_1d
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetEncryptDataListeners:Ljava/util/HashMap;

    return-object v0

    .line 1388
    :goto_0
    const/4 v0, 0x0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2a -> :sswitch_1d
        0x3e8 -> :sswitch_0
        0x3e9 -> :sswitch_3
        0x3ea -> :sswitch_9
        0x3eb -> :sswitch_c
        0x3ec -> :sswitch_11
        0x3ed -> :sswitch_12
        0x3ee -> :sswitch_a
        0x3f1 -> :sswitch_5
        0x3f2 -> :sswitch_8
        0x3f3 -> :sswitch_13
        0x3f4 -> :sswitch_14
        0x3f6 -> :sswitch_4
        0x3f7 -> :sswitch_16
        0x3f8 -> :sswitch_15
        0x3f9 -> :sswitch_10
        0x3fa -> :sswitch_f
        0x3fb -> :sswitch_17
        0x3fe -> :sswitch_b
        0x3ff -> :sswitch_19
        0x400 -> :sswitch_18
        0x402 -> :sswitch_7
        0x403 -> :sswitch_1a
        0x404 -> :sswitch_1b
        0x406 -> :sswitch_1
        0x407 -> :sswitch_1c
        0x408 -> :sswitch_6
        0x409 -> :sswitch_d
        0x40a -> :sswitch_e
        0x40d -> :sswitch_2
    .end sparse-switch
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/unionpay/tsmservice/UPTsmAddon;
    .locals 2

    .line 188
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 189
    const/4 v0, 0x0

    return-object v0

    .line 192
    :cond_0
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sInstance:Lcom/unionpay/tsmservice/UPTsmAddon;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 193
    new-instance v0, Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sInstance:Lcom/unionpay/tsmservice/UPTsmAddon;

    .line 196
    :cond_1
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 197
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 200
    :cond_2
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sInstance:Lcom/unionpay/tsmservice/UPTsmAddon;

    return-object v0
.end method

.method private getPackageName()Ljava/lang/String;
    .locals 2

    .line 1305
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 1306
    return-object v1
.end method

.method private isSupportApplyCardWithRiskInfo()Z
    .locals 5

    .line 1189
    const/4 v2, 0x0

    .line 1191
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    .line 1193
    return v2

    .line 1195
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 1197
    const-string v0, "com.unionpay.tsmbleuniteservice"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 1198
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 1199
    iget v0, v4, Landroid/content/pm/PackageInfo;->versionCode:I

    const/4 v1, 0x7

    if-lt v0, v1, :cond_2

    .line 1200
    const-string v0, "bletest"

    const-string v1, "can apply card with risk info"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1201
    const/4 v0, 0x1

    return v0

    .line 1204
    :cond_1
    return v2

    .line 1208
    :cond_2
    goto :goto_0

    .line 1206
    :catch_0
    move-exception v3

    .line 1207
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 1209
    :goto_0
    return v2
.end method

.method private onActivityCallBack(Lcom/unionpay/tsmservice/ITsmActivityCallback;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1419
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 1421
    :try_start_0
    invoke-interface {p1, p2, p3, p4}, Lcom/unionpay/tsmservice/ITsmActivityCallback;->StartActivity(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1425
    goto :goto_0

    .line 1423
    :catch_0
    move-exception v1

    .line 1424
    invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V

    .line 1427
    :cond_0
    :goto_0
    return-void
.end method

.method private onCallbackResult(Lcom/unionpay/tsmservice/ITsmCallback;Landroid/os/Bundle;)V
    .locals 2

    .line 1400
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 1402
    const-string v0, "errorCode"

    :try_start_0
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1403
    const-string v0, "10000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "99999"

    .line 1405
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1406
    :cond_0
    invoke-interface {p1, p2}, Lcom/unionpay/tsmservice/ITsmCallback;->onResult(Landroid/os/Bundle;)V

    goto :goto_0

    .line 1408
    :cond_1
    const-string v0, "errorDesc"

    .line 1409
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1408
    invoke-interface {p1, v1, v0}, Lcom/unionpay/tsmservice/ITsmCallback;->onError(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1413
    :goto_0
    goto :goto_1

    .line 1411
    :catch_0
    move-exception v1

    .line 1412
    invoke-virtual {v1}, Landroid/os/RemoteException;->printStackTrace()V

    .line 1415
    :cond_2
    :goto_1
    return-void
.end method

.method private onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1221
    new-instance v1, Lcom/unionpay/tsmservice/SessionKeyReExchange;

    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sInstance:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/unionpay/tsmservice/SessionKeyReExchange;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 1223
    invoke-virtual {v1}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->reGetPubKey()V

    .line 1224
    return-void
.end method

.method private onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1229
    new-instance v0, Lcom/unionpay/tsmservice/SessionKeyReExchange;

    sget-object v1, Lcom/unionpay/tsmservice/UPTsmAddon;->sInstance:Lcom/unionpay/tsmservice/UPTsmAddon;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/unionpay/tsmservice/SessionKeyReExchange;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V

    move-object v6, v0

    .line 1232
    invoke-virtual {v6}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->reGetPubKey()V

    .line 1233
    return-void
.end method

.method private onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1239
    new-instance v0, Lcom/unionpay/tsmservice/SessionKeyReExchange;

    sget-object v1, Lcom/unionpay/tsmservice/UPTsmAddon;->sInstance:Lcom/unionpay/tsmservice/UPTsmAddon;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/unionpay/tsmservice/SessionKeyReExchange;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V

    move-object v7, v0

    .line 1242
    invoke-virtual {v7}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->reGetPubKey()V

    .line 1243
    return-void
.end method

.method private onSessionKeyInvalid(ILjava/lang/Object;Lcom/unionpay/tsmservice/ITsmCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1214
    new-instance v1, Lcom/unionpay/tsmservice/SessionKeyReExchange;

    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sInstance:Lcom/unionpay/tsmservice/UPTsmAddon;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/unionpay/tsmservice/SessionKeyReExchange;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;ILjava/lang/Object;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 1216
    invoke-virtual {v1}, Lcom/unionpay/tsmservice/SessionKeyReExchange;->reGetPubKey()V

    .line 1217
    return-void
.end method

.method private onTsmServiceConnected()V
    .locals 4

    .line 1283
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1284
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 1285
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;

    .line 1286
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 1287
    invoke-interface {v3}, Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;->onTsmConnected()V

    .line 1289
    :cond_0
    goto :goto_0

    .line 1291
    :cond_1
    return-void
.end method

.method private onTsmServiceDisconnected()V
    .locals 4

    .line 1294
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1295
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 1296
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;

    .line 1297
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 1298
    invoke-interface {v3}, Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;->onTsmDisconnected()V

    .line 1300
    :cond_0
    goto :goto_0

    .line 1302
    :cond_1
    return-void
.end method

.method private unbindUPTsmService()V
    .locals 2

    .line 1276
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mServiceConnection:Landroid/content/ServiceConnection;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-boolean v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected:Z

    if-eqz v0, :cond_0

    .line 1277
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mServiceConnection:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 1278
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected:Z

    .line 1280
    :cond_0
    return-void
.end method


# virtual methods
.method public UniteAppDownload(Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 759
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 761
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 763
    :cond_1
    new-instance v2, Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;-><init>()V

    .line 764
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 765
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 766
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;->getMPanId()Ljava/lang/String;

    move-result-object v3

    .line 767
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 768
    invoke-static {v3}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;->setMPanId(Ljava/lang/String;)V

    goto :goto_0

    .line 770
    :cond_2
    const/4 v0, -0x3

    return v0

    .line 772
    :goto_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0, v2, p2, p3}, Lcom/unionpay/tsmservice/ITsmService;->uniteAppDownload(Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    move-result v4

    .line 774
    const/4 v0, -0x2

    if-ne v0, v4, :cond_3

    .line 775
    const/16 v0, 0x22

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V

    .line 777
    const/4 v0, 0x0

    return v0

    .line 779
    :cond_3
    return v4

    .line 782
    :cond_4
    const/16 v0, 0x22

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V

    .line 784
    const/4 v0, 0x0

    return v0

    .line 787
    :cond_5
    const/4 v0, -0x1

    return v0
.end method

.method public addConnectionListener(Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;)V
    .locals 1

    .line 224
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 225
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    :cond_0
    return-void
.end method

.method public bind()Z
    .locals 1

    .line 212
    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->bindUPTsmService()Z

    move-result v0

    return v0
.end method

.method public bleKeyExchange(Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 708
    const-string v0, "BLETEST"

    const-string v1, "=====\u8fdb\u5165addon bleKeyExchange"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 709
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 710
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 712
    :cond_1
    new-instance v3, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;

    invoke-direct {v3}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;-><init>()V

    .line 713
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mBleKeyExchangeListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 714
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 715
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 716
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->getAppID()Lcom/unionpay/tsmservice/AppID;

    move-result-object v4

    .line 717
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 718
    invoke-virtual {v4}, Lcom/unionpay/tsmservice/AppID;->getAppAid()Ljava/lang/String;

    move-result-object v5

    .line 719
    invoke-virtual {v4}, Lcom/unionpay/tsmservice/AppID;->getAppVersion()Ljava/lang/String;

    move-result-object v6

    .line 721
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 722
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 723
    new-instance v0, Lcom/unionpay/tsmservice/AppID;

    .line 724
    invoke-static {v5}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 725
    invoke-static {v6}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/unionpay/tsmservice/AppID;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 724
    invoke-virtual {p1, v0}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->setAppID(Lcom/unionpay/tsmservice/AppID;)V

    .line 728
    :cond_2
    const-string v0, "BLETEST"

    const-string v1, "=====\u51c6\u5907\u8fdb\u5165mITsmService bleKeyExchange"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 729
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->getAppID()Lcom/unionpay/tsmservice/AppID;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->setAppID(Lcom/unionpay/tsmservice/AppID;)V

    .line 730
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x403

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v3, v1}, Lcom/unionpay/tsmservice/ITsmService;->bleKeyExchange(Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v5

    .line 733
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 734
    const/16 v0, 0x403

    iput v0, v6, Landroid/os/Message;->what:I

    .line 735
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 736
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0xc350

    invoke-virtual {v0, v6, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 739
    const/4 v0, -0x2

    if-ne v0, v5, :cond_3

    .line 740
    invoke-virtual {p1, v4}, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->setAppID(Lcom/unionpay/tsmservice/AppID;)V

    .line 741
    const/16 v0, 0x1d

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 743
    const/4 v0, 0x0

    return v0

    .line 745
    :cond_3
    return v5

    .line 748
    :cond_4
    const/16 v0, 0x1d

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 750
    const/4 v0, 0x0

    return v0

    .line 753
    :cond_5
    const/4 v0, -0x1

    return v0
.end method

.method public checkBinCode(Lcom/unionpay/tsmservice/request/CheckBinRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 608
    new-instance v3, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;

    invoke-direct {v3}, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;-><init>()V

    .line 609
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 610
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 612
    :cond_1
    const-string v0, "BLETEST"

    const-string v1, "===\u8fdb\u5165checkbincode"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 613
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mCheckBinCodeListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 615
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 616
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->getSPan()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 617
    .line 618
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->getSPan()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 617
    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->setSPan(Ljava/lang/String;)V

    .line 620
    .line 621
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->getSPan()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 620
    invoke-virtual {p1, v0}, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->setSPan(Ljava/lang/String;)V

    .line 623
    :cond_2
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x406

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v3, v1}, Lcom/unionpay/tsmservice/ITsmService;->checkBinCode(Lcom/unionpay/tsmservice/request/CheckBinRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 626
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 627
    const/16 v0, 0x406

    iput v0, v5, Landroid/os/Message;->what:I

    .line 628
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 629
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0x15f90

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 632
    const/4 v0, -0x2

    if-ne v0, v4, :cond_3

    .line 633
    const/16 v0, 0x20

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 635
    const/4 v0, 0x0

    return v0

    .line 637
    :cond_3
    return v4

    .line 640
    :cond_4
    const/16 v0, 0x20

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 642
    const/4 v0, 0x0

    return v0

    .line 645
    :cond_5
    const/4 v0, -0x1

    return v0
.end method

.method public declared-synchronized clearEncryptData(I)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    .line 550
    const/16 v0, 0x7d0

    if-lt p1, v0, :cond_0

    const/16 v0, 0x7d1

    if-le p1, v0, :cond_1

    .line 551
    :cond_0
    monitor-exit p0

    const/4 v0, -0x3

    return v0

    .line 553
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 554
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_3

    .line 555
    const/4 v6, 0x0

    .line 557
    :try_start_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0, p1}, Lcom/unionpay/tsmservice/ITsmService;->clearEncryptData(I)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v6

    .line 561
    goto :goto_0

    .line 558
    :catch_0
    move-exception v7

    .line 559
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    .line 560
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 562
    :goto_0
    const/4 v0, -0x2

    if-ne v0, v6, :cond_2

    .line 563
    move-object v0, p0

    move v3, p1

    const/16 v1, 0x2b

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V

    .line 566
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 568
    :cond_2
    monitor-exit p0

    return v6

    .line 571
    :cond_3
    move-object v0, p0

    move v3, p1

    const/16 v1, 0x2b

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 574
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 577
    :cond_4
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public encryptData(Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 322
    new-instance v3, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;

    invoke-direct {v3}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;-><init>()V

    .line 323
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 324
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 326
    :cond_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mEncryptDataListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 328
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 329
    .line 330
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;->getData()Ljava/util/List;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/ArrayList;

    .line 331
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    .line 332
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 333
    const/4 v0, 0x0

    if-ne v0, v5, :cond_2

    .line 334
    const/4 v0, -0x3

    return v0

    .line 337
    :cond_2
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 338
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_4

    .line 339
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 340
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 341
    invoke-static {v8}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 345
    :cond_4
    invoke-virtual {p1, v6}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;->setData(Ljava/util/List;)V

    .line 347
    :cond_5
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;->getData()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;->setData(Ljava/util/List;)V

    .line 348
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x3ff

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v3, v1}, Lcom/unionpay/tsmservice/ITsmService;->encryptData(Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v5

    .line 351
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 352
    const/16 v0, 0x3ff

    iput v0, v6, Landroid/os/Message;->what:I

    .line 353
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 354
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0x88b8

    invoke-virtual {v0, v6, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 356
    const/4 v0, -0x2

    if-ne v0, v5, :cond_6

    .line 357
    invoke-virtual {p1, v4}, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;->setData(Ljava/util/List;)V

    .line 358
    const/16 v0, 0x1a

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 360
    const/4 v0, 0x0

    return v0

    .line 362
    :cond_6
    return v5

    .line 365
    :cond_7
    const/16 v0, 0x1a

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 367
    const/4 v0, 0x0

    return v0

    .line 371
    :cond_8
    const/4 v0, -0x1

    return v0
.end method

.method public exchangeKey(Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1062
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 1063
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 1065
    :cond_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1066
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0, p1, p2}, Lcom/unionpay/tsmservice/ITsmService;->exchangeKey(Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v0

    return v0

    .line 1068
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public declared-synchronized executeCmd(Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    .line 377
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 378
    :cond_0
    monitor-exit p0

    const/4 v0, -0x3

    return v0

    .line 380
    :cond_1
    :try_start_0
    new-instance v2, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;-><init>()V

    .line 381
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 382
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 383
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;->getSsid()Ljava/lang/String;

    move-result-object v3

    .line 384
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;->getSign()Ljava/lang/String;

    move-result-object v4

    .line 385
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 386
    invoke-static {v3}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;->setSsid(Ljava/lang/String;)V

    .line 389
    :cond_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 390
    invoke-static {v4}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;->setSign(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 392
    :cond_3
    const/4 v5, 0x0

    .line 394
    :try_start_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0, v2, p2, p3}, Lcom/unionpay/tsmservice/ITsmService;->executeCmd(Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v5

    .line 399
    goto :goto_0

    .line 396
    :catch_0
    move-exception v6

    .line 397
    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V

    .line 398
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 400
    :goto_0
    const/4 v0, -0x2

    if-ne v0, v5, :cond_4

    .line 401
    const/16 v0, 0x1c

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V

    .line 403
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 405
    :cond_4
    monitor-exit p0

    return v5

    .line 409
    :cond_5
    const/16 v0, 0x1c

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 411
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 414
    :cond_6
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getActiveCode(Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 828
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 829
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 831
    :cond_1
    new-instance v3, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;

    invoke-direct {v3}, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;-><init>()V

    .line 832
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mAppGetActiveCodeListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 834
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 836
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->getMPanId()Ljava/lang/String;

    move-result-object v4

    .line 837
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->getActiveType()Ljava/lang/String;

    move-result-object v5

    .line 838
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 839
    invoke-static {v4}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->setMPanId(Ljava/lang/String;)V

    goto :goto_0

    .line 841
    :cond_2
    const/4 v0, -0x3

    return v0

    .line 844
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 845
    .line 846
    invoke-static {v5}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->setActiveType(Ljava/lang/String;)V

    goto :goto_1

    .line 848
    :cond_3
    const/4 v0, -0x3

    return v0

    .line 850
    :goto_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x409

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v3, v1}, Lcom/unionpay/tsmservice/ITsmService;->getActiveCode(Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v6

    .line 854
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 855
    const/16 v0, 0x409

    iput v0, v7, Landroid/os/Message;->what:I

    .line 856
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 857
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0xc350

    invoke-virtual {v0, v7, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 860
    const/4 v0, -0x2

    if-ne v0, v6, :cond_4

    .line 861
    const/16 v0, 0x25

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 863
    const/4 v0, 0x0

    return v0

    .line 865
    :cond_4
    return v6

    .line 868
    :cond_5
    const/16 v0, 0x25

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 870
    const/4 v0, 0x0

    return v0

    .line 873
    :cond_6
    const/4 v0, -0x1

    return v0
.end method

.method public getCardInfo([Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 928
    array-length v3, p1

    .line 929
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 930
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 933
    :cond_1
    const/4 v4, 0x0

    .line 934
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    .line 935
    aget-object v0, p1, v4

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 936
    goto :goto_1

    .line 934
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 940
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetCardInfoListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 941
    if-ne v4, v3, :cond_4

    .line 942
    const/4 v0, -0x3

    return v0

    .line 944
    :cond_4
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 945
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 946
    new-array v5, v3, [Ljava/lang/String;

    .line 947
    const/4 v6, 0x0

    :goto_2
    if-ge v6, v3, :cond_6

    .line 948
    aget-object v0, p1, v6

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 949
    aget-object v0, p1, v6

    aput-object v0, v5, v6

    goto :goto_3

    .line 951
    :cond_5
    aget-object v0, p1, v6

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v5, v6

    .line 947
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 955
    :cond_6
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x400

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v5, v1}, Lcom/unionpay/tsmservice/ITsmService;->getCardInfo([Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v6

    .line 958
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 959
    const/16 v0, 0x400

    iput v0, v7, Landroid/os/Message;->what:I

    .line 960
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 961
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0xfde8

    invoke-virtual {v0, v7, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 965
    const/4 v0, -0x2

    if-ne v0, v6, :cond_7

    .line 966
    const/16 v0, 0xd

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILjava/lang/Object;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 968
    const/4 v0, 0x0

    return v0

    .line 970
    :cond_7
    return v6

    .line 973
    :cond_8
    const/16 v0, 0xd

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILjava/lang/Object;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 975
    const/4 v0, 0x0

    return v0

    .line 979
    :cond_9
    const/4 v0, -0x1

    return v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getDefaultCard(Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1017
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1018
    const/4 v0, -0x3

    return v0

    .line 1020
    :cond_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetDefaultCardListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1021
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1022
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1024
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x3f7

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v1}, Lcom/unionpay/tsmservice/ITsmService;->getDefaultCard(Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v3

    .line 1026
    const-string v0, "BLETEST"

    const-string v1, "\u83b7\u53d6\u9ed8\u8ba4\u5361addon"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1028
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 1029
    const/16 v0, 0x3f7

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1030
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1031
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0x88b8

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1033
    const/4 v0, -0x2

    if-ne v0, v3, :cond_1

    .line 1034
    const/16 v0, 0x14

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 1036
    const/4 v0, 0x0

    return v0

    .line 1038
    :cond_1
    return v3

    .line 1041
    :cond_2
    const/16 v0, 0x14

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 1043
    const/4 v0, 0x0

    return v0

    .line 1046
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method public declared-synchronized getEncryptData(Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    .line 496
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 497
    :cond_0
    monitor-exit p0

    const/4 v0, -0x3

    return v0

    .line 500
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;->getType()I

    move-result v3

    .line 501
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;->getPan()Ljava/lang/String;

    move-result-object v4

    .line 503
    const/16 v0, 0x7d0

    if-lt v3, v0, :cond_2

    const/16 v0, 0x7d1

    if-le v3, v0, :cond_3

    .line 504
    :cond_2
    monitor-exit p0

    const/4 v0, -0x3

    return v0

    .line 507
    :cond_3
    const/16 v0, 0x7d0

    if-ne v3, v0, :cond_4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 508
    monitor-exit p0

    const/4 v0, -0x3

    return v0

    .line 510
    :cond_4
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 511
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 512
    new-instance v5, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;

    invoke-direct {v5}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;-><init>()V

    .line 513
    const/16 v0, 0x7d0

    if-ne v3, v0, :cond_5

    .line 514
    invoke-static {v4}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 515
    invoke-virtual {v5, v6}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;->setPan(Ljava/lang/String;)V

    .line 517
    :cond_5
    invoke-virtual {v5, v3}, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;->setType(I)V

    .line 518
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetEncryptDataListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 519
    const/4 v6, 0x0

    .line 521
    :try_start_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x2a

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v5, v1}, Lcom/unionpay/tsmservice/ITsmService;->getEncryptData(Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v6

    .line 527
    goto :goto_0

    .line 524
    :catch_0
    move-exception v7

    .line 525
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    .line 526
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 528
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 529
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetEncryptDataListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    :cond_6
    const/4 v0, -0x2

    if-ne v0, v6, :cond_7

    .line 532
    const/16 v0, 0x2a

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 535
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 537
    :cond_7
    monitor-exit p0

    return v6

    .line 540
    :cond_8
    const/16 v0, 0x2a

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 543
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 546
    :cond_9
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public getListenerCount()I
    .locals 2

    .line 236
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 237
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    move-result v0

    return v0

    .line 239
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPubKey(Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1050
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1051
    const/4 v0, -0x3

    return v0

    .line 1054
    :cond_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1055
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0, p1}, Lcom/unionpay/tsmservice/ITsmService;->getPubKey(Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v0

    return v0

    .line 1057
    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public getSupportedCardTypeList(Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 289
    const-string v0, "BLETEST"

    const-string v1, "===\u8fdb\u5165getSupportedCardTypeList"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 290
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetSupportedCardTypeListListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 292
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 293
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x40d

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v1}, Lcom/unionpay/tsmservice/ITsmService;->getSupportedCardTypeList(Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v3

    .line 296
    new-instance v4, Landroid/os/Message;

    invoke-direct {v4}, Landroid/os/Message;-><init>()V

    .line 297
    const/16 v0, 0x40d

    iput v0, v4, Landroid/os/Message;->what:I

    .line 298
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 299
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0xc350

    invoke-virtual {v0, v4, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 302
    const/4 v0, -0x2

    if-ne v0, v3, :cond_0

    .line 303
    const/16 v0, 0x27

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 306
    const/4 v0, 0x0

    return v0

    .line 308
    :cond_0
    return v3

    .line 311
    :cond_1
    const/16 v0, 0x27

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 314
    const/4 v0, 0x0

    return v0

    .line 317
    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public getUniteAppList(Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 650
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 651
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 653
    :cond_1
    new-instance v3, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;

    invoke-direct {v3}, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;-><init>()V

    .line 654
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mGetUniteAppListListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 655
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 656
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 657
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->getStatus()[Ljava/lang/String;

    move-result-object v4

    .line 659
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 660
    array-length v5, v4

    .line 661
    new-array v6, v5, [Ljava/lang/String;

    .line 662
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_3

    .line 663
    aget-object v0, v4, v7

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 664
    aget-object v0, v4, v7

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v7

    .line 662
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 667
    :cond_3
    invoke-virtual {v3, v6}, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->setStatus([Ljava/lang/String;)V

    .line 668
    goto :goto_1

    .line 669
    :cond_4
    const/4 v0, 0x0

    new-array v5, v0, [Ljava/lang/String;

    .line 670
    invoke-virtual {v3, v5}, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->setStatus([Ljava/lang/String;)V

    .line 672
    :goto_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x408

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v3, v1}, Lcom/unionpay/tsmservice/ITsmService;->getUniteAppList(Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v5

    .line 676
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 677
    const/16 v0, 0x408

    iput v0, v6, Landroid/os/Message;->what:I

    .line 678
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v6, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 679
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0xfde8

    invoke-virtual {v0, v6, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 681
    const/4 v0, -0x2

    if-ne v0, v5, :cond_5

    .line 682
    const/16 v0, 0x23

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 684
    const/4 v0, 0x0

    return v0

    .line 686
    :cond_5
    return v5

    .line 689
    :cond_6
    const/16 v0, 0x23

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 691
    const/4 v0, 0x0

    return v0

    .line 694
    :cond_7
    const/4 v0, -0x1

    return v0
.end method

.method public declared-synchronized hideKeyboard()I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    .line 581
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 582
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 583
    const/4 v6, 0x0

    .line 585
    :try_start_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0}, Lcom/unionpay/tsmservice/ITsmService;->hideKeyboard()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v6

    .line 589
    goto :goto_0

    .line 586
    :catch_0
    move-exception v7

    .line 587
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    .line 588
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 590
    :goto_0
    const/4 v0, -0x2

    if-ne v0, v6, :cond_0

    .line 591
    move-object v0, p0

    const/16 v1, 0x2c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V

    .line 593
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 595
    :cond_0
    monitor-exit p0

    return v6

    .line 598
    :cond_1
    move-object v0, p0

    const/16 v1, 0x2c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 600
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 603
    :cond_2
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :catchall_0
    move-exception v6

    monitor-exit p0

    throw v6
.end method

.method public init(Lcom/unionpay/tsmservice/request/InitRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 252
    new-instance v3, Lcom/unionpay/tsmservice/request/InitRequestParams;

    invoke-direct {v3}, Lcom/unionpay/tsmservice/request/InitRequestParams;-><init>()V

    .line 253
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 254
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 256
    :cond_1
    const-string v0, "BLETEST"

    const-string v1, "===\u8fdb\u5165Addon  init"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 257
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mInitListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 259
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 260
    const-string v0, "BLETEST"

    const-string v1, "===\u4e0b\u4e00\u6b65\u8fdb\u5165Stub  init"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 261
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/InitRequestParams;->getType()I

    move-result v0

    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/request/InitRequestParams;->setType(I)V

    .line 262
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x3e8

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v3, v1}, Lcom/unionpay/tsmservice/ITsmService;->init(Lcom/unionpay/tsmservice/request/InitRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 265
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 266
    const/16 v0, 0x3e8

    iput v0, v5, Landroid/os/Message;->what:I

    .line 267
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 268
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0x15f90

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 271
    const/4 v0, -0x2

    if-ne v0, v4, :cond_2

    .line 272
    const/16 v0, 0x1b

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 274
    const/4 v0, 0x0

    return v0

    .line 276
    :cond_2
    return v4

    .line 279
    :cond_3
    const/16 v0, 0x1b

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 281
    const/4 v0, 0x0

    return v0

    .line 284
    :cond_4
    const/4 v0, -0x1

    return v0
.end method

.method public isConnected()Z
    .locals 1

    .line 208
    iget-boolean v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->isConnected:Z

    return v0
.end method

.method public openUniteCardApplyActivity(Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;Landroid/content/Context;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1083
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 1084
    const/4 v0, -0x3

    return v0

    .line 1087
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 1089
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/unionpay/tsmservice/UPTsmAddon;->mActivityUniteApplyListeners:Ljava/util/HashMap;

    invoke-direct/range {p0 .. p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p3

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1091
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/unionpay/tsmservice/UPTsmAddon;->mApplyUniteActivityLsteners:Ljava/util/HashMap;

    invoke-direct/range {p0 .. p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/unionpay/tsmservice/TsmActivityListener;

    move-object/from16 v3, p2

    invoke-direct {v2, v3}, Lcom/unionpay/tsmservice/TsmActivityListener;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1093
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1094
    invoke-virtual/range {p1 .. p1}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->getSpan()Ljava/lang/String;

    move-result-object v5

    .line 1095
    invoke-virtual/range {p1 .. p1}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->getTCUrl()Ljava/lang/String;

    move-result-object v6

    .line 1096
    invoke-virtual/range {p1 .. p1}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->getBankName()Ljava/lang/String;

    move-result-object v7

    .line 1097
    invoke-virtual/range {p1 .. p1}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->getCardType()Ljava/lang/String;

    move-result-object v8

    .line 1100
    invoke-virtual/range {p1 .. p1}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->getCaptureMethod()I

    move-result v9

    .line 1101
    invoke-virtual/range {p1 .. p1}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->getChntUsrId()Ljava/lang/String;

    move-result-object v10

    .line 1102
    invoke-virtual/range {p1 .. p1}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->getFullDeviceNumber()Ljava/lang/String;

    move-result-object v11

    .line 1104
    .line 1105
    invoke-virtual/range {p1 .. p1}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->getmApplyActivityStyle()Lcom/unionpay/tsmservice/data/ApplyActivityStyle;

    move-result-object v12

    .line 1106
    new-instance v13, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;

    invoke-direct {v13}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;-><init>()V

    .line 1107
    new-instance v14, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;

    invoke-direct {v14}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;-><init>()V

    .line 1108
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1109
    invoke-static {v5}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->setSpan(Ljava/lang/String;)V

    .line 1110
    .line 1111
    invoke-static {v5}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->setSpan(Ljava/lang/String;)V

    goto :goto_0

    .line 1113
    :cond_1
    const/4 v0, -0x3

    return v0

    .line 1115
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1116
    invoke-static {v6}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->setTCUrl(Ljava/lang/String;)V

    .line 1117
    .line 1118
    invoke-static {v6}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->setTCUrl(Ljava/lang/String;)V

    goto :goto_1

    .line 1120
    :cond_2
    const/4 v0, -0x3

    return v0

    .line 1122
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1123
    .line 1124
    invoke-static {v7}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->setBankName(Ljava/lang/String;)V

    .line 1125
    .line 1126
    invoke-static {v7}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->setBankName(Ljava/lang/String;)V

    goto :goto_2

    .line 1128
    :cond_3
    const/4 v0, -0x3

    return v0

    .line 1130
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v8, :cond_4

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1131
    .line 1132
    invoke-static {v8}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->setCardType(Ljava/lang/String;)V

    .line 1133
    .line 1134
    invoke-static {v8}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->setCardType(Ljava/lang/String;)V

    goto :goto_3

    .line 1136
    :cond_4
    const/4 v0, -0x3

    return v0

    .line 1138
    :goto_3
    const/4 v0, 0x0

    if-eq v0, v12, :cond_5

    .line 1140
    invoke-virtual {v13, v12}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->setmApplyActivityStyle(Lcom/unionpay/tsmservice/data/ApplyActivityStyle;)V

    .line 1141
    .line 1142
    invoke-virtual {v14, v12}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->setmApplyActivityStyle(Lcom/unionpay/tsmservice/data/ApplyActivityStyle;)V

    .line 1144
    .line 1145
    :cond_5
    invoke-virtual {v14, v9}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->setCaptureMethod(I)V

    .line 1146
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1147
    .line 1148
    invoke-static {v10}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->setChntUsrId(Ljava/lang/String;)V

    .line 1150
    :cond_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 1151
    .line 1152
    invoke-static {v11}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1151
    invoke-virtual {v14, v0}, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->setFullDeviceNumber(Ljava/lang/String;)V

    .line 1154
    :cond_7
    const/4 v15, 0x0

    .line 1155
    invoke-direct/range {p0 .. p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->isSupportApplyCardWithRiskInfo()Z

    move-result v0

    if-nez v0, :cond_8

    .line 1156
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;

    move-object/from16 v2, p0

    const/16 v3, 0x407

    invoke-direct {v1, v2, v3}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    new-instance v2, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    move-object/from16 v3, p0

    const/16 v4, 0x407

    invoke-direct {v2, v3, v4}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v13, v1, v2}, Lcom/unionpay/tsmservice/ITsmService;->openUniteCardApplyActivity(Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v15

    goto :goto_4

    .line 1163
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;

    move-object/from16 v2, p0

    const/16 v3, 0x407

    invoke-direct {v1, v2, v3}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    new-instance v2, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    move-object/from16 v3, p0

    const/16 v4, 0x407

    invoke-direct {v2, v3, v4}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v14, v1, v2}, Lcom/unionpay/tsmservice/ITsmService;->openUniteCardApplyActivityWithRiskInfo(Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v15

    .line 1170
    :goto_4
    const/4 v0, -0x2

    if-ne v0, v15, :cond_9

    .line 1171
    move-object/from16 v0, p0

    const/16 v1, 0x21

    move-object/from16 v2, p1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 1174
    const/4 v0, 0x0

    return v0

    .line 1176
    :cond_9
    return v15

    .line 1179
    :cond_a
    move-object/from16 v0, p0

    const/16 v1, 0x21

    move-object/from16 v2, p1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 1182
    const/4 v0, 0x0

    return v0

    .line 1185
    :cond_b
    const/4 v0, -0x1

    return v0
.end method

.method public removeConnectionListener(Lcom/unionpay/tsmservice/UPTsmAddon$UPTsmConnectionListener;)V
    .locals 1

    .line 230
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 231
    sget-object v0, Lcom/unionpay/tsmservice/UPTsmAddon;->sTsmConnectionListeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 233
    :cond_0
    return-void
.end method

.method public setDefaultCard(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 984
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 985
    const/4 v0, -0x3

    return v0

    .line 987
    :cond_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 988
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 989
    invoke-static {p1}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 991
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0, v3, p2}, Lcom/unionpay/tsmservice/ITsmService;->setDefaultCard(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 994
    new-instance v5, Landroid/os/Message;

    invoke-direct {v5}, Landroid/os/Message;-><init>()V

    .line 995
    const/16 v0, 0x3f8

    iput v0, v5, Landroid/os/Message;->what:I

    .line 996
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 997
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0x88b8

    invoke-virtual {v0, v5, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1000
    const/4 v0, -0x2

    if-ne v0, v4, :cond_1

    .line 1001
    const/16 v0, 0xe

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILjava/lang/Object;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 1003
    const/4 v0, 0x0

    return v0

    .line 1005
    :cond_1
    return v4

    .line 1008
    :cond_2
    const/16 v0, 0xe

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILjava/lang/Object;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 1010
    const/4 v0, 0x0

    return v0

    .line 1013
    :cond_3
    const/4 v0, -0x1

    return v0
.end method

.method public declared-synchronized setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    .line 419
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 420
    monitor-exit p0

    const/4 v0, -0x3

    return v0

    .line 422
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 423
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_2

    .line 424
    const/4 v2, 0x0

    .line 426
    :try_start_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0, p1}, Lcom/unionpay/tsmservice/ITsmService;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v2

    .line 430
    goto :goto_0

    .line 427
    :catch_0
    move-exception v3

    .line 428
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V

    .line 429
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 431
    :goto_0
    const/4 v0, -0x2

    if-ne v0, v2, :cond_1

    .line 432
    const/16 v0, 0x28

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 435
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 437
    :cond_1
    monitor-exit p0

    return v2

    .line 441
    :cond_2
    const/16 v0, 0x28

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 444
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 447
    :cond_3
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized showSafetyKeyboard(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    monitor-enter p0

    .line 454
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/16 v0, 0x7d0

    if-lt p2, v0, :cond_0

    const/16 v0, 0x7d1

    if-le p2, v0, :cond_1

    .line 456
    :cond_0
    monitor-exit p0

    const/4 v0, -0x3

    return v0

    .line 458
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 459
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 461
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mShowSaftyboardActivityListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/unionpay/tsmservice/TsmActivityListener;

    invoke-direct {v2, p4}, Lcom/unionpay/tsmservice/TsmActivityListener;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 463
    const/4 v6, 0x0

    .line 465
    :try_start_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;

    const/16 v2, 0x40f

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmActivityCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, p1, p2, p3, v1}, Lcom/unionpay/tsmservice/ITsmService;->showSafetyKeyboard(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Lcom/unionpay/tsmservice/ITsmActivityCallback;)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v6

    .line 471
    goto :goto_0

    .line 468
    :catch_0
    move-exception v7

    .line 469
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    .line 470
    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0

    .line 472
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 473
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mShowSaftyboardActivityListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    :cond_2
    const/4 v0, -0x2

    if-ne v0, v6, :cond_3

    .line 476
    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    const/16 v1, 0x29

    invoke-direct/range {v0 .. v5}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V

    .line 479
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 481
    :cond_3
    monitor-exit p0

    return v6

    .line 484
    :cond_4
    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    const/16 v1, 0x29

    invoke-direct/range {v0 .. v5}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 487
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 490
    :cond_5
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public unbind()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 216
    const-string v0, "BLETEST"

    const-string v1, "\u5f00\u59cb\u89e3\u7ed1\u84dd\u7259\u670d\u52a1"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0}, Lcom/unionpay/tsmservice/ITsmService;->unbindBleService()V

    .line 220
    :cond_0
    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->unbindUPTsmService()V

    .line 221
    return-void
.end method

.method public uniteAppDelete(Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 793
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 795
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 797
    :cond_1
    new-instance v2, Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;

    invoke-direct {v2}, Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;-><init>()V

    .line 798
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 799
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 800
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;->getMPanId()Ljava/lang/String;

    move-result-object v3

    .line 801
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 802
    invoke-static {v3}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;->setMPanId(Ljava/lang/String;)V

    goto :goto_0

    .line 804
    :cond_2
    const/4 v0, -0x3

    return v0

    .line 806
    :goto_0
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    invoke-interface {v0, v2, p2, p3}, Lcom/unionpay/tsmservice/ITsmService;->uniteAppDelete(Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    move-result v4

    .line 809
    const/4 v0, -0x2

    if-ne v0, v4, :cond_3

    .line 810
    const/16 v0, 0x24

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V

    .line 812
    const/4 v0, 0x0

    return v0

    .line 814
    :cond_3
    return v4

    .line 817
    :cond_4
    const/16 v0, 0x24

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)V

    .line 819
    const/4 v0, 0x0

    return v0

    .line 823
    :cond_5
    const/4 v0, -0x1

    return v0
.end method

.method public uniteCardActive(Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 878
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 879
    :cond_0
    const/4 v0, -0x3

    return v0

    .line 881
    :cond_1
    new-instance v3, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;

    invoke-direct {v3}, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;-><init>()V

    .line 882
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mUniteAppActiveListeners:Ljava/util/HashMap;

    invoke-direct {p0}, Lcom/unionpay/tsmservice/UPTsmAddon;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 883
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 884
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->acSKV(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 886
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->getMPanId()Ljava/lang/String;

    move-result-object v4

    .line 887
    invoke-virtual {p1}, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->getActiveCode()Ljava/lang/String;

    move-result-object v5

    .line 888
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 889
    invoke-static {v4}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->setMPanId(Ljava/lang/String;)V

    goto :goto_0

    .line 891
    :cond_2
    const/4 v0, -0x3

    return v0

    .line 894
    :goto_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 895
    .line 896
    invoke-static {v5}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->aeM(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->setActiveCode(Ljava/lang/String;)V

    goto :goto_1

    .line 898
    :cond_3
    const/4 v0, -0x3

    return v0

    .line 900
    :goto_1
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->mITsmService:Lcom/unionpay/tsmservice/ITsmService;

    new-instance v1, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;

    const/16 v2, 0x40a

    invoke-direct {v1, p0, v2}, Lcom/unionpay/tsmservice/UPTsmAddon$TsmCallback;-><init>(Lcom/unionpay/tsmservice/UPTsmAddon;I)V

    invoke-interface {v0, v3, v1}, Lcom/unionpay/tsmservice/ITsmService;->uniteCardActive(Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v6

    .line 904
    new-instance v7, Landroid/os/Message;

    invoke-direct {v7}, Landroid/os/Message;-><init>()V

    .line 905
    const/16 v0, 0x40a

    iput v0, v7, Landroid/os/Message;->what:I

    .line 906
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v7, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 907
    iget-object v0, p0, Lcom/unionpay/tsmservice/UPTsmAddon;->callInterfaceOvertimehandler:Landroid/os/Handler;

    const-wide/32 v1, 0xc350

    invoke-virtual {v0, v7, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 910
    const/4 v0, -0x2

    if-ne v0, v6, :cond_4

    .line 911
    const/16 v0, 0x26

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 913
    const/4 v0, 0x0

    return v0

    .line 915
    :cond_4
    return v6

    .line 918
    :cond_5
    const/16 v0, 0x26

    invoke-direct {p0, v0, p1, p2}, Lcom/unionpay/tsmservice/UPTsmAddon;->onSessionKeyInvalid(ILcom/unionpay/tsmservice/request/RequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)V

    .line 920
    const/4 v0, 0x0

    return v0

    .line 923
    :cond_6
    const/4 v0, -0x1

    return v0
.end method
