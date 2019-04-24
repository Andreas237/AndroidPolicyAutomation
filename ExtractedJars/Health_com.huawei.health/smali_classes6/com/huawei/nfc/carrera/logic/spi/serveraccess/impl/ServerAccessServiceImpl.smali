.class public final Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;


# static fields
.field private static final SYNC_LOCK:[B

.field private static final TAG:Ljava/lang/String; = "ServerAccessServiceImpl"

.field private static volatile instance:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl; = null


# instance fields
.field private cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

.field private mContext:Landroid/content/Context;

.field private omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 88
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;

    .line 90
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->SYNC_LOCK:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->mContext:Landroid/content/Context;

    .line 92
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    .line 94
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    .line 98
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->mContext:Landroid/content/Context;

    .line 99
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/oma/OmaApduManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    .line 101
    return-void
.end method

.method private changeApduCommand2ServerAccessAPDU(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;Z)Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;"
        }
    .end annotation

    .line 620
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 621
    const/4 v3, 0x0

    .line 623
    if-eqz p2, :cond_3

    .line 624
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 626
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getIndex()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getIndex()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 627
    goto/16 :goto_2

    .line 630
    :cond_0
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;-><init>()V

    .line 631
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getIndex()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->setApduId(Ljava/lang/String;)V

    .line 632
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getSw()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 633
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getRapdu()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getSw()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->setApduContent(Ljava/lang/String;)V

    .line 634
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getSw()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->setApduStatus(Ljava/lang/String;)V

    .line 635
    if-nez p3, :cond_2

    .line 638
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->setCommand(Ljava/lang/String;)V

    .line 639
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getChecker()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->setChecker(Ljava/lang/String;)V

    goto :goto_1

    .line 642
    :cond_1
    const-string v0, ""

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->setApduContent(Ljava/lang/String;)V

    .line 643
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->setApduStatus(Ljava/lang/String;)V

    .line 645
    :cond_2
    :goto_1
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 646
    goto/16 :goto_0

    .line 649
    :cond_3
    :goto_2
    return-object v2
.end method

.method private changeServerAccessAPDU2ApduCommand(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;>;"
        }
    .end annotation

    .line 592
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 593
    const/4 v5, 0x0

    .line 594
    const/4 v6, 0x0

    .line 595
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    .line 596
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduId()Ljava/lang/String;

    move-result-object v6

    .line 597
    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 598
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl changeServerAccessAPDU2ApduCommand, invalid apduId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 599
    goto :goto_0

    .line 602
    :cond_0
    :try_start_0
    new-instance v5, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;-><init>()V

    .line 603
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->setIndex(I)V

    .line 604
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->setApdu(Ljava/lang/String;)V

    .line 605
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduStatus()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 606
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduStatus()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[|]"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->setChecker([Ljava/lang/String;)V

    .line 608
    :cond_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 609
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl apduCommand, apduid"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getIndex()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "apducontent"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "apdustatus"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getChecker()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 613
    goto :goto_1

    .line 610
    :catch_0
    move-exception v9

    .line 611
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl changeServerAccessAPDU2ApduCommand, NumberFormatException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 612
    goto/16 :goto_0

    .line 614
    :goto_1
    goto/16 :goto_0

    .line 616
    :cond_2
    return-object v4
.end method

