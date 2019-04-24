.class public Lo/dmh;
.super Lo/dmj;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dmj<Ljava/lang/Long;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lo/dmj;-><init>(I)V

    .line 22
    return-void
.end method


# virtual methods
.method protected b(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/lang/Long;>;)Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper<Ljava/lang/Long;>;"
        }
    .end annotation

    .line 26
    const-string v0, "CompletionNumParser"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDistinctResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    const-wide/16 v4, 0x0

    .line 29
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    iget-object v0, p0, Lo/dmh;->d:Ljava/lang/String;

    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 31
    const-string v0, "completionNum"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    move-wide v4, v0

    .line 32
    const-string v0, "CompletionNumParser"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter parseDistinctResponse jsonObject ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    goto :goto_0

    .line 40
    :catch_0
    move-exception v6

    .line 41
    const-string v0, "CompletionNumParser"

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

    .line 42
    const/16 v0, 0x65

    invoke-virtual {p1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseCode(I)V

    .line 43
    const-string v0, "parse json failed"

    invoke-virtual {p1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponseDesc(Ljava/lang/String;)V

    .line 45
    :goto_0
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartResponseWrapper;->setResponse(Ljava/lang/Object;)V

    .line 46
    return-object p1
.end method
