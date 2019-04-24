.class public Lo/dbd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dbd;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dbd;->e:Ljava/util/List;

    .line 21
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lo/dbd;->c:I

    .line 14
    iput-object p3, p0, Lo/dbd;->a:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lo/dbd;->b:Ljava/lang/String;

    .line 16
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/dbd;->b:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/dbd;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 24
    iget v0, p0, Lo/dbd;->c:I

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/dbd;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lo/dbd;->a:Ljava/lang/String;

    .line 37
    return-void
.end method
