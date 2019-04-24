.class public Lcom/shopkick/app/application/AppInfo;
.super Ljava/lang/Object;
.source "AppInfo.java"


# instance fields
.field private final apiKey:Ljava/lang/String;

.field private final appId:Ljava/lang/String;

.field private final appInfo:[B

.field appLaunchedTimestamp:J

.field private final appName:Ljava/lang/String;

.field appString:Ljava/lang/String;

.field private final appVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/shopkick/app/application/AppInfo;->appInfo:[B

    .line 18
    iput-object p2, p0, Lcom/shopkick/app/application/AppInfo;->appName:Ljava/lang/String;

    .line 19
    iput-object p3, p0, Lcom/shopkick/app/application/AppInfo;->appVersion:Ljava/lang/String;

    .line 20
    iput-object p4, p0, Lcom/shopkick/app/application/AppInfo;->apiKey:Ljava/lang/String;

    .line 21
    iput-object p5, p0, Lcom/shopkick/app/application/AppInfo;->appId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getApiKey()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/application/AppInfo;->apiKey:Ljava/lang/String;

    return-object v0
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/shopkick/app/application/AppInfo;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppLaunchedTimestamp()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/shopkick/app/application/AppInfo;->appLaunchedTimestamp:J

    return-wide v0
.end method

.method public getAppString()Ljava/lang/String;
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/application/AppInfo;->appString:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/AppInfo;->appName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/application/AppInfo;->appVersion:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/application/AppInfo;->appName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/application/AppInfo;->appVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/app/application/AppInfo;->appString:Ljava/lang/String;

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/application/AppInfo;->appString:Ljava/lang/String;

    return-object v0
.end method

.method public getInfo()[B
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/application/AppInfo;->appInfo:[B

    return-object v0
.end method

.method public setAppLaunchedTimestamp(J)V
    .locals 0

    .line 25
    iput-wide p1, p0, Lcom/shopkick/app/application/AppInfo;->appLaunchedTimestamp:J

    return-void
.end method
