.class Lcom/tencent/open/LocationApi$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/LocationApi;->a(Ljava/lang/String;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/tencent/open/LocationApi;


# direct methods
.method constructor <init>(Lcom/tencent/open/LocationApi;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/tencent/open/LocationApi$3;->c:Lcom/tencent/open/LocationApi;

    iput-object p2, p0, Lcom/tencent/open/LocationApi$3;->a:[Ljava/lang/String;

    iput-object p3, p0, Lcom/tencent/open/LocationApi$3;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 246
    iget-object v0, p0, Lcom/tencent/open/LocationApi$3;->a:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/open/LocationApi$3;->a:[Ljava/lang/String;

    array-length v0, v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    .line 248
    :cond_1
    const-string v0, "search_nearby"

    iget-object v1, p0, Lcom/tencent/open/LocationApi$3;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v3, "id_search_nearby"

    goto :goto_0

    :cond_2
    const-string v3, "id_delete_location"

    .line 249
    :goto_0
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/tencent/open/LocationApi$3;->c:Lcom/tencent/open/LocationApi;

    invoke-static {v1}, Lcom/tencent/open/LocationApi;->c(Lcom/tencent/open/LocationApi;)Lcom/tencent/connect/auth/QQToken;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/open/LocationApi$3;->a:[Ljava/lang/String;

    invoke-static {v0, v1, v3, v2}, Lcom/tencent/connect/a/a;->a(Landroid/content/Context;Lcom/tencent/connect/auth/QQToken;Ljava/lang/String;[Ljava/lang/String;)V

    .line 250
    return-void
.end method
