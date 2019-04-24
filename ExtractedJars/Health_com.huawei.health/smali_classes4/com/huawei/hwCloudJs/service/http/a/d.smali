.class public abstract Lcom/huawei/hwCloudJs/service/http/a/d;
.super Ljava/lang/Object;


# instance fields
.field private a:I

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwCloudJs/service/http/a/d;->b:I

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/http/a/d;->b:I

    return-void
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, Lcom/huawei/hwCloudJs/service/http/a/d;->a:I

    return-void
.end method

.method public c()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/http/a/d;->b:I

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/huawei/hwCloudJs/service/http/a/d;->a:I

    return v0
.end method
