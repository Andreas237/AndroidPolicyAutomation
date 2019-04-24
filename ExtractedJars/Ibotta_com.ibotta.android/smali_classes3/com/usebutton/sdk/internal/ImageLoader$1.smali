.class Lcom/usebutton/sdk/internal/ImageLoader$1;
.super Ljava/lang/ThreadLocal;
.source "ImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/ImageLoader;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/functional/Getter;Lcom/usebutton/sdk/internal/api/Http;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Lcom/usebutton/sdk/internal/api/Http;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/ImageLoader;

.field final synthetic val$http:Lcom/usebutton/sdk/internal/api/Http;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/api/Http;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/usebutton/sdk/internal/ImageLoader$1;->this$0:Lcom/usebutton/sdk/internal/ImageLoader;

    iput-object p2, p0, Lcom/usebutton/sdk/internal/ImageLoader$1;->val$http:Lcom/usebutton/sdk/internal/api/Http;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected initialValue()Lcom/usebutton/sdk/internal/api/Http;
    .locals 2

    .line 45
    new-instance v0, Lcom/usebutton/sdk/internal/api/Http;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/ImageLoader$1;->val$http:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/api/Http;->getUserAgent()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/Http;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    .line 42
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ImageLoader$1;->initialValue()Lcom/usebutton/sdk/internal/api/Http;

    move-result-object v0

    return-object v0
.end method
