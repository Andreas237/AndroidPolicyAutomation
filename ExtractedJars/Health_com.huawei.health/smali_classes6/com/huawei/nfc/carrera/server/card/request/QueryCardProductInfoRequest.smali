.class public Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# static fields
.field private static final DEFAULT_CLIENT:Ljava/lang/String; = "nfc"

.field private static final DEFAULT_VERSION:Ljava/lang/String; = "201607V1_9"


# instance fields
.field private client:Ljava/lang/String;

.field private filters:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation
.end field

.field private timeStamp:J

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 16
    const-string v0, "201607V1_9"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->version:Ljava/lang/String;

    .line 17
    const-string v0, "nfc"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->client:Ljava/lang/String;

    .line 18
    return-void
.end method


# virtual methods
.method public getClient()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->client:Ljava/lang/String;

    return-object v0
.end method

.method public getFilters()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->filters:Ljava/util/Set;

    return-object v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 40
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->timeStamp:J

    return-wide v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setClient(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->client:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setFilters(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;)V"
        }
    .end annotation

    .line 65
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->filters:Ljava/util/Set;

    .line 66
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 60
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->timeStamp:J

    .line 61
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->version:Ljava/lang/String;

    .line 51
    return-void
.end method
