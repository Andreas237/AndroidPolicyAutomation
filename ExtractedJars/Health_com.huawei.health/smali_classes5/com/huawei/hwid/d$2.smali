.class Lcom/huawei/hwid/d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/d;->b(Landroid/os/Bundle;Lcom/huawei/hwid/UseCase$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/UseCase$a;

.field final synthetic b:Landroid/os/Bundle;

.field final synthetic c:Lcom/huawei/hwid/d;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/d;Lcom/huawei/hwid/UseCase$a;Landroid/os/Bundle;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/hwid/d$2;->c:Lcom/huawei/hwid/d;

    iput-object p2, p0, Lcom/huawei/hwid/d$2;->a:Lcom/huawei/hwid/UseCase$a;

    iput-object p3, p0, Lcom/huawei/hwid/d$2;->b:Landroid/os/Bundle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 78
    const-string v0, "UseCaseThreadPoolScheduler"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onError "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwid/d$2;->c:Lcom/huawei/hwid/d;

    invoke-static {v2}, Lcom/huawei/hwid/d;->a(Lcom/huawei/hwid/d;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lcom/huawei/hwid/d$2;->a:Lcom/huawei/hwid/UseCase$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 80
    iget-object v0, p0, Lcom/huawei/hwid/d$2;->a:Lcom/huawei/hwid/UseCase$a;

    iget-object v1, p0, Lcom/huawei/hwid/d$2;->b:Landroid/os/Bundle;

    invoke-interface {v0, v1}, Lcom/huawei/hwid/UseCase$a;->b(Landroid/os/Bundle;)V

    .line 82
    :cond_0
    return-void
.end method
