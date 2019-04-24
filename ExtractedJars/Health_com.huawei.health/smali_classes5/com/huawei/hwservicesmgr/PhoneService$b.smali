.class final Lcom/huawei/hwservicesmgr/PhoneService$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwservicesmgr/PhoneService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwservicesmgr/PhoneService;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/os/IBinder;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService;Landroid/os/IBinder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1273
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1274
    iput-object p2, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->c:Landroid/os/IBinder;

    .line 1275
    iput-object p3, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->b:Ljava/lang/String;

    .line 1276
    iput-object p4, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->d:Ljava/lang/String;

    .line 1277
    return-void
.end method

.method static synthetic c(Lcom/huawei/hwservicesmgr/PhoneService$b;)Z
    .locals 1

    .line 1268
    invoke-direct {p0}, Lcom/huawei/hwservicesmgr/PhoneService$b;->d()Z

    move-result v0

    return v0
.end method

.method private d()Z
    .locals 3

    .line 1309
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->k(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 1310
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->k(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->k(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwservicesmgr/PhoneService$b;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/PhoneService$b;->d:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1311
    const/4 v0, 0x1

    return v0

    .line 1309
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1314
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public binderDied()V
    .locals 5

    .line 1282
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->k(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v4

    .line 1283
    if-gez v4, :cond_0

    .line 1284
    return-void

    .line 1286
    :cond_0
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "client died: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1287
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->k(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 1288
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$b;->a:Lcom/huawei/hwservicesmgr/PhoneService;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->o(Lcom/huawei/hwservicesmgr/PhoneService;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwservicesmgr/PhoneService$b$4;

    invoke-direct {v1, p0}, Lcom/huawei/hwservicesmgr/PhoneService$b$4;-><init>(Lcom/huawei/hwservicesmgr/PhoneService$b;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1306
    return-void
.end method
