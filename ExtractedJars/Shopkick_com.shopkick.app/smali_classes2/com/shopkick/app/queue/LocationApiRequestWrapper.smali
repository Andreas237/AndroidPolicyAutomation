.class public Lcom/shopkick/app/queue/LocationApiRequestWrapper;
.super Lcom/shopkick/app/queue/ApiObjectWrapper;
.source "LocationApiRequestWrapper.java"


# instance fields
.field public presenceCode:Ljava/lang/String;

.field public source:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/shopkick/fetchers/network/NetworkRequest;Lcom/shopkick/app/awards/AwardsManager$RequestType;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 12

    move-object v11, p0

    .line 22
    invoke-direct {p0}, Lcom/shopkick/app/queue/ApiObjectWrapper;-><init>()V

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    .line 27
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    .line 28
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    .line 29
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    move-object v0, p0

    move-object/from16 v1, p5

    move-object v2, p1

    move-object/from16 v3, p4

    .line 23
    invoke-virtual/range {v0 .. v10}, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->init(Lcom/shopkick/app/awards/AwardsManager$RequestType;Ljava/lang/String;Lcom/shopkick/fetchers/network/NetworkRequest;Ljava/lang/String;JJJ)V

    move-object v0, p2

    .line 30
    iput-object v0, v11, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->presenceCode:Ljava/lang/String;

    move v0, p3

    .line 31
    iput v0, v11, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->source:I

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

    .line 45
    invoke-super {p0, p1}, Lcom/shopkick/app/queue/ApiObjectWrapper;->populateUsingJSONObject(Lorg/json/JSONObject;)V

    const-string v0, "presence_code"

    .line 46
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->presenceCode:Ljava/lang/String;

    return-void
.end method

.method public toJSONObject()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 36
    invoke-super {p0}, Lcom/shopkick/app/queue/ApiObjectWrapper;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    .line 37
    iget-object v1, p0, Lcom/shopkick/app/queue/LocationApiRequestWrapper;->presenceCode:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "presence_code"

    .line 38
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    return-object v0
.end method
