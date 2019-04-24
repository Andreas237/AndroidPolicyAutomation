.class final Lo/tb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Lo/tj;

.field private final c:Z


# direct methods
.method constructor <init>(Lo/tj;Z)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-boolean p2, p0, Lo/tb;->c:Z

    .line 44
    iput-object p1, p0, Lo/tb;->b:Lo/tj;

    .line 45
    return-void
.end method

.method constructor <init>(Z)V
    .locals 1

    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lo/tb;-><init>(Lo/tj;Z)V

    .line 40
    return-void
.end method


# virtual methods
.method b()Lo/tj;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/tb;->b:Lo/tj;

    return-object v0
.end method

.method c()Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lo/tb;->c:Z

    return v0
.end method
