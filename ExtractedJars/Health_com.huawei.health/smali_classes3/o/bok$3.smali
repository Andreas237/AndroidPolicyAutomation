.class final Lo/bok$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bok;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/boj$e;Z)Landroid/app/AlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/EditText;

.field final synthetic e:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Landroid/widget/EditText;Landroid/widget/TextView;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lo/bok$3;->b:Landroid/widget/EditText;

    iput-object p2, p0, Lo/bok$3;->e:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 110
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 98
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .line 103
    iget-object v0, p0, Lo/bok$3;->b:Landroid/widget/EditText;

    iget-object v1, p0, Lo/bok$3;->e:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lo/bok;->d(Landroid/widget/EditText;Landroid/widget/TextView;)V

    .line 104
    return-void
.end method
