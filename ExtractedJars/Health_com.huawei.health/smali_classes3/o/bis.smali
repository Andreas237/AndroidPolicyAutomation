.class public final Lo/bis;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/bis;


# instance fields
.field private b:Lo/bip;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    invoke-static {}, Lo/aza;->b()Lo/aza;

    move-result-object v0

    iput-object v0, p0, Lo/bis;->b:Lo/bip;

    .line 37
    return-void
.end method

.method public static declared-synchronized d()Lo/bis;
    .locals 3

    const-class v1, Lo/bis;

    monitor-enter v1

    .line 46
    :try_start_0
    sget-object v0, Lo/bis;->a:Lo/bis;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lo/bis;

    invoke-direct {v0}, Lo/bis;-><init>()V

    sput-object v0, Lo/bis;->a:Lo/bis;

    .line 50
    :cond_0
    sget-object v0, Lo/bis;->a:Lo/bis;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()Landroid/app/Activity;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0}, Lo/bip;->c()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public a(Z)Z
    .locals 1

    .line 109
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0, p1}, Lo/bip;->b(Z)Z

    move-result v0

    return v0
.end method

.method public b()Landroid/app/Activity;
    .locals 1

    .line 97
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0}, Lo/bip;->e()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public b(Landroid/app/Activity;)V
    .locals 1

    .line 71
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0, p1}, Lo/bip;->d(Landroid/app/Activity;)V

    .line 72
    return-void
.end method

.method public c()V
    .locals 1

    .line 148
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0}, Lo/bip;->h()V

    .line 149
    return-void
.end method

.method public c(Landroid/app/Activity;)V
    .locals 1

    .line 128
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0, p1}, Lo/bip;->a(Landroid/app/Activity;)V

    .line 129
    return-void
.end method

.method public d(Landroid/app/Activity;)V
    .locals 1

    .line 138
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0, p1}, Lo/bip;->e(Landroid/app/Activity;)V

    .line 139
    return-void
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/ui/chat/ChatCommonActivity;>;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0}, Lo/bip;->a()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e(Landroid/app/Activity;I)V
    .locals 1

    .line 61
    iget-object v0, p0, Lo/bis;->b:Lo/bip;

    invoke-interface {v0, p1, p2}, Lo/bip;->a(Landroid/app/Activity;I)V

    .line 62
    return-void
.end method
