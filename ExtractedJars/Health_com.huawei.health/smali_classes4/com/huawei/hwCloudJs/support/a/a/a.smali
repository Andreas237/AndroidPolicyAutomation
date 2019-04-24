.class public Lcom/huawei/hwCloudJs/support/a/a/a;
.super Lcom/huawei/hwCloudJs/service/http/a/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/hwCloudJs/service/http/a/c<Lcom/huawei/hwCloudJs/support/a/a/b;>;"
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/huawei/hwCloudJs/service/http/a/c;-><init>()V

    iput-object p1, p0, Lcom/huawei/hwCloudJs/support/a/a/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/hwCloudJs/support/a/a/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lcom/huawei/hwCloudJs/support/a/a/b;
    .locals 1

    new-instance v0, Lcom/huawei/hwCloudJs/support/a/a/b;

    invoke-direct {v0}, Lcom/huawei/hwCloudJs/support/a/a/b;-><init>()V

    return-object v0
.end method

.method public synthetic g()Lcom/huawei/hwCloudJs/service/http/a/d;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/hwCloudJs/support/a/a/a;->b()Lcom/huawei/hwCloudJs/support/a/a/b;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    const-string v0, "GET"

    return-object v0
.end method

.method public k()[Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/huawei/hwCloudJs/service/http/a/c;->k()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
