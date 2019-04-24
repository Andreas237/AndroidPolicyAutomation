.class public final Lcom/huawei/phoneserviceuni/common/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/phoneserviceuni/common/c/a$a;
    }
.end annotation


# static fields
.field private static a:Lcom/huawei/phoneserviceuni/common/c/a;

.field private static b:Lcom/huawei/phoneserviceuni/common/c/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->a:Lcom/huawei/phoneserviceuni/common/c/a;

    .line 126
    new-instance v0, Lcom/huawei/phoneserviceuni/common/c/b;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/c/b;-><init>()V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/phoneserviceuni/common/c/a;
    .locals 4

    const-class v2, Lcom/huawei/phoneserviceuni/common/c/a;

    monitor-enter v2

    .line 29
    :try_start_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->a:Lcom/huawei/phoneserviceuni/common/c/a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    new-instance v0, Lcom/huawei/phoneserviceuni/common/c/a;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/c/a;-><init>()V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->a:Lcom/huawei/phoneserviceuni/common/c/a;

    .line 32
    :cond_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->a:Lcom/huawei/phoneserviceuni/common/c/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method public static k()Lcom/huawei/phoneserviceuni/common/c/c;
    .locals 1

    .line 164
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 40
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    invoke-interface {v0, p1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 41
    return-void
.end method

.method public b()V
    .locals 2

    .line 56
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 57
    return-void
.end method

.method public c()V
    .locals 2

    .line 64
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 65
    return-void
.end method

.method public d()V
    .locals 2

    .line 72
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 73
    return-void
.end method

.method public e()V
    .locals 2

    .line 80
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/4 v1, 0x5

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 81
    return-void
.end method

.method public f()V
    .locals 2

    .line 88
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 89
    return-void
.end method

.method public g()V
    .locals 2

    .line 96
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 97
    return-void
.end method

.method public h()V
    .locals 2

    .line 104
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/16 v1, 0x9

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 105
    return-void
.end method

.method public i()V
    .locals 2

    .line 112
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/16 v1, 0x8

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 113
    return-void
.end method

.method public j()V
    .locals 2

    .line 120
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/16 v1, 0xb

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 121
    return-void
.end method

.method public l()V
    .locals 2

    .line 172
    sget-object v0, Lcom/huawei/phoneserviceuni/common/c/a;->b:Lcom/huawei/phoneserviceuni/common/c/c;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lcom/huawei/phoneserviceuni/common/c/c;->a(I)V

    .line 173
    return-void
.end method
