.class public Lcom/microblink/internal/services/walmart/WalmartServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/walmart/WalmartService;


# static fields
.field private static final TAG:Ljava/lang/String; = "WalmartServiceImpl"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public downloadFromBlink(Landroid/net/Uri;Lcom/microblink/OnNullableCompleteListener;)V
    .locals 2
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-class v0, Lcom/microblink/internal/services/walmart/WalmartRemoteService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/walmart/WalmartRemoteService;

    const-string v1, "https://licensing.blinkreceipt.com/api/walmart/walmart_qr"

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/microblink/internal/services/walmart/WalmartRemoteService;->image(Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/microblink/internal/services/walmart/WalmartServiceImpl$1;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/walmart/WalmartServiceImpl$1;-><init>(Lcom/microblink/internal/services/walmart/WalmartServiceImpl;Lcom/microblink/OnNullableCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "WalmartServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public downloadFromWalmart(Ljava/lang/String;Lcom/microblink/OnNullableCompleteListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-class v0, Lcom/microblink/internal/services/walmart/WalmartRemoteService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/walmart/WalmartRemoteService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/walmart/WalmartRemoteService;->walmart(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object p1

    new-instance v0, Lcom/microblink/internal/services/walmart/WalmartServiceImpl$2;

    invoke-direct {v0, p0, p2}, Lcom/microblink/internal/services/walmart/WalmartServiceImpl$2;-><init>(Lcom/microblink/internal/services/walmart/WalmartServiceImpl;Lcom/microblink/OnNullableCompleteListener;)V

    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "WalmartServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
