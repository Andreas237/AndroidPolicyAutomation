.class Lretrofit/Platform$AppEngine$1;
.super Ljava/lang/Object;
.source "Platform.java"

# interfaces
.implements Lretrofit/client/Client$Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lretrofit/Platform$AppEngine;->defaultClient()Lretrofit/client/Client$Provider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lretrofit/Platform$AppEngine;

.field final synthetic val$client:Lretrofit/appengine/UrlFetchClient;


# direct methods
.method constructor <init>(Lretrofit/Platform$AppEngine;Lretrofit/appengine/UrlFetchClient;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lretrofit/Platform$AppEngine$1;->this$0:Lretrofit/Platform$AppEngine;

    iput-object p2, p0, Lretrofit/Platform$AppEngine$1;->val$client:Lretrofit/appengine/UrlFetchClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Lretrofit/client/Client;
    .locals 1

    .line 163
    iget-object v0, p0, Lretrofit/Platform$AppEngine$1;->val$client:Lretrofit/appengine/UrlFetchClient;

    return-object v0
.end method
