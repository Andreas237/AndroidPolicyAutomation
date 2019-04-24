.class public final Lcom/usebutton/sdk/internal/core/Response;
.super Ljava/lang/Object;
.source "Response.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final HEADER_REQUEST_ID:Ljava/lang/String; = "X-Button-Request"


# instance fields
.field private final httpResponse:Lcom/usebutton/sdk/internal/api/HttpResponse;

.field private final object:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Ljava/lang/Object;Lcom/usebutton/sdk/internal/api/HttpResponse;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/usebutton/sdk/internal/api/HttpResponse;",
            ")V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/usebutton/sdk/internal/core/Response;->object:Ljava/lang/Object;

    .line 24
    iput-object p2, p0, Lcom/usebutton/sdk/internal/core/Response;->httpResponse:Lcom/usebutton/sdk/internal/api/HttpResponse;

    return-void
.end method

.method public static success(Ljava/lang/Object;Lcom/usebutton/sdk/internal/api/HttpResponse;)Lcom/usebutton/sdk/internal/core/Response;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/usebutton/sdk/internal/api/HttpResponse;",
            ")",
            "Lcom/usebutton/sdk/internal/core/Response<",
            "TT;>;"
        }
    .end annotation

    .line 19
    new-instance v0, Lcom/usebutton/sdk/internal/core/Response;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/core/Response;-><init>(Ljava/lang/Object;Lcom/usebutton/sdk/internal/api/HttpResponse;)V

    return-object v0
.end method


# virtual methods
.method public httpResponse()Lcom/usebutton/sdk/internal/api/HttpResponse;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Response;->httpResponse:Lcom/usebutton/sdk/internal/api/HttpResponse;

    return-object v0
.end method

.method public object()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Response;->object:Ljava/lang/Object;

    return-object v0
.end method

.method public requestId()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/usebutton/sdk/internal/core/Response;->httpResponse:Lcom/usebutton/sdk/internal/api/HttpResponse;

    const-string v1, "X-Button-Request"

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
