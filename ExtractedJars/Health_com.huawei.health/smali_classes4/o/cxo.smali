.class public Lo/cxo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/Long;>;"
        }
    .end annotation
.end field

.field private static b:Lo/dqe;

.field private static c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private static d:I

.field private static e:J

.field private static f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 144
    const-wide/16 v0, 0x0

    sput-wide v0, Lo/cxo;->e:J

    .line 146
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lo/cxo;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 182
    const/4 v0, 0x0

    sput v0, Lo/cxo;->d:I

    .line 184
    const/4 v0, 0x0

    sput-object v0, Lo/cxo;->b:Lo/dqe;

    .line 187
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/cxo;->c:Ljava/util/List;

    .line 196
    const/4 v0, 0x0

    sput v0, Lo/cxo;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;[B)I
    .locals 12

    .line 424
    const/4 v6, 0x0

    .line 427
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 429
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 430
    new-instance v9, Lo/daz;

    invoke-direct {v9}, Lo/daz;-><init>()V

    .line 433
    :try_start_0
    invoke-virtual {v9, v8}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 437
    goto :goto_0

    .line 434
    :catch_0
    move-exception v11

    .line 435
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceLinkParameter tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 436
    const/4 v0, 0x0

    return v0

    .line 439
    :goto_0
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 440
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 441
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 444
    :cond_0
    return v6
.end method

.method public static a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 190
    sget-object v0, Lo/cxo;->c:Ljava/util/List;

    return-object v0
.end method

