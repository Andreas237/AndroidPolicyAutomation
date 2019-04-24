.class public Lo/cgu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;"
        }
    .end annotation
.end field

.field private c:I

.field private d:I

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 34
    iget-object v0, p0, Lo/cgu;->e:Ljava/util/List;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 30
    iput p1, p0, Lo/cgu;->c:I

    .line 31
    return-void
.end method

.method public b()I
    .locals 1

    .line 18
    iget v0, p0, Lo/cgu;->d:I

    return v0
.end method

.method public c()I
    .locals 1

    .line 26
    iget v0, p0, Lo/cgu;->c:I

    return v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lo/cgu;->a:Ljava/util/List;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 22
    iput p1, p0, Lo/cgu;->d:I

    .line 23
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/amap/api/maps/model/LatLng;>;)V"
        }
    .end annotation

    .line 46
    iput-object p1, p0, Lo/cgu;->a:Ljava/util/List;

    .line 47
    return-void
.end method

.method public e(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 38
    iput-object p1, p0, Lo/cgu;->e:Ljava/util/List;

    .line 39
    return-void
.end method
