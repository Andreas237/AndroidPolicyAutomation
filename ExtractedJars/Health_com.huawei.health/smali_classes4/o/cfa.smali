.class public Lo/cfa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/cfa;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation
.end field

.field private b:Z

.field private d:Lo/cgt;

.field private e:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfa;->d:Lo/cgt;

    return-void
.end method

.method public static a()V
    .locals 2

    .line 37
    sget-object v0, Lo/cfa;->c:Lo/cfa;

    if-eqz v0, :cond_0

    .line 38
    sget-object v0, Lo/cfa;->c:Lo/cfa;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/cfa;->e:[B

    .line 39
    sget-object v0, Lo/cfa;->c:Lo/cfa;

    const/4 v1, 0x0

    iput-object v1, v0, Lo/cfa;->a:Ljava/util/List;

    .line 41
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lo/cfa;->c:Lo/cfa;

    .line 42
    return-void
.end method

.method public static b()Lo/cfa;
    .locals 1

    .line 18
    sget-object v0, Lo/cfa;->c:Lo/cfa;

    if-nez v0, :cond_0

    .line 19
    new-instance v0, Lo/cfa;

    invoke-direct {v0}, Lo/cfa;-><init>()V

    sput-object v0, Lo/cfa;->c:Lo/cfa;

    .line 21
    :cond_0
    sget-object v0, Lo/cfa;->c:Lo/cfa;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/graphics/PointF;>;)V"
        }
    .end annotation

    .line 65
    iput-object p1, p0, Lo/cfa;->a:Ljava/util/List;

    .line 66
    return-void
.end method

.method public b(Lo/cgt;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lo/cfa;->d:Lo/cgt;

    .line 26
    return-void
.end method

.method public c()Lo/cgt;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/cfa;->d:Lo/cgt;

    return-object v0
.end method

.method public c([B)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/cfa;->e:[B

    .line 50
    return-void
.end method

.method public d()Z
    .locals 1

    .line 53
    iget-object v0, p0, Lo/cfa;->e:[B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Z)V
    .locals 0

    .line 45
    iput-boolean p1, p0, Lo/cfa;->b:Z

    .line 46
    return-void
.end method

.method public e()[B
    .locals 1

    .line 57
    iget-object v0, p0, Lo/cfa;->e:[B

    return-object v0
.end method

.method public f()Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lo/cfa;->b:Z

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/graphics/PointF;>;"
        }
    .end annotation

    .line 69
    iget-object v0, p0, Lo/cfa;->a:Ljava/util/List;

    return-object v0
.end method
