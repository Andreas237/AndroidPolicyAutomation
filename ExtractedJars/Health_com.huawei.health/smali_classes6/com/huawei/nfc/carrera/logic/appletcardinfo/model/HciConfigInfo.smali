.class public Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciConfigInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HCI_DATA_TYPE_AFTER_TERMINAL_ID:Ljava/lang/String; = "terminal"

.field public static final HCI_DATA_TYPE_AFTER_TRANSCTION_BALANCE:Ljava/lang/String; = "balance"

.field public static final HCI_DATA_TYPE_TRANSCTION_AMOUNT:Ljava/lang/String; = "amt"

.field public static final HCI_DATA_TYPE_TRANSCTION_DATE:Ljava/lang/String; = "date"

.field public static final HCI_DATA_TYPE_TRANSCTION_TIME:Ljava/lang/String; = "time"

.field public static final HCI_DATA_TYPE_TRANSCTION_TYPE:Ljava/lang/String; = "trans_type"

.field public static final HCI_DATA_TYPE_VERSION:Ljava/lang/String; = "version"


# instance fields
.field private operations:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;>;"
        }
    .end annotation
.end field

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciConfigInfo;->operations:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public addOperations(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;)V"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciConfigInfo;->operations:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    return-void
.end method

.method public getOperationsByType(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/nfc/carrera/logic/appletcardinfo/operation/Operation;>;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciConfigInfo;->operations:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciConfigInfo;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/HciConfigInfo;->version:Ljava/lang/String;

    .line 41
    return-void
.end method
