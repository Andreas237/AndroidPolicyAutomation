.class public Lo/bbi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:I

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:I

.field protected e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lo/bbi;->d:I

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lo/bbi;->a:I

    .line 23
    iput-object p1, p0, Lo/bbi;->c:Ljava/lang/String;

    .line 24
    iput-object p2, p0, Lo/bbi;->b:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, -0x1

    iput v0, p0, Lo/bbi;->d:I

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lo/bbi;->a:I

    .line 29
    iput-object p1, p0, Lo/bbi;->c:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lo/bbi;->b:Ljava/lang/String;

    .line 31
    iput-object p3, p0, Lo/bbi;->e:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public b(I)V
    .locals 0

    .line 67
    iput p1, p0, Lo/bbi;->d:I

    .line 68
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 78
    iput p1, p0, Lo/bbi;->a:I

    .line 79
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 85
    if-eqz p1, :cond_0

    .line 87
    instance-of v0, p1, Lo/bbi;

    if-eqz v0, :cond_0

    .line 89
    move-object v2, p1

    check-cast v2, Lo/bbi;

    .line 90
    iget-object v0, v2, Lo/bbi;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, v2, Lo/bbi;->c:Ljava/lang/String;

    iget-object v1, p0, Lo/bbi;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v2, Lo/bbi;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, v2, Lo/bbi;->b:Ljava/lang/String;

    iget-object v1, p0, Lo/bbi;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    const/4 v0, 0x1

    return v0

    .line 96
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lo/bbi;->e:Ljava/lang/String;

    .line 50
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 102
    iget-object v0, p0, Lo/bbi;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lo/bbi;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    .line 108
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/bbi;->c:Ljava/lang/String;

    .line 40
    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/bbi;->b:Ljava/lang/String;

    .line 56
    return-object v0
.end method
