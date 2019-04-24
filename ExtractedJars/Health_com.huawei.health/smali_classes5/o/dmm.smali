.class public Lo/dmm;
.super Lo/dmj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dmj<Ljava/util/List<Ljava/lang/String;>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/dmj;-><init>(I)V

    .line 26
    return-void
.end method

.method private a(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/util/List<Ljava/lang/String;>;>;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/util/List<Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 40
    const-string v0, "SMART_UserLabelParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseUserLable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    iget-object v0, p0, Lo/dmm;->d:Ljava/lang/String;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 46
    const-string v0, "labels"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dmm;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v5

    .line 47
    const-string v0, "SMART_UserLabelParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "labels = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p1, v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponse(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    goto :goto_0

    .line 49
    :catch_0
    move-exception v6

    .line 50
    const-string v0, "SMART_UserLabelParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parse json error "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    const/16 v0, 0x65

    invoke-virtual {p1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseCode(I)V

    .line 52
    const-string v0, "parse json failed"

    invoke-virtual {p1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseDesc(Ljava/lang/String;)V

    .line 53
    return-object p1

    .line 56
    :goto_0
    return-object p1
.end method

.method private a(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lorg/json/JSONArray;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 69
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 71
    return-object v1

    .line 74
    :cond_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v2

    .line 76
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 77
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v4

    .line 78
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 81
    :cond_1
    return-object v1
.end method


# virtual methods
.method protected b(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/util/List<Ljava/lang/String;>;>;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/util/List<Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 30
    invoke-direct {p0, p1}, Lo/dmm;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;

    move-result-object v0

    return-object v0
.end method
