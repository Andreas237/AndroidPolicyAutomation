.class public Lo/aga;
.super Lo/afz;
.source "SourceFile"


# instance fields
.field private e:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/afz;-><init>()V

    return-void
.end method


# virtual methods
.method public c()I
    .locals 2

    .line 34
    iget-object v0, p0, Lo/aga;->e:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 35
    iget-object v0, p0, Lo/aga;->e:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    .line 37
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Ljava/lang/Integer;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/aga;->e:Ljava/lang/Integer;

    .line 44
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HeartRate [heartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/aga;->e:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
