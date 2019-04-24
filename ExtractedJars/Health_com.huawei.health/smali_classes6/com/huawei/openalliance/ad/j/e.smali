.class public Lcom/huawei/openalliance/ad/j/e;
.super Lcom/huawei/openalliance/ad/i/a;

# interfaces
.implements Lcom/huawei/openalliance/ad/j/a/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/openalliance/ad/i/a<Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;>;Lcom/huawei/openalliance/ad/j/a/b<Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;>;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

.field private d:Lcom/huawei/openalliance/ad/k/b/d;

.field private e:Lcom/huawei/openalliance/ad/inter/data/NativeAd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/j/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/j/e;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/views/interfaces/IPPSNativeView;)V
    .locals 2

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/i/a;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/e;->b:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/huawei/openalliance/ad/j/e;->a(Lcom/huawei/openalliance/ad/i/b;)V

    new-instance v0, Lcom/huawei/openalliance/ad/k/c;

    new-instance v1, Lcom/huawei/openalliance/ad/m/a/e;

    invoke-direct {v1, p1}, Lcom/huawei/openalliance/ad/m/a/e;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, p1, v1}, Lcom/huawei/openalliance/ad/k/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/m/a/a/b;)V

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->d:Lcom/huawei/openalliance/ad/k/b/d;

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/n/a/a;)V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->d:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/n/a/a;->c()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, v1}, Lcom/huawei/openalliance/ad/k/b/d;->a(IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(JI)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->d:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/openalliance/ad/k/b/d;->a(JI)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)V
    .locals 2

    iput-object p1, p0, Lcom/huawei/openalliance/ad/j/e;->e:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/k/e;->a(Lcom/huawei/openalliance/ad/inter/data/NativeAd;)Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->d:Lcom/huawei/openalliance/ad/k/b/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/e;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method public a(Ljava/lang/Long;Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->d:Lcom/huawei/openalliance/ad/k/b/d;

    invoke-interface {v0, p1, p2}, Lcom/huawei/openalliance/ad/k/b/d;->a(Ljava/lang/Long;Ljava/lang/Integer;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-virtual {v0, p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->setShowId(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->d:Lcom/huawei/openalliance/ad/k/b/d;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/e;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-interface {v0, v1}, Lcom/huawei/openalliance/ad/k/b/d;->a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->d:Lcom/huawei/openalliance/ad/k/b/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p1}, Lcom/huawei/openalliance/ad/k/b/d;->a(IILjava/util/List;)V

    return-void
.end method

.method public b()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->e:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->e:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->setClicked(Z)V

    sget-object v0, Lcom/huawei/openalliance/ad/j/e;->a:Ljava/lang/String;

    const-string v1, "begin to deal click"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "appId"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/e;->e:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getMarketAppId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "thirdId"

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/e;->e:Lcom/huawei/openalliance/ad/inter/data/NativeAd;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/inter/data/NativeAd;->getAppPromotionChannel()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/j/e;->c:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/n/g;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map;)Lcom/huawei/openalliance/ad/n/a/a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/n/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v3}, Lcom/huawei/openalliance/ad/j/e;->a(Lcom/huawei/openalliance/ad/n/a/a;)V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/j/e;->d:Lcom/huawei/openalliance/ad/k/b/d;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/k/b/d;->a(II)V

    return-void
.end method
