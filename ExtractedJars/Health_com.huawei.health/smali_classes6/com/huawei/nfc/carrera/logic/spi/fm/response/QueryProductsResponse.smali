.class public Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.source "SourceFile"


# instance fields
.field private list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcn/com/fmsh/tsm/business/bean/Product;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcn/com/fmsh/tsm/business/bean/Product;>;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->list:Ljava/util/List;

    return-object v0
.end method

.method public setList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcn/com/fmsh/tsm/business/bean/Product;>;)V"
        }
    .end annotation

    .line 20
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryProductsResponse;->list:Ljava/util/List;

    .line 21
    return-void
.end method
