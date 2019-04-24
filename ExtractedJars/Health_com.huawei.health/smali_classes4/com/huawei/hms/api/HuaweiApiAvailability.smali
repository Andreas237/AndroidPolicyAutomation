.class public abstract Lcom/huawei/hms/api/HuaweiApiAvailability;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ACTIVITY_NAME:Ljava/lang/String; = "com.huawei.hms.core.activity.JumpActivity"

.field public static final APPID_HMS:Ljava/lang/String; = "C10132067"

.field public static final HMS_API_NAME_GAME:Ljava/lang/String; = "HuaweiGame.API"

.field public static final HMS_API_NAME_ID:Ljava/lang/String; = "HuaweiID.API"

.field public static final HMS_API_NAME_OD:Ljava/lang/String; = "HuaweiOpenDevice.API"

.field public static final HMS_API_NAME_PAY:Ljava/lang/String; = "HuaweiPay.API"

.field public static final HMS_API_NAME_PUSH:Ljava/lang/String; = "HuaweiPush.API"

.field public static final HMS_API_NAME_SNS:Ljava/lang/String; = "HuaweiSns.API"

.field public static final HMS_SDK_VERSION_CODE:I = 0x13a59d4

.field public static final HMS_SDK_VERSION_NAME:Ljava/lang/String; = "2.6.1.300"

.field public static final HMS_VERSION_CODE_GAME:I = 0x138d9d8

.field public static final HMS_VERSION_CODE_ID:I = 0x138d9d8

.field public static final HMS_VERSION_CODE_MIN:I = 0x138d9d8

.field public static final HMS_VERSION_CODE_OD:I = 0x13a58a8

.field public static final HMS_VERSION_CODE_PAY:I = 0x138d9d8

.field public static final HMS_VERSION_CODE_PUSH:I = 0x138d9d8

.field public static final HMS_VERSION_CODE_SNS:I = 0x138d9d8

.field public static final HMS_VERSION_MAX:I = 0x13a54c0

.field public static final HMS_VERSION_MIN:I = 0x138d9d8

.field public static final NOTICE_VERSION_CODE:I = 0x13a54c0

.field public static final SERVICES_ACTION:Ljava/lang/String; = "com.huawei.hms.core.aidlservice"

.field public static final SERVICES_PACKAGE:Ljava/lang/String; = "com.huawei.hwid"

.field public static final SERVICES_SIGNATURE:Ljava/lang/String; = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05"

.field private static a:I = 0x0

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 68
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->b:Ljava/util/Map;

    .line 71
    sget-object v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->b:Ljava/util/Map;

    const-string v1, "HuaweiID.API"

    const v2, 0x138d9d8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    sget-object v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->b:Ljava/util/Map;

    const-string v1, "HuaweiSns.API"

    const v2, 0x138d9d8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    sget-object v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->b:Ljava/util/Map;

    const-string v1, "HuaweiPay.API"

    const v2, 0x138d9d8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    sget-object v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->b:Ljava/util/Map;

    const-string v1, "HuaweiPush.API"

    const v2, 0x138d9d8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    sget-object v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->b:Ljava/util/Map;

    const-string v1, "HuaweiGame.API"

    const v2, 0x138d9d8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    sget-object v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->b:Ljava/util/Map;

    const-string v1, "HuaweiOpenDevice.API"

    const v2, 0x13a58a8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getApiMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 66
    sget-object v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->b:Ljava/util/Map;

    return-object v0
.end method

.method public static getInstance()Lcom/huawei/hms/api/HuaweiApiAvailability;
    .locals 1

    .line 94
    invoke-static {}, Lcom/huawei/hms/api/d;->a()Lcom/huawei/hms/api/d;

    move-result-object v0

    return-object v0
.end method

.method public static getServicesVersionCode()I
    .locals 1

    .line 98
    sget v0, Lcom/huawei/hms/api/HuaweiApiAvailability;->a:I

    return v0
.end method

.method public static setServicesVersionCode(I)V
    .locals 0

    .line 102
    sput p0, Lcom/huawei/hms/api/HuaweiApiAvailability;->a:I

    .line 103
    return-void
.end method


# virtual methods
.method public abstract isHuaweiMobileNoticeAvailable(Landroid/content/Context;)I
.end method

.method public abstract isHuaweiMobileServicesAvailable(Landroid/content/Context;I)I
.end method

.method public abstract isUserResolvableError(I)Z
.end method

.method public abstract resolveError(Landroid/app/Activity;II)V
.end method
