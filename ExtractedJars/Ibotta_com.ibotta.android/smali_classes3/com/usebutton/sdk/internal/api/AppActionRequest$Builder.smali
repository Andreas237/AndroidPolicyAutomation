.class public Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
.super Ljava/lang/Object;
.source "AppActionRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/AppActionRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final body:Lorg/json/JSONObject;

.field private capabilities:Lorg/json/JSONObject;

.field private context:Lorg/json/JSONObject;

.field private merchantId:Ljava/lang/String;

.field private placementId:Ljava/lang/String;

.field private pubRef:Ljava/lang/String;

.field private thirdPartyId:Ljava/lang/String;

.field private url:Ljava/net/URL;

.field private userLocalTime:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->body:Lorg/json/JSONObject;

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->body:Lorg/json/JSONObject;

    return-void
.end method


# virtual methods
.method public build()Lcom/usebutton/sdk/internal/api/AppActionRequest;
    .locals 12

    .line 102
    new-instance v11, Lcom/usebutton/sdk/internal/api/AppActionRequest;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->body:Lorg/json/JSONObject;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->capabilities:Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->context:Lorg/json/JSONObject;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->merchantId:Ljava/lang/String;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->placementId:Ljava/lang/String;

    iget-object v6, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->pubRef:Ljava/lang/String;

    iget-object v7, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->thirdPartyId:Ljava/lang/String;

    iget-object v8, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->url:Ljava/net/URL;

    iget-object v9, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->userLocalTime:Ljava/lang/String;

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lcom/usebutton/sdk/internal/api/AppActionRequest;-><init>(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/AppActionRequest$1;)V

    return-object v11
.end method

.method public capabilities(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->capabilities:Lorg/json/JSONObject;

    return-object p0
.end method

.method public context(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->context:Lorg/json/JSONObject;

    return-object p0
.end method

.method public merchantId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->merchantId:Ljava/lang/String;

    return-object p0
.end method

.method public placementId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->placementId:Ljava/lang/String;

    return-object p0
.end method

.method public pubRef(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->pubRef:Ljava/lang/String;

    return-object p0
.end method

.method public thirdPartyId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->thirdPartyId:Ljava/lang/String;

    return-object p0
.end method

.method public url(Ljava/net/URL;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->url:Ljava/net/URL;

    return-object p0
.end method

.method public userLocalTime(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->userLocalTime:Ljava/lang/String;

    return-object p0
.end method
