.class public Lcom/huawei/openalliance/ad/b/c;
.super Lcom/huawei/openalliance/ad/b/b;


# instance fields
.field private a:Lcom/huawei/openalliance/ad/e/a/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lcom/huawei/openalliance/ad/b/b;-><init>()V

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/f;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/a/e;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/b/c;->a:Lcom/huawei/openalliance/ad/e/a/e;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/b/c;->a:Lcom/huawei/openalliance/ad/e/a/e;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/e/a/e;->t()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/b/c;->b()Z

    move-result v0

    return v0
.end method
