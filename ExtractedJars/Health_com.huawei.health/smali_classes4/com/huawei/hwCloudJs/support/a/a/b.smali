.class public Lcom/huawei/hwCloudJs/support/a/a/b;
.super Lcom/huawei/hwCloudJs/service/http/a/d;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/service/http/a/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/a/a/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/hwCloudJs/support/a/a/b;->a:Ljava/lang/String;

    return-void
.end method

.method public b(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/huawei/hwCloudJs/service/http/a/d;->b(I)V

    return-void
.end method

.method public c(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/huawei/hwCloudJs/service/http/a/d;->c(I)V

    return-void
.end method

.method public c()[Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/huawei/hwCloudJs/service/http/a/d;->c()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()I
    .locals 1

    invoke-super {p0}, Lcom/huawei/hwCloudJs/service/http/a/d;->e()I

    move-result v0

    return v0
.end method

.method public f()I
    .locals 1

    invoke-super {p0}, Lcom/huawei/hwCloudJs/service/http/a/d;->f()I

    move-result v0

    return v0
.end method
