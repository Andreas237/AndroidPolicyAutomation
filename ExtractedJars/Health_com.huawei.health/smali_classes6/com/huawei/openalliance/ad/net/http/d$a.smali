.class public Lcom/huawei/openalliance/ad/net/http/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/net/http/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:Lcom/huawei/openalliance/ad/net/http/e;

.field b:I

.field c:I

.field d:Lcom/huawei/openalliance/ad/net/http/g;

.field e:Lcom/huawei/openalliance/ad/net/http/b/a;

.field f:Lcom/huawei/openalliance/ad/net/http/b/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2710

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/d$a;->b:I

    const/16 v0, 0x2710

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/d$a;->c:I

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/net/http/b/a;)Lcom/huawei/openalliance/ad/net/http/d$a;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/d$a;->e:Lcom/huawei/openalliance/ad/net/http/b/a;

    return-object p0
.end method

.method public a()Lcom/huawei/openalliance/ad/net/http/d;
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/net/http/d;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/net/http/d;-><init>(Lcom/huawei/openalliance/ad/net/http/d$a;)V

    return-object v0
.end method

.method public b(Lcom/huawei/openalliance/ad/net/http/b/a;)Lcom/huawei/openalliance/ad/net/http/d$a;
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/d$a;->f:Lcom/huawei/openalliance/ad/net/http/b/a;

    return-object p0
.end method
