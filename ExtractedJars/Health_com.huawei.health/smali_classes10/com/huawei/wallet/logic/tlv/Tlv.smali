.class public Lcom/huawei/wallet/logic/tlv/Tlv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Ljava/nio/charset/Charset;


# instance fields
.field private final a:Lcom/huawei/wallet/logic/tlv/TlvTag;

.field private d:[B

.field protected final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/wallet/logic/tlv/Tlv;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/huawei/wallet/logic/tlv/Tlv;->c:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/wallet/logic/tlv/TlvTag;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/wallet/logic/tlv/TlvTag;Ljava/util/List<Lcom/huawei/wallet/logic/tlv/Tlv;>;)V"
        }
    .end annotation

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    const-string v0, "Tlv"

    const-string v1, "enter Tlv"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    iput-object p1, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->a:Lcom/huawei/wallet/logic/tlv/TlvTag;

    .line 66
    iput-object p2, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->e:Ljava/util/List;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    .line 68
    const-string v0, "Tlv"

    const-string v1, "end Tlv"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    return-void
.end method

.method public constructor <init>(Lcom/huawei/wallet/logic/tlv/TlvTag;[B)V
    .locals 4

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->a:Lcom/huawei/wallet/logic/tlv/TlvTag;

    .line 32
    if-eqz p2, :cond_1

    .line 34
    const-string v0, "Tlv"

    const-string v1, "judge"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    array-length v0, p2

    if-lez v0, :cond_0

    .line 37
    const-string v0, "Tlv"

    const-string v1, "judge"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    array-length v0, p2

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    iget-object v1, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 44
    :cond_0
    const-string v0, "Tlv"

    const-string v1, "judge else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    goto :goto_0

    .line 50
    :cond_1
    const-string v0, "Tlv"

    const-string v1, "judge else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    .line 53
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->e:Ljava/util/List;

    .line 54
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/wallet/logic/tlv/TlvTag;
    .locals 2

    .line 87
    const-string v0, "Tlv"

    const-string v1, "enter getTag"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->a:Lcom/huawei/wallet/logic/tlv/TlvTag;

    return-object v0
.end method

.method public b(Lcom/huawei/wallet/logic/tlv/TlvTag;)Lcom/huawei/wallet/logic/tlv/Tlv;
    .locals 5

    .line 127
    const-string v0, "Tlv"

    const-string v1, "enter find"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    invoke-virtual {p0}, Lcom/huawei/wallet/logic/tlv/Tlv;->a()Lcom/huawei/wallet/logic/tlv/TlvTag;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/wallet/logic/tlv/TlvTag;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    const-string v0, "Tlv"

    const-string v1, "aTag is getTag"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    return-object p0

    .line 134
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/wallet/logic/tlv/Tlv;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 136
    const-string v0, "Tlv"

    const-string v1, "judge isConstructed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/wallet/logic/tlv/Tlv;

    .line 139
    invoke-virtual {v3, p1}, Lcom/huawei/wallet/logic/tlv/Tlv;->b(Lcom/huawei/wallet/logic/tlv/TlvTag;)Lcom/huawei/wallet/logic/tlv/Tlv;

    move-result-object v4

    .line 140
    if-eqz v4, :cond_1

    .line 142
    return-object v4

    .line 144
    :cond_1
    goto :goto_0

    .line 145
    :cond_2
    const-string v0, "Tlv"

    const-string v1, "judge isConstructed finish"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_3
    const-string v0, "Tlv"

    const-string v1, "exit find"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 149
    const/4 v0, 0x0

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 3

    .line 165
    const-string v0, "Tlv"

    const-string v1, "enter getHexValue"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 166
    invoke-virtual {p0}, Lcom/huawei/wallet/logic/tlv/Tlv;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 167
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Tag is CONSTRUCTED "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->a:Lcom/huawei/wallet/logic/tlv/TlvTag;

    iget-object v2, v2, Lcom/huawei/wallet/logic/tlv/TlvTag;->c:[B

    invoke-static {v2}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 168
    :cond_0
    const-string v0, "Tlv"

    const-string v1, "exit getHexValue"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 169
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    invoke-static {v0}, Lcom/huawei/wallet/logic/tlv/TlvUtil;->d([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 2

    .line 99
    const-string v0, "Tlv"

    const-string v1, "enter isConstructed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->a:Lcom/huawei/wallet/logic/tlv/TlvTag;

    invoke-virtual {v0}, Lcom/huawei/wallet/logic/tlv/TlvTag;->a()Z

    move-result v0

    return v0
.end method

.method public e()[B
    .locals 5

    .line 203
    const-string v0, "Tlv"

    const-string v1, "enter getBytesValue"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    invoke-virtual {p0}, Lcom/huawei/wallet/logic/tlv/Tlv;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 206
    const-string v0, "Tlv"

    const-string v1, "judge isConstructed"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "TLV ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->a:Lcom/huawei/wallet/logic/tlv/TlvTag;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "]is constructed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 209
    :cond_0
    const-string v0, "Tlv"

    const-string v1, "midle"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 210
    const/4 v4, 0x0

    .line 211
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    if-eqz v0, :cond_2

    .line 213
    const-string v0, "Tlv"

    const-string v1, "judge theValue is not null"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 214
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    array-length v0, v0

    if-lez v0, :cond_1

    .line 216
    const-string v0, "Tlv"

    const-string v1, "theValue.lenght"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    array-length v0, v0

    new-array v4, v0, [B

    .line 218
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    array-length v1, v4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v4, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 222
    :cond_1
    const-string v0, "Tlv"

    const-string v1, "enter else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    const/4 v0, 0x0

    new-array v4, v0, [B

    goto :goto_0

    .line 228
    :cond_2
    const-string v0, "Tlv"

    const-string v1, "enter else"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 229
    const/4 v4, 0x0

    .line 231
    :goto_0
    const-string v0, "Tlv"

    const-string v1, "exit getBytesValue"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    return-object v4
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 74
    const-string v0, "Tlv"

    const-string v1, "enter toString"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BerTlv{theTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->a:Lcom/huawei/wallet/logic/tlv/TlvTag;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", theValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->d:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", theList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/tlv/Tlv;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
