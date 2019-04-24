.class public final Lcom/huawei/common/applog/bean/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/huawei/common/applog/bean/d;


# instance fields
.field private b:Z

.field private c:Ljava/lang/Object;

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Lcom/huawei/common/applog/bean/d;

    invoke-direct {v0}, Lcom/huawei/common/applog/bean/d;-><init>()V

    sput-object v0, Lcom/huawei/common/applog/bean/d;->a:Lcom/huawei/common/applog/bean/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/common/applog/bean/d;->b:Z

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/common/applog/bean/d;->c:Ljava/lang/Object;

    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/common/applog/bean/d;->d:Z

    .line 14
    return-void
.end method

.method public static a()Lcom/huawei/common/applog/bean/d;
    .locals 1

    .line 19
    sget-object v0, Lcom/huawei/common/applog/bean/d;->a:Lcom/huawei/common/applog/bean/d;

    return-object v0
.end method

.method public static b()V
    .locals 0

    .line 24
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/common/applog/bean/d;->c:Ljava/lang/Object;

    .line 47
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 38
    iput-boolean p1, p0, Lcom/huawei/common/applog/bean/d;->b:Z

    .line 39
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 54
    iput-boolean p1, p0, Lcom/huawei/common/applog/bean/d;->d:Z

    .line 55
    return-void
.end method

.method public c()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/huawei/common/applog/bean/d;->b:Z

    return v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/common/applog/bean/d;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 50
    iget-boolean v0, p0, Lcom/huawei/common/applog/bean/d;->d:Z

    return v0
.end method

.method public f()V
    .locals 1

    .line 58
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/common/applog/bean/d;->c:Ljava/lang/Object;

    .line 59
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/common/applog/bean/d;->b:Z

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/common/applog/bean/d;->d:Z

    .line 61
    return-void
.end method
