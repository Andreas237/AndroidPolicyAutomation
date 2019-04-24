.class public Lo/cdj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:I

.field private f:I

.field private h:Lo/cdi;

.field private i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cdj;->c:Ljava/util/Map;

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lo/cdj;->b:I

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lo/cdj;->e:I

    .line 26
    const/4 v0, 0x0

    iput v0, p0, Lo/cdj;->a:I

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lo/cdj;->d:I

    .line 28
    const/4 v0, 0x0

    iput v0, p0, Lo/cdj;->f:I

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/cdj;->i:I

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lo/cdj;->c:Ljava/util/Map;

    const-string v1, "TotalPoint"

    iget v2, p0, Lo/cdj;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    iget-object v0, p0, Lo/cdj;->c:Ljava/util/Map;

    const-string v1, "FilterAlgoShortDis"

    iget v2, p0, Lo/cdj;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    iget-object v0, p0, Lo/cdj;->c:Ljava/util/Map;

    const-string v1, "FilterAlgoTime"

    iget v2, p0, Lo/cdj;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-object v0, p0, Lo/cdj;->c:Ljava/util/Map;

    const-string v1, "FilterAlgoAcc"

    iget v2, p0, Lo/cdj;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    iget-object v0, p0, Lo/cdj;->c:Ljava/util/Map;

    const-string v1, "FilterAlgoOverSpeed"

    iget v2, p0, Lo/cdj;->d:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    iget-object v0, p0, Lo/cdj;->c:Ljava/util/Map;

    const-string v1, "TotalFilted"

    iget v2, p0, Lo/cdj;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    iget-object v0, p0, Lo/cdj;->c:Ljava/util/Map;

    return-object v0
.end method

.method public b()V
    .locals 2

    .line 62
    iget v0, p0, Lo/cdj;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cdj;->b:I

    .line 63
    return-void
.end method

.method public b(ILo/ccw;J)V
    .locals 3

    .line 35
    const/16 v2, 0xc7

    .line 36
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    if-eqz p2, :cond_3

    .line 37
    iget v0, p0, Lo/cdj;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cdj;->i:I

    .line 38
    instance-of v0, p2, Lo/ccv;

    if-eqz v0, :cond_0

    .line 39
    iget v0, p0, Lo/cdj;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cdj;->f:I

    .line 40
    const/4 v2, 0x2

    goto :goto_0

    .line 41
    :cond_0
    instance-of v0, p2, Lo/cda;

    if-eqz v0, :cond_1

    .line 42
    iget v0, p0, Lo/cdj;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cdj;->e:I

    .line 43
    const/4 v2, 0x4

    goto :goto_0

    .line 44
    :cond_1
    instance-of v0, p2, Lo/cdb;

    if-eqz v0, :cond_2

    .line 45
    iget v0, p0, Lo/cdj;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cdj;->a:I

    .line 46
    const/4 v2, 0x3

    goto :goto_0

    .line 47
    :cond_2
    instance-of v0, p2, Lo/ccz;

    if-eqz v0, :cond_4

    .line 48
    iget v0, p0, Lo/cdj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cdj;->d:I

    .line 49
    const/4 v2, 0x1

    goto :goto_0

    .line 52
    :cond_3
    const/4 v2, 0x0

    .line 56
    :cond_4
    :goto_0
    iget-object v0, p0, Lo/cdj;->h:Lo/cdi;

    if-eqz v0, :cond_5

    .line 57
    iget-object v0, p0, Lo/cdj;->h:Lo/cdi;

    invoke-interface {v0, v2, p3, p4}, Lo/cdi;->e(IJ)V

    .line 59
    :cond_5
    return-void
.end method

.method public c(Lo/cdi;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lo/cdj;->h:Lo/cdi;

    .line 98
    return-void
.end method

.method public e()V
    .locals 1

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cdj;->h:Lo/cdi;

    .line 106
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 76
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V

    .line 77
    const-string v0, "Total = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 78
    iget v0, p0, Lo/cdj;->b:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 79
    const-string v0, " Filted = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 80
    iget v0, p0, Lo/cdj;->i:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 81
    const-string v0, " ByAcc = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 82
    iget v0, p0, Lo/cdj;->f:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 83
    const-string v0, " ByTime = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 84
    iget v0, p0, Lo/cdj;->e:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 85
    const-string v0, " ByShortDis = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 86
    iget v0, p0, Lo/cdj;->a:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 87
    const-string v0, " ByOverSpeed = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 88
    iget v0, p0, Lo/cdj;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 89
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
