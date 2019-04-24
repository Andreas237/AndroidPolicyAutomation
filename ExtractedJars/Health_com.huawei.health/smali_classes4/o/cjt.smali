.class public Lo/cjt;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    const/4 v0, 0x0

    if-eq v0, p4, :cond_0

    array-length v0, p3

    array-length v1, p4

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    const/4 v2, 0x0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "NormalMutilSim"

    const-string v1, "invokeStaticFun(): ClassNotFoundException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_2

    const/4 v0, 0x0

    return-object v0

    :cond_2
    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {v2, p2, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v3, v0

    goto :goto_1

    :catch_1
    move-exception v4

    const-string v0, "NormalMutilSim"

    const-string v1, "invokeStaticFun(): NoSuchMethodException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    if-eqz v3, :cond_3

    :try_start_2
    invoke-virtual {v3, v2, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v0

    return-object v0

    :catch_2
    move-exception v4

    const-string v0, "NormalMutilSim"

    const-string v1, "invokeStaticFun(): IllegalAccessException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :catch_3
    move-exception v4

    const-string v0, "NormalMutilSim"

    const-string v1, "invokeStaticFun(): InvocationTargetException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private a(I)Ljava/lang/String;
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0, p1}, Lo/cjt;->e(I)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private b(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    :cond_1
    const/4 v0, 0x0

    return-object v0

    :cond_2
    invoke-virtual {p1, p2}, Landroid/telephony/TelephonyManager;->getDeviceId(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d()Ljava/lang/Object;
    .locals 5

    const-string v0, "android.telephony.MSimTelephonyManager"

    const-string v1, "getDefault"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1, v2, v3}, Lo/cjt;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    return-object v4
.end method

.method private e(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, p3, p4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "NormalMutilSim"

    const-string v1, "invokeFun(): NoSuchMethodException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-eqz v2, :cond_0

    :try_start_1
    invoke-virtual {v2, p2, p5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v3

    const-string v0, "NormalMutilSim"

    const-string v1, "invokeFun(): IllegalAccessException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :catch_2
    move-exception v3

    const-string v0, "NormalMutilSim"

    const-string v1, "invokeFun(): InvocationTargetException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private e(I)Ljava/lang/String;
    .locals 10

    const-string v8, ""

    move-object v0, p0

    const-string v1, "android.telephony.MSimTelephonyManager"

    :try_start_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-direct {p0}, Lo/cjt;->d()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "getDeviceId"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-direct/range {v0 .. v5}, Lo/cjt;->e(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, v0

    goto :goto_0

    :catch_0
    move-exception v9

    const-string v0, "NormalMutilSim"

    const-string v1, "getImei(): ClassNotFoundException"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    if-nez v8, :cond_0

    const-string v8, ""

    :cond_0
    return-object v8
.end method


# virtual methods
.method public c(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lo/cjt;->b(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v1, v0}, Lo/cjt;->b(Landroid/telephony/TelephonyManager;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/cjt;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    return-object v2

    :cond_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/cjt;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    return-object v2

    :cond_3
    const-string v0, ""

    return-object v0
.end method
