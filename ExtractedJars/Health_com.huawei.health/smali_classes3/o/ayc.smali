.class public Lo/ayc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:Ljava/lang/String;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo/ayc;->b:J

    .line 49
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/ayc;->e:Ljava/lang/String;

    .line 65
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/ayc;->c:Ljava/lang/String;

    .line 76
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lo/ayc;->a:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lo/ayc;->a:Ljava/lang/String;

    .line 87
    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lo/ayc;->e:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lo/ayc;->c:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public d()Z
    .locals 1

    .line 97
    iget-boolean v0, p0, Lo/ayc;->d:Z

    .line 98
    return v0
.end method

.method public e()J
    .locals 2

    .line 53
    iget-wide v0, p0, Lo/ayc;->b:J

    .line 54
    return-wide v0
.end method

.method public e(J)V
    .locals 0

    .line 59
    iput-wide p1, p0, Lo/ayc;->b:J

    .line 60
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lo/ayc;->k:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 103
    iput-boolean p1, p0, Lo/ayc;->d:Z

    .line 104
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lo/ayc;->k:Ljava/lang/String;

    .line 109
    return-object v0
.end method
