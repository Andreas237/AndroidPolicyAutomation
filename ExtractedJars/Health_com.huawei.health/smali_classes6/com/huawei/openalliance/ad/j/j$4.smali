.class Lcom/huawei/openalliance/ad/j/j$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/utils/o$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/j;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/j/j;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/j;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/j$4;->a:Lcom/huawei/openalliance/ad/j/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "SloganPresenter"

    const-string v1, "fail to load slogan image"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/huawei/openalliance/ad/j/j$4$2;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/j/j$4$2;-><init>(Lcom/huawei/openalliance/ad/j/j$4;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Landroid/graphics/Bitmap;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/j/j$4$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/openalliance/ad/j/j$4$1;-><init>(Lcom/huawei/openalliance/ad/j/j$4;Landroid/graphics/Bitmap;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method
