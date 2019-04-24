.class public Lcom/ibotta/android/routing/urlresolver/UrlResolution;
.super Ljava/lang/Object;
.source "UrlResolution.java"


# instance fields
.field private internalRoute:Z

.field private uri:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-boolean p1, p0, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->internalRoute:Z

    .line 14
    iput-object p2, p0, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->uri:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getUri()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->uri:Ljava/lang/String;

    return-object v0
.end method

.method public isInternalRoute()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/ibotta/android/routing/urlresolver/UrlResolution;->internalRoute:Z

    return v0
.end method
