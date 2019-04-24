.class public Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "IphoneTextStyle.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public color:Ljava/lang/String;

.field public fontName:Ljava/lang/String;

.field public fontSize:Ljava/lang/Double;

.field public offset:Lcom/shopkick/app/fetchers/api/skapi/Point;

.field public shadowColor:Ljava/lang/String;

.field public shadowOffset:Lcom/shopkick/app/fetchers/api/skapi/Point;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;
    .locals 2

    .line 38
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;

    if-eqz p1, :cond_0

    .line 39
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/IphoneTextStyle;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 0

    return-void
.end method
