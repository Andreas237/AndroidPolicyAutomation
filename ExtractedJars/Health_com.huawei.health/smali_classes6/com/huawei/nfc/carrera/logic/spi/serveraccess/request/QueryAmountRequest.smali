.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
.source "SourceFile"


# static fields
.field public static final FLAG_ISSUE:Ljava/lang/String; = "3"

.field public static final FLAG_ISSUE_RECHARGE:Ljava/lang/String; = "1"

.field public static final FLAG_RECHARGE:Ljava/lang/String; = "2"


# instance fields
.field private flag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->flag:Ljava/lang/String;

    .line 39
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->setIssuerId(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->setCplc(Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->setAppletAid(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 43
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 44
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->flag:Ljava/lang/String;

    .line 45
    return-void
.end method


# virtual methods
.method public getFlag()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->flag:Ljava/lang/String;

    return-object v0
.end method

.method public setFlag(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->flag:Ljava/lang/String;

    .line 55
    return-void
.end method
