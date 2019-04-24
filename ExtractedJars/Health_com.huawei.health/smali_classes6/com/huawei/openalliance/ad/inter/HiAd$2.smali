.class Lcom/huawei/openalliance/ad/inter/HiAd$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/inter/HiAd;->enableUserInfo(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/inter/HiAd;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/inter/HiAd;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/inter/HiAd$2;->a:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$2;->a:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->c(Lcom/huawei/openalliance/ad/inter/HiAd;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/b;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/e/b;->a()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$2;->a:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->c(Lcom/huawei/openalliance/ad/inter/HiAd;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/c;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/e/c;->a()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$2;->a:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->c(Lcom/huawei/openalliance/ad/inter/HiAd;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/e;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/e/e;->a()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$2;->a:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->c(Lcom/huawei/openalliance/ad/inter/HiAd;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/h;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/e/h;->a()V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/HiAd$2;->a:Lcom/huawei/openalliance/ad/inter/HiAd;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/inter/HiAd;->d(Lcom/huawei/openalliance/ad/inter/HiAd;)V

    return-void
.end method
