.class public Lcom/shopkick/app/fetchers/api/skapi/BallDetails;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "BallDetails.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public ballViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

.field public extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

.field public imageStack:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;",
            ">;"
        }
    .end annotation
.end field

.field public kickgoodAppliedAccessory:Lcom/shopkick/app/fetchers/api/skapi/KickgoodAppliedAccessory;

.field public poppable:Ljava/lang/Boolean;

.field public subtitleImageUrl:Ljava/lang/String;

.field public titleImageUrl:Ljava/lang/String;

.field public viewGroup:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/BallDetails;
    .locals 2

    .line 40
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;

    if-eqz p1, :cond_0

    .line 41
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 44
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/BallDetails;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/BallDetails;
    .locals 1

    .line 35
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/BallDetails;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->kickgoodAppliedAccessory:Lcom/shopkick/app/fetchers/api/skapi/KickgoodAppliedAccessory;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/KickgoodAppliedAccessory;->postProcess()V

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->poppable:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->poppable:Ljava/lang/Boolean;

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/BallDetails;->imageStack:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/api/skapi/ImageViewInfo;->postProcess()V

    goto :goto_0

    :cond_2
    return-void
.end method
