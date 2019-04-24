.class public Lcom/shopkick/app/queue/ScanApiRequestWrapper;
.super Lcom/shopkick/app/queue/ApiObjectWrapper;
.source "ScanApiRequestWrapper.java"


# instance fields
.field public barcode:Ljava/lang/String;

.field public latitude:Ljava/lang/Double;

.field public longitude:Ljava/lang/Double;

.field public productFamilyID:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Lcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/app/awards/AwardsManager$RequestType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 12

    move-object v11, p0

    .line 25
    invoke-direct {p0}, Lcom/shopkick/app/queue/ApiObjectWrapper;-><init>()V

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 30
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 31
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 32
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    move-object v0, p0

    move-object/from16 v1, p7

    move-object v2, p1

    move-object/from16 v3, p6

    .line 26
    invoke-virtual/range {v0 .. v10}, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->init(Lcom/shopkick/app/awards/AwardsManager$RequestType;Ljava/lang/String;Lcom/shopkick/fetchers/network/NetworkRequest;Ljava/lang/String;JJJ)V

    move-object v0, p2

    .line 33
    iput-object v0, v11, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->barcode:Ljava/lang/String;

    move-object v0, p3

    .line 34
    iput-object v0, v11, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->productFamilyID:Ljava/lang/String;

    move-object/from16 v0, p4

    .line 35
    iput-object v0, v11, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->latitude:Ljava/lang/Double;

    move-object/from16 v0, p5

    .line 36
    iput-object v0, v11, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->longitude:Ljava/lang/Double;

    return-void
.end method


# virtual methods
.method public populateUsingJSONObject(Lorg/json/JSONObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 50
    invoke-super {p0, p1}, Lcom/shopkick/app/queue/ApiObjectWrapper;->populateUsingJSONObject(Lorg/json/JSONObject;)V

    const-string v0, "barcode"

    .line 51
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->barcode:Ljava/lang/String;

    return-void
.end method

.method public toJSONObject()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 41
    invoke-super {p0}, Lcom/shopkick/app/queue/ApiObjectWrapper;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/shopkick/app/queue/ScanApiRequestWrapper;->barcode:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "barcode"

    .line 43
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method
