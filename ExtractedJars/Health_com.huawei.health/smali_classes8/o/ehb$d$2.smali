.class Lo/ehb$d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ehb$d;->b(II)Lo/ehb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ehb$d;


# direct methods
.method constructor <init>(Lo/ehb$d;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lo/ehb$d$2;->d:Lo/ehb$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lo/ehb$d$2;->d:Lo/ehb$d;

    invoke-static {v0, p1}, Lo/ehb$d;->c(Lo/ehb$d;Landroid/text/Editable;)V

    .line 124
    iget-object v0, p0, Lo/ehb$d$2;->d:Lo/ehb$d;

    invoke-static {v0, p1}, Lo/ehb$d;->d(Lo/ehb$d;Landroid/text/Editable;)V

    .line 125
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 114
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 119
    return-void
.end method
