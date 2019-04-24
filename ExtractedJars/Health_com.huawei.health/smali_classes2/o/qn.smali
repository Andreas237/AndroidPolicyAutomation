.class public final Lo/qn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Integer;

.field private final b:Ljava/lang/String;

.field private final c:[B

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<[B>;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/Object;

.field private g:Ljava/lang/Integer;

.field private final h:I

.field private final i:I


# direct methods
.method public constructor <init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BLjava/lang/String;Ljava/util/List<[B>;Ljava/lang/String;)V"
        }
    .end annotation

    .line 44
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, -0x1

    const/4 v6, -0x1

    invoke-direct/range {v0 .. v6}, Lo/qn;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;II)V

    .line 45
    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BLjava/lang/String;Ljava/util/List<[B>;Ljava/lang/String;II)V"
        }
    .end annotation

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lo/qn;->c:[B

    .line 54
    iput-object p2, p0, Lo/qn;->b:Ljava/lang/String;

    .line 55
    iput-object p3, p0, Lo/qn;->e:Ljava/util/List;

    .line 56
    iput-object p4, p0, Lo/qn;->d:Ljava/lang/String;

    .line 57
    iput p6, p0, Lo/qn;->h:I

    .line 58
    iput p5, p0, Lo/qn;->i:I

    .line 59
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/qn;->d:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/Integer;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/qn;->a:Ljava/lang/Integer;

    .line 83
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lo/qn;->f:Ljava/lang/Object;

    .line 99
    return-void
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/qn;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/qn;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/Integer;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/qn;->g:Ljava/lang/Integer;

    .line 91
    return-void
.end method

.method public d()[B
    .locals 1

    .line 62
    iget-object v0, p0, Lo/qn;->c:[B

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<[B>;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lo/qn;->e:Ljava/util/List;

    return-object v0
.end method

.method public f()I
    .locals 1

    .line 110
    iget v0, p0, Lo/qn;->i:I

    return v0
.end method

.method public h()I
    .locals 1

    .line 106
    iget v0, p0, Lo/qn;->h:I

    return v0
.end method

.method public k()Z
    .locals 1

    .line 102
    iget v0, p0, Lo/qn;->h:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/qn;->i:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
