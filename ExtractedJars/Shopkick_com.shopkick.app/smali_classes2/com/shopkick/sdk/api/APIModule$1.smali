.class Lcom/shopkick/sdk/api/APIModule$1;
.super Ljava/lang/Object;
.source "APIModule.java"

# interfaces
.implements Lcom/shopkick/logging/ConfigurationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/api/APIModule;->provideSKLogger(Landroid/content/Context;Lcom/shopkick/app/fetchers/network/NetworkManager;Lcom/shopkick/app/application/AppInfo;Lcom/shopkick/app/application/LibPreferences;Lcom/shopkick/app/application/Account;)Lcom/shopkick/app/application/SKLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/api/APIModule;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/api/APIModule;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/shopkick/sdk/api/APIModule$1;->this$0:Lcom/shopkick/sdk/api/APIModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getLoggerConfig(Ljava/lang/String;)Lcom/shopkick/logging/LoggerConfig;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isSKLoggerDevloggingDisabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isSKLoggerOnlyDevloggingDisabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
