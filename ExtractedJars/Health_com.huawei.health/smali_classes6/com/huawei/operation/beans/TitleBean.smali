.class public Lcom/huawei/operation/beans/TitleBean;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final LEFTBTN_TYPE_ARROW:Ljava/lang/String; = "arrow"

.field public static final LEFTBTN_TYPE_X:Ljava/lang/String; = "x"

.field public static final RIGHTBTN_TYPE_IS_MY_ACTIVITY:Ljava/lang/String; = "isMyActivity"

.field public static final RIGHTBTN_TYPE_MORE:Ljava/lang/String; = "more"

.field public static final RIGHTBTN_TYPE_SHARE:Ljava/lang/String; = "share"


# instance fields
.field private featureUrl:Ljava/lang/String;

.field private leftBtn:Ljava/lang/String;

.field private orderManagerUrl:Ljava/lang/String;

.field private rightBtn:Ljava/lang/String;

.field private shopcarUrl:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/huawei/operation/beans/TitleBean;->url:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/huawei/operation/beans/TitleBean;->leftBtn:Ljava/lang/String;

    .line 35
    iput-object p3, p0, Lcom/huawei/operation/beans/TitleBean;->rightBtn:Ljava/lang/String;

    .line 36
    iput-object p4, p0, Lcom/huawei/operation/beans/TitleBean;->shopcarUrl:Ljava/lang/String;

    .line 37
    iput-object p5, p0, Lcom/huawei/operation/beans/TitleBean;->featureUrl:Ljava/lang/String;

    .line 38
    iput-object p6, p0, Lcom/huawei/operation/beans/TitleBean;->orderManagerUrl:Ljava/lang/String;

    .line 39
    return-void
.end method


# virtual methods
.method public config_setFeatureUrl(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/operation/beans/TitleBean;->featureUrl:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public config_setLeftBtn(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/operation/beans/TitleBean;->leftBtn:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public config_setOrderManagerUrl(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/operation/beans/TitleBean;->orderManagerUrl:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public config_setRightBtn(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/operation/beans/TitleBean;->rightBtn:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public config_setShopcarUrl(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/operation/beans/TitleBean;->shopcarUrl:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public config_setUrl(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/operation/beans/TitleBean;->url:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public fetch_getFeatureUrl()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/operation/beans/TitleBean;->featureUrl:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getLeftBtn()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/operation/beans/TitleBean;->leftBtn:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getOrderManagerUrl()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/operation/beans/TitleBean;->orderManagerUrl:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getRightBtn()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/operation/beans/TitleBean;->rightBtn:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getShopcarUrl()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/operation/beans/TitleBean;->shopcarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public fetch_getUrl()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/operation/beans/TitleBean;->url:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TitleBean{url=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/beans/TitleBean;->url:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", leftBtn=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/beans/TitleBean;->leftBtn:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rightBtn=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/beans/TitleBean;->rightBtn:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shopcarUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/beans/TitleBean;->shopcarUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", featureUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/beans/TitleBean;->featureUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", orderManagerUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/operation/beans/TitleBean;->orderManagerUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
