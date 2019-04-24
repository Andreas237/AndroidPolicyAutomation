.class public Lo/aez;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Z

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aez;->b:Z

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 50
    iget v0, p0, Lo/aez;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 54
    iput p1, p0, Lo/aez;->a:I

    .line 55
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 46
    invoke-static {p1}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/aez;->d:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/aez;->d:Ljava/lang/String;

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
