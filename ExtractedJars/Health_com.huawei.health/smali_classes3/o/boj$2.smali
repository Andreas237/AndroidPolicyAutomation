.class final Lo/boj$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/boj;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILo/boj$e;ZZ)Landroid/app/AlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:Lo/boj$e;


# direct methods
.method constructor <init>(Landroid/widget/EditText;ZLandroid/app/Activity;ZLo/boj$e;)V
    .locals 0

    .line 245
    iput-object p1, p0, Lo/boj$2;->a:Landroid/widget/EditText;

    iput-boolean p2, p0, Lo/boj$2;->c:Z

    iput-object p3, p0, Lo/boj$2;->b:Landroid/app/Activity;

    iput-boolean p4, p0, Lo/boj$2;->d:Z

    iput-object p5, p0, Lo/boj$2;->e:Lo/boj$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 248
    iget-object v0, p0, Lo/boj$2;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 249
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 251
    iget-boolean v0, p0, Lo/boj$2;->c:Z

    if-eqz v0, :cond_0

    .line 253
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    goto :goto_0

    .line 257
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    goto :goto_0

    .line 262
    :cond_1
    iget-object v0, p0, Lo/boj$2;->b:Landroid/app/Activity;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lo/boj$2;->a:Landroid/widget/EditText;

    .line 263
    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 264
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 266
    :goto_0
    iget-boolean v0, p0, Lo/boj$2;->d:Z

    if-nez v0, :cond_2

    .line 268
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 270
    :cond_2
    iget-object v0, p0, Lo/boj$2;->e:Lo/boj$e;

    if-eqz v0, :cond_3

    .line 272
    iget-object v0, p0, Lo/boj$2;->e:Lo/boj$e;

    iget-object v1, p0, Lo/boj$2;->a:Landroid/widget/EditText;

    invoke-interface {v0, v1}, Lo/boj$e;->d(Landroid/widget/EditText;)V

    .line 275
    :cond_3
    return-void
.end method
