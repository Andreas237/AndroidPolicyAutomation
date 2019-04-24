.class public Lcom/huawei/wallet/logic/tlv/Tlvs;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/wallet/logic/tlv/Tlv;>;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/wallet/logic/tlv/Tlv;>;)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/huawei/wallet/logic/tlv/Tlvs;->d:Ljava/util/List;

    .line 13
    return-void
.end method


# virtual methods
.method public d(Lcom/huawei/wallet/logic/tlv/TlvTag;)Lcom/huawei/wallet/logic/tlv/Tlv;
    .locals 4

    .line 17
    iget-object v0, p0, Lcom/huawei/wallet/logic/tlv/Tlvs;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/wallet/logic/tlv/Tlv;

    .line 19
    invoke-virtual {v2, p1}, Lcom/huawei/wallet/logic/tlv/Tlv;->b(Lcom/huawei/wallet/logic/tlv/TlvTag;)Lcom/huawei/wallet/logic/tlv/Tlv;

    move-result-object v3

    .line 20
    if-eqz v3, :cond_0

    .line 22
    return-object v3

    .line 24
    :cond_0
    goto :goto_0

    .line 25
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
