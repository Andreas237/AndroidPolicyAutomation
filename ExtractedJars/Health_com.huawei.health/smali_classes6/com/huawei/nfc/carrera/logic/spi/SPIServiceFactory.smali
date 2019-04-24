.class public Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createFMService myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 42
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMAIDUtil;->setAid(Ljava/lang/String;)V

    .line 43
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/impl/FMServiceImpl;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    return-object v0
.end method

.method public static createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;
    .locals 1

    .line 55
    const-string v0, "createServerAccessService start"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 56
    const-string v0, "TransportationCard"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    return-object v0
.end method
