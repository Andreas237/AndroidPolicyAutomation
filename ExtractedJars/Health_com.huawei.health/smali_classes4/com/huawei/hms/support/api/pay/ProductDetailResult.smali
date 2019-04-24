.class public Lcom/huawei/hms/support/api/pay/ProductDetailResult;
.super Lcom/huawei/hms/support/api/client/Result;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/ProductDetail;>;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/ProductFailObject;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/Result;-><init>()V

    return-void
.end method


# virtual methods
.method public getFailList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/ProductFailObject;>;"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->c:Ljava/util/List;

    return-object v0
.end method

.method public getProductList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/ProductDetail;>;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->b:Ljava/util/List;

    return-object v0
.end method

.method public getRequestId()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->a:Ljava/lang/String;

    return-object v0
.end method

.method public setFailList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/ProductFailObject;>;)V"
        }
    .end annotation

    .line 80
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->c:Ljava/util/List;

    .line 81
    return-void
.end method

.method public setProductList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hms/support/api/entity/pay/ProductDetail;>;)V"
        }
    .end annotation

    .line 64
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->b:Ljava/util/List;

    .line 65
    return-void
.end method

.method public setRequestId(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hms/support/api/pay/ProductDetailResult;->a:Ljava/lang/String;

    .line 49
    return-void
.end method
