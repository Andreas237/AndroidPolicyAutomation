.class public Lo/epx$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/epx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:Lo/eqa;

.field private i:Ljava/lang/String;

.field private k:I

.field private p:Lo/epx$c;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput-object p1, p0, Lo/epx$d;->e:Ljava/lang/String;

    .line 90
    return-void
.end method

.method static synthetic a(Lo/epx$d;)Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/epx$d;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lo/epx$d;)Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/epx$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lo/epx$d;)Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/epx$d;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lo/epx$d;)Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/epx$d;->i:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lo/epx$d;)I
    .locals 1

    .line 74
    iget v0, p0, Lo/epx$d;->k:I

    return v0
.end method

.method static synthetic f(Lo/epx$d;)I
    .locals 1

    .line 74
    iget v0, p0, Lo/epx$d;->f:I

    return v0
.end method

.method static synthetic g(Lo/epx$d;)I
    .locals 1

    .line 74
    iget v0, p0, Lo/epx$d;->g:I

    return v0
.end method

.method static synthetic h(Lo/epx$d;)Lo/eqa;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/epx$d;->h:Lo/eqa;

    return-object v0
.end method

.method static synthetic i(Lo/epx$d;)Lo/epx$c;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/epx$d;->p:Lo/epx$c;

    return-object v0
.end method

.method static synthetic k(Lo/epx$d;)Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lo/epx$d;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public a(I)Lo/epx$d;
    .locals 0

    .line 113
    iput p1, p0, Lo/epx$d;->k:I

    .line 114
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lo/epx$d;
    .locals 0

    .line 98
    iput-object p1, p0, Lo/epx$d;->b:Ljava/lang/String;

    .line 99
    return-object p0
.end method

.method public b(Landroid/content/Context;)Lo/epx$d;
    .locals 0

    .line 93
    iput-object p1, p0, Lo/epx$d;->a:Landroid/content/Context;

    .line 94
    return-object p0
.end method

.method public b(Ljava/lang/String;)Lo/epx$d;
    .locals 0

    .line 103
    iput-object p1, p0, Lo/epx$d;->d:Ljava/lang/String;

    .line 104
    return-object p0
.end method

.method public b(Lo/eqa;)Lo/epx$d;
    .locals 0

    .line 133
    iput-object p1, p0, Lo/epx$d;->h:Lo/eqa;

    .line 134
    return-object p0
.end method

.method public c(I)Lo/epx$d;
    .locals 0

    .line 128
    iput p1, p0, Lo/epx$d;->g:I

    .line 129
    return-object p0
.end method

.method public c(Lo/epx$c;)Lo/epx$d;
    .locals 0

    .line 142
    iput-object p1, p0, Lo/epx$d;->p:Lo/epx$c;

    .line 143
    return-object p0
.end method

.method public d(Ljava/lang/String;)Lo/epx$d;
    .locals 0

    .line 123
    iput-object p1, p0, Lo/epx$d;->i:Ljava/lang/String;

    .line 124
    return-object p0
.end method

.method public d()Lo/epx;
    .locals 1

    .line 138
    new-instance v0, Lo/epx;

    invoke-direct {v0, p0}, Lo/epx;-><init>(Lo/epx$d;)V

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lo/epx$d;
    .locals 0

    .line 108
    iput-object p1, p0, Lo/epx$d;->c:Ljava/lang/String;

    .line 109
    return-object p0
.end method
