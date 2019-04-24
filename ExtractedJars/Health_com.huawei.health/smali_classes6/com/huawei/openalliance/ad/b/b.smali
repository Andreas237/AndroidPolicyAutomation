.class public abstract Lcom/huawei/openalliance/ad/b/b;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/huawei/openalliance/ad/b/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/b/b;->a:Lcom/huawei/openalliance/ad/b/b;

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/b/b;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/b/b;->a:Lcom/huawei/openalliance/ad/b/b;

    return-void
.end method

.method public abstract a()Z
.end method

.method protected b()Z
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/b/b;->a:Lcom/huawei/openalliance/ad/b/b;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/b/b;->a:Lcom/huawei/openalliance/ad/b/b;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/b/b;->a()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
