.class public Lo/afr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/afr;->b:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lo/afr;->e:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/afr;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lo/afr;->c:Ljava/lang/String;

    .line 20
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lo/afr;->c:Ljava/lang/String;

    return-object v0
.end method
