.class public Lo/evp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:J

.field private d:I

.field private e:Ljava/lang/String;

.field private g:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lo/evp;->e:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 47
    iput p1, p0, Lo/evp;->d:I

    .line 48
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 71
    iput-wide p1, p0, Lo/evp;->g:J

    .line 72
    return-void
.end method

.method public b()J
    .locals 2

    .line 51
    iget-wide v0, p0, Lo/evp;->c:J

    return-wide v0
.end method

.method public b(J)V
    .locals 0

    .line 55
    iput-wide p1, p0, Lo/evp;->c:J

    .line 56
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 27
    iget-object v0, p0, Lo/evp;->b:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lo/evp;->e:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 63
    iput-boolean p1, p0, Lo/evp;->a:Z

    .line 64
    return-void
.end method

.method public d()J
    .locals 2

    .line 67
    iget-wide v0, p0, Lo/evp;->g:J

    return-wide v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/evp;->b:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public e()Z
    .locals 1

    .line 59
    iget-boolean v0, p0, Lo/evp;->a:Z

    return v0
.end method
