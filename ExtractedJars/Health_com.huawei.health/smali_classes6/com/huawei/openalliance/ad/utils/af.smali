.class public abstract Lcom/huawei/openalliance/ad/utils/af;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/utils/af;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/utils/af;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESULT:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TRESULT;>;)TRESULT;"
        }
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    invoke-static {p0, v1, v2, v3, v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/concurrent/Callable;JLjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESULT:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TRESULT;>;JTRESULT;)TRESULT;"
        }
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, p3, p1, p2, v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/concurrent/Callable;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESULT:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TRESULT;>;TRESULT;)TRESULT;"
        }
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-static {p0, p1, v1, v2, v0}, Lcom/huawei/openalliance/ad/utils/af;->a(Ljava/util/concurrent/Callable;Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/util/concurrent/Callable;Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RESULT:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TRESULT;>;TRESULT;JLjava/util/concurrent/TimeUnit;)TRESULT;"
        }
    .end annotation

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/utils/d$a;->g:Lcom/huawei/openalliance/ad/utils/d$a;

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/util/concurrent/Callable;Lcom/huawei/openalliance/ad/utils/d$a;)Ljava/util/concurrent/Future;

    move-result-object v2

    move-object v3, p1

    :try_start_0
    invoke-interface {v2, p2, p3, p4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/af;->a:Ljava/lang/String;

    const-string v1, "call InterruptedException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/af;->a:Ljava/lang/String;

    const-string v1, "call ExecutionException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/af;->a:Ljava/lang/String;

    const-string v1, "call TimeoutException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v3
.end method
