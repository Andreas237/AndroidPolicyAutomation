.class Lcom/huawei/openalliance/ad/k/c$4;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/d/a;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/d/a;

.field final synthetic b:Z

.field final synthetic c:Z

.field final synthetic d:Lcom/huawei/openalliance/ad/k/c;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/d/a;ZZ)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/k/c$4;->d:Lcom/huawei/openalliance/ad/k/c;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/k/c$4;->a:Lcom/huawei/openalliance/ad/d/a;

    iput-boolean p3, p0, Lcom/huawei/openalliance/ad/k/c$4;->b:Z

    iput-boolean p4, p0, Lcom/huawei/openalliance/ad/k/c$4;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$4;->d:Lcom/huawei/openalliance/ad/k/c;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->EXCEPTION:Lcom/huawei/openalliance/ad/constant/EventType;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/c$4;->a:Lcom/huawei/openalliance/ad/d/a;

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/constant/EventType;Lcom/huawei/openalliance/ad/d/a;)Lcom/huawei/openalliance/ad/db/bean/EventRecord;

    move-result-object v3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$4;->d:Lcom/huawei/openalliance/ad/k/c;

    sget-object v1, Lcom/huawei/openalliance/ad/constant/EventType;->EXCEPTION:Lcom/huawei/openalliance/ad/constant/EventType;

    invoke-static {v0, v3, v1}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;Lcom/huawei/openalliance/ad/constant/EventType;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/k/c$4;->b:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$4;->d:Lcom/huawei/openalliance/ad/k/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/huawei/openalliance/ad/db/bean/EventRecord;->getType_()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/k/c$4;->a:Lcom/huawei/openalliance/ad/d/a;

    invoke-virtual {v2}, Lcom/huawei/openalliance/ad/d/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/k/c;->b(Lcom/huawei/openalliance/ad/k/c;Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$4;->d:Lcom/huawei/openalliance/ad/k/c;

    invoke-static {v0, v3}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;Lcom/huawei/openalliance/ad/db/bean/EventRecord;)V

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/k/c$4;->c:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/c$4;->d:Lcom/huawei/openalliance/ad/k/c;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/k/c;->a(Lcom/huawei/openalliance/ad/k/c;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v3

    invoke-static {}, Lcom/huawei/openalliance/ad/k/c;->h()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onException.addEventToCache exception"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0, v3}, Lcom/huawei/openalliance/ad/g/c;->a(ILjava/lang/Throwable;)V

    :goto_0
    return-void
.end method
