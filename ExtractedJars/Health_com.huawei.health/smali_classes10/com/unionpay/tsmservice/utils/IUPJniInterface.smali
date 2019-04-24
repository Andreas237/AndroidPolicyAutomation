.class public Lcom/unionpay/tsmservice/utils/IUPJniInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native aaP(Ljava/lang/String;)V
.end method

.method public static final native acP()V
.end method

.method public static final native declared-synchronized acSKV(Ljava/lang/String;)Z
.end method

.method public static final native declared-synchronized adM(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native adOP()V
.end method

.method public static final native adP(Ljava/util/ArrayList;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation
.end method

.method public static final native declared-synchronized aeM(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native aeP(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native aePO(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native aePPB(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native aiJNIE(Landroid/content/Context;)Z
.end method

.method public static final native declared-synchronized amSK()Ljava/lang/String;
.end method

.method private static final native declared-synchronized arE(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static final native declared-synchronized arEP(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final declared-synchronized arEPWK(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-class v1, Lcom/unionpay/tsmservice/utils/IUPJniInterface;

    monitor-enter v1

    .line 56
    :try_start_0
    invoke-static {p0}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->arEP(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static final declared-synchronized arEWK(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-class v1, Lcom/unionpay/tsmservice/utils/IUPJniInterface;

    monitor-enter v1

    .line 49
    :try_start_0
    invoke-static {p0, p1}, Lcom/unionpay/tsmservice/utils/IUPJniInterface;->arE(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static final native declared-synchronized asSK(Ljava/lang/String;)V
.end method

.method public static final native declared-synchronized auSKT(Ljava/lang/String;Ljava/lang/String;)V
.end method
