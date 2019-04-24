.class public Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final KEY_CARD_INFO:Ljava/lang/String; = "cardInfo"

.field private static final KEY_PIN:Ljava/lang/String; = "pin"


# instance fields
.field public mCardInfo:Ljava/lang/String;

.field public mPin:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;->mCardInfo:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;->mPin:Ljava/lang/String;

    .line 34
    return-void
.end method


# virtual methods
.method public toJasonString()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 38
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 39
    const-string v0, "cardInfo"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;->mCardInfo:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;->mPin:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 41
    const-string v0, "pin"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;->mPin:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 45
    :cond_0
    return-object v2
.end method
