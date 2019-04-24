.class public Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static get2DelRstIssueId(Landroid/content/Context;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 64
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;->getEseAppletId(Landroid/content/Context;)Ljava/util/List;

    move-result-object v2

    .line 65
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 67
    :cond_0
    const-string v0, "get2DelRstIssueId listEseAppletId is null or empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 68
    const/4 v0, 0x0

    return-object v0

    .line 70
    :cond_1
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 72
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;->getTAAid(Landroid/content/Context;)Ljava/util/Set;

    move-result-object v4

    .line 73
    if-nez v4, :cond_2

    .line 75
    const-string v0, "get2DelRstIssueId taAId is null."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_2
    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_3

    .line 80
    invoke-interface {v3, v4}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 82
    :cond_3
    invoke-static {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;->getIssueIdFromAppletId(Landroid/content/Context;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v5

    .line 83
    if-eqz v5, :cond_4

    invoke-interface {v5}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 85
    :cond_4
    const-string v0, "CardOperateUtil get2DelRstIssueId result empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardOperateUtil get2DelRstIssueId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 89
    return-object v5
.end method

.method private static getEseAppletId(Landroid/content/Context;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 102
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;

    invoke-direct {v2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;-><init>(Landroid/content/Context;)V

    .line 103
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/InitEseTsmOperator;->excute()I

    move-result v3

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardOperateUtil initEse result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 107
    new-instance v4, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;-><init>()V

    .line 108
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->setCplc(Ljava/lang/String;)V

    .line 109
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;->setTerminal(Ljava/lang/String;)V

    .line 111
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->queryCardApplet(Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;

    move-result-object v5

    .line 112
    if-eqz v5, :cond_0

    iget v0, v5, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;->returnCode:I

    if-eqz v0, :cond_1

    .line 114
    :cond_0
    const-string v0, "CardOperateUtil queryCardApplet failed"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 115
    const/4 v0, 0x0

    return-object v0

    .line 118
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;->getApplet2SsdAndCapList()Ljava/util/List;

    move-result-object v6

    .line 119
    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 121
    :cond_2
    const-string v0, "CardOperateUtil getApplet2SsdAndCapList result empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 122
    const/4 v0, 0x0

    return-object v0

    .line 125
    :cond_3
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 126
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;

    .line 128
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/server/card/model/Applet2SsdAndCapObject;->getAppletAid()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    goto :goto_0

    .line 130
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardOperateUtil getEseAppletId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 132
    return-object v7
.end method

.method private static getIssueIdFromAppletId(Landroid/content/Context;Ljava/util/Set;)Ljava/util/Set;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/Set<Ljava/lang/String;>;)Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 175
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 177
    :cond_0
    const-string v0, "CardOperateUtil getIssueIdFromAppletId param empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 178
    const/4 v0, 0x0

    return-object v0

    .line 182
    :cond_1
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-direct {v0, p0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfo()Ljava/util/List;

    move-result-object v2

    .line 183
    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 185
    :cond_2
    const-string v0, "CardOperateUtil queryIssuerInfo result empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 186
    const/4 v0, 0x0

    return-object v0

    .line 189
    :cond_3
    const/4 v3, 0x0

    .line 190
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 193
    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 195
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 197
    goto :goto_0

    .line 199
    :cond_4
    const-string v0, "5943542E55534552"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 201
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 203
    const/4 v0, 0x0

    if-ne v0, v8, :cond_5

    .line 205
    goto :goto_1

    .line 207
    :cond_5
    const-string v0, "5943542E55534552"

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 209
    const-string v0, "t_yct_yct"

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 211
    const/4 v3, 0x1

    goto :goto_2

    .line 215
    :cond_6
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 218
    :cond_7
    :goto_2
    goto :goto_1

    :cond_8
    goto :goto_4

    .line 222
    :cond_9
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 224
    const/4 v0, 0x0

    if-eq v0, v8, :cond_a

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 226
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 227
    goto :goto_4

    .line 229
    :cond_a
    goto :goto_3

    .line 231
    :cond_b
    :goto_4
    if-eqz v3, :cond_c

    .line 233
    const-string v0, "t_yct_yct"

    invoke-interface {v4, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    :cond_c
    goto/16 :goto_0

    .line 240
    :cond_d
    goto :goto_5

    .line 237
    :catch_0
    move-exception v5

    .line 239
    const-string v0, "getIssueIdFromAppletId aid is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 241
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardOperateUtil getIssueIdFromAppletId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 242
    return-object v4
.end method

.method private static getTAAid(Landroid/content/Context;)Ljava/util/Set;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/Set<Ljava/lang/String;>;"
        }
    .end annotation

    .line 144
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardListForDelete()Ljava/util/ArrayList;

    move-result-object v2

    .line 147
    if-nez v2, :cond_0

    .line 149
    const-string v0, "CardOperateUtil getCardList result empty"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 150
    const/4 v0, 0x0

    return-object v0

    .line 152
    :cond_0
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 153
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 157
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 158
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "from ta aid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 159
    goto :goto_0

    .line 161
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardOperateUtil getTAIssueId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 162
    return-object v3
.end method

.method public static isDeleteApplet(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 7

    .line 34
    invoke-static {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;->getEseAppletId(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    .line 35
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 36
    const/4 v0, 0x0

    return v0

    .line 39
    :cond_0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 40
    invoke-static {p0, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/util/CardOperateUtil;->getIssueIdFromAppletId(Landroid/content/Context;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    .line 41
    const/4 v0, 0x0

    if-ne v0, v3, :cond_1

    .line 42
    const/4 v0, 0x0

    return v0

    .line 45
    :cond_1
    const/4 v4, 0x0

    .line 46
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 47
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 48
    const/4 v4, 0x1

    .line 50
    :cond_2
    goto :goto_0

    .line 52
    :cond_3
    if-nez v4, :cond_4

    const/4 v0, 0x1

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    return v0
.end method
