.class public Lo/dao;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:I

.field private k:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 57
    iget v0, p0, Lo/dao;->k:F

    return v0
.end method

.method public a(F)V
    .locals 0

    .line 61
    iput p1, p0, Lo/dao;->k:F

    .line 62
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 69
    iput p1, p0, Lo/dao;->i:I

    .line 70
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lo/dao;->b:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 37
    iput-boolean p1, p0, Lo/dao;->a:Z

    .line 38
    return-void
.end method

.method public b()I
    .locals 1

    .line 65
    iget v0, p0, Lo/dao;->i:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 101
    iput p1, p0, Lo/dao;->f:I

    .line 102
    return-void
.end method

.method public c()I
    .locals 1

    .line 41
    iget v0, p0, Lo/dao;->c:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 53
    iput p1, p0, Lo/dao;->d:I

    .line 54
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/dao;->g:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/dao;->g:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 45
    iput p1, p0, Lo/dao;->c:I

    .line 46
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/dao;->h:Ljava/lang/String;

    .line 86
    return-void
.end method

.method public e()I
    .locals 1

    .line 49
    iget v0, p0, Lo/dao;->d:I

    return v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lo/dao;->e:Ljava/lang/String;

    .line 30
    return-void
.end method
