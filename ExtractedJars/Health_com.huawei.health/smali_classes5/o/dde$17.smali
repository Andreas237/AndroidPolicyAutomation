.class Lo/dde$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dde;


# direct methods
.method constructor <init>(Lo/dde;)V
    .locals 0

    .line 3008
    iput-object p1, p0, Lo/dde$17;->c:Lo/dde;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 3012
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3014
    new-instance v5, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/DBTableKeyInfo;-><init>()V

    .line 3015
    const-string v0, "indexs"

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyName(Ljava/lang/String;)V

    .line 3016
    const-string v0, "integer"

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyType(Ljava/lang/String;)V

    .line 3017
    new-instance v6, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-direct {v6}, Lcom/huawei/datatype/DBTableKeyInfo;-><init>()V

    .line 3018
    const-string v0, "switch"

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyName(Ljava/lang/String;)V

    .line 3019
    const-string v0, "integer"

    invoke-virtual {v6, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyType(Ljava/lang/String;)V

    .line 3020
    new-instance v7, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-direct {v7}, Lcom/huawei/datatype/DBTableKeyInfo;-><init>()V

    .line 3021
    const-string v0, "time_switch"

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyName(Ljava/lang/String;)V

    .line 3022
    const-string v0, "integer"

    invoke-virtual {v7, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyType(Ljava/lang/String;)V

    .line 3023
    new-instance v8, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-direct {v8}, Lcom/huawei/datatype/DBTableKeyInfo;-><init>()V

    .line 3024
    const-string v0, "type"

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyName(Ljava/lang/String;)V

    .line 3025
    const-string v0, "integer"

    invoke-virtual {v8, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyType(Ljava/lang/String;)V

    .line 3026
    new-instance v9, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-direct {v9}, Lcom/huawei/datatype/DBTableKeyInfo;-><init>()V

    .line 3027
    const-string v0, "start_time"

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyName(Ljava/lang/String;)V

    .line 3028
    const-string v0, "varchar(50)"

    invoke-virtual {v9, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyType(Ljava/lang/String;)V

    .line 3029
    new-instance v10, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-direct {v10}, Lcom/huawei/datatype/DBTableKeyInfo;-><init>()V

    .line 3030
    const-string v0, "end_time"

    invoke-virtual {v10, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyName(Ljava/lang/String;)V

    .line 3031
    const-string v0, "varchar(50)"

    invoke-virtual {v10, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyType(Ljava/lang/String;)V

    .line 3032
    new-instance v11, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-direct {v11}, Lcom/huawei/datatype/DBTableKeyInfo;-><init>()V

    .line 3033
    const-string v0, "cycle"

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyName(Ljava/lang/String;)V

    .line 3034
    const-string v0, "integer"

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/DBTableKeyInfo;->setKeyType(Ljava/lang/String;)V

    .line 3036
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3037
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3038
    invoke-interface {v4, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3039
    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3040
    invoke-interface {v4, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3041
    invoke-interface {v4, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3042
    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3044
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 3045
    const-string v0, "User_ID varchar(50) primary key,"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3046
    const/4 v13, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v13, v0, :cond_1

    .line 3047
    add-int/lit8 v0, v13, 0x1

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 3048
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/DBTableKeyInfo;->getKeyName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/DBTableKeyInfo;->getKeyType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 3050
    :cond_0
    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-virtual {v0}, Lcom/huawei/datatype/DBTableKeyInfo;->getKeyName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/datatype/DBTableKeyInfo;

    invoke-virtual {v1}, Lcom/huawei/datatype/DBTableKeyInfo;->getKeyType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3046
    :goto_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    .line 3054
    :cond_1
    iget-object v0, p0, Lo/dde$17;->c:Lo/dde;

    const-string v1, "avoid_disturb"

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Lo/dde;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 3057
    iget-object v0, p0, Lo/dde$17;->c:Lo/dde;

    invoke-static {v0}, Lo/dde;->c(Lo/dde;)Lo/dqi;

    move-result-object v0

    new-instance v1, Lo/dde$17$1;

    invoke-direct {v1, p0}, Lo/dde$17$1;-><init>(Lo/dde$17;)V

    invoke-virtual {v0, v1}, Lo/dqi;->h(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 3068
    return-void
.end method
