.class public Lo/dvr;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dvo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    const/4 v0, 0x6

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 25
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/dvr;->a:I

    .line 38
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/dvo;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lo/dvr;->b:Ljava/util/List;

    return-object v0
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dvo;>;)V"
        }
    .end annotation

    .line 33
    iput-object p1, p0, Lo/dvr;->b:Ljava/util/List;

    .line 34
    return-void
.end method

.method public c()I
    .locals 1

    .line 41
    iget v0, p0, Lo/dvr;->a:I

    return v0
.end method
