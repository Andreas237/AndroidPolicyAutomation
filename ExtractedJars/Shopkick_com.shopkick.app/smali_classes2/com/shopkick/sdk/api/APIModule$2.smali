.class Lcom/shopkick/sdk/api/APIModule$2;
.super Ljava/lang/Object;
.source "APIModule.java"

# interfaces
.implements Lcom/shopkick/comm/GeoLocation$LocationProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/api/APIModule;
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

    .line 158
    iput-object p1, p0, Lcom/shopkick/sdk/api/APIModule$2;->this$0:Lcom/shopkick/sdk/api/APIModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentLocation()Landroid/location/Location;
    .locals 1

    .line 163
    :try_start_0
    invoke-static {}, Lcom/shopkick/sdk/presence/LocationManager;->getInstance()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/presence/LocationManager;->getCurrentLocation()Landroid/location/Location;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
