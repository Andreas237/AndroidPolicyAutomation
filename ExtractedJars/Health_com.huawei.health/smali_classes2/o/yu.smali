.class public Lo/yu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:J

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 44
    iget-wide v0, p0, Lo/yu;->d:J

    return-wide v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/yu;->e:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/yu;->e:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 59
    iput-object p1, p0, Lo/yu;->a:Ljava/util/List;

    .line 60
    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lo/yu;->a:Ljava/util/List;

    return-object v0
.end method

.method public e(J)V
    .locals 0

    .line 49
    iput-wide p1, p0, Lo/yu;->d:J

    .line 50
    return-void
.end method
