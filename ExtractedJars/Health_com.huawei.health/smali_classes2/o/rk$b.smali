.class final Lo/rk$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/rk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final c:[Lo/rk$a;


# direct methods
.method private constructor <init>(ILo/rk$a;)V
    .locals 2

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput p1, p0, Lo/rk$b;->a:I

    .line 124
    const/4 v0, 0x1

    new-array v0, v0, [Lo/rk$a;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    iput-object v0, p0, Lo/rk$b;->c:[Lo/rk$a;

    .line 125
    return-void
.end method

.method synthetic constructor <init>(ILo/rk$a;Lo/rk$2;)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2}, Lo/rk$b;-><init>(ILo/rk$a;)V

    return-void
.end method

.method private constructor <init>(ILo/rk$a;Lo/rk$a;)V
    .locals 2

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput p1, p0, Lo/rk$b;->a:I

    .line 129
    const/4 v0, 0x2

    new-array v0, v0, [Lo/rk$a;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const/4 v1, 0x1

    aput-object p3, v0, v1

    iput-object v0, p0, Lo/rk$b;->c:[Lo/rk$a;

    .line 130
    return-void
.end method

.method synthetic constructor <init>(ILo/rk$a;Lo/rk$a;Lo/rk$2;)V
    .locals 0

    .line 118
    invoke-direct {p0, p1, p2, p3}, Lo/rk$b;-><init>(ILo/rk$a;Lo/rk$a;)V

    return-void
.end method


# virtual methods
.method c()I
    .locals 1

    .line 133
    iget v0, p0, Lo/rk$b;->a:I

    return v0
.end method

.method d()[Lo/rk$a;
    .locals 1

    .line 137
    iget-object v0, p0, Lo/rk$b;->c:[Lo/rk$a;

    return-object v0
.end method
