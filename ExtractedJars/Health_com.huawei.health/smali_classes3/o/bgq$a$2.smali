.class Lo/bgq$a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bgq$a;->c(IIZ)Lo/bgq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bgq$a;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lo/bgq$a;Z)V
    .locals 0

    .line 120
    iput-object p1, p0, Lo/bgq$a$2;->a:Lo/bgq$a;

    iput-boolean p2, p0, Lo/bgq$a$2;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 134
    iget-boolean v0, p0, Lo/bgq$a$2;->e:Z

    if-nez v0, :cond_0

    .line 135
    iget-object v0, p0, Lo/bgq$a$2;->a:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->d(Lo/bgq$a;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 137
    :cond_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 138
    iget-object v0, p0, Lo/bgq$a$2;->a:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->d(Lo/bgq$a;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    goto :goto_0

    .line 140
    :cond_1
    iget-object v0, p0, Lo/bgq$a$2;->a:Lo/bgq$a;

    invoke-static {v0}, Lo/bgq$a;->d(Lo/bgq$a;)Lo/egd;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egd;->setEnabled(Z)V

    .line 143
    :goto_0
    iget-object v0, p0, Lo/bgq$a$2;->a:Lo/bgq$a;

    invoke-static {v0, p1}, Lo/bgq$a;->e(Lo/bgq$a;Landroid/text/Editable;)V

    .line 144
    iget-object v0, p0, Lo/bgq$a$2;->a:Lo/bgq$a;

    invoke-static {v0, p1}, Lo/bgq$a;->a(Lo/bgq$a;Landroid/text/Editable;)V

    .line 145
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 124
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 129
    return-void
.end method
