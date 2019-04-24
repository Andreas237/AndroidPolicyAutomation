.class public Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation


# instance fields
.field private browserType:Ljava/lang/String;

.field private clientVersion:Ljava/lang/String;

.field private clientVersionCode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBrowserType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->browserType:Ljava/lang/String;

    return-object v0
.end method

.method public getClientVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->clientVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getClientVersionCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->clientVersionCode:Ljava/lang/String;

    return-object v0
.end method

.method public setBrowserType(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->browserType:Ljava/lang/String;

    return-void
.end method

.method public setClientVersion(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->clientVersion:Ljava/lang/String;

    return-void
.end method

.method public setClientVersionCode(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/bean/BrowserInfo;->clientVersionCode:Ljava/lang/String;

    return-void
.end method
