.class Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;
.super Ljava/lang/Object;
.source "ScribeFilesSender.java"

# interfaces
.implements Lretrofit/RequestInterceptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ConfigRequestInterceptor"
.end annotation


# instance fields
.field private final idManager:Lio/fabric/sdk/android/services/common/IdManager;

.field private final scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;


# direct methods
.method constructor <init>(Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;Lio/fabric/sdk/android/services/common/IdManager;)V
    .locals 0

    .line 248
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 249
    iput-object p1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    .line 250
    iput-object p2, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    return-void
.end method


# virtual methods
.method public intercept(Lretrofit/RequestInterceptor$RequestFacade;)V
    .locals 2

    .line 255
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-object v0, v0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->userAgent:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "User-Agent"

    .line 256
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;->scribeConfig:Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;

    iget-object v1, v1, Lcom/twitter/sdk/android/core/internal/scribe/ScribeConfig;->userAgent:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lretrofit/RequestInterceptor$RequestFacade;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    :cond_0
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    invoke-virtual {v0}, Lio/fabric/sdk/android/services/common/IdManager;->getDeviceUUID()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "X-Client-UUID"

    .line 270
    iget-object v1, p0, Lcom/twitter/sdk/android/core/internal/scribe/ScribeFilesSender$ConfigRequestInterceptor;->idManager:Lio/fabric/sdk/android/services/common/IdManager;

    invoke-virtual {v1}, Lio/fabric/sdk/android/services/common/IdManager;->getDeviceUUID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lretrofit/RequestInterceptor$RequestFacade;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-string v0, "X-Twitter-Polling"

    const-string v1, "true"

    .line 279
    invoke-interface {p1, v0, v1}, Lretrofit/RequestInterceptor$RequestFacade;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
