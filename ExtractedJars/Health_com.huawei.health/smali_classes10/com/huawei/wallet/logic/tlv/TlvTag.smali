.class public Lcom/huawei/wallet/logic/tlv/TlvTag;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final c:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-static {p1}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->a(Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    .line 37
    return-void
.end method

.method public constructor <init>([BII)V
    .locals 2

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-array v1, p3, [B

    .line 12
    const/4 v0, 0x0

    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    iput-object v1, p0, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    .line 14
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 47
    if-ne p0, p1, :cond_0

    .line 48
    const/4 v0, 0x1

    return v0

    .line 49
    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 50
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 52
    :cond_2
    move-object v2, p1

    check-cast v2, Lcom/huawei/wallet/logic/tlv/TlvTag;

    .line 54
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    iget-object v1, v2, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/huawei/wallet/logic/tlv/TlvTag;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "+ "

    goto :goto_0

    :cond_0
    const-string v1, "- "

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    iget-object v2, p0, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->a([BII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
