.class public Lcom/shopkick/sdk/webviewsdk/WebviewParam;
.super Ljava/lang/Object;
.source "WebviewParam.java"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/shopkick/sdk/webviewsdk/WebviewParam;",
            ">;"
        }
    .end annotation
.end field

.field private static final startUrlKey:Ljava/lang/String; = "START_URL_KEY"

.field private static final subTitleKey:Ljava/lang/String; = "SUB_TITLE_KEY"

.field private static final titleKey:Ljava/lang/String; = "TITLE_KEY"


# instance fields
.field private params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private startUrl:Ljava/lang/String;

.field private subTitle:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 75
    new-instance v0, Lcom/shopkick/sdk/webviewsdk/WebviewParam$1;

    invoke-direct {v0}, Lcom/shopkick/sdk/webviewsdk/WebviewParam$1;-><init>()V

    sput-object v0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "START_URL_KEY"

    .line 51
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->startUrl:Ljava/lang/String;

    const-string v0, "TITLE_KEY"

    .line 52
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->title:Ljava/lang/String;

    const-string v0, "SUB_TITLE_KEY"

    .line 53
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->subTitle:Ljava/lang/String;

    .line 54
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 55
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 56
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p0, v0}, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/shopkick/sdk/webviewsdk/WebviewParam$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/shopkick/sdk/webviewsdk/WebviewParam;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->startUrl:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->title:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->subTitle:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->params:Ljava/util/Map;

    return-object v0
.end method

.method public getStartUrl()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->startUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getSubTitle()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->subTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->params:Ljava/util/Map;

    if-eqz p1, :cond_0

    .line 28
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->params:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .line 63
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v0, "START_URL_KEY"

    .line 64
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->startUrl:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "TITLE_KEY"

    .line 65
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->title:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "SUB_TITLE_KEY"

    .line 66
    iget-object v1, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->subTitle:Ljava/lang/String;

    invoke-virtual {p2, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->params:Ljava/util/Map;

    if-eqz v0, :cond_0

    .line 68
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 69
    iget-object v2, p0, Lcom/shopkick/sdk/webviewsdk/WebviewParam;->params:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    return-void
.end method
