.class Lo/erl$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/erl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private b:Lo/egb;

.field private c:Lo/egb;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/view/View;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/erl$2;)V
    .locals 0

    .line 127
    invoke-direct {p0}, Lo/erl$d;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/erl$d;Lo/egb;)Lo/egb;
    .locals 0

    .line 127
    iput-object p1, p0, Lo/erl$d;->c:Lo/egb;

    return-object p1
.end method

.method static synthetic b(Lo/erl$d;)Landroid/widget/ImageView;
    .locals 1

    .line 127
    iget-object v0, p0, Lo/erl$d;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lo/erl$d;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 127
    iput-object p1, p0, Lo/erl$d;->e:Landroid/view/View;

    return-object p1
.end method

.method static synthetic c(Lo/erl$d;)Lo/egb;
    .locals 1

    .line 127
    iget-object v0, p0, Lo/erl$d;->b:Lo/egb;

    return-object v0
.end method

.method static synthetic d(Lo/erl$d;)Landroid/view/View;
    .locals 1

    .line 127
    iget-object v0, p0, Lo/erl$d;->e:Landroid/view/View;

    return-object v0
.end method

.method static synthetic d(Lo/erl$d;Lo/egb;)Lo/egb;
    .locals 0

    .line 127
    iput-object p1, p0, Lo/erl$d;->b:Lo/egb;

    return-object p1
.end method

.method static synthetic e(Lo/erl$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;
    .locals 0

    .line 127
    iput-object p1, p0, Lo/erl$d;->d:Landroid/widget/ImageView;

    return-object p1
.end method

.method static synthetic e(Lo/erl$d;)Lo/egb;
    .locals 1

    .line 127
    iget-object v0, p0, Lo/erl$d;->c:Lo/egb;

    return-object v0
.end method
