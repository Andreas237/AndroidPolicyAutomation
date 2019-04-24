.class public Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "ShopBeaconSDKAPI.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/sdk/api/ShopBeaconSDKAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CampaignsResponse"
.end annotation


# instance fields
.field public campaigns:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 610
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;
    .locals 2

    .line 618
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;

    if-eqz p1, :cond_0

    .line 619
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;->postProcess()V

    :cond_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 610
    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;->cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;
    .locals 1

    .line 614
    invoke-virtual {p0}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 626
    iget-object v0, p0, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$CampaignsResponse;->campaigns:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;

    invoke-virtual {v1}, Lcom/shopkick/sdk/api/ShopBeaconSDKAPI$Campaign;->postProcess()V

    goto :goto_0

    :cond_0
    return-void
.end method
