.class public Lcom/huawei/wallet/logic/tlv/TlvConstant;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final c:[Ljava/lang/String;

.field static final d:[B

.field static final e:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 5
    const/16 v0, 0xe

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/wallet/logic/tlv/TlvConstant;->d:[B

    .line 21
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "00B2011400"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "00B2020C00"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "00B2011C00"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/wallet/logic/tlv/TlvConstant;->e:[Ljava/lang/String;

    .line 24
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "00B2016400"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "00B2026400"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "00B2036400"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "00B2046400"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "00B2056400"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "00B2066400"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "00B2076400"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "00B2086400"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "00B2096400"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "00B20A6400"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/wallet/logic/tlv/TlvConstant;->c:[Ljava/lang/String;

    return-void

    :array_0
    .array-data 1
        0x32t
        0x50t
        0x41t
        0x59t
        0x2et
        0x53t
        0x59t
        0x53t
        0x2et
        0x44t
        0x44t
        0x46t
        0x30t
        0x31t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
