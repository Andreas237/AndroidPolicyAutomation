.class Lo/cnr$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cnr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private d:Z

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 2

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    .line 48
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cnr$e;->d:Z

    .line 26
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "Login"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "Track"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "Step"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "HiH"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "PluginDevice"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "HealthAdapter"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "HWhealthLinkage"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "SCUI"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "UIHLH"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "UIME"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "PLGACHIEVE"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "UIDV"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "PLGLOGIN"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "BTSDK"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "DMS"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "Fitness"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "KIDWATCH"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "Notfiy"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    const-string v1, "OTA"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 4

    .line 72
    if-nez p1, :cond_0

    .line 73
    const/4 v0, 0x0

    return v0

    .line 75
    :cond_0
    const-string v0, "_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 76
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_1
    const-string v0, "_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 79
    array-length v0, v2

    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    .line 80
    const/4 v0, 0x0

    return v0

    .line 82
    :cond_2
    const/4 v0, 0x0

    aget-object v3, v2, v0

    .line 83
    iget-object v0, p0, Lo/cnr$e;->e:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method private d(I)Z
    .locals 2

    .line 67
    iget-boolean v0, p0, Lo/cnr$e;->d:Z

    if-eqz v0, :cond_0

    sget v1, Lo/cnr$d;->d:I

    goto :goto_0

    :cond_0
    sget v1, Lo/cnr$d;->c:I

    .line 68
    :goto_0
    if-lt p1, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method


# virtual methods
.method d(ILjava/lang/String;)Z
    .locals 1

    .line 55
    invoke-direct {p0, p1}, Lo/cnr$e;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    const/4 v0, 0x0

    return v0

    .line 58
    :cond_0
    iget-boolean v0, p0, Lo/cnr$e;->d:Z

    if-eqz v0, :cond_1

    .line 59
    invoke-direct {p0, p2}, Lo/cnr$e;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 60
    const/4 v0, 0x0

    return v0

    .line 63
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
