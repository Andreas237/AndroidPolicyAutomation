.class public abstract Lcom/unionpay/tsmservice/ITsmService$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/unionpay/tsmservice/ITsmService;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/unionpay/tsmservice/ITsmService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.unionpay.tsmservice.ITsmService"

.field static final TRANSACTION_appDataUpdate:I = 0x14

.field static final TRANSACTION_appDelete:I = 0x12

.field static final TRANSACTION_appDownload:I = 0x10

.field static final TRANSACTION_appDownloadApply:I = 0xf

.field static final TRANSACTION_appLock:I = 0x15

.field static final TRANSACTION_appUnlock:I = 0x16

.field static final TRANSACTION_bleKeyExchange:I = 0x25

.field static final TRANSACTION_checkBinCode:I = 0x3

.field static final TRANSACTION_clearEncryptData:I = 0x2d

.field static final TRANSACTION_closeChannel:I = 0x23

.field static final TRANSACTION_eCashTopUp:I = 0x1a

.field static final TRANSACTION_encryptData:I = 0x6

.field static final TRANSACTION_exchangeKey:I = 0x5

.field static final TRANSACTION_executeCmd:I = 0x2f

.field static final TRANSACTION_getAccountBalance:I = 0x1d

.field static final TRANSACTION_getAccountInfo:I = 0x1c

.field static final TRANSACTION_getActiveCode:I = 0x18

.field static final TRANSACTION_getAppDetail:I = 0xd

.field static final TRANSACTION_getAppList:I = 0xa

.field static final TRANSACTION_getAppStatus:I = 0xc

.field static final TRANSACTION_getAssociatedApp:I = 0x8

.field static final TRANSACTION_getCardInfo:I = 0x1e

.field static final TRANSACTION_getDefaultCard:I = 0x20

.field static final TRANSACTION_getEncryptData:I = 0x2c

.field static final TRANSACTION_getPubKey:I = 0x4

.field static final TRANSACTION_getSEAppList:I = 0x9

.field static final TRANSACTION_getSEId:I = 0x7

.field static final TRANSACTION_getSMSAuthCode:I = 0x17

.field static final TRANSACTION_getSupportedCardTypeList:I = 0x2

.field static final TRANSACTION_getTransElements:I = 0xe

.field static final TRANSACTION_getTransRecord:I = 0x1b

.field static final TRANSACTION_getUniteAppList:I = 0xb

.field static final TRANSACTION_hideAppApply:I = 0x24

.field static final TRANSACTION_hideKeyboard:I = 0x2e

.field static final TRANSACTION_init:I = 0x1

.field static final TRANSACTION_openCardApplyActivity:I = 0x26

.field static final TRANSACTION_openCardDetailActivity:I = 0x27

.field static final TRANSACTION_openChannel:I = 0x21

.field static final TRANSACTION_openUniteCardApplyActivity:I = 0x28

.field static final TRANSACTION_openUniteCardApplyActivityWithRiskInfo:I = 0x30

.field static final TRANSACTION_sendApdu:I = 0x22

.field static final TRANSACTION_setDefaultCard:I = 0x1f

.field static final TRANSACTION_setSafetyKeyboardBitmap:I = 0x2b

.field static final TRANSACTION_showSafetyKeyboard:I = 0x2a

.field static final TRANSACTION_unbindBleService:I = 0x29

.field static final TRANSACTION_uniteAppDelete:I = 0x13

.field static final TRANSACTION_uniteAppDownload:I = 0x11

