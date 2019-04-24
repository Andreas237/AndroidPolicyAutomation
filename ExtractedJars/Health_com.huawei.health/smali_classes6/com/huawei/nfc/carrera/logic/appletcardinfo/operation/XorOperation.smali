.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/XorOperation;
.super Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;-><init>()V

    .line 14
    return-void
.end method


# virtual methods
.method public handleData(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/huawei/nfc/carrera/logic/appletcardinfo/exception/AppletCardException;
        }
    .end annotation

    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 20
    const/4 v0, 0x0

    aget-char v0, v1, v0

    invoke-static {v0}, Ljava/lang/Character;->getNumericValue(C)I

    move-result v2

    .line 21
    const/4 v3, 0x1

    :goto_0
    array-length v0, v1

    if-ge v3, v0, :cond_0

    .line 23
    aget-char v0, v1, v3

    invoke-static {v0}, Ljava/lang/Character;->getNumericValue(C)I

    move-result v0

    xor-int/2addr v2, v0

    .line 21
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
