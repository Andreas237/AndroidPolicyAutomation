.class public Lo/za;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/zc;>;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lo/za;->a:Ljava/lang/String;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lo/za;->e:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/zc;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lo/za;->c:Ljava/util/List;

    return-object v0
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/zc;>;)V"
        }
    .end annotation

    .line 59
    iput-object p1, p0, Lo/za;->c:Ljava/util/List;

    .line 60
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/za;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/za;->a:Ljava/lang/String;

    .line 40
    return-void
.end method
