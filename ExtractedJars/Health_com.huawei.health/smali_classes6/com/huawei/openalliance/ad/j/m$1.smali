.class Lcom/huawei/openalliance/ad/j/m$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/j/m;->a(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/huawei/openalliance/ad/j/m;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/j/m;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/m$1;->b:Lcom/huawei/openalliance/ad/j/m;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/j/m$1;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/m$1;->a:Ljava/lang/Object;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/m$1;->b:Lcom/huawei/openalliance/ad/j/m;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/j/m;->a(Lcom/huawei/openalliance/ad/j/m;)Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;->getWebConfig()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/x;->a(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
