.class public Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;
    }
.end annotation


# instance fields
.field private resultCode:Ljava/lang/String;

.field private thirdAuthToken:Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;

.field private thirdAuthTokenList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getResultCode()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->resultCode:Ljava/lang/String;

    return-object v0
.end method

.method public getThirdAuthToken()Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->thirdAuthToken:Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;

    return-object v0
.end method

.method public getThirdAuthTokenList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;>;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->thirdAuthTokenList:Ljava/util/List;

    return-object v0
.end method

.method public setResultCode(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->resultCode:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public setThirdAuthToken(Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->thirdAuthToken:Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;

    .line 28
    return-void
.end method

.method public setThirdAuthTokenList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO$ThirdAuthToken;>;)V"
        }
    .end annotation

    .line 31
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/ThirdAuthTokenO;->thirdAuthTokenList:Ljava/util/List;

    .line 32
    return-void
.end method
