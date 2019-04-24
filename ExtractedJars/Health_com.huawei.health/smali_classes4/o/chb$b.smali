.class Lo/chb$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/chb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private b:I

.field private c:Lcom/google/android/gms/maps/model/LatLng;

.field private e:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1051
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1053
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/chb$b;->e:Z

    .line 1054
    const/4 v0, 0x0

    iput v0, p0, Lo/chb$b;->b:I

    return-void
.end method

.method static synthetic b(Lo/chb$b;)Z
    .locals 1

    .line 1051
    iget-boolean v0, p0, Lo/chb$b;->e:Z

    return v0
.end method

.method static synthetic c(Lo/chb$b;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    .line 1051
    iget-object v0, p0, Lo/chb$b;->c:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method static synthetic d(Lo/chb$b;Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/LatLng;
    .locals 0

    .line 1051
    iput-object p1, p0, Lo/chb$b;->c:Lcom/google/android/gms/maps/model/LatLng;

    return-object p1
.end method

.method static synthetic d(Lo/chb$b;Z)Z
    .locals 0

    .line 1051
    iput-boolean p1, p0, Lo/chb$b;->e:Z

    return p1
.end method

.method static synthetic e(Lo/chb$b;I)I
    .locals 0

    .line 1051
    iput p1, p0, Lo/chb$b;->b:I

    return p1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1058
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lo/chb$b;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lo/chb$b;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
