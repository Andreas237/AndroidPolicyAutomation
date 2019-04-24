.class public Lcom/huawei/wallet/logic/tlv/TlvBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/math/BigDecimal;

.field private static final e:Ljava/nio/charset/Charset;


# instance fields
.field private final a:I

.field private c:I

.field private d:[B

.field private final i:Lcom/huawei/wallet/logic/tlv/TlvTag;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 11
    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->e:Ljava/nio/charset/Charset;

    .line 13
    new-instance v0, Ljava/math/BigDecimal;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(I)V

    sput-object v0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->b:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 19
    const/4 v0, 0x0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/wallet/logic/tlv/TlvBuilder;-><init>(Lcom/huawei/wallet/logic/tlv/TlvTag;)V

    .line 20
    return-void
.end method

.method public constructor <init>(Lcom/huawei/wallet/logic/tlv/TlvTag;)V
    .locals 2

    .line 24
    const/16 v0, 0x400

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/wallet/logic/tlv/TlvBuilder;-><init>(Lcom/huawei/wallet/logic/tlv/TlvTag;[BI)V

    .line 25
    return-void
.end method

.method public constructor <init>(Lcom/huawei/wallet/logic/tlv/TlvTag;[BI)V
    .locals 4

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 327
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->d:[B

    .line 38
    iput-object p1, p0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->i:Lcom/huawei/wallet/logic/tlv/TlvTag;

    .line 39
    if-eqz p2, :cond_0

    .line 41
    array-length v0, p2

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->d:[B

    .line 42
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->d:[B

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 46
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->d:[B

    .line 48
    :goto_0
    iput p3, p0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->c:I

    .line 49
    iput p3, p0, Lcom/huawei/wallet/logic/tlv/TlvBuilder;->a:I

    .line 50
    return-void
.end method
