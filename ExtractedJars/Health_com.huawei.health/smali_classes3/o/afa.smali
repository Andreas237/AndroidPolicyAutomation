.class public Lo/afa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private d:I

.field private e:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/afa;->a:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 31
    iget v0, p0, Lo/afa;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 27
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lo/afa;->e:Ljava/lang/Object;

    .line 28
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 19
    iput-boolean p1, p0, Lo/afa;->a:Z

    .line 20
    return-void
.end method

.method public c()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lo/afa;->a:Z

    return v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    .line 23
    iget-object v0, p0, Lo/afa;->e:Ljava/lang/Object;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e(I)V
    .locals 1

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/afa;->d:I

    .line 36
    return-void
.end method
