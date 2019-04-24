.class public final Lo/ut;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final b:Lo/uo;

.field private final c:Lo/uo;

.field private final d:Lo/uo;


# direct methods
.method public constructor <init>([Lo/uo;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/4 v0, 0x0

    aget-object v0, p1, v0

    iput-object v0, p0, Lo/ut;->b:Lo/uo;

    .line 33
    const/4 v0, 0x1

    aget-object v0, p1, v0

    iput-object v0, p0, Lo/ut;->d:Lo/uo;

    .line 34
    const/4 v0, 0x2

    aget-object v0, p1, v0

    iput-object v0, p0, Lo/ut;->c:Lo/uo;

    .line 35
    return-void
.end method


# virtual methods
.method public a()Lo/uo;
    .locals 1

    .line 42
    iget-object v0, p0, Lo/ut;->d:Lo/uo;

    return-object v0
.end method

.method public c()Lo/uo;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/ut;->b:Lo/uo;

    return-object v0
.end method

.method public e()Lo/uo;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/ut;->c:Lo/uo;

    return-object v0
.end method
