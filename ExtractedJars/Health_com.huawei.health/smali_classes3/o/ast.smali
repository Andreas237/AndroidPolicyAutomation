.class public final Lo/ast;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/ast;


# instance fields
.field private c:Lo/asq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const/4 v0, 0x0

    sput-object v0, Lo/ast;->e:Lo/ast;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ast;->c:Lo/asq;

    .line 29
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    .line 30
    new-instance v0, Lo/asq;

    invoke-direct {v0, v1}, Lo/asq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/ast;->c:Lo/asq;

    .line 31
    return-void
.end method

.method public static declared-synchronized b()Lo/ast;
    .locals 3

    const-class v1, Lo/ast;

    monitor-enter v1

    .line 40
    :try_start_0
    sget-object v0, Lo/ast;->e:Lo/ast;

    if-nez v0, :cond_0

    .line 42
    new-instance v0, Lo/ast;

    invoke-direct {v0}, Lo/ast;-><init>()V

    sput-object v0, Lo/ast;->e:Lo/ast;

    .line 44
    :cond_0
    sget-object v0, Lo/ast;->e:Lo/ast;
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
.method public a(J)Lo/axv;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/ast;->c:Lo/asq;

    invoke-virtual {v0, p1, p2}, Lo/asq;->a(J)Lo/axv;

    move-result-object v0

    return-object v0
.end method

.method public a()[I
    .locals 1

    .line 123
    iget-object v0, p0, Lo/ast;->c:Lo/asq;

    invoke-virtual {v0}, Lo/asq;->c()[I

    move-result-object v0

    return-object v0
.end method

.method public b(J)Z
    .locals 1

    .line 91
    invoke-static {}, Lo/bap;->b()Lo/bap;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/bap;->b(J)V

    .line 92
    iget-object v0, p0, Lo/ast;->c:Lo/asq;

    invoke-virtual {v0, p1, p2}, Lo/asq;->d(J)Z

    move-result v0

    return v0
.end method

.method public b(JLjava/lang/String;)Z
    .locals 1

    .line 135
    iget-object v0, p0, Lo/ast;->c:Lo/asq;

    invoke-virtual {v0, p1, p2, p3}, Lo/asq;->e(JLjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public c()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/axv;>;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lo/ast;->c:Lo/asq;

    invoke-virtual {v0}, Lo/asq;->b()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public e()Z
    .locals 1

    .line 101
    iget-object v0, p0, Lo/ast;->c:Lo/asq;

    invoke-virtual {v0}, Lo/asq;->e()Z

    move-result v0

    return v0
.end method

.method public e(JLjava/lang/String;)Z
    .locals 1

    .line 113
    iget-object v0, p0, Lo/ast;->c:Lo/asq;

    invoke-virtual {v0, p1, p2, p3}, Lo/asq;->b(JLjava/lang/String;)Z

    move-result v0

    return v0
.end method
