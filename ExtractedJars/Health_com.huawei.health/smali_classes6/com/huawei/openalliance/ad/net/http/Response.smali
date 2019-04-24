.class public Lcom/huawei/openalliance/ad/net/http/Response;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DATA:Ljava/lang/Object;>Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDATA;"
        }
    .end annotation
.end field

.field private c:J

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/openalliance/ad/net/http/Response;->a:I

    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/openalliance/ad/net/http/Response;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/huawei/openalliance/ad/net/http/Response;->a:I

    return v0
.end method

.method public a(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/openalliance/ad/net/http/Response;->a:I

    return-void
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/net/http/Response;->c:J

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDATA;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/Response;->b:Ljava/lang/Object;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/net/http/Response;->d:Ljava/lang/String;

    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TDATA;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/Response;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/net/http/Response;->c:J

    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/net/http/Response;->d:Ljava/lang/String;

    return-object v0
.end method
