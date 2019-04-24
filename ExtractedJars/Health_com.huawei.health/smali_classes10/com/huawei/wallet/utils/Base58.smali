.class public Lcom/huawei/wallet/utils/Base58;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[C

.field private static final c:I

.field private static final d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 20
    const-string v0, "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lcom/huawei/wallet/utils/Base58;->a:[C

    .line 21
    sget-object v0, Lcom/huawei/wallet/utils/Base58;->a:[C

    array-length v0, v0

    sput v0, Lcom/huawei/wallet/utils/Base58;->c:I

    .line 25
    const/16 v0, 0x80

    new-array v0, v0, [I

    sput-object v0, Lcom/huawei/wallet/utils/Base58;->d:[I

    .line 27
    const/4 v2, 0x0

    :goto_0
    sget-object v0, Lcom/huawei/wallet/utils/Base58;->d:[I

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 28
    sget-object v0, Lcom/huawei/wallet/utils/Base58;->d:[I

    const/4 v1, -0x1

    aput v1, v0, v2

    .line 27
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x0

    :goto_1
    sget-object v0, Lcom/huawei/wallet/utils/Base58;->a:[C

    array-length v0, v0

    if-ge v2, v0, :cond_1

    .line 31
    sget-object v0, Lcom/huawei/wallet/utils/Base58;->d:[I

    sget-object v1, Lcom/huawei/wallet/utils/Base58;->a:[C

    aget-char v1, v1, v2

    aput v2, v0, v1

    .line 30
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 33
    :cond_1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
