.class public Lo/esd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, ""

    iput-object v0, p0, Lo/esd;->b:Ljava/lang/String;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lo/esd;->c:Ljava/lang/String;

    .line 12
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lo/esd;->b:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/esd;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lo/esd;->c:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/esd;->b:Ljava/lang/String;

    return-object v0
.end method
