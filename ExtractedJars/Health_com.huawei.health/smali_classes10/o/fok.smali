.class public final Lo/fok;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Lo/fow;

.field private final c:Lo/fma;


# direct methods
.method public constructor <init>(Lo/fma;Lo/fow;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    if-nez p1, :cond_0

    .line 45
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "request must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    invoke-virtual {p1}, Lo/fma;->F()Z

    move-result v0

    if-nez v0, :cond_1

    .line 47
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "request has no observe=0 option"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_1
    iput-object p1, p0, Lo/fok;->c:Lo/fma;

    .line 50
    iput-object p2, p0, Lo/fok;->b:Lo/fow;

    .line 51
    return-void
.end method


# virtual methods
.method public b()Lo/fow;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/fok;->b:Lo/fow;

    return-object v0
.end method

.method public d()Lo/fma;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/fok;->c:Lo/fma;

    return-object v0
.end method
