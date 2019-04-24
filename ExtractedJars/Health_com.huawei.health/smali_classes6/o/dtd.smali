.class public Lo/dtd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private c:Z

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dtd;->a:Z

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dtd;->c:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lo/dtd;->d:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 48
    iput-boolean p1, p0, Lo/dtd;->c:Z

    .line 49
    return-void
.end method

.method public c()Z
    .locals 1

    .line 38
    iget-boolean v0, p0, Lo/dtd;->a:Z

    return v0
.end method

.method public d(Z)V
    .locals 0

    .line 33
    iput-boolean p1, p0, Lo/dtd;->a:Z

    .line 34
    return-void
.end method

.method public d()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lo/dtd;->c:Z

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/dtd;->d:Ljava/lang/String;

    return-object v0
.end method
