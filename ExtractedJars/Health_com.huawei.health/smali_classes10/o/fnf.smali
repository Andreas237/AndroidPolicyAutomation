.class public Lo/fnf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lo/flz;

.field private final c:Lo/flj$e;

.field private final d:I

.field private final e:I

.field private final k:I


# direct methods
.method constructor <init>(ILo/flj$e;Lo/flz;III)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput p1, p0, Lo/fnf;->d:I

    .line 36
    iput-object p2, p0, Lo/fnf;->c:Lo/flj$e;

    .line 37
    iput-object p3, p0, Lo/fnf;->b:Lo/flz;

    .line 38
    iput p4, p0, Lo/fnf;->e:I

    .line 39
    iput p5, p0, Lo/fnf;->a:I

    .line 40
    iput p6, p0, Lo/fnf;->k:I

    .line 41
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 65
    iget v0, p0, Lo/fnf;->a:I

    return v0
.end method

.method public b()Lo/flz;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/fnf;->b:Lo/flz;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 45
    iget v0, p0, Lo/fnf;->k:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 61
    iget v0, p0, Lo/fnf;->e:I

    return v0
.end method

.method public e()Lo/flj$e;
    .locals 1

    .line 53
    iget-object v0, p0, Lo/fnf;->c:Lo/flj$e;

    return-object v0
.end method
