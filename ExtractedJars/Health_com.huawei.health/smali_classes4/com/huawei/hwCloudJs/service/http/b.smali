.class public Lcom/huawei/hwCloudJs/service/http/b;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/huawei/hwCloudJs/service/http/a/c;)Lcom/huawei/hwCloudJs/service/http/a/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Lcom/huawei/hwCloudJs/service/http/a/d;>(Lcom/huawei/hwCloudJs/service/http/a/c<TT;>;)TT;"
        }
    .end annotation

    new-instance v1, Lcom/huawei/hwCloudJs/service/http/a;

    invoke-direct {v1}, Lcom/huawei/hwCloudJs/service/http/a;-><init>()V

    invoke-virtual {v1, p0}, Lcom/huawei/hwCloudJs/service/http/a;->a(Lcom/huawei/hwCloudJs/service/http/a/c;)Lcom/huawei/hwCloudJs/service/http/a/d;

    move-result-object v0

    return-object v0
.end method
