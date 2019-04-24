.class Lretrofit/Platform$AppEngine;
.super Lretrofit/Platform$Base;
.source "Platform.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit/Platform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AppEngine"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 158
    invoke-direct {p0, v0}, Lretrofit/Platform$Base;-><init>(Lretrofit/Platform$1;)V

    return-void
.end method

.method synthetic constructor <init>(Lretrofit/Platform$1;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Lretrofit/Platform$AppEngine;-><init>()V

    return-void
.end method


# virtual methods
.method defaultClient()Lretrofit/client/Client$Provider;
    .locals 2

    .line 160
    new-instance v0, Lretrofit/appengine/UrlFetchClient;

    invoke-direct {v0}, Lretrofit/appengine/UrlFetchClient;-><init>()V

    .line 161
    new-instance v1, Lretrofit/Platform$AppEngine$1;

    invoke-direct {v1, p0, v0}, Lretrofit/Platform$AppEngine$1;-><init>(Lretrofit/Platform$AppEngine;Lretrofit/appengine/UrlFetchClient;)V

    return-object v1
.end method
