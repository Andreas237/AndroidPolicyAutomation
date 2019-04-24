.class public Lo/ewq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ewq$c;
    }
.end annotation


# instance fields
.field private c:Lo/ewq$c;

.field public d:Landroid/os/CountDownTimer;


# direct methods
.method public constructor <init>(III)V
    .locals 7

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Lo/ewq$4;

    mul-int/lit16 v1, p1, 0x3e8

    int-to-long v2, v1

    mul-int/lit16 v1, p2, 0x3e8

    int-to-long v4, v1

    move-object v1, p0

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lo/ewq$4;-><init>(Lo/ewq;JJI)V

    iput-object v0, p0, Lo/ewq;->d:Landroid/os/CountDownTimer;

    .line 31
    return-void
.end method

.method static synthetic b(Lo/ewq;)Lo/ewq$c;
    .locals 1

    .line 10
    iget-object v0, p0, Lo/ewq;->c:Lo/ewq$c;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 33
    iget-object v0, p0, Lo/ewq;->d:Landroid/os/CountDownTimer;

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 34
    return-void
.end method

.method public a(Lo/ewq$c;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lo/ewq;->c:Lo/ewq$c;

    .line 39
    return-void
.end method
