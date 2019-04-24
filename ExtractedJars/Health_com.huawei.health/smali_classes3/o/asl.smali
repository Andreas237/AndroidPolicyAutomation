.class public Lo/asl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/aso;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 2

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lo/asl;->b:Ljava/util/List;

    .line 29
    iput-wide p1, p0, Lo/asl;->a:J

    .line 30
    iput-object p3, p0, Lo/asl;->d:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    .line 65
    iget-wide v0, p0, Lo/asl;->a:J

    .line 66
    return-wide v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/aso;>;"
        }
    .end annotation

    .line 56
    iget-object v0, p0, Lo/asl;->b:Ljava/util/List;

    .line 57
    return-object v0
.end method

.method public c(JLjava/lang/String;)Lo/asl;
    .locals 2

    .line 42
    new-instance v1, Lo/aso;

    invoke-direct {v1}, Lo/aso;-><init>()V

    .line 43
    invoke-virtual {v1, p3}, Lo/aso;->b(Ljava/lang/String;)V

    .line 44
    invoke-virtual {v1, p1, p2}, Lo/aso;->e(J)V

    .line 45
    iget-object v0, p0, Lo/asl;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    return-object p0
.end method
