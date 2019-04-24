.class public Lo/esg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lo/esg;


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/esi;>;"
        }
    .end annotation
.end field

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    new-instance v0, Lo/esg;

    invoke-direct {v0}, Lo/esg;-><init>()V

    sput-object v0, Lo/esg;->b:Lo/esg;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lo/esg;->e:I

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/esg;->a:Ljava/util/List;

    .line 34
    return-void
.end method

.method public static b()Lo/esg;
    .locals 1

    .line 29
    sget-object v0, Lo/esg;->b:Lo/esg;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 54
    const/4 v0, 0x0

    iput v0, p0, Lo/esg;->e:I

    .line 55
    iget-object v0, p0, Lo/esg;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 56
    return-void
.end method

.method public b(Lo/esi;)Z
    .locals 4

    .line 59
    if-nez p1, :cond_0

    .line 60
    const-string v0, "Track_FVCUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null Listner"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const/4 v0, 0x0

    return v0

    .line 63
    :cond_0
    iget-object v0, p0, Lo/esg;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    const-string v0, "Track_FVCUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Duplicated Listner"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    const/4 v0, 0x0

    return v0

    .line 67
    :cond_1
    iget-object v0, p0, Lo/esg;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    const/4 v0, 0x1

    return v0
.end method

.method public c()V
    .locals 4

    .line 40
    iget v0, p0, Lo/esg;->e:I

    if-eqz v0, :cond_0

    .line 41
    const-string v0, "Track_FVCUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "The Utils is inited,failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 42
    return-void

    .line 44
    :cond_0
    const/4 v0, 0x1

    iput v0, p0, Lo/esg;->e:I

    .line 45
    iget-object v0, p0, Lo/esg;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    iget-object v0, p0, Lo/esg;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 48
    :cond_1
    return-void
.end method

.method public d(II)V
    .locals 3

    .line 85
    iget-object v0, p0, Lo/esg;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/esi;

    .line 86
    invoke-interface {v2, p1, p2}, Lo/esi;->d(II)V

    .line 87
    goto :goto_0

    .line 88
    :cond_0
    return-void
.end method

.method public d(Lo/esi;)Z
    .locals 4

    .line 72
    if-nez p1, :cond_0

    .line 73
    const-string v0, "Track_FVCUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null Listner"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v0, 0x0

    return v0

    .line 76
    :cond_0
    iget-object v0, p0, Lo/esg;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 77
    const-string v0, "Track_FVCUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the Listner not exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_1
    iget-object v0, p0, Lo/esg;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 81
    const/4 v0, 0x1

    return v0
.end method
