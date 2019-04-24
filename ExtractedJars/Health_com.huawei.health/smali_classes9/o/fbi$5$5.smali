.class Lo/fbi$5$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbd$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fbi$5;->onGroupClick(Landroid/widget/ExpandableListView;Landroid/view/View;IJ)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fbi$5;


# direct methods
.method constructor <init>(Lo/fbi$5;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lo/fbi$5$5;->d:Lo/fbi$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 139
    iget-object v0, p0, Lo/fbi$5$5;->d:Lo/fbi$5;

    iget-object v0, v0, Lo/fbi$5;->c:Lo/fbi;

    invoke-virtual {v0}, Lo/fbi;->d()V

    .line 140
    return-void
.end method
