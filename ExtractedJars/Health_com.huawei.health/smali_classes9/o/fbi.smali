.class public Lo/fbi;
.super Landroid/widget/ExpandableListView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbi$e;,
        Lo/fbi$c;,
        Lo/fbi$d;
    }
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Lo/fbd;

.field private c:Landroid/widget/BaseExpandableListAdapter;

.field private e:Lo/fbi$d;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 109
    invoke-direct {p0, p1}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;)V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbi;->b:Lo/fbd;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbi;->e:Lo/fbi$d;

    .line 29
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/fbi;->a:Landroid/os/Handler;

    .line 31
    new-instance v0, Lo/fbi$1;

    invoke-direct {v0, p0}, Lo/fbi$1;-><init>(Lo/fbi;)V

    iput-object v0, p0, Lo/fbi;->c:Landroid/widget/BaseExpandableListAdapter;

    .line 110
    invoke-direct {p0}, Lo/fbi;->c()V

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 114
    invoke-direct {p0, p1, p2}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbi;->b:Lo/fbd;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbi;->e:Lo/fbi$d;

    .line 29
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/fbi;->a:Landroid/os/Handler;

    .line 31
    new-instance v0, Lo/fbi$1;

    invoke-direct {v0, p0}, Lo/fbi$1;-><init>(Lo/fbi;)V

    iput-object v0, p0, Lo/fbi;->c:Landroid/widget/BaseExpandableListAdapter;

    .line 115
    invoke-direct {p0}, Lo/fbi;->c()V

    .line 116
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 119
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ExpandableListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbi;->b:Lo/fbd;

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fbi;->e:Lo/fbi$d;

    .line 29
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/fbi;->a:Landroid/os/Handler;

    .line 31
    new-instance v0, Lo/fbi$1;

    invoke-direct {v0, p0}, Lo/fbi$1;-><init>(Lo/fbi;)V

    iput-object v0, p0, Lo/fbi;->c:Landroid/widget/BaseExpandableListAdapter;

    .line 120
    invoke-direct {p0}, Lo/fbi;->c()V

    .line 121
    return-void
.end method

.method static synthetic a(Lo/fbi;)Landroid/widget/BaseExpandableListAdapter;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/fbi;->c:Landroid/widget/BaseExpandableListAdapter;

    return-object v0
.end method

.method static synthetic b(Lo/fbi;)Lo/fbd;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/fbi;->b:Lo/fbd;

    return-object v0
.end method

.method private c()V
    .locals 1

    .line 125
    new-instance v0, Lo/fbi$5;

    invoke-direct {v0, p0}, Lo/fbi$5;-><init>(Lo/fbi;)V

    invoke-virtual {p0, v0}, Lo/fbi;->setOnGroupClickListener(Landroid/widget/ExpandableListView$OnGroupClickListener;)V

    .line 152
    return-void
.end method

.method static synthetic e(Lo/fbi;)Lo/fbi$d;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/fbi;->e:Lo/fbi$d;

    return-object v0
.end method


# virtual methods
.method public c(Lo/fbi$d;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lo/fbi;->e:Lo/fbi$d;

    .line 157
    return-void
.end method

.method public d()V
    .locals 2

    .line 193
    iget-object v0, p0, Lo/fbi;->a:Landroid/os/Handler;

    new-instance v1, Lo/fbi$3;

    invoke-direct {v1, p0}, Lo/fbi$3;-><init>(Lo/fbi;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 212
    return-void
.end method

.method public setHistoryDataTree(Lo/fbd;)V
    .locals 1

    .line 160
    iput-object p1, p0, Lo/fbi;->b:Lo/fbd;

    .line 161
    iget-object v0, p0, Lo/fbi;->c:Landroid/widget/BaseExpandableListAdapter;

    invoke-virtual {p0, v0}, Lo/fbi;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 162
    invoke-virtual {p0}, Lo/fbi;->d()V

    .line 163
    return-void
.end method

.method public setViewBuilder(Lo/fbi$d;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lo/fbi;->e:Lo/fbi$d;

    .line 167
    return-void
.end method
