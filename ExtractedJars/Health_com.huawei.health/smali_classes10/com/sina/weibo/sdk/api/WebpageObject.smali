.class public Lcom/sina/weibo/sdk/api/WebpageObject;
.super Lcom/sina/weibo/sdk/api/BaseMediaObject;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/sina/weibo/sdk/api/WebpageObject;>;"
        }
    .end annotation
.end field

.field public static final EXTRA_KEY_DEFAULTTEXT:Ljava/lang/String; = "extra_key_defaulttext"


# instance fields
.field public defaultText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    new-instance v0, Lcom/sina/weibo/sdk/api/WebpageObject$1;

    invoke-direct {v0}, Lcom/sina/weibo/sdk/api/WebpageObject$1;-><init>()V

    sput-object v0, Lcom/sina/weibo/sdk/api/WebpageObject;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/sina/weibo/sdk/api/BaseMediaObject;-><init>()V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/sina/weibo/sdk/api/BaseMediaObject;-><init>(Landroid/os/Parcel;)V

    .line 54
    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 1

    .line 63
    invoke-super {p0}, Lcom/sina/weibo/sdk/api/BaseMediaObject;->checkArgs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 64
    const/4 v0, 0x0

    return v0

    .line 66
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public getObjType()I
    .locals 1

    .line 71
    const/4 v0, 0x5

    return v0
.end method

.method protected toExtraMediaObject(Ljava/lang/String;)Lcom/sina/weibo/sdk/api/BaseMediaObject;
    .locals 2

    .line 76
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 78
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 79
    const-string v0, "extra_key_defaulttext"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/sina/weibo/sdk/api/WebpageObject;->defaultText:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    goto :goto_0

    .line 80
    :catch_0
    move-exception v1

    .line 83
    :cond_0
    :goto_0
    return-object p0
.end method

.method protected toExtraMediaString()Ljava/lang/String;
    .locals 3

    .line 89
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 90
    iget-object v0, p0, Lcom/sina/weibo/sdk/api/WebpageObject;->defaultText:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 91
    const-string v0, "extra_key_defaulttext"

    iget-object v1, p0, Lcom/sina/weibo/sdk/api/WebpageObject;->defaultText:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    :cond_0
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 94
    :catch_0
    move-exception v2

    .line 96
    const-string v0, ""

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 58
    invoke-super {p0, p1, p2}, Lcom/sina/weibo/sdk/api/BaseMediaObject;->writeToParcel(Landroid/os/Parcel;I)V

    .line 59
    return-void
.end method
