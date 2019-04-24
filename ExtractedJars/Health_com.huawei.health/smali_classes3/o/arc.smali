.class public abstract Lo/arc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field protected c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/arc;->e:Z

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/arc;->b:Z

    .line 69
    iput-object p1, p0, Lo/arc;->d:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/arc;->e:Z

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/arc;->b:Z

    .line 62
    iput-object p1, p0, Lo/arc;->d:Ljava/lang/String;

    .line 63
    iput-boolean p2, p0, Lo/arc;->e:Z

    .line 65
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 111
    iget-boolean v0, p0, Lo/arc;->b:Z

    .line 112
    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/arc;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/arc;->c:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/arc;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lo/arc;->a:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lo/arc;->g:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public d()Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lo/arc;->e:Z

    .line 101
    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/arc;->g:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 151
    if-eqz p1, :cond_0

    .line 153
    instance-of v0, p1, Lo/arc;

    if-eqz v0, :cond_0

    .line 155
    move-object v2, p1

    check-cast v2, Lo/arc;

    .line 156
    invoke-virtual {v2}, Lo/arc;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Lo/arc;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lo/arc;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    const/4 v0, 0x1

    return v0

    .line 162
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lo/arc;->d:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 168
    invoke-virtual {p0}, Lo/arc;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 170
    invoke-virtual {p0}, Lo/arc;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    .line 174
    :cond_0
    const/4 v0, -0x1

    return v0
.end method
