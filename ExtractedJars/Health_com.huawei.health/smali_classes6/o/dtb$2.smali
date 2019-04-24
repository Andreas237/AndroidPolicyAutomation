.class final Lo/dtb$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dtb;->a(Landroid/widget/EditText;Lo/dsz;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dsz;


# direct methods
.method constructor <init>(Lo/dsz;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lo/dtb$2;->b:Lo/dsz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 84
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 78
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 3

    .line 71
    iget-object v0, p0, Lo/dtb$2;->b:Lo/dsz;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/dsz;->onTextChanged(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    return-void
.end method
