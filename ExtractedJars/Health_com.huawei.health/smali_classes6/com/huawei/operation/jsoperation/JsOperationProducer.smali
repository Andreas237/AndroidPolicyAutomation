.class public Lcom/huawei/operation/jsoperation/JsOperationProducer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final request:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lcom/huawei/operation/jsoperation/JsCommand;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/operation/jsoperation/JsOperationProducer;->request:Ljava/util/Map;

    .line 16
    sget-object v0, Lcom/huawei/operation/jsoperation/JsOperationProducer;->request:Ljava/util/Map;

    const-string v1, "STRESS"

    new-instance v2, Lcom/huawei/operation/jsoperation/StressService;

    invoke-direct {v2}, Lcom/huawei/operation/jsoperation/StressService;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    sget-object v0, Lcom/huawei/operation/jsoperation/JsOperationProducer;->request:Ljava/util/Map;

    const-string v1, "DATA"

    new-instance v2, Lcom/huawei/operation/jsoperation/DataService;

    invoke-direct {v2}, Lcom/huawei/operation/jsoperation/DataService;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static produceRequest(Ljava/lang/String;)Lcom/huawei/operation/jsoperation/JsCommand;
    .locals 1

    .line 21
    sget-object v0, Lcom/huawei/operation/jsoperation/JsOperationProducer;->request:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/operation/jsoperation/JsCommand;

    return-object v0
.end method
