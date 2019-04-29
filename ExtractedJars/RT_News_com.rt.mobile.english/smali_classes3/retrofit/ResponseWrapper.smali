.class final Lretrofit/ResponseWrapper;
.super Ljava/lang/Object;
.source "ResponseWrapper.java"


# instance fields
.field final response:Lretrofit/client/Response;

.field final responseBody:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lretrofit/client/Response;Ljava/lang/Object;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lretrofit/ResponseWrapper;->response:Lretrofit/client/Response;

    .line 32
    iput-object p2, p0, Lretrofit/ResponseWrapper;->responseBody:Ljava/lang/Object;

    return-void
.end method
