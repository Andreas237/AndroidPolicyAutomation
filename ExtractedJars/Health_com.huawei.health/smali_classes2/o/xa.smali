.class public Lo/xa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lo/xa;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/xa;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lo/xa;->d:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/xa;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lo/xa;->b:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lo/xa;->e:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lo/xa;->e:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public e()J
    .locals 2

    .line 24
    iget-wide v0, p0, Lo/xa;->a:J

    return-wide v0
.end method

.method public e(J)V
    .locals 0

    .line 28
    iput-wide p1, p0, Lo/xa;->a:J

    .line 29
    return-void
.end method
