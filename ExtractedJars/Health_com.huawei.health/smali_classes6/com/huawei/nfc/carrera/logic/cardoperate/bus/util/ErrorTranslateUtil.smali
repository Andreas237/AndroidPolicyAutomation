.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/util/ErrorTranslateUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final IS_NEW_RETURN_CODE:I = 0x989680

.field public static final OPERATE_BUSINESS_ERROR:I = 0xd

.field public static final OPERATE_CHIP_ERROR:I = 0xc

.field public static final OPERATE_CONNECT_ERROR:I = 0xb

.field public static final OPERATE_NET_ERROR:I = 0xa

.field public static final OPERATE_OTHER_ERROR:I = 0xe


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static translateCreateSSDErrorCode(IIZ)I
    .locals 3

    .line 76
    if-eqz p2, :cond_0

    .line 78
    mul-int/lit8 v0, p0, 0xa

    add-int/lit8 v2, v0, 0x1

    goto :goto_0

    .line 82
    :cond_0
    mul-int/lit8 v0, p0, 0xa

    add-int/lit8 v2, v0, 0x2

    .line 84
    :goto_0
    const v0, 0x186a0

    mul-int/2addr v0, v2

    add-int/2addr v0, p1

    return v0
.end method

.method public static translateErrorCode(II)I
    .locals 1

    .line 70
    const v0, 0x186a0

    mul-int/2addr v0, p0

    add-int/2addr v0, p1

    return v0
.end method

.method public static translateServerAccessErrorCode(II)I
    .locals 3

    .line 39
    if-gez p1, :cond_0

    .line 43
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit16 v2, v0, 0x2774

    goto :goto_0

    .line 45
    :cond_0
    if-lez p1, :cond_1

    const/16 v0, 0x64

    if-ge p1, v0, :cond_1

    .line 50
    add-int/lit16 v2, p1, 0x2710

    goto :goto_0

    .line 52
    :cond_1
    const/16 v0, 0x1770

    if-le p1, v0, :cond_2

    const/16 v0, 0x1b58

    if-ge p1, v0, :cond_2

    .line 55
    rem-int/lit16 v0, p1, 0x3e8

    add-int/lit16 v2, v0, 0x2ee0

    goto :goto_0

    .line 62
    :cond_2
    rem-int/lit16 v0, p1, 0x3e8

    add-int/lit16 v2, v0, 0x32c8

    .line 65
    :goto_0
    invoke-static {p0, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/util/ErrorTranslateUtil;->translateErrorCode(II)I

    move-result v0

    return v0
.end method
