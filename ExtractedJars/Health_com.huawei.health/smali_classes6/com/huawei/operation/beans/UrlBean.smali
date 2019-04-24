.class public Lcom/huawei/operation/beans/UrlBean;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private kaKaExchangeUrl:Ljava/lang/String;

.field private orderManagerUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public config_setKaKaExchangeUrl(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/operation/beans/UrlBean;->kaKaExchangeUrl:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public config_setOrderManagerUrl(Ljava/lang/String;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/huawei/operation/beans/UrlBean;->orderManagerUrl:Ljava/lang/String;

    .line 13
    return-void
.end method

.method public fetch_getOrderManagerUrl()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/huawei/operation/beans/UrlBean;->orderManagerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getKaKaExchangeUrl()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/operation/beans/UrlBean;->kaKaExchangeUrl:Ljava/lang/String;

    return-object v0
.end method
