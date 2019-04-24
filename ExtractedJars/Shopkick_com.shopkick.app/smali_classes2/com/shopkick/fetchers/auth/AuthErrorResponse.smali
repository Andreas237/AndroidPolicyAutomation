.class public Lcom/shopkick/fetchers/auth/AuthErrorResponse;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "AuthErrorResponse.java"


# instance fields
.field public errorDetails:Lcom/shopkick/fetchers/auth/AuthErrorDetails;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/fetchers/auth/AuthErrorResponse;
    .locals 1

    .line 23
    sget-object p1, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v0, Lcom/shopkick/fetchers/auth/AuthErrorResponse;

    invoke-virtual {p1, p0, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/fetchers/auth/AuthErrorResponse;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Lcom/shopkick/fetchers/auth/AuthErrorResponse;->cloneObject(Z)Lcom/shopkick/fetchers/auth/AuthErrorResponse;

    move-result-object p1

    return-object p1
.end method

.method public cloneObject(Z)Lcom/shopkick/fetchers/auth/AuthErrorResponse;
    .locals 1

    .line 19
    invoke-virtual {p0}, Lcom/shopkick/fetchers/auth/AuthErrorResponse;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/fetchers/auth/AuthErrorResponse;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/fetchers/auth/AuthErrorResponse;

    move-result-object p1

    return-object p1
.end method
