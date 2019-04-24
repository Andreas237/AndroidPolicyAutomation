.class final Lo/bok$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bok;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lo/boj$e;

.field final synthetic c:Landroid/widget/EditText;

.field final synthetic d:Landroid/app/Activity;


# direct methods
.method constructor <init>(Landroid/widget/EditText;ZLandroid/app/Activity;Lo/boj$e;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lo/bok$1;->c:Landroid/widget/EditText;

    iput-boolean p2, p0, Lo/bok$1;->a:Z

    iput-object p3, p0, Lo/bok$1;->d:Landroid/app/Activity;

    iput-object p4, p0, Lo/bok$1;->b:Lo/boj$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 118
    iget-object v0, p0, Lo/bok$1;->c:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 119
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 121
    iget-boolean v0, p0, Lo/bok$1;->a:Z

    if-eqz v0, :cond_0

    .line 123
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    goto :goto_0

    .line 127
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    goto :goto_0

    .line 132
    :cond_1
    iget-object v0, p0, Lo/bok$1;->d:Landroid/app/Activity;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lo/bok$1;->c:Landroid/widget/EditText;

    .line 133
    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 134
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 136
    :goto_0
    iget-object v0, p0, Lo/bok$1;->b:Lo/boj$e;

    if-eqz v0, :cond_2

    .line 138
    iget-object v0, p0, Lo/bok$1;->b:Lo/boj$e;

    iget-object v1, p0, Lo/bok$1;->c:Landroid/widget/EditText;

    invoke-interface {v0, v1}, Lo/boj$e;->d(Landroid/widget/EditText;)V

    .line 141
    :cond_2
    return-void
.end method
