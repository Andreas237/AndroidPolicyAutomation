.class final Lo/bok$5;
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
.field final synthetic b:Lo/boj$e;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic e:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Landroid/app/Activity;Landroid/widget/EditText;Lo/boj$e;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lo/bok$5;->c:Landroid/app/Activity;

    iput-object p2, p0, Lo/bok$5;->e:Landroid/widget/EditText;

    iput-object p3, p0, Lo/bok$5;->b:Lo/boj$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 146
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/boj;->b(Landroid/content/DialogInterface;Z)V

    .line 147
    iget-object v0, p0, Lo/bok$5;->c:Landroid/app/Activity;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lo/bok$5;->e:Landroid/widget/EditText;

    .line 148
    invoke-virtual {v1}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 149
    iget-object v0, p0, Lo/bok$5;->b:Lo/boj$e;

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lo/bok$5;->b:Lo/boj$e;

    iget-object v1, p0, Lo/bok$5;->e:Landroid/widget/EditText;

    invoke-interface {v0, v1}, Lo/boj$e;->b(Landroid/widget/EditText;)V

    .line 153
    :cond_0
    return-void
.end method
