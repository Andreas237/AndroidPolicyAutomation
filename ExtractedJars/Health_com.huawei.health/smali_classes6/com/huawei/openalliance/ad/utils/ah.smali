.class public Lcom/huawei/openalliance/ad/utils/ah;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static a:Lcom/huawei/openalliance/ad/d/a/a;


# instance fields
.field private b:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/utils/ah;->b:Ljava/lang/Runnable;

    return-void
.end method

.method public static a(Lcom/huawei/openalliance/ad/d/a/a;)V
    .locals 0

    sput-object p0, Lcom/huawei/openalliance/ad/utils/ah;->a:Lcom/huawei/openalliance/ad/d/a/a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/ah;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/utils/ah;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "TaskWrapper"

    const-string v1, "exception in task run"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-static {v0, v2}, Lcom/huawei/openalliance/ad/g/c;->a(ILjava/lang/Throwable;)V

    sget-object v0, Lcom/huawei/openalliance/ad/utils/ah;->a:Lcom/huawei/openalliance/ad/d/a/a;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/utils/ah;->a:Lcom/huawei/openalliance/ad/d/a/a;

    invoke-interface {v0, v2}, Lcom/huawei/openalliance/ad/d/a/a;->a(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method
