.class public Lo/asd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private e:J


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/asd;->d:Ljava/util/List;

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/asd;->c:Ljava/util/List;

    .line 42
    iput-wide p1, p0, Lo/asd;->e:J

    .line 43
    iput-object p3, p0, Lo/asd;->b:Ljava/lang/String;

    .line 44
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lo/asd;->d:Ljava/util/List;

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lo/asd;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/asd;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    return-object p0
.end method

.method public b()J
    .locals 2

    .line 95
    iget-wide v0, p0, Lo/asd;->e:J

    .line 96
    return-wide v0
.end method

.method public b(Ljava/lang/String;)Lo/asd;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/asd;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    return-object p0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lo/asd;->c:Ljava/util/List;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lo/asd;->b:Ljava/lang/String;

    .line 105
    return-object v0
.end method
