.class Lo/cgy$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Lcom/amap/api/maps/model/LatLng;

.field private c:I

.field private e:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1764
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1766
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cgy$d;->e:Z

    .line 1767
    const/4 v0, 0x0

    iput v0, p0, Lo/cgy$d;->c:I

    return-void
.end method

.method static synthetic a(Lo/cgy$d;I)I
    .locals 0

    .line 1764
    iput p1, p0, Lo/cgy$d;->c:I

    return p1
.end method

.method static synthetic b(Lo/cgy$d;Lcom/amap/api/maps/model/LatLng;)Lcom/amap/api/maps/model/LatLng;
    .locals 0

    .line 1764
    iput-object p1, p0, Lo/cgy$d;->a:Lcom/amap/api/maps/model/LatLng;

    return-object p1
.end method

.method static synthetic b(Lo/cgy$d;)Z
    .locals 1

    .line 1764
    iget-boolean v0, p0, Lo/cgy$d;->e:Z

    return v0
.end method

.method static synthetic d(Lo/cgy$d;)I
    .locals 1

    .line 1764
    iget v0, p0, Lo/cgy$d;->c:I

    return v0
.end method

.method static synthetic e(Lo/cgy$d;)Lcom/amap/api/maps/model/LatLng;
    .locals 1

    .line 1764
    iget-object v0, p0, Lo/cgy$d;->a:Lcom/amap/api/maps/model/LatLng;

    return-object v0
.end method

.method static synthetic e(Lo/cgy$d;Z)Z
    .locals 0

    .line 1764
    iput-boolean p1, p0, Lo/cgy$d;->e:Z

    return p1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1771
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lo/cgy$d;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/cgy$d;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
