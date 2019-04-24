.class public final Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$UrlDescription;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UrlDescription"
.end annotation


# instance fields
.field private title:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$UrlDescription;->title:Ljava/lang/String;

    return-object v0
.end method

.method public getToUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$UrlDescription;->url:Ljava/lang/String;

    return-object v0
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$UrlDescription;->title:Ljava/lang/String;

    return-void
.end method

.method public setToUrl(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/jsapi/JsCoreApi$UrlDescription;->url:Ljava/lang/String;

    return-void
.end method
