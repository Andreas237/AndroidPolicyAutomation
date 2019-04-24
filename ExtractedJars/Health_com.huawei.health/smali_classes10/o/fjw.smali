.class public Lo/fjw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lo/fjw;->b:Ljava/lang/String;

    .line 5
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lo/fjw;->e:Ljava/lang/Boolean;

    .line 6
    const-string v0, ""

    iput-object v0, p0, Lo/fjw;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lo/fjw;->c:Ljava/lang/String;

    .line 30
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/fjw;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lo/fjw;->b:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public c(Ljava/lang/Boolean;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lo/fjw;->e:Ljava/lang/Boolean;

    .line 22
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lo/fjw;->b:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/Boolean;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/fjw;->e:Ljava/lang/Boolean;

    return-object v0
.end method
