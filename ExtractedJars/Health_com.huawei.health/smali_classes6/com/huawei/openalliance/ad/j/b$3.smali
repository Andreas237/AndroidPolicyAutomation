.class Lcom/huawei/openalliance/ad/j/b$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/utils/o$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/b;->b(Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/b;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/b;Lcom/huawei/openalliance/ad/inter/data/ImageInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/b$3;->b:Lcom/huawei/openalliance/ad/j/b;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/b$3;->a:Lcom/huawei/openalliance/ad/inter/data/ImageInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/j/b$3$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/b$3$1;-><init>(Lcom/huawei/openalliance/ad/j/b$3;Landroid/graphics/Bitmap;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method
