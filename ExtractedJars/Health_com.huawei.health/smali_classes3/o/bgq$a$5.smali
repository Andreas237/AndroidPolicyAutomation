.class Lo/bgq$a$5;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgq$a;->a(ILandroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/bgq$a;


# direct methods
.method constructor <init>(Lo/bgq$a;)V
    .locals 0

    .line 324
    iput-object p1, p0, Lo/bgq$a$5;->c:Lo/bgq$a;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 326
    iget-object v0, p0, Lo/bgq$a$5;->c:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->c(Lo/bgq$a;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    .line 327
    iget-object v0, p0, Lo/bgq$a$5;->c:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->c(Lo/bgq$a;)Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 328
    return-void
.end method
