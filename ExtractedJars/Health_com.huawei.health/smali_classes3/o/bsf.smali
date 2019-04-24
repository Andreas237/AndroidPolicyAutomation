.class public abstract Lo/bsf;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onFailure(Lokhttp3/Request;Ljava/lang/Exception;)V
.end method

.method public onProgress(JJZ)V
    .locals 0

    .line 16
    return-void
.end method

.method public abstract onSuccess(Lorg/json/JSONObject;)V
.end method
