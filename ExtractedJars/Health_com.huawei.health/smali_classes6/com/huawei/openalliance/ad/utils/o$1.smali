.class final Lcom/huawei/openalliance/ad/utils/o$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/utils/o;->a(Landroid/content/Context;Ljava/lang/String;Lcom/huawei/openalliance/ad/utils/o$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/huawei/openalliance/ad/utils/o$a;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/openalliance/ad/utils/o$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/o$1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/utils/o$1;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/huawei/openalliance/ad/utils/o$1;->c:Lcom/huawei/openalliance/ad/utils/o$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v3, 0x0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/o$1;->a:Ljava/lang/String;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->RES:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/o$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/o$1;->b:Landroid/content/Context;

    invoke-static {v2, v0, v1}, Lcom/huawei/openalliance/ad/utils/o;->a(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/o$1;->a:Ljava/lang/String;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/Scheme;->ASSET:Lcom/huawei/openalliance/ad/constant/Scheme;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/constant/Scheme;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/o$1;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/o$1;->b:Landroid/content/Context;

    invoke-static {v2, v0, v1}, Lcom/huawei/openalliance/ad/utils/o;->b(Landroid/graphics/BitmapFactory$Options;Ljava/lang/String;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/o$1;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    :goto_0
    goto :goto_1

    :catch_0
    move-exception v4

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/o;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "OutOfMemoryError when read image"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x0

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/o$1;->c:Lcom/huawei/openalliance/ad/utils/o$a;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/utils/o$a;->a()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/o$1;->c:Lcom/huawei/openalliance/ad/utils/o$a;

    invoke-interface {v0, v3}, Lcom/huawei/openalliance/ad/utils/o$a;->a(Landroid/graphics/Bitmap;)V

    :goto_2
    return-void
.end method
