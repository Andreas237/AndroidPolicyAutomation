.class Lcom/huawei/openalliance/ad/utils/k$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/utils/k;->a(Lcom/huawei/openalliance/ad/utils/k$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/utils/k$a;

.field final synthetic b:Lcom/huawei/openalliance/ad/utils/k;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/utils/k;Lcom/huawei/openalliance/ad/utils/k$a;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/k$2;->b:Lcom/huawei/openalliance/ad/utils/k;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/utils/k$2;->a:Lcom/huawei/openalliance/ad/utils/k$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$2;->b:Lcom/huawei/openalliance/ad/utils/k;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/k;->c(Lcom/huawei/openalliance/ad/utils/k;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$2;->b:Lcom/huawei/openalliance/ad/utils/k;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/k;->d(Lcom/huawei/openalliance/ad/utils/k;)Lcom/huawei/openalliance/ad/utils/j;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$2;->a:Lcom/huawei/openalliance/ad/utils/k$a;

    iget v0, v0, Lcom/huawei/openalliance/ad/utils/k$a;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$2;->a:Lcom/huawei/openalliance/ad/utils/k$a;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/utils/k$a;->b:Ljava/lang/Runnable;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/utils/k$2;->a:Lcom/huawei/openalliance/ad/utils/k$a;

    iget-object v1, v1, Lcom/huawei/openalliance/ad/utils/k$a;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/utils/k$2;->a:Lcom/huawei/openalliance/ad/utils/k$a;

    iget-wide v2, v2, Lcom/huawei/openalliance/ad/utils/k$a;->d:J

    invoke-virtual {v4, v0, v1, v2, v3}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$2;->a:Lcom/huawei/openalliance/ad/utils/k$a;

    iget v0, v0, Lcom/huawei/openalliance/ad/utils/k$a;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/k$2;->a:Lcom/huawei/openalliance/ad/utils/k$a;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/utils/k$a;->c:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
