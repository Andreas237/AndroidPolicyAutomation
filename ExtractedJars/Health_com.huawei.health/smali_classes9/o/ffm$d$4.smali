.class Lo/ffm$d$4;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffm$d;->b(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ffm$d;


# direct methods
.method constructor <init>(Lo/ffm$d;)V
    .locals 0

    .line 192
    iput-object p1, p0, Lo/ffm$d$4;->c:Lo/ffm$d;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 194
    iget-object v0, p0, Lo/ffm$d$4;->c:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 195
    iget-object v0, p0, Lo/ffm$d$4;->c:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 196
    return-void
.end method