.method public static a(I)Lo/cye;
    .locals 7

    .line 578
    new-instance v5, Lo/cye;

    invoke-direct {v5}, Lo/cye;-><init>()V

    .line 579
    sput p0, Lo/cxo;->d:I

    .line 581
    if-nez p0, :cond_0

    .line 582
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "in the AW!!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 583
    const/16 v6, 0x10

    new-array v6, v6, [B

    fill-array-data v6, :array_0

    .line 584
    array-length v0, v6

    const/16 v0, 0x10

    invoke-virtual {v5, v0}, Lo/cye;->a(I)V

    .line 585
    invoke-virtual {v5, v6}, Lo/cye;->a([B)V

    .line 586
    goto :goto_0

    .line 587
    :cond_0
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "in the normal case!!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 588
    const/16 v6, 0xc

    new-array v6, v6, [B

    fill-array-data v6, :array_1

    .line 589
    array-length v0, v6

    const/16 v0, 0xc

    invoke-virtual {v5, v0}, Lo/cye;->a(I)V

    .line 590
    invoke-virtual {v5, v6}, Lo/cye;->a([B)V

    .line 592
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(I)V

    .line 593
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(Z)V

    .line 594
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->c(I)V

    .line 595
    const/4 v0, 0x7

    invoke-virtual {v5, v0}, Lo/cye;->f(I)V

    .line 596
    return-object v5

    nop

    :array_0
    .array-data 1
        0x1t
        0x7t
        0x1t
        0x0t
        0x2t
        0x0t
        0x3t
        0x0t
        0x7t
        0x0t
        0x9t
        0x0t
        0xat
        0x0t
        0xct
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x1t
        0x7t
        0x1t
        0x0t
        0x2t
        0x0t
        0x7t
        0x0t
        0x9t
        0x0t
        0xat
        0x0t
    .end array-data
.end method

.method public static a([BLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Z
    .locals 12

    .line 1595
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 1596
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceSupportedNotificationType() with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1597
    const/4 v0, 0x0

    return v0

    .line 1601
    :cond_1
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 1602
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1603
    :cond_2
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceSupportedNotificationType() dataStrInfo is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1604
    const/4 v0, 0x0

    return v0

    .line 1608
    :cond_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1609
    new-instance v8, Lo/daz;

    invoke-direct {v8}, Lo/daz;-><init>()V

    .line 1610
    const/4 v9, 0x0

    .line 1612
    :try_start_0
    invoke-virtual {v8, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 1615
    goto :goto_0

    .line 1613
    :catch_0
    move-exception v10

    .line 1614
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceSupportedNotificationType tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1617
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v9, :cond_5

    .line 1618
    iget-object v0, v9, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/daw;

    .line 1619
    invoke-virtual {v11}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 1621
    :sswitch_0
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0, p1}, Lo/cxv;->d(ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1622
    .line 1626
    :goto_2
    goto :goto_1

    .line 1627
    :cond_4
    const/4 v0, 0x1

    return v0

    .line 1630
    :cond_5
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceSupportedNotificationType() tlvFather is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1631
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public static a(Landroid/content/Context;[BLjava/lang/String;)[B
    .locals 17

    .line 1719
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter checkEncryptCommand()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1720
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 1721
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "dataContent is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1722
    const/4 v0, 0x0

    return-object v0

    .line 1726
    :cond_0
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 1728
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 1729
    const/4 v0, 0x0

    return-object v0

    .line 1731
    :cond_1
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1732
    new-instance v8, Lo/daz;

    invoke-direct {v8}, Lo/daz;-><init>()V

    .line 1735
    :try_start_0
    invoke-virtual {v8, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v9

    .line 1737
    iget-object v10, v9, Lo/dba;->e:Ljava/util/List;

    .line 1738
    const/4 v11, 0x0

    .line 1739
    const-string v12, ""

    .line 1740
    const-string v13, ""

    .line 1742
    const/4 v14, 0x0

    :goto_0
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_2

    .line 1743
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 1745
    :pswitch_0
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v11

    .line 1746
    goto :goto_1

    .line 1748
    :pswitch_1
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v12

    .line 1749
    goto :goto_1

    .line 1751
    :pswitch_2
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v13

    .line 1742
    .line 1752
    :goto_1
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    .line 1758
    :cond_2
    const/4 v0, 0x1

    if-ne v0, v11, :cond_8

    .line 1759
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need to desEncrypt."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1760
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 1762
    invoke-static/range {p0 .. p0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    move-object/from16 v1, p2

    move-object/from16 v2, p0

    invoke-virtual {v0, v1, v2}, Lo/cxq;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v14

    .line 1763
    const/4 v0, 0x0

    if-ne v0, v14, :cond_3

    .line 1764
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "encryptTLVs key is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1765
    const/4 v0, 0x0

    return-object v0

    .line 1768
    :cond_3
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encrypt Key = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1771
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_4

    .line 1772
    const/4 v0, 0x0

    const/16 v1, 0x20

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v15

    .line 1773
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    invoke-virtual {v14, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v16

    .line 1774
    invoke-static/range {p0 .. p0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-static {v15}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v1

    move-object/from16 v2, v16

    move-object/from16 v3, p0

    move-object/from16 v4, p2

    invoke-virtual {v0, v2, v3, v4, v1}, Lo/cxq;->b(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v14

    .line 1775
    goto :goto_2

    .line 1776
    :cond_4
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "key info is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lo/day; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1777
    const/4 v0, 0x0

    return-object v0

    .line 1780
    :goto_2
    :try_start_2
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 1781
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to desEncrypt data."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1782
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Source Key = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1783
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptData = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1784
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptIV = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1786
    invoke-static {v13}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v14}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v12}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v3, v0, v1, v2}, Lo/cxt;->c(I[B[B[B)[B

    move-result-object v15

    .line 1787
    const/4 v0, 0x0

    if-eq v0, v15, :cond_5

    .line 1788
    array-length v0, v15

    add-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    move-object/from16 v16, v1

    .line 1789
    const/4 v0, 0x0

    aget-byte v0, p1, v0

    const/4 v1, 0x0

    aput-byte v0, v16, v1

    .line 1790
    const/4 v0, 0x1

    aget-byte v0, p1, v0

    const/4 v1, 0x1

    aput-byte v0, v16, v1

    .line 1791
    array-length v0, v15

    const/4 v1, 0x0

    move-object/from16 v2, v16

    const/4 v3, 0x2

    invoke-static {v15, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_2
    .catch Lo/day; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 1792
    return-object v16

    .line 1794
    :cond_5
    const/4 v0, 0x0

    return-object v0

    .line 1797
    :cond_6
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    :try_start_3
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "key is not incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Lo/day; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    .line 1798
    const/4 v0, 0x0

    return-object v0

    .line 1801
    :cond_7
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    :try_start_4
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Encrypt data is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Lo/day; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1

    .line 1802
    const/4 v0, 0x0

    return-object v0

    .line 1806
    :cond_8
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    :try_start_5
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not need desEncrypt."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Lo/day; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_1

    .line 1807
    return-object p1

    .line 1809
    :catch_0
    move-exception v10

    .line 1810
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "checkDesEncryptCommand tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1811
    const/4 v0, 0x0

    return-object v0

    .line 1812
    :catch_1
    move-exception v10

    .line 1813
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "checkDesEncryptCommand tlv resolve NumberFormatException."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1814
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x7c
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static b(Landroid/content/Context;IIIII)Ljava/lang/String;
    .locals 10

    .line 1036
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7f

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-wide/32 v1, 0x186a9

    invoke-static {v1, v2}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 1037
    const-string v6, ""

    .line 1039
    const/4 v0, 0x2

    if-eq v0, p3, :cond_0

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_3

    .line 1041
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p3, :cond_1

    .line 1043
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 1044
    :cond_1
    const/4 v0, 0x1

    if-ne v0, p3, :cond_2

    .line 1045
    invoke-static {p4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 1046
    invoke-static {p5}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 1047
    const/4 v0, 0x5

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 1048
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1049
    goto :goto_0

    .line 1051
    :cond_2
    move-object v6, v5

    goto :goto_0

    .line 1054
    :cond_3
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The link layer version is not match."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1057
    :goto_0
    return-object v6
.end method

.method public static b([B)Ljava/lang/String;
    .locals 13

    .line 730
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 731
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveAuthenticBTDevice with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 732
    const-string v0, ""

    return-object v0

    .line 739
    :cond_0
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 741
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 742
    new-instance v8, Lo/daz;

    invoke-direct {v8}, Lo/daz;-><init>()V

    .line 745
    :try_start_0
    invoke-virtual {v8, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 749
    goto :goto_0

    .line 746
    :catch_0
    move-exception v10

    .line 747
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveAuthenticBTDevice tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 748
    const-string v0, ""

    return-object v0

    .line 751
    :goto_0
    iget-object v10, v9, Lo/dba;->e:Ljava/util/List;

    .line 752
    const-string v11, ""

    .line 753
    const/4 v12, 0x0

    :goto_1
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_1

    .line 754
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    .line 756
    :sswitch_0
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v11

    .line 753
    .line 757
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    .line 763
    :cond_1
    return-object v11

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method public static b()Lo/cye;
    .locals 3

    .line 1823
    new-instance v1, Lo/cye;

    invoke-direct {v1}, Lo/cye;-><init>()V

    .line 1824
    const/4 v2, 0x4

    new-array v2, v2, [B

    fill-array-data v2, :array_0

    .line 1825
    array-length v0, v2

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, Lo/cye;->a(I)V

    .line 1826
    invoke-virtual {v1, v2}, Lo/cye;->a([B)V

    .line 1827
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(I)V

    .line 1828
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(Z)V

    .line 1829
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->c(I)V

    .line 1830
    const/16 v0, 0x16

    invoke-virtual {v1, v0}, Lo/cye;->f(I)V

    .line 1831
    return-object v1

    nop

    :array_0
    .array-data 1
        0x1t
        0x16t
        0x1t
        0x0t
    .end array-data
.end method

.method public static b(I)Lo/cye;
    .locals 5

    .line 1839
    new-instance v2, Lo/cye;

    invoke-direct {v2}, Lo/cye;-><init>()V

    .line 1840
    const/4 v3, 0x1

    .line 1841
    const/4 v0, 0x1

    if-ne v0, p0, :cond_0

    .line 1842
    const/4 v3, 0x1

    goto :goto_0

    .line 1843
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 1844
    const/4 v3, 0x0

    .line 1846
    :cond_1
    :goto_0
    const/4 v0, 0x5

    new-array v4, v0, [B

    const/4 v0, 0x1

    const/4 v1, 0x0

    aput-byte v0, v4, v1

    const/16 v0, 0x16

    const/4 v1, 0x1

    aput-byte v0, v4, v1

    const/4 v0, 0x2

    const/4 v1, 0x2

    aput-byte v0, v4, v1

    const/4 v0, 0x1

    const/4 v1, 0x3

    aput-byte v0, v4, v1

    const/4 v0, 0x4

    aput-byte v3, v4, v0

    .line 1847
    array-length v0, v4

    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Lo/cye;->a(I)V

    .line 1848
    invoke-virtual {v2, v4}, Lo/cye;->a([B)V

    .line 1849
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cye;->b(I)V

    .line 1850
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cye;->b(Z)V

    .line 1851
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cye;->c(I)V

    .line 1852
    const/16 v0, 0x16

    invoke-virtual {v2, v0}, Lo/cye;->f(I)V

    .line 1853
    return-object v2
.end method

.method public static b(Landroid/content/Context;[B)Lorg/json/JSONObject;
    .locals 15

    .line 1129
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter resolveDeviceProductType()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1130
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 1133
    const/4 v7, -0x1

    .line 1135
    const/4 v8, 0x5

    .line 1136
    :try_start_0
    sget v0, Lo/cxo;->d:I

    if-nez v0, :cond_0

    .line 1137
    const/16 v8, 0xf

    .line 1140
    :cond_0
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x0

    if-ne v0, p0, :cond_2

    .line 1141
    :cond_1
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1142
    const-string v0, "type"

    invoke-virtual {v6, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    return-object v0

    .line 1145
    :cond_2
    move-object/from16 v0, p1

    :try_start_1
    array-length v0, v0

    if-eq v8, v0, :cond_3

    .line 1146
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "command length is incorrect."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v5, p1

    array-length v5, v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1153
    :cond_3
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v9

    .line 1155
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v9, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 1156
    new-instance v11, Lo/daz;

    invoke-direct {v11}, Lo/daz;-><init>()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1159
    :try_start_2
    invoke-virtual {v11, v10}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_2
    .catch Lo/day; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v12

    .line 1163
    goto :goto_0

    .line 1160
    :catch_0
    move-exception v13

    .line 1161
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    :try_start_3
    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1162
    const-string v0, "type"

    invoke-virtual {v6, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    move-result-object v0

    return-object v0

    .line 1165
    :goto_0
    :try_start_4
    iget-object v13, v12, Lo/dba;->e:Ljava/util/List;

    .line 1166
    const/4 v14, 0x0

    :goto_1
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v0

    if-ge v14, v0, :cond_4

    .line 1167
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "the case is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1168
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 1170
    :pswitch_0
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "has BT_VERSION"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1171
    const-string v0, "BT_version"

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/daw;

    invoke-virtual {v1}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1172
    goto/16 :goto_2

    .line 1174
    :pswitch_1
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "has DEVICE_PRODUCT_TYPE_VALUE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1175
    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v7

    .line 1176
    const-string v0, "type"

    invoke-virtual {v6, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1177
    goto/16 :goto_2

    .line 1179
    :pswitch_2
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "has DEVICE_SN_VALUE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1180
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "the sn is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1181
    const-string v0, "UUID"

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/daw;

    invoke-virtual {v1}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1182
    goto/16 :goto_2

    .line 1184
    :pswitch_3
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "has DEVICE_VERSION="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1185
    const-string v0, "device_version"

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/daw;

    invoke-virtual {v1}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1186
    goto/16 :goto_2

    .line 1188
    :pswitch_4
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "has DEVICE_SOFT_VERSION="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1189
    const-string v0, "soft_version"

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/daw;

    invoke-virtual {v1}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1190
    goto/16 :goto_2

    .line 1192
    :pswitch_5
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "has DEVICE_MODEL="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1193
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "has DEVICE_MODEL="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1194
    const-string v0, "device_model"

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/daw;

    invoke-virtual {v1}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1195
    goto/16 :goto_2

    .line 1197
    :pswitch_6
    const-string v0, "01"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "has COMMAND_ID_FORCE_SN="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/daw;

    invoke-virtual {v3}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1198
    const-string v0, "force_sn"

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/daw;

    invoke-virtual {v1}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1199
    goto/16 :goto_2

    .line 1201
    :pswitch_7
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "has DEVICE_MODEL="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1202
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "has DEVICE_MODEL="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1203
    const-string v0, "device_name"

    invoke-interface {v13, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/daw;

    invoke-virtual {v1}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_1

    .line 1166
    .line 1204
    :goto_2
    :pswitch_8
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_1

    .line 1211
    :cond_4
    goto :goto_3

    .line 1209
    :catch_1
    move-exception v7

    .line 1210
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v7}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1213
    :goto_3
    return-object v6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_4
        :pswitch_8
        :pswitch_2
        :pswitch_5
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_6
    .end packed-switch
.end method

.method private static b(Landroid/content/Context;[BLjava/lang/String;[B)[B
    .locals 10

    .line 862
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptTLVs before encrypt temp ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 864
    invoke-static {p0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-virtual {v0, p2, p0}, Lo/cxq;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 865
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 866
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "encryptTLVs null == key"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 867
    const/4 v0, 0x0

    return-object v0

    .line 870
    :cond_0
    const/4 v7, 0x0

    .line 871
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 873
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "randIV is not null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 875
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_1

    .line 876
    const/4 v0, 0x0

    const/16 v1, 0x20

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 877
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 878
    invoke-static {p0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-static {v8}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v9, p0, p2, v1}, Lo/cxq;->b(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v6

    .line 879
    move-object v7, p3

    .line 880
    goto :goto_0

    .line 881
    :cond_1
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "key info is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 882
    const/4 v0, 0x0

    return-object v0

    .line 886
    :cond_2
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "randIV is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 887
    const/4 v0, 0x0

    return-object v0

    .line 890
    :goto_0
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptTLVs before encrypt mDevice ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, p2}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 891
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptTLVs before encrypt key ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 892
    const/4 v0, 0x0

    if-ne v0, v6, :cond_3

    .line 893
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    const-string v1, ""

    invoke-static {v1}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v1

    const-string v2, "btsdk_sharedpreferences_name4"

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, p2, v1, v2, v3}, Lo/cxq;->e(Ljava/lang/String;[BLjava/lang/String;Landroid/content/Context;)V

    .line 895
    :cond_3
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptTLVs before encrypt iv  ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 896
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 897
    invoke-static {v6}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, p1, v0, v7}, Lo/cxt;->d(I[B[B[B)[B

    move-result-object p1

    .line 900
    :cond_4
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptTLVs After encrypt result ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 901
    return-object p1
.end method

.method public static c()Lo/cye;
    .locals 16

    .line 604
    new-instance v4, Lo/cye;

    invoke-direct {v4}, Lo/cye;-><init>()V

    .line 606
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v5

    .line 608
    const/4 v0, 0x5

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 611
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v7

    .line 613
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v8, v0

    .line 615
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 616
    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x18

    .line 617
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x10

    and-int/lit16 v1, v1, 0xff

    .line 618
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v8, 0x8

    and-int/lit16 v1, v1, 0xff

    .line 619
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v8, 0xff

    .line 620
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 623
    invoke-virtual {v7}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    div-int/lit16 v0, v0, 0xe10

    div-int/lit16 v10, v0, 0x3e8

    .line 625
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v7, v0}, Ljava/util/TimeZone;->inDaylightTime(Ljava/util/Date;)Z

    move-result v11

    .line 626
    if-eqz v11, :cond_0

    .line 627
    invoke-virtual {v7}, Ljava/util/TimeZone;->getDSTSavings()I

    move-result v0

    div-int/lit16 v0, v0, 0xe10

    div-int/lit16 v0, v0, 0x3e8

    add-int/2addr v10, v0

    .line 630
    :cond_0
    invoke-virtual {v7}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    div-int/lit16 v0, v0, 0xe10

    rem-int/lit16 v0, v0, 0x3e8

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    div-int/lit16 v12, v0, 0x3e8

    .line 631
    const/4 v13, 0x0

    .line 632
    if-gez v10, :cond_1

    .line 633
    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x80

    shl-int/lit8 v10, v0, 0x8

    goto :goto_0

    .line 635
    :cond_1
    shl-int/lit8 v10, v10, 0x8

    .line 638
    :goto_0
    add-int v13, v10, v12

    .line 641
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 642
    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    shr-int/lit8 v1, v13, 0x8

    .line 643
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    and-int/lit16 v1, v13, 0xff

    .line 644
    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 647
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v15

    .line 648
    array-length v0, v15

    invoke-virtual {v4, v0}, Lo/cye;->a(I)V

    .line 649
    invoke-virtual {v4, v15}, Lo/cye;->a([B)V

    .line 650
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/cye;->b(I)V

    .line 651
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/cye;->b(Z)V

    .line 652
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lo/cye;->c(I)V

    .line 653
    const/4 v0, 0x5

    invoke-virtual {v4, v0}, Lo/cye;->f(I)V

    .line 654
    return-object v4
.end method

.method public static c(I)Lo/cye;
    .locals 19

    .line 203
    new-instance v5, Lo/cye;

    invoke-direct {v5}, Lo/cye;-><init>()V

    .line 207
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 208
    const/16 v0, 0xf

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 210
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 211
    invoke-static {}, Lo/cxo;->n()Ljava/lang/String;

    move-result-object v9

    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v9}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x5

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 218
    const-string v13, ""

    .line 219
    const-string v14, ""

    .line 220
    const-string v15, "FF:FF:FF:FF:FF:CC"

    .line 221
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get phone mac address."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 222
    invoke-static {}, Lo/cxo;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 223
    invoke-static {}, Lo/cxo;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 224
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect action exist."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 226
    sget-object v0, Lo/cxo;->b:Lo/dqe;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 228
    :try_start_0
    sget-object v0, Lo/cxo;->b:Lo/dqe;

    invoke-interface {v0}, Lo/dqe;->c()Ljava/lang/String;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v14, v0

    .line 236
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "btMacAddress = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v14}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    goto/16 :goto_0

    .line 229
    :catch_0
    move-exception v16

    .line 230
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RemoteException = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "btMacAddress = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v14}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    goto/16 :goto_0

    .line 231
    :catch_1
    move-exception v16

    .line 232
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    :try_start_2
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SecurityException = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 236
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "btMacAddress = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v14}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    goto/16 :goto_0

    .line 233
    :catch_2
    move-exception v16

    .line 234
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    :try_start_3
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Exception = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 236
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "btMacAddress = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v14}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    goto :goto_0

    .line 236
    :catchall_0
    move-exception v17

    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "btMacAddress = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v14}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    throw v17

    :goto_0
    goto :goto_1

    .line 239
    :cond_0
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mIConnectService is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 242
    :cond_1
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect action do not exist so start to get by settings."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 244
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "bluetooth_address"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 248
    :cond_2
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v14, :cond_4

    .line 249
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 250
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Phone Mac Address is : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v14}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 252
    :cond_3
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btMacAddress len = 0."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 254
    move-object v14, v15

    goto :goto_2

    .line 257
    :cond_4
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btMacAddress is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 259
    move-object v14, v15

    .line 263
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x7

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v14}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 266
    const-string v16, ""

    .line 267
    const/4 v0, 0x2

    move/from16 v1, p0

    if-ne v0, v1, :cond_5

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x9

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 271
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 272
    invoke-static/range {v17 .. v17}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v18

    .line 273
    move-object/from16 v0, v18

    array-length v0, v0

    invoke-virtual {v5, v0}, Lo/cye;->a(I)V

    .line 274
    move-object/from16 v0, v18

    invoke-virtual {v5, v0}, Lo/cye;->a([B)V

    .line 275
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(I)V

    .line 276
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(Z)V

    .line 277
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->c(I)V

    .line 278
    const/16 v0, 0xf

    invoke-virtual {v5, v0}, Lo/cye;->f(I)V

    .line 279
    return-object v5
.end method

.method public static c(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)Lo/cye;
    .locals 11

    .line 705
    new-instance v3, Lo/cye;

    invoke-direct {v3}, Lo/cye;-><init>()V

    .line 706
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 707
    const/16 v0, 0x13

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v5

    .line 708
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 709
    invoke-static {p1}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v7

    .line 711
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 712
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 714
    invoke-static {v9}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v10

    .line 715
    array-length v0, v10

    invoke-virtual {v3, v0}, Lo/cye;->a(I)V

    .line 716
    invoke-virtual {v3, v10}, Lo/cye;->a([B)V

    .line 717
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/cye;->b(I)V

    .line 718
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/cye;->b(Z)V

    .line 719
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lo/cye;->c(I)V

    .line 720
    const/16 v0, 0x13

    invoke-virtual {v3, v0}, Lo/cye;->f(I)V

    .line 721
    return-object v3
.end method

.method public static c(II[B)Z
    .locals 23

    .line 1643
    const/4 v6, 0x0

    .line 1645
    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 1646
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 1647
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "isSupportedCommand() dataStrInfo is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1648
    const/4 v0, 0x0

    return v0

    .line 1652
    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 1653
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isSupportedCommand() tlvStrInfo = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1654
    new-instance v9, Lo/daz;

    invoke-direct {v9}, Lo/daz;-><init>()V

    .line 1655
    const/4 v10, 0x0

    .line 1657
    :try_start_0
    invoke-virtual {v9, v8}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v10, v0

    .line 1660
    goto :goto_0

    .line 1658
    :catch_0
    move-exception v11

    .line 1659
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "isSupportedCommand() tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1662
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v10, :cond_7

    .line 1663
    const/4 v11, 0x0

    .line 1665
    iget-object v13, v10, Lo/dba;->b:Ljava/util/List;

    .line 1666
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/dba;

    .line 1667
    iget-object v0, v15, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/daw;

    .line 1668
    invoke-virtual/range {v17 .. v17}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_5

    .line 1670
    :sswitch_0
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move/from16 v1, p0

    if-ne v1, v0, :cond_4

    .line 1671
    move/from16 v11, p0

    goto/16 :goto_5

    .line 1675
    :sswitch_1
    const/4 v0, 0x0

    if-eq v0, v11, :cond_4

    .line 1676
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v12

    .line 1677
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isSupportedCommand() strCommandIDValueInfo = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1679
    invoke-static {}, Lo/daa;->b()Ljava/util/Map;

    move-result-object v18

    .line 1681
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Ljava/util/List;

    .line 1683
    const/4 v0, 0x0

    move-object/from16 v1, v19

    if-eq v0, v1, :cond_4

    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1684
    const/16 v20, 0x0

    :goto_3
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v20

    if-ge v1, v0, :cond_4

    .line 1685
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isSupportedCommand() index = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v4, v20

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1686
    add-int/lit8 v0, v20, 0x2

    move/from16 v1, v20

    invoke-virtual {v12, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/16 v21, 0x1

    goto :goto_4

    :cond_2
    const/16 v21, 0x0

    .line 1688
    :goto_4
    div-int/lit8 v0, v20, 0x2

    move-object/from16 v1, v19

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v22

    .line 1690
    move/from16 v0, p1

    move/from16 v1, v22

    if-ne v0, v1, :cond_3

    .line 1691
    move/from16 v6, v21

    .line 1692
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "isSupportedCommand() flag = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1693
    const/4 v11, 0x0

    .line 1684
    :cond_3
    add-int/lit8 v20, v20, 0x2

    goto/16 :goto_3

    .line 1697
    .line 1702
    :cond_4
    :goto_5
    goto/16 :goto_2

    .line 1703
    :cond_5
    goto/16 :goto_1

    .line 1704
    :cond_6
    goto :goto_6

    .line 1706
    :cond_7
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "isSupportedCommand() tlvFather is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1707
    const/4 v0, 0x0

    return v0

    .line 1710
    :goto_6
    return v6

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method public static c(Landroid/content/Context;[B)Z
    .locals 7

    .line 840
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 841
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceGATTTime with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 842
    const/4 v0, 0x0

    return v0

    .line 846
    :cond_1
    const/16 v6, 0xb

    .line 847
    array-length v0, p1

    if-ne v6, v0, :cond_2

    .line 848
    const/4 v0, 0x1

    return v0

    .line 850
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static c([B)Z
    .locals 16

    .line 1970
    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_0

    .line 1971
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveGoldCard with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1972
    const/4 v0, 0x0

    return v0

    .line 1976
    :cond_0
    invoke-static/range {p0 .. p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 1978
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1979
    new-instance v8, Lo/daz;

    invoke-direct {v8}, Lo/daz;-><init>()V

    .line 1982
    :try_start_0
    invoke-virtual {v8, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 1986
    goto :goto_0

    .line 1983
    :catch_0
    move-exception v10

    .line 1984
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveGoldCard tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1985
    const/4 v0, 0x0

    return v0

    .line 1987
    :goto_0
    const/4 v10, 0x0

    .line 1989
    iget-object v11, v9, Lo/dba;->e:Ljava/util/List;

    .line 1990
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1991
    const/4 v12, -0x1

    .line 1992
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v12

    .line 1993
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "resolveGoldCard result :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1994
    invoke-static {v12}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v13

    .line 1995
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v14

    .line 1996
    const/16 v0, 0x8

    if-le v0, v14, :cond_1

    .line 1997
    const/4 v15, 0x0

    :goto_1
    rsub-int/lit8 v0, v14, 0x8

    if-ge v15, v0, :cond_1

    .line 1998
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 1997
    add-int/lit8 v15, v15, 0x1

    goto :goto_1

    .line 2001
    :cond_1
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "resolveGoldCard result :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "info"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2002
    const/4 v0, 0x4

    const/4 v1, 0x5

    invoke-virtual {v13, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    .line 2003
    return v10

    .line 2005
    :cond_2
    return v10
.end method

.method public static c([BLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Z
    .locals 15

    .line 1543
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 1544
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceSupportedActivityType with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1545
    const/4 v0, 0x0

    return v0

    .line 1549
    :cond_1
    invoke-static {p0}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 1550
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1551
    :cond_2
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "dataStrInfo is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1552
    const/4 v0, 0x0

    return v0

    .line 1556
    :cond_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1557
    new-instance v8, Lo/daz;

    invoke-direct {v8}, Lo/daz;-><init>()V

    .line 1558
    const/4 v9, 0x0

    .line 1560
    :try_start_0
    invoke-virtual {v8, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 1563
    goto :goto_0

    .line 1561
    :catch_0
    move-exception v10

    .line 1562
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceSupportedActivityType tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1565
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v9, :cond_6

    .line 1566
    iget-object v10, v9, Lo/dba;->b:Ljava/util/List;

    .line 1567
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/dba;

    .line 1568
    iget-object v0, v12, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1569
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_3

    .line 1571
    :sswitch_0
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/cxv;->a(ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1572
    goto :goto_3

    .line 1574
    :sswitch_1
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, p1

    invoke-static {v0, v1}, Lo/cxv;->e(ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1575
    .line 1579
    :goto_3
    goto :goto_2

    .line 1580
    :cond_4
    goto/16 :goto_1

    .line 1581
    :cond_5
    const/4 v0, 0x1

    return v0

    .line 1584
    :cond_6
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "tlvFather is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1585
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method public static c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)[Z
    .locals 15

    .line 2015
    const/4 v6, 0x2

    new-array v6, v6, [Z

    fill-array-data v6, :array_0

    .line 2016
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 2017
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "AutoDetectSwitchStatusAndWorkMode with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2019
    return-object v6

    .line 2023
    :cond_0
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 2025
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 2026
    new-instance v9, Lo/daz;

    invoke-direct {v9}, Lo/daz;-><init>()V

    .line 2029
    :try_start_0
    invoke-virtual {v9, v8}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 2033
    goto :goto_0

    .line 2030
    :catch_0
    move-exception v11

    .line 2031
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "AutoDetectSwitchStatusAndWorkMode tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2032
    return-object v6

    .line 2036
    :goto_0
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 2038
    const/4 v12, 0x0

    :goto_1
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_1

    .line 2039
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "the case is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/daw;

    invoke-virtual {v4}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2040
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 2042
    :sswitch_0
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AutoDetectSwitchStatusAndWorkMode AutoDetectSwitchStatus "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2043
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v13

    .line 2044
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AutoDetectSwitchStatusAndWorkMode mode = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2045
    const/4 v0, 0x1

    const/4 v1, 0x0

    aput-boolean v0, v6, v1

    .line 2046
    invoke-virtual {p0, v13}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setAutoDetectSwitchStatus(I)V

    .line 2047
    goto :goto_2

    .line 2049
    :sswitch_1
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AutoDetectSwitchStatusAndWorkMode AutoDetectSwitchStatus "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2050
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v14

    .line 2051
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AutoDetectSwitchStatusAndWorkMode status = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2052
    const/4 v0, 0x1

    const/4 v1, 0x1

    aput-boolean v0, v6, v1

    .line 2053
    invoke-virtual {p0, v14}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setFootWearPosition(I)V

    .line 2038
    .line 2054
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 2060
    :cond_1
    return-object v6

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data
.end method

.method public static d(Ljava/lang/String;Landroid/content/Context;[B)Lo/cyd;
    .locals 16

    .line 288
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_1

    .line 289
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBindStatusResponse with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 290
    const/4 v0, 0x0

    return-object v0

    .line 293
    :cond_1
    new-instance v6, Lo/cyd;

    invoke-direct {v6}, Lo/cyd;-><init>()V

    .line 295
    sget-object v0, Lo/cxo;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 296
    sget-object v0, Lo/cxo;->a:Ljava/util/concurrent/ConcurrentHashMap;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    :cond_2
    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 301
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 302
    new-instance v9, Lo/daz;

    invoke-direct {v9}, Lo/daz;-><init>()V

    .line 305
    :try_start_0
    invoke-virtual {v9, v8}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 309
    goto :goto_0

    .line 306
    :catch_0
    move-exception v11

    .line 307
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceBondStatus tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 308
    const/4 v0, 0x0

    return-object v0

    .line 311
    :goto_0
    const/4 v11, 0x0

    .line 312
    iget-object v12, v10, Lo/dba;->e:Ljava/util/List;

    .line 313
    const/4 v13, 0x0

    :goto_1
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_3

    .line 314
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 316
    :sswitch_0
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyd;->a(I)V

    .line 317
    goto/16 :goto_2

    .line 319
    :sswitch_1
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyd;->c(I)V

    .line 320
    goto/16 :goto_2

    .line 322
    :sswitch_2
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyd;->d(I)V

    .line 323
    goto :goto_2

    .line 325
    :sswitch_3
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyd;->e(I)V

    .line 326
    goto :goto_2

    .line 328
    :sswitch_4
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v14

    .line 329
    sget-object v0, Lo/cxo;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "solve base counter = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 331
    goto :goto_2

    .line 333
    :sswitch_5
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "device tell error code for resolveBTDeviceBondStatus."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 334
    const/4 v11, 0x1

    .line 313
    .line 335
    :goto_2
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    .line 341
    :cond_3
    if-eqz v11, :cond_4

    .line 342
    const/4 v0, 0x0

    return-object v0

    .line 344
    :cond_4
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x4 -> :sswitch_2
        0x5 -> :sswitch_3
        0x9 -> :sswitch_4
        0x7f -> :sswitch_5
    .end sparse-switch
.end method

.method public static d()Lo/cye;
    .locals 3

    .line 1400
    new-instance v1, Lo/cye;

    invoke-direct {v1}, Lo/cye;-><init>()V

    .line 1401
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->c(I)V

    .line 1402
    const/16 v0, 0x12

    invoke-virtual {v1, v0}, Lo/cye;->f(I)V

    .line 1404
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 1406
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1407
    const/16 v0, 0x12

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1410
    const/16 v0, -0x7f

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1412
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1414
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v1, v0}, Lo/cye;->a(I)V

    .line 1415
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/cye;->a([B)V

    .line 1416
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(I)V

    .line 1417
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(Z)V

    .line 1419
    return-object v1
.end method

.method public static d(I)Lo/cye;
    .locals 7

    .line 452
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter getBTDeviceLinkParameter with btType = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 453
    new-instance v5, Lo/cye;

    invoke-direct {v5}, Lo/cye;-><init>()V

    .line 454
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 455
    const/16 v6, 0xc

    new-array v6, v6, [B

    fill-array-data v6, :array_0

    .line 456
    const/16 v0, 0xc

    invoke-virtual {v5, v0}, Lo/cye;->a(I)V

    .line 457
    invoke-virtual {v5, v6}, Lo/cye;->a([B)V

    .line 458
    goto :goto_0

    .line 461
    :cond_0
    const/16 v6, 0xa

    new-array v6, v6, [B

    fill-array-data v6, :array_1

    .line 462
    const/16 v0, 0xa

    invoke-virtual {v5, v0}, Lo/cye;->a(I)V

    .line 463
    invoke-virtual {v5, v6}, Lo/cye;->a([B)V

    .line 466
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(I)V

    .line 467
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(Z)V

    .line 468
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->c(I)V

    .line 469
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->f(I)V

    .line 470
    return-object v5

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x0t
        0x2t
        0x0t
        0x3t
        0x0t
        0x4t
        0x0t
        0x6t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x0t
        0x2t
        0x0t
        0x3t
        0x0t
        0x4t
        0x0t
    .end array-data
.end method

.method public static d(Landroid/content/Context;)Lo/cye;
    .locals 16

    .line 771
    new-instance v2, Lo/cye;

    invoke-direct {v2}, Lo/cye;-><init>()V

    .line 773
    const/16 v0, 0xd

    new-array v3, v0, [B

    .line 776
    const/4 v0, 0x1

    const/4 v1, 0x0

    aput-byte v0, v3, v1

    .line 778
    const/4 v0, 0x5

    const/4 v1, 0x1

    aput-byte v0, v3, v1

    .line 781
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 782
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 784
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yy MM dd HH mm ss"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v7, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 785
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 786
    const-string v0, " "

    invoke-virtual {v8, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 789
    const/16 v0, 0xa

    const/4 v1, 0x2

    aput-byte v0, v3, v1

    .line 791
    const/16 v0, 0x9

    const/4 v1, 0x3

    aput-byte v0, v3, v1

    .line 793
    const/4 v10, 0x0

    :goto_0
    const/4 v0, 0x6

    if-ge v10, v0, :cond_0

    .line 794
    aget-object v0, v9, v10

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 795
    add-int/lit8 v0, v10, 0x4

    int-to-byte v1, v11

    aput-byte v1, v3, v0

    .line 793
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 798
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 799
    invoke-virtual {v10, v6}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 800
    const/4 v0, 0x7

    invoke-virtual {v10, v0}, Ljava/util/Calendar;->get(I)I

    move-result v11

    .line 801
    const/4 v0, 0x1

    if-ne v11, v0, :cond_1

    const/4 v12, 0x6

    goto :goto_1

    :cond_1
    add-int/lit8 v12, v11, -0x2

    .line 802
    :goto_1
    int-to-byte v0, v12

    const/16 v1, 0xa

    aput-byte v0, v3, v1

    .line 804
    invoke-static/range {p0 .. p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v13, 0x2

    goto :goto_2

    :cond_2
    const/4 v13, 0x1

    .line 805
    :goto_2
    const/4 v0, 0x1

    if-ne v0, v13, :cond_3

    .line 806
    const/4 v0, 0x2

    const/16 v1, 0xb

    aput-byte v0, v3, v1

    goto :goto_3

    .line 808
    :cond_3
    const/4 v0, 0x1

    const/16 v1, 0xb

    aput-byte v0, v3, v1

    .line 811
    :goto_3
    const/4 v14, 0x3

    .line 812
    invoke-static/range {p0 .. p0}, Landroid/text/format/DateFormat;->getDateFormatOrder(Landroid/content/Context;)[C

    move-result-object v15

    .line 813
    if-eqz v15, :cond_6

    array-length v0, v15

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 814
    const/4 v0, 0x0

    aget-char v0, v15, v0

    const/16 v1, 0x64

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    aget-char v0, v15, v0

    const/16 v1, 0x4d

    if-ne v0, v1, :cond_4

    const/4 v0, 0x2

    aget-char v0, v15, v0

    const/16 v1, 0x79

    if-ne v0, v1, :cond_4

    .line 815
    const/4 v14, 0x2

    goto :goto_4

    .line 816
    :cond_4
    const/4 v0, 0x0

    aget-char v0, v15, v0

    const/16 v1, 0x4d

    if-ne v0, v1, :cond_5

    const/4 v0, 0x1

    aget-char v0, v15, v0

    const/16 v1, 0x64

    if-ne v0, v1, :cond_5

    const/4 v0, 0x2

    aget-char v0, v15, v0

    const/16 v1, 0x79

    if-ne v0, v1, :cond_5

    .line 817
    const/4 v14, 0x1

    goto :goto_4

    .line 819
    :cond_5
    const/4 v14, 0x3

    .line 821
    :cond_6
    :goto_4
    int-to-byte v0, v14

    const/16 v1, 0xc

    aput-byte v0, v3, v1

    .line 824
    array-length v0, v3

    const/16 v0, 0xd

    invoke-virtual {v2, v0}, Lo/cye;->a(I)V

    .line 825
    invoke-virtual {v2, v3}, Lo/cye;->a([B)V

    .line 826
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cye;->b(I)V

    .line 827
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cye;->b(Z)V

    .line 828
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/cye;->c(I)V

    .line 829
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Lo/cye;->f(I)V

    .line 830
    return-object v2
.end method

.method public static d(Landroid/content/Context;[B)Lo/cyl;
    .locals 18

    .line 480
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_1

    .line 481
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceLinkParameter with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 482
    const/4 v0, 0x0

    return-object v0

    .line 488
    :cond_1
    new-instance v6, Lo/cyl;

    invoke-direct {v6}, Lo/cyl;-><init>()V

    .line 490
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 492
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 493
    new-instance v9, Lo/daz;

    invoke-direct {v9}, Lo/daz;-><init>()V

    .line 496
    :try_start_0
    invoke-virtual {v9, v8}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 500
    goto :goto_0

    .line 497
    :catch_0
    move-exception v11

    .line 498
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceLinkParameter tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 499
    const/4 v0, 0x0

    return-object v0

    .line 502
    :goto_0
    const/4 v11, 0x0

    .line 503
    iget-object v12, v10, Lo/dba;->e:Ljava/util/List;

    .line 504
    const/4 v13, 0x0

    :goto_1
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_3

    .line 505
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 507
    :sswitch_0
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyl;->a(I)V

    .line 508
    goto/16 :goto_2

    .line 510
    :sswitch_1
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyl;->d(I)V

    .line 511
    goto/16 :goto_2

    .line 513
    :sswitch_2
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyl;->c(I)V

    .line 514
    goto/16 :goto_2

    .line 516
    :sswitch_3
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyl;->b(I)V

    .line 517
    goto/16 :goto_2

    .line 519
    :sswitch_4
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v14

    .line 520
    const-string v15, ""

    .line 521
    const-string v16, ""

    .line 523
    const/16 v17, 0x24

    .line 524
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    move/from16 v1, v17

    if-ne v1, v0, :cond_2

    .line 525
    const/4 v0, 0x0

    const/4 v1, 0x4

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v15

    .line 526
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "resolveBTDeviceLinkParameter Authentic version : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 527
    const/16 v0, 0x10

    invoke-static {v15, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sput v0, Lo/cxo;->f:I

    .line 528
    sget v0, Lo/cxo;->f:I

    invoke-virtual {v6, v0}, Lo/cyl;->e(I)V

    .line 529
    const/4 v0, 0x4

    move/from16 v1, v17

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v16

    .line 530
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "resolveBTDeviceLinkParameter Authentic randA info : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, v16

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 531
    move-object/from16 v0, v16

    invoke-virtual {v6, v0}, Lo/cyl;->e(Ljava/lang/String;)V

    goto :goto_2

    .line 534
    :cond_2
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceLinkParameter error with handshake parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 536
    goto :goto_2

    .line 538
    :sswitch_5
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cyl;->g(I)V

    .line 539
    goto :goto_2

    .line 541
    :sswitch_6
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "device tell error code for resolveBTDeviceLinkParameter."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 542
    const/4 v11, 0x1

    .line 504
    .line 543
    :goto_2
    add-int/lit8 v13, v13, 0x1

    goto/16 :goto_1

    .line 549
    :cond_3
    if-eqz v11, :cond_4

    .line 550
    const/4 v0, 0x0

    return-object v0

    .line 552
    :cond_4
    return-object v6

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_3
        0x5 -> :sswitch_4
        0x6 -> :sswitch_5
        0x7f -> :sswitch_6
    .end sparse-switch
.end method

.method public static d(Landroid/content/Context;[BLjava/lang/String;Z)[B
    .locals 15

    .line 961
    const/4 v0, 0x2

    new-array v6, v0, [B

    .line 962
    move-object/from16 v0, p1

    array-length v0, v0

    add-int/lit8 v0, v0, -0x2

    new-array v7, v0, [B

    .line 966
    move-object/from16 v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v6, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 968
    move-object/from16 v0, p1

    array-length v0, v0

    add-int/lit8 v0, v0, -0x2

    move-object/from16 v1, p1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v2, v7, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 972
    invoke-static {}, Lo/cxo;->k()[B

    move-result-object v8

    .line 973
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 974
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "randIV is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 975
    const/4 v0, 0x0

    return-object v0

    .line 977
    :cond_0
    sget-object v0, Lo/cxo;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 978
    sget-object v0, Lo/cxo;->a:Ljava/util/concurrent/ConcurrentHashMap;

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .line 979
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v9

    if-eqz v0, :cond_3

    .line 980
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "tmpLong = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 981
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "max_id_number = 4294967295"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 982
    const-wide v0, 0xffffffffL

    cmp-long v0, v0, v9

    if-nez v0, :cond_1

    .line 983
    sget-object v0, Lo/cxo;->a:Ljava/util/concurrent/ConcurrentHashMap;

    const-wide/16 v1, 0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, p2

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 984
    :cond_1
    if-eqz p3, :cond_2

    .line 985
    const-wide/16 v0, 0x1

    add-long/2addr v9, v0

    .line 986
    sget-object v0, Lo/cxo;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v2, p2

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 988
    :cond_2
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptTLVsV2 send result :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move/from16 v4, p3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 991
    :goto_0
    invoke-static {v9, v10}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v11

    .line 992
    invoke-static {v11}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v12

    .line 993
    const/4 v0, 0x0

    if-eq v0, v12, :cond_3

    array-length v0, v12

    int-to-long v0, v0

    const-wide/16 v2, 0x4

    cmp-long v0, v2, v0

    if-nez v0, :cond_3

    array-length v0, v8

    const/16 v1, 0x10

    if-ne v1, v0, :cond_3

    .line 995
    const/4 v0, 0x0

    aget-byte v0, v12, v0

    const/16 v1, 0xc

    aput-byte v0, v8, v1

    .line 996
    const/4 v0, 0x1

    aget-byte v0, v12, v0

    const/16 v1, 0xd

    aput-byte v0, v8, v1

    .line 997
    const/4 v0, 0x2

    aget-byte v0, v12, v0

    const/16 v1, 0xe

    aput-byte v0, v8, v1

    .line 998
    const/4 v0, 0x3

    aget-byte v0, v12, v0

    const/16 v1, 0xf

    aput-byte v0, v8, v1

    .line 1003
    :cond_3
    move-object/from16 v0, p2

    invoke-static {p0, v7, v0, v8}, Lo/cxo;->b(Landroid/content/Context;[BLjava/lang/String;[B)[B

    move-result-object v7

    .line 1004
    const/4 v0, 0x0

    if-ne v0, v7, :cond_4

    .line 1005
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Do not get encrypt content."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    const/4 v0, 0x0

    return-object v0

    .line 1011
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7c

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 1013
    invoke-static {v8}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v10

    .line 1014
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7d

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 1016
    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v12

    .line 1017
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x7e

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 1019
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    .line 1022
    invoke-static {v14}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static e()Lo/cye;
    .locals 3

    .line 1427
    new-instance v1, Lo/cye;

    invoke-direct {v1}, Lo/cye;-><init>()V

    .line 1428
    const/4 v0, 0x2

    invoke-virtual {v1, v0}, Lo/cye;->c(I)V

    .line 1429
    const/4 v0, 0x5

    invoke-virtual {v1, v0}, Lo/cye;->f(I)V

    .line 1431
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 1433
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1434
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1437
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1439
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1441
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v1, v0}, Lo/cye;->a(I)V

    .line 1442
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/cye;->a([B)V

    .line 1443
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(I)V

    .line 1444
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(Z)V

    .line 1446
    return-object v1
.end method

.method public static e(Landroid/content/Context;)Lo/cye;
    .locals 14

    .line 1222
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter requestBTDeviceServiceCapability()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1223
    new-instance v5, Lo/cye;

    invoke-direct {v5}, Lo/cye;-><init>()V

    .line 1224
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 1225
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 1227
    const-string v8, ""

    .line 1229
    new-instance v9, Ljava/lang/StringBuffer;

    invoke-direct {v9}, Ljava/lang/StringBuffer;-><init>()V

    .line 1231
    invoke-static {}, Lo/daa;->e()Ljava/util/List;

    move-result-object v10

    .line 1233
    const/4 v11, 0x1

    :goto_0
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_0

    .line 1234
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    .line 1235
    invoke-static {v12}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1233
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 1239
    :cond_0
    invoke-virtual {v9}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1241
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 1242
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 1244
    invoke-static {v12}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v13

    .line 1245
    array-length v0, v13

    invoke-virtual {v5, v0}, Lo/cye;->a(I)V

    .line 1246
    invoke-virtual {v5, v13}, Lo/cye;->a([B)V

    .line 1247
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(I)V

    .line 1248
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(Z)V

    .line 1249
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->c(I)V

    .line 1250
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/cye;->f(I)V

    .line 1251
    return-object v5
.end method

.method public static e(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lo/cye;
    .locals 20

    .line 355
    new-instance v6, Lo/cye;

    invoke-direct {v6}, Lo/cye;-><init>()V

    .line 356
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 357
    const/16 v0, 0xe

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 358
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 359
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 360
    invoke-static {}, Lo/cxo;->n()Ljava/lang/String;

    move-result-object v11

    .line 361
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x5

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Lo/czx;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 362
    if-nez p1, :cond_0

    const-string v13, ""

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v13

    .line 364
    :goto_0
    const-string v14, ""

    .line 365
    const-string v15, ""

    .line 366
    const-string v16, ""

    .line 368
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_4

    .line 369
    invoke-virtual/range {p2 .. p2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 371
    invoke-static {}, Lo/cxo;->k()[B

    move-result-object v17

    .line 372
    const/4 v0, 0x0

    move-object/from16 v1, v17

    if-eq v0, v1, :cond_2

    .line 373
    invoke-static/range {p0 .. p0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    sget v1, Lo/cxo;->f:I

    move-object/from16 v2, p0

    move-object/from16 v3, v17

    invoke-virtual {v0, v1, v13, v2, v3}, Lo/cxq;->a(ILjava/lang/String;Landroid/content/Context;[B)Ljava/lang/String;

    move-result-object v14

    .line 374
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encrypt Key info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 375
    const/4 v0, 0x0

    if-eq v0, v14, :cond_1

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x40

    if-le v0, v1, :cond_1

    .line 376
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to construct key info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 377
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    invoke-virtual {v14, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v18

    .line 378
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x6

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 380
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to construct iv info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 381
    const/4 v0, 0x0

    const/16 v1, 0x20

    invoke-virtual {v14, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v19

    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x7

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 383
    goto :goto_1

    .line 384
    :cond_1
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "key = null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 387
    :cond_2
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Do not get randIV."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 388
    invoke-static/range {p0 .. p0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    sget v1, Lo/cxo;->f:I

    move-object/from16 v2, p0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v13, v2, v3}, Lo/cxq;->a(ILjava/lang/String;Landroid/content/Context;[B)Ljava/lang/String;

    move-result-object v14

    .line 389
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x6

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 391
    :goto_1
    goto/16 :goto_2

    .line 392
    :cond_3
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Protocol is not V2."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 393
    invoke-static/range {p0 .. p0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    sget v1, Lo/cxo;->f:I

    move-object/from16 v2, p0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v13, v2, v3}, Lo/cxq;->a(ILjava/lang/String;Landroid/content/Context;[B)Ljava/lang/String;

    move-result-object v14

    .line 394
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x6

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    goto :goto_2

    .line 397
    :cond_4
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "btDeviceInfo is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 398
    invoke-static/range {p0 .. p0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    sget v1, Lo/cxo;->f:I

    move-object/from16 v2, p0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v13, v2, v3}, Lo/cxq;->a(ILjava/lang/String;Landroid/content/Context;[B)Ljava/lang/String;

    move-result-object v14

    .line 399
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x6

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 403
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 405
    invoke-static/range {v17 .. v17}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v18

    .line 406
    move-object/from16 v0, v18

    array-length v0, v0

    invoke-virtual {v6, v0}, Lo/cye;->a(I)V

    .line 407
    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Lo/cye;->a([B)V

    .line 408
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/cye;->b(I)V

    .line 409
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/cye;->b(Z)V

    .line 410
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lo/cye;->c(I)V

    .line 411
    const/16 v0, 0xe

    invoke-virtual {v6, v0}, Lo/cye;->f(I)V

    .line 412
    return-object v6
.end method

.method public static e(Landroid/content/Context;Ljava/util/List;)Lo/cye;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Ljava/lang/Integer;>;)Lo/cye;"
        }
    .end annotation

    .line 1329
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter requestBTDeviceCommandCapability()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1330
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 1331
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "serviceIDList is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1332
    const/4 v0, 0x0

    return-object v0

    .line 1335
    :cond_0
    new-instance v5, Lo/cye;

    invoke-direct {v5}, Lo/cye;-><init>()V

    .line 1336
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v6

    .line 1337
    const/4 v0, 0x3

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 1339
    const-string v8, ""

    .line 1342
    const-string v9, ""

    .line 1343
    const-string v10, ""

    .line 1345
    invoke-static {}, Lo/daa;->b()Ljava/util/Map;

    move-result-object v11

    .line 1347
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    .line 1348
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    .line 1351
    new-instance v14, Ljava/lang/StringBuffer;

    invoke-direct {v14}, Ljava/lang/StringBuffer;-><init>()V

    .line 1354
    const/4 v15, 0x0

    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v15, v0, :cond_3

    .line 1356
    move-object/from16 v0, p1

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/Integer;

    .line 1358
    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/List;

    .line 1359
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-eq v0, v1, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 1361
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 1363
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 1365
    new-instance v17, Ljava/lang/StringBuffer;

    invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuffer;-><init>()V

    .line 1366
    const/16 v18, 0x0

    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v18

    if-ge v1, v0, :cond_1

    .line 1367
    move-object/from16 v0, v16

    move/from16 v1, v18

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/Integer;

    .line 1368
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1366
    add-int/lit8 v18, v18, 0x1

    goto :goto_1

    .line 1373
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 1375
    invoke-virtual {v14, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1376
    invoke-virtual {v14, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 1354
    :cond_2
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_0

    .line 1380
    :cond_3
    invoke-virtual {v14}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1383
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x81

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v1}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 1384
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 1385
    invoke-static {v15}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v16

    .line 1386
    move-object/from16 v0, v16

    array-length v0, v0

    invoke-virtual {v5, v0}, Lo/cye;->a(I)V

    .line 1387
    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Lo/cye;->a([B)V

    .line 1388
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(I)V

    .line 1389
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->b(Z)V

    .line 1390
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lo/cye;->c(I)V

    .line 1391
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lo/cye;->f(I)V

    .line 1392
    return-object v5
.end method

.method private static e(Landroid/content/Context;ILjava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 12

    .line 1456
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 1457
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "parseCommandIDInfo with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1458
    return-void

    .line 1462
    :cond_1
    invoke-static {}, Lo/daa;->b()Ljava/util/Map;

    move-result-object v6

    .line 1464
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/List;

    .line 1466
    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1467
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v8, v0, :cond_4

    .line 1468
    add-int/lit8 v0, v8, 0x2

    invoke-virtual {p2, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v9, 0x1

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    .line 1470
    :goto_1
    div-int/lit8 v10, v8, 0x2

    .line 1471
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-lt v10, v0, :cond_3

    .line 1472
    return-void

    .line 1474
    :cond_3
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 1475
    invoke-static {p1, v11, v9, p3}, Lo/cxv;->b(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1467
    add-int/lit8 v8, v8, 0x2

    goto :goto_0

    .line 1478
    :cond_4
    return-void
.end method

.method public static e(Lo/dqe;)V
    .locals 5

    .line 2069
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setIConnectService."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2070
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 2071
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setIConnectService with mIConnectService is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2075
    :cond_0
    sput-object p0, Lo/cxo;->b:Lo/dqe;

    .line 2076
    return-void
.end method

.method public static e(Landroid/content/Context;I[B)Z
    .locals 13

    .line 1066
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 1067
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "checkTimeOutInfo with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1069
    const/4 v0, 0x1

    return v0

    .line 1072
    :cond_1
    const/4 v0, 0x1

    if-eq v0, p1, :cond_2

    const/4 v0, 0x2

    if-ne v0, p1, :cond_4

    .line 1077
    :cond_2
    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 1079
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1080
    new-instance v8, Lo/daz;

    invoke-direct {v8}, Lo/daz;-><init>()V

    .line 1083
    :try_start_0
    invoke-virtual {v8, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 1088
    goto :goto_0

    .line 1084
    :catch_0
    move-exception v10

    .line 1085
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "checkTimeOutInfo tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1087
    const/4 v0, 0x1

    return v0

    .line 1090
    :goto_0
    iget-object v10, v9, Lo/dba;->e:Ljava/util/List;

    .line 1091
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1092
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v11

    .line 1093
    const/16 v0, 0x7f

    if-ne v0, v11, :cond_3

    .line 1094
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v12

    .line 1096
    const v0, 0x186a0

    if-eq v0, v12, :cond_3

    .line 1097
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "error code = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1098
    const/4 v0, 0x1

    return v0

    .line 1103
    :cond_3
    const/4 v0, 0x0

    return v0

    .line 1104
    :cond_4
    const/4 v0, 0x0

    if-ne v0, p1, :cond_6

    .line 1106
    const/16 v6, 0x8

    .line 1107
    array-length v0, p2

    if-ne v6, v0, :cond_5

    const/4 v0, 0x2

    aget-byte v0, p2, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_5

    .line 1108
    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 1109
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x8

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v7, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 1110
    const/16 v0, 0x10

    invoke-static {v8, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 1111
    const v0, 0x186a9

    if-ne v0, v9, :cond_5

    .line 1112
    const/4 v0, 0x1

    return v0

    .line 1116
    :cond_5
    const/4 v0, 0x0

    return v0

    .line 1119
    :cond_6
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;[B)Z
    .locals 12

    .line 664
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 665
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceGATTTime with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 666
    const/4 v0, 0x0

    return v0

    .line 670
    :cond_1
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 672
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 673
    new-instance v8, Lo/daz;

    invoke-direct {v8}, Lo/daz;-><init>()V

    .line 676
    :try_start_0
    invoke-virtual {v8, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v9

    .line 680
    goto :goto_0

    .line 677
    :catch_0
    move-exception v10

    .line 678
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceLinkParameter tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 679
    const/4 v0, 0x0

    return v0

    .line 682
    :goto_0
    iget-object v10, v9, Lo/dba;->e:Ljava/util/List;

    .line 683
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 684
    const/4 v11, -0x1

    .line 685
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v11

    .line 686
    const v0, 0x186a0

    if-ne v0, v11, :cond_2

    .line 687
    const/4 v0, 0x1

    return v0

    .line 689
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 692
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static e(Landroid/content/Context;[BLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Z
    .locals 17

    .line 1487
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_1

    .line 1488
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceCommandCapability with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1492
    :cond_1
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 1493
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1494
    :cond_2
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "dataStrInfo is incorrect for resolveBTDeviceCommandCapability."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1495
    const/4 v0, 0x0

    return v0

    .line 1499
    :cond_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1500
    const/4 v8, 0x0

    .line 1501
    new-instance v9, Lo/daz;

    invoke-direct {v9}, Lo/daz;-><init>()V

    .line 1503
    :try_start_0
    invoke-virtual {v9, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v8, v0

    .line 1506
    goto :goto_0

    .line 1504
    :catch_0
    move-exception v10

    .line 1505
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceCommandCapability tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1508
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v8, :cond_6

    .line 1509
    const/4 v10, 0x0

    .line 1510
    const-string v11, ""

    .line 1512
    iget-object v12, v8, Lo/dba;->b:Ljava/util/List;

    .line 1513
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/dba;

    .line 1514
    iget-object v0, v14, Lo/dba;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lo/daw;

    .line 1515
    invoke-virtual/range {v16 .. v16}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_3

    .line 1517
    :sswitch_0
    invoke-virtual/range {v16 .. v16}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v10

    .line 1518
    goto :goto_3

    .line 1520
    :sswitch_1
    invoke-virtual/range {v16 .. v16}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v11

    .line 1522
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-static {v0, v10, v11, v1}, Lo/cxo;->e(Landroid/content/Context;ILjava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1523
    .line 1527
    :goto_3
    goto :goto_2

    .line 1528
    :cond_4
    goto/16 :goto_1

    .line 1530
    :cond_5
    const/4 v0, 0x1

    return v0

    .line 1532
    :cond_6
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "tlvFather is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1533
    const/4 v0, 0x0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method public static e(Landroid/content/Context;[BLjava/lang/String;)[B
    .locals 8

    .line 912
    const/4 v0, 0x3

    new-array v5, v0, [B

    .line 913
    array-length v0, p1

    add-int/lit8 v0, v0, -0x3

    new-array v6, v0, [B

    .line 914
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptTLVsV1 before encrypt sCmd ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 917
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {p1, v0, v5, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 919
    array-length v0, p1

    add-int/lit8 v0, v0, -0x3

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {p1, v1, v6, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 922
    const/4 v0, 0x0

    invoke-static {p0, v6, p2, v0}, Lo/cxo;->b(Landroid/content/Context;[BLjava/lang/String;[B)[B

    move-result-object v6

    .line 925
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 926
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "encryptTLVsV1 After encrypt result ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 927
    invoke-static {v7}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public static f(Landroid/content/Context;[B)I
    .locals 13

    .line 1863
    const/4 v6, -0x1

    .line 1864
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p0, :cond_1

    .line 1865
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "getBTDeviceAvailableStatusParameter with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1866
    return v6

    .line 1872
    :cond_1
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v7

    .line 1874
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v7, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    .line 1875
    new-instance v9, Lo/daz;

    invoke-direct {v9}, Lo/daz;-><init>()V

    .line 1878
    :try_start_0
    invoke-virtual {v9, v8}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v10

    .line 1882
    goto :goto_0

    .line 1879
    :catch_0
    move-exception v11

    .line 1880
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "getBTDeviceAvailableStatusParameter tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1881
    return v6

    .line 1884
    :goto_0
    iget-object v11, v10, Lo/dba;->e:Ljava/util/List;

    .line 1885
    const/4 v12, 0x0

    :goto_1
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_2

    .line 1886
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 1888
    :sswitch_0
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, " Not support dual phone connection."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1889
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 1890
    goto/16 :goto_2

    .line 1892
    :sswitch_1
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "current connected."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1893
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 1894
    goto/16 :goto_2

    .line 1896
    :sswitch_2
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Has been connected."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1897
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 1898
    goto :goto_2

    .line 1900
    :sswitch_3
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Double phone situation."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1901
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 1902
    goto :goto_2

    .line 1904
    :sswitch_4
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "notify device operation."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1905
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 1885
    .line 1906
    :goto_2
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 1911
    :cond_2
    return v6

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x7f -> :sswitch_4
    .end sparse-switch
.end method

.method public static f()Lo/cye;
    .locals 3

    .line 1918
    new-instance v1, Lo/cye;

    invoke-direct {v1}, Lo/cye;-><init>()V

    .line 1919
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->c(I)V

    .line 1920
    const/16 v0, 0x14

    invoke-virtual {v1, v0}, Lo/cye;->f(I)V

    .line 1922
    const/4 v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 1924
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1925
    const/16 v0, 0x14

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1928
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1930
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1932
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v1, v0}, Lo/cye;->a(I)V

    .line 1933
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/cye;->a([B)V

    .line 1934
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(I)V

    .line 1935
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(Z)V

    .line 1937
    return-object v1
.end method

.method public static g()Z
    .locals 13

    .line 2096
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 2097
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.iconnect.action.WEAR_CONNECT_SERVICE"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2098
    const/4 v0, 0x0

    invoke-virtual {v5, v6, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v7

    .line 2099
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 2100
    :cond_0
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getIConnectServiceAction: listInfo is empty."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2101
    const/4 v0, 0x0

    return v0

    .line 2105
    :cond_1
    const/4 v8, 0x0

    .line 2106
    const/4 v9, 0x0

    .line 2107
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/content/pm/ResolveInfo;

    .line 2108
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "pkgName = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v11, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", service = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v11, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2110
    :try_start_0
    iget-object v0, v11, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v8, v0

    .line 2113
    goto :goto_1

    .line 2111
    :catch_0
    move-exception v12

    .line 2112
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "e = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v12}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2115
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 2116
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getIConnectServiceAction: null == applicationInfo"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2117
    goto/16 :goto_0

    .line 2120
    :cond_2
    iget v0, v8, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    const/4 v9, 0x1

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    .line 2121
    :goto_2
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getIConnectServiceAction: isSystemApp = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2123
    if-nez v9, :cond_4

    .line 2124
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getIConnectServiceAction: not system app"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2125
    goto/16 :goto_0

    .line 2128
    :cond_4
    const/4 v0, 0x1

    return v0

    .line 2131
    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public static h()Z
    .locals 6

    .line 2083
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.huawei.iconnect"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 2084
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect pkg exist."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2085
    const/4 v0, 0x1

    return v0

    .line 2086
    :catch_0
    move-exception v5

    .line 2087
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "iconnect pkg do not exist."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2088
    const/4 v0, 0x0

    return v0
.end method

.method public static i()Lo/cye;
    .locals 3

    .line 1941
    new-instance v1, Lo/cye;

    invoke-direct {v1}, Lo/cye;-><init>()V

    .line 1942
    const/16 v0, 0x26

    invoke-virtual {v1, v0}, Lo/cye;->c(I)V

    .line 1943
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->f(I)V

    .line 1945
    const/4 v0, 0x6

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 1947
    const/16 v0, 0x26

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1948
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1950
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1951
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1953
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1954
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 1956
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v1, v0}, Lo/cye;->a(I)V

    .line 1957
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Lo/cye;->a([B)V

    .line 1958
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(I)V

    .line 1959
    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lo/cye;->b(Z)V

    .line 1961
    return-object v1
.end method

.method public static k(Landroid/content/Context;[B)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;[B)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1261
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    move-object/from16 v1, p0

    if-ne v0, v1, :cond_1

    .line 1262
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceServiceCapability with parameter is not correct."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1266
    :cond_1
    invoke-static/range {p1 .. p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 1267
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 1268
    :cond_2
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "dataStrInfo is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1269
    const/4 v0, 0x0

    return-object v0

    .line 1273
    :cond_3
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v6, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 1274
    new-instance v8, Lo/daz;

    invoke-direct {v8}, Lo/daz;-><init>()V

    .line 1275
    const/4 v9, 0x0

    .line 1277
    :try_start_0
    invoke-virtual {v8, v7}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 1280
    goto :goto_0

    .line 1278
    :catch_0
    move-exception v10

    .line 1279
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "resolveBTDeviceLinkParameter tlv resolve exception."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1282
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v9, :cond_9

    .line 1283
    const-string v10, ""

    .line 1284
    iget-object v11, v9, Lo/dba;->e:Ljava/util/List;

    .line 1285
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 1286
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/daw;

    invoke-virtual {v0}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    .line 1288
    :cond_4
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "TLV info is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1291
    :goto_1
    invoke-static {}, Lo/daa;->e()Ljava/util/List;

    move-result-object v12

    .line 1293
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_8

    .line 1294
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 1296
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1297
    sget-object v0, Lo/cxo;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1299
    const/4 v14, 0x0

    :goto_2
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-ge v14, v0, :cond_7

    .line 1301
    mul-int/lit8 v0, v14, 0x2

    mul-int/lit8 v1, v14, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v10, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v15

    .line 1302
    const/16 v0, 0x10

    invoke-static {v15, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v16

    .line 1303
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v14, v0, :cond_6

    .line 1304
    const/4 v0, 0x1

    move/from16 v1, v16

    if-ne v0, v1, :cond_5

    .line 1306
    add-int/lit8 v0, v14, 0x1

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1308
    :cond_5
    sget-object v0, Lo/cxo;->c:Ljava/util/List;

    add-int/lit8 v1, v14, 0x1

    invoke-interface {v12, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1299
    :cond_6
    :goto_3
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 1313
    :cond_7
    return-object v13

    .line 1315
    :cond_8
    const/4 v0, 0x0

    return-object v0

    .line 1318
    :cond_9
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTHandshakeManager"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "tlvFather is null."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1319
    const/4 v0, 0x0

    return-object v0
.end method

.method private static k()[B
    .locals 7

    .line 935
    const/4 v5, 0x0

    .line 938
    const/16 v0, 0x10

    :try_start_0
    invoke-static {v0}, Lo/cxt;->a(I)[B

    move-result-object v5

    .line 939
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 940
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "generateRandomBytes fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 942
    const/4 v0, 0x0

    return-object v0

    .line 944
    :cond_0
    return-object v5

    .line 946
    :catch_0
    move-exception v6

    .line 947
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "generateRandomBytes exception with info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 949
    const/4 v0, 0x0

    return-object v0
.end method

.method private static n()Ljava/lang/String;
    .locals 7

    .line 2139
    sget-object v5, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    .line 2140
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v6

    .line 2141
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-lt v0, v1, :cond_0

    .line 2142
    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-virtual {v6, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    .line 2144
    :cond_0
    const-string v6, "000000"

    .line 2147
    :goto_0
    const-string v0, "01"

    const-string v1, "BTHandshakeManager"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "sn = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2148
    return-object v6
.end method
