.class public Lo/exc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lo/exc;->b:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lo/exc;->a:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/exc;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lo/exc;->d:Ljava/lang/String;

    .line 17
    return-void
.end method
