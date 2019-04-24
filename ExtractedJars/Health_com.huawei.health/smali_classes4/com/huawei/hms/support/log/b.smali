.class public Lcom/huawei/hms/support/log/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/huawei/hms/support/log/c;


# instance fields
.field private b:I

.field private c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lcom/huawei/hms/support/log/b/a;

    invoke-direct {v0}, Lcom/huawei/hms/support/log/b/a;-><init>()V

    sput-object v0, Lcom/huawei/hms/support/log/b;->a:Lcom/huawei/hms/support/log/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x4

    iput v0, p0, Lcom/huawei/hms/support/log/b;->b:I

    return-void
.end method

.method private b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huawei/hms/support/log/d;
    .locals 3

    .line 106
    new-instance v2, Lcom/huawei/hms/support/log/d;

    iget-object v0, p0, Lcom/huawei/hms/support/log/b;->c:Ljava/lang/String;

    const/16 v1, 0x8

    invoke-direct {v2, v1, v0, p1, p2}, Lcom/huawei/hms/support/log/d;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    .line 108
    invoke-virtual {v2, p3}, Lcom/huawei/hms/support/log/d;->a(Ljava/lang/Object;)Lcom/huawei/hms/support/log/d;

    .line 109
    invoke-virtual {v2, p4}, Lcom/huawei/hms/support/log/d;->a(Ljava/lang/Throwable;)Lcom/huawei/hms/support/log/d;

    .line 111
    return-object v2
.end method


# virtual methods
.method public a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 77
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/log/b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/huawei/hms/support/log/b;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huawei/hms/support/log/d;

    move-result-object v2

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/huawei/hms/support/log/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hms/support/log/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 81
    sget-object v0, Lcom/huawei/hms/support/log/b;->a:Lcom/huawei/hms/support/log/c;

    invoke-interface {v0, v3, p1, p2, p3}, Lcom/huawei/hms/support/log/c;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 83
    :cond_0
    return-void
.end method

.method public a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 5

    .line 62
    invoke-virtual {p0, p1}, Lcom/huawei/hms/support/log/b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/hms/support/log/b;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huawei/hms/support/log/d;

    move-result-object v3

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/huawei/hms/support/log/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/hms/support/log/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 66
    sget-object v0, Lcom/huawei/hms/support/log/b;->a:Lcom/huawei/hms/support/log/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v4, p1, p2, v1}, Lcom/huawei/hms/support/log/c;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 68
    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;ILjava/lang/String;)V
    .locals 2

    .line 28
    iput p2, p0, Lcom/huawei/hms/support/log/b;->b:I

    .line 29
    iput-object p3, p0, Lcom/huawei/hms/support/log/b;->c:Ljava/lang/String;

    .line 31
    sget-object v0, Lcom/huawei/hms/support/log/b;->a:Lcom/huawei/hms/support/log/c;

    const-string v1, "HMSCore"

    invoke-interface {v0, p1, v1}, Lcom/huawei/hms/support/log/c;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 32
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 91
    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lcom/huawei/hms/support/log/b;->b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/huawei/hms/support/log/d;

    move-result-object v2

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/huawei/hms/support/log/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/hms/support/log/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 94
    sget-object v0, Lcom/huawei/hms/support/log/b;->a:Lcom/huawei/hms/support/log/c;

    const/4 v1, 0x4

    invoke-interface {v0, v3, v1, p1, p2}, Lcom/huawei/hms/support/log/c;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 95
    return-void
.end method

.method public a(I)Z
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/hms/support/log/b;->b:I

    if-ge p1, v0, :cond_0

    .line 49
    const/4 v0, 0x0

    return v0

    .line 51
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
