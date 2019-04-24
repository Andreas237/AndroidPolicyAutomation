.class Lcom/huawei/openalliance/ad/e/f$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/e/f;->a(Lcom/huawei/openalliance/ad/beans/server/AppConfigRsp;)V
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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/e/f$2;->a:Lcom/huawei/openalliance/ad/e/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f$2;->a:Lcom/huawei/openalliance/ad/e/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->b(Lcom/huawei/openalliance/ad/e/f;)[B

    move-result-object v2

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/e/f$2;->a:Lcom/huawei/openalliance/ad/e/f;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/e/f;->c(Lcom/huawei/openalliance/ad/e/f;)Lcom/huawei/openalliance/ad/beans/metadata/LandpageAppWhiteList;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/e/f$2;->a:Lcom/huawei/openalliance/ad/e/f;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/e/f;->a(Lcom/huawei/openalliance/ad/e/f;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/utils/z;->a(Ljava/io/Serializable;Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    :goto_0
    return-void
.end method
