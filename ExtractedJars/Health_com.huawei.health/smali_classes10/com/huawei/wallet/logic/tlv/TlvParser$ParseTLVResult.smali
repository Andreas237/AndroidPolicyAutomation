.class Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/wallet/logic/tlv/TlvParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ParseTLVResult"
.end annotation


# instance fields
.field private final a:Lcom/huawei/wallet/logic/tlv/Tlv;

.field private final e:I


# direct methods
.method public constructor <init>(Lcom/huawei/wallet/logic/tlv/Tlv;I)V
    .locals 0

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 227
    iput-object p1, p0, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->a:Lcom/huawei/wallet/logic/tlv/Tlv;

    .line 228
    iput p2, p0, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->e:I

    .line 229
    return-void
.end method

.method static synthetic c(Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;)I
    .locals 1

    .line 223
    iget v0, p0, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->e:I

    return v0
.end method

.method static synthetic e(Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;)Lcom/huawei/wallet/logic/tlv/Tlv;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->a:Lcom/huawei/wallet/logic/tlv/Tlv;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 234
    const-string v0, "TlvParser"

    const-string v1, "enter toStrign"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ParseTLVResult{tlv="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->a:Lcom/huawei/wallet/logic/tlv/Tlv;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/wallet/logic/tlv/TlvParser$ParseTLVResult;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
