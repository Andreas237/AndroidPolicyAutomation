.class public abstract Lcom/huawei/openalliance/ad/m/a/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/huawei/openalliance/ad/m/a/a/b;


# instance fields
.field protected a:Landroid/content/Context;

.field private b:Lcom/huawei/openalliance/ad/e/a/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/m/a/b;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/huawei/openalliance/ad/e/c;->a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/e/c;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/m/a/b;->b:Lcom/huawei/openalliance/ad/e/a/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(J)V
    .locals 4

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/m;->f()J

    move-result-wide v0

    sub-long v2, v0, p1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/m/a/b;->b:Lcom/huawei/openalliance/ad/e/a/b;

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/m/a/b;->c()I

    move-result v1

    invoke-interface {v0, v2, v3, v1}, Lcom/huawei/openalliance/ad/e/a/b;->a(JI)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