.field static final TRANSACTION_uniteCardActive:I = 0x19


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 15
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p0, p0, v0}, Lcom/unionpay/tsmservice/ITsmService$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmService;
    .locals 2

    .line 23
    if-nez p0, :cond_0

    .line 24
    const/4 v0, 0x0

    return-object v0

    .line 26
    :cond_0
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 27
    if-eqz v1, :cond_1

    instance-of v0, v1, Lcom/unionpay/tsmservice/ITsmService;

    if-eqz v0, :cond_1

    .line 28
    move-object v0, v1

    check-cast v0, Lcom/unionpay/tsmservice/ITsmService;

    return-object v0

    .line 30
    :cond_1
    new-instance v0, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/unionpay/tsmservice/ITsmService$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 34
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 38
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_23

    .line 42
    :sswitch_0
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 43
    const/4 v0, 0x1

    return v0

    .line 47
    :sswitch_1
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 49
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 50
    sget-object v0, Lcom/unionpay/tsmservice/request/InitRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/InitRequestParams;

    goto :goto_0

    .line 53
    :cond_0
    const/4 v2, 0x0

    .line 56
    :goto_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 57
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->init(Lcom/unionpay/tsmservice/request/InitRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 58
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 59
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 60
    const/4 v0, 0x1

    return v0

    .line 64
    :sswitch_2
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v2

    .line 67
    invoke-virtual {p0, v2}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getSupportedCardTypeList(Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v3

    .line 68
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 69
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    const/4 v0, 0x1

    return v0

    .line 74
    :sswitch_3
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 76
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 77
    sget-object v0, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/CheckBinRequestParams;

    goto :goto_1

    .line 80
    :cond_1
    const/4 v2, 0x0

    .line 83
    :goto_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 84
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->checkBinCode(Lcom/unionpay/tsmservice/request/CheckBinRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 85
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 86
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    const/4 v0, 0x1

    return v0

    .line 91
    :sswitch_4
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 93
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v2

    .line 94
    invoke-virtual {p0, v2}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getPubKey(Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v3

    .line 95
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 96
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    const/4 v0, 0x1

    return v0

    .line 101
    :sswitch_5
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 104
    sget-object v0, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;

    goto :goto_2

    .line 107
    :cond_2
    const/4 v2, 0x0

    .line 110
    :goto_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 111
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->exchangeKey(Lcom/unionpay/tsmservice/request/ExchangeKeyRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 112
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 113
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 114
    const/4 v0, 0x1

    return v0

    .line 118
    :sswitch_6
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 120
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 121
    sget-object v0, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;

    goto :goto_3

    .line 124
    :cond_3
    const/4 v2, 0x0

    .line 127
    :goto_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 128
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->encryptData(Lcom/unionpay/tsmservice/request/EncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 129
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 130
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 131
    const/4 v0, 0x1

    return v0

    .line 135
    :sswitch_7
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v2

    .line 138
    invoke-virtual {p0, v2}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getSEId(Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v3

    .line 139
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 140
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    const/4 v0, 0x1

    return v0

    .line 145
    :sswitch_8
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 147
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 148
    sget-object v0, Lcom/unionpay/tsmservice/request/GetAssociatedAppRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetAssociatedAppRequestParams;

    goto :goto_4

    .line 151
    :cond_4
    const/4 v2, 0x0

    .line 154
    :goto_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 155
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getAssociatedApp(Lcom/unionpay/tsmservice/request/GetAssociatedAppRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 156
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 157
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 158
    const/4 v0, 0x1

    return v0

    .line 162
    :sswitch_9
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 164
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v2

    .line 165
    invoke-virtual {p0, v2}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getSEAppList(Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v3

    .line 166
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 167
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 168
    const/4 v0, 0x1

    return v0

    .line 172
    :sswitch_a
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 174
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 175
    sget-object v0, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetAppListRequestParams;

    goto :goto_5

    .line 178
    :cond_5
    const/4 v2, 0x0

    .line 181
    :goto_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 182
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getAppList(Lcom/unionpay/tsmservice/request/GetAppListRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 183
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 184
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 185
    const/4 v0, 0x1

    return v0

    .line 189
    :sswitch_b
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 191
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 192
    sget-object v0, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;

    goto :goto_6

    .line 195
    :cond_6
    const/4 v2, 0x0

    .line 198
    :goto_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 199
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getUniteAppList(Lcom/unionpay/tsmservice/request/GetUniteAppListRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 200
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 201
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 202
    const/4 v0, 0x1

    return v0

    .line 206
    :sswitch_c
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 208
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 209
    sget-object v0, Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;

    goto :goto_7

    .line 212
    :cond_7
    const/4 v2, 0x0

    .line 215
    :goto_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 216
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getAppStatus(Lcom/unionpay/tsmservice/request/GetAppStatusRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 217
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 218
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 219
    const/4 v0, 0x1

    return v0

    .line 223
    :sswitch_d
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 225
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_8

    .line 226
    sget-object v0, Lcom/unionpay/tsmservice/request/GetAppDetailRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetAppDetailRequestParams;

    goto :goto_8

    .line 229
    :cond_8
    const/4 v2, 0x0

    .line 232
    :goto_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 233
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getAppDetail(Lcom/unionpay/tsmservice/request/GetAppDetailRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 234
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 235
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 236
    const/4 v0, 0x1

    return v0

    .line 240
    :sswitch_e
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 242
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 243
    sget-object v0, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;

    goto :goto_9

    .line 246
    :cond_9
    const/4 v2, 0x0

    .line 249
    :goto_9
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 250
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getTransElements(Lcom/unionpay/tsmservice/request/GetTransElementsRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 251
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 252
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 253
    const/4 v0, 0x1

    return v0

    .line 257
    :sswitch_f
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 259
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 260
    sget-object v0, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;

    goto :goto_a

    .line 263
    :cond_a
    const/4 v2, 0x0

    .line 266
    :goto_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 267
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->appDownloadApply(Lcom/unionpay/tsmservice/request/AppDownloadApplyRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 268
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 269
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 270
    const/4 v0, 0x1

    return v0

    .line 274
    :sswitch_10
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 276
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 277
    sget-object v0, Lcom/unionpay/tsmservice/request/AppDownloadRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/AppDownloadRequestParams;

    goto :goto_b

    .line 280
    :cond_b
    const/4 v2, 0x0

    .line 283
    :goto_b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 285
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmProgressCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmProgressCallback;

    move-result-object v4

    .line 286
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->appDownload(Lcom/unionpay/tsmservice/request/AppDownloadRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    move-result v5

    .line 287
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 288
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 289
    const/4 v0, 0x1

    return v0

    .line 293
    :sswitch_11
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 295
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 296
    sget-object v0, Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;

    goto :goto_c

    .line 299
    :cond_c
    const/4 v2, 0x0

    .line 302
    :goto_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 304
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmProgressCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmProgressCallback;

    move-result-object v4

    .line 305
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->uniteAppDownload(Lcom/unionpay/tsmservice/request/UniteAppDownloadRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    move-result v5

    .line 306
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 307
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 308
    const/4 v0, 0x1

    return v0

    .line 312
    :sswitch_12
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 314
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_d

    .line 315
    sget-object v0, Lcom/unionpay/tsmservice/request/AppDeleteRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/AppDeleteRequestParams;

    goto :goto_d

    .line 318
    :cond_d
    const/4 v2, 0x0

    .line 321
    :goto_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 323
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmProgressCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmProgressCallback;

    move-result-object v4

    .line 324
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->appDelete(Lcom/unionpay/tsmservice/request/AppDeleteRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    move-result v5

    .line 325
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 326
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 327
    const/4 v0, 0x1

    return v0

    .line 331
    :sswitch_13
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 333
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 334
    sget-object v0, Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;

    goto :goto_e

    .line 337
    :cond_e
    const/4 v2, 0x0

    .line 340
    :goto_e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 342
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmProgressCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmProgressCallback;

    move-result-object v4

    .line 343
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->uniteAppDelete(Lcom/unionpay/tsmservice/request/UniteAppDeleteRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    move-result v5

    .line 344
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 345
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 346
    const/4 v0, 0x1

    return v0

    .line 350
    :sswitch_14
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 352
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    .line 353
    sget-object v0, Lcom/unionpay/tsmservice/request/AppDataUpdateRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/AppDataUpdateRequestParams;

    goto :goto_f

    .line 356
    :cond_f
    const/4 v2, 0x0

    .line 359
    :goto_f
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 361
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmProgressCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmProgressCallback;

    move-result-object v4

    .line 362
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->appDataUpdate(Lcom/unionpay/tsmservice/request/AppDataUpdateRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    move-result v5

    .line 363
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 364
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 365
    const/4 v0, 0x1

    return v0

    .line 369
    :sswitch_15
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 371
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    .line 372
    sget-object v0, Lcom/unionpay/tsmservice/request/AppLockRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/AppLockRequestParams;

    goto :goto_10

    .line 375
    :cond_10
    const/4 v2, 0x0

    .line 378
    :goto_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 379
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->appLock(Lcom/unionpay/tsmservice/request/AppLockRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 380
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 381
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 382
    const/4 v0, 0x1

    return v0

    .line 386
    :sswitch_16
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 388
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_11

    .line 389
    sget-object v0, Lcom/unionpay/tsmservice/request/AppUnlockRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/AppUnlockRequestParams;

    goto :goto_11

    .line 392
    :cond_11
    const/4 v2, 0x0

    .line 395
    :goto_11
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 396
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->appUnlock(Lcom/unionpay/tsmservice/request/AppUnlockRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 397
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 398
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 399
    const/4 v0, 0x1

    return v0

    .line 403
    :sswitch_17
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 405
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_12

    .line 406
    sget-object v0, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;

    goto :goto_12

    .line 409
    :cond_12
    const/4 v2, 0x0

    .line 412
    :goto_12
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 413
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getSMSAuthCode(Lcom/unionpay/tsmservice/request/GetSMSAuthCodeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 414
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 415
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 416
    const/4 v0, 0x1

    return v0

    .line 420
    :sswitch_18
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 422
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_13

    .line 423
    sget-object v0, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;

    goto :goto_13

    .line 426
    :cond_13
    const/4 v2, 0x0

    .line 429
    :goto_13
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 430
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getActiveCode(Lcom/unionpay/tsmservice/request/GetActiveCodeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 431
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 432
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 433
    const/4 v0, 0x1

    return v0

    .line 437
    :sswitch_19
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 439
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_14

    .line 440
    sget-object v0, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;

    goto :goto_14

    .line 443
    :cond_14
    const/4 v2, 0x0

    .line 446
    :goto_14
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 447
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->uniteCardActive(Lcom/unionpay/tsmservice/request/UniteCardActiveRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 448
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 449
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 450
    const/4 v0, 0x1

    return v0

    .line 454
    :sswitch_1a
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 456
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 457
    sget-object v0, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;

    goto :goto_15

    .line 460
    :cond_15
    const/4 v2, 0x0

    .line 463
    :goto_15
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 464
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->eCashTopUp(Lcom/unionpay/tsmservice/request/ECashTopUpRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 465
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 466
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 467
    const/4 v0, 0x1

    return v0

    .line 471
    :sswitch_1b
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 473
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_16

    .line 474
    sget-object v0, Lcom/unionpay/tsmservice/request/GetTransRecordRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetTransRecordRequestParams;

    goto :goto_16

    .line 477
    :cond_16
    const/4 v2, 0x0

    .line 480
    :goto_16
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 481
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getTransRecord(Lcom/unionpay/tsmservice/request/GetTransRecordRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 482
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 483
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 484
    const/4 v0, 0x1

    return v0

    .line 488
    :sswitch_1c
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 490
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_17

    .line 491
    sget-object v0, Lcom/unionpay/tsmservice/request/GetAccountInfoRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetAccountInfoRequestParams;

    goto :goto_17

    .line 494
    :cond_17
    const/4 v2, 0x0

    .line 497
    :goto_17
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 498
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getAccountInfo(Lcom/unionpay/tsmservice/request/GetAccountInfoRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 499
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 500
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 501
    const/4 v0, 0x1

    return v0

    .line 505
    :sswitch_1d
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 507
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_18

    .line 508
    sget-object v0, Lcom/unionpay/tsmservice/request/GetAccountBalanceRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetAccountBalanceRequestParams;

    goto :goto_18

    .line 511
    :cond_18
    const/4 v2, 0x0

    .line 514
    :goto_18
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 515
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getAccountBalance(Lcom/unionpay/tsmservice/request/GetAccountBalanceRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 516
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 517
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 518
    const/4 v0, 0x1

    return v0

    .line 522
    :sswitch_1e
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 524
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v2

    .line 526
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 527
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getCardInfo([Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 528
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 529
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 530
    const/4 v0, 0x1

    return v0

    .line 534
    :sswitch_1f
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 536
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 538
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 539
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->setDefaultCard(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 540
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 541
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 542
    const/4 v0, 0x1

    return v0

    .line 546
    :sswitch_20
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 548
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v2

    .line 549
    invoke-virtual {p0, v2}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getDefaultCard(Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v3

    .line 550
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 551
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 552
    const/4 v0, 0x1

    return v0

    .line 556
    :sswitch_21
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 558
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 560
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 561
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->openChannel(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 562
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 563
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 564
    const/4 v0, 0x1

    return v0

    .line 568
    :sswitch_22
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 570
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_19

    .line 571
    sget-object v0, Lcom/unionpay/tsmservice/request/SendApduRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/SendApduRequestParams;

    goto :goto_19

    .line 574
    :cond_19
    const/4 v2, 0x0

    .line 577
    :goto_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 578
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->sendApdu(Lcom/unionpay/tsmservice/request/SendApduRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 579
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 580
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 581
    const/4 v0, 0x1

    return v0

    .line 585
    :sswitch_23
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 587
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 589
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 590
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->closeChannel(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 591
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 592
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 593
    const/4 v0, 0x1

    return v0

    .line 597
    :sswitch_24
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 599
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 601
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 602
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->hideAppApply(Ljava/lang/String;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 603
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 604
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 605
    const/4 v0, 0x1

    return v0

    .line 609
    :sswitch_25
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 611
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1a

    .line 612
    sget-object v0, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;

    goto :goto_1a

    .line 615
    :cond_1a
    const/4 v2, 0x0

    .line 618
    :goto_1a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 619
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->bleKeyExchange(Lcom/unionpay/tsmservice/request/BleKeyExchangeRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 620
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 621
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 622
    const/4 v0, 0x1

    return v0

    .line 626
    :sswitch_26
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 628
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1b

    .line 629
    sget-object v0, Lcom/unionpay/tsmservice/request/OpenCardApplyActivityRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/OpenCardApplyActivityRequestParams;

    goto :goto_1b

    .line 632
    :cond_1b
    const/4 v2, 0x0

    .line 635
    :goto_1b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmActivityCallback;

    move-result-object v3

    .line 637
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v4

    .line 638
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->openCardApplyActivity(Lcom/unionpay/tsmservice/request/OpenCardApplyActivityRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v5

    .line 639
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 640
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 641
    const/4 v0, 0x1

    return v0

    .line 645
    :sswitch_27
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 647
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1c

    .line 648
    sget-object v0, Lcom/unionpay/tsmservice/request/OpenCardDetailActivityRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/OpenCardDetailActivityRequestParams;

    goto :goto_1c

    .line 651
    :cond_1c
    const/4 v2, 0x0

    .line 654
    :goto_1c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmActivityCallback;

    move-result-object v3

    .line 655
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->openCardDetailActivity(Lcom/unionpay/tsmservice/request/OpenCardDetailActivityRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;)I

    move-result v4

    .line 656
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 657
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 658
    const/4 v0, 0x1

    return v0

    .line 662
    :sswitch_28
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 664
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1d

    .line 665
    sget-object v0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;

    goto :goto_1d

    .line 668
    :cond_1d
    const/4 v2, 0x0

    .line 671
    :goto_1d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmActivityCallback;

    move-result-object v3

    .line 673
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v4

    .line 674
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->openUniteCardApplyActivity(Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v5

    .line 675
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 676
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 677
    const/4 v0, 0x1

    return v0

    .line 681
    :sswitch_29
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 682
    invoke-virtual {p0}, Lcom/unionpay/tsmservice/ITsmService$Stub;->unbindBleService()V

    .line 683
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 684
    const/4 v0, 0x1

    return v0

    .line 688
    :sswitch_2a
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 690
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1e

    .line 691
    sget-object v0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    goto :goto_1e

    .line 694
    :cond_1e
    const/4 v2, 0x0

    .line 697
    :goto_1e
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 699
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/OnSafetyKeyboardCallback;

    move-result-object v4

    .line 701
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmActivityCallback;

    move-result-object v5

    .line 702
    invoke-virtual {p0, v2, v3, v4, v5}, Lcom/unionpay/tsmservice/ITsmService$Stub;->showSafetyKeyboard(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;ILcom/unionpay/tsmservice/OnSafetyKeyboardCallback;Lcom/unionpay/tsmservice/ITsmActivityCallback;)I

    move-result v6

    .line 703
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 704
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V

    .line 705
    const/4 v0, 0x1

    return v0

    .line 709
    :sswitch_2b
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 711
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1f

    .line 712
    sget-object v0, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;

    goto :goto_1f

    .line 715
    :cond_1f
    const/4 v2, 0x0

    .line 717
    :goto_1f
    invoke-virtual {p0, v2}, Lcom/unionpay/tsmservice/ITsmService$Stub;->setSafetyKeyboardBitmap(Lcom/unionpay/tsmservice/request/SafetyKeyboardRequestParams;)I

    move-result v3

    .line 718
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 719
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 720
    const/4 v0, 0x1

    return v0

    .line 724
    :sswitch_2c
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 726
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_20

    .line 727
    sget-object v0, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;

    goto :goto_20

    .line 730
    :cond_20
    const/4 v2, 0x0

    .line 733
    :goto_20
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 734
    invoke-virtual {p0, v2, v3}, Lcom/unionpay/tsmservice/ITsmService$Stub;->getEncryptData(Lcom/unionpay/tsmservice/request/GetEncryptDataRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v4

    .line 735
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 736
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 737
    const/4 v0, 0x1

    return v0

    .line 741
    :sswitch_2d
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 743
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 744
    invoke-virtual {p0, v2}, Lcom/unionpay/tsmservice/ITsmService$Stub;->clearEncryptData(I)I

    move-result v3

    .line 745
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 746
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 747
    const/4 v0, 0x1

    return v0

    .line 751
    :sswitch_2e
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 752
    invoke-virtual {p0}, Lcom/unionpay/tsmservice/ITsmService$Stub;->hideKeyboard()I

    move-result v2

    .line 753
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 754
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 755
    const/4 v0, 0x1

    return v0

    .line 759
    :sswitch_2f
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 761
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_21

    .line 762
    sget-object v0, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;

    goto :goto_21

    .line 765
    :cond_21
    const/4 v2, 0x0

    .line 768
    :goto_21
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v3

    .line 770
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmProgressCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmProgressCallback;

    move-result-object v4

    .line 771
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->executeCmd(Lcom/unionpay/tsmservice/request/ExecuteCmdRequestParams;Lcom/unionpay/tsmservice/ITsmCallback;Lcom/unionpay/tsmservice/ITsmProgressCallback;)I

    move-result v5

    .line 772
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 773
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 774
    const/4 v0, 0x1

    return v0

    .line 778
    :sswitch_30
    const-string v0, "com.unionpay.tsmservice.ITsmService"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 780
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_22

    .line 781
    sget-object v0, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;

    goto :goto_22

    .line 784
    :cond_22
    const/4 v2, 0x0

    .line 787
    :goto_22
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmActivityCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmActivityCallback;

    move-result-object v3

    .line 789
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lcom/unionpay/tsmservice/ITsmCallback$Stub;->asInterface(Landroid/os/IBinder;)Lcom/unionpay/tsmservice/ITsmCallback;

    move-result-object v4

    .line 790
    invoke-virtual {p0, v2, v3, v4}, Lcom/unionpay/tsmservice/ITsmService$Stub;->openUniteCardApplyActivityWithRiskInfo(Lcom/unionpay/tsmservice/request/OpenUniteCardApplyActivityWithRiskInfoRequestParams;Lcom/unionpay/tsmservice/ITsmActivityCallback;Lcom/unionpay/tsmservice/ITsmCallback;)I

    move-result v5

    .line 791
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 792
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 793
    const/4 v0, 0x1

    return v0

    .line 796
    :goto_23
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xa -> :sswitch_a
        0xb -> :sswitch_b
        0xc -> :sswitch_c
        0xd -> :sswitch_d
        0xe -> :sswitch_e
        0xf -> :sswitch_f
        0x10 -> :sswitch_10
        0x11 -> :sswitch_11
        0x12 -> :sswitch_12
        0x13 -> :sswitch_13
        0x14 -> :sswitch_14
        0x15 -> :sswitch_15
        0x16 -> :sswitch_16
        0x17 -> :sswitch_17
        0x18 -> :sswitch_18
        0x19 -> :sswitch_19
        0x1a -> :sswitch_1a
        0x1b -> :sswitch_1b
        0x1c -> :sswitch_1c
        0x1d -> :sswitch_1d
        0x1e -> :sswitch_1e
        0x1f -> :sswitch_1f
        0x20 -> :sswitch_20
        0x21 -> :sswitch_21
        0x22 -> :sswitch_22
        0x23 -> :sswitch_23
        0x24 -> :sswitch_24
        0x25 -> :sswitch_25
        0x26 -> :sswitch_26
        0x27 -> :sswitch_27
        0x28 -> :sswitch_28
        0x29 -> :sswitch_29
        0x2a -> :sswitch_2a
        0x2b -> :sswitch_2b
        0x2c -> :sswitch_2c
        0x2d -> :sswitch_2d
        0x2e -> :sswitch_2e
        0x2f -> :sswitch_2f
        0x30 -> :sswitch_30
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
