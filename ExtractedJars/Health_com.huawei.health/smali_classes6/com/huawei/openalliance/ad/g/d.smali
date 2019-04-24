.class public Lcom/huawei/openalliance/ad/g/d;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/huawei/openalliance/ad/g/h;


# instance fields
.field private b:I

.field private c:Ljava/lang/String;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/openalliance/ad/g/i;->a()Lcom/huawei/openalliance/ad/g/h;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/g/d;->a:Lcom/huawei/openalliance/ad/g/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/openalliance/ad/g/d;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/g/d;->d:Z

    return-void
.end method

.method private c(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/j;
    .locals 3

    new-instance v2, Lcom/huawei/openalliance/ad/g/j;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/g/d;->c:Ljava/lang/String;

    const/4 v1, 0x7

    invoke-direct {v2, v1, v0, p1, p2}, Lcom/huawei/openalliance/ad/g/j;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v2, p3}, Lcom/huawei/openalliance/ad/g/j;->a(Ljava/lang/Object;)Lcom/huawei/openalliance/ad/g/j;

    return-object v2
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    iput p1, p0, Lcom/huawei/openalliance/ad/g/d;->b:I

    iput-object p3, p0, Lcom/huawei/openalliance/ad/g/d;->c:Ljava/lang/String;

    sget-object v0, Lcom/huawei/openalliance/ad/g/d;->a:Lcom/huawei/openalliance/ad/g/h;

    const-string v1, "HiAdSDKLog"

    invoke-interface {v0, p2, v1}, Lcom/huawei/openalliance/ad/g/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/g/d;->d:Z

    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 9

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/g/d;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Exception: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    const/4 v4, 0x0

    move-object v5, v3

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    aget-object v8, v5, v7

    const/16 v0, 0xa

    if-lt v4, v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v8}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/huawei/openalliance/ad/g/d;->b(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1, p2}, Lcom/huawei/openalliance/ad/g/d;->c(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/j;

    move-result-object v2

    sget-object v0, Lcom/huawei/openalliance/ad/g/d;->a:Lcom/huawei/openalliance/ad/g/h;

    const/4 v1, 0x4

    invoke-interface {v0, v2, v1, p1}, Lcom/huawei/openalliance/ad/g/h;->a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V

    return-void
.end method

.method public a(I)Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/g/d;->d:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/huawei/openalliance/ad/g/d;->b:I

    if-lt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/g/d;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HiAdSDK."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/g/d;->c(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/openalliance/ad/g/j;

    move-result-object v2

    sget-object v0, Lcom/huawei/openalliance/ad/g/d;->a:Lcom/huawei/openalliance/ad/g/h;

    invoke-interface {v0, v2, p1, p2}, Lcom/huawei/openalliance/ad/g/h;->a(Lcom/huawei/openalliance/ad/g/j;ILjava/lang/String;)V

    :cond_0
    return-void
.end method
