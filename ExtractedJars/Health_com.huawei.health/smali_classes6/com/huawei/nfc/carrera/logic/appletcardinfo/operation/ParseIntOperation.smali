.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ParseIntOperation;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;-><init>()V

    .line 17
    return-void
.end method


# virtual methods
.method public handleData(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ParseIntOperation;->param:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 24
    new-instance v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;

    const-string v1, " ParseIntOperation param is null"

    const/4 v2, 0x2

    invoke-direct {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;-><init>(ILjava/lang/String;)V

    throw v0

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/ParseIntOperation;->param:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 28
    new-instance v0, Ljava/math/BigInteger;

    invoke-direct {v0, p1, v3}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    move-result v4

    .line 29
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