.method private executeCommand(Ljava/lang/String;Ljava/util/List;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;>;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V"
        }
    .end annotation

    .line 509
    move-object/from16 v0, p1

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 511
    :cond_0
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl executeCommand, invalid param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultCode(I)V

    .line 513
    const-string v0, "client check, invalid param"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 514
    return-void

    .line 517
    :cond_1
    const/4 v9, 0x0

    .line 518
    const/4 v10, 0x0

    .line 519
    const/4 v11, 0x0

    .line 520
    const/4 v12, 0x0

    .line 523
    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->changeServerAccessAPDU2ApduCommand(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    .line 524
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->omaService:Lcom/huawei/nfc/carrera/logic/oma/IOmaService;

    invoke-interface {v0, v10, v9}, Lcom/huawei/nfc/carrera/logic/oma/IOmaService;->excuteApduListEx(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;)Lcom/huawei/nfc/carrera/logic/oma/TaskResult;

    move-result-object v11

    .line 525
    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getData()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/nfc/carrera/logic/oma/model/ChannelID;

    .line 526
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl executeCommand, oma execute command result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getResultCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getLastExcutedCommand()Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    move-result-object v0

    move-object/from16 v1, p0

    move/from16 v2, p11

    invoke-direct {v1, v10, v0, v2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->changeApduCommand2ServerAccessAPDU(Ljava/util/List;Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;Z)Ljava/util/List;

    move-result-object p2

    .line 530
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl applyAPDU, apduList "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p1

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v5

    move-object/from16 v6, p2

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v0

    .line 533
    move-object/from16 v0, p9

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->setCurrentStep(Ljava/lang/String;)V

    .line 534
    move-object/from16 v0, p10

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;->setPartnerId(Ljava/lang/String;)V

    .line 535
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl applyAPDU, start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 536
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v12}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->applyAPDU(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;

    move-result-object v13

    .line 538
    if-eqz v13, :cond_6

    .line 539
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl executeCommand, apply apdu response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v13, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 540
    iget v0, v13, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->returnCode:I

    if-nez v0, :cond_4

    .line 541
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->getApduList()Ljava/util/List;

    move-result-object p2

    .line 542
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->getNextStep()Ljava/lang/String;

    move-result-object p9

    .line 543
    if-eqz p2, :cond_3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 544
    :cond_3
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultCode(I)V

    goto/16 :goto_1

    .line 547
    :cond_4
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v13, v1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 549
    iget v0, v13, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->returnCode:I

    const/16 v1, 0x1772

    if-ne v0, v1, :cond_8

    .line 550
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 551
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    const-string v0, "\n"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    const-string v0, "ServerAccessService Interface, scene : "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 555
    const-string v0, "\n"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    const-string v0, "OMA result : "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/oma/TaskResult;->getPrintMsg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 558
    const-string v0, "apud commands : \n"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    const/4 v15, 0x0

    .line 560
    const/16 v16, 0x0

    .line 561
    const/16 v17, 0x0

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v18

    :goto_0
    move/from16 v0, v17

    move/from16 v1, v18

    if-ge v0, v1, :cond_5

    .line 562
    move-object/from16 v0, p2

    move/from16 v1, v17

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    .line 563
    move/from16 v0, v17

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;

    .line 564
    invoke-virtual/range {v16 .. v16}, Lcom/huawei/nfc/carrera/logic/oma/model/ApduCommand;->getApdu()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 565
    const-string v0, ", "

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 566
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->getApduStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    const-string v0, "\n"

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    add-int/lit8 v17, v17, 0x1

    goto :goto_0

    .line 569
    :cond_5
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 570
    goto :goto_2

    .line 574
    :cond_6
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl executeCommand, invalid apply apdu response"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 575
    goto :goto_2

    .line 579
    :cond_7
    :goto_1
    if-eqz p2, :cond_8

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 582
    :cond_8
    :goto_2
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v13

    .line 583
    invoke-virtual {v13}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/nfc/PluginPayAdapter;

    .line 584
    const/4 v0, 0x0

    if-ne v0, v14, :cond_9

    .line 585
    return-void

    .line 587
    :cond_9
    invoke-interface {v14}, Lcom/huawei/nfc/PluginPayAdapter;->closeChannel()V

    .line 588
    return-void
.end method

.method public static getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;
    .locals 3

    .line 105
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;

    if-nez v0, :cond_1

    .line 107
    sget-object v1, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->SYNC_LOCK:[B

    monitor-enter v1

    .line 109
    :try_start_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;

    if-nez v0, :cond_0

    .line 111
    if-eqz p0, :cond_0

    .line 113
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;

    invoke-direct {v0, p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sput-object v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 119
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->instance:Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;

    return-object v0
.end method

.method private translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V
    .locals 6

    .line 653
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " doRecharge translateErrorCode: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 654
    iget v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->returnCode:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 656
    :sswitch_0
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultCode(I)V

    .line 657
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 659
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 660
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerAccessService Interface, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scene : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 661
    const-string v0, "fail_code"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->returnCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    const-string v0, "fail_reason"

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x3611a443

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x2

    aput-object v5, v1, v2

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 664
    goto/16 :goto_1

    .line 667
    :sswitch_1
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultCode(I)V

    .line 668
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 669
    goto/16 :goto_1

    .line 671
    :sswitch_2
    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultCode(I)V

    .line 672
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 673
    goto/16 :goto_1

    .line 675
    :sswitch_3
    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultCode(I)V

    .line 676
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 677
    goto/16 :goto_1

    .line 685
    :sswitch_4
    const/16 v0, -0x63

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultCode(I)V

    .line 686
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 688
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 689
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerAccessService Interface, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", scene : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 690
    const-string v0, "fail_code"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->returnCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    const-string v0, "fail_reason"

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x3611a443

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x2

    aput-object v5, v1, v2

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 693
    goto :goto_1

    .line 696
    :goto_0
    iget v0, p1, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->returnCode:I

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultCode(I)V

    .line 697
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;->setResultDesc(Ljava/lang/String;)V

    .line 700
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x63 -> :sswitch_4
        -0x62 -> :sswitch_4
        -0x4 -> :sswitch_4
        -0x2 -> :sswitch_2
        -0x1 -> :sswitch_1
        0x1 -> :sswitch_0
        0x2 -> :sswitch_3
        0x3 -> :sswitch_4
        0x4 -> :sswitch_4
        0x5 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public applyOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;
    .locals 15

    .line 124
    new-instance v7, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;-><init>()V

    .line 126
    if-nez p1, :cond_0

    .line 127
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl applyOrder, invalid param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->setResultCode(I)V

    .line 129
    const-string v0, "client check, invalid param"

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->setResultDesc(Ljava/lang/String;)V

    .line 130
    return-object v7

    .line 133
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getCplc()Ljava/lang/String;

    move-result-object v2

    .line 134
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getScene()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    .line 135
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getTrafficCardId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setCardId(Ljava/lang/String;)V

    .line 136
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getActualIssuePayment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setActualIssuePayment(Ljava/lang/String;)V

    .line 137
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getTheoreticalIssuePayment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setTheoreticalIssuePayment(Ljava/lang/String;)V

    .line 138
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getActualRecharegePayment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setActualRecharegePayment(Ljava/lang/String;)V

    .line 139
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getTheoreticalRecharegePayment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setTheoreticalRecharegePayment(Ljava/lang/String;)V

    .line 140
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getCurrency()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setCurrency(Ljava/lang/String;)V

    .line 141
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getPayType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setPayType(Ljava/lang/String;)V

    .line 142
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setPhoneNumber(Ljava/lang/String;)V

    .line 143
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setReserved(Ljava/lang/String;)V

    .line 144
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getTheoreticalIssuePayment()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setTheoreticalIssuePayment(Ljava/lang/String;)V

    .line 145
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getAccountUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setUserID(Ljava/lang/String;)V

    .line 146
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setAppCode(Ljava/lang/String;)V

    .line 147
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/ApplyOrderRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;->setPartnerId(Ljava/lang/String;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v8}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->applyOrder(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;

    move-result-object v9

    .line 150
    if-eqz v9, :cond_5

    .line 151
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl applyOrder, response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v9, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget v0, v9, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->returnCode:I

    if-nez v0, :cond_4

    .line 153
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->setResultCode(I)V

    .line 155
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v10

    .line 156
    if-eqz v10, :cond_2

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 157
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 158
    const/4 v12, 0x0

    .line 159
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;

    .line 160
    new-instance v12, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;

    invoke-direct {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;-><init>()V

    .line 161
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getAccessMode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setAccessMode(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getAmount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setAmount(Ljava/lang/String;)V

    .line 163
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getApplicationID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setApplicationId(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getCurrency()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setCurrency(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getOrderId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setOrderId(Ljava/lang/String;)V

    .line 166
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getOrderTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setOrderTime(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setOrderType(Ljava/lang/String;)V

    .line 168
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setPackageName(Ljava/lang/String;)V

    .line 169
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getProductDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setProductDesc(Ljava/lang/String;)V

    .line 170
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getProductName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setProductName(Ljava/lang/String;)V

    .line 171
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getServiceCatalog()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setServiceCatalog(Ljava/lang/String;)V

    .line 172
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getSign()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setSign(Ljava/lang/String;)V

    .line 173
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getSignType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setSignType(Ljava/lang/String;)V

    .line 174
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getSPMerchantId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setSPMerchantId(Ljava/lang/String;)V

    .line 175
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getMerchantName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setMerchantName(Ljava/lang/String;)V

    .line 176
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setUrl(Ljava/lang/String;)V

    .line 177
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getUrlVer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setUrlVer(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getSdkChannel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setSdkChannel(Ljava/lang/String;)V

    .line 180
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getTn()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setApplyOrderTn(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getWxAppId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setWechatPayAppId(Ljava/lang/String;)V

    .line 182
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getWxNonceStr()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setWechatPayNonceStr(Ljava/lang/String;)V

    .line 183
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getWxPartnerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setWechatPayPartnerId(Ljava/lang/String;)V

    .line 184
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getWxPrepayId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setWechatPayPrepayId(Ljava/lang/String;)V

    .line 185
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getWxTimeStamp()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setWechatPayTimeStamp(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessApplyOrder;->getWxPackageValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->setWechatPayPackageValue(Ljava/lang/String;)V

    .line 187
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 188
    goto/16 :goto_0

    .line 189
    :cond_1
    invoke-virtual {v7, v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->setOrderList(Ljava/util/List;)V

    .line 191
    :cond_2
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->getAppCode()Ljava/lang/String;

    move-result-object v11

    .line 192
    if-eqz v11, :cond_3

    .line 194
    invoke-virtual {v7, v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->setAppCode(Ljava/lang/String;)V

    .line 197
    :cond_3
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;->getWxOrderListJsonString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/ApplyOrderResponse;->setWxOrderListJsonString(Ljava/lang/String;)V

    .line 198
    goto :goto_1

    .line 199
    :cond_4
    invoke-direct {p0, v9, v7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 203
    :cond_5
    :goto_1
    return-object v7
.end method

.method public deleteApplet(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;
    .locals 17

    .line 383
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " enter deleteApplet "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 385
    new-instance v12, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;

    invoke-direct {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;-><init>()V

    .line 387
    if-nez p1, :cond_0

    .line 389
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl deleteApplet, invalid param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 390
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;->setResultCode(I)V

    .line 391
    const-string v0, "client check, invalid param"

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;->setResultDesc(Ljava/lang/String;)V

    .line 392
    return-object v12

    .line 395
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    .line 396
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v13, v0

    .line 397
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getTrafficCardId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setCardId(Ljava/lang/String;)V

    .line 398
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getImei()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setImei(Ljava/lang/String;)V

    .line 399
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setPhoneNumber(Ljava/lang/String;)V

    .line 400
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setPhoneManufacturer(Ljava/lang/String;)V

    .line 401
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getReason()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setReason(Ljava/lang/String;)V

    .line 402
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getRefundTicketId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setRefundTicketId(Ljava/lang/String;)V

    .line 403
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setReserved(Ljava/lang/String;)V

    .line 404
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getAccountUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setUserID(Ljava/lang/String;)V

    .line 406
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setAppCode(Ljava/lang/String;)V

    .line 407
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setPartnerId(Ljava/lang/String;)V

    .line 409
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getSource()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setSource(Ljava/lang/String;)V

    .line 410
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->isOnlyDeleteApplet()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "true"

    goto :goto_0

    :cond_1
    const-string v0, "false"

    :goto_0
    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setOnlyDeleteApplet(Ljava/lang/String;)V

    .line 411
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getReason()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setReason(Ljava/lang/String;)V

    .line 412
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl deleteApplet, request.getAppCode() "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->getAppCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v13}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->deleteApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;

    move-result-object v14

    .line 414
    if-eqz v14, :cond_5

    .line 416
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl deleteApplet, response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v14, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 417
    iget v0, v14, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;->returnCode:I

    if-nez v0, :cond_4

    .line 419
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;->getTransactionId()Ljava/lang/String;

    move-result-object v15

    .line 420
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;->getApduList()Ljava/util/List;

    move-result-object v16

    .line 422
    if-eqz v16, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 424
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DeleteAppletResponse;->setResultCode(I)V

    goto :goto_1

    .line 429
    :cond_3
    move-object/from16 v0, p0

    move-object v1, v15

    move-object/from16 v2, v16

    move-object v3, v12

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v6

    .line 430
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;->getNextStep()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v10

    .line 429
    const/4 v11, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->executeCommand(Ljava/lang/String;Ljava/util/List;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 432
    :goto_1
    goto :goto_2

    .line 435
    :cond_4
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 439
    :cond_5
    :goto_2
    return-object v12
.end method

.method public downloadAndInstallApplet(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DownloadAndInstallAppletResponse;
    .locals 18

    .line 208
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl downloadAndInstallApplet, enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    new-instance v12, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DownloadAndInstallAppletResponse;

    invoke-direct {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DownloadAndInstallAppletResponse;-><init>()V

    .line 212
    if-nez p1, :cond_0

    .line 213
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl downloadAndInstallApplet, invalid param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DownloadAndInstallAppletResponse;->setResultCode(I)V

    .line 215
    const-string v0, "client check, invalid param"

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DownloadAndInstallAppletResponse;->setResultDesc(Ljava/lang/String;)V

    .line 216
    return-object v12

    .line 219
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;

    .line 220
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    .line 221
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v13, v0

    .line 222
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getImei()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setImei(Ljava/lang/String;)V

    .line 223
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getOrderId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setOrderId(Ljava/lang/String;)V

    .line 224
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setPhoneManufacturer(Ljava/lang/String;)V

    .line 225
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setPhoneNumber(Ljava/lang/String;)V

    .line 226
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setReserved(Ljava/lang/String;)V

    .line 227
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getAccountUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setUserID(Ljava/lang/String;)V

    .line 229
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setAppCode(Ljava/lang/String;)V

    .line 230
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setPartnerId(Ljava/lang/String;)V

    .line 231
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DownloadAndInstallAppletRequest;->getOnlyCap()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->setOnlyCap(Ljava/lang/String;)V

    .line 232
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v13}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->downloadAndInstallApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;

    move-result-object v14

    .line 233
    if-eqz v14, :cond_4

    .line 235
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl downloadAndInstallApplet, response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v14, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget v0, v14, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->returnCode:I

    if-nez v0, :cond_3

    .line 238
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->getTransactionId()Ljava/lang/String;

    move-result-object v15

    .line 239
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->getApduList()Ljava/util/List;

    move-result-object v16

    .line 240
    const-string v0, "true"

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->getNoNeedCommandResp()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    .line 243
    if-eqz v16, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 245
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/DownloadAndInstallAppletResponse;->setResultCode(I)V

    goto :goto_0

    .line 250
    :cond_2
    move-object/from16 v0, p0

    move-object v1, v15

    move-object/from16 v2, v16

    move-object v3, v12

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v6

    .line 251
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;->getNextStep()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v10

    move/from16 v11, v17

    .line 250
    invoke-direct/range {v0 .. v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->executeCommand(Ljava/lang/String;Ljava/util/List;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 253
    :goto_0
    goto :goto_1

    .line 256
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 260
    :cond_4
    :goto_1
    return-object v12
.end method

.method public personalizeApplet(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;
    .locals 17

    .line 267
    new-instance v12, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;

    invoke-direct {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;-><init>()V

    .line 269
    if-nez p1, :cond_0

    .line 271
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl personalizeApplet, invalid param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->setResultCode(I)V

    .line 273
    const-string v0, "client check, invalid param"

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->setResultDesc(Ljava/lang/String;)V

    .line 274
    return-object v12

    .line 277
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    .line 278
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getOrderId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v5

    .line 279
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v13, v0

    .line 280
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getBasebandVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setBasebandVersion(Ljava/lang/String;)V

    .line 281
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 282
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getImei()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setImei(Ljava/lang/String;)V

    .line 283
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getSeCosVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setSeCosVersion(Ljava/lang/String;)V

    .line 284
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getSystemType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setSystemType(Ljava/lang/String;)V

    .line 285
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getSystemVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setSystemVersion(Ljava/lang/String;)V

    .line 286
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getOrderId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setOrderId(Ljava/lang/String;)V

    .line 287
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setPhoneManufacturer(Ljava/lang/String;)V

    .line 288
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setPhoneNumber(Ljava/lang/String;)V

    .line 289
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setReserved(Ljava/lang/String;)V

    .line 290
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getAccountUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setUserID(Ljava/lang/String;)V

    .line 292
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setAppCode(Ljava/lang/String;)V

    .line 293
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/PersonalizeAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->setPartnerId(Ljava/lang/String;)V

    .line 295
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v13}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->personalizeApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;

    move-result-object v14

    .line 296
    if-eqz v14, :cond_4

    .line 298
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl personalizeApplet, response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v14, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    iget v0, v14, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->returnCode:I

    if-nez v0, :cond_3

    .line 301
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->getTransactionId()Ljava/lang/String;

    move-result-object v15

    .line 302
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->getApduList()Ljava/util/List;

    move-result-object v16

    .line 304
    if-eqz v16, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 306
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/PersonalizeAppletResponse;->setResultCode(I)V

    goto :goto_0

    .line 311
    :cond_2
    move-object/from16 v0, p0

    move-object v1, v15

    move-object/from16 v2, v16

    move-object v3, v12

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getCplc()Ljava/lang/String;

    move-result-object v6

    .line 312
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;->getNextStep()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v10

    .line 311
    const/4 v11, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->executeCommand(Ljava/lang/String;Ljava/util/List;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 314
    :goto_0
    goto :goto_1

    .line 317
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 320
    :cond_4
    :goto_1
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl personalizeApplet end "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return-object v12
.end method

.method public queryAmount(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;
    .locals 16

    .line 706
    new-instance v7, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;-><init>()V

    .line 708
    if-nez p1, :cond_0

    .line 710
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl queryAmount, invalid param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 711
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->setResultCode(I)V

    .line 712
    const-string v0, "client check, invalid param"

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->setResultDesc(Ljava/lang/String;)V

    .line 713
    return-object v7

    .line 716
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    .line 717
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->getFlag()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->getCplc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v5

    .line 718
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    .line 719
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v8}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->queryIssueOrRechargeAmount(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;

    move-result-object v9

    .line 720
    if-eqz v9, :cond_6

    .line 722
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl queryAmount, response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v9, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 723
    iget v0, v9, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->returnCode:I

    if-nez v0, :cond_5

    .line 725
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->setResultCode(I)V

    .line 727
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->getIssueAmountList()Ljava/util/List;

    move-result-object v10

    .line 728
    if-eqz v10, :cond_2

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 730
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 731
    const/4 v12, 0x0

    .line 732
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;

    .line 734
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl queryAmount, ia.getDenomination() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->getDenomination()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; ia.getPriceEnroll() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->getPriceEnroll()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; ia.getPriceRecharge() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->getPriceRecharge()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    new-instance v12, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->getDenomination()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->getPriceEnroll()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->getPriceRecharge()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v12, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 736
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->getAmountEnroll()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->setAmountEnroll(Ljava/lang/String;)V

    .line 737
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->getAmountRecharge()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->setAmountRecharge(Ljava/lang/String;)V

    .line 738
    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 739
    goto/16 :goto_0

    .line 740
    :cond_1
    invoke-virtual {v7, v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->setIssueAmountList(Ljava/util/List;)V

    .line 743
    :cond_2
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->getRechargeAmountList()Ljava/util/List;

    move-result-object v11

    .line 744
    if-eqz v11, :cond_4

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 746
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 747
    const/4 v13, 0x0

    .line 748
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;

    .line 750
    new-instance v13, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;

    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->getDenomination()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->getAmountRecharge()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 752
    goto :goto_1

    .line 753
    :cond_3
    invoke-virtual {v7, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->setRechargeAmountList(Ljava/util/List;)V

    .line 755
    :cond_4
    goto :goto_2

    .line 758
    :cond_5
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 762
    :cond_6
    :goto_2
    return-object v7
.end method

.method public queryAppCode(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;
    .locals 15

    .line 769
    new-instance v6, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;-><init>()V

    .line 771
    if-nez p1, :cond_0

    .line 773
    const-string v0, "ServerAccessServiceImpl queryAppCode, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 774
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->setResultCode(I)V

    .line 775
    const-string v0, "client check, invalid param"

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->setResultDesc(Ljava/lang/String;)V

    .line 776
    return-object v6

    .line 779
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->getLongitude()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->getLatitude()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAppCodeRequest;->getSn()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v0

    .line 781
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v7}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->queryAppCode(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;

    move-result-object v8

    .line 782
    if-eqz v8, :cond_3

    .line 784
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerAccessServiceImpl queryAppCode, response = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v8, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 785
    iget v0, v8, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->returnCode:I

    if-nez v0, :cond_2

    .line 787
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->setResultCode(I)V

    .line 789
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->getRecommendedCity()Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;

    move-result-object v9

    .line 790
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->getAppCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->getCityName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->setRecommendedCity(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;)V

    .line 792
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;->getAvailableCity()Ljava/util/List;

    move-result-object v10

    .line 793
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 794
    const/4 v12, 0x0

    :goto_0
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_1

    .line 796
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;

    .line 797
    new-instance v14, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->getAppCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->getCityName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v14, v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/LntCityInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 798
    invoke-interface {v11, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 794
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 800
    :cond_1
    invoke-virtual {v6, v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAppCodeResponse;->setAvailableCity(Ljava/util/List;)V

    .line 801
    goto :goto_1

    .line 804
    :cond_2
    invoke-direct {p0, v8, v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 808
    :cond_3
    :goto_1
    return-object v6
.end method

.method public queryOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;
    .locals 14

    .line 446
    new-instance v6, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;

    invoke-direct {v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;-><init>()V

    .line 448
    if-nez p1, :cond_0

    .line 450
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl queryOrder, invalid param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 451
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->setResultCode(I)V

    .line 452
    const-string v0, "client check, invalid param"

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->setResultDesc(Ljava/lang/String;)V

    .line 453
    return-object v6

    .line 456
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getCplc()Ljava/lang/String;

    move-result-object v2

    .line 457
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v0

    .line 458
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getOrderId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setOrderId(Ljava/lang/String;)V

    .line 459
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getOrderStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setOrderStatus(Ljava/lang/String;)V

    .line 460
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setPhoneNumber(Ljava/lang/String;)V

    .line 461
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setReserved(Ljava/lang/String;)V

    .line 462
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getAccountUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setUserID(Ljava/lang/String;)V

    .line 463
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setPartnerId(Ljava/lang/String;)V

    .line 464
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;->setAppCode(Ljava/lang/String;)V

    .line 465
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl queryOrder, request.getIssuerId() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getCplc() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getCplc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getAppletAid() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getDeviceModel() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 466
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getDeviceModel() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getSeChipManuFacturer() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getOrderId() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 467
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getOrderId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getOrderStatus() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getOrderStatus()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getPhoneNumber() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " request.getReserved()= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->getReserved()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 465
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl queryOrder, req = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v7}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->queryOrder(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;

    move-result-object v8

    .line 470
    if-eqz v8, :cond_4

    .line 472
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl queryOrder, response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v8, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 473
    iget v0, v8, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;->returnCode:I

    if-nez v0, :cond_3

    .line 475
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->setResultCode(I)V

    .line 477
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v9

    .line 478
    if-eqz v9, :cond_2

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 480
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 481
    const/4 v11, 0x0

    .line 482
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;

    .line 484
    new-instance v11, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    invoke-direct {v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;-><init>()V

    .line 485
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->setIssuerId(Ljava/lang/String;)V

    .line 486
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->getOrderId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->setOrderId(Ljava/lang/String;)V

    .line 487
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->setOrderType(Ljava/lang/String;)V

    .line 488
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->setStatus(Ljava/lang/String;)V

    .line 489
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->getCurrency()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->setCurrency(Ljava/lang/String;)V

    .line 490
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->getAmount()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->setAmount(Ljava/lang/String;)V

    .line 491
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->getOrderTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->setOrderTime(Ljava/lang/String;)V

    .line 492
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 493
    goto :goto_0

    .line 494
    :cond_1
    invoke-virtual {v6, v10}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->setOrderList(Ljava/util/List;)V

    .line 496
    :cond_2
    goto :goto_1

    .line 499
    :cond_3
    invoke-direct {p0, v8, v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 503
    :cond_4
    :goto_1
    return-object v6
.end method

.method public recharge(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;
    .locals 17

    .line 328
    new-instance v12, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;

    invoke-direct {v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;-><init>()V

    .line 330
    if-nez p1, :cond_0

    .line 332
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ServerAccessServiceImpl recharge, invalid param"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 333
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->setResultCode(I)V

    .line 334
    const-string v0, "client check, invalid param"

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->setResultDesc(Ljava/lang/String;)V

    .line 335
    return-object v12

    .line 338
    :cond_0
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    .line 339
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getCplc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getOrderId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getTrafficCardId()Ljava/lang/String;

    move-result-object v5

    .line 340
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getSystemType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getSystemVersion()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v8

    .line 341
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v9

    invoke-direct/range {v0 .. v9}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v13, v0

    .line 342
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getPayType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setPayType(Ljava/lang/String;)V

    .line 343
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getImei()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setImei(Ljava/lang/String;)V

    .line 344
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setPhoneNumber(Ljava/lang/String;)V

    .line 345
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getRechargeMode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setRechargeMode(Ljava/lang/String;)V

    .line 346
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setReserved(Ljava/lang/String;)V

    .line 347
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getAccountUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setUserID(Ljava/lang/String;)V

    .line 348
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setAppCode(Ljava/lang/String;)V

    .line 349
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->setPartnerId(Ljava/lang/String;)V

    .line 350
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->cardServer:Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    invoke-virtual {v0, v13}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->recharge(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;

    move-result-object v14

    .line 351
    if-eqz v14, :cond_4

    .line 353
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ServerAccessServiceImpl recharge, response = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v14, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;->returnCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    iget v0, v14, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;->returnCode:I

    if-nez v0, :cond_3

    .line 356
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;->getTransactionId()Ljava/lang/String;

    move-result-object v15

    .line 357
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;->getApduList()Ljava/util/List;

    move-result-object v16

    .line 359
    if-eqz v16, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 361
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->setResultCode(I)V

    goto :goto_0

    .line 366
    :cond_2
    const-string v0, "ServerAccessServiceImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " doRecharge executeCommand: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 367
    move-object/from16 v0, p0

    move-object v1, v15

    move-object/from16 v2, v16

    move-object v3, v12

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->getCplc()Ljava/lang/String;

    move-result-object v6

    .line 368
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;->getNextStep()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v10

    .line 367
    const/4 v11, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->executeCommand(Ljava/lang/String;Ljava/util/List;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 370
    :goto_0
    goto :goto_1

    .line 373
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/impl/ServerAccessServiceImpl;->translateErrorCode(Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;)V

    .line 377
    :cond_4
    :goto_1
    return-object v12
.end method
