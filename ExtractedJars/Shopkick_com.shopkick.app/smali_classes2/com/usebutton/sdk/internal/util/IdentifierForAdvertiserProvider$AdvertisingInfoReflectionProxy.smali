.class Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;
.super Ljava/lang/Object;
.source "IdentifierForAdvertiserProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AdvertisingInfoReflectionProxy"
.end annotation


# instance fields
.field private mAdvertisingClient:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private mGetAdvertisingIdInfoMethod:Ljava/lang/reflect/Method;

.field private mNeuted:Z

.field final synthetic this$0:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;)V
    .locals 5

    .line 69
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->this$0:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 65
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mNeuted:Z

    const/4 v0, 0x1

    :try_start_0
    const-string v1, "com.google.android.gms.ads.identifier.AdvertisingIdClient"

    .line 71
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mAdvertisingClient:Ljava/lang/Class;

    .line 72
    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mAdvertisingClient:Ljava/lang/Class;

    const-string v2, "getAdvertisingIdInfo"

    new-array v3, v0, [Ljava/lang/Class;

    const-class v4, Landroid/content/Context;

    aput-object v4, v3, p1

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mGetAdvertisingIdInfoMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "IFAProvider"

    const-string v2, "Could not resolve IFA."

    .line 74
    invoke-static {v1, v2, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mNeuted:Z

    :goto_0
    return-void
.end method

.method private getAdInfo(Landroid/content/Context;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mGetAdvertisingIdInfoMethod:Ljava/lang/reflect/Method;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mAdvertisingClient:Ljava/lang/Class;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method getTrackingIdentifier(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 92
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mNeuted:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 95
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->getAdInfo(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "getId"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "IFAProvider"

    const-string v2, "Could not get ID from ad info object."

    .line 98
    invoke-static {v0, v2, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method isAdTrackingLimited(Landroid/content/Context;)Z
    .locals 4

    .line 80
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->mNeuted:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 83
    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider$AdvertisingInfoReflectionProxy;->getAdInfo(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "isLimitAdTrackingEnabled"

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    const-string v0, "IFAProvider"

    const-string v2, "Couldn\'t check if tracking was limited."

    .line 86
    invoke-static {v0, v2, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method
