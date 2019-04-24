.class public Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;
.super Lcom/huawei/hms/support/api/client/Result;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;


# instance fields
.field private b:Ljava/lang/String;

.field private c:J

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/PurchaseInfo;>;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const-string v0, "PurchaseInfoResult"

    sput-object v0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/Result;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;)V
    .locals 7

    .line 45
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/Result;-><init>()V

    .line 46
    if-nez p1, :cond_0

    .line 47
    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    const-string v1, "purchaseinfo resp is null"

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 48
    return-void

    .line 51
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;->getRtnCode()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->b:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;->getPageCount()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->c:J

    .line 53
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;->getPurchaseInfoList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->d:Ljava/util/List;

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;->getSign()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->e:Ljava/lang/String;

    .line 56
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;->getCommonStatus()Lcom/huawei/hms/support/api/client/Status;

    move-result-object v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    invoke-virtual {p0, v3}, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    goto :goto_1

    .line 61
    :cond_1
    const/4 v4, -0x1

    .line 62
    const/4 v5, 0x0

    .line 63
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 65
    :try_start_0
    invoke-virtual {p1}, Lcom/huawei/hms/support/api/entity/pay/PurchaseInfoResp;->getRtnCode()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 69
    goto :goto_0

    .line 66
    :catch_0
    move-exception v6

    .line 67
    sget-object v0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPurchaseInfo parseInt exception :"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hms/support/log/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "parse purchaseinfo code exception, source code:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 69
    goto :goto_0

    .line 71
    :cond_2
    const-string v5, "purchaseinfo rtnCode is null"

    .line 74
    :goto_0
    new-instance v0, Lcom/huawei/hms/support/api/client/Status;

    invoke-direct {v0, v4, v5}, Lcom/huawei/hms/support/api/client/Status;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->setStatus(Lcom/huawei/hms/support/api/client/Status;)V

    .line 76
    :goto_1
    return-void
.end method


# virtual methods
.method public getPageCount()J
    .locals 2

    .line 99
    iget-wide v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->c:J

    return-wide v0
.end method

.method public getPurchaseInfoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/PurchaseInfo;>;"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->d:Ljava/util/List;

    return-object v0
.end method

.method public getRtnCode()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->b:Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->e:Ljava/lang/String;

    return-object v0
.end method

.method public setPageCount(J)V
    .locals 0

    .line 107
    iput-wide p1, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->c:J

    .line 108
    return-void
.end method

.method public setPurchaseInfoList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/PurchaseInfo;>;)V"
        }
    .end annotation

    .line 123
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->d:Ljava/util/List;

    .line 124
    return-void
.end method

.method public setRtnCode(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->b:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/PurchaseInfoResult;->e:Ljava/lang/String;

    .line 140
    return-void
.end method
