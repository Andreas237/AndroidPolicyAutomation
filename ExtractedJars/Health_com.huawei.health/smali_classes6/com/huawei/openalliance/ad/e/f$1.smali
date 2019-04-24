.class Lcom/huawei/openalliance/ad/e/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/e/f;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/e/f;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/e/f;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/e/f$1;->a:Lcom/huawei/openalliance/ad/e/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f$1;->a:Lcom/huawei/openalliance/ad/e/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->a(Lcom/huawei/openalliance/ad/e/f;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/z;->a(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v2

    if-eqz v2, :cond_0

    instance-of v0, v2, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f$1;->a:Lcom/huawei/openalliance/ad/e/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->b(Lcom/huawei/openalliance/ad/e/f;)[B

    move-result-object v3

    monitor-enter v3

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f$1;->a:Lcom/huawei/openalliance/ad/e/f;

    move-object v1, v2

    check-cast v1, Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/e/f;->a(Lcom/huawei/openalliance/ad/e/f;Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;)Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4

    :cond_0
    :goto_0
    return-void
.end method
