.class Lo/dsv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dsv;->d:Ljava/lang/String;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dsv;->b:Ljava/lang/String;

    .line 11
    iput-object p1, p0, Lo/dsv;->d:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lo/dsv;->b:Ljava/lang/String;

    .line 13
    return-void
.end method

.method private d(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 89
    if-nez p1, :cond_1

    if-nez p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    return v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/dsv;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/dsv;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 77
    if-nez p1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 78
    :cond_0
    if-ne p0, p1, :cond_1

    const/4 v0, 0x1

    return v0

    .line 79
    :cond_1
    instance-of v0, p1, Lo/dsv;

    if-eqz v0, :cond_3

    .line 80
    move-object v2, p1

    check-cast v2, Lo/dsv;

    .line 81
    iget-object v0, p0, Lo/dsv;->d:Ljava/lang/String;

    iget-object v1, v2, Lo/dsv;->d:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lo/dsv;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/dsv;->b:Ljava/lang/String;

    iget-object v1, v2, Lo/dsv;->b:Ljava/lang/String;

    .line 82
    invoke-direct {p0, v0, v1}, Lo/dsv;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 84
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dsv;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dsv;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
