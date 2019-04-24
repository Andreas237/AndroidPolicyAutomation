.class public Lcom/huawei/operation/beans/WebViewConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private titleBeanConfigs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/operation/beans/TitleBean;>;"
        }
    .end annotation
.end field

.field private urlBean:Lcom/huawei/operation/beans/UrlBean;

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public config_setTitleBeanConfigs(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/operation/beans/TitleBean;>;)V"
        }
    .end annotation

    .line 27
    iput-object p1, p0, Lcom/huawei/operation/beans/WebViewConfig;->titleBeanConfigs:Ljava/util/List;

    .line 28
    return-void
.end method

.method public config_setUrlBean(Lcom/huawei/operation/beans/UrlBean;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/huawei/operation/beans/WebViewConfig;->urlBean:Lcom/huawei/operation/beans/UrlBean;

    .line 16
    return-void
.end method

.method public config_setVersion(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/operation/beans/WebViewConfig;->version:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public fetch_getTitleBeanConfigs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/operation/beans/TitleBean;>;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/huawei/operation/beans/WebViewConfig;->titleBeanConfigs:Ljava/util/List;

    return-object v0
.end method

.method public fetch_getUrlBean()Lcom/huawei/operation/beans/UrlBean;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/huawei/operation/beans/WebViewConfig;->urlBean:Lcom/huawei/operation/beans/UrlBean;

    return-object v0
.end method

.method public fetch_getVersion()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/operation/beans/WebViewConfig;->version:Ljava/lang/String;

    return-object v0
.end method
