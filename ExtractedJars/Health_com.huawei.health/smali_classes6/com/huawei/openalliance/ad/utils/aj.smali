.class public abstract Lcom/huawei/openalliance/ad/utils/aj;
.super Ljava/lang/Object;


# static fields
.field private static final a:Lcom/huawei/openalliance/ad/utils/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/huawei/openalliance/ad/utils/j;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1}, Lcom/huawei/openalliance/ad/utils/j;-><init>(Landroid/os/Handler;)V

    sput-object v0, Lcom/huawei/openalliance/ad/utils/aj;->a:Lcom/huawei/openalliance/ad/utils/j;

    return-void
.end method

.method public static a(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/utils/aj;->a:Lcom/huawei/openalliance/ad/utils/j;

    invoke-virtual {v0, p0}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static a(Ljava/lang/Runnable;J)V
    .locals 2

    sget-object v0, Lcom/huawei/openalliance/ad/utils/aj;->a:Lcom/huawei/openalliance/ad/utils/j;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1, p2}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method public static a(Ljava/lang/Runnable;Ljava/lang/String;J)V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/utils/aj;->a:Lcom/huawei/openalliance/ad/utils/j;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/Runnable;Ljava/lang/String;J)V

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/huawei/openalliance/ad/utils/aj;->a:Lcom/huawei/openalliance/ad/utils/j;

    invoke-virtual {v0, p0}, Lcom/huawei/openalliance/ad/utils/j;->a(Ljava/lang/String;)V

    return-void
.end method
