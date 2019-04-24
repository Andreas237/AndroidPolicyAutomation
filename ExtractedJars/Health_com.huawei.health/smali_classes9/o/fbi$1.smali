.class Lo/fbi$1;
.super Landroid/widget/BaseExpandableListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fbi;


# direct methods
.method constructor <init>(Lo/fbi;)V
    .locals 0

    .line 31
    iput-object p1, p0, Lo/fbi$1;->a:Lo/fbi;

    invoke-direct {p0}, Landroid/widget/BaseExpandableListAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getChild(II)Ljava/lang/Object;
    .locals 1

    .line 57
    const/4 v0, 0x0

    return-object v0
.end method

.method public getChildId(II)J
    .locals 2

    .line 67
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getChildView(IIZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 90
    iget-object v0, p0, Lo/fbi$1;->a:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->b(Lo/fbi;)Lo/fbd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fbd;->d(I)Lo/fbp;

    move-result-object v2

    .line 91
    invoke-interface {v2, p2}, Lo/fbp;->c(I)Lo/fbm;

    move-result-object v3

    .line 92
    if-nez p4, :cond_0

    .line 93
    iget-object v0, p0, Lo/fbi$1;->a:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->e(Lo/fbi;)Lo/fbi$d;

    move-result-object v0

    invoke-interface {v0, v3}, Lo/fbi$d;->d(Lo/fbm;)Lo/fbi$e;

    move-result-object p4

    .line 95
    :cond_0
    instance-of v0, p4, Lo/fbi$e;

    if-nez v0, :cond_1

    .line 96
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "getGroupView convertView not DetailView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_1
    move-object v0, p4

    check-cast v0, Lo/fbi$e;

    invoke-virtual {v0, v3}, Lo/fbi$e;->a(Lo/fbm;)V

    .line 99
    return-object p4
.end method

.method public getChildrenCount(I)I
    .locals 2

    .line 46
    iget-object v0, p0, Lo/fbi$1;->a:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->b(Lo/fbi;)Lo/fbd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fbd;->d(I)Lo/fbp;

    move-result-object v1

    .line 47
    invoke-interface {v1}, Lo/fbp;->h()I

    move-result v0

    return v0
.end method

.method public getGroup(I)Ljava/lang/Object;
    .locals 1

    .line 52
    const/4 v0, 0x0

    return-object v0
.end method

.method public getGroupCount()I
    .locals 2

    .line 35
    iget-object v0, p0, Lo/fbi$1;->a:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->b(Lo/fbi;)Lo/fbd;

    move-result-object v0

    invoke-virtual {v0}, Lo/fbd;->e()I

    move-result v1

    .line 37
    return v1
.end method

.method public getGroupId(I)J
    .locals 2

    .line 62
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getGroupView(IZLandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 77
    iget-object v0, p0, Lo/fbi$1;->a:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->b(Lo/fbi;)Lo/fbd;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/fbd;->d(I)Lo/fbp;

    move-result-object v2

    .line 78
    if-nez p3, :cond_0

    .line 79
    iget-object v0, p0, Lo/fbi$1;->a:Lo/fbi;

    invoke-static {v0}, Lo/fbi;->e(Lo/fbi;)Lo/fbi$d;

    move-result-object v0

    invoke-interface {v0, v2}, Lo/fbi$d;->b(Lo/fbp;)Lo/fbi$c;

    move-result-object p3

    .line 81
    :cond_0
    instance-of v0, p3, Lo/fbi$c;

    if-nez v0, :cond_1

    .line 82
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "getGroupView convertView not MonthView"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 84
    :cond_1
    move-object v0, p3

    check-cast v0, Lo/fbi$c;

    invoke-virtual {v0, v2, p2}, Lo/fbi$c;->b(Lo/fbp;Z)V

    .line 85
    return-object p3
.end method

.method public hasStableIds()Z
    .locals 1

    .line 72
    const/4 v0, 0x1

    return v0
.end method

.method public isChildSelectable(II)Z
    .locals 1

    .line 104
    const/4 v0, 0x0

    return v0
.end method
