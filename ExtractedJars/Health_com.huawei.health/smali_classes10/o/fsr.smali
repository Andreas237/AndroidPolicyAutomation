.class public final Lo/fsr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Iterable<Lo/fst;>;"
    }
.end annotation


# instance fields
.field a:I

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lo/fst;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lo/fsr;->e:Ljava/util/Set;

    .line 33
    return-void
.end method

.method public static a()Lo/fsr;
    .locals 1

    .line 46
    new-instance v0, Lo/fsr;

    invoke-direct {v0}, Lo/fsr;-><init>()V

    return-object v0
.end method


# virtual methods
.method public c(Lo/fst;)Lo/fsr;
    .locals 2

    .line 71
    if-nez p1, :cond_0

    .line 72
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "server name must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 73
    :cond_0
    iget-object v0, p0, Lo/fsr;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "there already is a name of the given type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_1
    iget-object v0, p0, Lo/fsr;->e:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 77
    iget v0, p0, Lo/fsr;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/fsr;->a:I

    .line 78
    iget v0, p0, Lo/fsr;->a:I

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/fsr;->a:I

    .line 79
    iget v0, p0, Lo/fsr;->a:I

    invoke-virtual {p1}, Lo/fst;->b()[B

    move-result-object v1

    array-length v1, v1

    add-int/2addr v0, v1

    iput v0, p0, Lo/fsr;->a:I

    .line 80
    return-object p0
.end method

.method public d()I
    .locals 1

    .line 90
    iget v0, p0, Lo/fsr;->a:I

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Iterator<Lo/fst;>;"
        }
    .end annotation

    .line 119
    iget-object v0, p0, Lo/fsr;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
