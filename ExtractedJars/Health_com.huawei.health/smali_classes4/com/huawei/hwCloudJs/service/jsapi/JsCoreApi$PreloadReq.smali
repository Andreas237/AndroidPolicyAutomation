.class public final Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$PreloadReq;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "PreloadReq"
.end annotation


# instance fields
.field private flag:I

.field private urlList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFlag()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$PreloadReq;->flag:I

    return v0
.end method

.method public getUrlList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$PreloadReq;->urlList:Ljava/util/List;

    return-object v0
.end method

.method public setFlag(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$PreloadReq;->flag:I

    return-void
.end method

.method public setUrlList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$PreloadReq;->urlList:Ljava/util/List;

    return-void
.end method
