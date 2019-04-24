.class Lo/bhc$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bhc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lo/bhc;


# direct methods
.method private constructor <init>(Lo/bhc;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/bhc$a;->a:Lo/bhc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/bhc;Lo/bhc$1;)V
    .locals 0

    .line 138
    invoke-direct {p0, p1}, Lo/bhc$a;-><init>(Lo/bhc;)V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 143
    iget-object v0, p0, Lo/bhc$a;->a:Lo/bhc;

    invoke-static {v0}, Lo/bhc;->e(Lo/bhc;)Lo/bhc$b;

    move-result-object v0

    invoke-virtual {v0, p3}, Lo/bhc$b;->e(I)Lo/bfh;

    move-result-object v1

    .line 144
    if-eqz v1, :cond_0

    .line 146
    iget-object v0, p0, Lo/bhc$a;->a:Lo/bhc;

    invoke-static {v0, p3, v1}, Lo/bhc;->d(Lo/bhc;ILo/bfh;)V

    .line 148
    :cond_0
    return-void
.end method
