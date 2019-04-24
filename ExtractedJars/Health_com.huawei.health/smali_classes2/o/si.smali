.class final Lo/si;
.super Lo/sh;
.source "SourceFile"


# instance fields
.field private a:I

.field private final c:Lo/sg;


# direct methods
.method constructor <init>(IILo/sg;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Lo/sh;-><init>(II)V

    .line 26
    iput-object p3, p0, Lo/si;->c:Lo/sg;

    .line 27
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .line 34
    iget v0, p0, Lo/si;->a:I

    return v0
.end method

.method c()V
    .locals 2

    .line 38
    iget v0, p0, Lo/si;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/si;->a:I

    .line 39
    return-void
.end method

.method e()Lo/sg;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/si;->c:Lo/sg;

    return-object v0
.end method
