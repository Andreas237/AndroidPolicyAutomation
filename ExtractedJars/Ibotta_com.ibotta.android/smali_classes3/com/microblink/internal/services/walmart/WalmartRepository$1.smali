.class Lcom/microblink/internal/services/walmart/WalmartRepository$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OnNullableCompleteListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/OnNullableCompleteListener<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/microblink/internal/services/walmart/WalmartRepository;

.field final synthetic val$listener:Lcom/microblink/OnNullableCompleteListener;

.field final synthetic val$uri:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lcom/microblink/internal/services/walmart/WalmartRepository;Lcom/microblink/OnNullableCompleteListener;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->this$0:Lcom/microblink/internal/services/walmart/WalmartRepository;

    iput-object p2, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->val$listener:Lcom/microblink/OnNullableCompleteListener;

    iput-object p3, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->val$uri:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onComplete(Landroid/graphics/Bitmap;)V
    .locals 4
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->val$listener:Lcom/microblink/OnNullableCompleteListener;

    invoke-interface {v0, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "WalmartRepository"

    const-string v0, "Unable to download bitmap from internal sources! Parsing walmart site!"

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v2}, Lcom/microblink/internal/Logger;->w(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->this$0:Lcom/microblink/internal/services/walmart/WalmartRepository;

    iget-object v0, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->val$uri:Landroid/net/Uri;

    invoke-static {p1, v0}, Lcom/microblink/internal/services/walmart/WalmartRepository;->access$000(Lcom/microblink/internal/services/walmart/WalmartRepository;Landroid/net/Uri;)[Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    array-length v2, p1

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    const-string v2, "-"

    invoke-static {v2, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v2, "WalmartRepository"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, p1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-static {v0}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "WalmartRepository"

    const-string v0, "Unable to generate token from join."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->this$0:Lcom/microblink/internal/services/walmart/WalmartRepository;

    invoke-static {p1}, Lcom/microblink/internal/services/walmart/WalmartRepository;->access$100(Lcom/microblink/internal/services/walmart/WalmartRepository;)Lcom/microblink/internal/services/walmart/WalmartService;

    move-result-object p1

    new-instance v1, Lcom/microblink/internal/services/walmart/WalmartRepository$1$1;

    invoke-direct {v1, p0}, Lcom/microblink/internal/services/walmart/WalmartRepository$1$1;-><init>(Lcom/microblink/internal/services/walmart/WalmartRepository$1;)V

    invoke-interface {p1, v0, v1}, Lcom/microblink/internal/services/walmart/WalmartService;->downloadFromWalmart(Ljava/lang/String;Lcom/microblink/OnNullableCompleteListener;)V

    return-void

    :cond_3
    :goto_1
    const-string p1, "WalmartRepository"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to generate token for walmart uri: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->val$uri:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v1}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->val$listener:Lcom/microblink/OnNullableCompleteListener;

    invoke-interface {p1, v0}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onComplete(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/services/walmart/WalmartRepository$1;->onComplete(Landroid/graphics/Bitmap;)V

    return-void
.end method
