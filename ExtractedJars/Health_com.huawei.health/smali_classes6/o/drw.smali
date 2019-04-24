.class public Lo/drw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lo/drw;->e:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/drw;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lo/drw;->a:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/drw;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lo/drw;->c:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/drw;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/drw;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lo/drw;->d:Ljava/lang/String;

    .line 18
    return-void
.end method
