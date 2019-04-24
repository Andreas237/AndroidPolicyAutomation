.class public Lo/dau;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/dam;>;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:I

.field private g:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lo/dau;->g:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dau;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/dam;>;)V"
        }
    .end annotation

    .line 58
    iput-object p1, p0, Lo/dau;->a:Ljava/util/ArrayList;

    .line 59
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lo/dau;->d:Ljava/util/List;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 82
    iput p1, p0, Lo/dau;->c:I

    .line 83
    return-void
.end method

.method public c()I
    .locals 1

    .line 30
    iget v0, p0, Lo/dau;->g:I

    return v0
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lo/dam;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lo/dau;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 34
    iput p1, p0, Lo/dau;->g:I

    .line 35
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 50
    iput-object p1, p0, Lo/dau;->d:Ljava/util/List;

    .line 51
    return-void
.end method

.method public e()I
    .locals 1

    .line 22
    iget v0, p0, Lo/dau;->e:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 26
    iput p1, p0, Lo/dau;->e:I

    .line 27
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/dau;->b:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public h()I
    .locals 1

    .line 78
    iget v0, p0, Lo/dau;->c:I

    return v0
.end method
