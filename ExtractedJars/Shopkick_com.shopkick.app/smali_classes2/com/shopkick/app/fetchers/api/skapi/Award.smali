.class public Lcom/shopkick/app/fetchers/api/skapi/Award;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "Award.java"

# interfaces
.implements Lcom/shopkick/app/fetchers/api/PostProcessable;


# instance fields
.field public amount:Ljava/lang/Integer;

.field public background:Lcom/shopkick/app/fetchers/api/skapi/View;

.field public countText:Lcom/shopkick/app/fetchers/api/skapi/View;

.field public extraViews:Lcom/shopkick/app/fetchers/api/skapi/ViewGroup;

.field public frequencyCardDetails:Lcom/shopkick/app/fetchers/api/skapi/FrequencyCardDetails;

.field public grantorImageUrl:Ljava/lang/String;

.field public reasonText:Lcom/shopkick/app/fetchers/api/skapi/View;

.field public source:Lcom/shopkick/app/fetchers/api/skapi/AwardSource;

.field public type:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/Award;
    .locals 2

    .line 41
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/shopkick/app/fetchers/api/skapi/Award;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/skapi/Award;

    if-eqz p1, :cond_0

    .line 42
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/Award;->postProcess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p0

    :catch_0
    move-exception p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lcom/shopkick/app/fetchers/api/skapi/Award;->cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/Award;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/app/fetchers/api/skapi/Award;
    .locals 1

    .line 36
    invoke-virtual {p0}, Lcom/shopkick/app/fetchers/api/skapi/Award;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/Award;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/fetchers/api/skapi/Award;

    move-result-object p1

    return-object p1
.end method

.method public postProcess()V
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Award;->source:Lcom/shopkick/app/fetchers/api/skapi/AwardSource;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/AwardSource;->postProcess()V

    .line 53
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/fetchers/api/skapi/Award;->frequencyCardDetails:Lcom/shopkick/app/fetchers/api/skapi/FrequencyCardDetails;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/shopkick/app/fetchers/api/skapi/FrequencyCardDetails;->postProcess()V

    :cond_1
    return-void
.end method
