.class public Lcom/huawei/hwid/core/helper/handler/ErrorStatus;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final ACCOUNT_NON_LOGIN:I = 0x1f

.field public static final ACCOUNT_NOT_EXIST:I = 0xd

.field public static final AREA_NOT_ALLOW:I = 0x17

.field public static final BIND_SERVICE_SYSTEM_ERROR:I = 0x28

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwid/core/helper/handler/ErrorStatus;>;"
        }
    .end annotation
.end field

.field public static final ERRORSTATUS_NULL:I = 0x20

.field public static final ERROR_ACCESS:I = 0xf

.field public static final ERROR_AUTH_EXCEPTION:I = 0xbbb

.field public static final ERROR_CHANGE_HOME_COUNTRY:I = 0x2d

.field public static final ERROR_HEAD_PIC_NOT_EXIST:I = 0x2f

.field public static final ERROR_HWID_IS_LOW_VERSION:I = 0x23

.field public static final ERROR_HWID_IS_NOT_EXIT:I = 0x22

.field public static final ERROR_HWID_UPLOAD_HEADPIC:I = 0x25

.field public static final ERROR_IO_EXCEPTION:I = 0xbbc

.field public static final ERROR_LOGOUT_FAILED:I = 0x13

.field public static final ERROR_NETWORK_UNAVIABLE:I = 0x5

.field public static final ERROR_NOT_USE_APK:I = 0x21

.field public static final ERROR_NO_SEND_SMS_PERMISSION:I = 0x11

.field public static final ERROR_NO_SIM:I = 0x6

.field public static final ERROR_OPER_CANCEL:I = 0xbba

.field public static final ERROR_PARAM_INVALID:I = 0xc

.field public static final ERROR_PARMS:I = 0x2c

.field public static final ERROR_PHONE_NOT_EXIST:I = 0x2e

.field public static final ERROR_PKG_NOT_IN_HWIDLIST:I = 0x2b

.field public static final ERROR_SAVE_LOGOUT_INTENT:I = 0x26

.field public static final ERROR_UNACTIVE_ACCOUNT:I = 0x29

.field public static final ERROR_USERID_NOT_MATCH_SYSTEM:I = 0x2a

.field public static final HWID_NOT_ALLOW:I = 0x18

.field public static final HWID_NOT_SUPPORT:I = 0x14

.field public static final ILLEGAL_ARGUMENT_EXCEPTION:I = 0x3ea

.field public static final LOGIN_TIMEOUT:I = 0x27

.field public static final PERMISSION_NOT_ALLOW:I = 0x1b

.field public static final QUICKLOGIN_NOT_SUPPORT:I = 0x15

.field public static final READ_PHONE_STATE_NOT_ALLOW:I = 0x1c

.field public static final REQUEST_NOT_ALLOW:I = 0x19

.field public static final SDK_NOT_SUPPORT_THIRD:I = 0x16

.field public static final SERVICETOKEN_INVALID:I = 0x1e

.field public static final SIGNATURE_INVALID:I = 0x1d

.field public static final ST_STATUS_INVALID:Ljava/lang/String; = "1"

.field public static final ST_STATUS_VALID:Ljava/lang/String; = "0"

.field public static final THIRD_ACCOUNT_NOT_ALLOW:I = 0x1a


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 132
    new-instance v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus$1;

    invoke-direct {v0}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus$1;-><init>()V

    sput-object v0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    iput p1, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->a:I

    .line 119
    iput-object p2, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->b:Ljava/lang/String;

    .line 120
    return-void
.end method

.method static synthetic a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;I)I
    .locals 0

    .line 10
    iput p1, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->a:I

    return p1
.end method

.method static synthetic a(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->b:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 124
    const/4 v0, 0x0

    return v0
.end method

.method public getErrorCode()I
    .locals 1

    .line 147
    iget v0, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->a:I

    return v0
.end method

.method public getErrorReason()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->b:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[ErrorCode]:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 128
    iget v0, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 129
    iget-object v0, p0, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 130
    return-void
.end method
