.class final Lcom/huawei/hwCloudJs/support/a/c$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/support/a/c;->a([Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/String;

.field final synthetic b:I


# direct methods
.method constructor <init>([Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/support/a/c$1;->a:[Ljava/lang/String;

    iput p2, p0, Lcom/huawei/hwCloudJs/support/a/c$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    iget-object v3, p0, Lcom/huawei/hwCloudJs/support/a/c$1;->a:[Ljava/lang/String;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_2

    aget-object v6, v3, v5

    invoke-static {}, Lcom/huawei/hwCloudJs/support/a/b;->a()Lcom/huawei/hwCloudJs/support/a/b;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/huawei/hwCloudJs/support/a/b;->c(Ljava/lang/String;)Lcom/huawei/hwCloudJs/support/a/a;

    move-result-object v7

    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    goto :goto_1

    :cond_0
    new-instance v8, Lcom/huawei/hwCloudJs/support/a/a/a;

    invoke-direct {v8, v6}, Lcom/huawei/hwCloudJs/support/a/a/a;-><init>(Ljava/lang/String;)V

    invoke-static {v8}, Lcom/huawei/hwCloudJs/service/http/b;->a(Lcom/huawei/hwCloudJs/service/http/a/c;)Lcom/huawei/hwCloudJs/service/http/a/d;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwCloudJs/support/a/a/b;

    invoke-virtual {v9}, Lcom/huawei/hwCloudJs/support/a/a/b;->f()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    new-instance v10, Lcom/huawei/hwCloudJs/support/a/a;

    invoke-virtual {v9}, Lcom/huawei/hwCloudJs/support/a/a/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/hwCloudJs/support/a/a/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lcom/huawei/hwCloudJs/support/a/c$1;->b:I

    invoke-direct {v10, v6, v0, v1, v2}, Lcom/huawei/hwCloudJs/support/a/a;-><init>(Ljava/lang/String;Ljava/lang/Object;II)V

    invoke-static {}, Lcom/huawei/hwCloudJs/support/a/b;->a()Lcom/huawei/hwCloudJs/support/a/b;

    move-result-object v0

    invoke-virtual {v0, v6, v10}, Lcom/huawei/hwCloudJs/support/a/b;->a(Ljava/lang/String;Lcom/huawei/hwCloudJs/support/a/a;)V

    goto :goto_1

    :cond_1
    const-string v0, "CacheRequestManager"

    const-string v1, "getcache url failed!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
