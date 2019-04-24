.class final Lio/radar/sdk/api/ApiClientRepository$loadAdId$1;
.super Ljava/lang/Object;
.source "ApiClientRepository.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/api/ApiClientRepository;->loadAdId$sdk_release()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nApiClientRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiClientRepository.kt\nio/radar/sdk/api/ApiClientRepository$loadAdId$1\n+ 2 SharedPreferences.kt\nio/radar/sdk/internal/extensions/SharedPreferencesKt\n*L\n1#1,86:1\n11#2,4:87\n*E\n*S KotlinDebug\n*F\n+ 1 ApiClientRepository.kt\nio/radar/sdk/api/ApiClientRepository$loadAdId$1\n*L\n65#1,4:87\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/radar/sdk/api/ApiClientRepository;


# direct methods
.method constructor <init>(Lio/radar/sdk/api/ApiClientRepository;)V
    .locals 0

    iput-object p1, p0, Lio/radar/sdk/api/ApiClientRepository$loadAdId$1;->this$0:Lio/radar/sdk/api/ApiClientRepository;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 59
    :try_start_0
    iget-object v0, p0, Lio/radar/sdk/api/ApiClientRepository$loadAdId$1;->this$0:Lio/radar/sdk/api/ApiClientRepository;

    invoke-static {v0}, Lio/radar/sdk/api/ApiClientRepository;->access$getContext$p(Lio/radar/sdk/api/ApiClientRepository;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    const-string v1, "info"

    .line 60
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "OptedOut"

    goto :goto_0

    .line 63
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v0

    .line 65
    :goto_0
    iget-object v1, p0, Lio/radar/sdk/api/ApiClientRepository$loadAdId$1;->this$0:Lio/radar/sdk/api/ApiClientRepository;

    invoke-static {v1}, Lio/radar/sdk/api/ApiClientRepository;->access$getSharedPreferences$p(Lio/radar/sdk/api/ApiClientRepository;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 87
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "editor"

    .line 88
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iget-object v2, p0, Lio/radar/sdk/api/ApiClientRepository$loadAdId$1;->this$0:Lio/radar/sdk/api/ApiClientRepository;

    invoke-virtual {v2}, Lio/radar/sdk/api/ApiClientRepository;->getKEY_AD_ID$sdk_release()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 89
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 69
    sget-object v1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    const-string v2, "Error getting advertising ID"

    check-cast v0, Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v0}, Lio/radar/sdk/internal/RadarLogger;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method
