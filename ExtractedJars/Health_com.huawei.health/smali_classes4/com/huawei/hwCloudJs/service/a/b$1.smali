.class Lcom/huawei/hwCloudJs/service/a/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwCloudJs/service/a/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Lcom/huawei/hwCloudJs/service/a/b$a;

.field final synthetic e:Lcom/huawei/hwCloudJs/service/a/b;


# direct methods
.method constructor <init>(Lcom/huawei/hwCloudJs/service/a/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->e:Lcom/huawei/hwCloudJs/service/a/b;

    iput-object p2, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->c:Ljava/util/List;

    iput-object p5, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->d:Lcom/huawei/hwCloudJs/service/a/b$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->e:Lcom/huawei/hwCloudJs/service/a/b;

    invoke-static {v0}, Lcom/huawei/hwCloudJs/service/a/b;->a(Lcom/huawei/hwCloudJs/service/a/b;)Lcom/huawei/hwCloudJs/service/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/hwCloudJs/service/a/a;->a(Ljava/lang/String;)Lcom/huawei/hwCloudJs/service/a/a/a;

    move-result-object v5

    if-eqz v5, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->c:Ljava/util/List;

    invoke-static {v0, v1, v5}, Lcom/huawei/hwCloudJs/service/a/c;->a(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->d:Lcom/huawei/hwCloudJs/service/a/b$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/hwCloudJs/service/a/b$a;->a(I)V

    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->e:Lcom/huawei/hwCloudJs/service/a/b;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->a:Ljava/lang/String;

    invoke-static {v0, v1, v5}, Lcom/huawei/hwCloudJs/service/a/b;->a(Lcom/huawei/hwCloudJs/service/a/b;Ljava/lang/String;Lcom/huawei/hwCloudJs/service/a/a/a;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->e:Lcom/huawei/hwCloudJs/service/a/b;

    iget-object v1, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->c:Ljava/util/List;

    iget-object v4, p0, Lcom/huawei/hwCloudJs/service/a/b$1;->d:Lcom/huawei/hwCloudJs/service/a/b$a;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/hwCloudJs/service/a/b;->a(Lcom/huawei/hwCloudJs/service/a/b;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hwCloudJs/service/a/b$a;)V

    return-void
.end method
