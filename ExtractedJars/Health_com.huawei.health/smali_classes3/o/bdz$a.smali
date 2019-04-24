.class Lo/bdz$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bdz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/view/ViewGroup;

.field private c:Ljava/lang/Object;

.field private d:Z

.field private e:Landroid/view/View;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bdz$2;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Lo/bdz$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lo/bdz$a;)Landroid/view/ViewGroup;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/bdz$a;->a:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic a(Lo/bdz$a;Z)Z
    .locals 0

    .line 37
    iput-boolean p1, p0, Lo/bdz$a;->d:Z

    return p1
.end method

.method static synthetic b(Lo/bdz$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 37
    iput-object p1, p0, Lo/bdz$a;->c:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic c(Lo/bdz$a;Landroid/view/ViewGroup;)Landroid/view/ViewGroup;
    .locals 0

    .line 37
    iput-object p1, p0, Lo/bdz$a;->a:Landroid/view/ViewGroup;

    return-object p1
.end method

.method static synthetic d(Lo/bdz$a;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 37
    iput-object p1, p0, Lo/bdz$a;->e:Landroid/view/View;

    return-object p1
.end method

.method static synthetic d(Lo/bdz$a;)Ljava/lang/Object;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/bdz$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lo/bdz$a;)Z
    .locals 1

    .line 37
    iget-boolean v0, p0, Lo/bdz$a;->d:Z

    return v0
.end method
