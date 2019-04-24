.class public abstract Lretrofit/ResponseCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lretrofit/Callback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lretrofit/Callback<Lretrofit/client/Response;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic success(Ljava/lang/Object;Lretrofit/client/Response;)V
    .locals 1

    .line 24
    move-object v0, p1

    check-cast v0, Lretrofit/client/Response;

    invoke-virtual {p0, v0, p2}, Lretrofit/ResponseCallback;->success(Lretrofit/client/Response;Lretrofit/client/Response;)V

    return-void
.end method

.method public abstract success(Lretrofit/client/Response;)V
.end method

.method public success(Lretrofit/client/Response;Lretrofit/client/Response;)V
    .locals 0

    .line 27
    invoke-virtual {p0, p1}, Lretrofit/ResponseCallback;->success(Lretrofit/client/Response;)V

    .line 28
    return-void
.end method
