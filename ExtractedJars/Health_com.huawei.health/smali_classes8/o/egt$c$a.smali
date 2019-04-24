.class Lo/egt$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/egt$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lo/egt$c;


# direct methods
.method private constructor <init>(Lo/egt$c;)V
    .locals 0

    .line 315
    iput-object p1, p0, Lo/egt$c$a;->e:Lo/egt$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/egt$c;Lo/egt$5;)V
    .locals 0

    .line 315
    invoke-direct {p0, p1}, Lo/egt$c$a;-><init>(Lo/egt$c;)V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 319
    const/4 v2, 0x0

    :goto_0
    iget-object v0, p0, Lo/egt$c$a;->e:Lo/egt$c;

    invoke-static {v0}, Lo/egt$c;->a(Lo/egt$c;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    if-ge v2, v0, :cond_0

    .line 320
    iget-object v0, p0, Lo/egt$c$a;->e:Lo/egt$c;

    invoke-static {v0}, Lo/egt$c;->b(Lo/egt$c;)[Z

    move-result-object v0

    const/4 v1, 0x0

    aput-boolean v1, v0, v2

    .line 319
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 323
    :cond_0
    iget-object v0, p0, Lo/egt$c$a;->e:Lo/egt$c;

    invoke-static {v0}, Lo/egt$c;->b(Lo/egt$c;)[Z

    move-result-object v0

    const/4 v1, 0x1

    aput-boolean v1, v0, p3

    .line 324
    iget-object v0, p0, Lo/egt$c$a;->e:Lo/egt$c;

    invoke-virtual {v0}, Lo/egt$c;->c()Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lo/egt$c$b;

    invoke-virtual {v0}, Lo/egt$c$b;->notifyDataSetChanged()V

    .line 325
    return-void
.end method
